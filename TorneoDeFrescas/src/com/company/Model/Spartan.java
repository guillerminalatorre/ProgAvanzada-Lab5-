package com.company.Model;

import com.company.Interfaces.IToDrink;
import com.company.Interfaces.IUrinate;

public class Spartan extends Human{

    private static final Integer extraTolerance = 1;

    public Spartan() {
       super();
       this.setBladderCapacity( this.getBladderCapacity() + this.extraTolerance );// A su capacidad de vejiga se le suma 1 porque tiene tolerancia extra.
    }

    public Spartan(Integer id, String name, Integer age, Integer weight, IUrinate iUrinate, IToDrink iToDrink) {
        super(id, name, age, weight, iUrinate, iToDrink);
        this.setBladderCapacity( this.getBladderCapacity() + this.extraTolerance );
    }

    @Override
    public Integer toDrink() {
        this.setDrinkInBody( this.getDrinkInBody() + this.iToDrink.toDrink());

        return this.getDrinkInBody();
    }

    @Override
    public Integer urinate() {
        this.setDrinkInBody( this.getDrinkInBody() -  this.iUrinate.urinate());

        return  this.getDrinkInBody();
    }

    @Override
    public String toString() {
        return "Spartan{" + super.toString() +
                '}';
    }
}
