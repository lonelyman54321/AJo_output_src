/*
 * Decompiled with CFR 0.152.
 */
import java.math.BigInteger;

public final class ym0$a
implements dx2_1 {
    public final /* synthetic */ ym0_1 a;

    public ym0$a(ym0_1 ym0_12) {
        this.a = ym0_12;
    }

    public final dX2$a d(long l2) {
        ym0_1 ym0_12 = this.a;
        BigInteger bigInteger = BigInteger.valueOf((long)ym0_12.d.i * l2 / 1000000L);
        long l3 = ym0_12.c;
        long l4 = ym0_12.b;
        BigInteger bigInteger2 = BigInteger.valueOf(l3 - l4);
        bigInteger = bigInteger.multiply(bigInteger2);
        bigInteger2 = BigInteger.valueOf(ym0_12.f);
        long l7 = bigInteger.divide(bigInteger2).longValue() + l4 - 30000L;
        long l8 = l3 - 1L;
        long l12 = ym0_12.b;
        long l14 = gz3.i(l7, l12, l8);
        fx2_0 fx2_02 = new fx2_0(l2, l14);
        dX2$a dX2$a = new dX2$a(fx2_02, fx2_02);
        return dX2$a;
    }

    public final boolean g() {
        return true;
    }

    public final long getDurationUs() {
        ym0_1 ym0_12 = this.a;
        zd3_0 zd3_02 = ym0_12.d;
        long l2 = ym0_12.f * 1000000L;
        long l3 = zd3_02.i;
        return l2 / l3;
    }
}

