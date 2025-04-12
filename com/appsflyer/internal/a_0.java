/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.AFb1rSDK;

/*
 * Renamed from com.appsflyer.internal.a
 */
public final class a_0
implements Runnable {
    public final /* synthetic */ AFb1rSDK a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ a_0(AFb1rSDK aFb1rSDK, Context context, Intent intent) {
        this.a = aFb1rSDK;
        this.b = context;
        this.c = intent;
    }

    public final void run() {
        Context context = this.b;
        Intent intent = this.c;
        AFb1rSDK.f(this.a, context, intent);
    }
}

