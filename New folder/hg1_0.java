/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Hg1
 */
public final class hg1_0
implements dx2_1 {
    public final ZA1 a;
    public final ZA1 b;
    public long c;

    public hg1_0(long[] lArray, long[] lArray2, long l2) {
        long l3;
        long l4;
        long l7;
        long l8;
        int n3 = lArray.length;
        int n4 = lArray2.length;
        ZA1 zA1 = null;
        int n7 = 1;
        n3 = n3 == n4 ? 1 : 0;
        ct3.a(n3 != 0);
        n3 = lArray2.length;
        if (n3 > 0 && (l8 = (l7 = (l4 = lArray2[0]) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) > 0) {
            ZA1 zA12;
            this.a = zA12 = new ZA1(n3 += n7);
            this.b = zA1 = new ZA1(n3);
            zA12.a(l3);
            zA1.a(l3);
        } else {
            ZA1 zA13;
            this.a = zA13 = new ZA1(n3);
            this.b = zA13 = new ZA1(n3);
        }
        this.a.b(lArray);
        this.b.b(lArray2);
        this.c = l2;
    }

    public final void a(long l2, long l3) {
        long l4;
        long l7;
        ZA1 zA1 = this.b;
        int n3 = zA1.a;
        ZA1 zA12 = this.a;
        if (n3 == 0 && (n3 = (int)((l7 = l2 - (l4 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1))) > 0) {
            zA12.a(l4);
            zA1.a(l4);
        }
        zA12.a(l3);
        zA1.a(l2);
    }

    public final dX2$a d(long l2) {
        int n3;
        ZA1 zA1 = this.b;
        int n4 = zA1.a;
        if (n4 == 0) {
            fx2_0 fx2_02 = fx2_0.c;
            dX2$a dX2$a = new dX2$a(fx2_02, fx2_02);
            return dX2$a;
        }
        n4 = gz3.b(zA1, l2);
        long l3 = zA1.c(n4);
        ZA1 zA12 = this.a;
        long l4 = zA12.c(n4);
        fx2_0 fx2_03 = new fx2_0(l3, l4);
        Object object = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (object != false && n4 != (n3 = zA1.a + -1)) {
            l3 = zA1.c(++n4);
            long l7 = zA12.c(n4);
            fx2_0 fx2_04 = new fx2_0(l3, l7);
            dX2$a dX2$a = new dX2$a(fx2_03, fx2_04);
            return dX2$a;
        }
        dX2$a dX2$a = new dX2$a(fx2_03, fx2_03);
        return dX2$a;
    }

    public final boolean g() {
        ZA1 zA1 = this.b;
        int n3 = zA1.a;
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            zA1 = null;
        }
        return n3 != 0;
    }

    public final long getDurationUs() {
        return this.c;
    }
}

