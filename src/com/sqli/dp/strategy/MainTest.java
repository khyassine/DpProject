/**
 * 
 */
package com.sqli.dp.strategy;

/**
 * @author ehettifouri
 * 
 * on a deux strategy calcule de cout PriceTVA et PromotionStrategy qui ont une methode :
 * int calculerCout(int prixProduit, int quantite);
 * et on souhaite que lors du l'execution (main) qu'on choisis la strategie
 * 
 */
public class MainTest {

    public static void main(final String[] args) {

    	//pour l'instant on ne sspecifie pas le type de strategie
        final Panier pannier = new Panier(new PromotionStrategy());

        pannier.setPrixProduit(15);
        pannier.setQuantite(10);
        System.out.println("Cout = " + pannier.calculerCout());

    }
}
