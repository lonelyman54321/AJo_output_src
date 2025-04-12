/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;

public final class AggregateRatingBuilder
extends IndexableBuilder {
    public AggregateRatingBuilder() {
        super("AggregateRating");
    }

    public AggregateRatingBuilder setRatingCount(long l2) {
        long[] lArray = new long[]{l2};
        this.put("ratingCount", lArray);
        return this;
    }

    public AggregateRatingBuilder setRatingValue(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("ratingValue", stringArray);
        return this;
    }
}

