/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.internal.AFj1sSDK$AFa1zSDK;
import java.util.Map;
import java.util.Observable;

public abstract class AFj1sSDK
extends Observable {
    final Runnable AFAdRevenueData;
    long component1;
    public AFj1sSDK$AFa1zSDK component2;
    public final String component3;
    public final Map getMediationNetwork;
    public final String getMonetizationNetwork;

    public AFj1sSDK(String string2, String string3, Runnable runnable2) {
        Object object;
        this.getMediationNetwork = object = new Object();
        object = AFj1sSDK$AFa1zSDK.getMediationNetwork;
        this.component2 = object;
        this.AFAdRevenueData = runnable2;
        this.getMonetizationNetwork = string3;
        this.component3 = string2;
    }

    public abstract void getMediationNetwork(Context var1);

    public final void getRevenue() {
        Object object = this.getMediationNetwork;
        String string2 = this.getMonetizationNetwork;
        object.put("source", string2);
        object = this.getMediationNetwork;
        string2 = this.component3;
        object.put("type", string2);
        object = this.getMediationNetwork;
        long l2 = System.currentTimeMillis();
        long l3 = this.component1;
        Long l4 = l2 - l3;
        object.put("latency", l4);
        object = AFj1sSDK$AFa1zSDK.getRevenue;
        this.component2 = object;
        this.setChanged();
        this.notifyObservers();
    }
}

