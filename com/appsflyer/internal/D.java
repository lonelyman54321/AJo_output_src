/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFi1eSDK;
import com.appsflyer.internal.AFj1uSDK;

public final class D
implements Runnable {
    public final /* synthetic */ AFj1uSDK a;
    public final /* synthetic */ AFi1eSDK b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ D(AFj1uSDK aFj1uSDK, AFi1eSDK aFi1eSDK, Runnable runnable2) {
        this.a = aFj1uSDK;
        this.b = aFi1eSDK;
        this.c = runnable2;
    }

    public final void run() {
        AFi1eSDK aFi1eSDK = this.b;
        Runnable runnable2 = this.c;
        AFj1uSDK.e(this.a, aFi1eSDK, runnable2);
    }
}

