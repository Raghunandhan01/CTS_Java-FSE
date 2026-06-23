package com.example.factory.creator;

import com.example.factory.model.Document;
import com.example.factory.model.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
