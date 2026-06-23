package com.example.factory.creator;

import com.example.factory.model.Document;
import com.example.factory.model.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
