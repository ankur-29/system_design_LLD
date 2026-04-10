package behavioral_patterns.iterator.aggregate;

import behavioral_patterns.iterator.iterators.Iterator;

public interface Container {
    Iterator getIterator();
}