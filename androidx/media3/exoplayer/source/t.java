/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.d;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSource$Factory;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.source.i$a;
import androidx.media3.exoplayer.source.k$a;
import androidx.media3.exoplayer.source.t$a;
import androidx.media3.exoplayer.source.t$b;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.Loader$a;
import androidx.media3.exoplayer.upstream.Loader$b;
import androidx.media3.exoplayer.upstream.Loader$c;
import androidx.media3.exoplayer.upstream.b;
import androidx.media3.exoplayer.upstream.b$a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public final class t
implements androidx.media3.exoplayer.source.i,
Loader$a {
    public final ti0_1 a;
    public final DataSource$Factory b;
    public final Kq3 c;
    public final b d;
    public final k$a e;
    public final sp3 f;
    public final ArrayList g;
    public final long h;
    public final Loader i;
    public final d j;
    public final boolean k;
    public boolean l;
    public byte[] m;
    public int n;

    public t(ti0_1 object, DataSource$Factory object2, Kq3 qp3Array, d d2, long l2, b b2, k$a k$a, boolean bl2) {
        this.a = object;
        this.b = object2;
        this.c = qp3Array;
        this.j = d2;
        this.h = l2;
        this.d = b2;
        this.e = k$a;
        this.k = bl2;
        int n3 = 1;
        d[] dArray = new d[n3];
        dArray[0] = d2;
        object2 = new qp3("", dArray);
        qp3Array = new qp3[n3];
        qp3Array[0] = object2;
        this.f = object = new sp3(qp3Array);
        object = new ArrayList();
        this.g = object;
        this.i = object = new Loader("SingleSampleMediaPeriod");
    }

    public final boolean a(i object) {
        Object object2;
        int n3;
        boolean bl2 = this.l;
        if (!bl2 && (n3 = ((Loader)(object = this.i)).b()) == 0 && (object2 = ((Loader)object).c) == null) {
            object2 = this.b.a();
            Object object3 = this.c;
            if (object3 != null) {
                object2.g((Kq3)object3);
            }
            ti0_1 ti0_12 = this.a;
            object3 = new t$b(ti0_12, (DataSource)object2);
            object2 = this.d;
            boolean bl3 = true;
            n3 = object2.b((int)(bl3 ? 1 : 0));
            long l2 = ((Loader)object).e((Loader$c)object3, this, n3);
            long l3 = ((t$b)object3).a;
            Object object4 = this.a;
            Object object5 = object;
            object = new Iv1(l3, (ti0_1)object4, l2);
            object2 = this.e;
            object2.getClass();
            l2 = gz3.T(0L);
            long l4 = gz3.T(this.h);
            object4 = this.j;
            object5 = object3;
            object3 = new jm1_0(1, -1, (d)object4, l2, l4);
            object5 = new nN1((k$a)object2, (Iv1)object, (jm1_0)object3);
            ((k$a)object2).a((n60_0)object5);
            return bl3;
        }
        return false;
    }

    public final long b(DF0[] dF0Array, boolean[] blArray, VR2[] vR2Array, boolean[] blArray2, long l2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = dF0Array.length); ++i3) {
            boolean bl2;
            DF0 dF0;
            Object object = vR2Array[i3];
            ArrayList arrayList = this.g;
            if (!(object == null || (dF0 = dF0Array[i3]) != null && (bl2 = blArray[i3]))) {
                arrayList.remove(object);
                n3 = 0;
                object = null;
                vR2Array[i3] = null;
            }
            if ((object = vR2Array[i3]) != null || (object = dF0Array[i3]) == null) continue;
            object = new t$a(this);
            arrayList.add(object);
            vR2Array[i3] = object;
            blArray2[i3] = n3 = 1;
        }
        return l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Loader$b c(Loader$c loader$c, long l2, long l3, IOException iOException, int n3) {
        pn1_0 pn1_02;
        Object object;
        int n4;
        t t3 = this;
        IOException iOException2 = iOException;
        int n7 = n3;
        Object object2 = loader$c;
        object2 = ((t$b)loader$c).c;
        Object object3 = ((yc3)object2).c;
        object2 = ((yc3)object2).d;
        Iv1 iv1 = new Iv1((Map)object2);
        long l4 = this.h;
        gz3.T(l4);
        object2 = new b$a(iOException, n3);
        object3 = this.d;
        long l7 = object3.a((b$a)object2);
        long l8 = -9223372036854775807L;
        int n8 = 1;
        boolean bl2 = false;
        long l12 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
        if (l12 != false && n3 < (n4 = object3.b(n8))) {
            n7 = 0;
            object = null;
        } else {
            n7 = 1;
        }
        n4 = (int)(t3.k ? 1 : 0);
        if (n4 != 0 && n7 != 0) {
            Cx.g("Loading failed, treating as end-of-stream.", iOException2);
            t3.l = n8;
            object = Loader.d;
        } else {
            object = l12 != false ? new Loader$b(0, l7) : Loader.e;
        }
        Loader$b loader$b = object;
        n7 = ((Loader$b)object).a;
        if (n7 == 0 || n7 == n8) {
            bl2 = true;
        }
        boolean bl3 = bl2 ^ true;
        k$a k$a = t3.e;
        k$a.getClass();
        long l14 = gz3.T(0L);
        long l15 = gz3.T(l4);
        d d2 = t3.j;
        object3 = new jm1_0(1, -1, d2, l14, l15);
        object = pn1_02;
        object2 = k$a;
        iOException2 = iOException;
        pn1_02 = new pn1_0(k$a, iv1, (jm1_0)object3, iOException, bl3);
        k$a.a(pn1_02);
        return loader$b;
    }

    public final long d() {
        Loader loader;
        boolean bl2 = this.l;
        long l2 = !bl2 && !(bl2 = (loader = this.i).b()) ? 0L : Long.MIN_VALUE;
        return l2;
    }

    public final long e(long l2, ex2_0 ex2_02) {
        return l2;
    }

    public final long f(long l2) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.g)).size()); ++i3) {
            object = (t$a)((ArrayList)object).get(i3);
            n3 = ((t$a)object).a;
            int n4 = 2;
            if (n3 != n4) continue;
            ((t$a)object).a = n3 = 1;
        }
        return l2;
    }

    public final long g() {
        return -9223372036854775807L;
    }

    public final void i() {
    }

    public final boolean isLoading() {
        return this.i.b();
    }

    public final void k(i$a i$a, long l2) {
        i$a.c(this);
    }

    public final sp3 l() {
        return this.f;
    }

    public final void m(Loader$c object, long l2, long l3) {
        int n3;
        object = (t$b)object;
        this.n = n3 = (int)((t$b)object).c.b;
        Object object2 = ((t$b)object).d;
        object2.getClass();
        this.m = object2;
        this.l = true;
        object2 = new Iv1;
        object = ((t$b)object).c;
        Object object3 = ((yc3)object).c;
        object = ((yc3)object).d;
        object2((Map)object);
        this.d.getClass();
        object = this.e;
        object.getClass();
        long l4 = gz3.T(0L);
        long l7 = gz3.T(this.h);
        d d2 = this.j;
        object3 = new jm1_0(1, -1, d2, l4, l7);
        on1_0 on1_02 = new on1_0((k$a)object, (Iv1)object2, (jm1_0)object3);
        ((k$a)object).a(on1_02);
    }

    public final long o() {
        boolean bl2 = this.l;
        long l2 = bl2 ? Long.MIN_VALUE : 0L;
        return l2;
    }

    public final void p(long l2, boolean bl2) {
    }

    public final void q(long l2) {
    }

    public final void r(Loader$c object, long l2, long l3, boolean bl2) {
        object = ((t$b)object).c;
        Object object2 = ((yc3)object).c;
        object = ((yc3)object).d;
        Iv1 iv1 = new Iv1((Map)object);
        this.d.getClass();
        object = this.e;
        object.getClass();
        long l4 = gz3.T(0L);
        long l7 = gz3.T(this.h);
        object2 = new jm1_0(1, -1, null, l4, l7);
        qn1_1 qn1_12 = new qn1_1((k$a)object, iv1, (jm1_0)object2);
        ((k$a)object).a(qn1_12);
    }
}

