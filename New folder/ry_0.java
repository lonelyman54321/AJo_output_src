/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rY
 */
public final class ry_0 {
    public static py_1 a(py_1 object) {
        SF3 sF3 = ed1_0.b;
        Object object2 = i4.b;
        long l2 = ((py_1)object).b;
        long l3 = ay_0.a;
        boolean bl2 = ay_0.a(l2, l3);
        if (bl2) {
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Object object3 = object;
            object3 = (gp2_0)object;
            Object object4 = ((gp2_0)object3).d;
            boolean bl3 = ry_0.c((SF3)object4, sF3);
            if (!bl3) {
                object = sF3.a();
                object4 = ((SF3)object4).a();
                object = ry_0.b(((i4)object2).a, (float[])object4, (float[])object);
                object2 = ((gp2_0)object3).i;
                float[] fArray = ry_0.f((float[])object, (float[])object2);
                Lq3 lq3 = ((gp2_0)object3).g;
                int n3 = -1;
                object4 = ((py_1)object3).a;
                Object object5 = ((gp2_0)object3).h;
                js0_0 js0_02 = ((gp2_0)object3).k;
                js0_0 js0_03 = ((gp2_0)object3).n;
                float f5 = ((gp2_0)object3).e;
                float f6 = ((gp2_0)object3).f;
                object2 = object;
                object3 = object4;
                object4 = object5;
                object5 = js0_02;
                js0_02 = js0_03;
                float f7 = f5;
                f5 = f6;
                object = new gp2_0((String)object3, (float[])object4, sF3, fArray, (js0_0)object5, js0_03, f7, f6, lq3, n3);
            }
        }
        return object;
    }

    public static final float[] b(float[] fArray, float[] fArray2, float[] fArray3) {
        ry_0.h(fArray, fArray2);
        ry_0.h(fArray, fArray3);
        float f5 = fArray3[0];
        float f6 = fArray2[0];
        f5 /= f6;
        int n3 = 1;
        float f7 = fArray3[n3];
        float f8 = fArray2[n3];
        f7 /= f8;
        int n4 = 2;
        float f11 = fArray3[n4];
        float f12 = fArray2[n4];
        fArray2 = new float[3];
        fArray2[0] = f5;
        fArray2[n3] = f7;
        fArray2[n4] = f11 /= f12;
        fArray3 = ry_0.e(fArray);
        fArray = ry_0.g(fArray2, fArray);
        return ry_0.f(fArray3, fArray);
    }

