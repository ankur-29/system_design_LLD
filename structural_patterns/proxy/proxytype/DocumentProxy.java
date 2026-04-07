package structural_patterns.proxy.proxytype;

import structural_patterns.proxy.real.RealDocument;
import structural_patterns.proxy.subject.Document;

public class DocumentProxy implements Document {

    private RealDocument realDocument;
    private String fileName;
    private String userRole;

    public DocumentProxy(String fileName, String userRole) {
        this.fileName = fileName;
        this.userRole = userRole;
    }

    @Override
    public void display() {

        // Access Control
        if (!userRole.equals("ADMIN")) {
            System.out.println("Access Denied!");
            return;
        }

        // Lazy Loading
        if (realDocument == null) {
            realDocument = new RealDocument(fileName);
        }

        realDocument.display();
    }
}
