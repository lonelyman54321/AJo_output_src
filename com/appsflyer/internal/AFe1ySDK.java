/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFd1gSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFe1uSDK;
import com.appsflyer.internal.AFj1jSDK;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AFe1ySDK
extends AFd1gSDK {
    private final AFe1uSDK component3;
    public AFd1qSDK getMonetizationNetwork;
    private final boolean getRevenue;

    public AFe1ySDK(AFd1qSDK aFd1qSDK, byte[] byArray) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(aFd1qSDK, string2);
        Intrinsics.checkNotNullParameter(byArray, string2);
        this(aFd1qSDK, byArray, null, 0, 12, null);
    }

    private AFe1ySDK(AFd1qSDK object, byte[] byArray, Map map2, int n3) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(byArray, string2);
        super(byArray, map2, n3);
        this.getMonetizationNetwork = object;
        object = AFe1uSDK.getCurrencyIso4217Code;
        this.component3 = object;
    }

    public /* synthetic */ AFe1ySDK(AFd1qSDK aFd1qSDK, byte[] byArray, Map map2, int n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 4;
        if (n7 != 0) {
            map2 = null;
        }
        if ((n4 &= 8) != 0) {
            n3 = 2000;
        }
        this(aFd1qSDK, byArray, map2, n3);
    }

    public final AFe1uSDK getCurrencyIso4217Code() {
        return this.component3;
    }

    public final boolean getMediationNetwork() {
        return this.getRevenue;
    }

    public final String getMonetizationNetwork(String string2) {
        Intrinsics.checkNotNullParameter(string2, "");
        StringBuilder stringBuilder = new StringBuilder("[RD]: ");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final String getRevenue() {
        Object object = this.getMonetizationNetwork;
        AFj1jSDK aFj1jSDK = new AFj1jSDK((AFd1qSDK)object, null, 2, null);
        object = aFj1jSDK.AFAdRevenueData;
        String string2 = AFj1jSDK.component2;
        object = object.getMonetizationNetwork(string2);
        return aFj1jSDK.getMediationNetwork((String)object);
    }
}

