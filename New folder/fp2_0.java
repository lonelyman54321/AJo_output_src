/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fP2
 */
public final class fp2_0
implements js0_0 {
    public final /* synthetic */ Lq3 a;

    public /* synthetic */ fp2_0(Lq3 lq3) {
        this.a = lq3;
    }

    public final double c(double d2) {
        Lq3 lq3 = this.a;
        double d5 = lq3.b;
        double d7 = lq3.e;
        double d9 = d2 - d7;
        Object object = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        if (object >= 0) {
            d5 *= d2;
            d2 = lq3.c;
            d5 += d2;
            d2 = lq3.a;
            d2 = Math.pow(d5, d2);
        } else {
            double d12 = lq3.d;
            d2 *= d12;
        }
        return d2;
    }
}

