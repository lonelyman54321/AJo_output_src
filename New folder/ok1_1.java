/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from OK1
 */
public class ok1_1
extends nk1_0 {
    public static int a(double d2) {
        boolean bl2 = Double.isNaN(d2);
        if (!bl2) {
            int n3;
            double d5 = 2.147483647E9;
            double d7 = d2 - d5;
            Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (object > 0) {
                n3 = -1 >>> 1;
            } else {
                d5 = -2.147483648E9;
                double d9 = d2 - d5;
                object = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
                if (object < 0) {
                    n3 = -1 << -1;
                } else {
                    long l2 = Math.round(d2);
                    n3 = (int)l2;
                }
            }
            return n3;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot round NaN value.");
        throw illegalArgumentException;
    }

    public static int b(float f5) {
        boolean bl2 = Float.isNaN(f5);
        if (!bl2) {
            return Math.round(f5);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot round NaN value.");
        throw illegalArgumentException;
    }

    public static long c(double d2) {
        boolean bl2 = Double.isNaN(d2);
        if (!bl2) {
            return Math.round(d2);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot round NaN value.");
        throw illegalArgumentException;
    }
}

