package com.sqli.dp.adapter;

/**
 * @author ehettifouri
 * 
 */
public class MainTest {

    public static void main(final String[] args) {

        final IDocument doc1 = new HTMLDoc();
        final IDocument doc2 = new TextDoc();
        final IDocument pdf = new PDFAdapter(new PDFTools());

        display(pdf);
        display(doc1);
        display(doc2);

        print(doc2);
        print(pdf);
    }

    /**
     * @param pDoc2
     */
    private static void print(final IDocument pDoc) {
        pDoc.printDoc();
    }

    /**
     * @param pDoc1
     */
    private static void display(final IDocument pDoc) {
        pDoc.displayDoc();
    }
}
