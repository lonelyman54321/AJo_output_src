/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFd1uSDK;
import com.appsflyer.internal.AFh1mSDK;

public final class m
implements Runnable {
    public final /* synthetic */ AFd1uSDK a;
    public final /* synthetic */ AFh1mSDK b;

    public /* synthetic */ m(AFd1uSDK aFd1uSDK, AFh1mSDK aFh1mSDK) {
        this.a = aFd1uSDK;
        this.b = aFh1mSDK;
    }

    public final void run() {
        AFd1uSDK aFd1uSDK = this.a;
        AFh1mSDK aFh1mSDK = this.b;
        AFd1uSDK.a(aFd1uSDK, aFh1mSDK);
    }
}

