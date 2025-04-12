/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFj1uSDK;

public final class C
implements Runnable {
    public final /* synthetic */ AFj1uSDK a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ C(AFj1uSDK aFj1uSDK, Runnable runnable2) {
        this.a = aFj1uSDK;
        this.b = runnable2;
    }

    public final void run() {
        AFj1uSDK aFj1uSDK = this.a;
        Runnable runnable2 = this.b;
        AFj1uSDK.d(aFj1uSDK, runnable2);
    }
}

