/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.a;
import androidx.media3.common.g;
import androidx.media3.common.g$b;
import androidx.media3.common.g$c;
import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

public final class ClippingMediaSource$a
extends QV0 {
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;

    public ClippingMediaSource$a(g g3, long l2, long l3) {
        ClippingMediaSource$a clippingMediaSource$a = this;
        long l4 = l3;
        super(g3);
        int n3 = g3.i();
        boolean bl2 = false;
        int n4 = 1;
        if (n3 == n4) {
            g$c g$c = new g$c();
            long l7 = 0L;
            g$c = g3.n(0, g$c, l7);
            long l8 = l2;
            long l12 = Math.max(l7, l2);
            boolean bl3 = g$c.k;
            if (!bl3 && (bl3 = l12 == l7 ? 0 : (l12 < l7 ? -1 : 1)) && !(bl3 = g$c.h)) {
                ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = new ClippingMediaSource$IllegalClippingException(n4);
                throw clippingMediaSource$IllegalClippingException;
            }
            l8 = Long.MIN_VALUE;
            long l14 = l4 - l8;
            Object object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            l4 = object == false ? g$c.m : Math.max(l7, l4);
            l7 = g$c.m;
            l8 = -9223372036854775807L;
            object = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
            if (object != false) {
                object = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
                long l15 = object > 0 ? l7 : l4;
                long l16 = l12 - l15;
                Object object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                if (object2 <= 0) {
                    l4 = l15;
                } else {
                    ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = new ClippingMediaSource$IllegalClippingException(2, l12, l15);
                    throw clippingMediaSource$IllegalClippingException;
                }
            }
            clippingMediaSource$a.c = l12;
            clippingMediaSource$a.d = l4;
            object = l4 == l8 ? 0 : (l4 < l8 ? -1 : 1);
            l12 = object == false ? l8 : l4 - l12;
            clippingMediaSource$a.e = l12;
            n3 = (int)(g$c.i ? 1 : 0);
            if (n3 != 0 && (object == false || (n3 = (int)(l7 == l8 ? 0 : (l7 < l8 ? -1 : 1))) != 0 && (n3 = (int)(l4 == l7 ? 0 : (l4 < l7 ? -1 : 1))) == 0)) {
                bl2 = true;
            }
            clippingMediaSource$a.f = bl2;
            return;
        }
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = new ClippingMediaSource$IllegalClippingException(0);
        throw clippingMediaSource$IllegalClippingException;
    }

    public final g$b g(int n3, g$b g$b, boolean bl2) {
        Object object = this.b;
        Object object2 = null;
        ((g)object).g(0, g$b, bl2);
        long l2 = g$b.e;
        long l3 = this.c;
        long l4 = l2 - l3;
        l2 = -9223372036854775807L;
        l3 = this.e;
        long l7 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        long l8 = l7 == false ? l2 : (l3 -= l4);
        object2 = g$b.a;
        Object object3 = g$b.b;
        a a2 = androidx.media3.common.a.g;
        object = g$b;
        g$b.j(object2, object3, 0, l8, l4, a2, false);
        return g$b;
    }

    public final g$c n(int n3, g$c g$c, long l2) {
        long l3;
        g g3 = this.b;
        g3.n(0, g$c, 0L);
        l2 = g$c.p;
        long l4 = this.c;
        g$c.p = l2 += l4;
        g$c.m = l2 = this.e;
        n3 = (int)(this.f ? 1 : 0);
        g$c.i = n3;
        l2 = g$c.l;
        long l7 = -9223372036854775807L;
        n3 = (int)(l2 == l7 ? 0 : (l2 < l7 ? -1 : 1));
        if (n3 != 0) {
            g$c.l = l2 = Math.max(l2, l4);
            long l8 = this.d;
            long l12 = l8 - l7;
            n3 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1));
            if (n3 != 0) {
                l2 = Math.min(l2, l8);
            }
            g$c.l = l2 -= l4;
        }
        l2 = gz3.T(l4);
        l4 = g$c.e;
        long l14 = l4 - l7;
        n3 = (int)(l14 == 0L ? 0 : (l14 < 0L ? -1 : 1));
        if (n3 != 0) {
            g$c.e = l4 += l2;
        }
        if ((n3 = (int)((l3 = (l4 = g$c.f) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1))) != 0) {
            g$c.f = l4 += l2;
        }
        return g$c;
    }
}

