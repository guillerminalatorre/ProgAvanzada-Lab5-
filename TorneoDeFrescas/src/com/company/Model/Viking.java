package com.company.Model;

import com.company.Interfaces.IToDrink;
import com.company.Interfaces.IUrinate;

public class Viking extends Human{

    private static final Integer professionalDrinker = 1;

    public Viking(){
        super();
        this.setDrinkInBody(this.getDrinkInBody() + this.professionalDrinker);
    }

    public Viking(Integer id, String name, Integer age, Integer weight, IUrinate iUrinate, IToDrink iToDrink) {
        super(id, name, age, weight, iUrinate, iToDrink);
        this.setDrinkInBody(this.getDrinkInBody() + this.professionalDrinker);//A su bebida en cuerpo se le suma uno, porque es bebedor profesional.
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
        return "Viking{" + super.toString() +
                '}';
    }

}
