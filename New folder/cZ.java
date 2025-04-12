/*
 * Decompiled with CFR 0.152.
 */
public final class cZ
implements js0_0 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public double c(double d2) {
        double d5;
        double d7 = 0.0;
        double d9 = d2 - d7;
        Object object = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
        d7 = object < 0 ? -d2 : d2;
        double d12 = d7 - (d5 = 0.0031308049535603718);
        Object object2 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
        if (object2 >= 0) {
            d7 = Math.pow(d7, 0.4166666666666667) - 0.05213270142180095;
            d5 = 0.9478672985781991;
            return Math.copySign(d7 /= d5, d2);
        } else {
            d5 = 0.07739938080495357;
            return Math.copySign(d7 /= d5, d2);
        }
    }
}

