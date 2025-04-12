/*
 * Decompiled with CFR 0.152.
 */
public final class Mt1 {
    public static final boolean a(aG2 aG22, float f5, float f6) {
        float f7;
        float f8;
        int n3;
        float f11;
        float f12;
        float f14 = aG22.a;
        float f15 = aG22.c;
        float f16 = f5 - f15;
        float f17 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
        if (f17 <= 0 && (f12 = f14 == f5 ? 0 : (f14 < f5 ? -1 : 1)) <= 0 && (f12 = (f11 = f6 - (f5 = aG22.d)) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) <= 0 && (n3 = (f8 = (f7 = aG22.b) - f6) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) <= 0) {
            n3 = 1;
            f7 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f7 = 0.0f;
            aG22 = null;
        }
        return n3 != 0;
    }
}

