package structural_patterns.proxy.real;

import structural_patterns.proxy.subject.Document;

public class RealDocument implements Document {

    private String fileName;

    public RealDocument(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading document: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying document: " + fileName);
    }
}