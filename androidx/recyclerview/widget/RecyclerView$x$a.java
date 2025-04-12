/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 */
package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$ViewFlinger;

public final class RecyclerView$x$a {
    public int a;
    public int b;
    public int c;
    public int d;
    public Interpolator e;
    public boolean f;

    public final void a(RecyclerView object) {
        int n3 = this.d;
        if (n3 >= 0) {
            this.d = -1;
            ((RecyclerView)object).jumpToPositionForSmoothScroller(n3);
            this.f = false;
            return;
        }
        n3 = (int)(this.f ? 1 : 0);
        if (n3 != 0) {
            int n4;
            Interpolator interpolator2 = this.e;
            int n7 = 1;
            if (interpolator2 != null && (n4 = this.c) < n7) {
                object = new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                throw object;
            }
            n4 = this.c;
            if (n4 >= n7) {
                object = ((RecyclerView)object).mViewFlinger;
                n7 = this.a;
                int n8 = this.b;
                ((RecyclerView$ViewFlinger)object).c(n7, n8, interpolator2, n4);
                this.f = false;
            } else {
                object = new IllegalStateException("Scroll duration must be a positive number");
                throw object;
            }
        }
    }

    public final void b(int n3, int n4, Interpolator interpolator2, int n7) {
        this.a = n3;
        this.b = n4;
        this.c = n7;
        this.e = interpolator2;
        this.f = true;
    }
}

