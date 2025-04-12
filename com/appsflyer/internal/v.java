/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.AFi1eSDK$1;

public final class v
implements Runnable {
    public final /* synthetic */ AFi1eSDK$1 a;
    public final /* synthetic */ InstallReferrerClient b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;

    public /* synthetic */ v(AFi1eSDK$1 var1_1, InstallReferrerClient installReferrerClient, Context context, int n3) {
        this.a = var1_1;
        this.b = installReferrerClient;
        this.c = context;
        this.d = n3;
    }

    public final void run() {
        Context context = this.c;
        int n3 = this.d;
        AFi1eSDK$1 aFi1eSDK$1 = this.a;
        InstallReferrerClient installReferrerClient = this.b;
        AFi1eSDK$1.a(aFi1eSDK$1, installReferrerClient, context, n3);
    }
}

