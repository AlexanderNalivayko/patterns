package com.epam.pool.task3_abstract_factory;

import com.epam.pool.task3_abstract_factory.localisations.Audio;
import com.epam.pool.task3_abstract_factory.localisations.Subtitles;

public abstract class LocalisationFactory {

    public abstract Audio createAudio();

    public abstract Subtitles createSubtitles();
}
