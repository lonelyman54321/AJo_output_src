/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class UQ1 {
    public Sl a;
    public xm3 b;
    public RU0$a c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public List h;
    public jp1_1 i;
    public long j;
    public Vo0 k;
    public sq1_0 l;
    public bp1_0 m;
    public Tl3 n;
    public int o;
    public int p;

    public UQ1(Sl sl, xm3 xm32, RU0$a rU0$a, int n3, boolean bl2, int n4, int n7, List list) {
        int n8;
        long l2;
        this.a = sl;
        this.b = xm32;
        this.c = rU0$a;
        this.d = n3;
        this.e = bl2;
        this.f = n4;
        this.g = n7;
        this.h = list;
        this.j = l2 = Ch1.a;
        this.o = n8 = -1;
        this.p = n8;
    }

    public final int a(int n3, bp1_0 bp1_02) {
        int n4;
        int n7 = this.o;
        int n8 = this.p;
        if (n3 == n7 && n7 != (n4 = -1)) {
            return n8;
        }
        long l2 = f60.a(0, n3, 0, -1 >>> 1);
        int n10 = Nj3.a(this.b((long)l2, (bp1_0)bp1_02).e);
        this.o = n3;
        this.p = n10;
        return n10;
    }

    public final RQ1 b(long l2, bp1_0 object) {
        sq1_0 sq1_02 = this.d((bp1_0)((Object)object));
        int n3 = this.e;
        int n4 = this.d;
        float f5 = sq1_02.b();
        long l3 = ug3_0.a(l2, n3 != 0, n4, f5);
        boolean bl2 = this.e;
        int n7 = this.d;
        n3 = this.f;
        int n8 = 2;
        int n10 = 1;
        if (bl2 || !(bl2 = km3.b(n7, n8))) {
            if (n3 < n10) {
                n3 = 1;
            }
            n10 = n3;
        }
        bl2 = km3.b(this.d, n8);
        n8 = n10;
        n10 = (int)(bl2 ? 1 : 0);
        object = new RQ1(sq1_02, l3, n8, bl2);
        return object;
    }

    public final void c(Vo0 vo0) {
        long l2;
        long l3;
        long l4;
        long l7;
        Vo0 vo02 = this.k;
        if (vo0 != null) {
            float f5 = vo0.getDensity();
            float f6 = vo0.H0();
            l7 = Ch1.a(f5, f6);
        } else {
            l7 = Ch1.a;
        }
        if (vo02 == null) {
            this.k = vo0;
            this.j = l7;
            return;
        }
        if (vo0 == null || (l4 = (l3 = (l2 = this.j) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            int n3;
            this.k = vo0;
            this.j = l7;
            vo0 = null;
            this.l = null;
            this.n = null;
            this.p = n3 = -1;
            this.o = n3;
        }
    }

    public final sq1_0 d(bp1_0 object) {
        boolean bl2;
        bp1_0 bp1_02;
        Object object2 = this.l;
        if (object2 == null || object != (bp1_02 = this.m) || (bl2 = ((sq1_0)object2).a())) {
            this.m = object;
            Sl sl = this.a;
            object2 = this.b;
            xm3 xm32 = ym3.a((xm3)object2, object);
            Vo0 vo0 = this.k;
            Intrinsics.checkNotNull(vo0);
            RU0$a rU0$a = this.c;
            object = this.h;
            if (object == null) {
                object = mz0_2.a;
            }
            object2 = new sq1_0(sl, xm32, (List)object, vo0, rU0$a);
        }
        this.l = object2;
        return object2;
    }

    public final Tl3 e(bp1_0 bp1_02, long l2, RQ1 rQ1) {
        Sl3 sl3;
        Object object = this;
        RQ1 rQ12 = rQ1;
        sq1_0 sq1_02 = rQ1.a;
        float f5 = sq1_02.b();
        float f6 = rQ1.d;
        f5 = Math.min(f5, f6);
        Sl sl = this.a;
        xm3 xm32 = this.b;
        Object object2 = this.h;
        if (object2 == null) {
            object2 = mz0_2.a;
        }
        List list = object2;
        int n3 = ((UQ1)object).f;
        boolean bl2 = ((UQ1)object).e;
        int n4 = ((UQ1)object).d;
        Vo0 vo0 = ((UQ1)object).k;
        Intrinsics.checkNotNull(vo0);
        RU0$a rU0$a = ((UQ1)object).c;
        object2 = sl3;
        object = sl3;
        sl3 = new Sl3(sl, xm32, list, n3, bl2, n4, vo0, bp1_02, rU0$a, l2);
        int n7 = Nj3.a(f5);
        int n8 = Nj3.a(rQ12.e);
        long l3 = dj1.a(n7, n8);
        l3 = f60.e(l2, l3);
        Tl3 tl3 = new Tl3(sl3, rQ12, l3);
        return tl3;
    }
}

