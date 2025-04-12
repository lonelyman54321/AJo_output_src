/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFd1iSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFf1aSDK;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class AFd1iSDK$3
extends Lambda
implements Function0 {
    private /* synthetic */ AFd1iSDK getMediationNetwork;

    public AFd1iSDK$3(AFd1iSDK aFd1iSDK) {
        this.getMediationNetwork = aFd1iSDK;
        super(0);
    }

    public final AFf1aSDK getMediationNetwork() {
        Object object = this.getMediationNetwork;
        Object[] objectArray = new Object[]{object};
        int n3 = (int)System.currentTimeMillis();
        object = ((AFd1kSDK)AFd1iSDK.getRevenue(objectArray, 83028355, -83028355, n3)).component2();
        Intrinsics.checkNotNullExpressionValue(object, "");
        return object;
    }

    public final /* synthetic */ Object invoke() {
        return this.getMediationNetwork();
    }
}

