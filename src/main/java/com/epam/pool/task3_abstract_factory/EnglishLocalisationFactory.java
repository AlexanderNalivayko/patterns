package com.epam.pool.task3_abstract_factory;

import com.epam.pool.task3_abstract_factory.localisations.Audio;
import com.epam.pool.task3_abstract_factory.localisations.EnglishAudio;
import com.epam.pool.task3_abstract_factory.localisations.EnglishSubtitles;
import com.epam.pool.task3_abstract_factory.localisations.Subtitles;

public class EnglishLocalisationFactory extends LocalisationFactory {

    public Audio createAudio() {
        return new EnglishAudio();
    }

    public Subtitles createSubtitles() {
        return new EnglishSubtitles();
    }
}
