/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.builders.MusicRecordingBuilder;

public class MusicPlaylistBuilder
extends IndexableBuilder {
    public MusicPlaylistBuilder() {
        super("MusicPlaylist");
    }

    public MusicPlaylistBuilder setNumTracks(int n3) {
        long l2 = n3;
        long[] lArray = new long[]{l2};
        return (MusicPlaylistBuilder)this.put("numTracks", lArray);
    }

    public MusicPlaylistBuilder setTrack(MusicRecordingBuilder ... musicRecordingBuilderArray) {
        return (MusicPlaylistBuilder)this.put("track", musicRecordingBuilderArray);
    }
}

