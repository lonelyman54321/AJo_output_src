/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

public class AFe1mSDK {
    public boolean AFAdRevenueData;
    private final boolean areAllFieldsValid;
    private final byte[] component1;
    private final boolean component2;
    public int component3;
    private boolean component4;
    final String getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public boolean getMonetizationNetwork;
    final Map getRevenue;

    public AFe1mSDK(String string2, String string3) {
        HashMap hashMap = new HashMap();
        this(string2, null, string3, hashMap, false);
    }

    public AFe1mSDK(String string2, byte[] byArray, String string3, Map map2, boolean bl2) {
        this(string2, byArray, string3, map2, bl2, 0);
    }

    private AFe1mSDK(String string2, byte[] byArray, String string3, Map map2, boolean bl2, byte by2) {
        by2 = 1;
        this.component4 = by2;
        this.getMonetizationNetwork = false;
        this.AFAdRevenueData = by2;
        this.component3 = -1;
        this.getMediationNetwork = string2;
        this.component1 = byArray;
        this.getCurrencyIso4217Code = string3;
        this.getRevenue = map2;
        this.areAllFieldsValid = bl2;
        this.component2 = by2;
    }

    public final boolean AFAdRevenueData() {
        return this.areAllFieldsValid;
    }

    public final boolean component3() {
        return this.AFAdRevenueData;
    }

    public final byte[] getCurrencyIso4217Code() {
        return this.component1;
    }

    public final boolean getMediationNetwork() {
        return this.component4;
    }

    public final boolean getMonetizationNetwork() {
        return this.getMonetizationNetwork;
    }

    public final boolean getRevenue() {
        return this.component2;
    }
}

