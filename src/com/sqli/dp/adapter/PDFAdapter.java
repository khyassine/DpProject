package com.sqli.dp.adapter;

public class PDFAdapter implements IDocument {
    private PDFTools pdfTools;

    public PDFAdapter(PDFTools pdfTools) {
        this.pdfTools = pdfTools;
    }


    @Override
    public void printDoc() {
        pdfTools.imprerPDF();
    }

    @Override
    public void displayDoc() {
        pdfTools.chargerPDF();
        pdfTools.afficherPDF();
    }
}
