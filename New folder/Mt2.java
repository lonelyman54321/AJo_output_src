/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import androidx.media3.common.g;
import androidx.media3.common.g$a;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.source.j$b;
import com.google.common.collect.ImmutableList;
import java.util.List;

public final class Mt2 {
    public static final j$b u;
    public final g a;
    public final j$b b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final sp3 h;
    public final Hp3 i;
    public final List j;
    public final j$b k;
    public final boolean l;
    public final int m;
    public final int n;
    public final ot2_0 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    static {
        j$b j$b;
        Object object = new Object();
        u = j$b = new j$b(object);
    }

    public Mt2(g g3, j$b j$b, long l2, long l3, int n3, ExoPlaybackException exoPlaybackException, boolean bl2, sp3 sp32, Hp3 hp3, List list, j$b j$b2, boolean bl3, int n4, int n7, ot2_0 ot2_02, long l4, long l7, long l8, long l12, boolean bl4) {
        this.a = g3;
        this.b = j$b;
        this.c = l2;
        this.d = l3;
        this.e = n3;
        this.f = exoPlaybackException;
        this.g = bl2;
        this.h = sp32;
        this.i = hp3;
        this.j = list;
        this.k = j$b2;
        this.l = bl3;
        this.m = n4;
        this.n = n7;
        this.o = ot2_02;
        this.q = l4;
        this.r = l7;
        this.s = l8;
        this.t = l12;
        this.p = bl4;
    }

    public static Mt2 i(Hp3 hp3) {
        g$a g$a = androidx.media3.common.g.a;
        j$b j$b = u;
        sp3 sp32 = sp3.d;
        ImmutableList immutableList = ImmutableList.of();
        ot2_0 ot2_02 = ot2_0.d;
        Mt2 mt2 = new Mt2(g$a, j$b, -9223372036854775807L, 0L, 1, null, false, sp32, hp3, immutableList, j$b, false, 1, 0, ot2_02, 0L, 0L, 0L, 0L, false);
        return mt2;
    }

    public final Mt2 a() {
        g g3 = this.a;
        j$b j$b = this.b;
        long l2 = this.c;
        long l3 = this.d;
        int n3 = this.e;
        ExoPlaybackException exoPlaybackException = this.f;
        boolean bl2 = this.g;
        sp3 sp32 = this.h;
        Hp3 hp3 = this.i;
        List list = this.j;
        j$b j$b2 = this.k;
        boolean bl3 = this.l;
        int n4 = this.m;
        int n7 = this.n;
        ot2_0 ot2_02 = this.o;
        long l4 = this.q;
        long l7 = this.r;
        long l8 = this.j();
        long l12 = SystemClock.elapsedRealtime();
        boolean bl4 = this.p;
        Mt2 mt2 = new Mt2(g3, j$b, l2, l3, n3, exoPlaybackException, bl2, sp32, hp3, list, j$b2, bl3, n4, n7, ot2_02, l4, l7, l8, l12, bl4);
        return mt2;
    }

    public final Mt2 b(j$b object) {
        Mt2 mt2;
        j$b j$b = object;
        g g3 = this.a;
        j$b j$b2 = this.b;
        long l2 = this.c;
        long l3 = this.d;
        int n3 = this.e;
        ExoPlaybackException exoPlaybackException = this.f;
        boolean bl2 = this.g;
        sp3 sp32 = this.h;
        Hp3 hp3 = this.i;
        List list = this.j;
        boolean bl3 = this.l;
        object = mt2;
        int n4 = this.m;
        int n7 = this.n;
        ot2_0 ot2_02 = this.o;
        long l4 = this.q;
        long l7 = this.r;
        long l8 = this.s;
        long l12 = this.t;
        boolean bl4 = this.p;
        mt2 = new Mt2(g3, j$b2, l2, l3, n3, exoPlaybackException, bl2, sp32, hp3, list, j$b, bl3, n4, n7, ot2_02, l4, l7, l8, l12, bl4);
        return mt2;
    }

    public final Mt2 c(j$b object, long l2, long l3, long l4, long l7, sp3 sp32, Hp3 hp3, List list) {
        Mt2 mt2;
        j$b j$b = object;
        g g3 = this.a;
        int n3 = this.e;
        ExoPlaybackException exoPlaybackException = this.f;
        boolean bl2 = this.g;
        j$b j$b2 = this.k;
        boolean bl3 = this.l;
        object = mt2;
        int n4 = this.m;
        int n7 = this.n;
        ot2_0 ot2_02 = this.o;
        long l8 = this.q;
        long l12 = SystemClock.elapsedRealtime();
        boolean bl4 = this.p;
        mt2 = new Mt2(g3, j$b, l3, l4, n3, exoPlaybackException, bl2, sp32, hp3, list, j$b2, bl3, n4, n7, ot2_02, l8, l7, l2, l12, bl4);
        return mt2;
    }

