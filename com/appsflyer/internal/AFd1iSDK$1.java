/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFd1iSDK;
import com.appsflyer.internal.AFd1jSDK;
import com.appsflyer.internal.AFd1nSDK;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class AFd1iSDK$1
extends Lambda
implements Function0 {
    private /* synthetic */ AFd1iSDK getMediationNetwork;

    public AFd1iSDK$1(AFd1iSDK aFd1iSDK) {
        this.getMediationNetwork = aFd1iSDK;
        super(0);
    }

    public final AFd1jSDK getRevenue() {
        AFd1nSDK aFd1nSDK = AFd1iSDK.getCurrencyIso4217Code(this.getMediationNetwork).values();
        Intrinsics.checkNotNullExpressionValue(aFd1nSDK, "");
        AFd1jSDK aFd1jSDK = new AFd1jSDK(aFd1nSDK);
        return aFd1jSDK;
    }

    public final /* synthetic */ Object invoke() {
        return this.getRevenue();
    }
}

