package com.company;

import com.company.models.BeerConsumer;
import com.company.models.BeerHouse;
import com.company.models.BeerProducter;

public class Main {

    public static void main(String[] args) {
        /**
         * El Productor tiene un tope de produccion (250), cuando este sea = 0 se finaliza el sistema.
         * La BeerHouse tiene una capacidad de 100 unidades, la cual se reestoquea cada vez que un cliente pida cierta cantidad de cervezas y no haya disponible en la misma.
         * Cada cliente pide un cantidad random de cervezas entre 1 y 30.
         * Si un cliente solicita mas cervezas de las que hay en la BeerHouse y ya no hay disponibles en producción, se le entregan la ultimas y se finaliza el sistema.
         */
        BeerHouse beerHouse = new BeerHouse();

        BeerProducter beerProducter = new BeerProducter(beerHouse);

        BeerConsumer beerConsumer = new BeerConsumer(beerHouse, 20);

        beerConsumer.start();

        beerProducter.start();

    }
}
