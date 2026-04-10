package behavioral_patterns.iterator.aggregate;

import behavioral_patterns.iterator.iterators.Iterator;

public class NameRepository implements Container {

    public String names[] = {"Ankur", "Rahul", "Amit"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    // Inner Iterator Class
    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}