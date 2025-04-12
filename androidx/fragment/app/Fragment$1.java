/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.Fragment;

class Fragment$1
implements Runnable {
    public final /* synthetic */ Fragment a;

    public Fragment$1(Fragment fragment) {
        this.a = fragment;
    }

    public final void run() {
        this.a.startPostponedEnterTransition();
    }
}

