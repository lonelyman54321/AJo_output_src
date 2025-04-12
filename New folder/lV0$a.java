/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class lV0$a {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final float a(float f5, float[] fArray, float[] fArray2) {
        float f6 = Math.abs(f5);
        float f7 = Math.signum(f5);
        int n3 = Arrays.binarySearch(fArray, f6);
        if (n3 >= 0) {
            f5 = fArray2[n3];
            f7 *= f5;
            return f7;
        }
        n3 = -(n3 + 1);
        int n4 = n3 + -1;
        int n7 = fArray.length + -1;
        float f8 = 0.0f;
        if (n4 < n7) {
            float f11;
            int n8;
            float f12;
            float f14;
            int n10 = -1;
            f5 = 0.0f / 0.0f;
            if (n4 == n10) {
                n10 = 0;
                f14 = fArray[0];
                f5 = fArray2[0];
                f12 = f14;
                n8 = 0;
                f14 = 0.0f;
                fArray = null;
                n4 = 0;
                f11 = 0.0f;
            } else {
                f5 = fArray[n4];
                f14 = fArray[n3];
                f11 = fArray2[n4];
                f12 = fArray2[n3];
                float f15 = f14;
                f14 = f5;
                f5 = f12;
                f12 = f15;
            }
            n3 = (int)(f14 == f12 ? 0 : (f14 < f12 ? -1 : 1));
            if (n3 == 0) {
                boolean bl2 = false;
                f6 = 0.0f;
            } else {
                f6 -= f14;
                f6 /= (f12 -= f14);
            }
            n8 = 1065353216;
            f14 = Math.min(1.0f, f6);
            f14 = Math.max(0.0f, f14);
            f5 = (f5 - f11) * f14 + f11;
            f7 *= f5;
            return f7;
        }
        int n14 = fArray.length + -1;
        f6 = fArray[n14];
        int n15 = fArray.length + -1;
        float f16 = fArray2[n15];
        float f17 = f6 - 0.0f;
        Object object = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
        if (object != false) return (f16 /= f6) * f5;
        return f8;
    }
}

