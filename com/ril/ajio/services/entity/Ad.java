/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import com.ril.ajio.services.entity.AdConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Ad {
    private final String ad;
    private final AdConfig config;

    public Ad() {
        this(null, null, 3, null);
    }

    public Ad(AdConfig adConfig, String string2) {
        this.config = adConfig;
        this.ad = string2;
    }

    public /* synthetic */ Ad(AdConfig adConfig, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            adConfig = null;
        }
        if ((n3 &= 2) != 0) {
            string2 = null;
        }
        this(adConfig, string2);
    }

    public static /* synthetic */ Ad copy$default(Ad ad2, AdConfig adConfig, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            adConfig = ad2.config;
        }
        if ((n3 &= 2) != 0) {
            string2 = ad2.ad;
        }
        return ad2.copy(adConfig, string2);
    }

    public final AdConfig component1() {
        return this.config;
    }

    public final String component2() {
        return this.ad;
    }

    public final Ad copy(AdConfig adConfig, String string2) {
        Ad ad2 = new Ad(adConfig, string2);
        return ad2;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Ad;
        if (!bl3) {
            return false;
        }
        object = (Ad)object;
        Object object2 = this.config;
        AdConfig adConfig = ((Ad)object).config;
        bl3 = Intrinsics.areEqual(object2, adConfig);
        if (!bl3) {
            return false;
        }
        object2 = this.ad;
        object = ((Ad)object).ad;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAd() {
        return this.ad;
    }

    public final AdConfig getConfig() {
        return this.config;
    }

    public int hashCode() {
        int n3;
        AdConfig adConfig = this.config;
        int n4 = 0;
        if (adConfig == null) {
            n3 = 0;
            adConfig = null;
        } else {
            n3 = adConfig.hashCode();
        }
        n3 *= 31;
        String string2 = this.ad;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        AdConfig adConfig = this.config;
        String string2 = this.ad;
        StringBuilder stringBuilder = new StringBuilder("Ad(config=");
        stringBuilder.append(adConfig);
        stringBuilder.append(", ad=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

