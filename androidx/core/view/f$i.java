/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsets
 */
package androidx.core.view;

import android.view.WindowInsets;
import androidx.core.view.f;
import androidx.core.view.f$h;

public class f$i
extends f$h {
    public ei1 n = null;
    public ei1 o = null;
    public ei1 p = null;

    public f$i(f f5, WindowInsets windowInsets) {
        super(f5, windowInsets);
    }

    public ei1 g() {
        ei1 ei12 = this.o;
        if (ei12 == null) {
            this.o = ei12 = ei1.c(IG3.a(this.c));
        }
        return this.o;
    }

    public ei1 i() {
        ei1 ei12 = this.n;
        if (ei12 == null) {
            this.n = ei12 = ei1.c(JG3.a(this.c));
        }
        return this.n;
    }

    public ei1 k() {
        ei1 ei12 = this.p;
        if (ei12 == null) {
            this.p = ei12 = ei1.c(GG3.a(this.c));
        }
        return this.p;
    }

    public f l(int n3, int n4, int n7, int n8) {
        WindowInsets windowInsets = HG3.a(this.c, n3, n4, n7, n8);
        return androidx.core.view.f.h(null, windowInsets);
    }

    public void r(ei1 ei12) {
    }
}

