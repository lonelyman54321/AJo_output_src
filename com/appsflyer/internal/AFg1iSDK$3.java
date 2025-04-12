/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AFg1iSDK$3
extends Lambda
implements Function0 {
    public static final AFg1iSDK$3 getMediationNetwork;

    static {
        AFg1iSDK$3 aFg1iSDK$3;
        getMediationNetwork = aFg1iSDK$3 = new AFg1iSDK$3();
    }

    public AFg1iSDK$3() {
        super(0);
    }

    public final AppsFlyerProperties AFAdRevenueData() {
        return AppsFlyerProperties.getInstance();
    }

    public final /* synthetic */ Object invoke() {
        return this.AFAdRevenueData();
    }
}

