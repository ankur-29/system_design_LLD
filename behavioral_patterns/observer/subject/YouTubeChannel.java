package behavioral_patterns.observer.subject;

import behavioral_patterns.observer.observertype.Observer;
import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {

    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String videoTitle) {
        for (Observer sub : subscribers) {
            sub.update(videoTitle);
        }
    }

    public void uploadVideo(String title) {
        System.out.println("New Video Uploaded: " + title);
        notifyObservers(title);
    }
}