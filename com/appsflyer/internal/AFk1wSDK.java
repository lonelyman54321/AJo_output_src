/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer.internal;

import android.content.Context;
import java.lang.ref.WeakReference;

public final class AFk1wSDK {
    public String getMediationNetwork;
    public final WeakReference getRevenue;

    public AFk1wSDK(Context context) {
        WeakReference<Context> weakReference;
        this.getRevenue = weakReference = new WeakReference<Context>(context);
    }
}

