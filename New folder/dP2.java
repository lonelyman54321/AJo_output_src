/*
 * Decompiled with CFR 0.152.
 */
public final class dP2
implements js0_0 {
    public final /* synthetic */ double a;

    public /* synthetic */ dP2(double d2) {
        this.a = d2;
    }

    public final double c(double d2) {
        double d5 = 0.0;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object < 0) {
            d2 = d5;
        }
        double d9 = this.a;
        d5 = 1.0 / d9;
        return Math.pow(d2, d5);
    }
}

