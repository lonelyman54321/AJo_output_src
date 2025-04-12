/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dZ
 */
public final class dz_0
implements js0_0 {
    public final double c(double d2) {
        double d5;
        double d7 = 0.0;
        double d9 = d2 - d7;
        Object object = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
        d7 = object < 0 ? -d2 : d2;
        double d12 = d7 - (d5 = 0.04045);
        Object object2 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
        if (object2 >= 0) {
            d5 = 0.9478672985781991 * d7 + 0.05213270142180095;
            d7 = Math.pow(d5, 2.4);
        } else {
            d5 = 0.07739938080495357;
            d7 *= d5;
        }
        return Math.copySign(d7, d2);
    }
}

