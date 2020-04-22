package com.company.Fight;

import com.company.Model.Spartan;
import com.company.Model.Viking;

import java.util.ArrayList;
import java.util.List;


public class FighterPicker extends Thread{ //PRODUCTOR

    private List<Viking> vikings ;
    private List<Spartan> spartans ;

    private Fight fight; //Acceso al contenedor del recurso compartido.

    public FighterPicker(List<Viking> vikings, List<Spartan> spartans, Fight fight) {
        this.vikings = vikings;
        this.spartans = spartans;
        this.fight = fight;
    }

    public void run(){
        int index = 0;

        int winner = 0;

        System.out.println("\n INICIANDO TORNEO ");

        while(index < vikings.size() && index < spartans.size()){

            winner = this.fight.start(vikings.get(index), spartans.get(index));

            index++;
        }
    }

}
