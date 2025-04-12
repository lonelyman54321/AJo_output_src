/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.util.SparseArray
 */
import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.d;
import androidx.media3.common.e;
import androidx.media3.common.f;
import androidx.media3.common.f$a;
import androidx.media3.common.f$b;
import androidx.media3.common.f$d;
import androidx.media3.common.g;
import androidx.media3.common.g$b;
import androidx.media3.common.g$c;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$a;
import androidx.media3.exoplayer.source.j$b;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/*
 * Renamed from Ck0
 */
public final class ck0_0
implements je {
    public final VV a;
    public final g$b b;
    public final g$c c;
    public final Ck0$a d;
    public final SparseArray e;
    public vv1_0 f;
    public f g;
    public H21 h;
    public boolean i;

    public ck0_0(VV object) {
        Qj0 qj0;
        object.getClass();
        this.a = object;
        Looper looper = Looper.myLooper();
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        Object object2 = new vv1_0(looper, (VV)object, qj0);
        this.f = object2;
        this.b = object = new g$b();
        this.c = object2 = new g$c();
        this.d = object2 = new Ck0$a((g$b)object);
        object = new SparseArray();
        this.e = object;
    }

    public final void A(int n3) {
        oe$a oe$a = this.p0();
        Kj0 kj0 = new Object();
        this.u0(oe$a, 6, kj0);
    }

    public final void B(oe oe2) {
        this.f.e(oe2);
    }

    public final void C(int n3) {
        oe$a oe$a = this.t0();
        Vj0 vj0 = new Object();
        this.u0(oe$a, 21, vj0);
    }

    public final void D(int n3) {
        oe$a oe$a = this.p0();
        Tj0 tj0 = new Object();
        this.u0(oe$a, 4, tj0);
    }

    public final void E(int n3, long l2, long l3) {
        ij0_0 ij0_02;
        Object object = this.d;
        Object object2 = ((Ck0$a)object).b;
        boolean bl2 = ((AbstractCollection)object2).isEmpty();
        object = bl2 ? null : (j$b)Iterables.getLast(((Ck0$a)object).b);
        object = this.r0((j$b)object);
        object2 = ij0_02;
        ij0_02 = new ij0_0((oe$a)object, n3, l2, l3);
        this.u0((oe$a)object, 1006, ij0_02);
    }

    public final void F(int n3, MediaItem object) {
        oe$a oe$a = this.p0();
        object = new Object();
        this.u0(oe$a, 1, (vv1$a)object);
    }

    public final void G() {
        boolean bl2 = this.i;
        if (!bl2) {
            boolean bl3;
            oe$a oe$a = this.p0();
            this.i = bl3 = true;
            Xj0 xj0 = new Object();
            int n3 = -1;
            this.u0(oe$a, n3, xj0);
        }
    }

    public final void H(boolean bl2) {
        oe$a oe$a = this.p0();
        gk0_0 gk0_02 = new Object();
        this.u0(oe$a, 9, gk0_02);
    }

    public final void I(int n3, j$b object, Iv1 iv1, jm1_0 jm1_02) {
        oe$a oe$a = this.s0(n3, (j$b)object);
        object = new Object();
        this.u0(oe$a, 1002, (vv1$a)object);
    }

    public final void J(int n3, j$b object, jm1_0 jm1_02) {
        oe$a oe$a = this.s0(n3, (j$b)object);
        object = new hk0_0(oe$a, jm1_02);
        this.u0(oe$a, 1004, (vv1$a)object);
    }

    public final void K(e object) {
        object = this.p0();
        pp_0 pp_02 = new Object();
        this.u0((oe$a)object, 14, pp_02);
    }

    public final void L(int n3, j$b object) {
        oe$a oe$a = this.s0(n3, (j$b)object);
        object = new Object();
        this.u0(oe$a, 1023, (vv1$a)object);
    }

    public final void M() {
    }

    public final void N(int n3, j$b object, Iv1 iv1, jm1_0 jm1_02) {
        oe$a oe$a = this.s0(n3, (j$b)object);
        object = new Object();
        this.u0(oe$a, 1000, (vv1$a)object);
    }

    public final void O(int n3, j$b object, int n4) {
        oe$a oe$a = this.s0(n3, (j$b)object);
        object = new Object();
        this.u0(oe$a, 1022, (vv1$a)object);
    }

    public final void P(int n3, int n4) {
        oe$a oe$a = this.t0();
        dz0_1 dz0_12 = new Object();
        this.u0(oe$a, 24, dz0_12);
    }

    public final void Q(f$a object) {
        object = this.p0();
        nn_2 nn_22 = new Object();
        this.u0((oe$a)object, 13, nn_22);
    }

    public final void R(int n3, j$b object) {
        oe$a oe$a = this.s0(n3, (j$b)object);
        object = new Object();
        this.u0(oe$a, 1026, (vv1$a)object);
    }

    public final void S(int n3, j$b object, Exception exception) {
        oe$a oe$a = this.s0(n3, (j$b)object);
        object = new Object();
        this.u0(oe$a, 1024, (vv1$a)object);
    }

    public final void T(int n3, f$d f$d, f$d f$d2) {
        Object object;
        int n4 = 1;
        if (n3 == n4) {
            n4 = 0;
            object = null;
            this.i = false;
        }
        object = this.g;
        object.getClass();
        Object object2 = this.d;
        ImmutableList immutableList = ((Ck0$a)object2).b;
        j$b j$b = ((Ck0$a)object2).e;
        g$b g$b = ((Ck0$a)object2).a;
        ((Ck0$a)object2).d = object = Ck0$a.b((f)object, immutableList, j$b, g$b);
        object = this.p0();
        object2 = new Zj0((oe$a)object, n3, f$d, f$d2);
        this.u0((oe$a)object, 11, (vv1$a)object2);
    }

    public final void U(dr_1 object) {
        object = this.t0();
        Gj0 gj0 = new Object();
        this.u0((oe$a)object, 20, gj0);
    }

    public final void V(Fp3 object) {
        object = this.p0();
        yk0_0 yk0_02 = new Object();
        this.u0((oe$a)object, 19, yk0_02);
    }

    public final void W(boolean bl2) {
        oe$a oe$a = this.p0();
        Ak0 ak0 = new Object();
        this.u0(oe$a, 3, ak0);
    }

    public final void X(ImmutableList object, j$b j$b) {
        f f5 = this.g;
        f5.getClass();
        Ck0$a ck0$a = this.d;
        ck0$a.getClass();
        Object object2 = ImmutableList.copyOf((Collection)object);
        ck0$a.b = object2;
        boolean bl2 = object.isEmpty();
        if (!bl2) {
            bl2 = false;
            object2 = null;
            ck0$a.e = object = (j$b)object.get(0);
            j$b.getClass();
            ck0$a.f = j$b;
        }
        if ((object = ck0$a.d) == null) {
            object = ck0$a.b;
            j$b = ck0$a.e;
            object2 = ck0$a.a;
            ck0$a.d = object = Ck0$a.b(f5, (ImmutableList)object, j$b, (g$b)object2);
        }
        object = f5.getCurrentTimeline();
        ck0$a.d((g)object);
    }

    public final void Y(f f5, f$b f$b) {
    }

    public final void Z(int n3, boolean bl2) {
        oe$a oe$a = this.p0();
        jo_1 jo_12 = new Object();
        this.u0(oe$a, 5, jo_12);
    }

    public final void a(wc3_0 wc3_02) {
        oe$a oe$a = this.t0();
        qk0_0 qk0_02 = new qk0_0(oe$a, wc3_02);
        this.u0(oe$a, 25, qk0_02);
    }

    public final void a0(float f5) {
        oe$a oe$a = this.t0();
        yh_0 yh_02 = new Object();
        this.u0(oe$a, 22, yh_02);
    }

    public final void b(fj0 fj02) {
        Object object = this.d.e;
        object = this.r0((j$b)object);
        q40_0 q40_02 = new q40_0((oe$a)object, fj02);
        this.u0((oe$a)object, 1020, q40_02);
    }

    public final void b0(int n3, j$b object) {
        oe$a oe$a = this.s0(n3, (j$b)object);
        object = new Object();
        this.u0(oe$a, 1025, (vv1$a)object);
    }

    public final void c(d object, hj0 object2) {
        object = this.t0();
        object2 = new Object();
        this.u0((oe$a)object, 1017, (vv1$a)object2);
    }

    public final void c0(g object, int n3) {
        object = this.g;
        object.getClass();
        Object object2 = this.d;
        Object object3 = ((Ck0$a)object2).b;
        j$b j$b = ((Ck0$a)object2).e;
        g$b g$b = ((Ck0$a)object2).a;
        ((Ck0$a)object2).d = object3 = Ck0$a.b((f)object, (ImmutableList)object3, j$b, g$b);
        object = object.getCurrentTimeline();
        ((Ck0$a)object2).d((g)object);
        object = this.p0();
        object2 = new Object();
        this.u0((oe$a)object, 0, (vv1$a)object2);
    }

    public final void d(String object) {
        object = this.t0();
        Lj0 lj0 = new Object();
        this.u0((oe$a)object, 1019, lj0);
    }

    public final void d0(int n3, int n4, boolean bl2) {
        oe$a oe$a = this.t0();
        Oj0 oj0 = new Object();
        this.u0(oe$a, 1033, oj0);
    }

    public final void e(AudioSink$a object) {
        object = this.t0();
        uk0_0 uk0_02 = new Object();
        this.u0((oe$a)object, 1031, uk0_02);
    }

    public final void e0(bq3 object) {
        object = this.p0();
        zy_2 zy_22 = new Object();
        this.u0((oe$a)object, 2, zy_22);
    }

    public final void f(String object) {
        object = this.t0();
        bk0_0 bk0_02 = new Object();
        this.u0((oe$a)object, 1012, bk0_02);
    }

    public final void f0(oe oe2) {
        oe2.getClass();
        this.f.a(oe2);
    }

    public final void g(AudioSink$a object) {
        object = this.t0();
        xk0_0 xk0_02 = new Object();
        this.u0((oe$a)object, 1032, xk0_02);
    }

    public final void g0(e object) {
        object = this.p0();
        Wj0 wj0 = new Object();
        this.u0((oe$a)object, 15, wj0);
    }

    public final void h(d object, hj0 object2) {
        object = this.t0();
        object2 = new Object();
        this.u0((oe$a)object, 1009, (vv1$a)object2);
    }

    public final void h0(int n3, boolean bl2) {
        oe$a oe$a = this.p0();
        fj0_0 fj0_02 = new Object();
        this.u0(oe$a, -1, fj0_02);
    }

    public final void i(long l2, String string2, long l3) {
        oe$a oe$a = this.t0();
        ek0_0 ek0_02 = new Object();
        this.u0(oe$a, 1016, ek0_02);
    }

    public final void i0(int n3, j$b object, Iv1 iv1, jm1_0 jm1_02, IOException iOException, boolean bl2) {
        oe$a oe$a = this.s0(n3, (j$b)object);
        object = new mk0_0(oe$a, iv1, jm1_02, iOException, bl2);
        this.u0(oe$a, 1003, (vv1$a)object);
    }

    public final void j(boolean bl2) {
        oe$a oe$a = this.t0();
        ey_2 ey_22 = new Object();
        this.u0(oe$a, 23, ey_22);
    }

    public final void j0(ot2_0 object) {
        object = this.p0();
        rl3_0 rl3_02 = new Object();
        this.u0((oe$a)object, 12, rl3_02);
    }

    public final void k(Exception object) {
        object = this.t0();
        fk0_0 fk0_02 = new Object();
        this.u0((oe$a)object, 1014, fk0_02);
    }

    public final void k0(PlaybackException object) {
        boolean bl2 = object instanceof ExoPlaybackException;
        object = bl2 && (object = ((ExoPlaybackException)object).h) != null ? this.r0((j$b)object) : this.p0();
        Nj0 nj0 = new Object();
        this.u0((oe$a)object, 10, nj0);
    }

    public final void l(List list) {
        oe$a oe$a = this.p0();
        Pj0 pj0 = new Pj0(oe$a, list);
        this.u0(oe$a, 27, pj0);
    }

    public final void l0(int n3, j$b object) {
        oe$a oe$a = this.s0(n3, (j$b)object);
        object = new Object();
        this.u0(oe$a, 1027, (vv1$a)object);
    }

    public final void m(long l2) {
        oe$a oe$a = this.t0();
        h30_0 h30_02 = new Object();
        this.u0(oe$a, 1010, h30_02);
    }

    public final void m0(f object, Looper looper) {
        boolean bl2;
        Object object2 = this.g;
        if (object2 != null && !(bl2 = ((AbstractCollection)(object2 = this.d.b)).isEmpty())) {
            bl2 = false;
            object2 = null;
        } else {
            bl2 = true;
        }
        ct3.f(bl2);
        object.getClass();
        this.g = object;
        this.h = object2 = this.a.b(looper, null);
        object2 = this.f;
        ej0_0 ej0_02 = new ej0_0(this, (f)object);
        CopyOnWriteArraySet copyOnWriteArraySet = ((vv1_0)object2).d;
        boolean bl3 = ((vv1_0)object2).i;
        VV vV = ((vv1_0)object2).a;
        this.f = object = new vv1_0(copyOnWriteArraySet, looper, vV, ej0_02, bl3);
    }

    public final void n(Exception object) {
        object = this.t0();
        dj0_0 dj0_02 = new Object();
        this.u0((oe$a)object, 1030, dj0_02);
    }

    public final void n0(int n3, j$b object, Iv1 iv1, jm1_0 jm1_02) {
        oe$a oe$a = this.s0(n3, (j$b)object);
        object = new Object();
        this.u0(oe$a, 1001, (vv1$a)object);
    }

    public final void o(long l2, Object object) {
        oe$a oe$a = this.t0();
        rk0_1 rk0_12 = new rk0_1(oe$a, object, l2);
        this.u0(oe$a, 26, rk0_12);
    }

    public final void o0(boolean bl2) {
        oe$a oe$a = this.p0();
        i30_0 i30_02 = new Object();
        this.u0(oe$a, 7, i30_02);
    }

    public final void onRepeatModeChanged(int n3) {
        oe$a oe$a = this.p0();
        ck0 ck02 = new Object();
        this.u0(oe$a, 8, ck02);
    }

    /*
     * Unable to fully structure code
     */
    public final void p(PlaybackException var1_1) {
        var2_2 = var1_1 instanceof ExoPlaybackException;
        if (!var2_2) ** GOTO lbl-1000
        var3_3 = var1_1;
        var3_3 = ((ExoPlaybackException)var1_1).h;
        if (var3_3 != null) {
            var3_3 = this.r0((j$b)var3_3);
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = this.p0();
        }
        var4_4 = new Rj0((oe$a)var3_3, var1_1);
        this.u0((oe$a)var3_3, 10, var4_4);
    }

    public final oe$a p0() {
        j$b j$b = this.d.d;
        return this.r0(j$b);
    }

    public final void q(int n3, long l2) {
        Object object = this.d.e;
        object = this.r0((j$b)object);
        ui ui2 = new Object();
        this.u0((oe$a)object, 1021, ui2);
    }

    public final oe$a q0(g g3, int n3, j$b j$b) {
        oe$a oe$a;
        int n4;
        j$b j$b2;
        Object object;
        ck0_0 ck0_02 = this;
        g g5 = g3;
        int n7 = n3;
        int n8 = g3.q();
        if (n8 != 0) {
            n8 = 0;
            object = null;
            j$b2 = null;
        } else {
            j$b2 = j$b;
        }
        long l2 = ck0_02.a.elapsedRealtime();
        object = ck0_02.g.getCurrentTimeline();
        n8 = g5.equals(object);
        if (n8 != 0 && n7 == (n8 = (object = ck0_02.g).getCurrentMediaItemIndex())) {
            n8 = 1;
        } else {
            n8 = 0;
            object = null;
        }
        long l3 = 0L;
        if (j$b2 != null && (n4 = j$b2.b()) != 0) {
            if (n8 != 0 && (n8 = (object = ck0_02.g).getCurrentAdGroupIndex()) == (n4 = j$b2.b) && (n8 = (object = ck0_02.g).getCurrentAdIndexInAdGroup()) == (n4 = j$b2.c)) {
                object = ck0_02.g;
                l3 = object.getCurrentPosition();
            }
        } else if (n8 != 0) {
            object = ck0_02.g;
            l3 = object.getContentPosition();
        } else {
            n8 = (int)(g3.q() ? 1 : 0);
            if (n8 == 0) {
                object = ck0_02.c;
                object = g5.n(n7, (g$c)object, l3);
                l3 = gz3.T(((g$c)object).l);
            }
        }
        j$b j$b3 = ck0_02.d.d;
        g g7 = ck0_02.g.getCurrentTimeline();
        int n10 = ck0_02.g.getCurrentMediaItemIndex();
        long l4 = ck0_02.g.getCurrentPosition();
        long l7 = ck0_02.g.getTotalBufferedDuration();
        object = oe$a;
        g5 = g3;
        n7 = n3;
        oe$a = new oe$a(l2, g3, n3, j$b2, l3, g7, n10, j$b3, l4, l7);
        return oe$a;
    }

    public final void r(fj0 object) {
        object = this.t0();
        ak0_0 ak0_02 = new Object();
        this.u0((oe$a)object, 1015, ak0_02);
    }

    public final oe$a r0(j$b object) {
        int n3;
        this.g.getClass();
        int n4 = 0;
        Object object2 = null;
        g g3 = object == null ? null : (g)this.d.c.get(object);
        if (object != null && g3 != null) {
            object2 = ((j$b)object).a;
            g$b g$b = this.b;
            n4 = g3.h((Object)object2, (g$b)g$b).c;
            return this.q0(g3, n4, (j$b)object);
        }
        object = this.g;
        int n7 = object.getCurrentMediaItemIndex();
        if (n7 >= (n3 = (g3 = this.g.getCurrentTimeline()).p())) {
            g3 = androidx.media3.common.g.a;
        }
        return this.q0(g3, n7, null);
    }

    public final void release() {
        H21 h21 = this.h;
        ct3.h(h21);
        bk0 bk02 = new bk0(this);
        h21.i(bk02);
    }

    public final void s(fj0 object) {
        object = this.d.e;
        object = this.r0((j$b)object);
        Sj0 sj0 = new Object();
        this.u0((oe$a)object, 1013, sj0);
    }

    public final oe$a s0(int n3, j$b object) {
        Object object2 = this.g;
        object2.getClass();
        if (object != null) {
            oe$a oe$a;
            object2 = (g)this.d.c.get(object);
            if (object2 != null) {
                oe$a = this.r0((j$b)object);
            } else {
                object2 = androidx.media3.common.g.a;
                oe$a = this.q0((g)object2, n3, (j$b)object);
            }
            return oe$a;
        }
        object = this.g.getCurrentTimeline();
        int n4 = ((g)object).p();
        if (n3 >= n4) {
            object = androidx.media3.common.g.a;
        }
        return this.q0((g)object, n3, null);
    }

    public final void t(Ue0 object) {
        object = this.p0();
        ik0_0 ik0_02 = new Object();
        this.u0((oe$a)object, 27, ik0_02);
    }

    public final oe$a t0() {
        j$b j$b = this.d.f;
        return this.r0(j$b);
    }

    public final void u(int n3, long l2) {
        Object object = this.d.e;
        object = this.r0((j$b)object);
        Mj0 mj0 = new Object();
        this.u0((oe$a)object, 1018, mj0);
    }

    public final void u0(oe$a oe$a, int n3, vv1$a vv1$a) {
        this.e.put(n3, (Object)oe$a);
        this.f.f(n3, vv1$a);
    }

    public final void v(long l2, String string2, long l3) {
        oe$a oe$a = this.t0();
        jj0_0 jj0_02 = new Object();
        this.u0(oe$a, 1008, jj0_02);
    }

    public final void w(Metadata object) {
        object = this.p0();
        hj0_0 hj0_02 = new Object();
        this.u0((oe$a)object, 28, hj0_02);
    }

    public final void x(Exception object) {
        object = this.t0();
        dk0 dk02 = new Object();
        this.u0((oe$a)object, 1029, dk02);
    }

    public final void y(int n3, long l2, long l3) {
        oe$a oe$a = this.t0();
        lk0_0 lk0_02 = new Object();
        this.u0(oe$a, 1011, lk0_02);
    }

    public final void z(fj0 object) {
        object = this.t0();
        zk0_0 zk0_02 = new Object();
        this.u0((oe$a)object, 1007, zk0_02);
    }
}

