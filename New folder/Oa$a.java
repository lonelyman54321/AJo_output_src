/*
 * Decompiled with CFR 0.152.
 */
public final class Oa$a {
    /*
     * Enabled aggressive block sorting
     */
    public static float a(float f5) {
        double d2;
        double d5;
        double d7;
        double d9;
        double d12;
        double d13;
        double d14;
        f5 = Math.abs(f5);
        int n3 = (int)f5;
        double d15 = f5;
        double d16 = n3;
        d15 -= d16;
        f5 = 1.4E-44f;
        double d17 = 10;
        d17 = 0.0;
        double d18 = d17 - (d15 = Math.rint(d15 * d17) / 10.0);
        double d19 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
        if (d19 <= 0 && (d19 = d15 == d17 ? 0 : (d15 < d17 ? -1 : 1)) <= 0 || (d19 = (d14 = (d17 = 0.1) - d15) == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1)) <= 0 && (d19 = (d13 = d15 - (d17 = 0.4)) == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1)) <= 0 || (d19 = (d12 = (d17 = 0.5) - d15) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1)) <= 0 && (d19 = d15 == d17 ? 0 : (d15 < d17 ? -1 : 1)) <= 0 || (d19 = (d9 = (d17 = 0.6) - d15) == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1)) <= 0 && (d19 = (d7 = d15 - (d5 = 0.9)) == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1)) <= 0 || (d19 = (d2 = (d17 = 1.0) - d15) == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1)) <= 0 && (d19 = d15 == d17 ? 0 : (d15 < d17 ? -1 : 1)) <= 0) {
            d16 = d17;
        }
        f5 = n3;
        float f6 = (float)d16;
        return f5 + f6;
    }
}

