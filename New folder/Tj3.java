/*
 * Decompiled with CFR 0.152.
 */
public final class Tj3 {
    public static final long a(long l2, float f5) {
        float f6;
        float f7;
        int n3 = Float.isNaN(f5);
        if (n3 == 0 && (n3 = (f7 = f5 - (f6 = 1.0f)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) < 0) {
            f6 = OX.d(l2) * f5;
            l2 = OX.b(l2, f6);
        }
        return l2;
    }
}

