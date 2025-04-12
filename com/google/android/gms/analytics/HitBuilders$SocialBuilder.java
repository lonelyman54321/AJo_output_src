/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.analytics;

import com.google.android.gms.analytics.HitBuilders$HitBuilder;

public class HitBuilders$SocialBuilder
extends HitBuilders$HitBuilder {
    public HitBuilders$SocialBuilder() {
        this.set("&t", "social");
    }

    public HitBuilders$SocialBuilder setAction(String string2) {
        this.set("&sa", string2);
        return this;
    }

    public HitBuilders$SocialBuilder setNetwork(String string2) {
        this.set("&sn", string2);
        return this;
    }

    public HitBuilders$SocialBuilder setTarget(String string2) {
        this.set("&st", string2);
        return this;
    }
}

