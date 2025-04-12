/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

public final class AFd1vSDK$AFa1zSDK {
    public final String AFAdRevenueData;
    public final float getCurrencyIso4217Code;

    public AFd1vSDK$AFa1zSDK(float f5, String string2) {
        this.getCurrencyIso4217Code = f5;
        this.AFAdRevenueData = string2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof AFd1vSDK$AFa1zSDK;
        if (n3 == 0) {
            return false;
        }
        object = (AFd1vSDK$AFa1zSDK)object;
        float f5 = this.getCurrencyIso4217Code;
        float f6 = ((AFd1vSDK$AFa1zSDK)object).getCurrencyIso4217Code;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        String string2 = this.AFAdRevenueData;
        object = ((AFd1vSDK$AFa1zSDK)object).AFAdRevenueData;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        float f5 = this.getCurrencyIso4217Code;
        int n4 = Float.floatToIntBits(f5) * 31;
        String string2 = this.AFAdRevenueData;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return n4 + n3;
    }

    public final String toString() {
        float f5 = this.getCurrencyIso4217Code;
        String string2 = this.AFAdRevenueData;
        StringBuilder stringBuilder = new StringBuilder("BatteryData(level=");
        stringBuilder.append(f5);
        stringBuilder.append(", charging=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

