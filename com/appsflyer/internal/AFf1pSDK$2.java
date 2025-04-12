/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFf1pSDK;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AFf1pSDK$2
extends Lambda
implements Function0 {
    final /* synthetic */ AFf1pSDK this$0;

    public AFf1pSDK$2(AFf1pSDK aFf1pSDK) {
        this.this$0 = aFf1pSDK;
        super(0);
    }

    public final Boolean invoke() {
        return Boolean.parseBoolean(AFf1pSDK.AFAdRevenueData(this.this$0).getRevenue("com.appsflyer.enable_instant_plays"));
    }
}

