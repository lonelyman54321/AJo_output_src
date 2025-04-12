/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.Config;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AdsData
implements Serializable {
    private final String ad;
    private final Config config;

    public AdsData() {
        this(null, null, 3, null);
    }

    public AdsData(String string2, Config config) {
        this.ad = string2;
        this.config = config;
    }

    public /* synthetic */ AdsData(String string2, Config config, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            config = null;
        }
        this(string2, config);
    }

    public static /* synthetic */ AdsData copy$default(AdsData adsData, String string2, Config config, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = adsData.ad;
        }
        if ((n3 &= 2) != 0) {
            config = adsData.config;
        }
        return adsData.copy(string2, config);
    }

    public final String component1() {
        return this.ad;
    }

    public final Config component2() {
        return this.config;
    }

    public final AdsData copy(String string2, Config config) {
        AdsData adsData = new AdsData(string2, config);
        return adsData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AdsData;
        if (!bl3) {
            return false;
        }
        object = (AdsData)object;
        Object object2 = this.ad;
        String string2 = ((AdsData)object).ad;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.config;
        object = ((AdsData)object).config;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAd() {
        return this.ad;
    }

    public final Config getConfig() {
        return this.config;
    }

    public int hashCode() {
        int n3;
        String string2 = this.ad;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        Config config = this.config;
        if (config != null) {
            n4 = config.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.ad;
        Config config = this.config;
        StringBuilder stringBuilder = new StringBuilder("AdsData(ad=");
        stringBuilder.append(string2);
        stringBuilder.append(", config=");
        stringBuilder.append(config);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

