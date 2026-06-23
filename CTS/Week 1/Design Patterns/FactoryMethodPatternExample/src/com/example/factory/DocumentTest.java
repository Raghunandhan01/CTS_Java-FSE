package com.example.factory;

import com.example.factory.creator.DocumentFactory;
import com.example.factory.creator.ExcelDocumentFactory;
import com.example.factory.creator.PdfDocumentFactory;
import com.example.factory.creator.WordDocumentFactory;
import com.example.factory.model.Document;

public class DocumentTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Factory Method Pattern ===");

        // Word document factory
        System.out.println("\nTesting Word Document Creation:");
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.close();

        // PDF document factory
        System.out.println("\nTesting PDF Document Creation:");
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.close();

        // Excel document factory
        System.out.println("\nTesting Excel Document Creation:");
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.close();

        // Testing factory utility method (openDocument)
        System.out.println("\nTesting Factory openDocument utility method:");
        wordFactory.openDocument();
        pdfFactory.openDocument();
        excelFactory.openDocument();
    }
}
