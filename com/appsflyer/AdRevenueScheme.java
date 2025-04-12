/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

public final class AdRevenueScheme {
    public static final String AD_TYPE = "ad_type";
    public static final String AD_UNIT = "ad_unit";
    public static final String COUNTRY = "country";
    public static final AdRevenueScheme INSTANCE;
    public static final String PLACEMENT = "placement";

    static {
        AdRevenueScheme adRevenueScheme;
        INSTANCE = adRevenueScheme = new AdRevenueScheme();
    }

    private AdRevenueScheme() {
    }
}

