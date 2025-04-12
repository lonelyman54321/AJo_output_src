/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

public final class vl2
implements kl2_1,
bl1_0 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final pg2_0 e;
    public final int f;
    public final int g;
    public final boolean h;
    public final int i;
    public final fl1_1 j;
    public final fl1_1 k;
    public float l;
    public int m;
    public boolean n;
    public final t83 o;
    public final boolean p;
    public final List q;
    public final List r;
    public final i90_0 s;
    public final /* synthetic */ bl1_0 t;

    public vl2(List list, int n3, int n4, int n7, pg2_0 pg2_02, int n8, int n10, int n14, t83 t832, bl1_0 bl1_02, c80 c802) {
        mz0_2 mz0_22 = mz0_2.a;
        this(list, n3, n4, n7, pg2_02, n8, n10, false, n14, null, null, 0.0f, 0, false, t832, bl1_02, false, mz0_22, mz0_22, c802);
    }

    public vl2(List list, int n3, int n4, int n7, pg2_0 pg2_02, int n8, int n10, boolean bl2, int n14, fl1_1 fl1_12, fl1_1 fl1_13, float f5, int n15, boolean bl3, t83 t832, bl1_0 bl1_02, boolean bl4, List list2, List list3, c80 c802) {
        this.a = list;
        this.b = n3;
        this.c = n4;
        this.d = n7;
        this.e = pg2_02;
        this.f = n8;
        this.g = n10;
        this.h = bl2;
        this.i = n14;
        this.j = fl1_12;
        this.k = fl1_13;
        this.l = f5;
        this.m = n15;
        this.n = bl3;
        this.o = t832;
        this.p = bl4;
        this.q = list2;
        this.r = list3;
        this.t = bl1_02;
    }

    public final pg2_0 a() {
        return this.e;
    }

    public final long b() {
        bl1_0 bl1_02 = this.t;
        int n3 = bl1_02.getWidth();
        int n4 = bl1_02.getHeight();
        return dj1.a(n3, n4);
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.g;
    }

    public final int e() {
        return -this.f;
    }

    public final int f() {
        return this.f;
    }

    public final boolean g() {
        return this.h;
    }

    public final int getHeight() {
        return this.t.getHeight();
    }

    public final int getPageSize() {
        return this.b;
    }

    public final int getWidth() {
        return this.t.getWidth();
    }

    public final List h() {
        return this.a;
    }

    public final int i() {
        return this.c;
    }

    public final void j() {
        this.t.j();
    }

    public final Function1 k() {
        return this.t.k();
    }

    public final int l() {
        return this.i;
    }

    public final t83 m() {
        return this.o;
    }

    public final Map p() {
        return this.t.p();
    }
}

