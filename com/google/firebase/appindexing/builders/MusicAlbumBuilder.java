/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.builders.MusicGroupBuilder;
import com.google.firebase.appindexing.builders.MusicRecordingBuilder;

public final class MusicAlbumBuilder
extends IndexableBuilder {
    public MusicAlbumBuilder() {
        super("MusicAlbum");
    }

    public MusicAlbumBuilder setByArtist(MusicGroupBuilder musicGroupBuilder) {
        IndexableBuilder[] indexableBuilderArray = new MusicGroupBuilder[]{musicGroupBuilder};
        this.put("byArtist", indexableBuilderArray);
        return this;
    }

    public MusicAlbumBuilder setNumTracks(int n3) {
        long l2 = n3;
        long[] lArray = new long[]{l2};
        this.put("numTracks", lArray);
        return this;
    }

    public MusicAlbumBuilder setTrack(MusicRecordingBuilder ... musicRecordingBuilderArray) {
        this.put("track", musicRecordingBuilderArray);
        return this;
    }
}

