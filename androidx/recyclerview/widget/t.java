/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.s;

public abstract class t {
    public final RecyclerView$o a;
    public int b = -1 << -1;
    public final Rect c;

    public t(RecyclerView$o recyclerView$o) {
        Rect rect;
        this.c = rect = new Rect();
        this.a = recyclerView$o;
    }

    public static t a(RecyclerView$o object, int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
                s s7 = new t((RecyclerView$o)object);
                return s7;
            }
            object = new IllegalArgumentException("invalid orientation");
            throw object;
        }
        r r5 = new t((RecyclerView$o)object);
        return r5;
    }

    public abstract int b(View var1);

    public abstract int c(View var1);

    public abstract int d(View var1);

    public abstract int e(View var1);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        int n3 = -1 << -1;
        int n4 = this.b;
        if (n3 == n4) {
            n3 = 0;
        } else {
            n3 = this.l();
            n4 = this.b;
            n3 -= n4;
        }
        return n3;
    }

    public abstract int n(View var1);

    public abstract int o(View var1);

    public abstract void p(int var1);
}

