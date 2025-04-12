/*
 * Decompiled with CFR 0.152.
 */
public final class PK1 {
    public static float a(float f5, float f6, float f7) {
        float f8 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (f8 < 0) {
            return f6;
        }
        float f11 = f5 == f7 ? 0 : (f5 > f7 ? 1 : -1);
        if (f11 > 0) {
            return f7;
        }
        return f5;
    }

    public static int b(int n3, int n4, int n7) {
        if (n3 < n4) {
            return n4;
        }
        if (n3 > n7) {
            return n7;
        }
        return n3;
    }
}

