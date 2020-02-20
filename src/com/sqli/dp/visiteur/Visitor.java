/**
 * 
 */
package com.sqli.dp.visiteur;

/**
 * @author ehettifouri
 * 
 */
public abstract class Visitor {

    public abstract void visite(PageDeGarde pageGarde);

    public abstract void visite(Sommair sommaire);

    public abstract void visite(Chapitre chapitre);
}
