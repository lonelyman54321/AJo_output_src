/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.internal.AFj1zSDK;

public final class H
implements Runnable {
    public final /* synthetic */ AFj1zSDK a;
    public final /* synthetic */ Context b;

    public /* synthetic */ H(AFj1zSDK aFj1zSDK, Context context) {
        this.a = aFj1zSDK;
        this.b = context;
    }

    public final void run() {
        AFj1zSDK aFj1zSDK = this.a;
        Context context = this.b;
        AFj1zSDK.a(aFj1zSDK, context);
    }
}

