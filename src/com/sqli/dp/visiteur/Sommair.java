/**
 * 
 */
package com.sqli.dp.visiteur;

/**
 * @author ehettifouri
 * 
 */
public class Sommair implements ElementRapport {

    /*
     * (non-Javadoc)
     * 
     * @see com.sqli.dp.visiteur.ElementRapport#accept(com.sqli.dp.visiteur.Visitor)
     */
    @Override
    public void accept(final Visitor pVisiteur) {

        pVisiteur.visite(this);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sqli.dp.visiteur.ElementRapport#getContenu()
     */
    @Override
    public String getContenu() {
        return "Sommaire rapport 1";
    }

}
