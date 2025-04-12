/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaItem$b;
import androidx.media3.common.g;
import androidx.media3.common.g$c;
import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import androidx.media3.exoplayer.source.ClippingMediaSource$a;
import androidx.media3.exoplayer.source.b;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.w;
import java.util.ArrayList;

public final class ClippingMediaSource
extends w {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ArrayList q;
    public final g$c r;
    public ClippingMediaSource$a s;
    public ClippingMediaSource$IllegalClippingException t;
    public long u;
    public long v;

    public ClippingMediaSource(j object, long l2, long l3, boolean bl2, boolean bl3, boolean bl4) {
        object.getClass();
        super((j)object);
        long l4 = 0L;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (l7 >= 0) {
            l7 = 1;
        } else {
            l7 = 0;
            object = null;
        }
        ct3.a((boolean)l7);
        this.l = l2;
        this.m = l3;
        this.n = bl2;
        this.o = bl3;
        this.p = bl4;
        object = new ArrayList();
        this.q = object;
        this.r = object = new g$c();
    }

    public final void B(g g3) {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.t;
        if (clippingMediaSource$IllegalClippingException != null) {
            return;
        }
        this.D(g3);
    }

    public final void D(g g3) {
        Object object;
        long l2;
        boolean bl2;
        ClippingMediaSource clippingMediaSource = this;
        int n3 = 0;
        Object object2 = this.r;
        g3.o(0, (g$c)object2);
        long l3 = ((g$c)object2).p;
        Object object3 = this.s;
        ArrayList arrayList = this.q;
        long l4 = this.m;
        long l7 = Long.MIN_VALUE;
        if (object3 != null && !(bl2 = arrayList.isEmpty()) && !(bl2 = this.o)) {
            l2 = this.u - l3;
            object = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
            if (object != false) {
                l4 = this.v;
                l7 = l4 - l3;
            }
            l4 = l7;
            l3 = l2;
        } else {
            long l8;
            long l12;
            bl2 = clippingMediaSource.p;
            l2 = clippingMediaSource.l;
            if (bl2) {
                l12 = ((g$c)object2).l;
                l2 += l12;
                l12 += l4;
            } else {
                l12 = l4;
            }
            clippingMediaSource.u = l8 = l3 + l2;
            object = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
            if (object != false) {
                l7 = l3 + l12;
            }
            clippingMediaSource.v = l7;
            object = arrayList.size();
            for (n3 = 0; n3 < object; ++n3) {
                object3 = (b)arrayList.get(n3);
                l3 = clippingMediaSource.u;
                l4 = clippingMediaSource.v;
                ((b)object3).e = l3;
                ((b)object3).f = l4;
            }
            l3 = l2;
            l4 = l12;
        }
        object3 = object2;
        try {
            object2 = new ClippingMediaSource$a(g3, l3, l4);
        }
        catch (ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException) {
            clippingMediaSource.t = clippingMediaSource$IllegalClippingException;
            for (n3 = 0; n3 < (object = (Object)arrayList.size()); ++n3) {
                b b2 = (b)arrayList.get(n3);
                b2.g = object3 = clippingMediaSource.t;
            }
            return;
        }
        clippingMediaSource.s = object2;
        clippingMediaSource.t((g)object2);
    }

    public final void f(i object) {
        ArrayList arrayList = this.q;
        boolean bl2 = arrayList.remove(object);
        ct3.f(bl2);
        object = ((b)object).a;
        j j3 = this.k;
        j3.f((i)object);
        boolean bl3 = arrayList.isEmpty();
        if (bl3 && !(bl3 = this.o)) {
            object = this.s;
            object.getClass();
            object = ((QV0)object).b;
            this.D((g)object);
        }
    }

    public final void l() {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.t;
        if (clippingMediaSource$IllegalClippingException == null) {
            super.l();
            return;
        }
        throw clippingMediaSource$IllegalClippingException;
    }

    public final i n(j$b j$b, Cj0 cj0, long l2) {
        i i3 = this.k.n(j$b, cj0, l2);
        long l3 = this.u;
        long l4 = this.v;
        boolean bl2 = this.n;
        b b2 = new b(i3, bl2, l3, l4);
        this.q.add(b2);
        return b2;
    }

    public final boolean p(MediaItem mediaItem) {
        boolean bl2;
        j j3 = this.k;
        MediaItem$b mediaItem$b = j3.c().e;
        MediaItem$b mediaItem$b2 = mediaItem.e;
        boolean bl3 = mediaItem$b.equals(mediaItem$b2);
        if (bl3 && (bl2 = j3.p(mediaItem))) {
            bl2 = true;
        } else {
            bl2 = false;
            mediaItem = null;
        }
        return bl2;
    }

    public final void u() {
        super.u();
        this.t = null;
        this.s = null;
    }
}

