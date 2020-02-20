/**
 * 
 */
package com.sqli.dp.adapter;

/**
 * @author ehettifouri
 * 
 */
public class TextDoc implements IDocument {

    /*
     * (non-Javadoc)
     * 
     * @see com.sqli.dp.adapter.IDocument#printDoc()
     */
    @Override
    public void printDoc() {
        System.out.println("impression du Txt");

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sqli.dp.adapter.IDocument#displayDoc()
     */
    @Override
    public void displayDoc() {
        System.out.println("Affichage du Txt");

    }

}
