/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from wA3
 */
public final class wa3_2
implements px2_1 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public wa3_2(long[] lArray, long[] lArray2, long l2, long l3, int n3) {
        this.a = lArray;
        this.b = lArray2;
        this.c = l2;
        this.d = l3;
        this.e = n3;
    }

    public final dX2$a d(long l2) {
        int n3;
        long[] lArray = this.a;
        int n4 = 1;
        int n7 = gz3.d(lArray, l2, n4 != 0);
        long l3 = lArray[n7];
        long[] lArray2 = this.b;
        long l4 = lArray2[n7];
        fx2_0 fx2_02 = new fx2_0(l3, l4);
        Object object = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (object < 0 && n7 != (n3 = lArray.length - n4)) {
            l3 = lArray[n7 += n4];
            long l7 = lArray2[n7];
            fx2_0 fx2_03 = new fx2_0(l3, l7);
            dX2$a dX2$a = new dX2$a(fx2_02, fx2_03);
            return dX2$a;
        }
        dX2$a dX2$a = new dX2$a(fx2_02, fx2_02);
        return dX2$a;
    }

    public final long f() {
        return this.d;
    }

    public final boolean g() {
        return true;
    }

    public final long getDurationUs() {
        return this.c;
    }

    public final long h(long l2) {
        int n3 = gz3.d(this.b, l2, true);
        return this.a[n3];
    }

    public final int j() {
        return this.e;
    }
}

