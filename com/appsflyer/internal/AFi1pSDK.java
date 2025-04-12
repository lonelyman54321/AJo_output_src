/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

public final class AFi1pSDK {
    public final String AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final String getMediationNetwork;
    private final boolean getMonetizationNetwork;

    public AFi1pSDK(String string2, String string3, String string4, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "");
        this.AFAdRevenueData = string2;
        this.getMediationNetwork = string3;
        this.getCurrencyIso4217Code = string4;
        this.getMonetizationNetwork = bl2;
    }

    public final boolean getMediationNetwork() {
        return this.getMonetizationNetwork;
    }
}

