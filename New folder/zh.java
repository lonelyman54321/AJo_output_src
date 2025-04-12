/*
 * Decompiled with CFR 0.152.
 */
import kotlin.ranges.f;

public final class zh {
    public static final float[] a;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n3 = 101;
        float[] fArray = new float[n3];
        a = fArray;
        float[] fArray2 = new float[n3];
        float f5 = 0.0f;
        float f6 = 0.0f;
        int n4 = 0;
        while (true) {
            double d2;
            float f7;
            float f8;
            float f11;
            float f12;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            int n7 = 100;
            float f20 = 1.4E-43f;
            float f22 = 1.0f;
            if (n4 >= n7) {
                fArray2[n7] = f22;
                fArray[n7] = f22;
                return;
            }
            float f23 = n4;
            f20 = n7;
            f23 /= f20;
            n7 = 1065353216;
            f20 = 1.0f;
            while (true) {
                f19 = f20 - f5;
                int n8 = 0x40000000;
                f18 = 2.0f;
                f19 = f19 / f18 + f5;
                f17 = 3.0f;
                f16 = f19 * f17;
                f15 = f22 - f19;
                f14 = 0.175f;
                f12 = f15 * f14;
                f11 = (f19 * 0.35000002f + f12) * (f16 *= f15);
                f12 = f19 * f19 * f19;
                f8 = (f11 += f12) - f23;
                f7 = Math.abs(f8);
                double d5 = f7;
                double d7 = d5 - (d2 = 1.0E-5);
                Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
                if (object < 0) break;
                n8 = (int)(f11 == f23 ? 0 : (f11 > f23 ? 1 : -1));
                if (n8 > 0) {
                    f20 = f19;
                    continue;
                }
                f5 = f19;
            }
            n7 = 0x3F000000;
            f20 = 0.5f;
            fArray[n4] = f15 = (f15 * f20 + f19) * f16 + f12;
            f19 = 1.0f;
            while (true) {
                f18 = f19 - f6;
                f17 = 2.0f;
                f18 = f18 / f17 + f6;
                f16 = 3.0f;
                f15 = f18 * f16;
                f12 = f22 - f18;
                f7 = (f12 * f20 + f18) * (f15 *= f12);
                f11 = f18 * f18 * f18;
                f8 = (f7 += f11) - f23;
                f20 = Math.abs(f8);
                double d9 = f20;
                double d12 = d9 - d2;
                n7 = (int)(d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1));
                if (n7 < 0) break;
                n7 = (int)(f7 == f23 ? 0 : (f7 > f23 ? 1 : -1));
                if (n7 > 0) {
                    f19 = f18;
                } else {
                    f6 = f18;
                }
                n7 = 0x3F000000;
                f20 = 0.5f;
            }
            n7 = 1051931444;
            f20 = 0.35000002f;
            fArray2[n4] = f18 = (f18 * f20 + (f12 *= f14)) * f15 + f11;
            ++n4;
        }
    }

    public static zh$a a(float f5) {
        float f6 = 0.0f;
        int n3 = 1065353216;
        float f7 = 1.0f;
        f5 = f.f(f5, 0.0f, f7);
        int n4 = 100;
        float f8 = 1.4E-43f;
        float f11 = n4;
        float f12 = f11 * f5;
        int n7 = (int)f12;
        if (n7 < n4) {
            f6 = (float)n7 / f11;
            n3 = n7 + 1;
            f8 = (float)n3 / f11;
            float[] fArray = a;
            f12 = fArray[n7];
            f7 = fArray[n3] - f12;
            f5 = xu0_1.a(f5, f6, f7 /= (f8 -= f6), f12);
            f6 = f7;
            f7 = f5;
        }
        zh$a zh$a = new zh$a(f7, f6);
        return zh$a;
    }
}

