/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.constants;

import kotlin.jvm.internal.Intrinsics;

public final class AnalyticsValues {
    public static final int $stable = 0;
    public static final String FACEBOOK = "Facebook";
    public static final String FAILURE = "Failure";
    public static final String GOOGLE = "Google";
    public static final String GTM_STORE_TYPE_AJIO = "ajio";
    public static final String GTM_STORE_TYPE_LUXE = "luxe";
    public static final AnalyticsValues INSTANCE;
    public static final String MANUAL = "Manual";
    public static final String SUCCESS = "Success";

    static {
        AnalyticsValues analyticsValues;
        INSTANCE = analyticsValues = new AnalyticsValues();
    }

    private AnalyticsValues() {
    }

    public final String getStoreType() {
        ld3_2 ld3_22;
        String string2;
        String string3 = od3_2.a();
        boolean bl2 = Intrinsics.areEqual(string3, string2 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId());
        if (bl2) {
            return ld3_22.getStoreId();
        }
        bl2 = og1_1.c();
        string3 = bl2 ? GTM_STORE_TYPE_LUXE : GTM_STORE_TYPE_AJIO;
        return string3;
    }
}

