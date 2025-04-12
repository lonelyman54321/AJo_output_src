/*
 * Decompiled with CFR 0.152.
 */
public final class Fg {
    public static final Fg$a a = Fg$a.c;

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

    public static final void b(float[] fArray, float[] fArray2) {
        float f5 = Fg.a(0, 0, fArray2, fArray);
        int n3 = 1;
        float f6 = Fg.a(0, n3, fArray2, fArray);
        int n4 = 2;
        float f7 = Fg.a(0, n4, fArray2, fArray);
        int n7 = 3;
        float f8 = Fg.a(0, n7, fArray2, fArray);
        float f11 = Fg.a(n3, 0, fArray2, fArray);
        float f12 = Fg.a(n3, n3, fArray2, fArray);
        float f14 = Fg.a(n3, n4, fArray2, fArray);
        float f15 = Fg.a(n3, n7, fArray2, fArray);
        float f16 = Fg.a(n4, 0, fArray2, fArray);
        float f17 = Fg.a(n4, n3, fArray2, fArray);
        float f18 = Fg.a(n4, n4, fArray2, fArray);
        float f19 = Fg.a(n4, n7, fArray2, fArray);
        float f20 = Fg.a(n7, 0, fArray2, fArray);
        float f22 = Fg.a(n7, n3, fArray2, fArray);
        float f23 = Fg.a(n7, n4, fArray2, fArray);
        float f24 = Fg.a(n7, n7, fArray2, fArray);
        fArray[0] = f5;
        fArray[n3] = f6;
        fArray[n4] = f7;
        fArray[n7] = f8;
        fArray[4] = f11;
        fArray[5] = f12;
        fArray[6] = f14;
        fArray[7] = f15;
        fArray[8] = f16;
        fArray[9] = f17;
        fArray[10] = f18;
        fArray[11] = f19;
        fArray[12] = f20;
        fArray[13] = f22;
        fArray[14] = f23;
        fArray[15] = f24;
    }
}

