/**
 * 
 */
package com.sqli.dp.decorator;

/**
 * @author ehettifouri
 * 
 * j'ai un caffe et je veux ajouter Lait et Chocola 
 * 
 * Lait : caffe, eau Lait
 * Chocola : caffe eau lait chocola
 * 
 * en appliquant le DP decorator
 *  
 */
public class MainTest {

    public static void main(final String[] args) {

        Coffee caffe = new SimpleCaffe();
        displayMenu(caffe);

        caffe = new Lait(caffe);
        displayMenu(caffe);

        caffe = new Chocolla(caffe);
        displayMenu(caffe);

    }

    /**
     * @param pCaffe
     */
    private static void displayMenu(final Coffee pCaffe) {

        System.out.println("Ingred : " + pCaffe.getIngeriend());
        System.out.println("avec Prix : " + pCaffe.calculeCout());
        System.out.println("-----------------");
    }
}
