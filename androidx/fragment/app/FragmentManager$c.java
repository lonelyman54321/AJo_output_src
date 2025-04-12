/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 */
package androidx.fragment.app;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.fragment.app.FragmentManager;

public final class FragmentManager$c
implements fo1_0 {
    public final /* synthetic */ FragmentManager a;

    public FragmentManager$c(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final void a(Menu menu2) {
        this.a.q(menu2);
    }

    public final void b(Menu menu2) {
        this.a.t(menu2);
    }

    public final boolean c(MenuItem menuItem) {
        return this.a.p(menuItem);
    }

    public final void d(Menu menu2, MenuInflater menuInflater) {
        this.a.k(menu2, menuInflater);
    }
}

