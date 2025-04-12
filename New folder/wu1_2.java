/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 */
import android.graphics.Matrix;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wu1
 */
public final class wu1_2 {
    public static final wi a;

    static {
        wi wi2;
        a = wi2 = new wi(1008);
    }

    public static final void a(Object[] objectArray, int n3, int n4) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(objectArray, string2);
        while (n3 < n4) {
            Intrinsics.checkNotNullParameter(objectArray, string2);
            objectArray[n3] = null;
            ++n3;
        }
    }

    public static final void b(Matrix matrix, float[] fArray) {
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
        int n14 = 6;
        float f14 = fArray[n14];
        int n15 = 7;
        float f15 = fArray[n15];
        int n16 = 8;
        float f16 = fArray[n16];
        float f17 = fArray[12];
        float f18 = fArray[13];
        float f19 = fArray[15];
        fArray[0] = f5;
        fArray[n3] = f11;
        fArray[n4] = f17;
        fArray[n7] = f6;
        fArray[n8] = f12;
        fArray[n10] = f18;
        fArray[n14] = f8;
        fArray[n15] = f15;
        fArray[n16] = f19;
        matrix.setValues(fArray);
        fArray[0] = f5;
        fArray[n3] = f6;
        fArray[n4] = f7;
        fArray[n7] = f8;
        fArray[n8] = f11;
        fArray[n10] = f12;
        fArray[n14] = f14;
        fArray[n15] = f15;
        fArray[n16] = f16;
    }

    public static final void c(Matrix matrix, float[] fArray) {
        matrix.getValues(fArray);
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
        int n14 = 6;
        float f14 = fArray[n14];
        int n15 = 7;
        float f15 = fArray[n15];
        int n16 = 8;
        float f16 = fArray[n16];
        fArray[0] = f5;
        fArray[n3] = f8;
        fArray[n4] = 0.0f;
        fArray[n7] = f14;
        fArray[n8] = f6;
        fArray[n10] = f11;
        fArray[n14] = 0.0f;
        fArray[n15] = f15;
        fArray[n16] = 0.0f;
        fArray[9] = 0.0f;
        fArray[10] = 1.0f;
        fArray[11] = 0.0f;
        fArray[12] = f7;
        fArray[13] = f12;
        fArray[14] = 0.0f;
        fArray[15] = f16;
    }
}

