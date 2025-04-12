/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.constants;

public final class AnalyticsKeys {
    public static final int $stable = 0;
    public static final String CONTAINS_STORE = "contains_store";
    public static final String GTM_V5_STORE_TYPE = "store_type";
    public static final AnalyticsKeys INSTANCE;
    public static final String LOGIN_STATUS = "LoginStatus";
    public static final String SOURCE = "Source";

    static {
        AnalyticsKeys analyticsKeys;
        INSTANCE = analyticsKeys = new AnalyticsKeys();
    }

    private AnalyticsKeys() {
    }
}

