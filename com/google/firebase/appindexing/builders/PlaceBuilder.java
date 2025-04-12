/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.GeoShapeBuilder;
import com.google.firebase.appindexing.builders.IndexableBuilder;

public final class PlaceBuilder
extends IndexableBuilder {
    public PlaceBuilder() {
        super("Place");
    }

    public PlaceBuilder setGeo(GeoShapeBuilder geoShapeBuilder) {
        IndexableBuilder[] indexableBuilderArray = new GeoShapeBuilder[]{geoShapeBuilder};
        this.put("geo", indexableBuilderArray);
        return this;
    }
}

