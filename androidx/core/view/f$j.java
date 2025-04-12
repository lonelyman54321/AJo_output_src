/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.WindowInsets
 */
package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.f;
import androidx.core.view.f$i;
import androidx.core.view.f$l;

public final class f$j
extends f$i {
    public static final f q;

    static {
        WindowInsets windowInsets = LG3.a();
        q = androidx.core.view.f.h(null, windowInsets);
    }

    public f$j(f f5, WindowInsets windowInsets) {
        super(f5, windowInsets);
    }

    public final void d(View view) {
    }

    public ei1 f(int n3) {
        WindowInsets windowInsets = this.c;
        n3 = f$l.a(n3);
        return ei1.c(KG3.a(windowInsets, n3));
    }

    public boolean o(int n3) {
        WindowInsets windowInsets = this.c;
        n3 = f$l.a(n3);
        return MG3.a(windowInsets, n3);
    }
}

