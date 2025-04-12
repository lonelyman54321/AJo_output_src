/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFf1pSDK;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

final class AFf1pSDK$5
extends Lambda
implements Function0 {
    final /* synthetic */ AFf1pSDK this$0;

    public AFf1pSDK$5(AFf1pSDK aFf1pSDK) {
        this.this$0 = aFf1pSDK;
        super(0);
    }

    public final Long invoke() {
        Object object = AFf1pSDK.AFAdRevenueData(this.this$0);
        String string2 = "com.appsflyer.fetch_ids.timeout";
        long l2 = (object = ((AFd1qSDK)object).getRevenue(string2)) != null && (object = StringsKt.l0((String)object)) != null ? (Long)object : 1000L;
        return l2;
    }
}

