/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.fragment.app;

import android.view.View;
import androidx.fragment.app.Fragment;

public final class Fragment$c
extends cw0_0 {
    public final /* synthetic */ Fragment a;

    public Fragment$c(Fragment fragment) {
        this.a = fragment;
    }

    public final View b(int n3) {
        Object object = this.a;
        View view = ((Fragment)object).mView;
        if (view != null) {
            return view.findViewById(n3);
        }
        object = tv0_1.b("Fragment ", (Fragment)object, " does not have a view");
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public final boolean c() {
        boolean bl2;
        View view = this.a.mView;
        if (view != null) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        return bl2;
    }
}

