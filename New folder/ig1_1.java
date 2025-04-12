/*
 * Decompiled with CFR 0.152.
 */
import java.math.RoundingMode;

/*
 * Renamed from Ig1
 */
public final class ig1_1
implements px2_1 {
    public final long a;
    public final int b;
    public final hg1_0 c;

    public ig1_1(long l2, long l3, long l4) {
        hg1_0 hg1_02;
        ig1_1 ig1_12 = this;
        long l7 = l4;
        int n3 = 1;
        Object object = new long[n3];
        object[0] = l3;
        long l8 = 0L;
        long[] lArray = new long[n3];
        lArray[0] = l8;
        this.c = hg1_02 = new hg1_0((long[])object, lArray, l2);
        this.a = l4;
        long l12 = -9223372036854775807L;
        int n4 = -2147483647;
        long l14 = l2 == l12 ? 0 : (l2 < l12 ? -1 : 1);
        if (l14 != false) {
            long l15;
            long l16;
            l7 = l3 - l4;
            l12 = 8;
            object = (Object)RoundingMode.HALF_UP;
            long l17 = (l7 = gz3.O(l7, l12, l2, (RoundingMode)((Object)object))) - l8;
            Object object2 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
            if (object2 > 0 && (l16 = (l15 = l7 - (l12 = Integer.MAX_VALUE)) == 0L ? 0 : (l15 < 0L ? -1 : 1)) <= 0) {
                n4 = (int)l7;
            }
            ig1_12.b = n4;
        } else {
            this.b = n4;
        }
    }

    public final dX2$a d(long l2) {
        return this.c.d(l2);
    }

    public final long f() {
        return this.a;
    }

    public final boolean g() {
        return this.c.g();
    }

    public final long getDurationUs() {
        return this.c.c;
    }

    public final long h(long l2) {
        Object object = this.c;
        ZA1 zA1 = ((hg1_0)object).b;
        int n3 = zA1.a;
        if (n3 == 0) {
            l2 = -9223372036854775807L;
        } else {
            object = ((hg1_0)object).a;
            int n4 = gz3.b((ZA1)object, l2);
            l2 = zA1.c(n4);
        }
        return l2;
    }

    public final int j() {
        return this.b;
    }
}

