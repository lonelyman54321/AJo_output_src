/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.builders.MusicAlbumBuilder;
import com.google.firebase.appindexing.builders.MusicGroupBuilder;
import com.google.firebase.appindexing.builders.MusicPlaylistBuilder;

public final class MusicRecordingBuilder
extends IndexableBuilder {
    public MusicRecordingBuilder() {
        super("MusicRecording");
    }

    public MusicRecordingBuilder setByArtist(MusicGroupBuilder musicGroupBuilder) {
        IndexableBuilder[] indexableBuilderArray = new MusicGroupBuilder[]{musicGroupBuilder};
        this.put("byArtist", indexableBuilderArray);
        return this;
    }

    public MusicRecordingBuilder setDuration(int n3) {
        long l2 = n3;
        long[] lArray = new long[]{l2};
        this.put("duration", lArray);
        return this;
    }

    public MusicRecordingBuilder setInAlbum(MusicAlbumBuilder musicAlbumBuilder) {
        IndexableBuilder[] indexableBuilderArray = new MusicAlbumBuilder[]{musicAlbumBuilder};
        this.put("inAlbum", indexableBuilderArray);
        return this;
    }

    public MusicRecordingBuilder setInPlaylist(MusicPlaylistBuilder ... musicPlaylistBuilderArray) {
        this.put("inPlaylist", musicPlaylistBuilderArray);
        return this;
    }
}

