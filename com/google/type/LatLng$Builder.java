/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.type.LatLng;
import com.google.type.LatLng$1;
import com.google.type.LatLngOrBuilder;

public final class LatLng$Builder
extends GeneratedMessageLite$Builder
implements LatLngOrBuilder {
    private LatLng$Builder() {
        LatLng latLng = LatLng.access$000();
        super(latLng);
    }

    public /* synthetic */ LatLng$Builder(LatLng$1 latLng$1) {
        this();
    }

    public LatLng$Builder clearLatitude() {
        this.copyOnWrite();
        LatLng.access$200((LatLng)this.instance);
        return this;
    }

    public LatLng$Builder clearLongitude() {
        this.copyOnWrite();
        LatLng.access$400((LatLng)this.instance);
        return this;
    }

    public double getLatitude() {
        return ((LatLng)this.instance).getLatitude();
    }

    public double getLongitude() {
        return ((LatLng)this.instance).getLongitude();
    }

    public LatLng$Builder setLatitude(double d2) {
        this.copyOnWrite();
        LatLng.access$100((LatLng)this.instance, d2);
        return this;
    }

    public LatLng$Builder setLongitude(double d2) {
        this.copyOnWrite();
        LatLng.access$300((LatLng)this.instance, d2);
        return this;
    }
}

