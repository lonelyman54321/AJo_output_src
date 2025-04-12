/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

public final class AFg1oSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;
    final String getMediationNetwork;
    final int getMonetizationNetwork;
    final int getRevenue;

    public AFg1oSDK(int n3, int n4, int n7, int n8, String string2) {
        Intrinsics.checkNotNullParameter(string2, "");
        this.AFAdRevenueData = n3;
        this.getRevenue = n4;
        this.getMonetizationNetwork = n7;
        this.getCurrencyIso4217Code = n8;
        this.getMediationNetwork = string2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof AFg1oSDK;
        if (n3 == 0) {
            return false;
        }
        object = (AFg1oSDK)object;
        n3 = this.AFAdRevenueData;
        int n4 = ((AFg1oSDK)object).AFAdRevenueData;
        if (n3 != n4) {
            return false;
        }
        n3 = this.getRevenue;
        n4 = ((AFg1oSDK)object).getRevenue;
        if (n3 != n4) {
            return false;
        }
        n3 = this.getMonetizationNetwork;
        n4 = ((AFg1oSDK)object).getMonetizationNetwork;
        if (n3 != n4) {
            return false;
        }
        n3 = this.getCurrencyIso4217Code;
        n4 = ((AFg1oSDK)object).getCurrencyIso4217Code;
        if (n3 != n4) {
            return false;
        }
        String string2 = this.getMediationNetwork;
        object = ((AFg1oSDK)object).getMediationNetwork;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.AFAdRevenueData * 31;
        int n4 = this.getRevenue;
        n3 = (n3 + n4) * 31;
        n4 = this.getMonetizationNetwork;
        n3 = (n3 + n4) * 31;
        n4 = this.getCurrencyIso4217Code;
        n3 = (n3 + n4) * 31;
        return this.getMediationNetwork.hashCode() + n3;
    }

    public final String toString() {
        int n3 = this.AFAdRevenueData;
        int n4 = this.getRevenue;
        int n7 = this.getMonetizationNetwork;
        int n8 = this.getCurrencyIso4217Code;
        String string2 = this.getMediationNetwork;
        StringBuilder stringBuilder = fQ2.a("CmpTcfData(policyVersion=", ", gdprApplies=", ", cmpSdkId=", n3, n4);
        m10.a(stringBuilder, n7, ", cmpSdkVersion=", n8, ", tcString=");
        return h30_0.a(stringBuilder, string2, ")");
    }
}

