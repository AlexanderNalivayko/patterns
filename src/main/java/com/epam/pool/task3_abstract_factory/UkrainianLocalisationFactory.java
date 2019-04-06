package com.epam.pool.task3_abstract_factory;

import com.epam.pool.task3_abstract_factory.localisations.Audio;
import com.epam.pool.task3_abstract_factory.localisations.Subtitles;
import com.epam.pool.task3_abstract_factory.localisations.UkrainianAudio;
import com.epam.pool.task3_abstract_factory.localisations.UkrainianSubtitles;

public class UkrainianLocalisationFactory extends LocalisationFactory {

    public Audio createAudio() {
        return new UkrainianAudio();
    }

    public Subtitles createSubtitles() {
        return new UkrainianSubtitles();
    }
}
