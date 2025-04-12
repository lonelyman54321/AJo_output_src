/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 *  android.os.Trace
 *  android.util.Pair
 */
package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaItem$d;
import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.a;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer$e;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.d$a;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.f;
import androidx.media3.exoplayer.g$a;
import androidx.media3.exoplayer.g$b;
import androidx.media3.exoplayer.g$c;
import androidx.media3.exoplayer.g$d;
import androidx.media3.exoplayer.g$e;
import androidx.media3.exoplayer.g$f;
import androidx.media3.exoplayer.g$g;
import androidx.media3.exoplayer.h$a;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.l$b;
import androidx.media3.exoplayer.l$c;
import androidx.media3.exoplayer.l$d;
import androidx.media3.exoplayer.m;
import androidx.media3.exoplayer.m$a;
import androidx.media3.exoplayer.n;
import androidx.media3.exoplayer.o;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.i$a;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.j$c;
import androidx.media3.exoplayer.source.k;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.Sets;
import com.google.common.primitives.Longs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class g
implements Handler.Callback,
i$a,
Gp3$a,
l$d,
d$a,
m$a {
    public static final long p0 = gz3.T(10000L);
    public ex2_0 A;
    public Mt2 B;
    public g$d C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public long H;
    public boolean I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public g$g P;
    public long Q;
    public long R;
    public int S;
    public boolean T;
    public ExoPlaybackException U;
    public final long X;
    public long Y;
    public ExoPlayer$e Z;
    public final n[] a;
    public final Set b;
    public final o[] c;
    public final boolean[] d;
    public final Gp3 e;
    public final Hp3 f;
    public final androidx.media3.exoplayer.h g;
    public final iv_0 h;
    public final H21 i;
    public final nt2_0 j;
    public final Looper k;
    public androidx.media3.common.g k0;
    public final androidx.media3.common.g$c l;
    public final androidx.media3.common.g$b m;
    public final long n;
    public final boolean o;
    public final d p;
    public final ArrayList q;
    public final VV r;
    public final g$e s;
    public final androidx.media3.exoplayer.k t;
    public final l u;
    public final Gv1 v;
    public final long w;
    public final nu2 x;
    public final je y;
    public final H21 z;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public g(n[] nArray, Gp3 gp3, Hp3 hp3, androidx.media3.exoplayer.h h3, iv_0 iv_02, int n3, boolean bl2, je je2, ex2_0 ex2_02, Gv1 gv1, long l2, boolean n4, Looper looper, VV vV, if0_0 if0_02, nu2 nu22, ExoPlayer$e exoPlayer$e) {
        g$d g$d;
        g g3 = this;
        Object object = nArray;
        Object object2 = gp3;
        Object object3 = iv_02;
        je je3 = je2;
        long l3 = l2;
        VV vV2 = vV;
        nu2 nu23 = nu22;
        ExoPlayer$e exoPlayer$e2 = exoPlayer$e;
        Object object4 = if0_02;
        this.s = if0_02;
        this.a = nArray;
        this.e = gp3;
        object4 = hp3;
        this.f = hp3;
        Object object5 = h3;
        this.g = h3;
        this.h = iv_02;
        this.J = n3;
        this.K = bl2;
        this.A = ex2_02;
        this.v = gv1;
        this.w = l2;
        this.X = l2;
        int n7 = n4;
        this.E = n4;
        this.r = vV;
        this.x = nu22;
        this.Z = exoPlayer$e;
        this.y = je2;
        this.Y = l3 = -9223372036854775807L;
        this.H = l3;
        this.n = l3 = h3.c();
        this.o = n7 = h3.b();
        Object object6 = androidx.media3.common.g.a;
        this.k0 = object6;
        object6 = Mt2.i(hp3);
        this.B = object6;
        this.C = g$d = new g$d((Mt2)object6);
        object6 = new o[nArray.length];
        this.c = object6;
        n7 = nArray.length;
        object6 = new boolean[n7];
        this.d = (boolean[])object6;
        object6 = gp3.b();
        int n8 = 0;
        g$d = null;
        while (true) {
            int n10;
            if (n8 >= (n10 = ((n[])object).length)) {
                super(this, vV2);
                g3.p = object;
                super();
                g3.q = object;
                object = Sets.newIdentityHashSet();
                g3.b = object;
                super();
                g3.l = object;
                super();
                g3.m = object;
                ((Gp3)object2).a = g3;
                ((Gp3)object2).b = object3;
                g3.T = true;
                object2 = looper;
                object = vV2.b(looper, null);
                g3.z = object;
                object3 = new af0_0(this);
                g3.t = object2 = new androidx.media3.exoplayer.k(je3, (H21)object, (af0_0)object3, exoPlayer$e2);
                g3.u = object2 = new l(this, je3, (H21)object, nu23);
                super();
                g3.j = object;
                object = ((nt2_0)object).a();
                g3.k = object;
                g3.i = object = vV2.b((Looper)object, this);
                return;
            }
            object[n8].r(n8, nu23, vV2);
            object4 = g3.c;
            object4[n8] = object5 = object[n8].s();
            if (object6 != null) {
                object4 = (androidx.media3.exoplayer.b)g3.c[n8];
                object5 = object4.a;
                synchronized (object5) {
                    object4.q = object6;
                }
            }
            ++n8;
        }
    }

    public static Pair L(androidx.media3.common.g g3, g$g g$g, boolean bl2, int n3, boolean n4, androidx.media3.common.g$c g$c, androidx.media3.common.g$b g$b) {
        int n7;
        int n8;
        Object object = g$g;
        androidx.media3.common.g$b g$b2 = g$b;
        Object object2 = g$g.a;
        boolean n10 = g3.q();
        if (n10) {
            return null;
        }
        boolean bl3 = ((androidx.media3.common.g)object2).q();
        Object object3 = bl3 ? g3 : object2;
        try {
            n8 = ((g$g)object).b;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
        long l2 = ((g$g)object).c;
        object2 = object3;
        Object object4 = g$c;
        Object object5 = g$b;
        object2 = ((androidx.media3.common.g)object3).j(g$c, g$b, n8, l2);
        boolean bl4 = g3.equals(object3);
        if (bl4) {
            return object2;
        }
        object4 = ((Pair)object2).first;
        int n14 = g3.b(object4);
        if (n14 != (n7 = -1)) {
            object4 = ((Pair)object2).first;
            object4 = ((androidx.media3.common.g)object3).h(object4, g$b2);
            boolean bl5 = ((androidx.media3.common.g$b)object4).f;
            if (bl5) {
                int n15 = g$b2.c;
                long l3 = 0L;
                object4 = ((androidx.media3.common.g)object3).n(n15, g$c, l3);
                int n16 = ((androidx.media3.common.g$c)object4).n;
                object5 = ((Pair)object2).first;
                int n17 = ((androidx.media3.common.g)object3).b(object5);
                if (n16 == n17) {
                    object2 = ((Pair)object2).first;
                    n17 = g3.h((Object)object2, (androidx.media3.common.g$b)g$b2).c;
                    long l4 = ((g$g)object).c;
                    object = g3;
                    object2 = g$c;
                    object4 = g$b;
                    object2 = g3.j(g$c, g$b, n17, l4);
                }
            }
            return object2;
        }
        if (bl2) {
            Object object6 = ((Pair)object2).first;
            object = g$c;
            object2 = g$b;
            int n18 = n3;
            int n19 = n4;
            n19 = androidx.media3.exoplayer.g.M(g$c, g$b, n3, n4 != 0, object6, (androidx.media3.common.g)object3, g3);
            if (n19 != n7) {
                object = g3;
                object2 = g$c;
                object4 = g$b;
                return g3.j(g$c, g$b, n19, -9223372036854775807L);
            }
        }
        return null;
    }

    public static int M(androidx.media3.common.g$c g$c, androidx.media3.common.g$b g$b, int n3, boolean bl2, Object object, androidx.media3.common.g g3, androidx.media3.common.g g5) {
        int n4;
        int n7;
        androidx.media3.common.g$b g$b2 = g$b;
        Object object2 = object;
        androidx.media3.common.g g7 = g3;
        androidx.media3.common.g g8 = g5;
        int n8 = g3.h((Object)object, (androidx.media3.common.g$b)g$b).c;
        long l2 = 0L;
        Object object3 = g3.n((int)n8, (androidx.media3.common.g$c)g$c, (long)l2).a;
        for (n7 = 0; n7 < (n4 = g5.p()); ++n7) {
            Object object4 = g8.n((int)n7, (androidx.media3.common.g$c)g$c, (long)l2).a;
            n4 = (int)(object4.equals(object3) ? 1 : 0);
            if (n4 == 0) continue;
            return n7;
        }
        int n10 = g7.b(object2);
        int n14 = g3.i();
        int n15 = -1;
        n8 = n10;
        int n16 = -1;
        for (int i3 = 0; i3 < n14 && n16 == n15; ++i3) {
            object2 = g3;
            n7 = n3;
            n4 = (int)(bl2 ? 1 : 0);
            if ((n8 = g3.d(n8, g$b, g$c, n3, bl2)) == n15) break;
            object2 = g7.m(n8);
            n16 = g8.b(object2);
        }
        if (n16 != n15) {
            object2 = g8.g(n16, g$b2, false);
            n15 = ((androidx.media3.common.g$b)object2).c;
        }
        return n15;
    }

    public static void T(n n3, long l2) {
        n3.i();
        boolean bl2 = n3 instanceof rm3;
        if (bl2) {
            n3 = (rm3)n3;
            bl2 = ((androidx.media3.exoplayer.b)n3).n;
            ct3.f(bl2);
            ((rm3)n3).J = l2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean r(j j3) {
        boolean bl2 = false;
        if (j3 == null) return bl2;
        try {
            i i3 = j3.a;
            boolean bl3 = j3.f;
            if (!bl3) {
                i3.i();
            } else {
                for (VR2 vR2 : j3.c) {
                    if (vR2 == null) continue;
                    vR2.d();
                }
            }
            boolean bl4 = j3.f;
            long l2 = !bl4 ? 0L : i3.d();
            long l3 = Long.MIN_VALUE;
            bl4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (!bl4) return bl2;
            return true;
        }
        catch (IOException iOException) {
            return bl2;
        }
    }

    public static boolean s(n n3) {
        int n4 = n3.getState();
        if (n4) {
            n4 = 1;
        } else {
            n4 = 0;
            n3 = null;
        }
        return n4 != 0;
    }

    public final void A(g$b object) {
        l$c l$c;
        int n3;
        Object object2 = this.C;
        int n4 = 1;
        ((g$d)object2).a(n4);
        int n7 = ((g$b)object).a;
        l l2 = this.u;
        l2.getClass();
        ArrayList arrayList = l2.b;
        int n8 = ((g$b)object).b;
        int n10 = ((g$b)object).c;
        if (n7 >= 0 && n7 <= n8 && n8 <= (n3 = arrayList.size()) && n10 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            l$c = null;
        }
        ct3.a(n3 != 0);
        l2.j = object = ((g$b)object).d;
        if (n7 != n8 && n7 != n10) {
            int n14;
            n3 = n8 - n7 + n10 - n4;
            n4 = n8 + -1;
            n4 = Math.max(n3, n4);
            l$c = (l$c)arrayList.get(n14);
            n3 = l$c.d;
            gz3.H(arrayList, n7, n8, n10);
            for (n14 = Math.min(n7, n10); n14 <= n4; ++n14) {
                object2 = (l$c)arrayList.get(n14);
                ((l$c)object2).d = n3;
                object2 = ((l$c)object2).a.o.b;
                n7 = ((androidx.media3.common.g)object2).p();
                n3 += n7;
            }
            object = l2.b();
        } else {
            object = l2.b();
        }
        this.n((androidx.media3.common.g)object, false);
    }

    /*
     * WARNING - void declaration
     */
    public final void B() {
        void var6_9;
        g$d g$d = this.C;
        int n3 = 1;
        g$d.a(n3);
        int i3 = 0;
        g$d = null;
        this.H(false, false, false, n3 != 0);
        Object object = this.g;
        nu2 nu22 = this.x;
        object.i(nu22);
        object = this.B.a;
        boolean n4 = ((androidx.media3.common.g)object).q();
        int n7 = 2;
        if (n4) {
            int n8 = 4;
        } else {
            int n10 = 2;
        }
        this.d0((int)var6_9);
        object = this.h.a();
        l l2 = this.u;
        int n14 = l2.k ^ n3;
        ct3.f(n14 != 0);
        l2.l = object;
        while (i3 < (n14 = ((ArrayList)(object = l2.b)).size())) {
            object = (l$c)((ArrayList)object).get(i3);
            l2.e((l$c)object);
            HashSet hashSet = l2.g;
            hashSet.add(object);
            ++i3;
        }
        l2.k = n3;
        this.i.k(n7);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean C() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2 = this.D;
                    if (bl2) return true;
                    Object object = this.k;
                    bl2 = ((Thread)(object = object.getThread())).isAlive();
                    if (bl2) {
                        object = this.i;
                        int n3 = 7;
                        object.k(n3);
                        object = new yf0_0(this);
                        long l2 = this.w;
                        this.p0((Supplier)object, l2);
                        return this.D;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return true;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void D() {
        Object object = null;
        int n3 = 1;
        try {
            this.H(n3 != 0, false, n3 != 0, false);
            this.E();
            object = this.g;
            nu2 nu22 = this.x;
            object.g(nu22);
            this.d0(n3);
            return;
        }
        finally {
            object = this.j;
            ((nt2_0)object).b();
            synchronized (this) {
                this.D = n3;
                this.notifyAll();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void E() {
        int n3 = 0;
        Object var2_2 = null;
        Object object;
        int n4;
        while (n3 < (n4 = ((n[])(object = this.a)).length)) {
            object = (androidx.media3.exoplayer.b)this.c[n3];
            Object object2 = ((androidx.media3.exoplayer.b)object).a;
            synchronized (object2) {
                ((androidx.media3.exoplayer.b)object).q = null;
            }
            object = this.a[n3];
            object.release();
            ++n3;
        }
        return;
    }

    public final void F(int n3, int n4, s s7) {
        ArrayList arrayList;
        int n7;
        Object object = this.C;
        boolean bl2 = true;
        ((g$d)object).a((int)(bl2 ? 1 : 0));
        object = this.u;
        object.getClass();
        if (n3 < 0 || n3 > n4 || n4 > (n7 = (arrayList = ((l)object).b).size())) {
            bl2 = false;
        }
        ct3.a(bl2);
        ((l)object).j = s7;
        ((l)object).g(n3, n4);
        androidx.media3.common.g g3 = ((l)object).b();
        this.n(g3, false);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void G() {
        int n3;
        int n4;
        int n7;
        Object object;
        Object object2;
        void var8_21;
        boolean bl2;
        Object object3;
        Object object4;
        Object object5;
        float f5;
        g g3;
        block11: {
            g3 = this;
            ot2_0 ot2_02 = this.p.getPlaybackParameters();
            f5 = ot2_02.a;
            object5 = this.t;
            object4 = ((androidx.media3.exoplayer.k)object5).j;
            object5 = ((androidx.media3.exoplayer.k)object5).k;
            boolean bl3 = false;
            object3 = null;
            n[] nArray = object4;
            bl2 = true;
            while (var8_21 != null) {
                DF0[] dF0Array;
                DF0[] dF0Array2;
                int n8;
                boolean bl4 = var8_21.f;
                if (!bl4) {
                    return;
                }
                object2 = g3.B;
                androidx.media3.common.g g5 = ((Mt2)object2).a;
                bl4 = ((Mt2)object2).l;
                object2 = var8_21.j(f5, g5, bl4);
                j j3 = g3.t.j;
                object = var8_21 == j3 ? object2 : object3;
                object3 = var8_21.p;
                if (object3 == null || (n8 = (dF0Array2 = ((Hp3)object3).c).length) != (n7 = (dF0Array = ((Hp3)object2).c).length)) break block11;
                Object var12_28 = null;
                for (n8 = 0; n8 < (n7 = dF0Array.length); ++n8) {
                    n7 = (int)(((Hp3)object2).a((Hp3)object3, n8) ? 1 : 0);
                    if (n7 != 0) {
                        continue;
                    }
                    break block11;
                }
                if (var8_21 == object5) {
                    bl2 = false;
                    object4 = null;
                }
                j j5 = var8_21.n;
                object3 = object;
            }
            return;
        }
        int n10 = 4;
        if (!bl2) {
            androidx.media3.exoplayer.k k2 = g3.t;
            k2.o((j)var8_21);
            n4 = var8_21.f;
            if (n4 != 0) {
                long l2 = var8_21.h.b;
                long l3 = g3.Q;
                long l4 = var8_21.q;
                l3 -= l4;
                l4 = Math.max(l2, l3);
                o[] oArray = var8_21.k;
                n4 = oArray.length;
                boolean[] blArray = new boolean[n4];
                n7 = 0;
                Object var18_40 = null;
                var8_21.a((Hp3)object2, l4, false, blArray);
            }
        } else {
            int n14;
            Mt2 mt2;
            long l7;
            long l8;
            androidx.media3.exoplayer.k k3 = g3.t;
            j j7 = k3.j;
            boolean bl5 = k3.o(j7);
            n4 = g3.a.length;
            boolean[] blArray = new boolean[n4];
            object.getClass();
            long l12 = g3.B.s;
            long l14 = j7.a((Hp3)object, l12, bl5, blArray);
            Mt2 mt22 = g3.B;
            n3 = mt22.e;
            int n15 = n3 != n10 && (bl2 = (l8 = l14 - (l7 = mt22.s)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) ? 1 : 0;
            Mt2 mt23 = g3.B;
            object5 = mt23.b;
            long l15 = mt23.c;
            long l16 = mt23.d;
            int n16 = 5;
            g g7 = this;
            long l17 = l16;
            l16 = l14;
            boolean[] blArray2 = blArray;
            long l18 = l17;
            j j8 = j7;
            n7 = n15;
            n10 = n16;
            g3.B = mt2 = this.q((j$b)object5, l14, l15, l17, n15 != 0, n16);
            if (n15 != 0) {
                g3.J(l14);
            }
            n4 = g3.a.length;
            boolean[] blArray3 = new boolean[n4];
            object5 = null;
            for (n3 = 0; n3 < (n14 = ((n[])(object4 = g3.a)).length); ++n3) {
                object4 = object4[n3];
                blArray3[n3] = n14 = (int)(androidx.media3.exoplayer.g.s((n)object4) ? 1 : 0);
                VR2 vR2 = j8.c[n3];
                if (n14 == 0) continue;
                object3 = object4.getStream();
                if (vR2 != object3) {
                    g3.b(n3);
                    continue;
                }
                n14 = blArray2[n3];
                if (n14 == 0) continue;
                long l19 = g3.Q;
                object4.w(l19);
            }
            long l20 = g3.Q;
            g3.e(blArray3, l20);
        }
        n4 = 1;
        f5 = Float.MIN_VALUE;
        g3.m(n4 != 0);
        Mt2 mt2 = g3.B;
        n4 = mt2.e;
        n3 = 4;
        if (n4 == n3) return;
        this.u();
        this.m0();
        H21 h21 = g3.i;
        n3 = 2;
        h21.k(n3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void H(boolean var1_1, boolean var2_2, boolean var3_3, boolean var4_4) {
        block32: {
            var5_5 = this;
            this.i.l(2);
            var6_6 = false;
            var7_7 /* !! */  = null;
            this.U = null;
            var8_8 = 1;
            this.o0(false, (boolean)var8_8);
            var9_9 = this.p;
            var9_9.f = false;
            var9_9 = var9_9.a;
            var10_13 = var9_9.b;
            if (var10_13 != 0) {
                var11_14 = var9_9.q();
                var9_9.a(var11_14);
                var9_9.b = false;
            }
            var5_5.Q = var11_14 = 1000000000000L;
            var13_15 = null;
            for (var10_13 = 0; var10_13 < (var15_17 = ((n[])(var14_16 = var5_5.a)).length); ++var10_13) {
                try {
                    var5_5.b(var10_13);
                    continue;
                }
                catch (RuntimeException var9_10) {
                }
                catch (ExoPlaybackException var9_11) {
                    // empty catch block
                }
                var14_16 = "Disable failed.";
                Cx.d((String)var14_16, (Throwable)var9_9);
            }
            if (var1_1) {
                var10_13 = ((n[])var14_16).length;
                var17_19 = null;
                for (var16_18 = 0; var16_18 < var10_13; ++var16_18) {
                    var18_20 /* !! */  = var5_5.b;
                    var9_9 = var14_16[var16_18];
                    var19_22 = var18_20 /* !! */ .remove(var9_9);
                    if (var19_22 == 0) continue;
                    try {
                        var9_9.reset();
                        continue;
                    }
                    catch (RuntimeException var18_21) {
                        var9_9 = "Reset failed.";
                        Cx.d((String)var9_9, var18_21);
                    }
                }
            }
            var5_5.O = 0;
            var9_9 = var5_5.B;
            var13_15 = var9_9.b;
            var20_23 = var9_9.s;
            var9_9 = var5_5.B.b;
            var15_17 = (int)var9_9.b();
            if (var15_17 != 0) ** GOTO lbl-1000
            var9_9 = var5_5.B;
            var18_20 /* !! */  = var5_5.m;
            var22_24 = var9_9.b;
            var9_9 = var9_9.a;
            var23_25 = var9_9.q();
            if (var23_25) ** GOTO lbl-1000
            var22_24 = var22_24.a;
            var9_9 = var9_9.h(var22_24, (androidx.media3.common.g$b)var18_20 /* !! */ );
            var15_17 = (int)var9_9.f;
            if (var15_17 == 0) {
                var9_9 = var5_5.B;
                var24_26 = var9_9.s;
            } else lbl-1000:
            // 3 sources

            {
                var9_9 = var5_5.B;
                var24_26 = var9_9.c;
            }
            if (!var2_2) ** GOTO lbl-1000
            var5_5.P = null;
            var9_9 = var5_5.B.a;
            var9_9 = var5_5.i((androidx.media3.common.g)var9_9);
            var13_15 = (j$b)var9_9.first;
            var20_23 = (Long)var9_9.second;
            var9_9 = var5_5.B.b;
            var15_17 = (int)var13_15.equals(var9_9);
            var24_26 = -9223372036854775807L;
            if (var15_17 == 0) {
                var26_27 = var20_23;
                var28_28 = var24_26;
            } else lbl-1000:
            // 2 sources

            {
                var26_27 = var20_23;
                var28_28 = var24_26;
                var8_8 = 0;
                var30_29 = null;
            }
            var5_5.t.b();
            var5_5.I = false;
            var9_9 = var5_5.B.a;
            if (!var3_3 || (var31_30 = var9_9 instanceof au2_0) == 0) ** GOTO lbl122
            var9_9 = (au2_0)var9_9;
            var14_16 = var5_5.u.j;
            var17_19 = var9_9.j;
            var19_22 = ((androidx.media3.common.g[])var17_19).length;
            var18_20 /* !! */  = new androidx.media3.common.g[var19_22];
            for (var32_31 = 0; var32_31 < (var33_32 = ((androidx.media3.common.g[])var17_19).length); ++var32_31) {
                var35_34 = var17_19[var32_31];
                var34_33 = new zu2_1(var35_34);
                var18_20 /* !! */ [var32_31] = var34_33;
            }
            var9_9 = var9_9.k;
            var17_19 = new au2_0(var18_20 /* !! */ , (Object[])var9_9, (s)var14_16);
            var15_17 = var13_15.b;
            var31_30 = -1;
            if (var15_17 == var31_30) ** GOTO lbl-1000
            var9_9 = var13_15.a;
            var14_16 = var5_5.m;
            var17_19.h(var9_9, (androidx.media3.common.g$b)var14_16);
            var9_9 = var5_5.m;
            var15_17 = var9_9.c;
            var14_16 = var5_5.l;
            var36_35 = 0L;
            var17_19.n(var15_17, (androidx.media3.common.g$c)var14_16, var36_35);
            var15_17 = (int)var14_16.b();
            if (var15_17 != 0) {
                var14_16 = var13_15.a;
                var36_35 = var13_15.d;
                var9_9 = new j$b(var14_16, var36_35);
                var38_36 /* !! */  = var9_9;
            } else lbl-1000:
            // 3 sources

            {
                while (true) {
                    var38_36 /* !! */  = var13_15;
                    break block32;
                    break;
                }
lbl122:
                // 1 sources

                var17_19 = var9_9;
                ** continue;
            }
        }
        var13_15 = var5_5.B;
        var39_37 = var13_15.e;
        if (var4_4) lbl-1000:
        // 2 sources

        {
            while (true) {
                continue;
                break;
            }
        }
        var7_7 /* !! */  = var13_15.f;
        ** while (true)
        var40_38 = var7_7 /* !! */ ;
        if (var8_8 != 0) {
            var7_7 /* !! */  = sp3.d;
lbl135:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var7_7 /* !! */  = var13_15.h;
        ** while (true)
        var41_39 = var7_7 /* !! */ ;
        if (var8_8 != 0) {
            var7_7 /* !! */  = var5_5.f;
lbl142:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var7_7 /* !! */  = var13_15.i;
        ** while (true)
        var42_40 = var7_7 /* !! */ ;
        if (var8_8 != 0) {
            var7_7 /* !! */  = ImmutableList.of();
lbl149:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var7_7 /* !! */  = var13_15.j;
        ** while (true)
        var43_41 = var7_7 /* !! */ ;
        var7_7 /* !! */  = var5_5.B;
        var44_42 = var7_7 /* !! */ .l;
        var45_43 = var7_7 /* !! */ .m;
        var8_8 = var7_7 /* !! */ .n;
        var7_7 /* !! */  = var7_7 /* !! */ .o;
        var46_44 = 0L;
        var48_45 = 0L;
        var14_16 = var9_9;
        var18_20 /* !! */  = var38_36 /* !! */ ;
        var36_35 = var26_27;
        var9_9 = new Mt2((androidx.media3.common.g)var17_19, (j$b)var38_36 /* !! */ , var28_28, var26_27, var39_37, var40_38, false, (sp3)var41_39, (Hp3)var42_40, var43_41, (j$b)var38_36 /* !! */ , var44_42, var45_43, var8_8, (ot2_0)var7_7 /* !! */ , var26_27, var46_44, var26_27, var48_45, false);
        var5_5.B = var9_9;
        if (var3_3) {
            var9_9 = var5_5.t;
            var7_7 /* !! */  = var9_9.q;
            var6_6 = var7_7 /* !! */ .isEmpty();
            if (!var6_6) {
                var7_7 /* !! */  = new ArrayList<E>();
                var9_9.n(var7_7 /* !! */ );
            }
            var7_7 /* !! */  = var5_5.u;
            var30_29 = var7_7 /* !! */ .f;
            var9_9 = var30_29.values();
            var13_15 = var9_9.iterator();
            while ((var15_17 = (int)var13_15.hasNext()) != 0) {
                var14_16 = var9_9 = var13_15.next();
                var14_16 = (l$b)var9_9;
                var9_9 = var14_16.a;
                var17_19 = var14_16.b;
                try {
                    var9_9.j((j$c)var17_19);
                }
                catch (RuntimeException var9_12) {
                    var17_19 = "Failed to release child source.";
                    Cx.d((String)var17_19, var9_12);
                }
                var9_9 = var14_16.a;
                var17_19 = var14_16.c;
                var9_9.b((k)var17_19);
                var9_9 = var14_16.a;
                var9_9.e((b)var17_19);
            }
            var30_29.clear();
            var9_9 = var7_7 /* !! */ .g;
            var9_9.clear();
            var7_7 /* !! */ .k = false;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void I() {
        var1_1 = this.t.j;
        if (var1_1 == null) ** GOTO lbl-1000
        var1_1 = var1_1.h;
        var2_2 = var1_1.h;
        if (var2_2 && (var2_2 = this.E)) {
            var2_2 = true;
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = false;
            var1_1 = null;
        }
        this.F = var2_2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void J(long l2) {
        androidx.media3.exoplayer.k k2 = this.t;
        j j3 = k2.j;
        long l3 = j3 == null ? 1000000000000L : j3.q;
        this.Q = l2 += l3;
        this.p.a.a(l2);
        n[] nArray = this.a;
        int n3 = nArray.length;
        j3 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            n n4 = nArray[i3];
            boolean bl2 = androidx.media3.exoplayer.g.s(n4);
            if (!bl2) continue;
            long l4 = this.Q;
            n4.w(l4);
        }
        j j5 = k2.j;
        void var7_7;
        while (var7_7 != null) {
            for (DF0 dF0 : var7_7.p.c) {
                if (dF0 == null) continue;
                dF0.g();
            }
            j j7 = var7_7.n;
        }
        return;
    }

    public final void K(androidx.media3.common.g object, androidx.media3.common.g g3) {
        boolean bl2 = ((androidx.media3.common.g)object).q();
        if (bl2 && (bl2 = g3.q())) {
            return;
        }
        object = this.q;
        int n3 = ((ArrayList)object).size() + -1;
        if (n3 < 0) {
            Collections.sort(object);
            return;
        }
        ((g$c)((ArrayList)object).get(n3)).getClass();
        throw null;
    }

    public final void N(long l2) {
        Mt2 mt2 = this.B;
        int n3 = mt2.e;
        int n4 = 3;
        long l3 = n3 == n4 && (n3 = (int)(this.e0() ? 1 : 0)) == 0 ? 1000L : p0;
        this.i.j(l2 += l3);
    }

    public final void O(boolean bl2) {
        j$b j$b = this.t.j.h.a;
        long l2 = this.B.s;
        Object object = this;
        l2 = this.Q(j$b, l2, true, false);
        object = this.B;
        long l3 = ((Mt2)object).s;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            Mt2 mt2;
            object = this.B;
            long l7 = ((Mt2)object).c;
            long l8 = ((Mt2)object).d;
            int n3 = 5;
            object = this;
            this.B = mt2 = this.q(j$b, l2, l7, l8, bl2, n3);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void P(g$g g$g) {
        void var3_6;
        long l2;
        long l3;
        long l4;
        int n3;
        long l7;
        Object object;
        Object object2;
        Object object3;
        block29: {
            long l8;
            long l12;
            Object object4;
            block28: {
                Object object5;
                int n4;
                Object object6;
                Object object7;
                Object object8;
                long l14;
                int n7;
                g g3 = this;
                object4 = g$g;
                object3 = this.C;
                int n8 = 1;
                ((g$d)object3).a(n8);
                object3 = this.B.a;
                int n10 = this.J;
                int n14 = this.K;
                Object object9 = this.l;
                androidx.media3.common.g$b g$b = this.m;
                boolean bl2 = true;
                object2 = g$g;
                object3 = androidx.media3.exoplayer.g.L((androidx.media3.common.g)object3, g$g, bl2, n10, n14 != 0, (androidx.media3.common.g$c)object9, g$b);
                long l15 = 0L;
                long l16 = -9223372036854775807L;
                g$b = null;
                if (object3 == null) {
                    object9 = this.B.a;
                    object9 = this.i((androidx.media3.common.g)object9);
                    object = (j$b)((Pair)object9).first;
                    l7 = (Long)((Pair)object9).second;
                    object9 = this.B.a;
                    n3 = n7 = ((androidx.media3.common.g)object9).q() ^ n8;
                    l14 = l7;
                    l7 = l16;
                } else {
                    object9 = ((Pair)object3).first;
                    object = (Long)((Pair)object3).second;
                    l7 = (Long)object;
                    long l17 = g$g.c;
                    long l18 = l17 - l16;
                    Object object10 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
                    l17 = object10 == false ? l16 : l7;
                    androidx.media3.exoplayer.k k2 = g3.t;
                    androidx.media3.common.g g5 = g3.B.a;
                    object10 = ((j$b)(object9 = k2.r(g5, object9, l7))).b();
                    if (object10 != false) {
                        object8 = g3.B.a;
                        object7 = ((j$b)object9).a;
                        androidx.media3.common.g$b g$b2 = g3.m;
                        ((androidx.media3.common.g)object8).h(object7, g$b2);
                        object8 = g3.m;
                        n14 = ((j$b)object9).b;
                        n10 = ((androidx.media3.common.g$b)object8).f(n14);
                        n14 = ((j$b)object9).c;
                        if (n10 == n14) {
                            object8 = g3.m.g;
                            l7 = l16 = ((a)object8).c;
                        } else {
                            l7 = l15;
                        }
                        l14 = l7;
                        l7 = l17;
                        n3 = 1;
                    } else {
                        l14 = ((g$g)object4).c;
                        long l19 = l14 - l16;
                        object6 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
                        if (object6 == false) {
                            n10 = 1;
                        } else {
                            n10 = 0;
                            object8 = null;
                        }
                        l14 = l7;
                        l7 = l17;
                        n3 = n10;
                    }
                    object = object9;
                }
                try {
                    block32: {
                        block31: {
                            block30: {
                                object8 = g3.B;
                                object8 = ((Mt2)object8).a;
                                n10 = (int)(((androidx.media3.common.g)object8).q() ? 1 : 0);
                                if (n10 == 0) break block30;
                                g3.P = object4;
                                break block31;
                            }
                            n4 = 4;
                            if (object3 != null) break block32;
                            object3 = g3.B;
                            int n15 = ((Mt2)object3).e;
                            if (n15 != n8) {
                                g3.d0(n4);
                            }
                            g3.H(false, n8 != 0, false, n8 != 0);
                        }
                        l12 = l14;
                        break block28;
                    }
                    object3 = g3.B;
                    object3 = ((Mt2)object3).b;
                    int n16 = ((j$b)object).equals(object3);
                    if (n16 != 0) {
                        long l20;
                        object3 = g3.t;
                        object3 = ((androidx.media3.exoplayer.k)object3).j;
                        if (object3 != null && (n10 = (int)(((j)object3).f ? 1 : 0)) != 0 && (n10 = (int)(l14 == l15 ? 0 : (l14 < l15 ? -1 : 1))) != 0) {
                            object3 = ((j)object3).a;
                            object2 = g3.A;
                            l20 = object3.e(l14, (ex2_0)object2);
                        } else {
                            l20 = l14;
                        }
                        l4 = gz3.T(l20);
                        object7 = g3.B;
                        l3 = ((Mt2)object7).s;
                        l3 = gz3.T(l3);
                        object6 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
                        if (object6 == false) {
                            object5 = g3.B;
                            n10 = ((Mt2)object5).e;
                            n14 = 2;
                            if (n10 == n14 || n10 == (n14 = 3)) {
                                long l21 = ((Mt2)object5).s;
                                object3 = this;
                                object2 = object;
                                l4 = l21;
                                l3 = l7;
                                int n17 = n3;
                                n3 = 2;
                                g3.B = object4 = this.q((j$b)object, l21, l7, l21, n17 != 0, n3);
                                return;
                            }
                        }
                        l4 = l20;
                    } else {
                        l4 = l14;
                    }
                    object3 = g3.B;
                    n16 = ((Mt2)object3).e;
                    if (n16 == n4) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        object9 = null;
                    }
                    object4 = g3.t;
                    object3 = ((androidx.media3.exoplayer.k)object4).j;
                    object4 = ((androidx.media3.exoplayer.k)object4).k;
                    if (object3 != object4) {
                        n14 = 1;
                    } else {
                        n14 = 0;
                        object7 = null;
                    }
                    object3 = this;
                    object2 = object;
                    l8 = this.Q((j$b)object, l4, n14 != 0, n7 != 0);
                }
                catch (Throwable throwable) {
                    l2 = l14;
                    break block29;
                }
                n4 = (int)(l14 == l8 ? 0 : (l14 < l8 ? -1 : 1));
                if (n4 == 0) {
                    n8 = 0;
                }
                n3 |= n8;
                object4 = g3.B;
                object8 = ((Mt2)object4).a;
                object7 = ((Mt2)object4).b;
                n8 = 1;
                object3 = this;
                object2 = object8;
                object5 = object;
                this.n0((androidx.media3.common.g)object8, (j$b)object, (androidx.media3.common.g)object8, (j$b)object7, l7, n8 != 0);
            }
            object3 = this;
            object2 = object;
            l4 = l12;
            l3 = l7;
            int n18 = n3;
            n3 = 2;
            g3.B = object4 = this.q((j$b)object, l12, l7, l12, n18 != 0, n3);
            return;
            finally {
                l12 = l8;
            }
        }
        object3 = this;
        object2 = object;
        l4 = l2;
        l3 = l7;
        int n19 = n3;
        n3 = 2;
        g3.B = object3 = this.q((j$b)object, l2, l7, l2, n19 != 0, n3);
        throw var3_6;
    }

    public final long Q(j$b object, long l2, boolean bl2, boolean bl3) {
        long l3;
        long l4;
        long l7;
        int n3;
        j$b j$b;
        boolean bl4;
        j j3;
        Object object2;
        int n4;
        block14: {
            block13: {
                this.i0();
                this.o0(false, true);
                n4 = 2;
                if (bl3) break block13;
                object2 = this.B;
                int n7 = ((Mt2)object2).e;
                int n8 = 3;
                if (n7 != n8) break block14;
            }
            this.d0(n4);
        }
        object2 = this.t;
        j j5 = j3 = ((androidx.media3.exoplayer.k)object2).j;
        while (j5 != null && !(bl4 = ((j$b)object).equals(j$b = j5.h.a))) {
            j5 = j5.n;
        }
        if (bl2 || j3 != j5 || j5 != null && (n3 = (int)((l7 = (l4 = j5.q + l2) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1))) < 0) {
            Object object3;
            int n10;
            object = null;
            for (n3 = 0; n3 < (n10 = ((n[])(object3 = this.a)).length); ++n3) {
                this.b(n3);
            }
            if (j5 != null) {
                while ((object = ((androidx.media3.exoplayer.k)object2).j) != j5) {
                    ((androidx.media3.exoplayer.k)object2).a();
                }
                ((androidx.media3.exoplayer.k)object2).o(j5);
                j5.q = 1000000000000L;
                n3 = ((n[])object3).length;
                object = new boolean[n3];
                object3 = ((androidx.media3.exoplayer.k)object2).k;
                l4 = ((j)object3).e();
                this.e((boolean[])object, l4);
            }
        }
        if (j5 != null) {
            ((androidx.media3.exoplayer.k)object2).o(j5);
            n3 = (int)(j5.f ? 1 : 0);
            if (n3 == 0) {
                j5.h = object = j5.h.b(l2);
            } else {
                n3 = (int)(j5.g ? 1 : 0);
                if (n3 != 0) {
                    object = j5.a;
                    l2 = object.f(l2);
                    long l8 = this.n;
                    l8 = l2 - l8;
                    boolean bl5 = this.o;
                    object.p(l8, bl5);
                }
            }
            this.J(l2);
            this.u();
        } else {
            ((androidx.media3.exoplayer.k)object2).b();
            this.J(l2);
        }
        this.m(false);
        this.i.k(n4);
        return l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void R(m object) {
        Looper looper = ((m)object).f;
        Object object2 = this.k;
        H21 h21 = this.i;
        if (looper != object2) {
            int n3 = 15;
            object = h21.d(n3, object);
            ((rh3$a_0)object).b();
            return;
        }
        // MONITORENTER : object
        // MONITOREXIT : object
        int n4 = 1;
        object2 = ((m)object).a;
        int n7 = ((m)object).d;
        Object object3 = ((m)object).e;
        object2.j(n7, object3);
        object = this.B;
        int n8 = ((Mt2)object).e;
        n4 = 3;
        int n10 = 2;
        if (n8 != n4) {
            if (n8 != n10) return;
        }
        h21.k(n10);
        return;
        finally {
            ((m)object).b(n4 != 0);
        }
    }

    public final void S(m m2) {
        Object object = m2.f;
        Runnable runnable2 = object.getThread();
        boolean bl2 = runnable2.isAlive();
        if (!bl2) {
            Cx.f("Trying to send message on a dead thread.");
            m2.b(false);
            return;
        }
        object = this.r.b((Looper)object, null);
        runnable2 = new BF0(0, this, m2);
        ((rh3_0)object).i(runnable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void U(boolean n3, AtomicBoolean atomicBoolean) {
        int n4 = this.L;
        if (n4 != n3) {
            this.L = n3;
            if (!n3) {
                for (n n7 : this.a) {
                    Set set;
                    boolean bl2 = androidx.media3.exoplayer.g.s(n7);
                    if (bl2 || !(bl2 = (set = this.b).remove(n7))) continue;
                    n7.reset();
                }
            }
        }
        if (atomicBoolean == null) return;
        synchronized (this) {
            n3 = 1;
            atomicBoolean.set(n3 != 0);
            this.notifyAll();
            return;
        }
    }

    public final void V(g$a object) {
        Object object2 = this.C;
        ((g$d)object2).a(1);
        int n3 = ((g$a)object).c;
        int n4 = -1;
        s s7 = ((g$a)object).b;
        List list = ((g$a)object).a;
        if (n3 != n4) {
            au2_0 au2_02 = new au2_0(list, s7);
            int n7 = ((g$a)object).c;
            long l2 = ((g$a)object).d;
            this.P = object2 = new g$g(au2_02, n7, l2);
        }
        object = this.u;
        object2 = ((l)object).b;
        n4 = ((ArrayList)object2).size();
        ((l)object).g(0, n4);
        n3 = ((ArrayList)object2).size();
        object = ((l)object).a(n3, list, s7);
        this.n((androidx.media3.common.g)object, false);
    }

    public final void W(boolean bl2) {
        this.E = bl2;
        this.I();
        bl2 = this.F;
        if (bl2) {
            Object object = this.t;
            j j3 = ((androidx.media3.exoplayer.k)object).k;
            object = ((androidx.media3.exoplayer.k)object).j;
            if (j3 != object) {
                this.O(true);
                bl2 = false;
                object = null;
                this.m(false);
            }
        }
    }

    public final void X(int n3, int n4, boolean bl2, boolean n7) {
        Object object = this.C;
        ((g$d)object).a(n7);
        DF0[] dF0Array = this.B;
        Object object2 = dF0Array.d(n4, n3, bl2);
        this.B = object2;
        n3 = 0;
        object2 = null;
        this.o0(false, false);
        j j3 = this.t.j;
        while (j3 != null) {
            for (DF0 dF0 : j3.p.c) {
                if (dF0 == null) continue;
                dF0.h(bl2);
            }
            j3 = j3.n;
        }
        n3 = (int)(this.e0() ? 1 : 0);
        if (n3 == 0) {
            this.i0();
            this.m0();
        } else {
            object2 = this.B;
            n3 = ((Mt2)object2).e;
            n4 = 3;
            H21 h21 = this.i;
            n7 = 2;
            if (n3 == n4) {
                object2 = this.p;
                n4 = 1;
                ((d)object2).f = n4;
                object2 = ((d)object2).a;
                int n8 = (int)(((ob3_1)object2).b ? 1 : 0);
                if (n8 == 0) {
                    long l2;
                    object = ((ob3_1)object2).a;
                    ((ob3_1)object2).d = l2 = object.elapsedRealtime();
                    ((ob3_1)object2).b = n4;
                }
                this.g0();
                h21.k(n7);
            } else if (n3 == n7) {
                h21.k(n7);
            }
        }
    }

    public final void Y(ot2_0 ot2_02) {
        this.i.l(16);
        d d2 = this.p;
        d2.setPlaybackParameters(ot2_02);
        ot2_02 = d2.getPlaybackParameters();
        float f5 = ot2_02.a;
        boolean bl2 = true;
        this.p(ot2_02, f5, bl2, bl2);
    }

    public final void Z(ExoPlayer$e exoPlayer$e) {
        this.Z = exoPlayer$e;
        androidx.media3.common.g g3 = this.B.a;
        androidx.media3.exoplayer.k k2 = this.t;
        k2.i = exoPlayer$e;
        k2.i(g3);
    }

    public final void a(g$a object, int n3) {
        Object object2 = this.C;
        int n4 = 1;
        ((g$d)object2).a(n4);
        int n7 = -1;
        l l2 = this.u;
        if (n3 == n7) {
            ArrayList arrayList = l2.b;
            n3 = arrayList.size();
        }
        object2 = ((g$a)object).a;
        object = ((g$a)object).b;
        object = l2.a(n3, (List)object2, (s)object);
        this.n((androidx.media3.common.g)object, false);
    }

    public final void a0(int n3) {
        this.J = n3;
        androidx.media3.common.g g3 = this.B.a;
        androidx.media3.exoplayer.k k2 = this.t;
        k2.g = n3;
        n3 = (int)(k2.t(g3) ? 1 : 0);
        if (n3 == 0) {
            n3 = 1;
            this.O(n3 != 0);
        }
        this.m(false);
    }

    public final void b(int n3) {
        n n4 = this.a[n3];
        int n7 = androidx.media3.exoplayer.g.s(n4);
        if (n7 == 0) {
            return;
        }
        n7 = 0;
        this.y(n3, false);
        d d2 = this.p;
        n n8 = d2.c;
        int n10 = 1;
        if (n4 == n8) {
            n7 = 0;
            n8 = null;
            d2.d = null;
            d2.c = null;
            d2.e = n10;
        }
        if ((n3 = n4.getState()) == (n7 = 2)) {
            n4.stop();
        }
        n4.e();
        this.O = n3 = this.O - n10;
    }

    public final void b0(boolean bl2) {
        this.K = bl2;
        androidx.media3.common.g g3 = this.B.a;
        androidx.media3.exoplayer.k k2 = this.t;
        k2.h = bl2;
        bl2 = k2.t(g3);
        if (!bl2) {
            bl2 = true;
            this.O(bl2);
        }
        this.m(false);
    }

    public final void c(i i3) {
        this.i.d(8, i3).b();
    }

    public final void c0(s object) {
        this.C.a(1);
        l l2 = this.u;
        ArrayList arrayList = l2.b;
        int n3 = arrayList.size();
        int n4 = object.getLength();
        if (n4 != n3) {
            object = object.e().g(0, n3);
        }
        l2.j = object;
        object = l2.b();
        this.n((androidx.media3.common.g)object, false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void d() {
        block114: {
            block120: {
                block118: {
                    block119: {
                        block117: {
                            block106: {
                                block107: {
                                    block116: {
                                        block115: {
                                            block110: {
                                                block105: {
                                                    block113: {
                                                        block112: {
                                                            block111: {
                                                                block109: {
                                                                    block108: {
                                                                        var1_1 = this;
                                                                        var2_2 = this.r.a();
                                                                        var4_3 = this.i;
                                                                        var5_4 = 2;
                                                                        var4_3.l(var5_4);
                                                                        var4_3 = this.B.a;
                                                                        var6_5 = var4_3.q();
                                                                        var7_6 = 1;
                                                                        var8_7 = false;
                                                                        var9_8 = null;
                                                                        var10_9 = -9223372036854775807L;
                                                                        var12_10 = -4.9E-324;
                                                                        if (var6_5 != 0) break block108;
                                                                        var4_3 = this.u;
                                                                        var6_5 = var4_3.k;
                                                                        if (var6_5 != 0) break block109;
                                                                    }
                                                                    var14_11 = var2_2;
                                                                    var7_6 = 3;
                                                                    var2_2 = var10_9;
                                                                    var16_12 = var12_10;
                                                                    break block110;
                                                                }
                                                                var4_3 = this.t;
                                                                var18_13 = this.Q;
                                                                var4_3 = var4_3.l;
                                                                if (var4_3 != null) {
                                                                    var20_14 = var4_3.n;
                                                                    if (var20_14 == null) {
                                                                        var21_15 /* !! */  = 1;
                                                                    } else {
                                                                        var21_15 /* !! */  = 0;
                                                                        var20_14 = null;
                                                                    }
                                                                    ct3.f((boolean)var21_15 /* !! */ );
                                                                    var21_15 /* !! */  = var4_3.f;
                                                                    if (var21_15 /* !! */  != 0) {
                                                                        var20_14 = var4_3.a;
                                                                        var22_16 = var4_3.q;
                                                                        var20_14.q(var18_13 -= var22_16);
                                                                    }
                                                                }
                                                                var4_3 = var1_1.t;
                                                                var24_17 = var4_3.l;
                                                                if (var24_17 == null) break block111;
                                                                var25_18 = var24_17.h;
                                                                var26_19 = var25_18.i;
                                                                if (var26_19 != 0 || (var27_20 = (int)var24_17.g()) == 0) ** GOTO lbl-1000
                                                                var24_17 = var4_3.l.h;
                                                                var18_13 = var24_17.e;
                                                                cfr_temp_0 = var18_13 - var10_9;
                                                                var21_15 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                                if (var21_15 /* !! */  == 0) ** GOTO lbl-1000
                                                                var6_5 = var4_3.n;
                                                                var27_20 = 100;
                                                                var28_21 = 1.4E-43f;
                                                                if (var6_5 >= var27_20) ** GOTO lbl-1000
                                                            }
                                                            var4_3 = var1_1.t;
                                                            var18_13 = var1_1.Q;
                                                            var20_14 = var1_1.B;
                                                            var29_22 = var4_3.l;
                                                            if (var29_22 == null) {
                                                                var24_17 = var20_14.a;
                                                                var25_18 = var20_14.b;
                                                                var22_16 = var20_14.c;
                                                                var30_23 = var20_14.s;
                                                                var4_3 = var4_3.e((androidx.media3.common.g)var24_17, (j$b)var25_18, var22_16, var30_23);
                                                            } else {
                                                                var20_14 = var20_14.a;
                                                                var4_3 = var4_3.d((androidx.media3.common.g)var20_14, (j)var29_22, var18_13);
                                                            }
                                                            if (var4_3 != null) {
                                                                var24_17 = var1_1.t;
                                                                var25_18 = var24_17.l;
                                                                if (var25_18 == null) {
                                                                    var32_24 = 1000000000000L;
                                                                } else {
                                                                    var30_23 = var25_18.q;
                                                                    var25_18 = var25_18.h;
                                                                    var22_16 = var25_18.e;
                                                                    var30_23 += var22_16;
                                                                    var22_16 = var4_3.b;
                                                                    var32_24 = var30_23 -= var22_16;
                                                                }
                                                                var29_22 = var24_17.p((YM1)var4_3);
                                                                if (var29_22 == null) {
                                                                    var29_22 = (af0_0)var24_17.e;
                                                                    var29_22 = (g)var29_22.a;
                                                                    var35_26 = var29_22.g.d();
                                                                    var36_27 = var29_22.Z;
                                                                    var22_16 = var36_27.a;
                                                                    var37_28 /* !! */  = var29_22.u;
                                                                    var38_29 = var29_22.f;
                                                                    var39_30 = var29_22.c;
                                                                    var29_22 = var29_22.e;
                                                                    var40_31 /* !! */  = var29_22;
                                                                    var41_32 = var4_3;
                                                                    var42_33 = var22_16;
                                                                    var29_22 = var34_25 = new j((o[])var39_30, var32_24, (Gp3)var29_22, (Cj0)var35_26, (l)var37_28 /* !! */ , (YM1)var4_3, (Hp3)var38_29, var22_16);
                                                                } else {
                                                                    var29_22.h = var4_3;
                                                                    var29_22.q = var32_24;
                                                                }
                                                                var25_18 = var24_17.l;
                                                                if (var25_18 != null) {
                                                                    var20_14 = var25_18.n;
                                                                    if (var29_22 != var20_14) {
                                                                        var25_18.b();
                                                                        var25_18.n = var29_22;
                                                                        var25_18.c();
                                                                    }
                                                                } else {
                                                                    var24_17.j = var29_22;
                                                                    var24_17.k = var29_22;
                                                                }
                                                                var24_17.o = null;
                                                                var24_17.l = var29_22;
                                                                var26_19 = var24_17.n + var7_6;
                                                                var24_17.n = var26_19;
                                                                var24_17.m();
                                                                var27_20 = (int)var29_22.e;
                                                                if (var27_20 == 0) {
                                                                    var18_13 = var4_3.b;
                                                                    var29_22.e = var7_6;
                                                                    var20_14 = var29_22.a;
                                                                    var20_14.k((i$a)var1_1, var18_13);
                                                                } else {
                                                                    var27_20 = (int)var29_22.f;
                                                                    if (var27_20 != 0) {
                                                                        var24_17 = var1_1.i;
                                                                        var25_18 = var29_22.a;
                                                                        var21_15 /* !! */  = 8;
                                                                        var24_17 = var24_17.d(var21_15 /* !! */ , var25_18);
                                                                        var24_17.b();
                                                                    }
                                                                }
                                                                var24_17 = var1_1.t.j;
                                                                if (var24_17 == var29_22) {
                                                                    var44_34 = var4_3.b;
                                                                    var1_1.J(var44_34);
                                                                }
                                                                var6_5 = 0;
                                                                var4_3 = null;
                                                                var1_1.m(false);
                                                                var5_4 = 1;
                                                            } else lbl-1000:
                                                            // 4 sources

                                                            {
                                                                var5_4 = 0;
                                                                var36_27 = null;
                                                            }
                                                            var6_5 = (int)var1_1.I;
                                                            if (var6_5 != 0) {
                                                                var4_3 = var1_1.t.l;
                                                                var6_5 = (int)androidx.media3.exoplayer.g.r((j)var4_3);
                                                                var1_1.I = var6_5;
                                                                this.j0();
                                                            } else {
                                                                this.u();
                                                            }
                                                            var39_30 = var1_1.t;
                                                            var4_3 = var39_30.k;
                                                            if (var4_3 == null) lbl-1000:
                                                            // 5 sources

                                                            {
                                                                while (true) {
                                                                    var39_30 = var1_1;
                                                                    var46_39 = -9223372036854775807L;
                                                                    var48_40 = -4.9E-324;
                                                                    break block105;
                                                                    break;
                                                                }
                                                            }
                                                            var24_17 = var4_3.n;
                                                            var50_35 = var1_1.a;
                                                            if (var24_17 != null && (var27_20 = (int)var1_1.F) == 0) break block112;
                                                            var39_30 = var1_1;
                                                            var46_39 = -9223372036854775807L;
                                                            var48_40 = -4.9E-324;
                                                            break block113;
                                                        }
                                                        var27_20 = (int)var4_3.f;
                                                        if (var27_20 == 0) ** GOTO lbl-1000
                                                        var28_21 = 0.0f;
                                                        var24_17 = null;
                                                        for (var27_20 = 0; var27_20 < (var26_19 = ((n[])var50_35).length); ++var27_20) {
                                                            var25_18 = var50_35[var27_20];
                                                            var20_14 = var4_3.c[var27_20];
                                                            var29_22 = var25_18.getStream();
                                                            if (var29_22 != var20_14) ** GOTO lbl-1000
                                                            if (var20_14 == null || (var21_15 /* !! */  = (int)var25_18.h()) != 0) continue;
                                                            var20_14 = var4_3.n;
                                                            var29_22 = var4_3.h;
                                                            var51_36 /* !! */  = (int)var29_22.f;
                                                            if (var51_36 /* !! */  == 0 || (var51_36 /* !! */  = var20_14.f) == 0 || (var51_36 /* !! */  = var25_18 instanceof rm3) == 0 && (var51_36 /* !! */  = var25_18 instanceof io1_0) == 0 && (var54_38 = (int)((cfr_temp_1 = (var52_37 = var25_18.v()) - (var32_24 = var20_14.e())) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) < 0) ** GOTO lbl-1000
                                                        }
                                                        var24_17 = var4_3.n;
                                                        var26_19 = (int)var24_17.f;
                                                        if (var26_19 != 0 || (var27_20 = (int)((cfr_temp_2 = (var32_24 = var1_1.Q) - (var52_37 = var24_17.e())) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) >= 0) ** break;
                                                        ** while (true)
                                                        var34_25 = var4_3.p;
                                                        var24_17 = var39_30.k;
                                                        ct3.h(var24_17);
                                                        var39_30.k = var24_17 = var24_17.n;
                                                        var39_30.m();
                                                        var37_28 /* !! */  = var39_30.k;
                                                        ct3.h(var37_28 /* !! */ );
                                                        var38_29 = var37_28 /* !! */ .p;
                                                        var20_14 = var1_1.B.a;
                                                        var25_18 = var37_28 /* !! */ .h.a;
                                                        var29_22 = var4_3.h.a;
                                                        var55_41 = -9223372036854775807L;
                                                        var57_42 = -4.9E-324;
                                                        var4_3 = this;
                                                        var24_17 = var20_14;
                                                        var59_43 = var37_28 /* !! */ ;
                                                        var60_44 = var38_29;
                                                        var46_39 = -9223372036854775807L;
                                                        var48_40 = -4.9E-324;
                                                        var10_9 = var55_41;
                                                        var12_10 = var57_42;
                                                        var61_45 = var34_25;
                                                        var62_46 = 0;
                                                        var34_25 = null;
                                                        this.n0((androidx.media3.common.g)var20_14, (j$b)var25_18, (androidx.media3.common.g)var20_14, (j$b)var29_22, var55_41, false);
                                                        var6_5 = (int)var37_28 /* !! */ .f;
                                                        if (var6_5 != 0 && (var26_19 = (int)((cfr_temp_3 = (var44_34 = (var4_3 = var37_28 /* !! */ .a).g()) - var46_39) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1))) != 0) {
                                                            var44_34 = var37_28 /* !! */ .e();
                                                            var26_19 = ((Object)var50_35).length;
                                                            var20_14 = null;
                                                            for (var21_15 /* !! */  = 0; var21_15 /* !! */  < var26_19; ++var21_15 /* !! */ ) {
                                                                var29_22 = var50_35[var21_15 /* !! */ ];
                                                                var37_28 /* !! */  = var29_22.getStream();
                                                                if (var37_28 /* !! */  == null) continue;
                                                                androidx.media3.exoplayer.g.T((n)var29_22, var44_34);
                                                            }
                                                            var6_5 = (int)var59_43.g();
                                                            if (var6_5 == 0) {
                                                                var39_30.o((j)var59_43);
                                                                var6_5 = 0;
                                                                var4_3 = null;
                                                                var39_30 = this;
                                                                this.m(false);
                                                                this.u();
                                                            } else {
                                                                var39_30 = this;
                                                            }
                                                        } else {
                                                            var39_30 = this;
                                                            var4_3 = null;
                                                            for (var6_5 = 0; var6_5 < (var27_20 = ((Object)var50_35).length); ++var6_5) {
                                                                var24_17 = var61_45;
                                                                var26_19 = (int)var61_45.b(var6_5);
                                                                var20_14 = var60_44;
                                                                var51_36 /* !! */  = (int)var60_44.b(var6_5);
                                                                if (var26_19 != 0 && (var26_19 = (int)(var25_18 = var50_35[var6_5]).l()) == 0) {
                                                                    var25_18 = (androidx.media3.exoplayer.b)var39_30.c[var6_5];
                                                                    var26_19 = var25_18.b;
                                                                    var63_47 = -2;
                                                                    if (var26_19 == var63_47) {
                                                                        var26_19 = 1;
                                                                    } else {
                                                                        var26_19 = 0;
                                                                        var25_18 = null;
                                                                    }
                                                                    var37_28 /* !! */  = var24_17.b[var6_5];
                                                                    var38_29 = var20_14.b[var6_5];
                                                                    if (var51_36 /* !! */  == 0 || (var51_36 /* !! */  = (int)var38_29.equals(var37_28 /* !! */ )) == 0 || var26_19 != 0) {
                                                                        var25_18 = var50_35[var6_5];
                                                                        var52_37 = var59_43.e();
                                                                        androidx.media3.exoplayer.g.T((n)var25_18, var52_37);
                                                                    }
                                                                }
                                                                var61_45 = var24_17;
                                                                var60_44 = var20_14;
                                                            }
                                                        }
                                                        break block105;
                                                    }
                                                    var24_17 = var4_3.h;
                                                    var27_20 = (int)var24_17.i;
                                                    if (var27_20 == 0 && (var27_20 = (int)var1_1.F) == 0) break block105;
                                                    var28_21 = 0.0f;
                                                    var24_17 = null;
                                                    for (var27_20 = 0; var27_20 < (var26_19 = ((n[])var50_35).length); ++var27_20) {
                                                        var25_18 = var50_35[var27_20];
                                                        var20_14 = var4_3.c[var27_20];
                                                        if (var20_14 == null || (var29_22 = var25_18.getStream()) != var20_14 || (var21_15 /* !! */  = (int)var25_18.h()) == 0) continue;
                                                        var20_14 = var4_3.h;
                                                        var30_23 = var20_14.e;
                                                        cfr_temp_4 = var30_23 - var46_39;
                                                        var63_47 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                                                        if (var63_47 == 0) ** GOTO lbl-1000
                                                        var10_9 = -9223372036854775808L;
                                                        var12_10 = -0.0;
                                                        var62_46 = (int)(var30_23 == var10_9 ? 0 : (var30_23 < var10_9 ? -1 : 1));
                                                        if (var62_46) {
                                                            var10_9 = var4_3.q + var30_23;
                                                        } else lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var10_9 = var46_39;
                                                            var12_10 = var48_40;
                                                        }
                                                        androidx.media3.exoplayer.g.T((n)var25_18, var10_9);
                                                    }
                                                }
                                                var4_3 = var39_30.t;
                                                var24_17 = var4_3.k;
                                                if (var24_17 != null && (var4_3 = var4_3.j) != var24_17 && (var6_5 = (int)var24_17.i) == 0) {
                                                    var4_3 = var24_17.p;
                                                    var25_18 = null;
                                                    var21_15 /* !! */  = 0;
                                                    var20_14 = null;
                                                    for (var26_19 = 0; var26_19 < (var63_47 = ((n[])(var29_22 = var39_30.a)).length); ++var26_19) {
                                                        var35_26 = var29_22[var26_19];
                                                        var51_36 /* !! */  = (int)androidx.media3.exoplayer.g.s((n)var35_26);
                                                        if (var51_36 /* !! */  == 0) continue;
                                                        var29_22 = var35_26.getStream();
                                                        if (var29_22 != (var38_29 = (var37_28 /* !! */  = var24_17.c)[var26_19])) {
                                                            var51_36 /* !! */  = 1;
                                                        } else {
                                                            var51_36 /* !! */  = 0;
                                                            var29_22 = null;
                                                        }
                                                        var54_38 = (int)var4_3.b(var26_19);
                                                        if (var54_38 && var51_36 /* !! */  == 0) continue;
                                                        var51_36 /* !! */  = (int)var35_26.l();
                                                        if (var51_36 /* !! */  == 0) {
                                                            var29_22 = var4_3.c[var26_19];
                                                            if (var29_22 != null) {
                                                                var54_38 = var29_22.length();
                                                            } else {
                                                                var54_38 = 0;
                                                                var38_29 = null;
                                                            }
                                                            var34_25 = new androidx.media3.common.d[var54_38];
                                                            var50_35 = null;
                                                            for (var64_48 = 0; var64_48 < var54_38; var64_48 += 1) {
                                                                var34_25[var64_48] = var59_43 = var29_22.a(var64_48);
                                                            }
                                                            var41_32 = var37_28 /* !! */ [var26_19];
                                                            var65_49 = var24_17.e();
                                                            var52_37 = var24_17.q;
                                                            var38_29 = var24_17.h.a;
                                                            var35_26.p((androidx.media3.common.d[])var34_25, (VR2)var41_32, var65_49, var52_37, (j$b)var38_29);
                                                            var51_36 /* !! */  = (int)var39_30.N;
                                                            if (var51_36 /* !! */  == 0 || var51_36 /* !! */  == 0) continue;
                                                            var39_30.N = false;
                                                            var29_22 = var39_30.B;
                                                            var51_36 /* !! */  = (int)var29_22.p;
                                                            if (var51_36 /* !! */  == 0) continue;
                                                            var29_22 = var39_30.i;
                                                            var63_47 = 2;
                                                            var29_22.k(var63_47);
                                                            continue;
                                                        }
                                                        var51_36 /* !! */  = (int)var35_26.b();
                                                        if (var51_36 /* !! */  != 0) {
                                                            var39_30.b(var26_19);
                                                            continue;
                                                        }
                                                        var21_15 /* !! */  = 1;
                                                    }
                                                    var26_19 = 1;
                                                    var6_5 = var21_15 /* !! */  ^ 1;
                                                    if (var6_5 != 0) {
                                                        var6_5 = ((n[])var29_22).length;
                                                        var4_3 = new boolean[var6_5];
                                                        var24_17 = var39_30.t.k;
                                                        var18_13 = var24_17.e();
                                                        var39_30.e((boolean[])var4_3, var18_13);
                                                    }
                                                }
                                                var6_5 = 0;
                                                var4_3 = null;
                                                while (true) {
                                                    if ((var27_20 = (int)this.e0()) == 0) lbl-1000:
                                                    // 3 sources

                                                    {
                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    var27_20 = (int)var39_30.F;
                                                    if (var27_20 != 0) ** GOTO lbl-1000
                                                    var50_35 = var39_30.t;
                                                    var24_17 = var50_35.j;
                                                    if (var24_17 != null && (var24_17 = var24_17.n) != null && (var54_38 = (int)((cfr_temp_5 = (var32_24 = var39_30.Q) - (var52_37 = var24_17.e())) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1))) >= 0 && (var27_20 = (int)var24_17.i) != 0) ** break;
                                                    ** continue;
                                                    if (var6_5 != 0) {
                                                        this.w();
                                                    }
                                                    var4_3 = var50_35.a();
                                                    var4_3.getClass();
                                                    var24_17 = var39_30.B.b.a;
                                                    var25_18 = var4_3.h.a.a;
                                                    var27_20 = (int)var24_17.equals(var25_18);
                                                    if (var27_20 == 0) ** GOTO lbl-1000
                                                    var24_17 = var39_30.B.b;
                                                    var26_19 = var24_17.b;
                                                    var21_15 /* !! */  = -1;
                                                    if (var26_19 != var21_15 /* !! */ ) ** GOTO lbl-1000
                                                    var25_18 = var4_3.h.a;
                                                    var51_36 /* !! */  = var25_18.b;
                                                    if (var51_36 /* !! */  == var21_15 /* !! */  && (var27_20 = var24_17.e) != (var26_19 = var25_18.e)) {
                                                        var27_20 = 1;
                                                        var28_21 = 1.4E-45f;
                                                    } else lbl-1000:
                                                    // 3 sources

                                                    {
                                                        var27_20 = 0;
                                                        var28_21 = 0.0f;
                                                        var24_17 = null;
                                                    }
                                                    var4_3 = var4_3.h;
                                                    var25_18 = var4_3.a;
                                                    var67_50 = var4_3.b;
                                                    var52_37 = var4_3.c;
                                                    var7_6 = var27_20 ^ 1;
                                                    var4_3 = this;
                                                    var24_17 = var25_18;
                                                    var32_24 = var67_50;
                                                    var1_1 = var39_30;
                                                    var69_51 = var7_6;
                                                    var14_11 = var2_2;
                                                    var2_2 = -9223372036854775807L;
                                                    var16_12 = -4.9E-324;
                                                    var7_6 = 3;
                                                    var8_7 = false;
                                                    var9_8 = null;
                                                    var39_30.B = var4_3 = this.q((j$b)var25_18, var67_50, var52_37, var67_50, (boolean)var69_51, 0);
                                                    this.I();
                                                    this.m0();
                                                    var4_3 = var39_30.B;
                                                    var6_5 = var4_3.e;
                                                    if (var6_5 == var7_6) {
                                                        this.g0();
                                                    }
                                                    var4_3 = var50_35.j.p;
                                                    var28_21 = 0.0f;
                                                    var24_17 = null;
                                                    for (var27_20 = 0; var27_20 < (var21_15 /* !! */  = ((n[])(var25_18 = var1_1.a)).length); ++var27_20) {
                                                        var21_15 /* !! */  = (int)var4_3.b(var27_20);
                                                        if (var21_15 /* !! */  == 0) continue;
                                                        var25_18 = var25_18[var27_20];
                                                        var25_18.d();
                                                    }
                                                    var39_30 = var1_1;
                                                    var46_39 = var2_2;
                                                    var48_40 = var16_12;
                                                    var2_2 = var14_11;
                                                    var6_5 = 1;
                                                }
                                                var14_11 = var2_2;
                                                var7_6 = 3;
                                                var2_2 = var46_39;
                                                var16_12 = var48_40;
                                                var1_1 = var39_30;
                                                var4_3 = var39_30.Z;
                                                var44_34 = var4_3.a;
                                                var26_19 = (int)(var44_34 == var46_39 ? 0 : (var44_34 < var46_39 ? -1 : 1));
                                                if (var26_19 != 0) {
                                                    if (var5_4 != 0 || (var6_5 = (int)(var4_3 = var39_30.B.a).equals(var24_17 = var39_30.k0)) == 0) {
                                                        var1_1.k0 = var4_3 = var1_1.B.a;
                                                        var24_17 = var1_1.t;
                                                        var24_17.i((androidx.media3.common.g)var4_3);
                                                    }
                                                    this.v();
                                                }
                                            }
                                            var4_3 = var1_1.B;
                                            var6_5 = var4_3.e;
                                            var27_20 = 1;
                                            var28_21 = 1.4E-45f;
                                            if (var6_5 == var27_20) break block114;
                                            var27_20 = 4;
                                            var28_21 = 5.6E-45f;
                                            if (var6_5 == var27_20) break block114;
                                            var4_3 = var1_1.t.j;
                                            if (var4_3 == null) {
                                                var32_24 = var14_11;
                                                var1_1.N(var14_11);
                                                return;
                                            }
                                            var32_24 = var14_11;
                                            var29_22 = "doSomeWork";
                                            Trace.beginSection((String)var29_22);
                                            this.m0();
                                            var51_36 /* !! */  = var4_3.f;
                                            if (var51_36 /* !! */  != 0) {
                                                var1_1.R = var52_37 = gz3.I(var1_1.r.elapsedRealtime());
                                                var29_22 = var4_3.a;
                                                var37_28 /* !! */  = var1_1.B;
                                                var10_9 = var37_28 /* !! */ .s;
                                                var70_52 = var1_1.n;
                                                var62_46 = var1_1.o;
                                                var29_22.p(var10_9 -= var70_52, (boolean)var62_46);
                                                var51_36 /* !! */  = 1;
                                                var63_47 = 1;
                                                var38_29 = null;
                                                for (var54_38 = 0; var54_38 < (var69_51 = ((n[])(var34_25 = var1_1.a)).length); var54_38 += 1) {
                                                    var69_51 = (int)androidx.media3.exoplayer.g.s((n)(var34_25 = var34_25[var54_38]));
                                                    if (!var69_51) {
                                                        var69_51 = 0;
                                                        var39_30 = null;
                                                        var1_1.y(var54_38, false);
                                                        continue;
                                                    }
                                                    var72_53 = var1_1.Q;
                                                    var22_16 = var1_1.R;
                                                    var34_25.g(var72_53, var22_16);
                                                    if (var51_36 /* !! */  != 0 && (var51_36 /* !! */  = (int)var34_25.b()) != 0) {
                                                        var51_36 /* !! */  = 1;
                                                    } else {
                                                        var51_36 /* !! */  = 0;
                                                        var29_22 = null;
                                                    }
                                                    var39_30 = var4_3.c[var54_38];
                                                    var9_8 = var34_25.getStream();
                                                    if (var39_30 != var9_8) {
                                                        var69_51 = 1;
                                                    } else {
                                                        var69_51 = 0;
                                                        var39_30 = null;
                                                    }
                                                    if (!var69_51 && (var8_7 = var34_25.h())) {
                                                        var8_7 = true;
                                                    } else {
                                                        var8_7 = false;
                                                        var9_8 = null;
                                                    }
                                                    if (!(var69_51 || var8_7 || (var69_51 = (int)var34_25.c()) || (var62_46 = var34_25.b()))) {
                                                        var62_46 = 0;
                                                        var34_25 = null;
                                                    } else {
                                                        var62_46 = 1;
                                                    }
                                                    var1_1.y(var54_38, (boolean)var62_46);
                                                    if (var63_47 != 0 && var62_46) {
                                                        var63_47 = 1;
                                                    } else {
                                                        var63_47 = 0;
                                                        var37_28 /* !! */  = null;
                                                    }
                                                    if (var62_46) continue;
                                                    var1_1.x(var54_38);
                                                }
                                            } else {
                                                var29_22 = var4_3.a;
                                                var29_22.i();
                                                var51_36 /* !! */  = 1;
                                                var63_47 = 1;
                                            }
                                            var38_29 = var4_3.h;
                                            var67_50 = var38_29.e;
                                            if (var51_36 /* !! */  == 0 || (var51_36 /* !! */  = var4_3.f) == 0) ** GOTO lbl-1000
                                            var51_36 /* !! */  = (int)(var67_50 == var2_2 ? 0 : (var67_50 < var2_2 ? -1 : 1));
                                            if (var51_36 /* !! */  == 0) ** GOTO lbl-1000
                                            var29_22 = var1_1.B;
                                            var72_53 = var29_22.s;
                                            cfr_temp_6 = var67_50 - var72_53;
                                            var51_36 /* !! */  = (int)(cfr_temp_6 == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1));
                                            if (var51_36 /* !! */  <= 0) lbl-1000:
                                            // 2 sources

                                            {
                                                var51_36 /* !! */  = 1;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var51_36 /* !! */  = 0;
                                                var29_22 = null;
                                            }
                                            if (var51_36 /* !! */  != 0 && (var54_38 = var1_1.F)) {
                                                var54_38 = 0;
                                                var38_29 = null;
                                                var1_1.F = false;
                                                var34_25 = var1_1.B;
                                                var62_46 = var34_25.n;
                                                var69_51 = 5;
                                                var1_1.X(var62_46, var69_51, false, false);
                                            }
                                            if (var51_36 /* !! */  != 0) {
                                                var29_22 = var4_3.h;
                                                var51_36 /* !! */  = var29_22.i;
                                                if (var51_36 /* !! */  != 0) {
                                                    var1_1.d0(var27_20);
                                                    this.i0();
                                                    var14_11 = var32_24;
                                                    while (true) {
                                                        var26_19 = 1;
                                                        break block106;
                                                        break;
                                                    }
                                                }
                                            }
                                            var29_22 = var1_1.B;
                                            var54_38 = var29_22.e;
                                            var62_46 = 2;
                                            if (var54_38 != var62_46) ** GOTO lbl632
                                            var54_38 = var1_1.O;
                                            if (var54_38) break block115;
                                            var51_36 /* !! */  = (int)this.t();
                                            var14_11 = var32_24;
                                            var27_20 = var51_36 /* !! */ ;
                                            break block107;
                                        }
                                        if (var63_47 != 0) break block116;
                                        var14_11 = var32_24;
                                        var27_20 = 0;
                                        var28_21 = 0.0f;
                                        var24_17 = null;
                                        break block107;
                                    }
                                    var54_38 = (int)var29_22.g;
                                    if (!var54_38) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            var14_11 = var32_24;
                                            var27_20 = 1;
                                            var28_21 = 1.4E-45f;
                                            break block107;
                                            break;
                                        }
                                    }
                                    var38_29 = var1_1.t;
                                    var34_25 = var38_29.j;
                                    var29_22 = var29_22.a;
                                    var39_30 = var34_25.h.a;
                                    var51_36 /* !! */  = (int)var1_1.f0((androidx.media3.common.g)var29_22, (j$b)var39_30);
                                    if (var51_36 /* !! */  != 0) {
                                        var29_22 = (km0_0)var1_1.v;
                                        var74_54 = var72_53 = var29_22.i;
                                    } else {
                                        var74_54 = var2_2;
                                    }
                                    var29_22 = var38_29.l;
                                    var54_38 = (int)var29_22.g();
                                    if (!var54_38) ** GOTO lbl-1000
                                    var38_29 = var29_22.h;
                                    var54_38 = (int)var38_29.i;
                                    if (var54_38) {
                                        var54_38 = 1;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var54_38 = 0;
                                        var38_29 = null;
                                    }
                                    var39_30 = var29_22.h.a;
                                    var69_51 = (int)var39_30.b();
                                    if (var69_51 && !(var69_51 = (int)var29_22.f)) {
                                        var69_51 = 1;
                                    } else {
                                        var69_51 = 0;
                                        var39_30 = null;
                                    }
                                    ** while (var54_38 || var69_51)
lbl591:
                                    // 1 sources

                                    var72_53 = var29_22.d();
                                    var76_55 = var1_1.j(var72_53);
                                    var38_29 = var1_1.B.a;
                                    var39_30 = var34_25.h.a;
                                    var22_16 = var1_1.Q;
                                    var14_11 = var32_24;
                                    var18_13 = var34_25.q;
                                    var42_33 = var22_16 - var18_13;
                                    var28_21 = var1_1.p.getPlaybackParameters().a;
                                    var25_18 = var1_1.B;
                                    var26_19 = (int)var25_18.l;
                                    var26_19 = (int)var1_1.G;
                                    var20_14 = var1_1.x;
                                    var35_26 = var29_22;
                                    var41_32 = var38_29;
                                    var29_22 = new h$a((nu2)var20_14, (androidx.media3.common.g)var38_29, (j$b)var39_30, var42_33, var76_55, var28_21, (boolean)var26_19, var74_54);
                                    var24_17 = var1_1.g;
                                    var27_20 = (int)var24_17.a((h$a)var29_22);
                                }
                                if (var27_20 != 0) {
                                    var1_1.d0(var7_6);
                                    var28_21 = 0.0f;
                                    var24_17 = null;
                                    var1_1.U = null;
                                    if ((var27_20 = (int)this.e0()) == 0) ** continue;
                                    var27_20 = 0;
                                    var28_21 = 0.0f;
                                    var1_1.o0(false, false);
                                    var24_17 = var1_1.p;
                                    var26_19 = 1;
                                    var24_17.f = var26_19;
                                    var24_17 = var24_17.a;
                                    var21_15 /* !! */  = (int)var24_17.b;
                                    if (var21_15 /* !! */  == 0) {
                                        var20_14 = var24_17.a;
                                        var24_17.d = var30_23 = var20_14.elapsedRealtime();
                                        var24_17.b = var26_19;
                                    }
                                    this.g0();
                                } else lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl632:
                                    // 1 sources

                                    var14_11 = var32_24;
                                    ** continue;
                                    var26_19 = 1;
                                    var24_17 = var1_1.B;
                                    var27_20 = var24_17.e;
                                    if (var27_20 == var7_6 && !((var27_20 = var1_1.O) != 0 ? var63_47 != 0 : (var27_20 = (int)this.t()) != 0)) {
                                        var27_20 = (int)this.e0();
                                        var21_15 /* !! */  = 0;
                                        var20_14 = null;
                                        var1_1.o0((boolean)var27_20, false);
                                        var28_21 = 2.8E-45f;
                                        var1_1.d0(2);
                                        var27_20 = (int)var1_1.G;
                                        if (var27_20 != 0) {
                                            var24_17 = var1_1.t.j;
                                            while (var24_17 != null) {
                                                var20_14 = var24_17.p.c;
                                                var51_36 /* !! */  = ((Object)var20_14).length;
                                                var37_28 /* !! */  = null;
                                                for (var63_47 = 0; var63_47 < var51_36 /* !! */ ; ++var63_47) {
                                                    var38_29 = var20_14[var63_47];
                                                    if (var38_29 == null) continue;
                                                    var38_29.l();
                                                }
                                                var24_17 = var24_17.n;
                                            }
                                            var24_17 = (km0_0)var1_1.v;
                                            var30_23 = var24_17.i;
                                            cfr_temp_7 = var30_23 - var2_2;
                                            var63_47 = (int)(cfr_temp_7 == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1));
                                            if (var63_47 != 0) {
                                                var10_9 = var24_17.b;
                                                var24_17.i = var30_23 += var10_9;
                                                var10_9 = var24_17.h;
                                                cfr_temp_8 = var10_9 - var2_2;
                                                var62_46 = (int)(cfr_temp_8 == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1));
                                                if (var62_46 && (var62_46 = (int)(var30_23 == var10_9 ? 0 : (var30_23 < var10_9 ? -1 : 1))) > 0) {
                                                    var24_17.i = var10_9;
                                                }
                                                var24_17.m = var2_2;
                                            }
                                        }
                                        this.i0();
                                    }
                                }
                            }
                            var24_17 = var1_1.B;
                            var27_20 = var24_17.e;
                            var21_15 /* !! */  = 2;
                            if (var27_20 != var21_15 /* !! */ ) ** GOTO lbl-1000
                            var28_21 = 0.0f;
                            var24_17 = null;
                            for (var27_20 = 0; var27_20 < (var51_36 /* !! */  = ((n[])(var20_14 = var1_1.a)).length); ++var27_20) {
                                var21_15 /* !! */  = (int)androidx.media3.exoplayer.g.s((n)(var20_14 = var20_14[var27_20]));
                                if (var21_15 /* !! */  == 0 || (var20_14 = var1_1.a[var27_20].getStream()) != (var29_22 = var4_3.c[var27_20])) continue;
                                var1_1.x(var27_20);
                            }
                            var4_3 = var1_1.B;
                            var27_20 = (int)var4_3.g;
                            if (var27_20 == 0 && (var63_47 = (int)((cfr_temp_9 = (var44_34 = var4_3.r) - (var30_23 = 500000L)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1))) < 0 && (var6_5 = (int)androidx.media3.exoplayer.g.r((j)(var4_3 = var1_1.t.l))) != 0) {
                                var6_5 = 1;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var6_5 = 0;
                                var4_3 = null;
                            }
                            if (var6_5 != 0) break block117;
                            var1_1.Y = var2_2;
                            break block118;
                        }
                        var44_34 = var1_1.Y;
                        cfr_temp_10 = var44_34 - var2_2;
                        var21_15 /* !! */  = (int)(cfr_temp_10 == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1));
                        if (var21_15 /* !! */  != 0) break block119;
                        var4_3 = var1_1.r;
                        var1_1.Y = var44_34 = var4_3.elapsedRealtime();
                        break block118;
                    }
                    var4_3 = var1_1.r;
                    var44_34 = var4_3.elapsedRealtime();
                    var30_23 = var1_1.Y;
                    cfr_temp_11 = (var44_34 -= var30_23) - (var30_23 = 4000L);
                    var63_47 = (int)(cfr_temp_11 == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1));
                    if (var63_47 >= 0) break block120;
                }
                var6_5 = (int)this.e0();
                if (var6_5 == 0) ** GOTO lbl-1000
                var4_3 = var1_1.B;
                var6_5 = var4_3.e;
                if (var6_5 == var7_6) {
                    var6_5 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    var6_5 = 0;
                    var4_3 = null;
                }
                var27_20 = (int)var1_1.N;
                if (var27_20 == 0 || (var27_20 = (int)var1_1.M) == 0 || var6_5 == 0) {
                    var26_19 = 0;
                    var25_18 = null;
                }
                var24_17 = var1_1.B;
                var21_15 /* !! */  = (int)var24_17.p;
                if (var21_15 /* !! */  != var26_19) {
                    var40_31 /* !! */  = var24_17.a;
                    var35_26 = var24_17.b;
                    var78_56 = var24_17.c;
                    var65_49 = var24_17.d;
                    var80_57 = var24_17.e;
                    var81_58 = var24_17.f;
                    var82_59 = var24_17.g;
                    var83_60 = var24_17.h;
                    var60_44 = var24_17.i;
                    var61_45 = var24_17.j;
                    var84_61 = var24_17.k;
                    var85_62 = var24_17.l;
                    var86_63 = var24_17.m;
                    var51_36 /* !! */  = var24_17.n;
                    var29_22 = var24_17.o;
                    var87_64 = var24_17.q;
                    var89_65 = var24_17.r;
                    var91_66 = var24_17.s;
                    var52_37 = var24_17.t;
                    var1_1.B = var20_14 = new Mt2((androidx.media3.common.g)var40_31 /* !! */ , (j$b)var35_26, var78_56, var65_49, var80_57, var81_58, var82_59, var83_60, (Hp3)var60_44, (List)var61_45, var84_61, var85_62, var86_63, var51_36 /* !! */ , (ot2_0)var29_22, var87_64, var89_65, var91_66, var52_37, (boolean)var26_19);
                }
                var27_20 = 0;
                var28_21 = 0.0f;
                var24_17 = null;
                var1_1.M = false;
                if (var26_19 == 0) {
                    var24_17 = var1_1.B;
                    var27_20 = var24_17.e;
                    var26_19 = 4;
                    if (var27_20 != var26_19 && (var6_5 != 0 || var27_20 == (var6_5 = 2) || var27_20 == var7_6 && (var6_5 = var1_1.O) != 0)) {
                        var44_34 = var14_11;
                        var1_1.N(var14_11);
                    }
                }
                Trace.endSection();
                return;
            }
            var4_3 = new IllegalStateException("Playback stuck buffering and not loading");
            throw var4_3;
        }
    }

    public final void d0(int n3) {
        Mt2 mt2 = this.B;
        int n4 = mt2.e;
        if (n4 != n3) {
            Mt2 mt22;
            n4 = 2;
            if (n3 != n4) {
                long l2;
                this.Y = l2 = -9223372036854775807L;
            }
            this.B = mt22 = mt2.g(n3);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void e(boolean[] var1_1, long var2_2) {
        var4_3 = this;
        var5_4 = this.t;
        var6_5 = var5_4.k;
        var7_6 = var6_5.p;
        var8_7 = false;
        while (true) {
            var9_8 = var4_3.a;
            var10_9 = ((n[])var9_8).length;
            var11_10 = var4_3.b;
            if (var8_7 >= var10_9) break;
            var10_9 = var7_6.b((int)var8_7);
            if (!var10_9 && (var10_9 = (boolean)var11_10.remove(var12_11 = var9_8[var8_7]))) {
                var9_8 = var9_8[var8_7];
                var9_8.reset();
            }
            var8_7 += 1;
        }
        var8_7 = false;
        while (true) {
            block15: {
                block14: {
                    var10_9 = ((n[])var9_8).length;
                    var13_12 = 1;
                    if (var8_7 >= var10_9) break;
                    var10_9 = var7_6.b((int)var8_7);
                    if (!var10_9) break block14;
                    var10_9 = var1_1[var8_7];
                    var14_13 = var9_8[var8_7];
                    var15_14 = androidx.media3.exoplayer.g.s((n)var14_13);
                    if (var15_14) break block14;
                    var16_15 = var5_4.k;
                    var17_16 = var5_4.j;
                    var18_17 = var16_15 == var17_16;
                    var17_16 = var16_15.p;
                    var19_18 = var17_16.b[var8_7];
                    var17_16 = var17_16.c[var8_7];
                    if (var17_16 != null) {
                        var20_19 = var17_16.length();
                    } else {
                        var20_19 = 0;
                        var21_20 = null;
                    }
                    var22_21 = new androidx.media3.common.d[var20_19];
                    var24_23 = null;
                    for (var23_22 = 0; var23_22 < var20_19; ++var23_22) {
                        var22_21[var23_22] = var25_24 = var17_16.a(var23_22);
                    }
                    var23_22 = (int)this.e0();
                    if (var23_22 == 0) ** GOTO lbl-1000
                    var24_23 = var4_3.B;
                    var23_22 = var24_23.e;
                    var26_25 = 3;
                    if (var23_22 == var26_25) {
                        var23_22 = 1;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var23_22 = 0;
                        var24_23 = null;
                    }
                    if (!var10_9 && var23_22 != 0) {
                        var10_9 = true;
                    } else {
                        var10_9 = false;
                        var12_11 = null;
                    }
                    var4_3.O = var26_25 = var4_3.O + var13_12;
                    var11_10.add(var14_13);
                    var21_20 = var16_15.c[var8_7];
                    var27_26 = var11_10;
                    var28_27 = var16_15.q;
                    var17_16 = var16_15.h.a;
                    var16_15 = var14_13;
                    var30_28 = var17_16;
                    var17_16 = var19_18;
                    var19_18 = var22_21;
                    var12_11 = var14_13;
                    var14_13.o((uJ2)var17_16, var22_21, var21_20, var10_9, var18_17, var2_2, var28_27, (j$b)var30_28);
                    var11_10 = new f(var4_3);
                    var13_12 = 11;
                    var14_13.j(var13_12, var11_10);
                    var11_10 = var4_3.p;
                    var11_10.getClass();
                    var31_29 = var14_13.x();
                    if (var31_29 != null && var31_29 != (var16_15 = var11_10.d)) {
                        if (var16_15 == null) {
                            var11_10.d = var31_29;
                            var11_10.c = var14_13;
                            var11_10 = var11_10.a.e;
                            var31_29 = (androidx.media3.exoplayer.audio.g)var31_29;
                            var31_29.setPlaybackParameters((ot2_0)var11_10);
                        } else {
                            var5_4 = new IllegalStateException("Multiple renderer media clocks enabled.");
                            var6_5 = new ExoPlaybackException(2, (Throwable)var5_4, 1000);
                            throw var6_5;
                        }
                    }
                    if (var23_22 != 0 && var18_17) {
                        var12_11.start();
                    }
                    break block15;
                }
                var27_26 = var11_10;
            }
            var8_7 += 1;
            var11_10 = var27_26;
        }
        var6_5.i = var13_12;
    }

    public final boolean e0() {
        boolean bl2;
        Mt2 mt2 = this.B;
        boolean bl3 = mt2.l;
        if (bl3 && !(bl2 = mt2.n)) {
            bl2 = true;
        } else {
            bl2 = false;
            mt2 = null;
        }
        return bl2;
    }

    public final long f(androidx.media3.common.g g3, Object object, long l2) {
        boolean bl2;
        androidx.media3.common.g$b g$b = this.m;
        object = g3.h(object, g$b);
        int n3 = ((androidx.media3.common.g$b)object).c;
        androidx.media3.common.g$c g$c = this.l;
        g3.o(n3, g$c);
        long l3 = g$c.f;
        long l4 = -9223372036854775807L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 != false && (bl2 = g$c.b()) && (bl2 = g$c.i)) {
            l3 = g$c.a();
            long l8 = g$c.f;
            l3 = gz3.I(l3 - l8);
            long l12 = g$b.e;
            return l3 - (l2 += l12);
        }
        return l4;
    }

    public final boolean f0(androidx.media3.common.g g3, j$b object) {
        boolean bl2 = ((j$b)object).b();
        boolean bl3 = false;
        if (!bl2 && !(bl2 = g3.q())) {
            long l2;
            long l3;
            long l4;
            object = ((j$b)object).a;
            Object object2 = this.m;
            object = g3.h(object, (androidx.media3.common.g$b)object2);
            int n3 = ((androidx.media3.common.g$b)object).c;
            object2 = this.l;
            g3.o(n3, (androidx.media3.common.g$c)object2);
            boolean bl4 = ((androidx.media3.common.g$c)object2).b();
            if (bl4 && (bl4 = ((androidx.media3.common.g$c)object2).i) && (bl2 = (l4 = (l3 = ((androidx.media3.common.g$c)object2).f) - (l2 = -9223372036854775807L)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final long g() {
        Object object;
        int n3;
        j j3 = this.t.k;
        if (j3 == null) {
            return 0L;
        }
        long l2 = j3.q;
        int n4 = j3.f;
        if (n4 == 0) {
            return l2;
        }
        for (n4 = 0; n4 < (n3 = ((n[])(object = this.a)).length); ++n4) {
            long l3;
            VR2 vR2;
            Object object2 = object[n4];
            n3 = (int)(androidx.media3.exoplayer.g.s((n)object2) ? 1 : 0);
            if (n3 == 0 || (object2 = object[n4].getStream()) != (vR2 = j3.c[n4])) continue;
            long l4 = (object = object[n4]).v();
            long l7 = l4 - (l3 = Long.MIN_VALUE);
            Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object3 == false) {
                return l3;
            }
            l2 = Math.max(l4, l2);
        }
        return l2;
    }

    public final void g0() {
        Object object;
        int n3;
        Object object2 = this.t.j;
        if (object2 == null) {
            return;
        }
        object2 = ((j)object2).p;
        for (int i3 = 0; i3 < (n3 = ((n[])(object = this.a)).length); ++i3) {
            int n4;
            n n7;
            n3 = (int)(((Hp3)object2).b(i3) ? 1 : 0);
            if (n3 == 0 || (n3 = (n7 = object[i3]).getState()) != (n4 = 1)) continue;
            object = object[i3];
            object.start();
        }
    }

    public final void h(r r5) {
        r5 = (i)r5;
        this.i.d(9, r5).b();
    }

    public final void h0(boolean bl2, boolean bl3) {
        androidx.media3.exoplayer.h h3;
        int n3 = 1;
        if (!bl2 && (bl2 = this.L)) {
            bl2 = false;
            h3 = null;
        } else {
            bl2 = true;
        }
        this.H(bl2, false, n3 != 0, false);
        this.C.a((int)(bl3 ? 1 : 0));
        h3 = this.g;
        nu2 nu22 = this.x;
        h3.h(nu22);
        this.d0(n3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean handleMessage(Message var1_1) {
        block70: {
            block69: {
                block68: {
                    block67: {
                        block66: {
                            block65: {
                                block64: {
                                    block63: {
                                        var2_2 = this;
                                        var3_3 = var1_1;
                                        var4_4 = "Playback error";
                                        var5_5 = 1;
                                        var6_6 = 1000;
                                        try {
                                            var7_7 = var1_1.what;
                                        }
                                        catch (RuntimeException var8_8) {
                                            var3_3 = var8_8;
                                            break block63;
                                        }
                                        catch (IOException var8_9) {
                                            var3_3 = var8_9;
                                            break block64;
                                        }
                                        catch (BehindLiveWindowException var8_10) {
                                            var3_3 = var8_10;
                                            break block65;
                                        }
                                        catch (DataSourceException var8_11) {
                                            var3_3 = var8_11;
                                            break block66;
                                        }
                                        catch (ParserException var8_12) {
                                            var3_3 = var8_12;
                                            break block67;
                                        }
                                        catch (DrmSession$DrmSessionException var8_13) {
                                            var3_3 = var8_13;
                                            break block68;
                                        }
                                        catch (ExoPlaybackException var8_14) {
                                            var3_3 = var8_14;
                                            break block69;
                                        }
                                        switch (var7_7) {
                                            default: {
                                                return false;
                                            }
                                            case 29: {
                                                this.B();
                                                break;
                                            }
                                            case 28: {
                                                var3_3 = var1_1.obj;
                                                var3_3 = (ExoPlayer$e)var3_3;
                                                this.Z((ExoPlayer$e)var3_3);
                                                break;
                                            }
                                            case 27: {
                                                var7_7 = var1_1.arg1;
                                                var9_15 = var1_1.arg2;
                                                var3_3 = var1_1.obj;
                                                var3_3 = (List)var3_3;
                                                this.l0(var7_7, var9_15, (List)var3_3);
                                                break;
                                            }
                                            case 26: {
                                                this.G();
                                                this.O((boolean)var5_5);
                                                break;
                                            }
                                            case 25: {
                                                this.G();
                                                this.O((boolean)var5_5);
                                                break;
                                            }
                                            case 23: {
                                                var10_21 = var1_1.arg1;
                                                if (var10_21 != 0) {
                                                    var10_21 = 1;
                                                } else {
                                                    var10_21 = 0;
                                                    var3_3 = null;
                                                }
                                                var2_2.W((boolean)var10_21);
                                                break;
                                            }
                                            case 22: {
                                                this.z();
                                                break;
                                            }
                                            case 21: {
                                                var3_3 = var1_1.obj;
                                                var3_3 = (s)var3_3;
                                                this.c0((s)var3_3);
                                                break;
                                            }
                                            case 20: {
                                                var7_7 = var1_1.arg1;
                                                var9_16 = var1_1.arg2;
                                                var3_3 = var1_1.obj;
                                                var3_3 = (s)var3_3;
                                                this.F(var7_7, var9_16, (s)var3_3);
                                                break;
                                            }
                                            case 19: {
                                                var3_3 = var1_1.obj;
                                                var3_3 = (g$b)var3_3;
                                                this.A((g$b)var3_3);
                                                break;
                                            }
                                            case 18: {
                                                var11_22 = var1_1.obj;
                                                var11_22 = (g$a)var11_22;
                                                var10_21 = var1_1.arg1;
                                                this.a((g$a)var11_22, var10_21);
                                                break;
                                            }
                                            case 17: {
                                                var3_3 = var1_1.obj;
                                                var3_3 = (g$a)var3_3;
                                                this.V((g$a)var3_3);
                                                break;
                                            }
                                            case 16: {
                                                var3_3 = var1_1.obj;
                                                var3_3 = (ot2_0)var3_3;
                                                var12_27 = var3_3.a;
                                                this.p((ot2_0)var3_3, var12_27, (boolean)var5_5, false);
                                                break;
                                            }
                                            case 15: {
                                                var3_3 = var1_1.obj;
                                                var3_3 = (m)var3_3;
                                                this.S((m)var3_3);
                                                break;
                                            }
                                            case 14: {
                                                var3_3 = var1_1.obj;
                                                var3_3 = (m)var3_3;
                                                var3_3.getClass();
                                                this.R((m)var3_3);
                                                break;
                                            }
                                            case 13: {
                                                var7_7 = var1_1.arg1;
                                                if (var7_7 != 0) {
                                                    var7_7 = 1;
                                                    var12_28 = 1.4E-45f;
                                                } else {
                                                    var7_7 = 0;
                                                    var12_29 = 0.0f;
                                                    var11_23 = null;
                                                }
                                                var3_3 = var3_3.obj;
                                                var3_3 = (AtomicBoolean)var3_3;
                                                var2_2.U((boolean)var7_7, (AtomicBoolean)var3_3);
                                                break;
                                            }
                                            case 12: {
                                                var10_21 = var1_1.arg1;
                                                if (var10_21 != 0) {
                                                    var10_21 = 1;
                                                } else {
                                                    var10_21 = 0;
                                                    var3_3 = null;
                                                }
                                                var2_2.b0((boolean)var10_21);
                                                break;
                                            }
                                            case 11: {
                                                var10_21 = var1_1.arg1;
                                                this.a0(var10_21);
                                                break;
                                            }
                                            case 10: {
                                                this.G();
                                                break;
                                            }
                                            case 9: {
                                                var3_3 = var1_1.obj;
                                                var3_3 = (i)var3_3;
                                                this.k((i)var3_3);
                                                break;
                                            }
                                            case 8: {
                                                var3_3 = var1_1.obj;
                                                var3_3 = (i)var3_3;
                                                this.o((i)var3_3);
                                                break;
                                            }
                                            case 7: {
                                                this.D();
                                                return (boolean)var5_5;
                                            }
                                            case 6: {
                                                this.h0(false, (boolean)var5_5);
                                                break;
                                            }
                                            case 5: {
                                                var3_3 = var1_1.obj;
                                                this.A = var3_3 = (ex2_0)var3_3;
                                                break;
                                            }
                                            case 4: {
                                                var3_3 = var1_1.obj;
                                                var3_3 = (ot2_0)var3_3;
                                                this.Y((ot2_0)var3_3);
                                                break;
                                            }
                                            case 3: {
                                                var3_3 = var1_1.obj;
                                                var3_3 = (g$g)var3_3;
                                                this.P((g$g)var3_3);
                                                break;
                                            }
                                            case 2: {
                                                this.d();
                                                break;
                                            }
                                            case 1: {
                                                var7_7 = var1_1.arg1;
                                                if (var7_7 != 0) {
                                                    var7_7 = 1;
                                                    var12_30 = 1.4E-45f;
                                                } else {
                                                    var7_7 = 0;
                                                    var12_31 = 0.0f;
                                                    var11_24 = null;
                                                }
                                                var10_21 = var3_3.arg2;
                                                var9_17 = var10_21 >> 4;
                                                var2_2.X(var9_17, var10_21 &= 15, (boolean)var7_7, (boolean)var5_5);
                                            }
                                        }
lbl188:
                                        // 34 sources

                                        while (true) {
                                            var10_21 = 1;
                                            break block70;
                                            break;
                                        }
                                    }
                                    var7_7 = var8_8 instanceof IllegalStateException;
                                    if (var7_7 != 0 || (var7_7 = var8_8 instanceof IllegalArgumentException) != 0) {
                                        var6_6 = 1004;
                                    }
                                    var9_18 = 2;
                                    var11_25 = new ExoPlaybackException(var9_18, (Throwable)var3_3, var6_6);
                                    Cx.d((String)var4_4, var11_25);
                                    var2_2.h0((boolean)var5_5, false);
                                    var2_2.B = var3_3 = var2_2.B.e(var11_25);
                                    ** GOTO lbl188
                                }
                                var13_32 = 2000;
                                var2_2.l(var8_9, var13_32);
                                ** GOTO lbl188
                            }
                            var13_33 = 1002;
                            var2_2.l(var8_10, var13_33);
                            ** GOTO lbl188
                        }
                        var13_34 = var8_11.a;
                        var2_2.l(var8_11, var13_34);
                        ** GOTO lbl188
                    }
                    var13_35 = var8_12.a;
                    var7_7 = var8_12.b;
                    if (var7_7 == var5_5) {
                        if (var13_35 != 0) {
                            var13_35 = 3001;
                            var6_6 = 3001;
                        } else {
                            var13_35 = 3003;
                            var6_6 = 3003;
                        }
                    } else {
                        var9_19 = 4;
                        if (var7_7 == var9_19) {
                            if (var13_35 != 0) {
                                var13_35 = 3002;
                                var6_6 = 3002;
                            } else {
                                var13_35 = 3004;
                                var6_6 = 3004;
                            }
                        }
                    }
                    var2_2.l((IOException)var3_3, var6_6);
                    ** GOTO lbl188
                }
                var13_36 = var8_13.a;
                var2_2.l(var8_13, var13_36);
                ** GOTO lbl188
            }
            var6_6 = var8_14.c;
            var11_26 = var2_2.t;
            if (var6_6 == var5_5 && (var14_38 = var11_26.k) != null) {
                var14_38 = var14_38.h.a;
                var16_40 = var8_14.getMessage();
                var17_41 = var8_14.getCause();
                var18_42 = var8_14.f;
                var19_43 = var8_14.g;
                var20_44 = var8_14.a;
                var21_45 = var8_14.c;
                var22_46 = var8_14.d;
                var23_47 = var8_14.e;
                var24_48 = var8_14.b;
                var10_21 = var8_14.i;
                var15_39 = new ExoPlaybackException(var16_40, var17_41, var20_44, (int)var21_45, var22_46, var23_47, var18_42, var19_43, (j$b)var14_38, var24_48, (boolean)var10_21);
                var3_3 = var15_39;
            }
            if ((var6_6 = (int)var3_3.i) != 0 && ((var14_38 = var2_2.U) == null || (var9_20 = var3_3.a) == (var6_6 = 5004) || var9_20 == (var6_6 = 5003))) {
                Cx.g("Recoverable renderer error", (Throwable)var3_3);
                var4_4 = var2_2.U;
                if (var4_4 != null) {
                    var4_4.addSuppressed((Throwable)var3_3);
                    var3_3 = var2_2.U;
                } else {
                    var2_2.U = var3_3;
                }
                var4_4 = var2_2.i;
                var6_6 = 25;
                var3_3 = var4_4.d(var6_6, var3_3);
                var4_4.g((H21$a)var3_3);
                ** continue;
            }
            var14_38 = var2_2.U;
            if (var14_38 != null) {
                var14_38.addSuppressed((Throwable)var3_3);
                var3_3 = var2_2.U;
            }
            var26_49 = var3_3;
            Cx.d((String)var4_4, (Throwable)var3_3);
            var10_21 = var3_3.c;
            var13_37 = 1;
            if (var10_21 == var13_37 && (var3_3 = var11_26.j) != (var4_4 = var11_26.k)) {
                while ((var3_3 = var11_26.j) != (var4_4 = var11_26.k)) {
                    var11_26.a();
                }
                var3_3.getClass();
                this.w();
                var3_3 = var3_3.h;
                var4_4 = var3_3.a;
                var21_45 = true;
                var22_46 = null;
                var27_50 = var3_3.b;
                var29_51 = var3_3.c;
                var3_3 = this;
                var2_2.B = var3_3 = this.q((j$b)var4_4, var27_50, var29_51, var27_50, var21_45, 0);
            }
            var10_21 = 1;
            var13_37 = 0;
            var2_2.h0((boolean)var10_21, false);
            var2_2.B = var4_4 = var2_2.B.e((ExoPlaybackException)var26_49);
        }
        this.w();
        return (boolean)var10_21;
    }

    public final Pair i(androidx.media3.common.g object) {
        boolean n3 = ((androidx.media3.common.g)object).q();
        long l2 = 0L;
        if (n3) {
            object = Mt2.u;
            Long l3 = l2;
            return Pair.create((Object)object, (Object)l3);
        }
        boolean bl2 = this.K;
        int n4 = ((androidx.media3.common.g)object).a(bl2);
        androidx.media3.common.g$b g$b = this.m;
        long l4 = -9223372036854775807L;
        Object object2 = this.l;
        Object object3 = object;
        Object object4 = ((androidx.media3.common.g)object).j((androidx.media3.common.g$c)object2, g$b, n4, l4);
        object3 = this.t;
        object2 = ((Pair)object4).first;
        object3 = ((androidx.media3.exoplayer.k)object3).r((androidx.media3.common.g)object, object2, l2);
        object4 = (Long)((Pair)object4).second;
        long l7 = (Long)object4;
        boolean bl3 = ((j$b)object3).b();
        if (bl3) {
            object4 = ((j$b)object3).a;
            object2 = this.m;
            ((androidx.media3.common.g)object).h(object4, (androidx.media3.common.g$b)object2);
            int n7 = ((j$b)object3).b;
            n7 = ((androidx.media3.common.g$b)object2).f(n7);
            int n8 = ((j$b)object3).c;
            if (n8 == n7) {
                object = ((androidx.media3.common.g$b)object2).g;
                l2 = ((a)object).c;
            }
            l7 = l2;
        }
        object = l7;
        return Pair.create((Object)object3, (Object)object);
    }

    public final void i0() {
        EL1 eL1 = this.p;
        int n3 = 0;
        ((d)eL1).f = false;
        eL1 = ((d)eL1).a;
        int n4 = ((ob3_1)eL1).b;
        if (n4 != 0) {
            long l2 = ((ob3_1)eL1).q();
            ((ob3_1)eL1).a(l2);
            ((ob3_1)eL1).b = false;
        }
        eL1 = this.a;
        n4 = ((EL1)eL1).length;
        while (n3 < n4) {
            int n7;
            EL1 eL12 = eL1[n3];
            int n8 = androidx.media3.exoplayer.g.s((n)((Object)eL12));
            if (n8 != 0 && (n8 = eL12.getState()) == (n7 = 2)) {
                eL12.stop();
            }
            ++n3;
        }
    }

    public final long j(long l2) {
        j j3 = this.t.l;
        long l3 = 0L;
        if (j3 == null) {
            return l3;
        }
        long l4 = this.Q;
        long l7 = j3.q;
        return Math.max(l3, l2 -= (l4 -= l7));
    }

    public final void j0() {
        boolean bl2;
        boolean bl3;
        Object object = this;
        Object object2 = this.t.l;
        boolean bl4 = this.I;
        if (!(bl4 || object2 != null && (bl3 = (object2 = ((j)object2).a).isLoading()))) {
            bl3 = false;
            object2 = null;
            bl2 = false;
        } else {
            bl3 = true;
            bl2 = true;
        }
        object2 = ((g)object).B;
        bl4 = ((Mt2)object2).g;
        if (bl2 != bl4) {
            Mt2 mt2;
            androidx.media3.common.g g3 = ((Mt2)object2).a;
            j$b j$b = ((Mt2)object2).b;
            long l2 = ((Mt2)object2).c;
            long l3 = ((Mt2)object2).d;
            int n3 = ((Mt2)object2).e;
            ExoPlaybackException exoPlaybackException = ((Mt2)object2).f;
            sp3 sp32 = ((Mt2)object2).h;
            Hp3 hp3 = ((Mt2)object2).i;
            List list = ((Mt2)object2).j;
            j$b j$b2 = ((Mt2)object2).k;
            boolean bl5 = ((Mt2)object2).l;
            int n4 = ((Mt2)object2).m;
            int n7 = ((Mt2)object2).n;
            ot2_0 ot2_02 = ((Mt2)object2).o;
            object = mt2;
            long l4 = ((Mt2)object2).q;
            long l7 = ((Mt2)object2).r;
            long l8 = ((Mt2)object2).s;
            long l12 = ((Mt2)object2).t;
            bl3 = ((Mt2)object2).p;
            mt2 = new Mt2(g3, j$b, l2, l3, n3, exoPlaybackException, bl2, sp32, hp3, list, j$b2, bl5, n4, n7, ot2_02, l4, l7, l8, l12, bl3);
            object = this;
            object2 = mt2;
            this.B = mt2;
        }
    }

    public final void k(i object) {
        i i3;
        Object object2 = this.t;
        j j3 = ((androidx.media3.exoplayer.k)object2).l;
        if (j3 != null && (i3 = j3.a) == object) {
            long l2 = this.Q;
            if (j3 != null) {
                boolean bl2;
                object = j3.n;
                if (object == null) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    object = null;
                }
                ct3.f(bl2);
                bl2 = j3.f;
                if (bl2) {
                    object = j3.a;
                    long l3 = j3.q;
                    object.q(l2 -= l3);
                }
            }
            this.u();
        } else {
            object2 = ((androidx.media3.exoplayer.k)object2).m;
            if (object2 != null && (object2 = ((j)object2).a) == object) {
                this.v();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void k0(j$b j$b, sp3 sp32, Hp3 hp3) {
        long l2;
        long l3;
        long l4;
        g g3 = this;
        Object object = this.t;
        DF0[] dF0Array = ((androidx.media3.exoplayer.k)object).l;
        dF0Array.getClass();
        object = ((androidx.media3.exoplayer.k)object).j;
        if (dF0Array == object) {
            l4 = this.Q;
            l3 = dF0Array.q;
        } else {
            l4 = this.Q;
            l3 = dF0Array.q;
            l4 -= l3;
            object = dF0Array.h;
            l3 = ((YM1)object).b;
        }
        long l7 = l4 -= l3;
        l4 = dF0Array.d();
        long l8 = g3.j(l4);
        object = g3.B.a;
        dF0Array = dF0Array.h.a;
        boolean bl2 = g3.f0((androidx.media3.common.g)object, (j$b)dF0Array);
        if (bl2) {
            object = (km0_0)g3.v;
            l2 = ((km0_0)object).i;
        } else {
            l2 = -9223372036854775807L;
        }
        androidx.media3.common.g g5 = g3.B.a;
        float f5 = g3.p.getPlaybackParameters().a;
        boolean cfr_ignored_0 = g3.B.l;
        boolean bl3 = g3.G;
        nu2 nu22 = g3.x;
        object = new h$a(nu22, g5, j$b, l7, l8, f5, bl3, l2);
        dF0Array = hp3;
        dF0Array = hp3.c;
        g3.g.j((h$a)object, dF0Array);
    }

    public final void l(IOException iOException, int n3) {
        g g3 = this;
        Object object = iOException;
        Object object2 = new ExoPlaybackException(0, iOException, n3);
        object = this.t.j;
        if (object != null) {
            j$b j$b = ((j)object).h.a;
            String string2 = ((Throwable)object2).getMessage();
            Throwable throwable = ((Throwable)object2).getCause();
            androidx.media3.common.d d2 = ((ExoPlaybackException)object2).f;
            int n4 = ((ExoPlaybackException)object2).g;
            int n7 = ((PlaybackException)object2).a;
            int n8 = ((ExoPlaybackException)object2).c;
            String string3 = ((ExoPlaybackException)object2).d;
            int n10 = ((ExoPlaybackException)object2).e;
            long l2 = ((PlaybackException)object2).b;
            boolean bl2 = ((ExoPlaybackException)object2).i;
            object2 = object = new ExoPlaybackException(string2, throwable, n7, n8, string3, n10, d2, n4, j$b, l2, bl2);
        }
        Cx.d("Playback error", (Throwable)object2);
        g3.h0(false, false);
        g3.B = object2 = g3.B.e((ExoPlaybackException)object2);
    }

    public final void l0(int n3, int n4, List list) {
        h h3;
        int n7;
        Object object = this.C;
        int n8 = 1;
        ((g$d)object).a(n8);
        object = this.u;
        object.getClass();
        ArrayList arrayList = ((l)object).b;
        if (n3 >= 0 && n3 <= n4 && n4 <= (n7 = arrayList.size())) {
            n7 = 1;
        } else {
            n7 = 0;
            h3 = null;
        }
        ct3.a(n7 != 0);
        n7 = list.size();
        int n10 = n4 - n3;
        if (n7 != n10) {
            n8 = 0;
        }
        ct3.a(n8 != 0);
        for (n8 = n3; n8 < n4; ++n8) {
            h3 = ((l$c)arrayList.get((int)n8)).a;
            n10 = n8 - n3;
            MediaItem mediaItem = (MediaItem)list.get(n10);
            h3.h(mediaItem);
        }
        androidx.media3.common.g g3 = ((l)object).b();
        this.n(g3, false);
    }

    public final void m(boolean bl2) {
        j$b j$b = this.B.k;
        Object object = this.t.l;
        Object object2 = object == null ? this.B.b : ((j)object).h.a;
        boolean bl3 = j$b.equals(object2) ^ true;
        if (bl3) {
            Mt2 mt2 = this.B;
            this.B = object2 = mt2.b((j$b)object2);
        }
        object2 = this.B;
        long l2 = object == null ? ((Mt2)object2).s : ((j)object).d();
        ((Mt2)object2).q = l2;
        object2 = this.B;
        l2 = ((Mt2)object2).q;
        ((Mt2)object2).r = l2 = this.j(l2);
        if ((bl3 || bl2) && object != null && (bl2 = ((j)object).f)) {
            j$b j$b2 = ((j)object).h.a;
            object2 = ((j)object).o;
            object = ((j)object).p;
            this.k0(j$b2, (sp3)object2, (Hp3)object);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void m0() {
        block41: {
            block42: {
                block38: {
                    block40: {
                        block39: {
                            block37: {
                                var1_1 = this;
                                var2_2 = 2;
                                var3_3 = 1;
                                var4_4 = 1.4E-45f;
                                var5_5 = this.t.j;
                                if (var5_5 == null) {
                                    return;
                                }
                                var6_6 = var5_5.f;
                                var7_7 = -9223372036854775807L;
                                if (var6_6 != 0) {
                                    var9_8 = var5_5.a;
                                    var12_10 = var10_9 = var9_8.g();
                                } else {
                                    var12_10 = var7_7;
                                }
                                var14_11 /* !! */  = 16;
                                var15_12 = 2.2E-44f;
                                var6_6 = var12_10 == var7_7 ? 0 : (var12_10 < var7_7 ? -1 : 1);
                                if (var6_6 == 0) break block37;
                                var6_6 = var5_5.g();
                                if (var6_6 == 0) {
                                    var9_8 = var1_1.t;
                                    var9_8.o((j)var5_5);
                                    var1_1.m(false);
                                    this.u();
                                }
                                var1_1.J(var12_10);
                                var5_5 = var1_1.B;
                                var16_13 = var5_5.s;
                                var18_15 = var12_10 == var16_13 ? 0 : (var12_10 < var16_13 ? -1 : 1);
                                if (var18_15 != false) {
                                    var5_5 = var1_1.B;
                                    var9_8 = var5_5.b;
                                    var19_16 = var5_5.c;
                                    var21_18 = 1;
                                    var22_19 = 1.4E-45f;
                                    var23_20 = 5;
                                    var24_21 = 7.0E-45f;
                                    var5_5 = this;
                                    var25_22 = var12_10;
                                    var27_23 = 16;
                                    var28_24 = 2.2E-44f;
                                    var14_11 /* !! */  = var21_18;
                                    var15_12 = var22_19;
                                    var29_25 /* !! */  = 1;
                                    var3_3 = var23_20;
                                    var4_4 = var24_21;
                                    var1_1.B = var5_5 = this.q((j$b)var9_8, var12_10, var19_16, var12_10, (boolean)var21_18, var23_20);
                                } else {
                                    var27_23 = 16;
                                    var28_24 = 2.2E-44f;
                                    var29_25 /* !! */  = 1;
                                }
                                break block38;
                            }
                            var27_23 = 16;
                            var28_24 = 2.2E-44f;
                            var29_25 /* !! */  = 1;
                            var9_8 = var1_1.p;
                            var30_26 = var1_1.t.k;
                            if (var5_5 != var30_26) {
                                var3_3 = 1;
                                var4_4 = 1.4E-45f;
                            } else {
                                var3_3 = 0;
                                var4_4 = 0.0f;
                            }
                            var30_26 = var9_8.c;
                            var31_27 = var9_8.a;
                            if (var30_26 == null || (var18_15 = (long)var30_26.b()) != false || var3_3 != 0 && (var18_15 = (long)(var30_26 = var9_8.c).getState()) != var2_2 || (var18_15 = (long)(var30_26 = var9_8.c).c()) == false && (var3_3 != 0 || (var18_15 = (long)(var30_26 = var9_8.c).h()) != false)) break block39;
                            var30_26 = var9_8.d;
                            var30_26.getClass();
                            var19_17 = var30_26.q();
                            var32_28 = var9_8.e;
                            if (!var32_28) ** GOTO lbl90
                            var12_10 = var31_27.q();
                            cfr_temp_0 = var19_17 - var12_10;
                            var14_11 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var14_11 /* !! */  < 0) {
                                var18_15 = (long)var31_27.b;
                                if (var18_15 != false) {
                                    var19_17 = var31_27.q();
                                    var31_27.a(var19_17);
                                    var31_27.b = false;
                                }
                            } else {
                                var9_8.e = false;
                                var32_28 = var9_8.f;
                                if (var32_28 && !(var32_28 = var31_27.b)) {
                                    var33_29 = var31_27.a;
                                    var31_27.d = var12_10 = var33_29.elapsedRealtime();
                                    var31_27.b = var29_25 /* !! */ ;
                                }
lbl90:
                                // 4 sources

                                var31_27.a(var19_17);
                                var30_26 = var30_26.getPlaybackParameters();
                                var34_30 = var31_27.e;
                                var35_31 = var30_26.equals(var34_30);
                                if (var35_31 == 0) {
                                    var31_27.setPlaybackParameters((ot2_0)var30_26);
                                    var31_27 = ((g)var9_8.b).i;
                                    var30_26 = var31_27.d(var27_23, var30_26);
                                    var30_26.b();
                                }
                            }
                            break block40;
                        }
                        var9_8.e = var29_25 /* !! */ ;
                        var18_15 = (long)var9_8.f;
                        if (var18_15 != false && (var18_15 = (long)var31_27.b) == false) {
                            var30_26 = var31_27.a;
                            var31_27.d = var19_17 = var30_26.elapsedRealtime();
                            var31_27.b = var29_25 /* !! */ ;
                        }
                    }
                    var1_1.Q = var10_9 = var9_8.q();
                    var36_32 = var5_5.q;
                    var12_10 = var10_9 - var36_32;
                    var5_5 = var1_1.B;
                    var16_14 = var5_5.s;
                    var30_26 = var1_1.q;
                    var18_15 = (long)var30_26.isEmpty();
                    if (var18_15 == false && (var18_15 = (long)(var30_26 = var1_1.B.b).b()) == false) {
                        var18_15 = (long)var1_1.T;
                        if (var18_15 != false) {
                            var25_22 = 1L;
                            var16_14 -= var25_22;
                            var1_1.T = false;
                        }
                        var30_26 = var1_1.B;
                        var31_27 = var30_26.a;
                        var30_26 = var30_26.b.a;
                        var18_15 = var31_27.b(var30_26);
                        var38_33 = var1_1.S;
                        var35_31 = var1_1.q.size();
                        var38_33 = Math.min(var38_33, var35_31);
                        var35_31 = 0;
                        var34_30 = null;
                        if (var38_33 > 0) {
                            var39_34 = var1_1.q;
                            var14_11 /* !! */  = var38_33 + -1;
                            var39_34 = (g$c)var39_34.get(var14_11 /* !! */ );
                        } else {
                            var40_35 = 0;
                            var39_34 = null;
                            var41_36 = 0.0f;
                        }
                        while (var39_34 != null) {
                            var39_34.getClass();
                            if (var18_15 >= 0) {
                                if (var18_15 != false) break;
                                var39_34.getClass();
                                var42_37 = 0L;
                                var40_35 = (int)(var42_37 == var16_14 ? 0 : (var42_37 < var16_14 ? -1 : 1));
                                if (var40_35 <= 0) break;
                            }
                            if ((var40_35 = var38_33 + -1) > 0) {
                                var44_38 = var1_1.q;
                                var31_27 = (g$c)var44_38.get(var38_33 += -2);
                            } else {
                                var38_33 = 0;
                                var31_27 = null;
                            }
                            var39_34 = var31_27;
                            var38_33 = var40_35;
                        }
                        if (var38_33 < (var45_39 = (var5_5 = var1_1.q).size())) {
                            var34_30 = var5_5 = var1_1.q.get(var38_33);
                            var34_30 = (g$c)var5_5;
                        }
                        if (var34_30 != null) {
                            var34_30.getClass();
                        }
                        if (var34_30 != null) {
                            var34_30.getClass();
                        }
                        var1_1.S = var38_33;
                    }
                    if ((var45_39 = (var5_5 = var1_1.p).f()) != 0) {
                        var45_39 = var1_1.C.d;
                        var14_11 /* !! */  = var45_39 ^ 1;
                        var5_5 = var1_1.B;
                        var9_8 = var5_5.b;
                        var19_17 = var5_5.c;
                        var3_3 = 6;
                        var4_4 = 8.4E-45f;
                        var5_5 = this;
                        var25_22 = var12_10;
                        var1_1.B = var5_5 = this.q((j$b)var9_8, var12_10, var19_17, var12_10, (boolean)var14_11 /* !! */ , var3_3);
                    } else {
                        var5_5 = var1_1.B;
                        var5_5.s = var12_10;
                        var5_5.t = var10_9 = SystemClock.elapsedRealtime();
                    }
                }
                var5_5 = var1_1.t.l;
                var9_8 = var1_1.B;
                var9_8.q = var25_22 = var5_5.d();
                var5_5 = var1_1.B;
                var10_9 = var5_5.q;
                var5_5.r = var10_9 = var1_1.j(var10_9);
                var5_5 = var1_1.B;
                var6_6 = var5_5.l;
                if (var6_6 == 0) break block41;
                var6_6 = var5_5.e;
                var18_15 = 3;
                var46_40 = 4.2E-45f;
                if (var6_6 != var18_15 || (var45_39 = var1_1.f0((androidx.media3.common.g)(var9_8 = var5_5.a), (j$b)(var5_5 = var5_5.b))) == 0) break block41;
                var5_5 = var1_1.B;
                var9_8 = var5_5.o;
                var47_41 = var9_8.a;
                var18_15 = 1065353216;
                var46_40 = 1.0f;
                cfr_temp_1 = var47_41 - var46_40;
                var6_6 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                if (var6_6 != 0) break block41;
                var9_8 = var1_1.v;
                var31_27 = var5_5.a;
                var34_30 = var5_5.b.a;
                var48_42 = var5_5.s;
                var36_32 = var1_1.f((androidx.media3.common.g)var31_27, var34_30, var48_42);
                var5_5 = var1_1.B;
                var48_42 = var5_5.r;
                var9_8 = (km0_0)var9_8;
                var50_43 = var9_8.d;
                cfr_temp_2 = var50_43 - var7_7;
                var45_39 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                if (var45_39 == 0) break block42;
                var48_42 = var36_32 - var48_42;
                var50_43 = var9_8.n;
                cfr_temp_3 = var50_43 - var7_7;
                var45_39 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                if (var45_39 == 0) {
                    var9_8.n = var48_42;
                    var9_8.o = var48_42 = 0L;
                } else {
                    var52_44 = var9_8.c;
                    var53_45 = (float)var50_43 * var52_44;
                    var15_12 = var46_40 - var52_44;
                    var54_46 = (long)((float)var48_42 * var15_12 + var53_45);
                    var9_8.n = var54_46 = Math.max(var48_42, var54_46);
                    var48_42 = Math.abs(var48_42 - var54_46);
                    var54_46 = var9_8.o;
                    var4_4 = var54_46;
                    var41_36 = var48_42;
                    var15_12 = var15_12 * var41_36 + (var52_44 *= var4_4);
                    var9_8.o = var48_42 = (long)var15_12;
                }
                var48_42 = var9_8.m;
                var42_37 = 1000L;
                var45_39 = (int)(var48_42 == var7_7 ? 0 : (var48_42 < var7_7 ? -1 : 1));
                if (var45_39 == 0) ** GOTO lbl-1000
                var48_42 = SystemClock.elapsedRealtime();
                var54_46 = var9_8.m;
                cfr_temp_4 = (var48_42 -= var54_46) - var42_37;
                var45_39 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                if (var45_39 < 0) {
                    var46_40 = var9_8.l;
                } else lbl-1000:
                // 2 sources

                {
                    var9_8.m = var48_42 = SystemClock.elapsedRealtime();
                    var48_42 = var9_8.n;
                    var54_46 = 3;
                    var56_47 = var9_8.o * var54_46;
                    var58_48 = var56_47 + var48_42;
                    var48_42 = var9_8.i;
                    var27_23 = 869711765;
                    var28_24 = 1.0E-7f;
                    var29_25 /* !! */  = (int)(var48_42 == var58_48 ? 0 : (var48_42 < var58_48 ? -1 : 1));
                    if (var29_25 /* !! */  > 0) {
                        var48_42 = gz3.I(var42_37);
                        var15_12 = var9_8.l - var46_40;
                        var41_36 = var48_42;
                        var42_37 = (long)(var15_12 * var41_36);
                        var60_49 = (var9_8.j - var46_40) * var41_36;
                        var48_42 = (long)var60_49;
                        var42_37 += var48_42;
                        var48_42 = var9_8.f;
                        var61_50 = var9_8.i - var42_37;
                        var14_11 /* !! */  = 3;
                        var15_12 = 4.2E-45f;
                        var44_38 = new long[var14_11 /* !! */ ];
                        var44_38[0] = var58_48;
                        var3_3 = 1;
                        var4_4 = 1.4E-45f;
                        var44_38[var3_3] = var48_42;
                        var45_39 = 2;
                        var52_44 = 2.8E-45f;
                        var44_38[var45_39] = var61_50;
                        var9_8.i = var48_42 = Longs.max((long[])var44_38);
                    } else {
                        var52_44 = var9_8.l - var46_40;
                        var40_35 = 0;
                        var41_36 = 0.0f;
                        var39_34 = null;
                        var52_44 = Math.max(0.0f, var52_44) / var28_24;
                        var48_42 = (long)var52_44;
                        var63_51 = var36_32 - var48_42;
                        var48_42 = var9_8.i;
                        var9_8.i = var48_42 = gz3.i(var63_51, var48_42, var58_48);
                        var42_37 = var9_8.h;
                        cfr_temp_5 = var42_37 - var7_7;
                        var45_39 = (int)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                        if (var45_39 != 0 && (var45_39 = (int)(var48_42 == var42_37 ? 0 : (var48_42 < var42_37 ? -1 : 1))) > 0) {
                            var9_8.i = var42_37;
                        }
                    }
                    var48_42 = var9_8.i;
                    var36_32 -= var48_42;
                    var48_42 = Math.abs(var36_32);
                    var42_37 = var9_8.a;
                    var45_39 = (int)(var48_42 == var42_37 ? 0 : (var48_42 < var42_37 ? -1 : 1));
                    if (var45_39 < 0) {
                        var9_8.l = var46_40;
                    } else {
                        var52_44 = var36_32;
                        var28_24 = var28_24 * var52_44 + var46_40;
                        var52_44 = var9_8.k;
                        var46_40 = var9_8.j;
                        var9_8.l = var52_44 = gz3.g(var28_24, var52_44, var46_40);
                    }
                    var46_40 = var9_8.l;
                }
            }
            var5_5 = var1_1.p.getPlaybackParameters();
            var52_44 = var5_5.a;
            var45_39 = (int)(var52_44 == var46_40 ? 0 : (var52_44 > var46_40 ? 1 : -1));
            if (var45_39 != 0) {
                var5_5 = var1_1.B.o;
                var52_44 = var5_5.b;
                var9_8 = new ot2_0(var46_40, var52_44);
                var5_5 = var1_1.i;
                var18_15 = 16;
                var46_40 = 2.2E-44f;
                var5_5.l((int)var18_15);
                var1_1.p.setPlaybackParameters((ot2_0)var9_8);
                var5_5 = var1_1.B.o;
                var9_8 = var1_1.p.getPlaybackParameters();
                var47_41 = var9_8.a;
                var1_1.p((ot2_0)var5_5, var47_41, false, false);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(androidx.media3.common.g var1_1, boolean var2_2) {
        block93: {
            block88: {
                block87: {
                    block94: {
                        block85: {
                            block86: {
                                block92: {
                                    var3_3 = this;
                                    var4_4 = var1_1;
                                    var5_5 = this.B;
                                    var6_11 = this.P;
                                    var7_12 = this.t;
                                    var8_13 = this.J;
                                    var9_14 = this.K;
                                    var10_15 = this.l;
                                    var11_16 = this.m;
                                    var12_17 = var1_1.q();
                                    var13_18 = -9223372036854775807L;
                                    var15_19 = -4.9E-324;
                                    if (var12_17 == 0) break block92;
                                    var17_20 = Mt2.u;
                                    var18_21 = true;
                                    var19_22 = 0L;
                                    var21_23 = -9223372036854775807L;
                                    var5_5 = new g$f(var17_20, var19_22, var21_23, false, var18_21, false);
                                    var23_24 /* !! */  = var5_5;
                                    var24_25 = 4 != 0;
                                    var25_26 = -1;
                                    var26_27 = 2;
                                    break block93;
                                }
                                var27_28 = var5_5.b;
                                var28_29 = var27_28.a;
                                var29_30 = var5_5.a;
                                var30_31 = var29_30.q();
                                if (var30_31 != 0) ** GOTO lbl-1000
                                var31_32 = var27_28.a;
                                var29_30 = var29_30.h(var31_32, var11_16);
                                var32_33 = var29_30.f;
                                if (var32_33 == 0) {
                                    var33_34 = 0;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var33_34 = 1;
                                }
                                var29_30 = var5_5.b;
                                var32_33 = var29_30.b();
                                if (var32_33 == 0 && var33_34 == 0) {
                                    var34_35 = var5_5.s;
lbl41:
                                    // 2 sources

                                    while (true) {
                                        var36_36 = var34_35;
                                        var34_35 = 0L;
                                        var38_37 = 0.0;
                                        if (var6_11 == null) break block85;
                                        break block86;
                                        break;
                                    }
                                }
                                var34_35 = var5_5.c;
                                ** while (true)
                            }
                            var32_33 = 1;
                            var31_32 = var28_29;
                            var28_29 = var1_1;
                            var40_38 = var27_28;
                            var27_28 = var6_11;
                            var25_26 = 4;
                            var41_39 = var31_32;
                            var42_40 = var9_14;
                            var43_41 = 2;
                            var44_42 = 2.8E-45f;
                            var45_43 = var10_15;
                            var23_24 /* !! */  = var11_16;
                            var28_29 = androidx.media3.exoplayer.g.L(var1_1, (g$g)var6_11, (boolean)var32_33, var8_13, (boolean)var9_14, var10_15, var11_16);
                            if (var28_29 == null) {
                                var42_40 = var12_17 = var4_4.a((boolean)var9_14);
                                var46_44 = var36_36;
                                var28_29 = var31_32;
                                var48_45 /* !! */  = 0;
                                var49_46 = 0.0f;
                                var27_28 = null;
                                var50_47 = 0;
                                var45_43 = null;
                                var43_41 = 1;
                                var44_42 = 1.4E-45f;
                            } else {
                                var51_48 = var6_11.c;
                                cfr_temp_0 = var51_48 - var13_18;
                                var8_13 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                if (var8_13 == 0) {
                                    var28_29 = var28_29.first;
                                    var42_40 = var4_4.h((Object)var28_29, (androidx.media3.common.g$b)var11_16).c;
                                    var46_44 = var36_36;
                                    var28_29 = var31_32;
                                    var43_41 = 0;
                                    var44_42 = 0.0f;
                                    var23_24 /* !! */  = null;
                                } else {
                                    var27_28 = var28_29.first;
                                    var46_44 = (Long)var28_29.second;
                                    var28_29 = var27_28;
                                    var42_40 = -1;
                                    var43_41 = 1;
                                    var44_42 = 1.4E-45f;
                                }
                                var48_45 /* !! */  = var5_5.e;
                                if (var48_45 /* !! */  == var25_26) {
                                    var48_45 /* !! */  = 1;
                                    var49_46 = 1.4E-45f;
                                } else {
                                    var48_45 /* !! */  = 0;
                                    var49_46 = 0.0f;
                                    var27_28 = null;
                                }
                                var50_47 = (int)var48_45 /* !! */ ;
                                var48_45 /* !! */  = var43_41;
                                var49_46 = var44_42;
                                var43_41 = 0;
                                var44_42 = 0.0f;
                                var23_24 /* !! */  = null;
                            }
                            var53_49 = var48_45 /* !! */ ;
                            var54_50 = var50_47;
                            var55_51 = var43_41;
                            var25_26 = -1;
                            var56_52 = 0L;
                            var58_53 = 0.0;
                            break block94;
                        }
                        var41_39 = var28_29;
                        var40_38 = var27_28;
                        var25_26 = 4;
                        var28_29 = var5_5.a;
                        var12_17 = var28_29.q();
                        if (var12_17 != 0) {
                            var42_40 = var12_17 = var4_4.a((boolean)var9_14);
                            var46_44 = var36_36;
                            var28_29 = var41_39;
                            var25_26 = -1;
lbl125:
                            // 2 sources

                            while (true) {
                                var56_52 = 0L;
                                var58_53 = 0.0;
lbl128:
                                // 2 sources

                                while (true) {
                                    var54_50 = 0;
                                    var55_51 = 0;
lbl131:
                                    // 2 sources

                                    while (true) {
                                        var53_49 = false;
                                        ** GOTO lbl215
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                        } else {
                            var6_11 = var41_39;
                            var12_17 = var4_4.b(var41_39);
                            var43_41 = -1;
                            var44_42 = 0.0f / 0.0f;
                            if (var12_17 == var43_41) {
                                var45_43 = var5_5.a;
                                var28_29 = var10_15;
                                var27_28 = var11_16;
                                var32_33 = var8_13;
                                var8_13 = var9_14;
                                var31_32 = var41_39;
                                var25_26 = -1;
                                var23_24 /* !! */  = var1_1;
                                var12_17 = androidx.media3.exoplayer.g.M(var10_15, var11_16, var32_33, (boolean)var9_14, var41_39, (androidx.media3.common.g)var45_43, var1_1);
                                if (var12_17 == var25_26) {
                                    var12_17 = var4_4.a((boolean)var9_14);
                                    var43_41 = 1;
                                    var44_42 = 1.4E-45f;
                                } else {
                                    var43_41 = 0;
                                    var44_42 = 0.0f;
                                    var23_24 /* !! */  = null;
                                }
                                var42_40 = var12_17;
                                var55_51 = var43_41;
                                var28_29 = var6_11;
                                var46_44 = var36_36;
                                var56_52 = 0L;
                                var58_53 = 0.0;
                                var54_50 = 0;
                                ** continue;
                            }
                            var25_26 = -1;
                            var12_17 = (int)(var36_36 == var13_18 ? 0 : (var36_36 < var13_18 ? -1 : 1));
                            if (var12_17 == 0) {
                                var42_40 = var12_17 = var4_4.h((Object)var41_39, (androidx.media3.common.g$b)var11_16).c;
                                var28_29 = var41_39;
                                var46_44 = var36_36;
                                ** continue;
                            }
                            if (var33_34 != 0) {
                                var28_29 = var5_5.a;
                                var27_28 = var27_28.a;
                                var28_29.h(var27_28, var11_16);
                                var28_29 = var5_5.a;
                                var48_45 /* !! */  = var11_16.c;
                                var60_54 = 0L;
                                var62_55 = 0.0;
                                var28_29 = var28_29.n((int)var48_45 /* !! */ , var10_15, var60_54);
                                var12_17 = var28_29.n;
                                var27_28 = var5_5.a;
                                var29_30 = var40_38.a;
                                var48_45 /* !! */  = var27_28.b(var29_30);
                                if (var12_17 == var48_45 /* !! */ ) {
                                    var64_56 = var11_16.e;
                                    var66_57 = var36_36 + var64_56;
                                    var8_13 = var4_4.h((Object)var41_39, (androidx.media3.common.g$b)var11_16).c;
                                    var28_29 = var1_1;
                                    var27_28 = var10_15;
                                    var29_30 = var11_16;
                                    var56_52 = var60_54;
                                    var58_53 = var62_55;
                                    var60_54 = var66_57;
                                    var28_29 = var1_1.j(var10_15, var11_16, var8_13, var66_57);
                                    var27_28 = var28_29.first;
                                    var46_44 = (Long)var28_29.second;
                                    var28_29 = var27_28;
                                } else {
                                    var56_52 = var60_54;
                                    var58_53 = var62_55;
                                    var28_29 = var41_39;
                                    var46_44 = var36_36;
                                }
                                var42_40 = -1;
                                var54_50 = 0;
                                var55_51 = 0;
                                var53_49 = true;
                            } else {
                                var56_52 = 0L;
                                var58_53 = 0.0;
                                var28_29 = var41_39;
                                var46_44 = var36_36;
                                var42_40 = -1;
                                ** continue;
                            }
                        }
                    }
                    if (var42_40 != var25_26) {
                        var34_35 = -9223372036854775807L;
                        var38_37 = -4.9E-324;
                        var28_29 = var1_1;
                        var27_28 = var10_15;
                        var29_30 = var11_16;
                        var8_13 = var42_40;
                        var60_54 = var34_35;
                        var62_55 = var38_37;
                        var28_29 = var1_1.j(var10_15, var11_16, var42_40, var34_35);
                        var27_28 = var28_29.first;
                        var46_44 = (Long)var28_29.second;
                        var28_29 = var27_28;
                        var68_58 = var13_18;
                    } else {
                        var68_58 = var46_44;
                    }
                    var27_28 = var7_12.r(var4_4, var28_29, var46_44);
                    var42_40 = var27_28.e;
                    if (var42_40 != var25_26 && ((var50_47 = var40_38.e) == var25_26 || var42_40 < var50_47)) {
                        var43_41 = 0;
                        var44_42 = 0.0f;
                        var23_24 /* !! */  = null;
                    } else {
                        var43_41 = 1;
                        var44_42 = 1.4E-45f;
                    }
                    var31_32 = var40_38.a;
                    var42_40 = (int)var31_32.equals(var28_29);
                    if (var42_40 != 0 && (var42_40 = (int)var40_38.b()) == 0 && (var42_40 = (int)var27_28.b()) == 0 && var43_41 != 0) {
                        var43_41 = 1;
                        var44_42 = 1.4E-45f;
                    } else {
                        var43_41 = 0;
                        var44_42 = 0.0f;
                        var23_24 /* !! */  = null;
                    }
                    var28_29 = var4_4.h(var28_29, var11_16);
                    if (var33_34 != 0 || (var42_40 = (int)(var36_36 == var68_58 ? 0 : (var36_36 < var68_58 ? -1 : 1))) != 0 || (var42_40 = (var31_32 = var40_38.a).equals(var45_43 = var27_28.a)) == 0) {
                        var24_25 = 4 != 0;
                        while (true) {
                            var26_27 = 2;
                            break block87;
                            break;
                        }
                    }
                    var42_40 = var40_38.b();
                    if (var42_40 != 0 && (var50_47 = var28_29.i(var42_40 = var40_38.b)) != 0) {
                        if ((var70_59 = var28_29.e(var42_40, var50_47 = var40_38.c)) == (var24_25 = 4 != 0)) ** continue;
                        var12_17 = var28_29.e(var42_40, var50_47);
                        if (var12_17 != (var26_27 = 2)) {
                            while (true) {
                                var12_17 = 1;
                                break block88;
                                break;
                            }
                        }
                    } else {
                        var24_25 = 4 != 0;
                        var26_27 = 2;
                        if ((var42_40 = (int)var27_28.b()) != 0 && (var12_17 = (int)var28_29.i(var42_40 = var27_28.b)) != 0) ** continue;
                    }
                }
                var12_17 = 0;
                var28_29 = null;
            }
            if (var43_41 != 0 || var12_17 != 0) {
                var27_28 = var40_38;
            }
            if ((var12_17 = var27_28.b()) != 0) {
                var12_17 = var27_28.equals(var40_38);
                if (var12_17 != 0) {
                    var73_61 = var71_60 = var5_5.s;
                } else {
                    var5_5 = var27_28.a;
                    var4_4.h(var5_5, var11_16);
                    var75_62 = var27_28.c;
                    var12_17 = var27_28.b;
                    var12_17 = var11_16.f(var12_17);
                    if (var75_62 == var12_17) {
                        var5_5 = var11_16.g;
                        var34_35 = var5_5.c;
                    } else {
                        var34_35 = var56_52;
                        var38_37 = var58_53;
                    }
                    var73_61 = var34_35;
                }
            } else {
                var73_61 = var46_44;
            }
            var5_5 = new g$f((j$b)var27_28, var73_61, var68_58, (boolean)var54_50, (boolean)var55_51, var53_49);
            var23_24 /* !! */  = var5_5;
        }
        var76_63 = var23_24 /* !! */ .a;
        var77_64 = var23_24 /* !! */ .c;
        var50_47 = var23_24 /* !! */ .d;
        var46_44 = var23_24 /* !! */ .b;
        var70_59 = 4;
        var7_12 = this;
        var5_5 = this.B.b;
        var75_62 = var5_5.equals(var76_63);
        if (var75_62 == 0) ** GOTO lbl-1000
        var5_5 = this.B;
        var71_60 = var5_5.s;
        cfr_temp_1 = var46_44 - var71_60;
        var48_45 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
        if (var48_45 /* !! */  == false) {
            var79_65 = false;
        } else lbl-1000:
        // 2 sources

        {
            var79_65 = true;
        }
        var30_31 = 3;
        try {
            block95: {
                var75_62 = var23_24 /* !! */ .e;
                if (var75_62 != 0) break block95;
                var48_45 /* !! */  = 1;
                var49_46 = 1.4E-45f;
lbl321:
                // 2 sources

                while (true) {
                    block91: {
                        block98: {
                            block100: {
                                block99: {
                                    block97: {
                                        block90: {
                                            block96: {
                                                var5_5 = var7_12.a;
                                                var12_17 = ((n[])var5_5).length;
                                                var49_46 = 0.0f;
                                                var27_28 = null;
                                                for (var48_45 /* !! */  = (long)0; var48_45 /* !! */  < var12_17; ++var48_45 /* !! */ ) {
                                                    var31_32 = var5_5[var48_45 /* !! */ ];
                                                    var31_32.n(var4_4);
                                                }
                                                if (var79_65) break block96;
                                                var28_29 = var7_12.t;
                                                var60_54 = var7_12.Q;
                                                var66_57 = this.g();
                                                var80_66 = true;
                                                var27_28 = var1_1;
                                                var56_52 = var46_44;
                                                var46_44 = var60_54;
                                                var26_27 = 0;
                                                var10_15 = null;
                                                var60_54 = var66_57;
                                                {
                                                    catch (Throwable var5_10) {
                                                        var56_52 = var46_44;
                                                        var26_27 = 0;
                                                        var10_15 = null;
                                                        var80_66 = true;
                                                        ** GOTO lbl-1000
                                                    }
                                                    ** try [egrp 4[TRYBLOCK] [12 : 1948->2138)] { 
lbl350:
                                                    // 1 sources

                                                    var75_62 = (int)var28_29.u(var1_1, var46_44, var66_57);
                                                    if (var75_62 == 0) {
                                                        var12_17 = 0;
                                                        var28_29 = null;
                                                        var7_12.O(false);
                                                    }
                                                    break block90;
                                                }
lbl356:
                                                // 1 sources

                                                catch (Throwable var5_9) lbl-1000:
                                                // 2 sources

                                                {
                                                    var33_34 = 4;
                                                    break block91;
                                                }
                                            }
                                            var56_52 = var46_44;
                                            var26_27 = 0;
                                            var10_15 = null;
                                            var80_66 = true;
                                            var75_62 = (int)var1_1.q();
                                            if (var75_62 == 0) {
                                                var5_5 = var7_12.t;
                                                var5_5 = var5_5.j;
                                                while (var5_5 != null) {
                                                    var28_29 = var5_5.h;
                                                    var28_29 = var28_29.a;
                                                    var12_17 = (int)var28_29.equals(var76_63);
                                                    if (var12_17 != 0) {
                                                        var28_29 = var7_12.t;
                                                        var27_28 = var5_5.h;
                                                        var5_5.h = var28_29 = var28_29.h(var4_4, (YM1)var27_28);
                                                        var5_5.k();
                                                    }
                                                    var5_5 = var5_5.n;
                                                }
                                                var5_5 = var7_12.t;
                                                var28_29 = var5_5.j;
                                                var5_5 = var5_5.k;
                                                if (var28_29 != var5_5) {
                                                    var42_40 = 1;
                                                } else {
                                                    var42_40 = 0;
                                                    var31_32 = null;
                                                }
                                                var28_29 = this;
                                                var27_28 = var76_63;
                                                var46_44 = var56_52;
                                                var56_52 = var71_60 = this.Q(var76_63, var56_52, (boolean)var42_40, (boolean)var50_47);
                                            }
                                        }
                                        var5_5 = var7_12.B;
                                        var81_67 = var5_5.a;
                                        var31_32 = var5_5.b;
                                        var75_62 = (int)var23_24 /* !! */ .f;
                                        if (var75_62 != 0) {
                                            var34_35 = var56_52;
                                        } else {
                                            var34_35 = var13_18;
                                            var38_37 = var15_19;
                                        }
                                        var75_62 = 0;
                                        var5_5 = null;
                                        var28_29 = this;
                                        var27_28 = var1_1;
                                        var29_30 = var76_63;
                                        var33_34 = 4;
                                        var70_59 = 0;
                                        var6_11 = null;
                                        this.n0(var1_1, var76_63, var81_67, (j$b)var31_32, var34_35, false);
                                        if (var79_65) break block97;
                                        var5_5 = var7_12.B;
                                        var71_60 = var5_5.c;
                                        cfr_temp_2 = var77_64 - var71_60;
                                        var48_45 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                        if (var48_45 /* !! */  != false) break block97;
                                        var3_3 = var7_12;
                                        break block98;
                                    }
                                    var5_5 = var7_12.B;
                                    var28_29 = var5_5.b.a;
                                    var5_5 = var5_5.a;
                                    if (!var79_65 || !var2_2 || (var48_45 /* !! */  = (long)var5_5.q()) != false) break block99;
                                    var27_28 = var7_12.m;
                                    var5_5 = var5_5.h(var28_29, (androidx.media3.common.g$b)var27_28);
                                    var75_62 = (int)var5_5.f;
                                    if (var75_62 == 0) break block100;
                                }
                                var80_66 = false;
                            }
                            var5_5 = var7_12.B;
                            var82_69 = var5_5.d;
                            var75_62 = var4_4.b(var28_29);
                            if (var75_62 == var25_26) {
                                var30_31 = 4;
                            }
                            var28_29 = this;
                            var27_28 = var76_63;
                            var46_44 = var56_52;
                            var60_54 = var77_64;
                            var3_3 = var7_12;
                            var24_25 = var80_66;
                            var9_14 = var30_31;
                            var7_12.B = var5_5 = this.q(var76_63, var56_52, var77_64, var82_69, var80_66, var30_31);
                        }
                        this.I();
                        var5_5 = var3_3.B.a;
                        var3_3.K(var4_4, (androidx.media3.common.g)var5_5);
                        var3_3.B = var5_5 = var3_3.B.h(var4_4);
                        var75_62 = (int)var1_1.q();
                        if (var75_62 == 0) {
                            var3_3.P = null;
                        }
                        var3_3.m(false);
                        var3_3.i.k(2);
                        return;
                    }
lbl456:
                    // 2 sources

                    while (true) {
                        block102: {
                            block104: {
                                block103: {
                                    block101: {
                                        var28_29 = var7_12.B;
                                        var81_68 = var28_29.a;
                                        var31_32 = var28_29.b;
                                        var12_17 = (int)var23_24 /* !! */ .f;
                                        if (var12_17 != 0) {
                                            var34_35 = var56_52;
                                        } else {
                                            var34_35 = var13_18;
                                            var38_37 = var15_19;
                                        }
                                        var70_59 = 0;
                                        var6_11 = null;
                                        var28_29 = this;
                                        var27_28 = var1_1;
                                        var29_30 = var76_63;
                                        this.n0(var1_1, var76_63, var81_68, (j$b)var31_32, var34_35, false);
                                        if (var79_65) break block101;
                                        var28_29 = var7_12.B;
                                        var64_56 = var28_29.c;
                                        cfr_temp_3 = var77_64 - var64_56;
                                        var32_33 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                        if (var32_33 != 0) break block101;
                                        var3_3 = var7_12;
                                        break block102;
                                    }
                                    var28_29 = var7_12.B;
                                    var27_28 = var28_29.b.a;
                                    var28_29 = var28_29.a;
                                    if (!var79_65 || !var2_2 || (var32_33 = (int)var28_29.q()) != 0) break block103;
                                    var29_30 = var7_12.m;
                                    var28_29 = var28_29.h(var27_28, (androidx.media3.common.g$b)var29_30);
                                    var12_17 = var28_29.f;
                                    if (var12_17 == 0) break block104;
                                }
                                var80_66 = false;
                            }
                            var28_29 = var7_12.B;
                            var82_70 = var28_29.d;
                            var12_17 = var4_4.b(var27_28);
                            if (var12_17 == var25_26) {
                                var30_31 = 4;
                            }
                            var28_29 = this;
                            var27_28 = var76_63;
                            var46_44 = var56_52;
                            var60_54 = var77_64;
                            var3_3 = var7_12;
                            var24_25 = var80_66;
                            var9_14 = var30_31;
                            var7_12.B = var28_29 = this.q(var76_63, var56_52, var77_64, var82_70, var80_66, var30_31);
                        }
                        this.I();
                        var28_29 = var3_3.B.a;
                        var3_3.K(var4_4, (androidx.media3.common.g)var28_29);
                        var3_3.B = var28_29 = var3_3.B.h(var4_4);
                        var12_17 = (int)var1_1.q();
                        if (var12_17 == 0) {
                            var3_3.P = null;
                        }
                        var3_3.m(false);
                        var3_3.i.k(2);
                        throw var5_7;
                    }
                    break;
                }
            }
            var5_5 = var7_12.B;
            var75_62 = var5_5.e;
            var48_45 /* !! */  = 1;
            var49_46 = 1.4E-45f;
            if (var75_62 != var48_45 /* !! */ ) {
                var7_12.d0(var70_59);
            }
            var12_17 = 0;
            var28_29 = null;
            var7_12.H(false, false, false, (boolean)var48_45 /* !! */ );
            ** continue;
        }
        catch (Throwable var5_6) lbl-1000:
        // 2 sources

        {
            while (true) {
                var56_52 = var46_44;
                var26_27 = 0;
                var10_15 = null;
                var33_34 = 4;
                var80_66 = true;
                ** continue;
                break;
            }
        }
        catch (Throwable var5_8) {
            var48_45 /* !! */  = 1;
            var49_46 = 1.4E-45f;
            ** continue;
        }
    }

    public final void n0(androidx.media3.common.g object, j$b object2, androidx.media3.common.g object3, j$b j$b, long l2, boolean bl2) {
        int n3;
        long l3;
        boolean bl3 = this.f0((androidx.media3.common.g)object, (j$b)object2);
        if (!bl3) {
            boolean bl4 = ((j$b)object2).b();
            object = bl4 ? ot2_0.d : this.B.o;
            object2 = this.p;
            object3 = ((d)object2).getPlaybackParameters();
            boolean bl5 = ((ot2_0)object3).equals(object);
            if (!bl5) {
                object3 = this.i;
                int n4 = 16;
                object3.l(n4);
                ((d)object2).setPlaybackParameters((ot2_0)object);
                object2 = this.B.o;
                float f5 = ((ot2_0)object).a;
                bl5 = false;
                object3 = null;
                this.p((ot2_0)object2, f5, false, false);
            }
            return;
        }
        object2 = ((j$b)object2).a;
        androidx.media3.common.g$b g$b = this.m;
        int n7 = ((androidx.media3.common.g)object).h((Object)object2, (androidx.media3.common.g$b)g$b).c;
        androidx.media3.common.g$c g$c = this.l;
        ((androidx.media3.common.g)object).o(n7, g$c);
        MediaItem$d mediaItem$d = g$c.j;
        km0_0 km0_02 = (km0_0)this.v;
        km0_02.getClass();
        km0_02.d = l3 = gz3.I(mediaItem$d.a);
        km0_02.g = l3 = gz3.I(mediaItem$d.b);
        km0_02.h = l3 = gz3.I(mediaItem$d.c);
        float f6 = mediaItem$d.d;
        int n8 = -8388609;
        float f7 = -3.4028235E38f;
        float f8 = f6 == f7 ? 0 : (f6 > f7 ? 1 : -1);
        if (f8 == false) {
            n3 = 1064849900;
            f6 = 0.97f;
        }
        km0_02.k = f6;
        float f11 = mediaItem$d.e;
        n8 = (int)(f11 == f7 ? 0 : (f11 > f7 ? 1 : -1));
        if (n8 == 0) {
            n7 = 1065604874;
            f11 = 1.03f;
        }
        km0_02.j = f11;
        long l4 = -9223372036854775807L;
        float f12 = 1.0f;
        n3 = (int)(f6 == f12 ? 0 : (f6 > f12 ? 1 : -1));
        if (n3 == 0 && (n7 = (int)(f11 == f12 ? 0 : (f11 > f12 ? 1 : -1))) == 0) {
            km0_02.d = l4;
        }
        km0_02.a();
        n7 = (int)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1));
        if (n7 != 0) {
            long l7;
            km0_02.e = l7 = this.f((androidx.media3.common.g)object, object2, l2);
            km0_02.a();
        } else {
            object = g$c.a;
            boolean n10 = ((androidx.media3.common.g)object3).q();
            if (!n10) {
                object2 = j$b.a;
                int n4 = ((androidx.media3.common.g)object3).h((Object)object2, (androidx.media3.common.g$b)g$b).c;
                long l7 = 0L;
                object2 = ((androidx.media3.common.g)object3).n((int)n4, (androidx.media3.common.g$c)g$c, (long)l7).a;
            } else {
                boolean bl4 = false;
                object2 = null;
            }
            boolean bl6 = Objects.equals(object2, object);
            if (!bl6 || bl2) {
                km0_02.e = l4;
                km0_02.a();
            }
        }
    }

    public final void o(i object) {
        boolean bl2;
        Object object2;
        Object object3 = this.t;
        Object object4 = ((androidx.media3.exoplayer.k)object3).l;
        boolean bl3 = false;
        float f5 = 0.0f;
        Object object5 = null;
        boolean bl4 = true;
        if (object4 != null && (object2 = ((j)object4).a) == object) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        d d2 = this.p;
        if (bl2) {
            Object object6;
            object4.getClass();
            int n3 = ((j)object4).f;
            if (n3 == 0) {
                object = d2.getPlaybackParameters();
                float f6 = ((ot2_0)object).a;
                object5 = this.B;
                object6 = ((Mt2)object5).a;
                bl3 = ((Mt2)object5).l;
                ((j)object4).f(f6, (androidx.media3.common.g)object6, bl3);
            }
            object = ((j)object4).h.a;
            object5 = ((j)object4).o;
            object6 = ((j)object4).p;
            this.k0((j$b)object, (sp3)object5, (Hp3)object6);
            object = ((androidx.media3.exoplayer.k)object3).j;
            if (object4 == object) {
                long l2 = ((j)object4).h.b;
                this.J(l2);
                n3 = this.a.length;
                object = new boolean[n3];
                l2 = ((androidx.media3.exoplayer.k)object3).k.e();
                this.e((boolean[])object, l2);
                object = this.B;
                object6 = ((Mt2)object).b;
                object3 = ((j)object4).h;
                long l3 = ((YM1)object3).b;
                int n4 = 5;
                long l4 = ((Mt2)object).c;
                object5 = this;
                this.B = object = this.q((j$b)object6, l3, l4, l3, false, n4);
            }
            this.u();
        } else {
            block10: {
                boolean bl5;
                while (bl3 < (bl5 = (object4 = ((androidx.media3.exoplayer.k)object3).q).size())) {
                    object4 = (j)((androidx.media3.exoplayer.k)object3).q.get((int)(bl3 ? 1 : 0));
                    object2 = ((j)object4).a;
                    if (object2 != object) {
                        bl3 += 1;
                        continue;
                    }
                    break block10;
                }
                bl5 = false;
                object4 = null;
            }
            if (object4 != null) {
                bl3 = ((j)object4).f ^ bl4;
                ct3.f(bl3);
                object5 = d2.getPlaybackParameters();
                f5 = ((ot2_0)object5).a;
                Mt2 mt2 = this.B;
                object2 = mt2.a;
                bl4 = mt2.l;
                ((j)object4).f(f5, (androidx.media3.common.g)object2, bl4);
                object3 = ((androidx.media3.exoplayer.k)object3).m;
                if (object3 != null && (object3 = ((j)object3).a) == object) {
                    this.v();
                }
            }
        }
    }

    public final void o0(boolean bl2, boolean bl3) {
        long l2;
        this.G = bl2;
        if (bl2 && !bl3) {
            VV vV = this.r;
            l2 = vV.elapsedRealtime();
        } else {
            l2 = -9223372036854775807L;
        }
        this.H = l2;
    }

    public final void p(ot2_0 ot2_02, float f5, boolean bl2, boolean n3) {
        int n4;
        Object object;
        n[] nArray;
        if (bl2) {
            if (n3 != 0) {
                nArray = this.C;
                n3 = 1;
                nArray.a(n3);
            }
            nArray = this.B.f(ot2_02);
            this.B = nArray;
        }
        float f6 = ot2_02.a;
        j j3 = this.t.j;
        while (true) {
            if (j3 == null) break;
            object = j3.p.c;
            int n7 = ((DF0[])object).length;
            for (n4 = 0; n4 < n7; ++n4) {
                DF0 dF0 = object[n4];
                if (dF0 == null) continue;
                dF0.f(f6);
            }
            j3 = j3.n;
        }
        nArray = this.a;
        n3 = nArray.length;
        while (n4 < n3) {
            object = nArray[n4];
            if (object != null) {
                float f7 = ot2_02.a;
                object.t(f5, f7);
            }
            ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void p0(Supplier object, long l2) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                block8: {
                    try {
                        VV vV = this.r;
                        long l3 = vV.elapsedRealtime() + l2;
                        boolean bl2 = false;
                        while (true) {
                            long l4;
                            long l7;
                            long l8;
                            Object object2 = object.get();
                            boolean bl3 = (Boolean)(object2 = (Boolean)object2);
                            if (bl3 || (l8 = (l7 = l2 - (l4 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) <= 0) break;
                            try {
                                object2 = this.r;
                                object2.getClass();
                                this.wait(l2);
                            }
                            catch (InterruptedException interruptedException) {
                                bl2 = true;
                            }
                            VV vV2 = this.r;
                            l2 = vV2.elapsedRealtime();
                            l2 = l3 - l2;
                        }
                        if (!bl2) break block8;
                        object = Thread.currentThread();
                        ((Thread)object).interrupt();
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Mt2 q(j$b var1_1, long var2_2, long var4_3, long var6_4, boolean var8_5, int var9_6) {
        var10_7 = this;
        var11_8 = var1_1;
        var12_9 = var4_3;
        var14_10 = var9_6;
        var15_11 /* !! */  = this.T;
        var16_12 = false;
        if (var15_11 /* !! */  != 0) ** GOTO lbl-1000
        var17_13 = this.B;
        var18_14 = var17_13.s;
        cfr_temp_0 = var2_2 - var18_14;
        var15_11 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
        if (var15_11 /* !! */  == 0 && (var15_11 /* !! */  = var1_1.equals(var17_13 = this.B.b)) != 0) {
            var15_11 /* !! */  = 0;
            var17_13 = null;
        } else lbl-1000:
        // 2 sources

        {
            var15_11 /* !! */  = 1;
        }
        var10_7.T = var15_11 /* !! */ ;
        this.I();
        var17_13 = var10_7.B;
        var20_15 = var17_13.h;
        var21_16 /* !! */  = var17_13.i;
        var22_17 = var17_13.j;
        var23_18 = var10_7.u;
        var24_19 = var23_18.k;
        if (var24_19) {
            var17_13 = var10_7.t.j;
            var20_15 = var17_13 == null ? sp3.d : var17_13.o;
            var21_16 /* !! */  = var17_13 == null ? var10_7.f : var17_13.p;
            var22_17 = var21_16 /* !! */ .c;
            var23_18 = new ImmutableList$Builder();
            var25_20 = ((DF0[])var22_17).length;
            var27_22 /* !! */  = null;
            var28_23 = false;
            for (var26_21 = 0; var26_21 < var25_20; ++var26_21) {
                var29_24 = var22_17[var26_21];
                if (var29_24 == null) continue;
                var29_24 = var29_24.a((int)0).l;
                if (var29_24 == null) {
                    var30_25 /* !! */  = new Metadata$Entry[]{};
                    var29_24 = new Metadata(var30_25 /* !! */ );
                    var23_18.add(var29_24);
                    continue;
                }
                var23_18.add(var29_24);
                var28_23 = true;
            }
            var30_25 /* !! */  = var28_23 != false ? var23_18.build() : ImmutableList.of();
            if (var17_13 != null) {
                var22_17 = var17_13.h;
                var31_27 = var22_17.c;
                cfr_temp_1 = var31_27 - var12_9;
                var26_21 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                if (var26_21 != 0) {
                    var17_13.h = var22_17 = var22_17.a(var12_9);
                }
            }
            if ((var17_13 = var10_7.t.j) != null) {
                block22: {
                    var17_13 = var17_13.p;
                    var22_17 = null;
                    var24_19 = false;
                    var23_18 = null;
                    for (var33_28 = 0; var33_28 < (var26_21 = ((n[])(var34_29 = var10_7.a)).length); ++var33_28) {
                        var26_21 = (int)var17_13.b(var33_28);
                        if (var26_21 == 0) continue;
                        var25_20 = (var34_29 = var34_29[var33_28]).m();
                        if (var25_20 != (var26_21 = 1)) {
                            var26_21 = 0;
                            var27_22 /* !! */  = null;
                            break block22;
                        }
                        var34_29 = var17_13.b[var33_28];
                        var25_20 = var34_29.a;
                        if (var25_20 == 0) continue;
                        var24_19 = true;
                    }
                    var26_21 = 1;
                }
                if (var24_19 && var26_21 != 0) {
                    var26_21 = 1;
                } else {
                    var26_21 = 0;
                    var27_22 /* !! */  = null;
                }
                var15_11 /* !! */  = var10_7.N;
                if (var26_21 != var15_11 /* !! */ ) {
                    var10_7.N = var26_21;
                    if (var26_21 == 0) {
                        var17_13 = var10_7.B;
                        var15_11 /* !! */  = (int)var17_13.p;
                        if (var15_11 /* !! */  != 0) {
                            var17_13 = var10_7.i;
                            var33_28 = 2;
                            var17_13.k(var33_28);
                        }
                    }
                }
            }
            var27_22 /* !! */  = var30_25 /* !! */ ;
            var23_18 = var20_15;
            var34_29 = var21_16 /* !! */ ;
        } else {
            var17_13 = var17_13.b;
            var15_11 /* !! */  = var11_8.equals(var17_13);
            if (var15_11 /* !! */  == 0) {
                var17_13 = sp3.d;
                var30_26 = var10_7.f;
                var20_15 = ImmutableList.of();
                var23_18 = var17_13;
                var34_29 = var30_26;
                var27_22 /* !! */  = var20_15;
            } else {
                var23_18 = var20_15;
                var34_29 = var21_16 /* !! */ ;
                var27_22 /* !! */  = var22_17;
            }
        }
        if (var8_5) {
            var17_13 = var10_7.C;
            var35_30 = var17_13.d;
            if (var35_30 != 0 && (var35_30 = var17_13.e) != (var36_31 = 5)) {
                if (var14_10 == var36_31) {
                    var16_12 = true;
                }
                ct3.a(var16_12);
            } else {
                var17_13.a = var16_12 = true;
                var17_13.d = var16_12;
                var17_13.e = var14_10;
            }
        }
        var37_32 = var10_7.B;
        var38_33 = var37_32.q;
        var40_34 = var10_7.j(var38_33);
        var11_8 = var1_1;
        var38_33 = var2_2;
        var12_9 = var4_3;
        return var37_32.c(var1_1, var2_2, var4_3, var6_4, var40_34, (sp3)var23_18, (Hp3)var34_29, (List)var27_22 /* !! */ );
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final boolean t() {
        void var5_10;
        block2: {
            block3: {
                boolean bl2;
                Object object = this.t.j;
                YM1 yM1 = ((j)object).h;
                long l2 = yM1.e;
                boolean bl3 = ((j)object).f;
                if (!bl3) break block2;
                long l3 = -9223372036854775807L;
                long l4 = l2 - l3;
                Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object2 == false) break block3;
                object = this.B;
                l3 = ((Mt2)object).s;
                long l7 = l3 - l2;
                Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object3 >= 0 && (bl2 = this.e0())) break block2;
            }
            boolean bl4 = true;
            return (boolean)var5_10;
        }
        boolean bl5 = false;
        return (boolean)var5_10;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void u() {
        Object object;
        Object object2;
        long l2;
        i i3;
        long l3;
        int n3;
        g g3 = this;
        Object object3 = this.t.l;
        boolean bl2 = androidx.media3.exoplayer.g.r((j)object3);
        long l4 = 0L;
        boolean bl3 = false;
        if (!bl2) {
            bl2 = false;
            float f5 = 0.0f;
            object3 = null;
        } else {
            long l7;
            long l8;
            long l12;
            h$a h$a;
            long l14;
            Object object4;
            long l15;
            object3 = this.t.l;
            n3 = ((j)object3).f;
            if (n3 == 0) {
                l3 = l4;
            } else {
                i3 = ((j)object3).a;
                l3 = i3.d();
            }
            l3 = g3.j(l3);
            Object object5 = g3.t.j;
            if (object3 == object5) {
                l2 = g3.Q;
                l15 = ((j)object3).q;
            } else {
                l2 = g3.Q;
                l15 = ((j)object3).q;
                l2 -= l15;
                object4 = ((j)object3).h;
                l15 = ((YM1)object4).b;
            }
            long l16 = l2 -= l15;
            object5 = g3.B.a;
            Object object6 = ((j)object3).h.a;
            int n4 = g3.f0((androidx.media3.common.g)object5, (j$b)object6);
            if (n4 != 0) {
                object5 = (km0_0)g3.v;
                l14 = l2 = ((km0_0)object5).i;
            } else {
                l14 = -9223372036854775807L;
            }
            object6 = g3.x;
            object4 = g3.B.a;
            j$b j$b = ((j)object3).h.a;
            float f6 = g3.p.getPlaybackParameters().a;
            n4 = g3.B.l;
            n4 = g3.G;
            object5 = h$a;
            object2 = h$a;
            h$a = new h$a((nu2)object6, (androidx.media3.common.g)object4, j$b, l16, l3, f6, n4 != 0, l14);
            object3 = g3.g;
            bl2 = object3.e(h$a);
            object = g3.t.j;
            if (!(bl2 || (n4 = ((j)object).f) == 0 || (l12 = (l8 = l3 - (l2 = 500000L)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) >= 0 || (n4 = (l7 = (l3 = g3.n) - l4) == 0L ? 0 : (l7 < 0L ? -1 : 1)) <= 0 && (n3 = g3.o) == 0)) {
                object3 = ((j)object).a;
                object = g3.B;
                l3 = ((Mt2)object).s;
                object3.p(l3, false);
                object3 = g3.g;
                bl2 = object3.e((h$a)object2);
            }
        }
        g3.I = bl2;
        if (bl2) {
            long l17;
            long l18;
            long l19;
            float f7;
            object3 = g3.t.l;
            object3.getClass();
            object2 = new androidx.media3.exoplayer.i$a();
            l3 = g3.Q;
            l2 = ((j)object3).q;
            ((androidx.media3.exoplayer.i$a)object2).a = l3 -= l2;
            object = g3.p.getPlaybackParameters();
            float f8 = ((ot2_0)object).a;
            float f11 = 0.0f;
            i3 = null;
            float f12 = f8 - 0.0f;
            n3 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (n3 <= 0 && (n3 = (int)((f7 = f8 - (f11 = -3.4028235E38f)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) != 0) {
                n3 = 0;
                f11 = 0.0f;
                i3 = null;
            } else {
                n3 = 1;
                f11 = Float.MIN_VALUE;
            }
            ct3.a(n3 != 0);
            ((androidx.media3.exoplayer.i$a)object2).b = f8;
            l2 = g3.H;
            long l20 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
            if (l20 < 0 && (l19 = (l18 = l2 - (l17 = -9223372036854775807L)) == 0L ? 0 : (l18 < 0L ? -1 : 1)) != false) {
                l20 = 0;
                f8 = 0.0f;
                object = null;
            } else {
                l20 = 1;
                f8 = Float.MIN_VALUE;
            }
            ct3.a((boolean)l20);
            ((androidx.media3.exoplayer.i$a)object2).c = l2;
            object = new androidx.media3.exoplayer.i((androidx.media3.exoplayer.i$a)object2);
            object2 = ((j)object3).n;
            if (object2 == null) {
                bl3 = true;
            }
            ct3.f(bl3);
            object3 = ((j)object3).a;
            object3.a((androidx.media3.exoplayer.i)object);
        }
        this.j0();
    }

    public final void v() {
        i i3;
        boolean bl2;
        boolean bl3;
        Object object = this.t;
        ((androidx.media3.exoplayer.k)object).l();
        object = ((androidx.media3.exoplayer.k)object).m;
        if (!(object == null || (bl3 = ((j)object).e) && !(bl3 = ((j)object).f) || (bl2 = (i3 = ((j)object).a).isLoading()))) {
            Object object2 = this.B.a;
            object2 = ((j)object).h.a;
            bl2 = ((j)object).f;
            if (bl2) {
                i3.o();
            }
            if (bl2 = (object2 = this.g).f()) {
                bl2 = ((j)object).e;
                boolean bl4 = true;
                if (!bl2) {
                    object2 = ((j)object).h;
                    long l2 = ((YM1)object2).b;
                    ((j)object).e = bl4;
                    i3.k(this, l2);
                } else {
                    long l3;
                    float f5;
                    object2 = new androidx.media3.exoplayer.i$a();
                    long l4 = this.Q;
                    long l7 = ((j)object).q;
                    ((androidx.media3.exoplayer.i$a)object2).a = l4 -= l7;
                    Object object3 = this.p.getPlaybackParameters();
                    float f6 = ((ot2_0)object3).a;
                    float f7 = 0.0f;
                    float f8 = f6 - 0.0f;
                    Object object4 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                    if (object4 <= 0 && (object4 = (f5 = f6 - (f7 = -3.4028235E38f)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) != false) {
                        object4 = false;
                        f7 = 0.0f;
                    } else {
                        object4 = true;
                        f7 = Float.MIN_VALUE;
                    }
                    ct3.a((boolean)object4);
                    ((androidx.media3.exoplayer.i$a)object2).b = f6;
                    l4 = this.H;
                    long l8 = 0L;
                    long l12 = l4 == l8 ? 0 : (l4 < l8 ? -1 : 1);
                    boolean bl5 = l12 >= 0 || (l12 = (l3 = l4 - (l8 = -9223372036854775807L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false;
                    ct3.a(bl5);
                    ((androidx.media3.exoplayer.i$a)object2).c = l4;
                    object3 = new androidx.media3.exoplayer.i((androidx.media3.exoplayer.i$a)object2);
                    object = ((j)object).n;
                    if (object != null) {
                        bl4 = false;
                    }
                    ct3.f(bl4);
                    i3.a((androidx.media3.exoplayer.i)object3);
                }
            }
        }
    }

    public final void w() {
        boolean bl2;
        g$d g$d = this.C;
        Object object = this.B;
        boolean bl3 = g$d.a;
        Mt2 mt2 = g$d.b;
        if (mt2 != object) {
            bl2 = true;
        } else {
            bl2 = false;
            mt2 = null;
        }
        g$d.a = bl3 |= bl2;
        g$d.b = object;
        if (bl3) {
            object = (e)((if0_0)this.s).a;
            object.getClass();
            jF0 jF02 = new jF0((e)object, g$d);
            ((e)object).i.i(jF02);
            object = this.B;
            this.C = g$d = new g$d((Mt2)object);
        }
    }

    public final void x(int n3) {
        block4: {
            uJ2[] uJ2Array;
            Object[] objectArray = this.a[n3];
            try {
                objectArray.k();
                break block4;
            }
            catch (RuntimeException runtimeException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            int n4 = objectArray.m();
            int n7 = 3;
            if (n4 != n7 && n4 != (n7 = 5)) {
                throw uJ2Array;
            }
            objectArray = this.t.j.p;
            DF0[] dF0Array = new StringBuilder("Disabling track due to error: ");
            Object object = androidx.media3.common.d.d(objectArray.c[n3].k());
            dF0Array.append((String)object);
            Cx.d(dF0Array.toString(), (Throwable)uJ2Array);
            uJ2Array = (uJ2[])objectArray.b.clone();
            dF0Array = (DF0[])objectArray.c.clone();
            object = objectArray.d;
            objectArray = (cH1$a)objectArray.e;
            Hp3 hp3 = new Hp3(uJ2Array, dF0Array, (bq3)object, (cH1$a)objectArray);
            objectArray = hp3.b;
            uJ2Array = null;
            objectArray[n3] = null;
            objectArray = hp3.c;
            objectArray[n3] = null;
            this.b(n3);
            object = this.t.j;
            long l2 = this.B.s;
            o[] oArray = ((j)object).k;
            n3 = oArray.length;
            boolean[] blArray = new boolean[n3];
            ((j)object).a(hp3, l2, false, blArray);
        }
    }

    public final void y(int n3, boolean bl2) {
        Object object = this.d;
        boolean bl3 = object[n3];
        if (bl3 != bl2) {
            object[n3] = bl2;
            object = new zf0_0;
            object(this, n3, bl2);
            H21 h21 = this.z;
            h21.i((Runnable)object);
        }
    }

    public final void z() {
        androidx.media3.common.g g3 = this.u.b();
        this.n(g3, true);
    }
}

