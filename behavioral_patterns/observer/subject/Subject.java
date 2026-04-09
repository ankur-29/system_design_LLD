package behavioral_patterns.observer.subject;

import behavioral_patterns.observer.observertype.Observer;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers(String videoTitle);
}