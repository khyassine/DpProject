package com.sqli.dp.strategy;

public class PromotionStrategy implements CalculStrategy {

    @Override
    public int calculerCout(int prixProduit, int quantite) {

        return prixProduit*quantite/2;
    }
}
