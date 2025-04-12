/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.internal.AFj1rSDK;

public final class A
implements Runnable {
    public final /* synthetic */ AFj1rSDK a;
    public final /* synthetic */ Context b;

    public /* synthetic */ A(AFj1rSDK aFj1rSDK, Context context) {
        this.a = aFj1rSDK;
        this.b = context;
    }

    public final void run() {
        AFj1rSDK aFj1rSDK = this.a;
        Context context = this.b;
        AFj1rSDK.a(aFj1rSDK, context);
    }
}

