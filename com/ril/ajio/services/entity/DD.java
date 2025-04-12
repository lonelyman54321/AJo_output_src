/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class DD {
    private final Map ads;
    private final String wt;

    public DD() {
        this(null, null, 3, null);
    }

    public DD(Map map2, String string2) {
        this.ads = map2;
        this.wt = string2;
    }

    public /* synthetic */ DD(Map map2, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            map2 = null;
        }
        if ((n3 &= 2) != 0) {
            string2 = null;
        }
        this(map2, string2);
    }

    public static /* synthetic */ DD copy$default(DD dD, Map map2, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            map2 = dD.ads;
        }
        if ((n3 &= 2) != 0) {
            string2 = dD.wt;
        }
        return dD.copy(map2, string2);
    }

    public final Map component1() {
        return this.ads;
    }

    public final String component2() {
        return this.wt;
    }

    public final DD copy(Map map2, String string2) {
        DD dD = new DD(map2, string2);
        return dD;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DD;
        if (!bl3) {
            return false;
        }
        object = (DD)object;
        Object object2 = this.ads;
        Map map2 = ((DD)object).ads;
        bl3 = Intrinsics.areEqual(object2, map2);
        if (!bl3) {
            return false;
        }
        object2 = this.wt;
        object = ((DD)object).wt;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Map getAds() {
        return this.ads;
    }

    public final String getWt() {
        return this.wt;
    }

    public int hashCode() {
        int n3;
        Map map2 = this.ads;
        int n4 = 0;
        if (map2 == null) {
            n3 = 0;
            map2 = null;
        } else {
            n3 = ((Object)map2).hashCode();
        }
        n3 *= 31;
        String string2 = this.wt;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        Map map2 = this.ads;
        String string2 = this.wt;
        StringBuilder stringBuilder = new StringBuilder("DD(ads=");
        stringBuilder.append(map2);
        stringBuilder.append(", wt=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

