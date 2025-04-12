/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from cr1
 */
public final class cr1_0
implements Zq1,
bl1_0 {
    public final er1_0 a;
    public int b;
    public boolean c;
    public float d;
    public final boolean e;
    public final i90_0 f;
    public final Vo0 g;
    public final Function1 h;
    public final List i;
    public final int j;
    public final int k;
    public final int l;
    public final pg2_0 m;
    public final int n;
    public final int o;
    public final /* synthetic */ bl1_0 p;

    public cr1_0(er1_0 er1_02, int n3, boolean bl2, float f5, bl1_0 bl1_02, boolean bl3, c80 c802, Vo0 vo0, int n4, Function1 function1, List list, int n7, int n8, int n10, pg2_0 pg2_02, int n14, int n15) {
        this.a = er1_02;
        this.b = n3;
        this.c = bl2;
        this.d = f5;
        this.e = bl3;
        this.g = vo0;
        this.h = function1;
        this.i = list;
        this.j = n7;
        this.k = n8;
        this.l = n10;
        this.m = pg2_02;
        this.n = n14;
        this.o = n15;
        this.p = bl1_02;
    }

    public final pg2_0 a() {
        return this.m;
    }

    public final long b() {
        bl1_0 bl1_02 = this.p;
        int n3 = bl1_02.getWidth();
        int n4 = bl1_02.getHeight();
        return dj1.a(n3, n4);
    }

    public final int c() {
        return this.n;
    }

    public final int d() {
        return this.k;
    }

    public final int e() {
        return -this.j;
    }

    public final int f() {
        return this.j;
    }

    public final int g() {
        return this.l;
    }

    public final int getHeight() {
        return this.p.getHeight();
    }

    public final int getWidth() {
        return this.p.getWidth();
    }

    public final int h() {
        return this.o;
    }

    public final List i() {
        return this.i;
    }

    public final void j() {
        this.p.j();
    }

    public final Function1 k() {
        return this.p.k();
    }

    public final Map p() {
        return this.p.p();
    }
}

