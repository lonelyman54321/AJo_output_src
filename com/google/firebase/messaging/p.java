/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.firebase.messaging.WithinAppServiceConnection$BindRequest;

public final class p
implements Runnable {
    public final /* synthetic */ WithinAppServiceConnection$BindRequest a;

    public /* synthetic */ p(WithinAppServiceConnection$BindRequest withinAppServiceConnection$BindRequest) {
        this.a = withinAppServiceConnection$BindRequest;
    }

    public final void run() {
        WithinAppServiceConnection$BindRequest.b(this.a);
    }
}

