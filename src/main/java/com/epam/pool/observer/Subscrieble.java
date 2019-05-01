package com.epam.pool.observer;

public interface Subscrieble {

    public void subscribe(Subscriber subscriber);

    public void unsubscribe(Subscriber subscriber);

    public void distributeUpdates();
}
