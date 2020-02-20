package com.sqli.dp.decorator;

public class Chocolla extends CoffeDecorator {


    public Chocolla(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int calculeCout() {
        return super.calculeCout()+1;
    }

    @Override
    public String getIngeriend() {
        return super.getIngeriend()+", chocola";
    }
}
