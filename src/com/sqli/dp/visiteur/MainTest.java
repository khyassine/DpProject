/**
 * 
 */
package com.sqli.dp.visiteur;

/**
 * @author ehettifouri
 * 
 * on a les elements d'un rapport pour implementer le DP visitor il faut ajouter la classabstraite visitor
 * et son implementation LecteurVisiteur qui redifins les methodes :
 * 
 *  public abstract void visite(PageDeGarde pageGarde);
 *  public abstract void visite(Sommair sommaire);
 *   public abstract void visite(Chapitre chapitre);
 * 
 * 
 */
public class MainTest {

    public static void main(final String[] args) {

        final PageDeGarde pageGarde = new PageDeGarde();
        final Chapitre chapitre = new Chapitre();
        final Sommair sommaire = new Sommair();

        final Visitor visiteur = new LecteurVisteur();

        visiteur.visite(pageGarde);
        visiteur.visite(sommaire);
        visiteur.visite(chapitre);
    }
}
