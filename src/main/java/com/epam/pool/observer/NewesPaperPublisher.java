package com.epam.pool.observer;

public class NewesPaperPublisher implements Publisher {
    @Override
    public String publish() {
        return "Daily News";
    }
}
