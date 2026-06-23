package com.example.factory.creator;

import com.example.factory.model.Document;
import com.example.factory.model.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
