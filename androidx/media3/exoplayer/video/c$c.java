/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Pair
 *  android.view.Surface
 */
package androidx.media3.exoplayer.video;

import android.content.Context;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import androidx.media3.exoplayer.video.VideoSink$a;
import androidx.media3.exoplayer.video.a;
import androidx.media3.exoplayer.video.b;
import androidx.media3.exoplayer.video.b$a;
import androidx.media3.exoplayer.video.b$b;
import androidx.media3.exoplayer.video.c;
import androidx.media3.exoplayer.video.c$d;
import androidx.media3.exoplayer.video.d;
import androidx.media3.exoplayer.video.d$a;
import androidx.media3.exoplayer.video.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class c$c
implements VideoSink,
c$d {
    public final int a;
    public final ArrayList b;
    public final d$a c;
    public androidx.media3.common.d d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public long j;
    public long k;
    public boolean l;
    public boolean m;
    public long n;
    public VideoSink$a o;
    public Executor p;
    public final /* synthetic */ c q;

    public c$c(c object, Context context) {
        long l2;
        this.q = object;
        int n3 = gz3.F(context);
        n3 = n3 != 0 ? 1 : 5;
        this.a = n3;
        object = new ArrayList();
        this.b = object;
        this.c = object = new d$a();
        this.j = l2 = -9223372036854775807L;
        this.k = l2;
        this.o = object = VideoSink$a.a;
        this.p = object = androidx.media3.exoplayer.video.c.p;
    }

    public final void a(wc3_0 wc3_02) {
        VideoSink$a videoSink$a = this.o;
        Executor executor = this.p;
        mv1_0 mv1_02 = new mv1_0(this, videoSink$a, wc3_02);
        executor.execute(mv1_02);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b() {
        boolean bl2 = this.isInitialized();
        if (!bl2) return false;
        long l2 = this.j;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) return false;
        Object object2 = this.q;
        int n3 = ((c)object2).n;
        if (n3 != 0) return false;
        object2 = ((c)object2).d;
        long l7 = ((e)object2).j;
        long l8 = l7 - l3;
        Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object3 == false) return false;
        Object object4 = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1);
        if (object4 < 0) return false;
        return true;
    }

    public final void c() {
        VideoSink$a videoSink$a = this.o;
        Executor executor = this.p;
        wd0_0 wd0_02 = new wd0_0(1, this, videoSink$a);
        executor.execute(wd0_02);
    }

    public final void d() {
        this.q.g.d();
    }

    public final Surface e() {
        ct3.f(this.isInitialized());
        ct3.h(null);
        throw null;
    }

    public final void f() {
        VideoSink$a videoSink$a = this.o;
        Executor executor = this.p;
        Fr fr = new Fr(2, this, videoSink$a);
        executor.execute(fr);
    }

    public final void g(long l2, long l3) {
        c c2;
        try {
            c2 = this.q;
        }
        catch (ExoPlaybackException exoPlaybackException) {
            Object object = this.d;
            if (object == null) {
                object = new androidx.media3.common.d$a();
                androidx.media3.common.d d2 = new androidx.media3.common.d((androidx.media3.common.d$a)object);
                object = d2;
            }
            VideoSink$VideoSinkException videoSink$VideoSinkException = new VideoSink$VideoSinkException(exoPlaybackException, (androidx.media3.common.d)object);
            throw videoSink$VideoSinkException;
        }
        androidx.media3.exoplayer.video.c.a(c2, l2, l3);
    }

    public final void h(long l2, long l3, long l4, long l7) {
        long l8;
        boolean bl2 = this.i;
        long l12 = this.f;
        long l14 = l12 - l3;
        Object object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        boolean bl3 = object != false || (object = (l8 = (l12 = this.g) - l4) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false;
        this.i = bl2 |= bl3;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = l7;
    }

    public final void i() {
        this.q.g.i();
    }

    public final boolean isInitialized() {
        return false;
    }

    public final boolean j(boolean bl2) {
        boolean bl3 = false;
        bl2 = bl2 && (bl2 = this.isInitialized());
        c c2 = this.q;
        a a2 = c2.g;
        if (bl2 && !(bl2 = c2.n)) {
            bl3 = true;
        }
        return a2.a.b(bl3);
    }

    public final boolean k(long l2, boolean bl2, long l3, long l4, b$b b$b) {
        d d2;
        c$c c$c = this;
        b$b b$b2 = b$b;
        Object object = this.q;
        boolean bl3 = this.isInitialized();
        ct3.f(bl3);
        long l7 = this.g;
        l7 = l2 - l7;
        try {
            d2 = ((c)object).c;
        }
        catch (ExoPlaybackException exoPlaybackException) {
            androidx.media3.common.d d5 = c$c.d;
            ct3.h(d5);
            object = new VideoSink$VideoSinkException(exoPlaybackException, d5);
            throw object;
        }
        long l8 = this.e;
        d$a d$a = this.c;
        long l12 = l3;
        int n3 = d2.a(l7, l3, l4, l8, bl2, d$a);
        int n4 = 4;
        if (n3 == n4) {
            return false;
        }
        long l14 = this.h;
        androidx.media3.exoplayer.mediacodec.d d7 = b$b.a;
        b b2 = b$b.c;
        int n7 = b$b.b;
        boolean bl4 = true;
        Object object2 = l7 == l14 ? 0 : (l7 < l14 ? -1 : 1);
        if (object2 < 0 && !bl2) {
            b2.M0(d7, n7);
            return bl4;
        }
        l7 = l3;
        l14 = l4;
        c$c.g(l3, l4);
        n7 = (int)(c$c.m ? 1 : 0);
        e e2 = ((c)object).d;
        if (n7 != 0) {
            long l15;
            long l16;
            long l17 = c$c.n;
            l12 = -9223372036854775807L;
            long l18 = l17 - l12;
            n7 = (int)(l18 == 0L ? 0 : (l18 < 0L ? -1 : 1));
            if (n7 != 0 && ((n7 = ((c)object).n) != 0 || (n7 = (int)((l16 = (l15 = e2.j) - l12) == 0L ? 0 : (l16 < 0L ? -1 : 1))) == 0 || (n7 = (int)(l15 == l17 ? 0 : (l15 < l17 ? -1 : 1))) < 0)) {
                return false;
            }
            this.w();
            c$c.m = false;
            c$c.n = l12;
        }
        ct3.h(null);
        throw null;
    }

    public final void l(Surface surface, A63 a63) {
        int n3;
        c c2 = this.q;
        Object object = c2.m;
        if (object == null || (n3 = (object = (Surface)((Pair)object).first).equals(surface)) == 0 || (n3 = (int)(((A63)(object = (A63)c2.m.second)).equals(a63) ? 1 : 0)) == 0) {
            object = Pair.create((Object)surface, (Object)a63);
            c2.m = object;
            n3 = a63.a;
            int n4 = a63.b;
            c2.c(surface, n3, n4);
        }
    }

    public final void m(androidx.media3.common.d d2) {
        ct3.f(this.isInitialized() ^ true);
        this.q.b(d2);
    }

    public final void n(boolean bl2) {
        this.q.g.a.e = (int)(bl2 ? 1 : 0);
    }

    public final void o() {
        this.q.g.o();
    }

    public final void p(androidx.media3.common.d d2) {
        ct3.f(this.isInitialized());
        d d5 = this.q.c;
        float f5 = d2.x;
        d5.g(f5);
        boolean bl2 = true;
        this.d = d2;
        Object object = this.l;
        long l2 = -9223372036854775807L;
        boolean bl3 = false;
        if (!object) {
            this.w();
            this.l = bl2;
            this.m = false;
            this.n = l2;
        } else {
            long l3;
            long l4 = this.k;
            long l7 = l4 - l2;
            object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object) {
                bl3 = true;
            }
            ct3.f(bl3);
            this.m = bl2;
            this.n = l3 = this.k;
        }
    }

    public final void q() {
        this.q.g.q();
    }

    public final void r(int n3) {
        this.q.g.r(n3);
    }

    public final void release() {
        c c2 = this.q;
        int n3 = c2.o;
        int n4 = 2;
        if (n3 != n4) {
            H21 h21 = c2.l;
            if (h21 != null) {
                h21.c();
            }
            c2.getClass();
            n3 = 0;
            h21 = null;
            c2.m = null;
            c2.o = n4;
        }
    }

    public final void s() {
        c c2 = this.q;
        c2.getClass();
        A63 a63 = A63.c;
        int n3 = a63.a;
        int n4 = a63.b;
        c2.c(null, n3, n4);
        c2.m = null;
    }

    public final void setPlaybackSpeed(float f5) {
        this.q.g.setPlaybackSpeed(f5);
    }

    public final void setVideoEffects(List list) {
        ArrayList arrayList = this.b;
        boolean bl2 = arrayList.equals(list);
        if (bl2) {
            return;
        }
        arrayList.clear();
        arrayList.addAll(list);
        list = this.q.f;
        arrayList.addAll(list);
        this.w();
    }

    public final void setVideoFrameMetadataListener(LB3 lB3) {
        this.q.k = lB3;
    }

    public final void t(boolean bl2) {
        boolean bl3 = this.isInitialized();
        if (!bl3) {
            long l2;
            bl3 = false;
            this.l = false;
            this.j = l2 = -9223372036854775807L;
            this.k = l2;
            c c2 = this.q;
            int n3 = c2.o;
            int n4 = 1;
            if (n3 == n4) {
                c2.n = n3 = c2.n + n4;
                c2.g.t(bl2);
                H21 h21 = c2.l;
                ct3.h(h21);
                n4 = 1;
                e32_0 e32_02 = new e32_0(c2, n4);
                h21.i(e32_02);
            }
            this.n = l2;
            return;
        }
        throw null;
    }

    public final void u(boolean bl2) {
        this.q.g.u(bl2);
    }

    public final void v(b$a b$a, Executor executor) {
        this.o = b$a;
        this.p = executor;
    }

    public final void w() {
        int n3;
        Object object = this.d;
        if (object == null) {
            return;
        }
        Object object2 = this.b;
        object = new ArrayList(object2);
        object = this.d;
        object.getClass();
        ct3.h(null);
        object2 = ((androidx.media3.common.d)object).C;
        if (object2 == null || (n3 = ((VX)object2).d()) == 0) {
            object2 = VX.h;
        }
        n3 = ((androidx.media3.common.d)object).v;
        boolean bl2 = false;
        boolean bl3 = n3 > 0;
        String string2 = "width must be positive, but is: ";
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(n3);
        object2 = stringBuilder.toString();
        ct3.b(bl3, (String)object2);
        int n4 = ((androidx.media3.common.d)object).w;
        if (n4 > 0) {
            bl2 = true;
        }
        object2 = new StringBuilder("height must be positive, but is: ");
        ((StringBuilder)object2).append(n4);
        object = ((StringBuilder)object2).toString();
        ct3.b(bl2, (String)object);
        throw null;
    }
}

