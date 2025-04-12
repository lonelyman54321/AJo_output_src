/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import kotlin.jvm.internal.Intrinsics;

public final class AdConfig {
    private final String cid;

    public AdConfig(String string2) {
        Intrinsics.checkNotNullParameter(string2, "cid");
        this.cid = string2;
    }

    public static /* synthetic */ AdConfig copy$default(AdConfig adConfig, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = adConfig.cid;
        }
        return adConfig.copy(string2);
    }

    public final String component1() {
        return this.cid;
    }

    public final AdConfig copy(String string2) {
        Intrinsics.checkNotNullParameter(string2, "cid");
        AdConfig adConfig = new AdConfig(string2);
        return adConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AdConfig;
        if (!bl3) {
            return false;
        }
        object = (AdConfig)object;
        String string2 = this.cid;
        object = ((AdConfig)object).cid;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCid() {
        return this.cid;
    }

    public int hashCode() {
        return this.cid.hashCode();
    }

    public String toString() {
        String string2 = this.cid;
        return cP.a("AdConfig(cid=", string2, ")");
    }
}

