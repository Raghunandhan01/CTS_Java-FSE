package com.example.factory;

import com.example.factory.creator.DocumentFactory;
import com.example.factory.creator.ExcelDocumentFactory;
import com.example.factory.creator.PdfDocumentFactory;
import com.example.factory.creator.WordDocumentFactory;

public class FactoryUtilityTest {
    public static void main(String[] args) {
        System.out.println("Testing Factory openDocument utility method:");

        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        wordFactory.openDocument();
        pdfFactory.openDocument();
        excelFactory.openDocument();
    }
}