    public static final boolean c(SF3 sF3, SF3 sF32) {
        boolean bl2;
        block5: {
            block4: {
                bl2 = true;
                if (sF3 == sF32) {
                    return bl2;
                }
                float f5 = sF3.a;
                float f6 = sF32.a;
                float f7 = (f5 = Math.abs(f5 - f6)) - (f6 = 0.001f);
                Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
                if (object >= 0) break block4;
                float f8 = sF3.b;
                float f11 = sF32.b;
                float f12 = (f8 = Math.abs(f8 - f11)) - f6;
                Object object2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                if (object2 < 0) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final i50 d(py_1 py_12, py_1 object, int n3) {
        if (py_12 == object) {
            n3 = 1;
            return new i50(py_12, py_12, n3);
        }
        long l2 = py_12.b;
        long l3 = ay_0.a;
        boolean bl2 = ay_0.a(l2, l3);
        if (!bl2) return new i50(py_12, (py_1)object, n3);
        l2 = ((py_1)object).b;
        boolean bl3 = ay_0.a(l2, l3);
        if (!bl3) return new i50(py_12, (py_1)object, n3);
        String string2 = "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb";
        Intrinsics.checkNotNull(py_12, string2);
        py_12 = (gp2_0)py_12;
        Intrinsics.checkNotNull(object, string2);
        object = (gp2_0)object;
        i50 i502 = new i50$a((gp2_0)py_12, (gp2_0)object, n3);
        return i502;
    }

    public static final float[] e(float[] fArray) {
        float[] fArray2 = fArray;
        float f5 = fArray[0];
        int n3 = 3;
        float f6 = fArray[n3];
        float f7 = fArray[6];
        int n4 = 1;
        float f8 = fArray[n4];
        int n7 = 4;
        float f11 = fArray[n7];
        float f12 = fArray[7];
        int n8 = 2;
        float f14 = fArray[n8];
        float f15 = fArray[5];
        int n10 = 8;
        float f16 = fArray[n10];
        float f17 = f11 * f16;
        float f18 = f12 * f15;
        f17 -= f18;
        f18 = f12 * f14;
        float f19 = f8 * f16;
        f18 -= f19;
        f19 = f8 * f15;
        float f20 = f11 * f14;
        f19 -= f20;
        f20 = f5 * f17;
        float f22 = f6 * f18 + f20;
        float f23 = f7 * f19 + f22;
        fArray2 = new float[fArray.length];
        fArray2[0] = f17 /= f23;
        fArray2[n4] = f18 /= f23;
        fArray2[n8] = f19 /= f23;
        float f24 = f7 * f15;
        fArray2[n3] = f24 = qy_1.a(f6, f16, f24, f23);
        fArray2[n7] = f24 = qy_1.a(f7, f14, f16 *= f5, f23);
        fArray2[5] = f24 = qy_1.a(f5, f15, f14 *= f6, f23);
        f24 = f6 * f12;
        fArray2[6] = f24 = qy_1.a(f7, f11, f24, f23);
        fArray2[7] = f24 = qy_1.a(f5, f12, f7 *= f8, f23);
        fArray2[n10] = f24 = qy_1.a(f6, f8, f5 *= f11, f23);
        return fArray2;
    }

    public static final float[] f(float[] fArray, float[] fArray2) {
        float f5 = fArray[0];
        float f6 = fArray2[0];
        float f7 = f5 * f6;
        int n3 = 3;
        float f8 = fArray[n3];
        int n4 = 1;
        float f11 = fArray2[n4];
        float f12 = f8 * f11 + f7;
        int n7 = 6;
        float f14 = fArray[n7];
        int n8 = 2;
        float f15 = fArray2[n8];
        float f16 = f14 * f15 + f12;
        f12 = fArray[n4];
        float f17 = f12 * f6;
        int n10 = 4;
        float f18 = fArray[n10];
        float f19 = f18 * f11 + f17;
        int n14 = 7;
        float f20 = fArray[n14];
        float f22 = f20 * f15 + f19;
        f19 = fArray[n8];
        int n15 = 5;
        float f23 = fArray[n15];
        f11 = f11 * f23 + (f6 *= f19);
        int n16 = 8;
        float f24 = fArray[n16];
        f15 = f15 * f24 + f11;
        f11 = fArray2[n3];
        float f25 = f5 * f11;
        float f26 = fArray2[n10];
        float f27 = f8 * f26 + f25;
        f25 = fArray2[n15];
        float f28 = f14 * f25 + f27;
        f27 = f12 * f11;
        float f29 = f18 * f26 + f27;
        f27 = f20 * f25 + f29;
        f26 = f26 * f23 + (f11 *= f19);
        f25 = f25 * f24 + f26;
        f11 = fArray2[n7];
        f26 = fArray2[n14];
        f8 = f8 * f26 + (f5 *= f11);
        f5 = fArray2[n16];
        f14 = f14 * f5 + f8;
        f18 = f18 * f26 + (f12 *= f11);
        f20 = f20 * f5 + f18;
        f23 = f23 * f26 + (f19 *= f11);
        f24 = f24 * f5 + f23;
        float[] fArray3 = new float[9];
        fArray3[0] = f16;
        fArray3[n4] = f22;
        fArray3[n8] = f15;
        fArray3[n3] = f28;
        fArray3[n10] = f27;
        fArray3[n15] = f25;
        fArray3[n7] = f14;
        fArray3[n14] = f20;
        fArray3[n16] = f24;
        return fArray3;
    }

    public static final float[] g(float[] fArray, float[] fArray2) {
        float f5 = fArray[0];
        float f6 = fArray2[0] * f5;
        int n3 = 1;
        float f7 = fArray[n3];
        float f8 = fArray2[n3] * f7;
        int n4 = 2;
        float f11 = fArray[n4];
        float f12 = fArray2[n4] * f11;
        int n7 = 3;
        float f14 = fArray2[n7] * f5;
        int n8 = 4;
        float f15 = fArray2[n8] * f7;
        int n10 = 5;
        float f16 = fArray2[n10] * f11;
        float f17 = fArray2[6];
        f5 *= f17;
        int n14 = 7;
        float f18 = fArray2[n14];
        f7 *= f18;
        int n15 = 8;
        float f19 = fArray2[n15];
        f11 *= f19;
        float[] fArray3 = new float[9];
        fArray3[0] = f6;
        fArray3[n3] = f8;
        fArray3[n4] = f12;
        fArray3[n7] = f14;
        fArray3[n8] = f15;
        fArray3[n10] = f16;
        fArray3[6] = f5;
        fArray3[n14] = f7;
        fArray3[n15] = f11;
        return fArray3;
    }

    public static final void h(float[] fArray, float[] fArray2) {
        float f5;
        float f6 = fArray2[0];
        int n3 = 1;
        float f7 = fArray2[n3];
        int n4 = 2;
        float f8 = fArray2[n4];
        float f11 = fArray[0] * f6;
        float f12 = fArray[3] * f7 + f11;
        fArray2[0] = f11 = fArray[6] * f8 + f12;
        float f14 = fArray[n3] * f6;
        f11 = fArray[4] * f7 + f14;
        fArray2[n3] = f14 = fArray[7] * f8 + f11;
        f14 = fArray[n4] * f6;
        f6 = fArray[5] * f7 + f14;
        fArray2[n4] = f5 = fArray[8] * f8 + f6;
    }
}

