/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFc1hSDK;
import com.appsflyer.internal.AFc1oSDK;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AFc1oSDK$AFa1uSDK {
    private AFc1oSDK$AFa1uSDK() {
    }

    public /* synthetic */ AFc1oSDK$AFa1uSDK(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static AFc1oSDK AFAdRevenueData(AFa1oSDK object) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((AFa1oSDK)object).getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        AFc1oSDK aFc1oSDK = new AFc1oSDK((Map)object, null, 2, null);
        return aFc1oSDK;
    }

    public static AFc1oSDK getCurrencyIso4217Code(AFc1hSDK aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AFc1oSDK aFc1oSDK = new AFc1oSDK(linkedHashMap, aFc1hSDK, null);
        return aFc1oSDK;
    }
}

