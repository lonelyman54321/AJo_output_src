/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.Fragment;

public final class FragmentManager$g
implements uW0 {
    public final /* synthetic */ Fragment a;

    public FragmentManager$g(Fragment fragment) {
        this.a = fragment;
    }

    public final void a(Fragment fragment) {
        this.a.onAttachFragment(fragment);
    }
}

