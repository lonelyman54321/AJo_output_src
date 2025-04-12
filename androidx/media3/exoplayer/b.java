/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.common.d;
import androidx.media3.common.d$a;
import androidx.media3.common.g;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.media3.exoplayer.n;
import androidx.media3.exoplayer.o;
import androidx.media3.exoplayer.o$a;
import androidx.media3.exoplayer.source.j$b;
import java.util.Objects;

public abstract class b
implements n,
o {
    public final Object a;
    public final int b;
    public final HV0 c;
    public uJ2 d;
    public int e;
    public nu2 f;
    public VV g;
    public int h;
    public VR2 i;
    public d[] j;
    public long k;
    public long l;
    public long m;
    public boolean n;
    public boolean o;
    public g p;
    public o$a q;

    public b(int n3) {
        Object object;
        Object object2;
        this.a = object2 = new Object();
        this.b = n3;
        this.c = object;
        this.m = Long.MIN_VALUE;
        this.p = object = androidx.media3.common.g.a;
    }

    public abstract void A();

    public void B(boolean bl2, boolean bl3) {
    }

    public abstract void C(long var1, boolean var3);

    public void D() {
    }

    public void E() {
    }

    public void F() {
    }

    public void G() {
    }

    public void H(d[] dArray, long l2, long l3, j$b j$b) {
    }

    public final int I(HV0 hV0, DecoderInputBuffer object, int n3) {
        VR2 vR2 = this.i;
        vR2.getClass();
        n3 = vR2.f(hV0, (DecoderInputBuffer)object, n3);
        int n4 = -4;
        if (n3 == n4) {
            long l2;
            boolean bl2 = ((fE)object).f(4);
            if (bl2) {
                long l3;
                this.m = l3 = Long.MIN_VALUE;
                bl2 = this.n;
                if (!bl2) {
                    n4 = -3;
                }
                return n4;
            }
            long l4 = ((DecoderInputBuffer)object).f;
            long l7 = this.k;
            ((DecoderInputBuffer)object).f = l4 += l7;
            this.m = l2 = Math.max(this.m, l4);
        } else {
            int n7 = -5;
            if (n3 == n7) {
                object = hV0.b;
                object.getClass();
                long l8 = Long.MAX_VALUE;
                long l12 = ((d)object).t;
                long l14 = l12 == l8 ? 0 : (l12 < l8 ? -1 : 1);
                if (l14 != false) {
                    object = ((d)object).a();
                    l8 = this.k;
                    ((d$a)object).s = l12 += l8;
                    hV0.b = object = ((d$a)object).a();
                }
            }
        }
        return n3;
    }

    public boolean b() {
        return this.h();
    }

    public /* synthetic */ void d() {
    }

    public final void e() {
        int n3 = this.h;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        ct3.f(n4 != 0);
        this.c.a();
        this.h = 0;
        this.i = null;
        this.j = null;
        this.n = false;
        this.A();
    }

    public final int getState() {
        return this.h;
    }

    public final VR2 getStream() {
        return this.i;
    }

    public final boolean h() {
        long l2 = this.m;
        long l3 = Long.MIN_VALUE;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
    }

    public final void i() {
        this.n = true;
    }

    public void j(int n3, Object object) {
    }

    public final void k() {
        VR2 vR2 = this.i;
        vR2.getClass();
        vR2.d();
    }

    public final boolean l() {
        return this.n;
    }

    public final int m() {
        return this.b;
    }

    public final void n(g g3) {
        g g5 = this.p;
        boolean bl2 = Objects.equals(g5, g3);
        if (!bl2) {
            this.p = g3;
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void o(uJ2 uJ22, d[] dArray, VR2 vR2, boolean bl2, boolean bl3, long l2, long l3, j$b j$b) {
        void var15_15;
        b b2 = this;
        boolean bl4 = bl2;
        long l4 = l2;
        int bl5 = this.h;
        int n3 = 1;
        if (bl5 == 0) {
            boolean bl6 = true;
        } else {
            boolean bl7 = false;
        }
        ct3.f((boolean)var15_15);
        b2.d = uJ22;
        b2.h = n3;
        boolean bl8 = bl3;
        this.B(bl4, bl3);
        this.p(dArray, vR2, l2, l3, j$b);
        b2.n = false;
        b2.l = l4;
        b2.m = l4;
        this.C(l4, bl4);
    }

    public final void p(d[] dArray, VR2 vR2, long l2, long l3, j$b j$b) {
        boolean bl2 = this.n ^ true;
        ct3.f(bl2);
        this.i = vR2;
        long l4 = this.m;
        long l7 = Long.MIN_VALUE;
        long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (l8 == false) {
            this.m = l2;
        }
        this.j = dArray;
        this.k = l3;
        l7 = l2;
        this.H(dArray, l2, l3, j$b);
    }

    public final void r(int n3, nu2 nu22, VV vV) {
        this.e = n3;
        this.f = nu22;
        this.g = vV;
    }

    public final void release() {
        int n3 = this.h;
        n3 = n3 == 0 ? 1 : 0;
        ct3.f(n3 != 0);
        this.D();
    }

    public final void reset() {
        int n3 = this.h;
        n3 = n3 == 0 ? 1 : 0;
        ct3.f(n3 != 0);
        this.c.a();
        this.E();
    }

    public final b s() {
        return this;
    }

    public final void start() {
        int n3 = this.h;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        ct3.f(n4 != 0);
        this.h = 2;
        this.F();
    }

    /*
     * WARNING - void declaration
     */
    public final void stop() {
        void var1_4;
        int bl2 = this.h;
        int n3 = 2;
        int n4 = 1;
        if (bl2 == n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        ct3.f((boolean)var1_4);
        this.h = n4;
        this.G();
    }

    public /* synthetic */ void t(float f5, float f6) {
    }

    public int u() {
        return 0;
    }

    public final long v() {
        return this.m;
    }

    public final void w(long l2) {
        this.n = false;
        this.l = l2;
        this.m = l2;
        this.C(l2, false);
    }

    public EL1 x() {
        return null;
    }

    public final ExoPlaybackException y(MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, d d2) {
        return this.z(mediaCodecUtil$DecoderQueryException, d2, false, 4002);
    }

    public final ExoPlaybackException z(Exception exception, d d2, boolean bl2, int n3) {
        int n4;
        d d5;
        b b2;
        block4: {
            boolean bl3;
            b2 = this;
            d5 = d2;
            if (d2 != null && !(bl3 = this.o)) {
                this.o = true;
                bl3 = false;
                try {
                    n4 = this.a(d2) & 7;
                    this.o = false;
                    break block4;
                }
                catch (Throwable throwable) {
                    b2.o = false;
                    throw throwable;
                }
                catch (ExoPlaybackException exoPlaybackException) {
                    b2.o = false;
                }
            }
            n4 = 4;
        }
        String string2 = this.getName();
        int n7 = b2.e;
        int n8 = d5 == null ? 4 : n4;
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(1, exception, n3, string2, n7, d2, n8, bl2);
        return exoPlaybackException;
    }
}

