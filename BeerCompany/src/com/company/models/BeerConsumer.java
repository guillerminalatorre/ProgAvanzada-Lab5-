package com.company.models;

public class BeerConsumer extends Thread{
    private BeerHouse beerHouse;
    private boolean continuee;
    private int aux ;

    public BeerConsumer( BeerHouse beerHouse, int cantClients){
        super();

        this.continuee = true;

        this.beerHouse = beerHouse;

        this.aux = 0;
    }

    public void run(){
        int i = 1;

        int j = 0;

        int cantBeers = 0 ;

        while(continuee) {

            j = (int) ((Math.random() * 30) + 1);

            System.out.println("\n -> El cliente # " + i + " solicita " + j + " cervezas");

            try {
                cantBeers = beerHouse.getBeers( j );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\n $$ Fueron entregadas " + cantBeers + " cervezas al cliente # " + i );

            this.aux = this.aux + cantBeers;

            if(cantBeers < j)
            {
                this.continuee = false;

                System.out.println("\n-----> El cliente #"+ i + " es el ÚLTIMO+++++++++++++++++++++++++++");
                System.out.println("\n[[[[[[-FIN DEL CONSUMIDOR-------CERVEZAS ENTREGADAS = "+ this.aux + "]]]]]]");
            }


            i++;
        }
    }
}
