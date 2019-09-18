package com.epam.pool.task3_abstract_factory;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("To play movie, choose localisation (type in language):");
        for (Field field : Language.class.getFields()) {
            System.out.println(field.getName());
        }
        Scanner scanner = new Scanner(System.in);
        LocalisationFactory localisationFactory;
        while (true) {
            String userInput = scanner.nextLine();
            localisationFactory = createFactory(userInput);
            if (localisationFactory != null) {
                break;
            }
            System.out.println("invalid input, try again");
        }
        Movie movie = new Movie(localisationFactory);
        movie.play();
    }

    private static LocalisationFactory createFactory(String language) {
        if (Language.ENGLISH.name().equalsIgnoreCase(language)) {
            return new EnglishLocalisationFactory();
        } else if (Language.UKRAINIAN.name().equalsIgnoreCase(language)) {
            return new UkrainianLocalisationFactory();
        } else if (Language.RUSSIAN.name().equalsIgnoreCase(language)) {
            return new RussianLocalisationFactory();
        } else {
            return null;
        }
    }
}
