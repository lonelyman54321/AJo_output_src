/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.builders.MusicAlbumBuilder;
import com.google.firebase.appindexing.builders.MusicRecordingBuilder;

public final class MusicGroupBuilder
extends IndexableBuilder {
    public MusicGroupBuilder() {
        super("MusicGroup");
    }

    public MusicGroupBuilder setAlbum(MusicAlbumBuilder ... musicAlbumBuilderArray) {
        this.put("album", musicAlbumBuilderArray);
        return this;
    }

    public MusicGroupBuilder setGenre(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("genre", stringArray);
        return this;
    }

    public MusicGroupBuilder setTrack(MusicRecordingBuilder ... musicRecordingBuilderArray) {
        this.put("track", musicRecordingBuilderArray);
        return this;
    }
}

