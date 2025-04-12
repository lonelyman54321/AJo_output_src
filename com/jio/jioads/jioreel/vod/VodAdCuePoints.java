/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.vod;

import kotlin.jvm.internal.Intrinsics;

public final class VodAdCuePoints {
    public final String a;
    public final String b;
    public final String c;

    public VodAdCuePoints(String string2, String string3, String string4) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
    }

    public static /* synthetic */ VodAdCuePoints copy$default(VodAdCuePoints vodAdCuePoints, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = vodAdCuePoints.a;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = vodAdCuePoints.b;
        }
        if ((n3 &= 4) != 0) {
            string4 = vodAdCuePoints.c;
        }
        return vodAdCuePoints.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final VodAdCuePoints copy(String string2, String string3, String string4) {
        VodAdCuePoints vodAdCuePoints = new VodAdCuePoints(string2, string3, string4);
        return vodAdCuePoints;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof VodAdCuePoints;
        if (!bl3) {
            return false;
        }
        object = (VodAdCuePoints)object;
        String string2 = this.a;
        String string3 = ((VodAdCuePoints)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.b;
        string3 = ((VodAdCuePoints)object).b;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.c;
        object = ((VodAdCuePoints)object).c;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAdBreakCount() {
        return this.c;
    }

    public final String getAdsBreakDuration() {
        return this.b;
    }

    public final String getStartTime() {
        return this.a;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.a;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.b;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.c;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("VodAdCuePoints(startTime=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", adsBreakDuration=");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", adBreakCount=");
        string2 = this.c;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

