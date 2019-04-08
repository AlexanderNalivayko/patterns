package com.epam.pool.observer;

public class SimpleSubscriber implements Subscriber {

    String name;
    String address;

    public SimpleSubscriber(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public void update(String text) {
        System.out.println(name + ", on " + address + ". received: " + text);
    }
}
