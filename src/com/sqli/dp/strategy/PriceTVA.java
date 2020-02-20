package com.sqli.dp.strategy;

public class PriceTVA implements CalculStrategy  {

    @Override
    public int calculerCout(int prixProduit, int quantite) {
        return (int) (prixProduit*quantite-prixProduit*quantite*0.1);
    }
}
