package behavioral_patterns.visitor.visitors;

import behavioral_patterns.visitor.element.*;

public interface Visitor {
    int visit(Book book);
    int visit(Fruit fruit);
}