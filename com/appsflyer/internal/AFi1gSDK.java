/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

public final class AFi1gSDK {
    public final String AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final long getMonetizationNetwork;
    public final long getRevenue;

    public AFi1gSDK(long l2, long l3, String string2, String string3) {
        this.getMonetizationNetwork = l2;
        this.getRevenue = l3;
        this.AFAdRevenueData = string2;
        this.getCurrencyIso4217Code = string3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof AFi1gSDK;
        if (!object2) {
            return false;
        }
        object = (AFi1gSDK)object;
        long l2 = this.getMonetizationNetwork;
        long l3 = ((AFi1gSDK)object).getMonetizationNetwork;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l2 = this.getRevenue;
        l3 = ((AFi1gSDK)object).getRevenue;
        long l7 = l2 - l3;
        object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        String string2 = this.AFAdRevenueData;
        String string3 = ((AFi1gSDK)object).AFAdRevenueData;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        string2 = this.getCurrencyIso4217Code;
        object = ((AFi1gSDK)object).getCurrencyIso4217Code;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        long l2 = this.getMonetizationNetwork;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^= l3) * 31;
        l3 = this.getRevenue;
        long l4 = l3 >>> n3;
        long l7 = l3 ^ l4;
        int n7 = (int)l7;
        n4 = (n4 + n7) * 31;
        String string2 = this.AFAdRevenueData;
        n3 = 0;
        if (string2 == null) {
            n7 = 0;
            string2 = null;
        } else {
            n7 = string2.hashCode();
        }
        n4 = (n4 + n7) * 31;
        string2 = this.getCurrencyIso4217Code;
        if (string2 != null) {
            n3 = string2.hashCode();
        }
        return n4 + n3;
    }

    public final String toString() {
        long l2 = this.getMonetizationNetwork;
        long l3 = this.getRevenue;
        String string2 = this.AFAdRevenueData;
        String string3 = this.getCurrencyIso4217Code;
        StringBuilder stringBuilder = D70.c(l2, "PlayIntegrityApiData(piaTimestamp=", ", ttrMillis=");
        stringBuilder.append(l3);
        stringBuilder.append(", piaToken=");
        stringBuilder.append(string2);
        return BW0.b(stringBuilder, ", errorCode=", string3, ")");
    }
}

