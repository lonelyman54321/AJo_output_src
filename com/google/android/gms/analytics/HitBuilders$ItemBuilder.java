/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.analytics;

import com.google.android.gms.analytics.HitBuilders$HitBuilder;

public class HitBuilders$ItemBuilder
extends HitBuilders$HitBuilder {
    public HitBuilders$ItemBuilder() {
        this.set("&t", "item");
    }

    public HitBuilders$ItemBuilder setCategory(String string2) {
        this.set("&iv", string2);
        return this;
    }

    public HitBuilders$ItemBuilder setCurrencyCode(String string2) {
        this.set("&cu", string2);
        return this;
    }

    public HitBuilders$ItemBuilder setName(String string2) {
        this.set("&in", string2);
        return this;
    }

    public HitBuilders$ItemBuilder setPrice(double d2) {
        String string2 = Double.toString(d2);
        this.set("&ip", string2);
        return this;
    }

    public HitBuilders$ItemBuilder setQuantity(long l2) {
        String string2 = Long.toString(l2);
        this.set("&iq", string2);
        return this;
    }

    public HitBuilders$ItemBuilder setSku(String string2) {
        this.set("&ic", string2);
        return this;
    }

    public HitBuilders$ItemBuilder setTransactionId(String string2) {
        this.set("&ti", string2);
        return this;
    }
}

