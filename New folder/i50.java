/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public class i50 {
    public final py_1 a;
    public final py_1 b;
    public final py_1 c;
    public final float[] d;

    public i50(py_1 object, py_1 py_12, int n3) {
        int n4 = 2;
        int n7 = 1;
        int n8 = 3;
        long l2 = ((py_1)object).b;
        long l3 = ay_0.a;
        boolean bl2 = ay_0.a(l2, l3);
        Object object2 = bl2 ? ry_0.a((py_1)object) : object;
        long l4 = py_12.b;
        boolean bl3 = ay_0.a(l4, l3);
        py_1 py_13 = bl3 ? ry_0.a(py_12) : py_12;
        float f5 = 0.0f;
        float[] fArray = null;
        if (n3 == n8) {
            n3 = (int)(ay_0.a(((py_1)object).b, l3) ? 1 : 0);
            long l7 = py_12.b;
            boolean bl4 = ay_0.a(l7, l3);
            if (!(n3 != 0 && bl4 || n3 == 0 && !bl4)) {
                if (n3 == 0) {
                    object = py_12;
                }
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                object = (gp2_0)object;
                float[] fArray2 = ed1_0.e;
                object = ((gp2_0)object).d;
                float[] fArray3 = n3 != 0 ? ((SF3)object).a() : fArray2;
                if (bl4) {
                    fArray2 = ((SF3)object).a();
                }
                float f6 = fArray3[0];
                float f7 = fArray2[0];
                f6 /= f7;
                f7 = fArray3[n7];
                f5 = fArray2[n7];
                float f8 = fArray3[n4];
                float f11 = fArray2[n4];
                fArray = new float[n8];
                fArray[0] = f6;
                fArray[n7] = f7 /= f5;
                fArray[n4] = f8 /= f11;
            }
        }
        this(py_12, (py_1)object2, py_13, fArray);
    }

    public i50(py_1 py_12, py_1 py_13, py_1 py_14, float[] fArray) {
        this.a = py_12;
        this.b = py_13;
        this.c = py_14;
        this.d = fArray;
    }

    public long a(long l2) {
        float f5 = OX.h(l2);
        float f6 = OX.g(l2);
        float f7 = OX.e(l2);
        float f8 = OX.d(l2);
        py_1 py_12 = this.b;
        long l3 = py_12.e(f5, f6, f7);
        int n3 = (int)(l3 >> 32);
        float f11 = Float.intBitsToFloat(n3);
        long l4 = 0xFFFFFFFFL;
        int n4 = (int)(l3 &= l4);
        float f12 = Float.intBitsToFloat(n4);
        float f14 = py_12.g(f5, f6, f7);
        float[] fArray = this.d;
        if (fArray != null) {
            f6 = fArray[0];
            f11 *= f6;
            f6 = fArray[1];
            f12 *= f6;
            int n7 = 2;
            f6 = 2.8E-45f;
            f5 = fArray[n7];
            f14 *= f5;
        }
        py_1 py_13 = this.c;
        py_1 py_14 = this.a;
        return py_13.h(f11, f12, f14, f8, py_14);
    }
}

