package com.epam.pool.observer;

import java.util.ArrayList;
import java.util.LinkedList;

public class PostOffice implements Subscrieble {

    private static ArrayList<Subscriber> subscribers = new ArrayList<>();
    private static LinkedList<String> publications = new LinkedList<>();

    public void addNewPublication(String publication){
        publications.add(publication);
        distributeUpdates();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void distributeUpdates() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(publications.getLast());
        }
    }
}
