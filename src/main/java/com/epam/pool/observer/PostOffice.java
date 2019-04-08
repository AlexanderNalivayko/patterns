package com.epam.pool.observer;

import java.util.ArrayList;

public class PostOffice implements Subscrieble {

    private static ArrayList<Subscriber> subscribers = new ArrayList<>();
    private static ArrayList<String> publications = new ArrayList<>();

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
            subscriber.update(publications.get(publications.size()-1));
        }
    }
}
