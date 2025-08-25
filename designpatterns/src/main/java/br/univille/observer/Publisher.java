package br.univille.observer;

import java.util.ArrayList;

public class Publisher {
    private ArrayList<Subscriber> subscribers = new ArrayList<>();
    String mainState;

public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(mainState);
        }
    }

    public void setMainState(String mainState) {
        this.mainState = mainState;
        notifySubscribers();
    }
}
