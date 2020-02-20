package com.sqli.dp.decorator;

public class CoffeDecorator implements Coffee {

    private Coffee coffee;

    public CoffeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int calculeCout() {
       return this.coffee.calculeCout();
    }

    @Override
    public String getIngeriend() {
        return coffee.getIngeriend();
    }
}
