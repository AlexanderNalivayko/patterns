package com.epam.pool.observer;

public class NewsPaperPublisher implements Publisher {

    @Override
    public String publish() {
        return "Daily News";
    }
}
