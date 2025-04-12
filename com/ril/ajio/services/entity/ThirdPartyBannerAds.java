/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ThirdPartyBannerAds {
    private Map ads;

    public ThirdPartyBannerAds() {
        this(null, 1, null);
    }

    public ThirdPartyBannerAds(Map map2) {
        this.ads = map2;
    }

    public /* synthetic */ ThirdPartyBannerAds(Map map2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            map2 = null;
        }
        this(map2);
    }

    public static /* synthetic */ ThirdPartyBannerAds copy$default(ThirdPartyBannerAds thirdPartyBannerAds, Map map2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            map2 = thirdPartyBannerAds.ads;
        }
        return thirdPartyBannerAds.copy(map2);
    }

    public final Map component1() {
        return this.ads;
    }

    public final ThirdPartyBannerAds copy(Map map2) {
        ThirdPartyBannerAds thirdPartyBannerAds = new ThirdPartyBannerAds(map2);
        return thirdPartyBannerAds;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ThirdPartyBannerAds;
        if (!bl3) {
            return false;
        }
        object = (ThirdPartyBannerAds)object;
        Map map2 = this.ads;
        object = ((ThirdPartyBannerAds)object).ads;
        boolean bl4 = Intrinsics.areEqual(map2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Map getAds() {
        return this.ads;
    }

    public int hashCode() {
        int n3;
        Map map2 = this.ads;
        if (map2 == null) {
            n3 = 0;
            map2 = null;
        } else {
            n3 = ((Object)map2).hashCode();
        }
        return n3;
    }

    public final void setAds(Map map2) {
        this.ads = map2;
    }

    public String toString() {
        Map map2 = this.ads;
        StringBuilder stringBuilder = new StringBuilder("ThirdPartyBannerAds(ads=");
        stringBuilder.append(map2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

