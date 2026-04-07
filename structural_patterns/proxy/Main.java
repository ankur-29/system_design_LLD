package structural_patterns.proxy;

import structural_patterns.proxy.proxytype.DocumentProxy;
import structural_patterns.proxy.subject.Document;

public class Main {

    public static void main(String[] args) {

        Document doc1 = new DocumentProxy("file1.pdf", "USER");
        doc1.display(); // access denied

        System.out.println("------");

        Document doc2 = new DocumentProxy("file2.pdf", "ADMIN");
        doc2.display(); // loads + displays
        doc2.display(); // no reload (cached)
    }
}