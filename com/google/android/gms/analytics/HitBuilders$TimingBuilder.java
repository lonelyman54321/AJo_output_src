/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.analytics;

import com.google.android.gms.analytics.HitBuilders$HitBuilder;

public class HitBuilders$TimingBuilder
extends HitBuilders$HitBuilder {
    public HitBuilders$TimingBuilder() {
        this.set("&t", "timing");
    }

    public HitBuilders$TimingBuilder(String string2, String string3, long l2) {
        this();
        this.setVariable(string3);
        this.setValue(l2);
        this.setCategory(string2);
    }

    public HitBuilders$TimingBuilder setCategory(String string2) {
        this.set("&utc", string2);
        return this;
    }

    public HitBuilders$TimingBuilder setLabel(String string2) {
        this.set("&utl", string2);
        return this;
    }

    public HitBuilders$TimingBuilder setValue(long l2) {
        String string2 = Long.toString(l2);
        this.set("&utt", string2);
        return this;
    }

    public HitBuilders$TimingBuilder setVariable(String string2) {
        this.set("&utv", string2);
        return this;
    }
}

