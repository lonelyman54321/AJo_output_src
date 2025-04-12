/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

public final class AFe1hSDK {
    final String AFAdRevenueData;
    final String getMediationNetwork;

    public AFe1hSDK(String string2, String string3) {
        String string4 = "";
        Intrinsics.checkNotNullParameter(string2, string4);
        Intrinsics.checkNotNullParameter(string3, string4);
        this.AFAdRevenueData = string2;
        this.getMediationNetwork = string3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AFe1hSDK;
        if (!bl3) {
            return false;
        }
        object = (AFe1hSDK)object;
        String string2 = this.AFAdRevenueData;
        String string3 = ((AFe1hSDK)object).AFAdRevenueData;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.getMediationNetwork;
        object = ((AFe1hSDK)object).getMediationNetwork;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.AFAdRevenueData.hashCode() * 31;
        return this.getMediationNetwork.hashCode() + n3;
    }

    public final String toString() {
        String string2 = this.AFAdRevenueData;
        String string3 = this.getMediationNetwork;
        return uc0_0.a("HostConfig(prefix=", string2, ", host=", string3, ")");
    }
}

