package com.company.Implements;

import com.company.Interfaces.IToDrink;

public class ToDrinkSpartanImpl implements IToDrink {
    @Override
    public Integer toDrink() {
        return (int) ((Math.random()*4) +1);
    }
}
