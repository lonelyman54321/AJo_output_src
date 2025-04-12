/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.Fragment;

public final class Fragment$e
implements NX0 {
    public final /* synthetic */ Fragment a;

    public Fragment$e(Fragment fragment) {
        this.a = fragment;
    }

    public final Object apply(Object object) {
        object = (Void)object;
        object = this.a;
        Object object2 = ((Fragment)object).mHost;
        boolean bl2 = object2 instanceof O3;
        if (bl2) {
            object2 = (O3)object2;
            object = object2.getActivityResultRegistry();
        } else {
            object = ((Fragment)object).requireActivity().getActivityResultRegistry();
        }
        return object;
    }
}

