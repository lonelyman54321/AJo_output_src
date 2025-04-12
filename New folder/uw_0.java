/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources$Theme
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 */
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;

/*
 * Renamed from uw
 */
public abstract class uw_0
implements Cloneable {
    public int a;
    public float b = 1.0f;
    public Nq0 c;
    public Az2 d;
    public Drawable e;
    public int f;
    public Drawable g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public qn1_0 l;
    public boolean m;
    public boolean n;
    public Drawable o;
    public int p;
    public Z92 q;
    public pj_1 r;
    public Class s;
    public boolean t;
    public Resources.Theme u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public uw_0() {
        int n3;
        boolean bl2;
        Object object = Nq0.c;
        this.c = object;
        object = Az2.NORMAL;
        this.d = object;
        this.i = bl2 = true;
        this.j = n3 = -1;
        this.k = n3;
        Object object2 = wz0_1.b;
        this.l = object2;
        this.n = bl2;
        this.q = object2;
        this.r = object2 = new Jp();
        this.s = Object.class;
        this.y = bl2;
    }

    public static boolean q(int n3, int n4) {
        n3 = (n3 &= n4) != 0 ? 1 : 0;
        return n3 != 0;
    }

    public final uw_0 A(ss0 object, ry_2 ry_22, boolean bl2) {
        object = bl2 ? this.H((ss0)object, ry_22) : this.v((ss0)object, ry_22);
        ((uw_0)object).y = true;
        return object;
    }

    public final void B() {
        boolean bl2 = this.t;
        if (!bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("You cannot modify locked T, consider clone()");
        throw illegalStateException;
    }

    public uw_0 C(U92 u92, Object object) {
        boolean bl2 = this.v;
        if (bl2) {
            return this.g().C(u92, object);
        }
        dV0.b(u92);
        dV0.b(object);
        this.q.b.put(u92, object);
        this.B();
        return this;
    }

    public uw_0 D(qn1_0 qn1_02) {
        int n3;
        boolean bl2 = this.v;
        if (bl2) {
            return this.g().D(qn1_02);
        }
        this.l = qn1_02;
        this.a = n3 = this.a | 0x400;
        this.B();
        return this;
    }

    public uw_0 E(boolean bl2) {
        int n3;
        boolean bl3;
        boolean bl4 = this.v;
        boolean bl5 = true;
        if (bl4) {
            return this.g().E(bl5);
        }
        this.i = bl3 = bl2 ^ bl5;
        this.a = n3 = this.a | 0x100;
        this.B();
        return this;
    }

    public uw_0 F(Resources.Theme object) {
        int n3;
        int n4 = this.v;
        if (n4 != 0) {
            return this.g().F((Resources.Theme)object);
        }
        this.u = object;
        if (object != null) {
            this.a = n4 = this.a | 0x8000;
            U92 u92 = dk2_1.b;
            return this.C(u92, object);
        }
        this.a = n3 = this.a & 0xFFFF7FFF;
        object = dk2_1.b;
        return this.z((U92)object);
    }

    public uw_0 G(ry_2 ry_22) {
        return this.I(ry_22, true);
    }

    public final uw_0 H(ss0 ss02, ry_2 ry_22) {
        boolean bl2 = this.v;
        if (bl2) {
            return this.g().H(ss02, ry_22);
        }
        this.l(ss02);
        return this.G(ry_22);
    }

    public final uw_0 I(xq3_0 xq3_02, boolean bl2) {
        boolean bl3 = this.v;
        if (bl3) {
            return this.g().I(xq3_02, bl2);
        }
        xq3_0 xq3_03 = new ju0_1(xq3_02, bl2);
        this.J(Bitmap.class, xq3_02, bl2);
        this.J(Drawable.class, xq3_03, bl2);
        this.J(BitmapDrawable.class, xq3_03, bl2);
        xq3_03 = new az0_1(xq3_02);
        this.J(yz0_2.class, xq3_03, bl2);
        this.B();
        return this;
    }

    public final uw_0 J(Class clazz, xq3_0 xq3_02, boolean bl2) {
        boolean bl3;
        int n3 = this.v;
        if (n3 != 0) {
            return this.g().J(clazz, xq3_02, bl2);
        }
        dV0.b(xq3_02);
        this.r.put(clazz, xq3_02);
        int n4 = this.a;
        this.n = bl3 = true;
        this.a = n3 = 0x10800 | n4;
        n3 = 0;
        this.y = false;
        if (bl2) {
            int n7 = 198656;
            this.a = n4 |= n7;
            this.m = bl3;
        }
        this.B();
        return this;
    }

    public uw_0 K() {
        int n3 = this.v;
        if (n3 != 0) {
            return this.g().K();
        }
        this.z = true;
        this.a = n3 = this.a | 0x100000;
        this.B();
        return this;
    }

    public uw_0 b(uw_0 object) {
        Object object2;
        float f5;
        int n3 = this.v;
        if (n3 != 0) {
            return this.g().b((uw_0)object);
        }
        n3 = ((uw_0)object).a;
        int n4 = 2;
        if ((n3 = (int)(uw_0.q(n3, n4) ? 1 : 0)) != 0) {
            this.b = f5 = ((uw_0)object).b;
        }
        n3 = ((uw_0)object).a;
        n4 = 262144;
        if ((n3 = (int)(uw_0.q(n3, n4) ? 1 : 0)) != 0) {
            n3 = (int)(((uw_0)object).w ? 1 : 0);
            this.w = n3;
        }
        n3 = ((uw_0)object).a;
        n4 = 0x100000;
        if ((n3 = (int)(uw_0.q(n3, n4) ? 1 : 0)) != 0) {
            n3 = (int)(((uw_0)object).z ? 1 : 0);
            this.z = n3;
        }
        n3 = ((uw_0)object).a;
        n4 = 4;
        if ((n3 = (int)(uw_0.q(n3, n4) ? 1 : 0)) != 0) {
            object2 = ((uw_0)object).c;
            this.c = object2;
        }
        n3 = ((uw_0)object).a;
        n4 = 8;
        if ((n3 = (int)(uw_0.q(n3, n4) ? 1 : 0)) != 0) {
            object2 = ((uw_0)object).d;
            this.d = object2;
        }
        n3 = (int)(uw_0.q(((uw_0)object).a, 16) ? 1 : 0);
        n4 = 0;
        if (n3 != 0) {
            object2 = ((uw_0)object).e;
            this.e = object2;
            this.f = 0;
            this.a = n3 = this.a & 0xFFFFFFDF;
        }
        n3 = (int)(uw_0.q(((uw_0)object).a, 32) ? 1 : 0);
        int n7 = 0;
        pj_1 pj_12 = null;
        if (n3 != 0) {
            this.f = n3 = ((uw_0)object).f;
            this.e = null;
            this.a = n3 = this.a & 0xFFFFFFEF;
        }
        n3 = ((uw_0)object).a;
        int n8 = 64;
        if ((n3 = (int)(uw_0.q(n3, n8) ? 1 : 0)) != 0) {
            object2 = ((uw_0)object).g;
            this.g = object2;
            this.h = 0;
            this.a = n3 = this.a & 0xFFFFFF7F;
        }
        n3 = ((uw_0)object).a;
        n8 = 128;
        if ((n3 = (int)(uw_0.q(n3, n8) ? 1 : 0)) != 0) {
            this.h = n3 = ((uw_0)object).h;
            this.g = null;
            this.a = n3 = this.a & 0xFFFFFFBF;
        }
        n3 = ((uw_0)object).a;
        n8 = 256;
        if ((n3 = (int)(uw_0.q(n3, n8) ? 1 : 0)) != 0) {
            n3 = (int)(((uw_0)object).i ? 1 : 0);
            this.i = n3;
        }
        n3 = ((uw_0)object).a;
        n8 = 512;
        if ((n3 = (int)(uw_0.q(n3, n8) ? 1 : 0)) != 0) {
            this.k = n3 = ((uw_0)object).k;
            this.j = n3 = ((uw_0)object).j;
        }
        n3 = ((uw_0)object).a;
        n8 = 1024;
        if ((n3 = (int)(uw_0.q(n3, n8) ? 1 : 0)) != 0) {
            object2 = ((uw_0)object).l;
            this.l = object2;
        }
        n3 = ((uw_0)object).a;
        n8 = 4096;
        if ((n3 = (int)(uw_0.q(n3, n8) ? 1 : 0)) != 0) {
            object2 = ((uw_0)object).s;
            this.s = object2;
        }
        n3 = ((uw_0)object).a;
        n8 = 8192;
        if ((n3 = (int)(uw_0.q(n3, n8) ? 1 : 0)) != 0) {
            object2 = ((uw_0)object).o;
            this.o = object2;
            this.p = 0;
            this.a = n3 = this.a & 0xFFFFBFFF;
        }
        n3 = ((uw_0)object).a;
        n8 = 16384;
        if ((n3 = (int)(uw_0.q(n3, n8) ? 1 : 0)) != 0) {
            this.p = n3 = ((uw_0)object).p;
            this.o = null;
            this.a = n3 = this.a & 0xFFFFDFFF;
        }
        n3 = ((uw_0)object).a;
        n7 = 32768;
        if ((n3 = (int)(uw_0.q(n3, n7) ? 1 : 0)) != 0) {
            object2 = ((uw_0)object).u;
            this.u = object2;
        }
        n3 = ((uw_0)object).a;
        n7 = 65536;
        if ((n3 = (int)(uw_0.q(n3, n7) ? 1 : 0)) != 0) {
            n3 = (int)(((uw_0)object).n ? 1 : 0);
            this.n = n3;
        }
        n3 = ((uw_0)object).a;
        n7 = 131072;
        if ((n3 = (int)(uw_0.q(n3, n7) ? 1 : 0)) != 0) {
            n3 = (int)(((uw_0)object).m ? 1 : 0);
            this.m = n3;
        }
        n3 = ((uw_0)object).a;
        n7 = 2048;
        if ((n3 = (int)(uw_0.q(n3, n7) ? 1 : 0)) != 0) {
            object2 = this.r;
            pj_12 = ((uw_0)object).r;
            ((Jp)object2).putAll((Map)pj_12);
            n3 = (int)(((uw_0)object).y ? 1 : 0);
            this.y = n3;
        }
        n3 = ((uw_0)object).a;
        n7 = 524288;
        if ((n3 = (int)(uw_0.q(n3, n7) ? 1 : 0)) != 0) {
            n3 = (int)(((uw_0)object).x ? 1 : 0);
            this.x = n3;
        }
        if ((n3 = (int)(this.n ? 1 : 0)) == 0) {
            object2 = this.r;
            ((pj_1)object2).clear();
            n3 = this.a;
            this.m = false;
            n4 = -133121;
            this.a = n3 &= n4;
            n3 = 1;
            f5 = Float.MIN_VALUE;
            this.y = n3;
        }
        n3 = this.a;
        n4 = ((uw_0)object).a;
        this.a = n3 |= n4;
        object2 = this.q;
        object = ((uw_0)object).q;
        object2 = ((Z92)object2).b;
        object = ((Z92)object).b;
        ((pj_1)object2).i((a53)object);
        this.B();
        return this;
    }

    public uw_0 d() {
        boolean bl2 = this.t;
        if (bl2 && !(bl2 = this.v)) {
            IllegalStateException illegalStateException = new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            throw illegalStateException;
        }
        this.v = true;
        return this.r();
    }

    public uw_0 e() {
        ss0$d ss0$d = ss0.c;
        jr_1 jr_12 = new Object();
        return this.H(ss0$d, jr_12);
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof uw_0;
        if (bl2) {
            object = (uw_0)object;
            return this.p((uw_0)object);
        }
        return false;
    }

    public uw_0 f() {
        ss0$c ss0$c = ss0.b;
        ju_1 ju_12 = new Object();
        return this.H(ss0$c, ju_12);
    }

    public uw_0 g() {
        Object object;
        Object object2;
        try {
            object2 = super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            object = new RuntimeException(cloneNotSupportedException);
            throw object;
        }
        object2 = (uw_0)object2;
        object = new Z92();
        ((uw_0)object2).q = object;
        Object object3 = this.q;
        object = ((Z92)object).b;
        object3 = ((Z92)object3).b;
        ((pj_1)object).i((a53)object3);
        object = new Jp();
        ((uw_0)object2).r = object;
        object3 = this.r;
        ((Jp)object).putAll((Map)object3);
        object = null;
        ((uw_0)object2).t = false;
        ((uw_0)object2).v = false;
        return object2;
    }

    public int hashCode() {
        float f5 = this.b;
        Object object = dz3.a;
        int n3 = dz3.g(Float.floatToIntBits(f5), 17);
        n3 = dz3.g(this.f, n3);
        object = this.e;
        n3 = dz3.h(n3, object);
        n3 = dz3.g(this.h, n3);
        object = this.g;
        n3 = dz3.h(n3, object);
        n3 = dz3.g(this.p, n3);
        object = this.o;
        n3 = dz3.h(n3, object);
        n3 = dz3.g((int)(this.i ? 1 : 0), n3);
        n3 = dz3.g(this.j, n3);
        n3 = dz3.g(this.k, n3);
        n3 = dz3.g((int)(this.m ? 1 : 0), n3);
        n3 = dz3.g((int)(this.n ? 1 : 0), n3);
        n3 = dz3.g((int)(this.w ? 1 : 0), n3);
        n3 = dz3.g((int)(this.x ? 1 : 0), n3);
        object = this.c;
        n3 = dz3.h(n3, object);
        object = (Object)this.d;
        n3 = dz3.h(n3, object);
        object = this.q;
        n3 = dz3.h(n3, object);
        object = this.r;
        n3 = dz3.h(n3, object);
        object = this.s;
        n3 = dz3.h(n3, object);
        object = this.l;
        n3 = dz3.h(n3, object);
        object = this.u;
        return dz3.h(n3, object);
    }

    public uw_0 i(Class clazz) {
        int n3;
        boolean bl2 = this.v;
        if (bl2) {
            return this.g().i(clazz);
        }
        this.s = clazz;
        this.a = n3 = this.a | 0x1000;
        this.B();
        return this;
    }

    public uw_0 j(Nq0 nq0) {
        int n3;
        boolean bl2 = this.v;
        if (bl2) {
            return this.g().j(nq0);
        }
        dV0.c(nq0, "Argument must not be null");
        this.c = nq0;
        this.a = n3 = this.a | 4;
        this.B();
        return this;
    }

    public uw_0 k() {
        U92 u92 = NZ0.b;
        Boolean bl2 = Boolean.TRUE;
        return this.C(u92, bl2);
    }

    public uw_0 l(ss0 ss02) {
        U92 u92 = ss0.f;
        dV0.c(ss02, "Argument must not be null");
        return this.C(u92, ss02);
    }

    public uw_0 m(int n3) {
        boolean bl2 = this.v;
        if (bl2) {
            return this.g().m(n3);
        }
        this.f = n3;
        n3 = this.a | 0x20;
        this.e = null;
        this.a = n3 &= 0xFFFFFFEF;
        this.B();
        return this;
    }

    public uw_0 n(int n3) {
        boolean bl2 = this.v;
        if (bl2) {
            return this.g().n(n3);
        }
        this.p = n3;
        n3 = this.a | 0x4000;
        this.o = null;
        this.a = n3 &= 0xFFFFDFFF;
        this.B();
        return this;
    }

    public uw_0 o() {
        ss0$e ss0$e = ss0.a;
        io0_0 io0_02 = new Object();
        return this.A(ss0$e, io0_02, true);
    }

    public final boolean p(uw_0 uw_02) {
        boolean bl2;
        Object object;
        Object object2;
        int n3;
        float f5 = uw_02.b;
        float f6 = this.b;
        int n4 = Float.compare(f5, f6);
        if (n4 == 0 && (n4 = this.f) == (n3 = uw_02.f) && (n4 = (int)(dz3.b(object2 = this.e, object = uw_02.e) ? 1 : 0)) != 0 && (n4 = this.h) == (n3 = uw_02.h) && (n4 = (int)(dz3.b(object2 = this.g, object = uw_02.g) ? 1 : 0)) != 0 && (n4 = this.p) == (n3 = uw_02.p) && (n4 = (int)(dz3.b(object2 = this.o, object = uw_02.o) ? 1 : 0)) != 0 && (n4 = (int)(this.i ? 1 : 0)) == (n3 = (int)(uw_02.i ? 1 : 0)) && (n4 = this.j) == (n3 = uw_02.j) && (n4 = this.k) == (n3 = uw_02.k) && (n4 = (int)(this.m ? 1 : 0)) == (n3 = (int)(uw_02.m ? 1 : 0)) && (n4 = (int)(this.n ? 1 : 0)) == (n3 = (int)(uw_02.n ? 1 : 0)) && (n4 = (int)(this.w ? 1 : 0)) == (n3 = (int)(uw_02.w ? 1 : 0)) && (n4 = (int)(this.x ? 1 : 0)) == (n3 = (int)(uw_02.x ? 1 : 0)) && (n4 = (int)((object2 = this.c).equals(object = uw_02.c) ? 1 : 0)) != 0 && (object2 = this.d) == (object = uw_02.d) && (n4 = (int)(((Z92)(object2 = this.q)).equals(object = uw_02.q) ? 1 : 0)) != 0 && (n4 = (int)(((a53)(object2 = this.r)).equals(object = uw_02.r) ? 1 : 0)) != 0 && (n4 = (int)((object2 = this.s).equals(object = uw_02.s) ? 1 : 0)) != 0 && (n4 = (int)(dz3.b(object2 = this.l, object = uw_02.l) ? 1 : 0)) != 0 && (bl2 = dz3.b(object2 = this.u, uw_02 = uw_02.u))) {
            bl2 = true;
        } else {
            bl2 = false;
            uw_02 = null;
        }
        return bl2;
    }

    public uw_0 r() {
        this.t = true;
        return this;
    }

    public uw_0 s() {
        ss0$d ss0$d = ss0.c;
        jr_1 jr_12 = new Object();
        return this.v(ss0$d, jr_12);
    }

    public uw_0 t() {
        ss0$c ss0$c = ss0.b;
        kr_2 kr_22 = new Object();
        return this.A(ss0$c, kr_22, false);
    }

    public uw_0 u() {
        ss0$e ss0$e = ss0.a;
        io0_0 io0_02 = new Object();
        return this.A(ss0$e, io0_02, false);
    }

    public final uw_0 v(ss0 ss02, ry_2 ry_22) {
        boolean bl2 = this.v;
        if (bl2) {
            return this.g().v(ss02, ry_22);
        }
        this.l(ss02);
        return this.I(ry_22, false);
    }

    public uw_0 w(int n3, int n4) {
        boolean bl2 = this.v;
        if (bl2) {
            return this.g().w(n3, n4);
        }
        this.k = n3;
        this.j = n4;
        this.a = n3 = this.a | 0x200;
        this.B();
        return this;
    }

    public uw_0 x(int n3) {
        boolean bl2 = this.v;
        if (bl2) {
            return this.g().x(n3);
        }
        this.h = n3;
        n3 = this.a | 0x80;
        this.g = null;
        this.a = n3 &= 0xFFFFFFBF;
        this.B();
        return this;
    }

    public uw_0 y(Az2 az2) {
        int n3;
        boolean bl2 = this.v;
        if (bl2) {
            return this.g().y(az2);
        }
        dV0.c((Object)az2, "Argument must not be null");
        this.d = az2;
        this.a = n3 = this.a | 8;
        this.B();
        return this;
    }

    public final uw_0 z(U92 u92) {
        boolean bl2 = this.v;
        if (bl2) {
            return this.g().z(u92);
        }
        this.q.b.remove(u92);
        this.B();
        return this;
    }
}

