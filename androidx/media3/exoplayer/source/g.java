/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.source.i$a;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.r;

public final class g
implements androidx.media3.exoplayer.source.i,
i$a {
    public final j$b a;
    public final long b;
    public final Cj0 c;
    public j d;
    public androidx.media3.exoplayer.source.i e;
    public i$a f;
    public long g;

    public g(j$b j$b, Cj0 cj0, long l2) {
        this.a = j$b;
        this.c = cj0;
        this.b = l2;
        this.g = -9223372036854775807L;
    }

    public final boolean a(i i3) {
        boolean bl2;
        androidx.media3.exoplayer.source.i i8 = this.e;
        if (i8 != null && (bl2 = i8.a(i3))) {
            bl2 = true;
        } else {
            bl2 = false;
            i3 = null;
        }
        return bl2;
    }

    public final long b(DF0[] dF0Array, boolean[] blArray, VR2[] vR2Array, boolean[] blArray2, long l2) {
        long l3;
        long l4;
        long l7;
        g g3 = this;
        long l8 = this.g;
        long l12 = -9223372036854775807L;
        long l14 = l8 - l12;
        Object object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        long l15 = object != false && (l7 = (l4 = l2 - (l3 = this.b)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false ? l8 : l2;
        g3.g = l12;
        androidx.media3.exoplayer.source.i i3 = g3.e;
        return i3.b(dF0Array, blArray, vR2Array, blArray2, l15);
    }

    public final void c(androidx.media3.exoplayer.source.i object) {
        object = this.f;
        object.c(this);
    }

    public final long d() {
        androidx.media3.exoplayer.source.i i3 = this.e;
        return i3.d();
    }

    public final long e(long l2, ex2_0 ex2_02) {
        androidx.media3.exoplayer.source.i i3 = this.e;
        return i3.e(l2, ex2_02);
    }

    public final long f(long l2) {
        androidx.media3.exoplayer.source.i i3 = this.e;
        return i3.f(l2);
    }

    public final long g() {
        androidx.media3.exoplayer.source.i i3 = this.e;
        return i3.g();
    }

    public final void h(r object) {
        object = (androidx.media3.exoplayer.source.i)object;
        object = this.f;
        object.h(this);
    }

    public final void i() {
        Object object = this.e;
        if (object != null) {
            object.i();
        } else {
            object = this.d;
            if (object != null) {
                object.l();
            }
        }
    }

    public final boolean isLoading() {
        boolean bl2;
        androidx.media3.exoplayer.source.i i3 = this.e;
        if (i3 != null && (bl2 = i3.isLoading())) {
            bl2 = true;
        } else {
            bl2 = false;
            i3 = null;
        }
        return bl2;
    }

    public final void j(j$b object) {
        long l2 = this.g;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) {
            l2 = this.b;
        }
        Object object3 = this.d;
        object3.getClass();
        Cj0 cj0 = this.c;
        this.e = object = object3.n((j$b)object, cj0, l2);
        object3 = this.f;
        if (object3 != null) {
            object.k(this, l2);
        }
    }

    public final void k(i$a object, long l2) {
        this.f = object;
        object = this.e;
        if (object != null) {
            l2 = this.g;
            long l3 = -9223372036854775807L;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
                l2 = this.b;
            }
            object.k(this, l2);
        }
    }

    public final sp3 l() {
        androidx.media3.exoplayer.source.i i3 = this.e;
        return i3.l();
    }

    public final void m() {
        Object object = this.e;
        if (object != null) {
            object = this.d;
            object.getClass();
            object = (j)object;
            androidx.media3.exoplayer.source.i i3 = this.e;
            object.f(i3);
        }
    }

    public final long o() {
        androidx.media3.exoplayer.source.i i3 = this.e;
        return i3.o();
    }

    public final void p(long l2, boolean bl2) {
        androidx.media3.exoplayer.source.i i3 = this.e;
        i3.p(l2, bl2);
    }

    public final void q(long l2) {
        androidx.media3.exoplayer.source.i i3 = this.e;
        i3.q(l2);
    }
}

