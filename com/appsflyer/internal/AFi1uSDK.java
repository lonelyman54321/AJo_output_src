/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFg1kSDK;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

public final class AFi1uSDK {
    public List AFAdRevenueData;
    public final String component4;
    public final String getCurrencyIso4217Code;
    public long getMediationNetwork;
    public final float getMonetizationNetwork;
    public final int getRevenue;

    public AFi1uSDK(long l2, float f5, List list, int n3, String string2, String string3) {
        String string4 = "";
        Intrinsics.checkNotNullParameter(list, string4);
        Intrinsics.checkNotNullParameter(string2, string4);
        Intrinsics.checkNotNullParameter(string3, string4);
        this.getMediationNetwork = l2;
        this.getMonetizationNetwork = f5;
        this.AFAdRevenueData = list;
        this.getRevenue = n3;
        this.getCurrencyIso4217Code = string2;
        this.component4 = string3;
    }

    public final boolean equals(Object object) {
        float f5;
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null) {
            object3 = object.getClass();
        } else {
            object2 = 0;
            f5 = 0.0f;
            object3 = null;
        }
        object2 = Intrinsics.areEqual(AFi1uSDK.class, object3);
        if (object2 == 0) {
            return false;
        }
        object3 = "";
        Intrinsics.checkNotNull(object, (String)object3);
        object = (AFi1uSDK)object;
        long l2 = this.getMediationNetwork;
        long l3 = ((AFi1uSDK)object).getMediationNetwork;
        object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object2 != 0) {
            return false;
        }
        f5 = this.getMonetizationNetwork;
        float f6 = ((AFi1uSDK)object).getMonetizationNetwork;
        float f7 = f5 - f6;
        object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object2 == 0) {
            object3 = this.AFAdRevenueData;
            Object object4 = ((AFi1uSDK)object).AFAdRevenueData;
            object2 = Intrinsics.areEqual(object3, object4);
            if (object2 == 0) {
                return false;
            }
            object2 = this.getRevenue;
            int n3 = ((AFi1uSDK)object).getRevenue;
            if (object2 != n3) {
                return false;
            }
            object3 = this.getCurrencyIso4217Code;
            object4 = ((AFi1uSDK)object).getCurrencyIso4217Code;
            object2 = Intrinsics.areEqual(object3, object4);
            if (object2 == 0) {
                return false;
            }
            object3 = this.component4;
            object = ((AFi1uSDK)object).component4;
            boolean bl3 = Intrinsics.areEqual(object3, object);
            if (!bl3) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final boolean getCurrencyIso4217Code() {
        AFg1kSDK aFg1kSDK;
        long l2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long l3 = this.getMediationNetwork;
        long l4 = timeUnit.toMillis(l3);
        long l7 = l4 - (l2 = (aFg1kSDK = AFb1rSDK.getRevenue().getMonetizationNetwork().component1()).getCurrencyIso4217Code());
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        return object > 0;
    }

    public final int hashCode() {
        long l2 = this.getMediationNetwork;
        long l3 = l2 >>> 32;
        int n3 = (int)(l2 ^ l3);
        int n4 = 31;
        n3 *= 31;
        n3 = UR0.a(this.getMonetizationNetwork, n3, n4);
        List list = this.AFAdRevenueData;
        n3 = ne_0.a(n3, n4, list);
        int n7 = this.getRevenue;
        n3 = (n3 + n7) * 31;
        n7 = (this.getCurrencyIso4217Code.hashCode() + n3) * 31;
        return this.component4.hashCode() + n7;
    }
}

