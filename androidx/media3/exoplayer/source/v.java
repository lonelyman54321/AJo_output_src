/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.source.i$a;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.v$a;

public final class v
implements androidx.media3.exoplayer.source.i,
i$a {
    public final androidx.media3.exoplayer.source.i a;
    public final long b;
    public i$a c;

    public v(androidx.media3.exoplayer.source.i i3, long l2) {
        this.a = i3;
        this.b = l2;
    }

    public final boolean a(i i3) {
        long l2;
        long l3;
        float f5;
        androidx.media3.exoplayer.i$a i$a = new Object();
        i$a.b = f5 = i3.b;
        i$a.c = l3 = i3.c;
        l3 = this.b;
        i$a.a = l2 = i3.a - l3;
        i3 = new i(i$a);
        return this.a.a(i3);
    }

    public final long b(DF0[] dF0Array, boolean[] blArray, VR2[] vR2Array, boolean[] blArray2, long l2) {
        int n3;
        DF0[] dF0Array2;
        v v4 = this;
        VR2[] vR2Array2 = vR2Array;
        int n4 = vR2Array.length;
        VR2[] vR2Array3 = new VR2[n4];
        int n7 = 0;
        int n8 = 0;
        androidx.media3.exoplayer.source.i i3 = null;
        while (true) {
            int n10 = vR2Array2.length;
            VR2 vR2 = null;
            if (n8 >= n10) break;
            dF0Array2 = (DF0[])vR2Array2[n8];
            if (dF0Array2 != null) {
                vR2 = dF0Array2.a;
            }
            vR2Array3[n8] = vR2;
            ++n8;
        }
        long l3 = v4.b;
        long l4 = l2 - l3;
        i3 = v4.a;
        dF0Array2 = dF0Array;
        Object object = blArray;
        Object object2 = vR2Array3;
        long l7 = i3.b(dF0Array, blArray, vR2Array3, blArray2, l4);
        while (n7 < (n3 = vR2Array2.length)) {
            object = vR2Array3[n7];
            if (object == null) {
                vR2Array2[n7] = null;
            } else {
                object2 = vR2Array2[n7];
                if (object2 == null || (object2 = ((v$a)object2).a) != object) {
                    vR2Array2[n7] = object2 = new v$a((VR2)object, l3);
                }
            }
            ++n7;
        }
        return l7 + l3;
    }

    public final void c(androidx.media3.exoplayer.source.i object) {
        object = this.c;
        object.getClass();
        object.c(this);
    }

    public final long d() {
        long l2;
        androidx.media3.exoplayer.source.i i3 = this.a;
        long l3 = i3.d();
        long l4 = l3 - (l2 = Long.MIN_VALUE);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            l2 = this.b + l3;
        }
        return l2;
    }

    public final long e(long l2, ex2_0 ex2_02) {
        long l3 = this.b;
        return this.a.e(l2 -= l3, ex2_02) + l3;
    }

    public final long f(long l2) {
        long l3 = this.b;
        return this.a.f(l2 -= l3) + l3;
    }

    public final long g() {
        long l2;
        androidx.media3.exoplayer.source.i i3 = this.a;
        long l3 = i3.g();
        long l4 = l3 - (l2 = -9223372036854775807L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            l2 = this.b + l3;
        }
        return l2;
    }

    public final void h(r object) {
        object = (androidx.media3.exoplayer.source.i)object;
        object = this.c;
        object.getClass();
        object.h(this);
    }

    public final void i() {
        this.a.i();
    }

    public final boolean isLoading() {
        return this.a.isLoading();
    }

    public final void k(i$a i$a, long l2) {
        this.c = i$a;
        long l3 = this.b;
        this.a.k(this, l2 -= l3);
    }

    public final sp3 l() {
        return this.a.l();
    }

    public final long o() {
        long l2;
        androidx.media3.exoplayer.source.i i3 = this.a;
        long l3 = i3.o();
        long l4 = l3 - (l2 = Long.MIN_VALUE);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            l2 = this.b + l3;
        }
        return l2;
    }

    public final void p(long l2, boolean bl2) {
        long l3 = this.b;
        this.a.p(l2 -= l3, bl2);
    }

    public final void q(long l2) {
        long l3 = this.b;
        this.a.q(l2 -= l3);
    }
}

