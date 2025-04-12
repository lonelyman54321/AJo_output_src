/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class QK1 {
    public final float[] a;

    public /* synthetic */ QK1(float[] fArray) {
        this.a = fArray;
    }

    public static float[] a() {
        float f5 = 1.0f;
        float[] fArray = new float[]{f5, 0.0f, 0.0f, 0.0f, 0.0f, f5, 0.0f, 0.0f, 0.0f, 0.0f, f5, 0.0f, 0.0f, 0.0f, 0.0f, f5};
        return fArray;
    }

    public static final long b(float[] fArray, long l2) {
        float f5 = e72.d(l2);
        float f6 = e72.e(l2);
        float f7 = fArray[3] * f5;
        float f8 = fArray[7] * f6 + f7;
        f7 = fArray[15];
        f8 += f7;
        int n3 = 1;
        f7 = Float.MIN_VALUE;
        float f11 = (float)n3 / f8;
        boolean bl2 = Float.isInfinite(f11);
        if (bl2 || (bl2 = Float.isNaN(f11))) {
            f11 = 0.0f;
        }
        f8 = fArray[0] * f5;
        float f12 = fArray[4] * f6 + f8;
        f8 = fArray[12];
        f12 = (f12 + f8) * f11;
        f7 = fArray[n3] * f5;
        f5 = fArray[5] * f6 + f7;
        float f14 = fArray[13];
        f5 = (f5 + f14) * f11;
        return h72.a(f12, f5);
    }

    public static final void c(float[] fArray, MR1 mR1) {
        float f5 = mR1.a;
        float f6 = mR1.b;
        long l2 = h72.a(f5, f6);
        l2 = QK1.b(fArray, l2);
        float f7 = mR1.a;
        float f8 = mR1.d;
        long l3 = h72.a(f7, f8);
        l3 = QK1.b(fArray, l3);
        float f11 = mR1.c;
        float f12 = mR1.b;
        long l4 = h72.a(f11, f12);
        l4 = QK1.b(fArray, l4);
        float f14 = mR1.c;
        float f15 = mR1.d;
        long l7 = h72.a(f14, f15);
        l7 = QK1.b(fArray, l7);
        float f16 = e72.d(l2);
        float f17 = e72.d(l3);
        f16 = Math.min(f16, f17);
        f17 = e72.d(l4);
        float f18 = e72.d(l7);
        f17 = Math.min(f17, f18);
        mR1.a = f16 = Math.min(f16, f17);
        f16 = e72.e(l2);
        f17 = e72.e(l3);
        f16 = Math.min(f16, f17);
        f17 = e72.e(l4);
        f18 = e72.e(l7);
        f17 = Math.min(f17, f18);
        mR1.b = f16 = Math.min(f16, f17);
        f16 = e72.d(l2);
        f17 = e72.d(l3);
        f16 = Math.max(f16, f17);
        f17 = e72.d(l4);
        f18 = e72.d(l7);
        f17 = Math.max(f17, f18);
        mR1.c = f16 = Math.max(f16, f17);
        f16 = e72.e(l2);
        f5 = e72.e(l3);
        f16 = Math.max(f16, f5);
        f5 = e72.e(l4);
        f6 = e72.e(l7);
        f5 = Math.max(f5, f6);
        mR1.d = f16 = Math.max(f16, f5);
    }

    public static final void d(float[] fArray) {
        int n3;
        for (int i3 = 0; i3 < (n3 = 4); ++i3) {
            for (int i8 = 0; i8 < n3; ++i8) {
                float f5 = i3 == i8 ? 1.0f : 0.0f;
                int n4 = i8 * 4 + i3;
                fArray[n4] = f5;
            }
        }
    }

    public static final void e(float f5, float[] fArray) {
        float f6 = f5;
        double d2 = (double)f5 * Math.PI / 180.0;
        float f7 = (float)Math.cos(d2);
        f6 = (float)Math.sin(d2);
        float f8 = fArray[0];
        int n3 = 4;
        float f11 = fArray[n3];
        float f12 = f7 * f8;
        float f14 = f6 * f11 + f12;
        f12 = -f6;
        f11 = f11 * f7 + (f8 *= f12);
        int n4 = 1;
        float f15 = fArray[n4];
        int n7 = 5;
        float f16 = fArray[n7];
        float f17 = f7 * f15;
        float f18 = f6 * f16 + f17;
        f16 = f16 * f7 + (f15 *= f12);
        int n8 = 2;
        f17 = fArray[n8];
        int n10 = 6;
        float f19 = fArray[n10];
        float f20 = f7 * f17;
        float f22 = f6 * f19 + f20;
        f19 = f19 * f7 + (f17 *= f12);
        int n14 = 3;
        f20 = fArray[n14];
        int n15 = 7;
        float f23 = fArray[n15];
        float f24 = f7 * f20;
        f6 = f6 * f23 + f24;
        f7 = f7 * f23 + (f12 *= f20);
        fArray[0] = f14;
        fArray[n4] = f18;
        fArray[n8] = f22;
        fArray[n14] = f6;
        fArray[n3] = f11;
        fArray[n7] = f16;
        fArray[n10] = f19;
        fArray[n15] = f7;
    }

    public static final void f(float f5, float f6, float f7, float[] fArray) {
        float f8;
        float f11;
        fArray[0] = f11 = fArray[0] * f5;
        int n3 = 1;
        fArray[n3] = f11 = fArray[n3] * f5;
        n3 = 2;
        fArray[n3] = f11 = fArray[n3] * f5;
        n3 = 3;
        fArray[n3] = f11 = fArray[n3] * f5;
        int n4 = 4;
        fArray[n4] = f8 = fArray[n4] * f6;
        n4 = 5;
        fArray[n4] = f8 = fArray[n4] * f6;
        n4 = 6;
        fArray[n4] = f8 = fArray[n4] * f6;
        n4 = 7;
        fArray[n4] = f8 = fArray[n4] * f6;
        n4 = 8;
        fArray[n4] = f6 = fArray[n4] * f7;
        n4 = 9;
        fArray[n4] = f6 = fArray[n4] * f7;
        n4 = 10;
        fArray[n4] = f6 = fArray[n4] * f7;
        n4 = 11;
        fArray[n4] = f6 = fArray[n4] * f7;
    }

    public static final void g(float[] fArray, float[] fArray2) {
        float f5 = RK1.a(0, 0, fArray, fArray2);
        int n3 = 1;
        float f6 = RK1.a(0, n3, fArray, fArray2);
        int n4 = 2;
        float f7 = RK1.a(0, n4, fArray, fArray2);
        int n7 = 3;
        float f8 = RK1.a(0, n7, fArray, fArray2);
        float f11 = RK1.a(n3, 0, fArray, fArray2);
        float f12 = RK1.a(n3, n3, fArray, fArray2);
        float f14 = RK1.a(n3, n4, fArray, fArray2);
        float f15 = RK1.a(n3, n7, fArray, fArray2);
        float f16 = RK1.a(n4, 0, fArray, fArray2);
        float f17 = RK1.a(n4, n3, fArray, fArray2);
        float f18 = RK1.a(n4, n4, fArray, fArray2);
        float f19 = RK1.a(n4, n7, fArray, fArray2);
        float f20 = RK1.a(n7, 0, fArray, fArray2);
        float f22 = RK1.a(n7, n3, fArray, fArray2);
        float f23 = RK1.a(n7, n4, fArray, fArray2);
        float f24 = RK1.a(n7, n7, fArray, fArray2);
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

    public static final void h(float f5, float f6, float f7, float[] fArray) {
        float f8 = fArray[0] * f5;
        float f11 = fArray[4] * f6 + f8;
        f8 = fArray[8] * f7 + f11;
        int n3 = 12;
        float f12 = fArray[n3];
        f8 += f12;
        f12 = fArray[1] * f5;
        float f14 = fArray[5] * f6 + f12;
        f12 = fArray[9] * f7 + f14;
        int n4 = 13;
        float f15 = fArray[n4];
        f12 += f15;
        f15 = fArray[2] * f5;
        float f16 = fArray[6] * f6 + f15;
        f15 = fArray[10] * f7 + f16;
        int n7 = 14;
        float f17 = fArray[n7];
        f15 += f17;
        f17 = fArray[3] * f5;
        f5 = fArray[7] * f6 + f17;
        f6 = fArray[11] * f7 + f5;
        int n8 = 15;
        f7 = fArray[n8];
        fArray[n3] = f8;
        fArray[n4] = f12;
        fArray[n7] = f15;
        fArray[n8] = f6 += f7;
    }

    public static /* synthetic */ void i(float[] fArray, float f5, float f6) {
        QK1.h(f5, f6, 0.0f, fArray);
    }

    public final boolean equals(Object object) {
        float[] fArray;
        boolean bl2;
        boolean bl3 = object instanceof QK1;
        boolean bl4 = false;
        if (bl3 && (bl2 = Intrinsics.areEqual(fArray = this.a, object = (Object)((QK1)object).a))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("\n            |");
        float[] fArray = this.a;
        float f5 = fArray[0];
        stringBuilder.append(f5);
        char c2 = ' ';
        stringBuilder.append(c2);
        float f6 = fArray[1];
        stringBuilder.append(f6);
        stringBuilder.append(c2);
        f6 = fArray[2];
        stringBuilder.append(f6);
        stringBuilder.append(c2);
        f6 = fArray[3];
        stringBuilder.append(f6);
        String string2 = "|\n            |";
        stringBuilder.append(string2);
        float f7 = fArray[4];
        stringBuilder.append(f7);
        stringBuilder.append(c2);
        f7 = fArray[5];
        stringBuilder.append(f7);
        stringBuilder.append(c2);
        f7 = fArray[6];
        stringBuilder.append(f7);
        stringBuilder.append(c2);
        f7 = fArray[7];
        stringBuilder.append(f7);
        stringBuilder.append(string2);
        f7 = fArray[8];
        stringBuilder.append(f7);
        stringBuilder.append(c2);
        f7 = fArray[9];
        stringBuilder.append(f7);
        stringBuilder.append(c2);
        f7 = fArray[10];
        stringBuilder.append(f7);
        stringBuilder.append(c2);
        f7 = fArray[11];
        stringBuilder.append(f7);
        stringBuilder.append(string2);
        f6 = fArray[12];
        stringBuilder.append(f6);
        stringBuilder.append(c2);
        f6 = fArray[13];
        stringBuilder.append(f6);
        stringBuilder.append(c2);
        f6 = fArray[14];
        stringBuilder.append(f6);
        stringBuilder.append(c2);
        f5 = fArray[15];
        stringBuilder.append(f5);
        stringBuilder.append("|\n        ");
        return ee3_2.b(stringBuilder.toString());
    }
}

