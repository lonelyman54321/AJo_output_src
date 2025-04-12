/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Handler
 */
package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.ParserException;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.drm.c;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.i$a;
import androidx.media3.exoplayer.source.k$a;
import androidx.media3.exoplayer.source.m;
import androidx.media3.exoplayer.source.n$a;
import androidx.media3.exoplayer.source.n$b;
import androidx.media3.exoplayer.source.n$c;
import androidx.media3.exoplayer.source.n$d;
import androidx.media3.exoplayer.source.n$e;
import androidx.media3.exoplayer.source.n$f;
import androidx.media3.exoplayer.source.o;
import androidx.media3.exoplayer.source.p;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.q$c;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.Loader$a;
import androidx.media3.exoplayer.upstream.Loader$b;
import androidx.media3.exoplayer.upstream.Loader$c;
import androidx.media3.exoplayer.upstream.Loader$d;
import androidx.media3.exoplayer.upstream.b;
import androidx.media3.exoplayer.upstream.b$a;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class n
implements i,
gi0_0,
Loader$a,
Loader$d,
q$c {
    public static final Map Q;
    public static final d R;
    public n$f A;
    public dx2_1 B;
    public long C;
    public boolean D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public boolean M;
    public int N;
    public boolean O;
    public boolean P;
    public final Uri a;
    public final DataSource b;
    public final c c;
    public final b d;
    public final k$a e;
    public final androidx.media3.exoplayer.drm.b$a f;
    public final n$c g;
    public final Cj0 h;
    public final String i;
    public final long j;
    public final boolean k;
    public final long l;
    public final Loader m;
    public final m n;
    public final f40 o;
    public final fa_1 p;
    public final xB2 q;
    public final Handler r;
    public i$a s;
    public IcyHeaders t;
    public q[] u;
    public n$e[] v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        String string2;
        Object object = new HashMap();
        ((HashMap)object).put("Icy-MetaData", "1");
        Q = Collections.unmodifiableMap(object);
        object = new d$a();
        ((d$a)object).a = "icy";
        ((d$a)object).n = string2 = ip1_0.l("application/x-icy");
        R = ((d$a)object).a();
    }

    public n(Uri qArray, DataSource n$eArray, fe_0 fe_02, c c2, androidx.media3.exoplayer.drm.b$a b$a, b b2, k$a k$a, n$c n$c, Cj0 cj0, String string2, int n3, boolean bl2, long l2, gi2_0 gi2_02) {
        long l3;
        this.a = qArray;
        this.b = n$eArray;
        this.c = c2;
        this.f = b$a;
        this.d = b2;
        this.e = k$a;
        this.g = n$c;
        this.h = cj0;
        this.i = string2;
        this.j = l3 = (long)n3;
        this.k = bl2;
        if (gi2_02 != null) {
            super(gi2_02);
        } else {
            n$eArray = "ProgressiveMediaPeriod";
            super((String)n$eArray);
        }
        this.m = qArray;
        this.n = fe_02;
        this.l = l2;
        super();
        this.o = qArray;
        super(this, 1);
        this.p = qArray;
        super(this);
        this.q = qArray;
        qArray = gz3.k(null);
        this.r = qArray;
        n$eArray = new n$e[]{};
        this.v = n$eArray;
        qArray = new q[]{};
        this.u = qArray;
        this.L = -9223372036854775807L;
        this.E = 1;
    }

    public final void A(dx2_1 dx2_12) {
        long l2;
        long l3;
        long l4;
        Object object = this.t;
        long l7 = -9223372036854775807L;
        object = object == null ? dx2_12 : new dX2$b(l7);
        this.B = object;
        this.C = l4 = dx2_12.getDurationUs();
        boolean bl2 = this.J;
        int n3 = 1;
        if (!bl2 && !(bl2 = (l3 = (l2 = dx2_12.getDurationUs()) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        this.D = bl2;
        if (bl2) {
            n3 = 7;
        }
        this.E = n3;
        bl2 = this.x;
        if (bl2) {
            long l8 = this.C;
            boolean bl3 = dx2_12.g();
            boolean bl4 = this.D;
            o o3 = (o)this.g;
            o3.w(l8, bl3, bl4);
        } else {
            this.w();
        }
    }

    public final void B() {
        jm1_0 jm1_02;
        Object object;
        long l2;
        n$b n$b;
        Uri uri = this.a;
        DataSource dataSource = this.b;
        m m2 = this.n;
        Object object2 = this.o;
        Object object3 = n$b;
        Object object4 = this;
        Object object5 = this;
        n$b = new n$b((n)this, uri, dataSource, m2, (gi0_0)this, (f40)object2);
        int n3 = this.x;
        if (n3 != 0) {
            long l3;
            long l4;
            long l7;
            n3 = this.v();
            ct3.f(n3 != 0);
            long l8 = this.C;
            int n4 = 1;
            l2 = -9223372036854775807L;
            long l12 = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1);
            if (l12 != false && (l7 = (l4 = (l3 = this.L) - l8) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
                this.O = n4;
                this.L = l2;
                return;
            }
            object3 = this.B;
            object3.getClass();
            l3 = this.L;
            l8 = object3.d((long)l3).a.b;
            l3 = this.L;
            object = n$b.g;
            ((Pw2)object).a = l8;
            n$b.j = l3;
            n$b.i = n4;
            object3 = null;
            n$b.m = false;
            object4 = this.u;
            n4 = ((q[])object4).length;
            for (n3 = 0; n3 < n4; ++n3) {
                long l14;
                object5 = object4[n3];
                ((q)object5).t = l14 = this.L;
            }
            this.L = l2;
        }
        this.N = n3 = this.t();
        object3 = this.d;
        int n7 = this.E;
        n3 = object3.b(n7);
        long l15 = this.m.e(n$b, (Loader$a)this, n3);
        ti0_1 ti0_12 = n$b.k;
        long l16 = n$b.a;
        object = object3;
        object3 = new Iv1(l16, ti0_12, l15);
        long l17 = n$b.j;
        l2 = this.C;
        object5 = this.e;
        object5.getClass();
        long l18 = gz3.T(l17);
        l15 = gz3.T(l2);
        object2 = jm1_02;
        jm1_02 = new jm1_0(1, -1, null, l18, l15);
        object4 = new nN1((k$a)object5, (Iv1)object3, jm1_02);
        ((k$a)object5).a((n60_0)object4);
    }

    public final boolean C() {
        boolean bl2 = this.G;
        bl2 = bl2 || (bl2 = this.v());
        return bl2;
    }

    public final boolean a(androidx.media3.exoplayer.i object) {
        boolean bl2 = this.O;
        if (!bl2) {
            boolean bl3;
            object = this.m;
            Object object2 = ((Loader)object).c;
            if (!(object2 != null || (bl3 = this.M) || (bl3 = this.x) && !(bl3 = this.I))) {
                object2 = this.o;
                bl3 = ((f40)object2).e();
                bl2 = ((Loader)object).b();
                if (!bl2) {
                    this.B();
                    bl3 = true;
                }
                return bl3;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final long b(DF0[] object, boolean[] object2, VR2[] vR2Array, boolean[] object3, long l2) {
        long l3;
        long l4;
        Object object4;
        boolean[] blArray;
        int n3;
        int n4;
        this.s();
        n$f n$f = this.A;
        sp3 sp32 = n$f.a;
        int n7 = this.I;
        int n8 = 0;
        int n10 = 0;
        qp3 qp32 = null;
        while (true) {
            Object object5;
            Object object6;
            n4 = ((Object)object).length;
            n3 = 1;
            blArray = n$f.c;
            if (n10 >= n4) break;
            object4 = vR2Array[n10];
            if (object4 != null && ((object6 = object[n10]) == null || (object5 = object2[n10]) == false)) {
                n4 = ((n$d)object4).a;
                ct3.f(blArray[n4]);
                object5 = this.I - n3;
                this.I = (int)object5;
                blArray[n4] = false;
                n4 = 0;
                object4 = null;
                vR2Array[n10] = null;
            }
            ++n10;
        }
        int n14 = this.F;
        if (n14 != 0 ? n7 == 0 : (n14 = (l4 = l2 - (l3 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != 0 && (n14 = this.z) == 0) {
            n14 = 1;
        } else {
            n14 = 0;
            object2 = null;
        }
        n$f = null;
        for (int i3 = 0; i3 < (n7 = ((Object)object).length); ++i3) {
            Object object7 = vR2Array[i3];
            if (object7 != null || (object7 = object[i3]) == null) continue;
            n10 = object7.length();
            if (n10 == n3) {
                n10 = 1;
            } else {
                n10 = 0;
                qp32 = null;
            }
            ct3.f(n10 != 0);
            n10 = object7.b(0);
            if (n10 == 0) {
                n10 = 1;
            } else {
                n10 = 0;
                qp32 = null;
            }
            ct3.f(n10 != 0);
            qp32 = object7.d();
            object4 = sp32.b;
            n10 = ((ImmutableList)object4).indexOf(qp32);
            if (n10 < 0) {
                n10 = -1;
            }
            ct3.f((blArray[n10] ^ n3) != 0);
            this.I = n4 = this.I + n3;
            blArray[n10] = n3;
            n4 = (int)(this.H ? 1 : 0);
            n7 = object7.k().u | n4;
            this.H = n7;
            vR2Array[i3] = object7 = new n$d(this, n10);
            object3[i3] = n3;
            if (n14 != 0) continue;
            object2 = this.u[n10];
            n7 = ((q)object2).q;
            n10 = ((q)object2).s;
            if ((n7 += n10) != 0 && (n14 = (int)(((q)object2).t(l2, n3 != 0) ? 1 : 0)) == 0) {
                n14 = 1;
                continue;
            }
            n14 = 0;
            object2 = null;
        }
        int n15 = this.I;
        if (n15 == 0) {
            this.M = false;
            this.G = false;
            this.H = false;
            object = this.m;
            n14 = ((Loader)object).b();
            if (n14 != 0) {
                object2 = this.u;
                int n16 = ((Object)object2).length;
                while (n8 < n16) {
                    object3 = object2[n8];
                    ((q)object3).i();
                    ++n8;
                }
                ((Loader)object).a();
            } else {
                this.O = false;
                object = this.u;
                n14 = ((Object)object).length;
                vR2Array = null;
                for (int i8 = 0; i8 < n14; ++i8) {
                    object3 = object[i8];
                    ((q)object3).r(false);
                }
            }
        } else if (n14 != 0) {
            l2 = this.f(l2);
            while (n8 < (n15 = vR2Array.length)) {
                object = vR2Array[n8];
                if (object != null) {
                    object3[n8] = n3;
                }
                ++n8;
            }
        }
        this.F = n3;
        return l2;
    }

    public final Loader$b c(Loader$c loader$c, long l2, long l3, IOException iOException, int n3) {
        pn1_0 pn1_02;
        boolean bl2;
        int n4;
        boolean bl3;
        int n7;
        Iv1 iv1;
        Object object;
        Object object2;
        Object object3;
        n n8;
        block3: {
            int n10;
            long l4;
            block6: {
                long l7;
                block4: {
                    long l8;
                    block5: {
                        long l12;
                        long l14;
                        long l15;
                        dx2_1 dx2_12;
                        block2: {
                            n8 = this;
                            object3 = loader$c;
                            object3 = (n$b)loader$c;
                            object2 = ((n$b)object3).c;
                            object = ((yc3)object2).c;
                            object2 = ((yc3)object2).d;
                            iv1 = new Iv1((Map)object2);
                            gz3.T(((n$b)object3).j);
                            gz3.T(this.C);
                            n7 = n3;
                            object2 = new b$a(iOException, n3);
                            object = this.d;
                            l4 = object.a((b$a)object2);
                            bl3 = false;
                            n4 = 1;
                            l8 = -9223372036854775807L;
                            l7 = l4 == l8 ? 0 : (l4 < l8 ? -1 : 1);
                            if (l7 != false) break block2;
                            object2 = Loader.e;
                            break block3;
                        }
                        l7 = this.t();
                        n10 = l7 > (n10 = this.N) ? 1 : 0;
                        int n14 = n8.J;
                        if (n14 != 0 || (dx2_12 = n8.B) != null && (l15 = (l14 = (l12 = dx2_12.getDurationUs()) - l8) == 0L ? 0 : (l14 < 0L ? -1 : 1)) != false) break block4;
                        bl2 = n8.x;
                        if (!bl2 || (bl2 = this.C())) break block5;
                        n8.M = n4;
                        object2 = Loader.d;
                        break block3;
                    }
                    n8.G = bl2 = n8.x;
                    n8.K = l8 = 0L;
                    n8.N = 0;
                    for (q q2 : n8.u) {
                        q2.r(false);
                    }
                    Pw2 pw2 = ((n$b)object3).g;
                    pw2.a = l8;
                    ((n$b)object3).j = l8;
                    ((n$b)object3).i = n4;
                    ((n$b)object3).m = false;
                    break block6;
                }
                n8.N = (int)l7;
            }
            Loader$b loader$b = new Loader$b(n10, l4);
            object2 = loader$b;
        }
        n7 = ((Loader$b)object2).a;
        if (n7 == 0 || n7 == n4) {
            bl3 = true;
        }
        bl2 = bl3 ^ true;
        long l15 = ((n$b)object3).j;
        long l16 = n8.C;
        object3 = n8.e;
        object3.getClass();
        long l17 = gz3.T(l15);
        long l18 = gz3.T(l16);
        jm1_0 jm1_02 = new jm1_0(1, -1, null, l17, l18);
        object = pn1_02;
        pn1_02 = new pn1_0((k$a)object3, iv1, jm1_02, iOException, bl2);
        ((k$a)object3).a(pn1_02);
        return object2;
    }

    public final long d() {
        return this.o();
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long e(long l2, ex2_0 ex2_02) {
        void var26_26;
        boolean bl2;
        long l3;
        long l4;
        long l7;
        long l8;
        long l12 = l2;
        this.s();
        Object object = this.B;
        boolean bl3 = object.g();
        long l14 = 0L;
        if (!bl3) {
            return l14;
        }
        object = this.B.d(l2);
        fx2_0 fx2_02 = ((dX2$a)object).a;
        long l15 = fx2_02.a;
        object = ((dX2$a)object).b;
        long l16 = ((fx2_0)object).a;
        long l17 = ex2_02.b;
        long l18 = ex2_02.a;
        long l19 = l18 - l14;
        Object object2 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
        if (object2 == false && (l8 = l17 == l14 ? 0 : (l17 < l14 ? -1 : 1)) == false) {
            return l2;
        }
        int n3 = gz3.a;
        long l20 = l12 - l18;
        l18 ^= l12;
        long l21 = l12 ^ l20;
        long l22 = (l18 &= l21) - l14;
        Object object3 = l22 == 0L ? 0 : (l22 < 0L ? -1 : 1);
        if (object3 < 0) {
            l20 = Long.MIN_VALUE;
        }
        if ((l7 = (l4 = (l17 = (l17 ^ (l18 = l12 + l17)) & (l21 = l12 ^ l18)) - l14) == 0L ? 0 : (l4 < 0L ? -1 : 1)) < 0) {
            l18 = Long.MAX_VALUE;
        }
        boolean bl4 = false;
        Object object4 = l20 == l15 ? 0 : (l20 < l15 ? -1 : 1);
        if (object4 <= 0 && (l3 = l15 == l18 ? 0 : (l15 < l18 ? -1 : 1)) <= 0) {
            boolean bl5 = true;
        } else {
            boolean bl6 = false;
        }
        long l23 = l20 == l16 ? 0 : (l20 < l16 ? -1 : 1);
        if (l23 <= 0 && (l23 = l16 == l18 ? 0 : (l16 < l18 ? -1 : 1)) <= 0) {
            bl2 = true;
        }
        if (var26_26 != false && bl2) {
            l18 = Math.abs(l15 - l12);
            long l24 = l18 - (l12 = Math.abs(l16 - l12));
            Object object5 = l24 == 0L ? 0 : (l24 < 0L ? -1 : 1);
            if (object5 > 0) return l16;
            return l15;
        }
        if (var26_26 != false) return l15;
        if (!bl2) return l20;
        return l16;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final long f(long l2) {
        Object object;
        Object object2;
        this.s();
        Object object3 = this.A.b;
        dx2_1 dx2_12 = this.B;
        int n3 = dx2_12.g();
        if (n3 == 0) {
            l2 = 0L;
        }
        n3 = 0;
        dx2_12 = null;
        this.G = false;
        long l3 = this.K;
        boolean bl2 = true;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        int n4 = l4 == false ? 1 : 0;
        this.K = l2;
        int n7 = this.v();
        if (n7 != 0) {
            this.L = l2;
            return l2;
        }
        n7 = this.E;
        l4 = 7;
        if (n7 != l4 && ((n7 = (int)(this.O ? 1 : 0)) != 0 || (n7 = (int)(((Loader)(object2 = this.m)).b() ? 1 : 0)) != 0)) {
            object2 = this.u;
            n7 = ((q[])object2).length;
            for (l4 = (long)0; l4 < n7; ++l4) {
                Object object4;
                block17: {
                    q q2 = this.u[l4];
                    int n8 = q2.q;
                    int n10 = q2.s + n8;
                    if (n10 == 0 && n4 != 0) continue;
                    n10 = (int)(this.z ? 1 : 0);
                    if (n10 != 0) {
                        block16: {
                            long l7;
                            int n14;
                            // MONITORENTER : q2
                            q2.s();
                            n10 = q2.q;
                            if (n8 < n10 || n8 > (n14 = q2.p + n10)) break block16;
                            q2.t = l7 = Long.MIN_VALUE;
                            q2.s = n8 -= n10;
                            // MONITOREXIT : q2
                            object4 = 1;
                            break block17;
                        }
                        // MONITOREXIT : q2
                        object4 = 0;
                        q2 = null;
                    } else {
                        object4 = q2.t(l2, false);
                    }
                }
                if (object4 || !(object4 = object3[l4]) && (object4 = this.y)) continue;
                bl2 = false;
                object = null;
                break;
            }
            if (bl2) {
                return l2;
            }
        }
        this.M = false;
        this.L = l2;
        this.O = false;
        this.H = false;
        object3 = this.m;
        boolean bl3 = ((Loader)object3).b();
        if (bl3) {
            object3 = this.u;
            n4 = ((Object)object3).length;
            while (true) {
                if (n3 >= n4) {
                    object3 = this.m;
                    ((Loader)object3).a();
                    return l2;
                }
                object2 = object3[n3];
                ((q)object2).i();
                ++n3;
            }
        }
        this.m.c = null;
        object3 = this.u;
        n4 = ((Object)object3).length;
        n7 = 0;
        object2 = null;
        while (n7 < n4) {
            object = object3[n7];
            ((q)object).r(false);
            ++n7;
        }
        return l2;
    }

    public final long g() {
        int n3;
        int n4 = this.H;
        if (n4 != 0) {
            this.H = false;
            return this.K;
        }
        n4 = this.G;
        if (n4 != 0 && ((n4 = this.O) != 0 || (n4 = this.t()) > (n3 = this.N))) {
            this.G = false;
            return this.K;
        }
        return -9223372036854775807L;
    }

    public final void h(dx2_1 dx2_12) {
        Handler handler = this.r;
        yB2 yB22 = new yB2(this, dx2_12);
        handler.post((Runnable)yB22);
    }

    public final void i() {
        IOException iOException2;
        block7: {
            b b2 = this.d;
            int n3 = this.E;
            int n4 = b2.b(n3);
            Object object = this.m;
            try {
                ((Loader)object).c(n4);
            }
            catch (IOException iOException2) {
                n3 = this.k;
                if (n3 == 0) break block7;
                object = "Suppressing preparation error because suppressPrepareError=true";
                Cx.d((String)object, iOException2);
                n4 = 1;
                this.w = n4;
                long l2 = -9223372036854775807L;
                dX2$b dX2$b = new dX2$b(l2);
                this.A(dX2$b);
            }
            n4 = (int)(this.O ? 1 : 0);
            if (n4 != 0 && (n4 = (int)(this.x ? 1 : 0)) == 0) {
                throw ParserException.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException2;
    }

    public final boolean isLoading() {
        Object object = this.m;
        boolean bl2 = ((Loader)object).b();
        if (bl2 && (bl2 = ((f40)(object = this.o)).d())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final void j() {
        this.w = true;
        Handler handler = this.r;
        fa_1 fa_12 = this.p;
        handler.post((Runnable)fa_12);
    }

    public final void k(i$a i$a, long l2) {
        this.s = i$a;
        this.o.e();
        this.B();
    }

    public final sp3 l() {
        this.s();
        return this.A.a;
    }

    public final void m(Loader$c loader$c, long l2, long l3) {
        Object object;
        Object object2;
        n n3 = this;
        Object object3 = loader$c;
        object3 = (n$b)loader$c;
        long l4 = this.C;
        long l7 = -9223372036854775807L;
        boolean bl2 = true;
        Object object4 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (object4 == false && (object2 = this.B) != null) {
            long l8;
            boolean bl3 = object2.g();
            long l12 = this.u(bl2);
            long l14 = l12 - (l8 = Long.MIN_VALUE);
            Object object5 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            if (object5 == false) {
                l12 = 0L;
            } else {
                l8 = 10000L;
                l12 += l8;
            }
            n3.C = l12;
            object5 = n3.D;
            object = (o)n3.g;
            ((o)object).w(l12, bl3, (boolean)object5);
        }
        object2 = ((n$b)object3).c;
        Uri cfr_ignored_1 = ((yc3)object2).c;
        object2 = ((yc3)object2).d;
        Iv1 iv1 = new Iv1((Map)object2);
        n3.d.getClass();
        long l15 = ((n$b)object3).j;
        l7 = n3.C;
        object = n3.e;
        object.getClass();
        long l16 = gz3.T(l15);
        l15 = gz3.T(l7);
        jm1_0 jm1_02 = new jm1_0(1, -1, null, l16, l15);
        object3 = new on1_0((k$a)object, iv1, jm1_02);
        ((k$a)object).a((n60_0)object3);
        n3.O = bl2;
        object3 = n3.s;
        object3.getClass();
        object3.h(n3);
    }

    public final wp3 n(int n3, int n4) {
        n$e n$e = new n$e(n3, false);
        return this.z(n$e);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long o() {
        long l2;
        this.s();
        int n3 = this.O;
        long l3 = Long.MIN_VALUE;
        if (n3 != 0) return l3;
        n3 = this.I;
        if (n3 == 0) {
            return l3;
        }
        n3 = (int)(this.v() ? 1 : 0);
        if (n3 != 0) {
            return this.L;
        }
        n3 = (int)(this.y ? 1 : 0);
        long l4 = Long.MAX_VALUE;
        if (n3 != 0) {
            q[] qArray = this.u;
            n3 = qArray.length;
            l2 = l4;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object;
                Object object2 = this.A;
                boolean[] blArray = ((n$f)object2).b;
                boolean bl2 = blArray[i3];
                if (!bl2 || (object = (object2 = (Object)((n$f)object2).c)[i3]) == false) continue;
                object2 = this.u[i3];
                synchronized (object2) {
                    bl2 = ((q)object2).w;
                    if (bl2) continue;
                }
                object2 = this.u[i3];
                long l7 = ((q)object2).k();
                l2 = Math.min(l2, l7);
            }
        } else {
            l2 = l4;
        }
        if ((n3 = (int)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1))) == 0) {
            l2 = this.u(false);
        }
        if ((n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1))) != 0) return l2;
        return this.K;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void p(long l2, boolean bl2) {
        n n3 = this;
        boolean bl3 = this.z;
        if (bl3) {
            return;
        }
        this.s();
        bl3 = this.v();
        if (bl3) {
            return;
        }
        boolean[] blArray = this.A.c;
        q[] qArray = this.u;
        int n4 = qArray.length;
        int n7 = 0;
        while (n7 < n4) {
            long l3;
            p p2;
            block10: {
                block8: {
                    int n8;
                    q q2;
                    block9: {
                        int n10;
                        long[] lArray;
                        long l4;
                        long l7;
                        long l8;
                        q2 = n3.u[n7];
                        n8 = blArray[n7];
                        p2 = q2.a;
                        // MONITORENTER : q2
                        int n14 = q2.p;
                        l3 = -1;
                        if (n14 == 0 || (l8 = (l7 = l2 - (l4 = (lArray = q2.n)[n10 = q2.r])) == 0L ? 0 : (l7 < 0L ? -1 : 1)) < 0) break block8;
                        l8 = n8 != 0 && (n8 = q2.s) != n14 ? (long)(++n8) : (long)n14;
                        n14 = n10;
                        n8 = q2.j(n10, (int)l8, l2, bl2);
                        if (n8 != (n14 = -1)) break block9;
                        break block10;
                    }
                    l3 = q2.h(n8);
                    break;
                }
                // MONITOREXIT : q2
            }
            p2.a(l3);
            ++n7;
        }
    }

    public final void q(long l2) {
    }

    public final void r(Loader$c loader$c, long l2, long l3, boolean bl2) {
        n n3 = this;
        Object object = loader$c;
        object = (n$b)loader$c;
        Object object2 = ((n$b)object).c;
        Uri cfr_ignored_0 = ((yc3)object2).c;
        object2 = ((yc3)object2).d;
        Iv1 iv1 = new Iv1((Map)object2);
        object2 = this.d;
        object2.getClass();
        long l4 = ((n$b)object).j;
        long l7 = this.C;
        k$a k$a = this.e;
        k$a.getClass();
        long l8 = gz3.T(l4);
        long l12 = gz3.T(l7);
        int n4 = -1;
        int n7 = 1;
        jm1_0 jm1_02 = new jm1_0(n7, n4, null, l8, l12);
        object = new qn1_1(k$a, iv1, jm1_02);
        k$a.a((n60_0)object);
        if (!bl2) {
            object = this.u;
            int n8 = ((q[])object).length;
            iv1 = null;
            for (int i3 = 0; i3 < n8; ++i3) {
                q q2 = object[i3];
                q2.r(false);
            }
            int n10 = n3.I;
            if (n10 > 0) {
                object = n3.s;
                object.getClass();
                object.h(n3);
            }
        }
    }

    public final void s() {
        ct3.f(this.x);
        this.A.getClass();
        this.B.getClass();
    }

    public final int t() {
        q[] qArray = this.u;
        int n3 = qArray.length;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            q q2 = qArray[i3];
            int n7 = q2.q;
            int n8 = q2.p;
            n4 += (n7 += n8);
        }
        return n4;
    }

    public final long u(boolean bl2) {
        Object object;
        Object object2;
        long l2 = Long.MIN_VALUE;
        for (int i3 = 0; i3 < (object2 = ((q[])(object = this.u)).length); ++i3) {
            if (!bl2) {
                object = this.A;
                object.getClass();
                object = object.c;
                object2 = object[i3];
                if (object2 == 0) continue;
            }
            object = this.u[i3];
            long l3 = object.k();
            l2 = Math.max(l2, l3);
        }
        return l2;
    }

    public final boolean v() {
        long l2 = this.L;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object != false;
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void w() {
        long l2;
        long l3;
        long l4;
        long l7;
        Object object;
        int n3;
        Object object2;
        boolean bl2;
        boolean bl3 = false;
        Object object3 = null;
        int n4 = 1;
        int n7 = this.P;
        if (n7 != 0) return;
        n7 = this.x;
        if (n7 != 0) return;
        n7 = this.w;
        if (n7 == 0) return;
        Object object4 = this.B;
        if (object4 == null) {
            return;
        }
        object4 = this.u;
        boolean bl4 = ((q[])object4).length;
        boolean[] blArray = null;
        for (bl2 = false; bl2 < bl4; bl2 += n4) {
            object2 = object4[bl2];
            synchronized (object2) {
                n3 = ((q)object2).y;
                if (n3 != 0) {
                    return;
                }
                object = ((q)object2).z;
                if (object != null) continue;
            }
            return;
        }
        this.o.c();
        object4 = this.u;
        n7 = ((q[])object4).length;
        qp3[] qp3Array = new qp3[n7];
        blArray = new boolean[n7];
        int n8 = 0;
        object2 = null;
        while (true) {
            Object object5;
            int n10;
            Object object6;
            d d2;
            block16: {
                int n14;
                boolean bl5;
                block18: {
                    block17: {
                        boolean bl6;
                        l7 = this.l;
                        l4 = -9223372036854775807L;
                        if (n8 >= n7) break;
                        d2 = this.u[n8].n();
                        d2.getClass();
                        String string2 = d2.o;
                        bl5 = ip1_0.h(string2);
                        bl6 = bl5 || (bl6 = ip1_0.k(string2));
                        blArray[n8] = bl6;
                        boolean bl7 = this.y;
                        this.y = bl6 |= bl7;
                        boolean bl8 = ip1_0.i(string2);
                        bl6 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1);
                        if (bl6 && n7 == n4 && bl8) {
                            n3 = 1;
                        } else {
                            n3 = 0;
                            object = null;
                        }
                        this.z = n3;
                        object = this.t;
                        if (object == null) break block16;
                        if (bl5) break block17;
                        object6 = this.v[n8];
                        n10 = ((n$e)object6).b;
                        if (n10 == 0) break block18;
                    }
                    if ((object6 = d2.l) == null) {
                        object5 = new Metadata$Entry[n4];
                        object5[0] = object;
                        object6 = new Metadata((Metadata$Entry)object5);
                    } else {
                        object5 = new Metadata$Entry[n4];
                        object5[0] = object;
                        object6 = ((Metadata)object6).a((Metadata$Entry)object5);
                    }
                    object5 = d2.a();
                    object5.k = object6;
                    d2 = new d((d$a)object5);
                }
                if (bl5 && (n10 = d2.h) == (n14 = -1) && (n10 = d2.i) == n14 && (n3 = ((IcyHeaders)object).a) != n14) {
                    object6 = d2.a();
                    ((d$a)object6).h = n3;
                    d2 = new d((d$a)object6);
                }
            }
            n3 = this.c.c(d2);
            object6 = d2.a();
            ((d$a)object6).L = n3;
            object = ((d$a)object6).a();
            object5 = Integer.toString(n8);
            d[] dArray = new d[n4];
            dArray[0] = object;
            qp3Array[n8] = object6 = new qp3((String)object5, dArray);
            n10 = (int)(this.H ? 1 : 0);
            n3 = ((d)object).u | n10;
            this.H = n3;
            n8 += n4;
        }
        object4 = new sp3(qp3Array);
        object3 = new n$f((sp3)object4, blArray);
        this.A = object3;
        bl3 = this.z;
        if (bl3 && !(bl3 = (l3 = (l2 = this.C) - l4) == 0L ? 0 : (l3 < 0L ? -1 : 1))) {
            this.C = l7;
            object4 = this.B;
            this.B = object3 = new n$a(this, (dx2_1)object4);
        }
        l2 = this.C;
        bl3 = this.B.g();
        bl2 = this.D;
        object2 = (o)this.g;
        ((o)object2).w(l2, bl3, bl2);
        this.x = n4;
        object3 = this.s;
        object3.getClass();
        object3.c(this);
    }

    public final void x(int n3) {
        this.s();
        Object object = this.A;
        boolean[] blArray = ((n$f)object).d;
        boolean bl2 = blArray[n3];
        if (!bl2) {
            boolean bl3;
            object = ((n$f)object).a.a((int)n3).d;
            bl2 = false;
            d d2 = object[0];
            int n4 = ip1_0.g(d2.o);
            long l2 = this.K;
            object = this.e;
            object.getClass();
            long l3 = gz3.T(l2);
            long l4 = -9223372036854775807L;
            int n7 = 1;
            jm1_0 jm1_02 = new jm1_0(n7, n4, d2, l3, l4);
            mN1 mN12 = new mN1((k$a)object, jm1_02);
            ((k$a)object).a(mN12);
            blArray[n3] = bl3 = true;
        }
    }

    public final void y(int n3) {
        boolean bl2;
        this.s();
        boolean[] blArray = this.A.b;
        int n4 = this.M;
        if (n4 != 0 && (bl2 = blArray[n3])) {
            Object object = this.u[n3];
            bl2 = false;
            blArray = null;
            n3 = (int)(((q)object).o(false) ? 1 : 0);
            if (n3 == 0) {
                long l2;
                this.L = l2 = 0L;
                this.M = false;
                n3 = 1;
                this.G = n3;
                this.K = l2;
                this.N = 0;
                for (q q2 : this.u) {
                    q2.r(false);
                }
                object = this.s;
                object.getClass();
                object.h(this);
            }
        }
    }

    public final wp3 z(n$e qArray) {
        Object object;
        int n3;
        Object object2 = this.u;
        int n4 = ((q[])object2).length;
        q q2 = null;
        for (n3 = 0; n3 < n4; ++n3) {
            object = this.v[n3];
            boolean bl2 = qArray.equals(object);
            if (!bl2) continue;
            return this.u[n3];
        }
        n3 = (int)(this.w ? 1 : 0);
        if (n3 != 0) {
            object2 = new StringBuilder("Extractor added new track (id=");
            int n7 = qArray.a;
            ((StringBuilder)object2).append(n7);
            ((StringBuilder)object2).append(") after finishing tracks.");
            Cx.f(((StringBuilder)object2).toString());
            qArray = new jq0_0();
            return qArray;
        }
        object = this.c;
        object.getClass();
        androidx.media3.exoplayer.drm.b$a b$a = this.f;
        b$a.getClass();
        Cj0 cj0 = this.h;
        q2 = new q(cj0, (c)object, b$a);
        q2.f = this;
        object = this.v;
        int n8 = n4 + 1;
        object = Arrays.copyOf(object, n8);
        object[n4] = qArray;
        int n10 = gz3.a;
        this.v = object;
        qArray = Arrays.copyOf(this.u, n8);
        qArray[n4] = q2;
        this.u = qArray;
        return q2;
    }
}

