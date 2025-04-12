/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;

public final class Fragment$d
implements n {
    public final /* synthetic */ Fragment a;

    public Fragment$d(Fragment fragment) {
        this.a = fragment;
    }

    public final void k(mu1_1 object, i$a i$a) {
        object = i$a.ON_STOP;
        if (i$a == object && (object = this.a.mView) != null) {
            object.cancelPendingInputEvents();
        }
    }
}

