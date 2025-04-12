/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.builders.PlaceBuilder;
import java.util.Date;

public final class PhotographBuilder
extends IndexableBuilder {
    public PhotographBuilder() {
        super("Photograph");
    }

    public PhotographBuilder setDateCreated(Date object) {
        long l2 = ((Date)object).getTime();
        object = new long[1];
        object[0] = l2;
        this.put("dateCreated", (long[])object);
        return this;
    }

    public PhotographBuilder setLocationCreated(PlaceBuilder placeBuilder) {
        IndexableBuilder[] indexableBuilderArray = new PlaceBuilder[]{placeBuilder};
        this.put("locationCreated", indexableBuilderArray);
        return this;
    }
}

