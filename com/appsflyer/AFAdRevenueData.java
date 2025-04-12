/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

import com.appsflyer.AFLogger;
import com.appsflyer.MediationNetwork;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import java.util.Currency;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class AFAdRevenueData {
    private final String currencyIso4217Code;
    private final MediationNetwork mediationNetwork;
    private final String monetizationNetwork;
    private final double revenue;

    public AFAdRevenueData(String string2, MediationNetwork mediationNetwork, String string3, double d2) {
        String string4 = "";
        Intrinsics.checkNotNullParameter(string2, string4);
        Intrinsics.checkNotNullParameter((Object)mediationNetwork, string4);
        Intrinsics.checkNotNullParameter(string3, string4);
        this.monetizationNetwork = string2;
        this.mediationNetwork = mediationNetwork;
        this.currencyIso4217Code = string3;
        this.revenue = d2;
    }

    private final boolean AFAdRevenueData() {
        String string2;
        try {
            string2 = this.currencyIso4217Code;
        }
        catch (Throwable throwable) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.registerClient;
            AFh1uSDK.w$default(aFLogger, aFh1vSDK, "Currency is not ISO 4217 currency code", false, 4, null);
            return false;
        }
        Currency.getInstance(string2);
        return true;
    }

    public static /* synthetic */ AFAdRevenueData copy$default(AFAdRevenueData aFAdRevenueData, String string2, MediationNetwork object, String string3, double d2, int n3, Object object2) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = aFAdRevenueData.monetizationNetwork;
        }
        if ((n4 = n3 & 2) != 0) {
            object = aFAdRevenueData.mediationNetwork;
        }
        object2 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = aFAdRevenueData.currencyIso4217Code;
        }
        String string4 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            d2 = aFAdRevenueData.revenue;
        }
        object = aFAdRevenueData;
        string3 = string2;
        return aFAdRevenueData.copy(string2, (MediationNetwork)((Object)object2), string4, d2);
    }

    public final boolean areAllFieldsValid() {
        String string2 = this.monetizationNetwork;
        boolean bl2 = b.k(string2);
        boolean bl3 = true;
        if ((bl2 ^= bl3) && (bl2 = this.AFAdRevenueData())) {
            return bl3;
        }
        return false;
    }

    public final String component1() {
        return this.monetizationNetwork;
    }

    public final MediationNetwork component2() {
        return this.mediationNetwork;
    }

    public final String component3() {
        return this.currencyIso4217Code;
    }

    public final double component4() {
        return this.revenue;
    }

    public final AFAdRevenueData copy(String string2, MediationNetwork mediationNetwork, String string3, double d2) {
        Object object = "";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Intrinsics.checkNotNullParameter((Object)mediationNetwork, (String)object);
        Intrinsics.checkNotNullParameter(string3, (String)object);
        object = new AFAdRevenueData(string2, mediationNetwork, string3, d2);
        return object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AFAdRevenueData;
        if (!bl3) {
            return false;
        }
        object = (AFAdRevenueData)object;
        Object object2 = this.monetizationNetwork;
        Object object3 = ((AFAdRevenueData)object).monetizationNetwork;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.mediationNetwork;
        object3 = ((AFAdRevenueData)object).mediationNetwork;
        if (object2 != object3) {
            return false;
        }
        object2 = this.currencyIso4217Code;
        object3 = ((AFAdRevenueData)object).currencyIso4217Code;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        double d2 = this.revenue;
        double d5 = ((AFAdRevenueData)object).revenue;
        int n3 = Double.compare(d2, d5);
        if (n3 != 0) {
            return false;
        }
        return bl2;
    }

    public final String getCurrencyIso4217Code() {
        return this.currencyIso4217Code;
    }

    public final MediationNetwork getMediationNetwork() {
        return this.mediationNetwork;
    }

    public final String getMonetizationNetwork() {
        return this.monetizationNetwork;
    }

    public final double getRevenue() {
        return this.revenue;
    }

    public final int hashCode() {
        int n3 = this.monetizationNetwork.hashCode() * 31;
        int n4 = (((Object)((Object)this.mediationNetwork)).hashCode() + n3) * 31;
        n3 = (this.currencyIso4217Code.hashCode() + n4) * 31;
        long l2 = Double.doubleToLongBits(this.revenue);
        long l3 = l2 >>> 32;
        int n7 = (int)(l2 ^ l3);
        return n3 + n7;
    }

    public final String toString() {
        String string2 = this.monetizationNetwork;
        MediationNetwork mediationNetwork = this.mediationNetwork;
        String string3 = this.currencyIso4217Code;
        double d2 = this.revenue;
        StringBuilder stringBuilder = new StringBuilder("AFAdRevenueData(monetizationNetwork=");
        stringBuilder.append(string2);
        stringBuilder.append(", mediationNetwork=");
        stringBuilder.append((Object)mediationNetwork);
        stringBuilder.append(", currencyIso4217Code=");
        stringBuilder.append(string3);
        stringBuilder.append(", revenue=");
        stringBuilder.append(d2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

