/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.fragment.app;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment$i;
import androidx.lifecycle.A;

public final class Fragment$b
extends Fragment$i {
    public final /* synthetic */ Fragment a;

    public Fragment$b(Fragment fragment) {
        this.a = fragment;
    }

    public final void a() {
        Fragment fragment = this.a;
        fragment.mSavedStateRegistryController.a();
        A.b(fragment);
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle != null) {
            String string2 = "registryState";
            bundle = bundle.getBundle(string2);
        } else {
            bundle = null;
        }
        fragment.mSavedStateRegistryController.b(bundle);
    }
}

