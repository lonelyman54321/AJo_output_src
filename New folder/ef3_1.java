/*
 * Decompiled with CFR 0.152.
 */
import java.math.RoundingMode;

/*
 * Renamed from eF3
 */
public final class ef3_1
implements dx2_1 {
    public final cf3_0 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public ef3_1(cf3_0 cf3_02, int n3, long l2, long l3) {
        this.a = cf3_02;
        this.b = n3;
        this.c = l2;
        l3 -= l2;
        long l4 = cf3_02.c;
        this.d = l3 /= l4;
        this.e = l4 = this.a(l3);
    }

    public final long a(long l2) {
        long l3 = this.b;
        long l4 = l2 * l3;
        long l7 = this.a.b;
        RoundingMode roundingMode = RoundingMode.DOWN;
        return gz3.O(l4, 1000000L, l7, roundingMode);
    }

    public final dX2$a d(long l2) {
        long l3;
        Object object = this.a;
        int n3 = ((cf3_0)object).b;
        long l4 = (long)n3 * l2;
        int n4 = this.b;
        long l7 = (long)n4 * 1000000L;
        long l8 = l4 / l7;
        l4 = this.d;
        l7 = 1L;
        long l12 = l4 - l7;
        l8 = gz3.i(l8, 0L, l12);
        long l14 = (long)((cf3_0)object).c * l8;
        l12 = this.c;
        long l15 = this.a(l8);
        fx2_0 fx2_02 = new fx2_0(l15, l14 += l12);
        Object object2 = l15 == l2 ? 0 : (l15 < l2 ? -1 : 1);
        if (object2 < 0 && (object2 = (l3 = l8 - (l4 -= l7)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            long l16 = (long)((cf3_0)object).c * (l8 += l7) + l12;
            long l17 = this.a(l8);
            fx2_0 fx2_03 = new fx2_0(l17, l16);
            object = new dX2$a(fx2_02, fx2_03);
            return object;
        }
        object = new dX2$a(fx2_02, fx2_02);
        return object;
    }

    public final boolean g() {
        return true;
    }

    public final long getDurationUs() {
        return this.e;
    }
}

