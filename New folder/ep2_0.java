/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eP2
 */
public final class ep2_0
implements js0_0 {
    public final /* synthetic */ double a;

    public /* synthetic */ ep2_0(double d2) {
        this.a = d2;
    }

    public final double c(double d2) {
        double d5 = 0.0;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object < 0) {
            d2 = d5;
        }
        d5 = this.a;
        return Math.pow(d2, d5);
    }
}

