/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class i50$a
extends i50 {
    public final gp2_0 e;
    public final gp2_0 f;
    public final float[] g;

    public i50$a(gp2_0 gp2_02, gp2_0 gp2_03, int n3) {
        i50$a i50$a = this;
        Object object = gp2_02;
        Object object2 = gp2_03;
        int n4 = 2;
        int n7 = 1;
        int n8 = 3;
        float f5 = 0.0f;
        super(gp2_03, gp2_02, gp2_03, null);
        this.e = gp2_02;
        this.f = gp2_03;
        Object object3 = gp2_03.d;
        Object object4 = gp2_02.d;
        boolean bl2 = ry_0.c((SF3)object4, (SF3)object3);
        object = gp2_02.i;
        float[] fArray = gp2_03.j;
        if (bl2) {
            object = ry_0.f(fArray, (float[])object);
        } else {
            object3 = ((SF3)object4).a();
            SF3 sF3 = gp2_03.d;
            float[] fArray2 = sF3.a();
            SF3 sF32 = ed1_0.b;
            boolean bl3 = ry_0.c((SF3)object4, sF32);
            float[] fArray3 = ed1_0.e;
            Object object5 = i4.b;
            String string2 = "copyOf(this, size)";
            object5 = ((i4)object5).a;
            if (!bl3) {
                object4 = Arrays.copyOf(fArray3, n8);
                Intrinsics.checkNotNullExpressionValue(object4, string2);
                object4 = ry_0.b((float[])object5, (float[])object3, (float[])object4);
                object = ry_0.f((float[])object4, (float[])object);
            }
            if (!(bl3 = ry_0.c(sF3, sF32))) {
                object4 = Arrays.copyOf(fArray3, n8);
                Intrinsics.checkNotNullExpressionValue(object4, string2);
                object4 = ry_0.b((float[])object5, fArray2, (float[])object4);
                object2 = ((gp2_0)object2).i;
                object2 = ry_0.f((float[])object4, (float[])object2);
                fArray = ry_0.e((float[])object2);
            }
            if (n3 == n8) {
                reference var22_22 = object3[0];
                float f6 = fArray2[0];
                var22_22 /= f6;
                f6 = (float)object3[n7];
                float f7 = fArray2[n7];
                f6 /= f7;
                f5 = (float)object3[n4];
                f7 = fArray2[n4];
                float[] fArray4 = new float[n8];
                fArray4[0] = (float)var22_22;
                fArray4[n7] = f6;
                fArray4[n4] = f5 /= f7;
                object = ry_0.g(fArray4, (float[])object);
            }
            object = ry_0.f(fArray, (float[])object);
        }
        i50$a.g = (float[])object;
    }

    public final long a(long l2) {
        float f5 = OX.h(l2);
        float f6 = OX.g(l2);
        float f7 = OX.e(l2);
        float f8 = OX.d(l2);
        Object object = this.e;
        qk0_0 qk0_02 = ((gp2_0)object).p;
        double d2 = f5;
        f5 = (float)qk0_02.c(d2);
        double d5 = f6;
        object = ((gp2_0)object).p;
        f6 = (float)((qk0_0)object).c(d5);
        double d7 = f7;
        float f11 = (float)((qk0_0)object).c(d7);
        float[] fArray = this.g;
        float f12 = fArray[0] * f5;
        float f14 = fArray[3] * f6 + f12;
        f12 = fArray[6] * f11 + f14;
        f14 = fArray[1] * f5;
        float f15 = fArray[4] * f6 + f14;
        f14 = fArray[7] * f11 + f15;
        f15 = fArray[2] * f5;
        f5 = fArray[5] * f6 + f15;
        f6 = fArray[8] * f11 + f5;
        object = this.f;
        zz_0 zz_02 = ((gp2_0)object).m;
        d7 = f12;
        f5 = (float)zz_02.c(d7);
        d7 = f14;
        zz_0 zz_03 = ((gp2_0)object).m;
        f7 = (float)zz_03.c(d7);
        double d9 = f6;
        f6 = (float)zz_03.c(d9);
        return zx_0.b(f5, f7, f6, f8, (py_1)object);
    }
}

