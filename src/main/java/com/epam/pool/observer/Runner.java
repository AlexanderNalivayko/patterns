package com.epam.pool.observer;

public class Runner {

    public static void main(String[] args) {
        Subscriber subscriberOne = new SimpleSubscriber("Mr. Smith", "E 68 str. 17");
        Subscriber subscriberTwo = new SimpleSubscriber("Ms. Johnson", "Cristopher str. 48");
        Subscriber subscriberThree = new SimpleSubscriber("Mr. Williams", "Bleecker str. 87 ");

        PostOffice postOffice = new PostOffice();
        Publisher publisher = new NewsPaperPublisher();

        //before subscribe everyone
        postOffice.addNewPublication(publisher.publish());

        postOffice.subscribe(subscriberOne);
        postOffice.subscribe(subscriberTwo);
        postOffice.subscribe(subscriberThree);

        //after subscribe everyone
        postOffice.addNewPublication(publisher.publish());
    }
}
