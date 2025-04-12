/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.CustomThreadFactory;

public final class a
implements Runnable {
    public final /* synthetic */ CustomThreadFactory a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ a(CustomThreadFactory customThreadFactory, Runnable runnable2) {
        this.a = customThreadFactory;
        this.b = runnable2;
    }

    public final void run() {
        CustomThreadFactory customThreadFactory = this.a;
        Runnable runnable2 = this.b;
        CustomThreadFactory.a(customThreadFactory, runnable2);
    }
}

