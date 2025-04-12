/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.app;

import androidx.appcompat.app.AppCompatDelegateImpl;

class AppCompatDelegateImpl$2
implements Runnable {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public AppCompatDelegateImpl$2(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    public final void run() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.a;
        int n3 = appCompatDelegateImpl.q0 & 1;
        if (n3 != 0) {
            appCompatDelegateImpl.J(0);
        }
        if ((n3 = appCompatDelegateImpl.q0 & 0x1000) != 0) {
            n3 = 108;
            appCompatDelegateImpl.J(n3);
        }
        appCompatDelegateImpl.p0 = false;
        appCompatDelegateImpl.q0 = 0;
    }
}

