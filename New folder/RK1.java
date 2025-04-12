/*
 * Decompiled with CFR 0.152.
 */
public final class RK1 {
    public static final float a(int n3, int n4, float[] fArray, float[] fArray2) {
        float f5 = fArray[n3 *= 4];
        float f6 = fArray2[n4];
        f5 *= f6;
        int n7 = n3 + 1;
        f6 = fArray[n7];
        int n8 = 4 + n4;
        float f7 = fArray2[n8];
        f6 = f6 * f7 + f5;
        n8 = n3 + 2;
        f7 = fArray[n8];
        int n10 = 8 + n4;
        f5 = fArray2[n10];
        f7 = f7 * f5 + f6;
        float f8 = fArray[n3 += 3];
        int n14 = 12 + n4;
        float f11 = fArray2[n14];
        return f8 * f11 + f7;
    }
}

