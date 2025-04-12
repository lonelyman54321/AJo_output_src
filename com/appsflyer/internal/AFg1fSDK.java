/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFg1dSDK;
import com.appsflyer.internal.AFg1gSDK;
import com.appsflyer.internal.AFg1hSDK;
import kotlin.jvm.internal.Intrinsics;

public final class AFg1fSDK
implements AFg1gSDK {
    private final AFg1dSDK getCurrencyIso4217Code;

    public AFg1fSDK(AFg1dSDK aFg1dSDK) {
        Intrinsics.checkNotNullParameter(aFg1dSDK, "");
        this.getCurrencyIso4217Code = aFg1dSDK;
    }

    public final boolean AFAdRevenueData(AFg1hSDK aFg1hSDK) {
        Object object = "";
        Intrinsics.checkNotNullParameter((Object)aFg1hSDK, (String)object);
        boolean bl2 = aFg1hSDK.getRevenue();
        if (bl2) {
            object = this.getCurrencyIso4217Code;
            object.AFAdRevenueData(aFg1hSDK);
        }
        return aFg1hSDK.AFAdRevenueData();
    }
}

