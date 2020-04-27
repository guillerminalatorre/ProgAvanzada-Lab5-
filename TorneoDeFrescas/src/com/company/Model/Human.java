package com.company.Model;

import com.company.Interfaces.IToDrink;
import com.company.Interfaces.IUrinate;

public abstract class Human {

    private Integer id;
    private String name;
    private Integer age;
    private Integer weight;

    private Integer drinkInBody; //bebida en cuerpo.
    private Integer bladderCapacity; //capacidad de vegiga.

    IUrinate iUrinate;
    IToDrink iToDrink;

    public Human()
    {
        this.drinkInBody = 0;
        this.bladderCapacity = 20;
    }

    public Human(Integer id, String name, Integer age, Integer weight, IUrinate iUrinate, IToDrink iToDrink) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.iUrinate = iUrinate;
        this.iToDrink = iToDrink;

        this.drinkInBody = 0;
        this.bladderCapacity = 20;
    }

    public Integer getDrinkInBody() {
        return drinkInBody;
    }

    public void setDrinkInBody(Integer drinkInBody) {
        this.drinkInBody = drinkInBody;
    }

    public Integer getBladderCapacity() {
        return bladderCapacity;
    }

    public void setBladderCapacity(Integer bladderCapacity) {
        this.bladderCapacity = bladderCapacity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public IUrinate getIUrinate() {
        return iUrinate;
    }

    public void setIUrinate(IUrinate iUrinate) {
        this.iUrinate = iUrinate;
    }

    public IToDrink getIToDrink() {
        return iToDrink;
    }

    public void setIToDrink(IToDrink iToDrink) {
        this.iToDrink = iToDrink;
    }

    public abstract Integer toDrink();

    public abstract Integer urinate();

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight + ", drinkInBody="+ drinkInBody +", bladderCapacity=" + bladderCapacity;
    }

}
