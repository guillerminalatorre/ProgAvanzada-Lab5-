package com.company.models;

import java.util.List;

public class BeerProducter extends Thread {

    private final int reStock = 100;
    private int beerTank = 250;
    private BeerHouse beerHouse;
    private boolean continuee ;

    public BeerProducter(BeerHouse beerHouse){
        super();
        this.beerHouse = beerHouse;
        this.continuee = true;
    }

    public void run(){
        while(continuee){
            try {

                if(beerTank > 0) { //Si hay cervezas, evaluo cuantas quedan y repongo.

                    if(beerTank >= 100) {

                        int aux = reStock - beerHouse.getStock();
                        beerHouse.setStock(aux, false);
                        this.beerTank = this.beerTank - aux;

                    }
                    else{

                        beerHouse.setStock(beerTank, true);
                        this.beerTank = this.beerTank - this.beerTank;

                    }
                }
                else{//Significa que no hay stock en fábrica, cervezas = 0. Detengo el sistema.

                    this.continuee = beerHouse.stopSystem(this.beerTank);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
