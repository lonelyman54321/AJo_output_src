/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.analytics;

import com.google.android.gms.analytics.HitBuilders$HitBuilder;
import com.google.android.gms.internal.gtm.zzff;

public class HitBuilders$ExceptionBuilder
extends HitBuilders$HitBuilder {
    public HitBuilders$ExceptionBuilder() {
        this.set("&t", "exception");
    }

    public HitBuilders$ExceptionBuilder setDescription(String string2) {
        this.set("&exd", string2);
        return this;
    }

    public HitBuilders$ExceptionBuilder setFatal(boolean bl2) {
        String string2 = zzff.zzc(bl2);
        this.set("&exf", string2);
        return this;
    }
}

