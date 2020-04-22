package com.company.Fight;

import com.company.Model.Human;

import java.util.ArrayList;
import java.util.List;

public class Champions {
    private List<Human> champions;

    public Champions(){
        this.champions = new ArrayList<Human>();
    }

    public int addChampion(Human h){
        champions.add(h);

        return this.champions.indexOf(h);
    }

    public void showChampions(){
        System.out.println("\nGANADORES");

        for (Human h: champions) {

            System.out.println("/n" + h.toString());
        }
    }
}
