/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;

public final class GeoShapeBuilder
extends IndexableBuilder {
    public GeoShapeBuilder() {
        super("GeoShape");
    }

    public GeoShapeBuilder setBox(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("box", stringArray);
        return this;
    }

    public GeoShapeBuilder setBox(String ... stringArray) {
        this.put("box", stringArray);
        return this;
    }
}