    public final Mt2 d(int n3, int n4, boolean bl2) {
        g g3 = this.a;
        j$b j$b = this.b;
        long l2 = this.c;
        long l3 = this.d;
        int n7 = this.e;
        ExoPlaybackException exoPlaybackException = this.f;
        boolean bl3 = this.g;
        sp3 sp32 = this.h;
        Hp3 hp3 = this.i;
        List list = this.j;
        j$b j$b2 = this.k;
        ot2_0 ot2_02 = this.o;
        long l4 = this.q;
        long l7 = this.r;
        long l8 = this.s;
        long l12 = this.t;
        boolean bl4 = this.p;
        Mt2 mt2 = new Mt2(g3, j$b, l2, l3, n7, exoPlaybackException, bl3, sp32, hp3, list, j$b2, bl2, n3, n4, ot2_02, l4, l7, l8, l12, bl4);
        return mt2;
    }

    public final Mt2 e(ExoPlaybackException object) {
        Mt2 mt2;
        ExoPlaybackException exoPlaybackException = object;
        g g3 = this.a;
        j$b j$b = this.b;
        long l2 = this.c;
        long l3 = this.d;
        int n3 = this.e;
        boolean bl2 = this.g;
        sp3 sp32 = this.h;
        Hp3 hp3 = this.i;
        List list = this.j;
        j$b j$b2 = this.k;
        boolean bl3 = this.l;
        object = mt2;
        int n4 = this.m;
        int n7 = this.n;
        ot2_0 ot2_02 = this.o;
        long l4 = this.q;
        long l7 = this.r;
        long l8 = this.s;
        long l12 = this.t;
        boolean bl4 = this.p;
        mt2 = new Mt2(g3, j$b, l2, l3, n3, exoPlaybackException, bl2, sp32, hp3, list, j$b2, bl3, n4, n7, ot2_02, l4, l7, l8, l12, bl4);
        return mt2;
    }

    public final Mt2 f(ot2_0 object) {
        Mt2 mt2;
        ot2_0 ot2_02 = object;
        g g3 = this.a;
        j$b j$b = this.b;
        long l2 = this.c;
        long l3 = this.d;
        int n3 = this.e;
        ExoPlaybackException exoPlaybackException = this.f;
        boolean bl2 = this.g;
        sp3 sp32 = this.h;
        Hp3 hp3 = this.i;
        List list = this.j;
        j$b j$b2 = this.k;
        boolean bl3 = this.l;
        object = mt2;
        int n4 = this.m;
        int n7 = this.n;
        long l4 = this.q;
        long l7 = this.r;
        long l8 = this.s;
        long l12 = this.t;
        boolean bl4 = this.p;
        mt2 = new Mt2(g3, j$b, l2, l3, n3, exoPlaybackException, bl2, sp32, hp3, list, j$b2, bl3, n4, n7, ot2_02, l4, l7, l8, l12, bl4);
        return mt2;
    }

    public final Mt2 g(int n3) {
        g g3 = this.a;
        j$b j$b = this.b;
        long l2 = this.c;
        long l3 = this.d;
        ExoPlaybackException exoPlaybackException = this.f;
        boolean bl2 = this.g;
        sp3 sp32 = this.h;
        Hp3 hp3 = this.i;
        List list = this.j;
        j$b j$b2 = this.k;
        boolean bl3 = this.l;
        int n4 = this.m;
        int n7 = this.n;
        ot2_0 ot2_02 = this.o;
        long l4 = this.q;
        long l7 = this.r;
        long l8 = this.s;
        long l12 = this.t;
        boolean bl4 = this.p;
        Mt2 mt2 = new Mt2(g3, j$b, l2, l3, n3, exoPlaybackException, bl2, sp32, hp3, list, j$b2, bl3, n4, n7, ot2_02, l4, l7, l8, l12, bl4);
        return mt2;
    }

    public final Mt2 h(g object) {
        Mt2 mt2;
        g g3 = object;
        j$b j$b = this.b;
        long l2 = this.c;
        long l3 = this.d;
        int n3 = this.e;
        ExoPlaybackException exoPlaybackException = this.f;
        boolean bl2 = this.g;
        sp3 sp32 = this.h;
        Hp3 hp3 = this.i;
        List list = this.j;
        j$b j$b2 = this.k;
        boolean bl3 = this.l;
        object = mt2;
        int n4 = this.m;
        int n7 = this.n;
        ot2_0 ot2_02 = this.o;
        long l4 = this.q;
        long l7 = this.r;
        long l8 = this.s;
        long l12 = this.t;
        boolean bl4 = this.p;
        mt2 = new Mt2(g3, j$b, l2, l3, n3, exoPlaybackException, bl2, sp32, hp3, list, j$b2, bl3, n4, n7, ot2_02, l4, l7, l8, l12, bl4);
        return mt2;
    }

    public final long j() {
        long l2;
        long l3;
        long l4;
        long l7;
        long l8;
        boolean bl2 = this.k();
        if (!bl2) {
            return this.s;
        }
        do {
            l4 = this.t;
            l2 = this.s;
        } while ((l8 = (l7 = l4 - (l3 = this.t)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false);
        l3 = SystemClock.elapsedRealtime() - l4;
        l4 = gz3.T(l2);
        float f5 = l3;
        float f6 = this.o.a;
        l2 = (long)(f5 * f6);
        return gz3.I(l4 + l2);
    }

    public final boolean k() {
        int n3 = this.e;
        int n4 = 3;
        n3 = n3 == n4 && (n3 = (int)(this.l ? 1 : 0)) != 0 && (n3 = this.n) == 0 ? 1 : 0;
        return n3 != 0;
    }
}

