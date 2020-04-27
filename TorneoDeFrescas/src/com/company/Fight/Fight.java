package com.company.Fight;

import com.company.Model.Human;
import com.company.Model.Spartan;
import com.company.Model.Viking;

import java.util.concurrent.Semaphore;

public class Fight { // RECURSO COMPARTIDO
    private Viking viking;
    private Spartan spartan;
    private Semaphore sem;

    private Winners winners;

    public Fight(){
        this.viking = new Viking();
        this.spartan = new Spartan();
        this.sem = new Semaphore(2);//Porque hay dos humanos bebiendo por pelea.

        this.winners = new Winners();
    }

    /**Retorna 1 si gana el vikingo, 2 si gana el spartano*/
    public synchronized int start(Viking viking, Spartan spartan) {

        int reply = 1;

        System.out.println("\n-->Iniciando pelea");

        System.out.println(viking.toString() + "                 VS                 " + spartan.toString());

        while(viking.getDrinkInBody() < viking.getBladderCapacity() &&
                spartan.getDrinkInBody() < spartan.getBladderCapacity()){

            try {

                this.toDrink(viking);
                this.toDrink(spartan);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        // CONOCER LO QUEDA DE BEBIDA EN EL CUERPO DE CADA UNO, el que se paso de su capacidad, o si ambos se pasaron se su capacidad al mismo tiempo, orinan.
        if(viking.getDrinkInBody() > viking.getBladderCapacity()){

            viking.setDrinkInBody(viking.getDrinkInBody() - (viking.getDrinkInBody() - viking.getBladderCapacity()));
            viking.urinate();
        }
        else{
            if(spartan.getDrinkInBody() > spartan.getBladderCapacity()) {
                spartan.setDrinkInBody(spartan.getDrinkInBody() - (spartan.getDrinkInBody() - spartan.getBladderCapacity()));
                spartan.urinate();
            }
        }

        //CONOCER EL GANADOR
        if(spartan.getDrinkInBody() > viking.getDrinkInBody()){
            reply = 2;
        }

        //ENVIAR GANADOR
        try {
            if(reply == 1){
                this.result(viking);
            }
            else{
                this.result(spartan);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return reply;
    }


    public void toDrink(Human h) throws InterruptedException {
        this.sem.acquire();

        int i;
        i = h.toDrink();

        System.out.println("\n Soy " + h.toString() + " ------> ESTOY BEBIENDO");

        this.sem.release();
    }

    public void result (Human winner) throws InterruptedException {
        System.out.println("\n El ganador de la pelea es " + winner.toString());

        this.winners.addWinner(winner);
    }

    public void showWinners(){
        System.out.println( this.winners.getWinners() );
    }

}
