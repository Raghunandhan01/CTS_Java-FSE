package com.example.factory.creator;

import com.example.factory.model.Document;

public abstract class DocumentFactory {
    public abstract Document createDocument();

    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }
}
