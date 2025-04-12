/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.analytics;

import com.google.android.gms.analytics.HitBuilders$HitBuilder;

public class HitBuilders$EventBuilder
extends HitBuilders$HitBuilder {
    public HitBuilders$EventBuilder() {
        this.set("&t", "event");
    }

    public HitBuilders$EventBuilder(String string2, String string3) {
        this();
        this.setCategory(string2);
        this.setAction(string3);
    }

    public HitBuilders$EventBuilder setAction(String string2) {
        this.set("&ea", string2);
        return this;
    }

    public HitBuilders$EventBuilder setCategory(String string2) {
        this.set("&ec", string2);
        return this;
    }

    public HitBuilders$EventBuilder setLabel(String string2) {
        this.set("&el", string2);
        return this;
    }

    public HitBuilders$EventBuilder setValue(long l2) {
        String string2 = Long.toString(l2);
        this.set("&ev", string2);
        return this;
    }
}

