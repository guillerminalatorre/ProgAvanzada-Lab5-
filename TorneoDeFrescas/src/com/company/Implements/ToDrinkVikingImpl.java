package com.company.Implements;

import com.company.Interfaces.IToDrink;

public class ToDrinkVikingImpl implements IToDrink {

    @Override
    public Integer toDrink() {
        return (int) ((Math.random()*5) +1);
    }
}
