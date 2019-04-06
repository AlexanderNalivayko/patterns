package com.epam.pool.task3_abstract_factory;

import com.epam.pool.task3_abstract_factory.localisations.Audio;
import com.epam.pool.task3_abstract_factory.localisations.RussianAudio;
import com.epam.pool.task3_abstract_factory.localisations.RussianSubtitles;
import com.epam.pool.task3_abstract_factory.localisations.Subtitles;

public class RussianLocalisationFactory extends LocalisationFactory {

    public Audio createAudio() {
        return new RussianAudio();
    }

    public Subtitles createSubtitles() {
        return new RussianSubtitles();
    }
}
