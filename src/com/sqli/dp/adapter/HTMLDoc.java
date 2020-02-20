/**
 * 
 */
package com.sqli.dp.adapter;

/**
 * @author ehettifouri
 * 
 */
public class HTMLDoc implements IDocument {

    /*
     * (non-Javadoc)
     * 
     * @see com.sqli.dp.adapter.IDocument#printDoc()
     */
    @Override
    public void printDoc() {
        System.out.println("impression du HTML");

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sqli.dp.adapter.IDocument#displayDoc()
     */
    @Override
    public void displayDoc() {
        System.out.println("Affichage du HTML");

    }

}
