/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.Fragment;

class Fragment$3
implements Runnable {
    public final /* synthetic */ Fragment a;

    public Fragment$3(Fragment fragment) {
        this.a = fragment;
    }

    public final void run() {
        this.a.callStartTransitionListener(false);
    }
}

