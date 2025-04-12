/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFd1iSDK;
import com.appsflyer.internal.AFd1kSDK;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class AFd1iSDK$4
extends Lambda
implements Function0 {
    private /* synthetic */ AFd1iSDK AFAdRevenueData;

    public AFd1iSDK$4(AFd1iSDK aFd1iSDK) {
        this.AFAdRevenueData = aFd1iSDK;
        super(0);
    }

    public final ExecutorService getCurrencyIso4217Code() {
        Object object = this.AFAdRevenueData;
        Object[] objectArray = new Object[]{object};
        int n3 = (int)System.currentTimeMillis();
        object = ((AFd1kSDK)AFd1iSDK.getRevenue(objectArray, 83028355, -83028355, n3)).getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(object, "");
        return object;
    }

    public final /* synthetic */ Object invoke() {
        return this.getCurrencyIso4217Code();
    }
}

