package com.company;

import com.company.Fight.Fight;
import com.company.Fight.FighterPicker;
import com.company.Implements.ToDrinkSpartanImpl;
import com.company.Implements.ToDrinkVikingImpl;
import com.company.Implements.UrinateSpartanImpl;
import com.company.Implements.UrinateVikingImpl;
import com.company.Model.Spartan;
import com.company.Model.Viking;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Viking> vikings = new ArrayList<Viking>();

        List<Spartan> spartans = new ArrayList<Spartan>();

        /*vikings.add(new Viking(1,"Pepe", 15, 60,new UrinateVikingImpl(), new ToDrinkVikingImpl()));
        vikings.add(new Viking(2,"Jose", 17, 62,new UrinateVikingImpl(), new ToDrinkVikingImpl()));
        vikings.add(new Viking(3,"Gonzalo", 27,82,new UrinateVikingImpl(), new ToDrinkVikingImpl()));

        spartans.add(new Spartan(4,"Cacho", 23, 76, new UrinateSpartanImpl(), new ToDrinkSpartanImpl()));
        spartans.add(new Spartan(5,"Pocho", 45, 87, new UrinateSpartanImpl(), new ToDrinkSpartanImpl()));
        spartans.add(new Spartan(6,"Mocho", 45, 90, new UrinateSpartanImpl(), new ToDrinkSpartanImpl()));

        vikings.add(new Viking(7,"Pollo", 15, 60,new UrinateVikingImpl(), new ToDrinkVikingImpl()));
        vikings.add(new Viking(8,"Josefina", 17, 62,new UrinateVikingImpl(), new ToDrinkVikingImpl()));
        vikings.add(new Viking(9,"Polo", 27,82,new UrinateVikingImpl(), new ToDrinkVikingImpl()));

        spartans.add(new Spartan(10,"Galo", 23, 76, new UrinateSpartanImpl(), new ToDrinkSpartanImpl()));
        spartans.add(new Spartan(11,"Pochoclo", 45, 87, new UrinateSpartanImpl(), new ToDrinkSpartanImpl()));
        spartans.add(new Spartan(12,"Valen", 45, 90, new UrinateSpartanImpl(), new ToDrinkSpartanImpl()));*

        vikings.add(new Viking(13,"Ragnar", 15, 60,new UrinateVikingImpl(), new ToDrinkVikingImpl()));
        spartans.add(new Spartan(14,"Guilermo", 23, 76, new UrinateSpartanImpl(), new ToDrinkSpartanImpl()));

        */

        Fight fight = new Fight();

        FighterPicker picker = new FighterPicker(vikings, spartans, fight);

        picker.run();

        fight.showWinners();

    }
}
