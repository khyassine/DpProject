/**
 * 
 */
package com.sqli.dp.visiteur;

/**
 * @author ehettifouri
 * 
 */
public interface ElementRapport {

    void accept(Visitor visiteur);

    String getContenu();
}
