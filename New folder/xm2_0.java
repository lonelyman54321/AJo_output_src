/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xm2
 */
public final class xm2_0 {
    public String a;
    public xm3 b;
    public RU0$a c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public Vo0 i;
    public gi_0 j;
    public boolean k;
    public long l;
    public jp1_1 m;
    public vm2_0 n;
    public bp1_0 o;
    public long p;
    public int q;
    public int r;

    public xm2_0(String string2, xm3 xm32, RU0$a rU0$a, int n3, boolean bl2, int n4, int n7) {
        int n8;
        long l2;
        long l3;
        this.a = string2;
        this.b = xm32;
        this.c = rU0$a;
        this.d = n3;
        this.e = bl2;
        this.f = n4;
        this.g = n7;
        this.h = l3 = Ch1.a;
        this.l = l2 = dj1.a(0, 0);
        this.p = l3 = f60.i(0, 0, 0, 0);
        this.q = n8 = -1;
        this.r = n8;
    }

    public final int a(int n3, bp1_0 bp1_02) {
        int n4;
        int n7 = this.q;
        int n8 = this.r;
        if (n3 == n7 && n7 != (n4 = -1)) {
            return n8;
        }
        long l2 = f60.a(0, n3, 0, -1 >>> 1);
        int n10 = Nj3.a(this.b(l2, bp1_02).getHeight());
        this.q = n3;
        this.r = n10;
        return n10;
    }

    public final gi_0 b(long l2, bp1_0 object) {
        int n3;
        object = this.d((bp1_0)((Object)object));
        int n4 = this.e;
        int n7 = this.d;
        float f5 = object.b();
        long l3 = ug3_0.a(l2, n4 != 0, n7, f5);
        boolean bl2 = this.e;
        int n8 = this.d;
        n4 = this.f;
        n7 = 2;
        int n10 = 1;
        f5 = Float.MIN_VALUE;
        if (!bl2 && (bl2 = km3.b(n8, n7))) {
            n3 = 1;
        } else {
            if (n4 < n10) {
                n4 = 1;
            }
            n3 = n4;
        }
        boolean bl3 = km3.b(this.d, n7);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        Object object2 = object;
        object2 = (ii)object;
        gi_0 gi_02 = new gi_0((ii)object2, n3, bl3, l3);
        return gi_02;
    }

    public final void c(Vo0 vo0) {
        long l2;
        long l3;
        long l4;
        long l7;
        Vo0 vo02 = this.i;
        if (vo0 != null) {
            float f5 = vo0.getDensity();
            float f6 = vo0.H0();
            l7 = Ch1.a(f5, f6);
        } else {
            l7 = Ch1.a;
        }
        if (vo02 == null) {
            this.i = vo0;
            this.h = l7;
            return;
        }
        if (vo0 == null || (l4 = (l3 = (l2 = this.h) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            long l8;
            int n3;
            this.i = vo0;
            this.h = l7;
            this.j = null;
            this.n = null;
            this.o = null;
            this.q = n3 = -1;
            this.r = n3;
            n3 = 0;
            vo0 = null;
            this.p = l8 = f60.i(0, 0, 0, 0);
            this.l = l8 = dj1.a(0, 0);
            this.k = false;
        }
    }

    public final vm2_0 d(bp1_0 bp1_02) {
        boolean bl2;
        bp1_0 bp1_03;
        vm2_0 vm2_02 = this.n;
        if (vm2_02 == null || bp1_02 != (bp1_03 = this.o) || (bl2 = vm2_02.a())) {
            this.o = bp1_02;
            String string2 = this.a;
            xm3 xm32 = ym3.a(this.b, bp1_02);
            Vo0 vo0 = this.i;
            Intrinsics.checkNotNull(vo0);
            RU0$a rU0$a = this.c;
            mz0_2 mz0_22 = mz0_2.a;
            vm2_02 = new ii(string2, xm32, mz0_22, mz0_22, rU0$a, vo0);
        }
        this.n = vm2_02;
        return vm2_02;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ParagraphLayoutCache(paragraph=");
        Object object = this.j;
        object = object != null ? "<paragraph>" : "null";
        stringBuilder.append((String)object);
        stringBuilder.append(", lastDensity=");
        long l2 = this.h;
        StringBuilder stringBuilder2 = new StringBuilder("InlineDensity(density=");
        float f5 = Float.intBitsToFloat((int)(l2 >> 32));
        stringBuilder2.append(f5);
        stringBuilder2.append(", fontScale=");
        float f6 = Float.intBitsToFloat((int)(l2 & 0xFFFFFFFFL));
        stringBuilder2.append(f6);
        char c2 = ')';
        stringBuilder2.append(c2);
        String string2 = stringBuilder2.toString();
        stringBuilder.append((Object)string2);
        stringBuilder.append(c2);
        return stringBuilder.toString();
    }
}

