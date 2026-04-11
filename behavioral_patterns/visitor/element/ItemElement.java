package behavioral_patterns.visitor.element;

import behavioral_patterns.visitor.visitors.Visitor;

public interface ItemElement {
    int accept(Visitor visitor);
}