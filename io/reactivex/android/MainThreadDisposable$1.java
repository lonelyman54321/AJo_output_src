/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.android;

import io.reactivex.android.MainThreadDisposable;

class MainThreadDisposable$1
implements Runnable {
    public final /* synthetic */ MainThreadDisposable a;

    public MainThreadDisposable$1(MainThreadDisposable mainThreadDisposable) {
        this.a = mainThreadDisposable;
    }

    public final void run() {
        this.a.a();
    }
}

