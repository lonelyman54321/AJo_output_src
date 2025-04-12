/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFe1fSDK;
import kotlin.jvm.internal.Intrinsics;

public final class AFe1bSDK {
    public final String AFAdRevenueData;
    public final AFe1fSDK getMediationNetwork;
    public final String getMonetizationNetwork;

    public AFe1bSDK(String string2, String string3, AFe1fSDK aFe1fSDK) {
        String string4 = "";
        Intrinsics.checkNotNullParameter(string2, string4);
        Intrinsics.checkNotNullParameter((Object)aFe1fSDK, string4);
        this.AFAdRevenueData = string2;
        this.getMonetizationNetwork = string3;
        this.getMediationNetwork = aFe1fSDK;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AFe1bSDK;
        if (!bl3) {
            return false;
        }
        object = (AFe1bSDK)object;
        Object object2 = this.AFAdRevenueData;
        String string2 = ((AFe1bSDK)object).AFAdRevenueData;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.getMonetizationNetwork;
        string2 = ((AFe1bSDK)object).getMonetizationNetwork;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.getMediationNetwork;
        object = ((AFe1bSDK)object).getMediationNetwork;
        if (object2 != object) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.AFAdRevenueData;
        int n4 = string2.hashCode() * 31;
        String string3 = this.getMonetizationNetwork;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        return ((Object)((Object)this.getMediationNetwork)).hashCode() + n4;
    }

    public final String toString() {
        CharSequence charSequence = this.AFAdRevenueData;
        String string2 = this.getMonetizationNetwork;
        AFe1fSDK aFe1fSDK = this.getMediationNetwork;
        charSequence = og_1.a("HostMeta(name=", (String)charSequence, ", prefix=", string2, ", method=");
        ((StringBuilder)charSequence).append((Object)aFe1fSDK);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

