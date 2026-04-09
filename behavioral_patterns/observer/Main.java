package behavioral_patterns.observer;

import behavioral_patterns.observer.subject.YouTubeChannel;
import behavioral_patterns.observer.observertype.Subscriber;

public class Main {

    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel();

        Subscriber user1 = new Subscriber("Ankur");
        Subscriber user2 = new Subscriber("Rahul");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.uploadVideo("Observer Pattern in Java");

        System.out.println("------");

        channel.unsubscribe(user2);

        channel.uploadVideo("Strategy Pattern Explained");
    }
}