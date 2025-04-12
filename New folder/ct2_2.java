/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cT2
 */
public final class ct2_2
implements qA3 {
    public static final ct2_2 a;

    static {
        ct2_2 ct2_22;
        a = ct2_22 = new Object();
    }

    public final Object a(gm1_0 object, float f5) {
        boolean bl2;
        float f6;
        boolean bl3;
        Gm1$b gm1$b;
        Gm1$b gm1$b2 = ((gm1_0)object).z();
        if (gm1$b2 == (gm1$b = Gm1$b.BEGIN_ARRAY)) {
            bl3 = true;
            f6 = Float.MIN_VALUE;
        } else {
            bl3 = false;
            f6 = 0.0f;
            gm1$b2 = null;
        }
        if (bl3) {
            ((gm1_0)object).a();
        }
        double d2 = ((gm1_0)object).p();
        float f7 = (float)d2;
        double d5 = ((gm1_0)object).p();
        float f8 = (float)d5;
        while (bl2 = ((gm1_0)object).k()) {
            ((gm1_0)object).H();
        }
        if (bl3) {
            ((gm1_0)object).c();
        }
        f6 = 100.0f;
        f7 = f7 / f6 * f5;
        f8 = f8 / f6 * f5;
        object = new bT2(f7, f8);
        return object;
    }
}

