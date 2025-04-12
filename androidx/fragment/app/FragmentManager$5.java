/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.FragmentManager;

class FragmentManager$5
implements Runnable {
    public final /* synthetic */ FragmentManager a;

    public FragmentManager$5(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final void run() {
        this.a.z(true);
    }
}

