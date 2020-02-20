package com.sqli.dp.decorator;

public class Lait extends CoffeDecorator {


    public Lait(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int calculeCout() {
        return super.calculeCout()+1;
    }

    @Override
    public String getIngeriend() {
        return super.getIngeriend()+", Lait";
    }
}
