/**
 * 
 */
package com.sqli.dp.template;

/**
 * @author ehettifouri
 * 
 * créer class Football et Tennis qui extends de la classe jeu
 * on veut faire appel a la methode jouer() en appliquant le DP template sur les deux class
 * 
 */
public class MainTest {

    public static void main(final String[] args) {

    	Jeu jeu =new Football();
    	jeu.jouer();
    	jeu=new Tennis();
    	jeu.jouer();

    }

}
