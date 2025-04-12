/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.referrer;

import kotlin.jvm.internal.Intrinsics;

public final class AffiseReferrerData {
    private final boolean googlePlayInstantParam;
    private final long installBeginTimestampSeconds;
    private final long installBeginTimestampServerSeconds;
    private final String installReferrer;
    private final String installVersion;
    private final long referrerClickTimestampSeconds;
    private final long referrerClickTimestampServerSeconds;

    public AffiseReferrerData(String string2, long l2, long l3, long l4, long l7, String string3, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "installReferrer");
        Intrinsics.checkNotNullParameter(string3, "installVersion");
        this.installReferrer = string2;
        this.referrerClickTimestampSeconds = l2;
        this.installBeginTimestampSeconds = l3;
        this.referrerClickTimestampServerSeconds = l4;
        this.installBeginTimestampServerSeconds = l7;
        this.installVersion = string3;
        this.googlePlayInstantParam = bl2;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ AffiseReferrerData copy$default(AffiseReferrerData affiseReferrerData, String string2, long l2, long l3, long l4, long l7, String string3, boolean bl2, int n3, Object object) {
        void var31_26;
        AffiseReferrerData affiseReferrerData2 = affiseReferrerData;
        int n4 = n3 & 1;
        String string4 = n4 != 0 ? affiseReferrerData.installReferrer : string2;
        int n7 = n3 & 2;
        long l8 = n7 != 0 ? affiseReferrerData2.referrerClickTimestampSeconds : l2;
        int n8 = n3 & 4;
        long l12 = n8 != 0 ? affiseReferrerData2.installBeginTimestampSeconds : l3;
        int n10 = n3 & 8;
        long l14 = n10 != 0 ? affiseReferrerData2.referrerClickTimestampServerSeconds : l4;
        int n14 = n3 & 0x10;
        long l15 = n14 != 0 ? affiseReferrerData2.installBeginTimestampServerSeconds : l7;
        int n15 = n3 & 0x20;
        String string5 = n15 != 0 ? affiseReferrerData2.installVersion : string3;
        int bl3 = n3 & 0x40;
        if (bl3 != 0) {
            boolean bl4 = affiseReferrerData2.googlePlayInstantParam;
        } else {
            boolean bl5 = bl2;
        }
        string2 = string4;
        l2 = l8;
        l3 = l12;
        l4 = l14;
        l7 = l15;
        string3 = string5;
        bl2 = var31_26;
        return affiseReferrerData.copy(string4, l8, l12, l14, l15, string5, (boolean)var31_26);
    }

    public final String component1() {
        return this.installReferrer;
    }

    public final long component2() {
        return this.referrerClickTimestampSeconds;
    }

    public final long component3() {
        return this.installBeginTimestampSeconds;
    }

    public final long component4() {
        return this.referrerClickTimestampServerSeconds;
    }

    public final long component5() {
        return this.installBeginTimestampServerSeconds;
    }

    public final String component6() {
        return this.installVersion;
    }

    public final boolean component7() {
        return this.googlePlayInstantParam;
    }

    public final AffiseReferrerData copy(String string2, long l2, long l3, long l4, long l7, String string3, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "installReferrer");
        Intrinsics.checkNotNullParameter(string3, "installVersion");
        AffiseReferrerData affiseReferrerData = new AffiseReferrerData(string2, l2, l3, l4, l7, string3, bl2);
        return affiseReferrerData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof AffiseReferrerData;
        if (!object2) {
            return false;
        }
        object = (AffiseReferrerData)object;
        String string2 = this.installReferrer;
        String string3 = ((AffiseReferrerData)object).installReferrer;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        long l2 = this.referrerClickTimestampSeconds;
        long l3 = ((AffiseReferrerData)object).referrerClickTimestampSeconds;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l2 = this.installBeginTimestampSeconds;
        l3 = ((AffiseReferrerData)object).installBeginTimestampSeconds;
        long l7 = l2 - l3;
        object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l2 = this.referrerClickTimestampServerSeconds;
        l3 = ((AffiseReferrerData)object).referrerClickTimestampServerSeconds;
        long l8 = l2 - l3;
        object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l2 = this.installBeginTimestampServerSeconds;
        l3 = ((AffiseReferrerData)object).installBeginTimestampServerSeconds;
        long l12 = l2 - l3;
        object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        string2 = this.installVersion;
        string3 = ((AffiseReferrerData)object).installVersion;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        object2 = this.googlePlayInstantParam;
        boolean bl3 = ((AffiseReferrerData)object).googlePlayInstantParam;
        if (object2 != bl3) {
            return false;
        }
        return bl2;
    }

    public final boolean getGooglePlayInstantParam() {
        return this.googlePlayInstantParam;
    }

    public final long getInstallBeginTimestampSeconds() {
        return this.installBeginTimestampSeconds;
    }

    public final long getInstallBeginTimestampServerSeconds() {
        return this.installBeginTimestampServerSeconds;
    }

    public final String getInstallReferrer() {
        return this.installReferrer;
    }

    public final String getInstallVersion() {
        return this.installVersion;
    }

    public final long getReferrerClickTimestampSeconds() {
        return this.referrerClickTimestampSeconds;
    }

    public final long getReferrerClickTimestampServerSeconds() {
        return this.referrerClickTimestampServerSeconds;
    }

    public int hashCode() {
        String string2 = this.installReferrer;
        int n3 = string2.hashCode() * 31;
        long l2 = this.referrerClickTimestampSeconds;
        int n4 = 32;
        long l3 = l2 >>> n4;
        int n7 = (int)(l2 ^ l3);
        n3 = (n3 + n7) * 31;
        l2 = this.installBeginTimestampSeconds;
        l3 = l2 >>> n4;
        n7 = (int)(l2 ^ l3);
        n3 = (n3 + n7) * 31;
        l2 = this.referrerClickTimestampServerSeconds;
        l3 = l2 >>> n4;
        n7 = (int)(l2 ^ l3);
        n3 = (n3 + n7) * 31;
        l2 = this.installBeginTimestampServerSeconds;
        long l4 = l2 >>> n4;
        n7 = (int)(l2 ^= l4);
        n3 = (n3 + n7) * 31;
        String string3 = this.installVersion;
        n3 = zy_2.b(n3, 31, string3);
        int n8 = (int)(this.googlePlayInstantParam ? 1 : 0);
        if (n8 != 0) {
            n8 = 1;
        }
        return n3 + n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AffiseReferrerData(installReferrer=");
        String string2 = this.installReferrer;
        stringBuilder.append(string2);
        stringBuilder.append(", referrerClickTimestampSeconds=");
        long l2 = this.referrerClickTimestampSeconds;
        stringBuilder.append(l2);
        stringBuilder.append(", installBeginTimestampSeconds=");
        l2 = this.installBeginTimestampSeconds;
        stringBuilder.append(l2);
        stringBuilder.append(", referrerClickTimestampServerSeconds=");
        l2 = this.referrerClickTimestampServerSeconds;
        stringBuilder.append(l2);
        stringBuilder.append(", installBeginTimestampServerSeconds=");
        l2 = this.installBeginTimestampServerSeconds;
        stringBuilder.append(l2);
        stringBuilder.append(", installVersion=");
        string2 = this.installVersion;
        stringBuilder.append(string2);
        stringBuilder.append(", googlePlayInstantParam=");
        boolean bl2 = this.googlePlayInstantParam;
        return AR.a(stringBuilder, bl2, ')');
    }
}

