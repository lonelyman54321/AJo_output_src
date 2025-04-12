/*
 * Decompiled with CFR 0.152.
 */
package com.google.geo.type;

import com.google.geo.type.Viewport;
import com.google.geo.type.Viewport$1;
import com.google.geo.type.ViewportOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.type.LatLng;
import com.google.type.LatLng$Builder;

public final class Viewport$Builder
extends GeneratedMessageLite$Builder
implements ViewportOrBuilder {
    private Viewport$Builder() {
        Viewport viewport = Viewport.access$000();
        super(viewport);
    }

    public /* synthetic */ Viewport$Builder(Viewport$1 viewport$1) {
        this();
    }

    public Viewport$Builder clearHigh() {
        this.copyOnWrite();
        Viewport.access$600((Viewport)this.instance);
        return this;
    }

    public Viewport$Builder clearLow() {
        this.copyOnWrite();
        Viewport.access$300((Viewport)this.instance);
        return this;
    }

    public LatLng getHigh() {
        return ((Viewport)this.instance).getHigh();
    }

    public LatLng getLow() {
        return ((Viewport)this.instance).getLow();
    }

    public boolean hasHigh() {
        return ((Viewport)this.instance).hasHigh();
    }

    public boolean hasLow() {
        return ((Viewport)this.instance).hasLow();
    }

    public Viewport$Builder mergeHigh(LatLng latLng) {
        this.copyOnWrite();
        Viewport.access$500((Viewport)this.instance, latLng);
        return this;
    }

    public Viewport$Builder mergeLow(LatLng latLng) {
        this.copyOnWrite();
        Viewport.access$200((Viewport)this.instance, latLng);
        return this;
    }

    public Viewport$Builder setHigh(LatLng$Builder latLngOrBuilder) {
        this.copyOnWrite();
        Viewport viewport = (Viewport)this.instance;
        latLngOrBuilder = (LatLng)latLngOrBuilder.build();
        Viewport.access$400(viewport, (LatLng)latLngOrBuilder);
        return this;
    }

    public Viewport$Builder setHigh(LatLng latLng) {
        this.copyOnWrite();
        Viewport.access$400((Viewport)this.instance, latLng);
        return this;
    }

    public Viewport$Builder setLow(LatLng$Builder latLngOrBuilder) {
        this.copyOnWrite();
        Viewport viewport = (Viewport)this.instance;
        latLngOrBuilder = (LatLng)latLngOrBuilder.build();
        Viewport.access$100(viewport, (LatLng)latLngOrBuilder);
        return this;
    }

    public Viewport$Builder setLow(LatLng latLng) {
        this.copyOnWrite();
        Viewport.access$100((Viewport)this.instance, latLng);
        return this;
    }
}

