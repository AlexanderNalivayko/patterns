package com.epam.pool.task3_abstract_factory;

import com.epam.pool.task3_abstract_factory.localisations.Audio;
import com.epam.pool.task3_abstract_factory.localisations.Subtitles;

public class Movie {

    Audio audio;
    Subtitles subtitles;

    public Movie(LocalisationFactory localisationFactory) {
        this.audio = localisationFactory.createAudio();
        this.subtitles = localisationFactory.createSubtitles();
    }

    public void play() {
        System.out.println("Playing movie with:");
        System.out.println(audio.getAudio());
        System.out.println(subtitles.getSubtitles());
    }
}
