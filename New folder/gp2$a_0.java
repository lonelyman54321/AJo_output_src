/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from gP2$a
 */
public final class gp2$a_0 {
    public static float a(float[] fArray) {
        float f5 = fArray[0];
        int n3 = 1;
        float f6 = fArray[n3];
        int n4 = 2;
        float f7 = fArray[n4];
        int n7 = 3;
        float f8 = fArray[n7];
        int n8 = 4;
        float f11 = fArray[n8];
        int n10 = 5;
        float f12 = fArray[n10];
        float f14 = f5 * f8;
        float f15 = f6 * f11 + f14;
        f14 = f7 * f12 + f15;
        f14 -= (f8 *= f11);
        f14 -= (f6 *= f7);
        f14 = (f14 - (f5 *= f12)) * 0.5f;
        f12 = 0.0f;
        fArray = null;
        float f16 = f14 - 0.0f;
        Object object = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
        if (object < 0) {
            f14 = -f14;
        }
        return f14;
    }

    public static float b(float f5, float f6, float f7, float f8) {
        return (f5 *= f8) - (f6 *= f7);
    }
}

