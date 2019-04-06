package com.epam.pool.task4_prototype;

public class Runner {

    public static void main(String[] args) {
        Encyclopedia wikipedia = new Wikipedia();
        wikipedia.addArticle(new Article("Java", "is a general-purpose computer-programming language ..."));
        wikipedia.addArticle(new Article("Singleton", "is a software design pattern ..."));
        wikipedia.addArticle(new Article("OOP", "is a programming paradigm based on ..."));

        System.out.println("\nbefore article modification:");
        wikipedia.printAll();

        Article articleFromWikipedia = wikipedia.getArticle(0);
        articleFromWikipedia.setText(articleFromWikipedia.getText().replace(".", ""));

        System.out.println("\nafter article modification:");
        wikipedia.printAll();

        wikipedia.updateArticle(articleFromWikipedia);

        System.out.println("\nafter article update:");
        wikipedia.printAll();
    }
}
