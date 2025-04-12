/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uO2
 */
public final class uo2_0
implements a11_0 {
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public long h;
    public long i;
    public float j;
    public float k;
    public float l;
    public float m;
    public long n;
    public i13 o;
    public boolean p;
    public int q;
    public long r;
    public Vo0 s;
    public bp1_0 t;
    public Cg2 u;

    public final float D0(int n3) {
        float f5 = n3;
        float f6 = this.getDensity();
        return f5 / f6;
    }

    public final float E0(float f5) {
        float f6 = this.getDensity();
        return f5 / f6;
    }

    public final /* synthetic */ float H(long l2) {
        return mv0_0.a(l2, this);
    }

    public final float H0() {
        return this.s.H0();
    }

    public final void I0(i13 i132) {
        i13 i133 = this.o;
        int n3 = Intrinsics.areEqual(i133, i132);
        if (n3 == 0) {
            this.a = n3 = this.a | 0x2000;
            this.o = i132;
        }
    }

    public final float J0(float f5) {
        return this.getDensity() * f5;
    }

    public final long O(float f5) {
        f5 = this.E0(f5);
        return this.e(f5);
    }

    public final int O0(long l2) {
        return Math.round(this.h0(l2));
    }

    public final /* synthetic */ long Z0(long l2) {
        return Uo0.d(l2, this);
    }

    public final void b(float f5) {
        float f6 = this.d;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object != false) {
            object = this.a | 4;
            this.a = (int)object;
            this.d = f5;
        }
    }

    public final void c(float f5) {
        float f6 = this.f;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object != false) {
            object = this.a | 0x10;
            this.a = (int)object;
            this.f = f5;
        }
    }

    public final void d(float f5) {
        float f6 = this.b;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object != false) {
            object = this.a | 1;
            this.a = (int)object;
            this.b = f5;
        }
    }

    public final /* synthetic */ long e(float f5) {
        return mv0_0.b(f5, this);
    }

    public final /* synthetic */ int e0(float f5) {
        return Uo0.a(f5, this);
    }

    public final void f(float f5) {
        float f6 = this.m;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object != false) {
            object = this.a | 0x800;
            this.a = (int)object;
            this.m = f5;
        }
    }

    public final void f0(long l2) {
        long l3 = this.n;
        int n3 = Oq3.a(l3, l2);
        if (n3 == 0) {
            this.a = n3 = this.a | 0x1000;
            this.n = l2;
        }
    }

    public final void g(float f5) {
        float f6 = this.j;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object != false) {
            object = this.a | 0x100;
            this.a = (int)object;
            this.j = f5;
        }
    }

    public final float getDensity() {
        return this.s.getDensity();
    }

    public final void h(float f5) {
        float f6 = this.k;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object != false) {
            object = this.a | 0x200;
            this.a = (int)object;
            this.k = f5;
        }
    }

    public final /* synthetic */ float h0(long l2) {
        return Uo0.c(l2, this);
    }

    public final void i() {
        int n3 = Intrinsics.areEqual(null, null);
        if (n3 == 0) {
            n3 = this.a;
            int n4 = 131072;
            this.a = n3 |= n4;
        }
    }

    public final void j(float f5) {
        float f6 = this.l;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object != false) {
            object = this.a | 0x400;
            this.a = (int)object;
            this.l = f5;
        }
    }

    public final void k(float f5) {
        float f6 = this.c;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object != false) {
            object = this.a | 2;
            this.a = (int)object;
            this.c = f5;
        }
    }

    public final void m(float f5) {
        float f6 = this.e;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object != false) {
            object = this.a | 8;
            this.a = (int)object;
            this.e = f5;
        }
    }

    public final void o(int n3) {
        int n4 = y30_0.a(this.q, n3);
        if (n4 == 0) {
            n4 = this.a;
            int n7 = 32768;
            this.a = n4 |= n7;
            this.q = n3;
        }
    }

    public final void q(long l2) {
        long l3 = this.h;
        int n3 = OX.c(l3, l2);
        if (n3 == 0) {
            this.a = n3 = this.a | 0x40;
            this.h = l2;
        }
    }

    public final void r(boolean n3) {
        int n4 = this.p;
        if (n4 != n3) {
            this.a = n4 = this.a | 0x4000;
            this.p = n3;
        }
    }

    public final void s(long l2) {
        long l3 = this.i;
        int n3 = OX.c(l3, l2);
        if (n3 == 0) {
            this.a = n3 = this.a | 0x80;
            this.i = l2;
        }
    }

    public final void t(float f5) {
        float f6 = this.g;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object != false) {
            object = this.a | 0x20;
            this.a = (int)object;
            this.g = f5;
        }
    }

    public final /* synthetic */ long z(long l2) {
        return Uo0.b(l2, this);
    }
}

