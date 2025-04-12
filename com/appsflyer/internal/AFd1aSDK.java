/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1aSDK$AFa1vSDK;
import com.appsflyer.internal.AFd1gSDK;
import com.appsflyer.internal.AFe1uSDK;
import com.appsflyer.internal.AFe1zSDK;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class AFd1aSDK
extends AFd1gSDK {
    public static final AFd1aSDK$AFa1vSDK AFa1vSDK;
    public static String getRevenue;
    private final AFe1uSDK getMonetizationNetwork;

    static {
        AFd1aSDK$AFa1vSDK aFd1aSDK$AFa1vSDK;
        AFa1vSDK = aFd1aSDK$AFa1vSDK = new AFd1aSDK$AFa1vSDK(null);
        getRevenue = "https://%smonitorsdk.%s/remote-debug/exception-manager";
    }

    public AFd1aSDK(byte[] object, Map map2, int n3) {
        Intrinsics.checkNotNullParameter(object, "");
        super((byte[])object, map2, n3);
        object = (Object)AFe1uSDK.getRevenue;
        this.getMonetizationNetwork = (AFe1uSDK)((Object)object);
    }

    public final AFe1uSDK getCurrencyIso4217Code() {
        return this.getMonetizationNetwork;
    }

    public final String getMonetizationNetwork(String string2) {
        Intrinsics.checkNotNullParameter(string2, "");
        return AFe1zSDK.AFAdRevenueData(string2);
    }

    public final String getRevenue() {
        String string2 = getRevenue;
        String string3 = AppsFlyerLib.getInstance().getHostPrefix();
        String string4 = AFb1rSDK.getRevenue().getHostName();
        Object[] objectArray = new Object[]{string3, string4};
        string2 = String.format(string2, objectArray);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }
}

