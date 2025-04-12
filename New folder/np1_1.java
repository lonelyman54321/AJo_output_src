/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;

/*
 * Renamed from nP1
 */
public final class np1_1
implements px2_1 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public np1_1(long[] lArray, long[] lArray2, long l2) {
        this.a = lArray;
        this.b = lArray2;
        long l3 = -9223372036854775807L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            l4 = lArray2.length + -1;
            long l7 = lArray2[l4];
            l2 = gz3.I(l7);
        }
        this.c = l2;
    }

    public static Pair a(long l2, long[] lArray, long[] lArray2) {
        double d2;
        int n3 = 1;
        int n4 = gz3.d(lArray, l2, n3 != 0);
        long l3 = lArray[n4];
        long l4 = lArray2[n4];
        if ((n4 += n3) == (n3 = lArray.length)) {
            Long l7 = l3;
            Long l8 = l4;
            return Pair.create((Object)l7, (Object)l8);
        }
        long l12 = lArray[n4];
        long l14 = lArray2[n4];
        n3 = (int)(l12 == l3 ? 0 : (l12 < l3 ? -1 : 1));
        if (n3 == 0) {
            d2 = 0.0;
        } else {
            d2 = l2;
            double d5 = l3;
            d2 -= d5;
            double d7 = l12 -= l3;
            d2 /= d7;
        }
        double d9 = l14 - l4;
        l14 = (long)(d2 * d9) + l4;
        Long l15 = l2;
        Long l16 = l14;
        return Pair.create((Object)l15, (Object)l16);
    }

    public final dX2$a d(long l2) {
        long l3 = this.c;
        long l4 = l2;
        l2 = gz3.T(gz3.i(l2, 0L, l3));
        long[] lArray = this.b;
        long[] lArray2 = this.a;
        Pair pair = np1_1.a(l2, lArray, lArray2);
        l4 = gz3.I((Long)pair.first);
        l2 = (Long)pair.second;
        fx2_0 fx2_02 = new fx2_0(l4, l2);
        dX2$a dX2$a = new dX2$a(fx2_02, fx2_02);
        return dX2$a;
    }

    public final long f() {
        return -1;
    }

    public final boolean g() {
        return true;
    }

    public final long getDurationUs() {
        return this.c;
    }

    public final long h(long l2) {
        long[] lArray = this.a;
        long[] lArray2 = this.b;
        return gz3.I((Long)np1_1.a((long)l2, (long[])lArray, (long[])lArray2).second);
    }

    public final int j() {
        return -2147483647;
    }
}

