/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsets
 */
package androidx.core.view;

import android.view.WindowInsets;
import androidx.core.view.f;
import androidx.core.view.f$f;

public class f$g
extends f$f {
    public ei1 m = null;

    public f$g(f f5, WindowInsets windowInsets) {
        super(f5, windowInsets);
    }

    public f b() {
        WindowInsets windowInsets = this.c.consumeStableInsets();
        return androidx.core.view.f.h(null, windowInsets);
    }

    public f c() {
        WindowInsets windowInsets = this.c.consumeSystemWindowInsets();
        return androidx.core.view.f.h(null, windowInsets);
    }

    public final ei1 h() {
        ei1 ei12 = this.m;
        if (ei12 == null) {
            ei12 = this.c;
            int n3 = ei12.getStableInsetLeft();
            int n4 = ei12.getStableInsetTop();
            int n7 = ei12.getStableInsetRight();
            int n8 = ei12.getStableInsetBottom();
            this.m = ei12 = ei1.b(n3, n4, n7, n8);
        }
        return this.m;
    }

    public boolean m() {
        return this.c.isConsumed();
    }

    public void r(ei1 ei12) {
        this.m = ei12;
    }
}

