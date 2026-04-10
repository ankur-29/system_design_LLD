package behavioral_patterns.iterator;

import behavioral_patterns.iterator.aggregate.NameRepository;
import behavioral_patterns.iterator.iterators.Iterator;

public class Main {

    public static void main(String[] args) {

        NameRepository repository = new NameRepository();

        Iterator it = repository.getIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}