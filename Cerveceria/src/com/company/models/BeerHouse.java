package com.company.models;

public class BeerHouse {
    private int stock;
    private boolean available;
    private boolean tankEmpty;

    public BeerHouse(){
        this.stock = 0;
        this.available = false;
        this.tankEmpty = true;
    }

    public int getStock()
    {
        return this.stock;
    }

    public synchronized void setStock( int reStock, boolean tankEmpty) throws InterruptedException {
        while(available){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        if((reStock + this.stock) == 100 || tankEmpty) { // Debo confirmar, antes de dormirse se quedo con un dato viejo, por lo que hay que refrescar los datos.

            System.out.println("\n -------Restockeando cantidad de cervezas");
            Thread.sleep(700);
            this.stock = this.stock + reStock;
            System.out.println("\n -------Cervezas restockeadas: " + reStock + "; Totales :" + this.getStock());
            available = true;
            notify();

            this.tankEmpty = tankEmpty;
        }
        if(this.getStock() < 100 && tankEmpty){
            available = true;
            notify();
        }
    }

    public synchronized int getBeers( int cantBeers) throws InterruptedException {
        while(!available){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        if (this.stock < cantBeers && !tankEmpty) {
            this.available = false;

            notify();

            while (!available) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        Thread.sleep(500);

        if (this.stock < cantBeers) {
            cantBeers = this.stock;
            this.stock = 0;
        }
        else{
            this.stock = this.stock - cantBeers;
        }

        return cantBeers;
    }

    public synchronized boolean stopSystem ( int beerTank) throws InterruptedException {
        System.out.println("\n-----------------------------CERVEZAS EN PRODUCCIÓN = "+ beerTank +" ------- CERVEZAS DISPONIBLES EN BEER HOUSE = "+this.getStock()+"-----------------------------");
        System.out.println("\n[[[[[[-FIN DEL PRODUCTOR-]]]]]]");
        return false;
    }
}
