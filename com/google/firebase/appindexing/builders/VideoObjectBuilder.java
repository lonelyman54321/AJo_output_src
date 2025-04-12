/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.builders.PersonBuilder;
import com.google.firebase.appindexing.builders.PlaceBuilder;
import java.util.Date;

public final class VideoObjectBuilder
extends IndexableBuilder {
    public VideoObjectBuilder() {
        super("VideoObject");
    }

    public VideoObjectBuilder setAuthor(PersonBuilder personBuilder) {
        IndexableBuilder[] indexableBuilderArray = new PersonBuilder[]{personBuilder};
        this.put("author", indexableBuilderArray);
        return this;
    }

    public VideoObjectBuilder setDuration(long l2) {
        long[] lArray = new long[]{l2};
        this.put("duration", lArray);
        return this;
    }

    public VideoObjectBuilder setDurationWatched(long l2) {
        long[] lArray = new long[]{l2};
        this.put("durationWatched", lArray);
        return this;
    }

    public VideoObjectBuilder setLocationCreated(PlaceBuilder placeBuilder) {
        IndexableBuilder[] indexableBuilderArray = new PlaceBuilder[]{placeBuilder};
        this.put("locationCreated", indexableBuilderArray);
        return this;
    }

    public VideoObjectBuilder setSeriesName(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("seriesName", stringArray);
        return this;
    }

    public VideoObjectBuilder setUploadDate(Date object) {
        long l2 = ((Date)object).getTime();
        object = new long[1];
        object[0] = l2;
        this.put("uploadDate", (long[])object);
        return this;
    }
}

