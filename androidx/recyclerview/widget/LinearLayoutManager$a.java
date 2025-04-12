/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.t;

public final class LinearLayoutManager$a {
    public t a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public LinearLayoutManager$a() {
        this.d();
    }

    public final void a() {
        int n3 = this.d;
        if (n3 != 0) {
            t t3 = this.a;
            n3 = t3.g();
        } else {
            t t4 = this.a;
            n3 = t4.k();
        }
        this.c = n3;
    }

    public final void b(int n3, View view) {
        int n4 = this.d;
        if (n4 != 0) {
            int n7 = this.a.b(view);
            t t3 = this.a;
            this.c = n4 = t3.m() + n7;
        } else {
            int n8;
            t t4 = this.a;
            this.c = n8 = t4.e(view);
        }
        this.b = n3;
    }

    public final void c(int n3, View object) {
        t t3 = this.a;
        int n4 = t3.m();
        if (n4 >= 0) {
            this.b(n3, (View)object);
            return;
        }
        this.b = n3;
        n3 = (int)(this.d ? 1 : 0);
        if (n3 != 0) {
            t t4 = this.a;
            n3 = t4.g() - n4;
            n4 = this.a.b((View)object);
            n3 -= n4;
            t3 = this.a;
            this.c = n4 = t3.g() - n3;
            if (n3 > 0) {
                n4 = this.a.c((View)object);
                int n7 = this.c - n4;
                t3 = this.a;
                n4 = t3.k();
                t t7 = this.a;
                int n8 = Math.min(t7.e((View)object) - n4, 0) + n4;
                if ((n7 -= n8) < 0) {
                    n8 = this.c;
                    n4 = -n7;
                    this.c = n3 = Math.min(n3, n4) + n8;
                }
            }
        } else {
            t t9 = this.a;
            n3 = t9.e((View)object);
            t t12 = this.a;
            int n10 = t12.k();
            n10 = n3 - n10;
            this.c = n3;
            if (n10 > 0) {
                t t14 = this.a;
                int n14 = t14.c((View)object) + n3;
                t9 = this.a;
                n3 = t9.g() - n4;
                t3 = this.a;
                int n15 = t3.b((View)object);
                n3 -= n15;
                object = this.a;
                n15 = ((t)object).g();
                if ((n15 = n15 - (n3 = Math.min(0, n3)) - n14) < 0) {
                    n3 = this.c;
                    n15 = -n15;
                    n15 = Math.min(n10, n15);
                    this.c = n3 -= n15;
                }
            }
        }
    }

    public final void d() {
        this.b = -1;
        this.c = -1 << -1;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AnchorInfo{mPosition=");
        int bl2 = this.b;
        stringBuilder.append(bl2);
        stringBuilder.append(", mCoordinate=");
        int n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", mLayoutFromEnd=");
        boolean bl3 = this.d;
        stringBuilder.append(bl3);
        stringBuilder.append(", mValid=");
        boolean bl4 = this.e;
        return AR.a(stringBuilder, bl4, '}');
    }
}

