/**
 * 
 */
package com.sqli.dp.strategy;

/**
 * @author ehettifouri
 * 
 */
public class Panier {

    private int prixProduit;

    private int quantite;

    private  CalculStrategy calculStrategy;

    public Panier(CalculStrategy calculStrategy) {
        this.calculStrategy = calculStrategy;
    }

    int calculerCout() {
        return calculStrategy.calculerCout(prixProduit,quantite);
    }

    /**
     * @return Attribut {@link #prixProduit}
     */
    public int getPrixProduit() {
        return prixProduit;
    }

    /**
     * @param pPrixProduit Valeur à affecter à l'attribut {@link #prixProduit}
     */
    public void setPrixProduit(final int pPrixProduit) {
        prixProduit = pPrixProduit;
    }

    /**
     * @return Attribut {@link #quantite}
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * @param pQuantite Valeur à affecter à l'attribut {@link #quantite}
     */
    public void setQuantite(final int pQuantite) {
        quantite = pQuantite;
    }

}
