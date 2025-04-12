/*
 * Decompiled with CFR 0.152.
 */
public final class jZ0 {
    public static final String a(float f5) {
        String string2;
        int n3 = Float.isNaN(f5);
        if (n3 != 0) {
            return "NaN";
        }
        n3 = Float.isInfinite(f5);
        if (n3 != 0) {
            n3 = 0;
            float f6 = f5 - 0.0f;
            Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
            String string3 = object < 0 ? "-Infinity" : "Infinity";
            return string3;
        }
        n3 = Math.max(1, 0);
        double d2 = 10.0f;
        double d5 = n3;
        d2 = Math.pow(d2, d5);
        float f7 = (float)d2;
        int n4 = (int)(f5 *= f7);
        float f8 = n4;
        float f11 = (f5 -= f8) - (f8 = 0.5f);
        Object object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object >= 0) {
            ++n4;
        }
        f5 = (float)n4 / f7;
        if (n3 > 0) {
            string2 = String.valueOf(f5);
        } else {
            object = (int)f5;
            string2 = String.valueOf((int)object);
        }
        return string2;
    }
}

