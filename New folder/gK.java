/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 */
import android.graphics.Color;

public final class gK {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public gK(float f5, float f6, float f7, float f8, float f11, float f12) {
        this.a = f5;
        this.b = f6;
        this.c = f7;
        this.d = f8;
        this.e = f11;
        this.f = f12;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static gK a(int n3) {
        qe3_0 qe3_02 = qe3_0.k;
        int n4 = Color.red((int)n3);
        float f5 = os_2.d(n4);
        float f6 = os_2.d(Color.green((int)n3));
        int n7 = Color.blue((int)n3);
        float f7 = os_2.d(n7);
        float[][] fArray = os_2.d;
        float[] fArray2 = fArray[0];
        float f8 = fArray2[0] * f5;
        int n8 = 1;
        float f11 = Float.MIN_VALUE;
        float f12 = fArray2[n8] * f6 + f8;
        int n10 = 2;
        float f14 = fArray2[n10] * f7 + f12;
        float[] fArray3 = fArray[n8];
        float f15 = fArray3[0] * f5;
        float f16 = fArray3[n8] * f6 + f15;
        f12 = fArray3[n10] * f7 + f16;
        float[] fArray4 = fArray[n10];
        f15 = fArray4[0];
        f5 *= f15;
        f15 = fArray4[n8];
        f6 = f6 * f15 + f5;
        f5 = fArray4[n10];
        f7 = f7 * f5 + f6;
        float[][] fArray5 = os_2.a;
        float[] fArray6 = fArray5[0];
        float f17 = fArray6[0] * f14;
        f15 = fArray6[n8] * f12 + f17;
        f6 = fArray6[n10] * f7 + f15;
        float[] fArray7 = fArray5[n8];
        f15 = fArray7[0] * f14;
        f16 = fArray7[n8] * f12 + f15;
        f17 = fArray7[n10] * f7 + f16;
        float[] fArray8 = fArray5[n10];
        f15 = fArray8[0];
        f14 *= f15;
        f15 = fArray8[n8];
        f12 = f12 * f15 + f14;
        f5 = fArray8[n10];
        f7 = f7 * f5 + f12;
        float[] fArray9 = qe3_02.g;
        float f18 = fArray9[0] * f6;
        f6 = fArray9[n8] * f17;
        f5 = fArray9[n10] * f7;
        f7 = Math.abs(f18);
        f17 = qe3_02.h;
        double d2 = f7 * f17;
        double d5 = 100.0;
        double d7 = 0.42;
        f7 = (float)Math.pow(d2 /= d5, d7);
        f14 = (float)Math.pow((double)(Math.abs(f6) * f17) / d5, d7);
        f17 = (float)Math.pow((double)(Math.abs(f5) * f17) / d5, d7);
        f18 = Math.signum(f18);
        f8 = 400.0f;
        f18 = f18 * f8 * f7;
        f15 = 27.13f;
        f6 = Math.signum(f6) * f8 * f14;
        f5 = Math.signum(f5) * f8 * f17;
        d2 = (double)(f18 /= (f7 += f15)) * 11.0;
        d7 = (double)(f6 /= (f14 += f15)) * -12.0 + d2;
        double d9 = f5 /= (f17 += f15);
        f14 = (float)(d7 + d9) / 11.0f;
        d7 = f18 + f6;
        double d12 = 2.0;
        f7 = (float)(d7 -= (d9 *= d12)) / 9.0f;
        f17 = 20.0f;
        f8 = f18 * f17;
        f15 = (21.0f * f5 + (f8 += (f6 *= f17))) / f17;
        f18 = (f18 * 40.0f + f6 + f5) / f17;
        double d13 = f7;
        double d14 = f14;
        d13 = Math.atan2(d13, d14);
        f5 = (float)d13;
        f6 = 180.0f;
        f5 *= f6;
        f17 = (float)Math.PI;
        f8 = 0.0f;
        f16 = 360.0f;
        float f19 = (f5 /= f17) - 0.0f;
        n10 = (int)(f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1));
        if (n10 < 0) {
            f5 += f16;
        } else {
            n10 = (int)(f5 == f16 ? 0 : (f5 > f16 ? 1 : -1));
            if (n10 >= 0) {
                f5 -= f16;
            }
        }
        float f20 = f5;
        f17 = f17 * f5 / f6;
        f5 = qe3_02.b;
        f18 *= f5;
        f5 = qe3_02.a;
        d5 = f18 / f5;
        f6 = qe3_02.d;
        d12 = qe3_02.j * f6;
        f18 = (float)Math.pow(d5, d12);
        f8 = 100.0f;
        Math.sqrt((f18 *= f8) / f8);
        n10 = 0x40800000;
        f8 = 4.0f;
        f5 += f8;
        double d15 = f20;
        d12 = 20.14;
        double d16 = d15 == d12 ? 0 : (d15 < d12 ? -1 : 1);
        f16 = d16 < 0 ? (f16 += f20) : f20;
        f8 = (float)(Math.cos((double)f16 * Math.PI / 180.0 + 2.0) + 3.8) * 0.25f * 3846.1538f;
        f11 = qe3_02.e;
        f8 *= f11;
        f11 = qe3_02.c;
        f8 *= f11;
        f14 *= f14;
        f7 = (float)Math.sqrt(f7 * f7 + f14);
        f8 *= f7;
        d5 = qe3_02.f;
        d5 = Math.pow(0.29, d5);
        f7 = (float)Math.pow(1.64 - d5, 0.73);
        f14 = (float)Math.pow(f8 /= (f15 += 0.305f), 0.9);
        f7 *= f14;
        f14 = (float)Math.sqrt((double)f18 / 100.0);
        float f22 = f7 * f14;
        float f23 = qe3_02.i * f22;
        Math.sqrt(f7 * f6 / f5);
        f5 = 1.7f * f18;
        f6 = 0.007f * f18;
        f7 = 1.0f;
        float f24 = f5 / (f6 += f7);
        f23 = (float)Math.log(f23 * 0.0228f + f7) * 43.85965f;
        d13 = f17;
        f7 = (float)Math.cos(d13);
        float f25 = f23 * f7;
        f5 = (float)Math.sin(d13);
        float f26 = f23 * f5;
        return new gK(f20, f22, f18, f24, f25, f26);
    }

    public static gK b(float f5, float f6, float f7) {
        Object object = qe3_0.k;
        float f8 = ((qe3_0)object).d;
        double d2 = (double)f5 / 100.0;
        Math.sqrt(d2);
        float f11 = ((qe3_0)object).a + 4.0f;
        float f12 = ((qe3_0)object).i * f6;
        f8 = (float)Math.sqrt(d2);
        f8 = f6 / f8;
        float f14 = ((qe3_0)object).d;
        Math.sqrt(f8 * f14 / f11);
        f14 = (float)Math.PI * f7 / 180.0f;
        f8 = 1.7f * f5;
        float f15 = 0.007f * f5 + 1.0f;
        float f16 = f8 / f15;
        f8 = (float)Math.log((double)f12 * 0.0228 + 1.0) * 43.85965f;
        double d5 = f14;
        f14 = (float)Math.cos(d5);
        float f17 = f8 * f14;
        f14 = (float)Math.sin(d5);
        float f18 = f8 * f14;
        object = new gK(f7, f6, f5, f16, f17, f18);
        return object;
    }

    public final int c(qe3_0 qe3_02) {
        Object object;
        double d2;
        gK gK2 = this;
        Object object2 = qe3_02;
        float f5 = this.b;
        double d5 = f5;
        double d7 = 100.0;
        Object object3 = this.c;
        double d9 = 0.0;
        double d12 = d5 - d9;
        Object object4 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
        if (object4 != false && (object4 = (d2 = (d5 = (double)object3) - d9) == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1)) != false) {
            d5 = Math.sqrt(d5 / d7);
            object = (float)d5;
            f5 /= object;
        } else {
            f5 = 0.0f;
        }
        double d13 = f5;
        double d14 = ((qe3_0)object2).f;
        d14 = Math.pow(0.29, d14);
        d14 = Math.pow(1.64 - d14, 0.73);
        f5 = (float)Math.pow(d13 / d14, 1.1111111111111112);
        d5 = gK2.a * (float)Math.PI / 180.0f;
        Object object5 = (float)(Math.cos(2.0 + d5) + 3.8) * 0.25f;
        double d15 = (double)object3 / d7;
        d7 = ((qe3_0)object2).d;
        double d16 = 1.0 / d7;
        d7 = ((qe3_0)object2).j;
        Object object6 = (float)Math.pow(d15, d16 /= d7);
        float f6 = ((qe3_0)object2).a * object6;
        object5 *= 3846.1538f;
        object6 = ((qe3_0)object2).e;
        object5 *= object6;
        object6 = ((qe3_0)object2).c;
        object5 *= object6;
        object6 = ((qe3_0)object2).b;
        f6 /= object6;
        object6 = (float)Math.sin(d5);
        object = (float)Math.cos(d5);
        float f7 = 0.305f + f6;
        object3 = 23.0f;
        f7 = f7 * object3 * f5;
        object5 *= object3;
        object3 = 11.0f * f5 * object + object5;
        f5 = f5 * 108.0f * object6 + object3;
        object *= (f7 /= f5);
        f7 *= object6;
        f5 = 451.0f * object + (f6 *= 460.0f);
        object6 = 288.0f * f7 + f5;
        f5 = 1403.0f;
        object6 /= f5;
        object3 = 891.0f * object;
        object3 = f6 - object3;
        object3 = qy_1.a(f7, 261.0f, object3, f5);
        f5 = qy_1.a(f7, 6300.0f, f6 -= (object *= 220.0f), f5);
        d5 = Math.abs(object6);
        d14 = 27.13;
        d5 *= d14;
        double d17 = Math.abs(object6);
        double d18 = 400.0;
        d17 = d18 - d17;
        object = (float)Math.max(d9, d5 /= d17);
        f7 = Math.signum(object6);
        f6 = ((qe3_0)object2).h;
        object6 = 100.0f / f6;
        f7 *= object6;
        d17 = object;
        d9 = 2.380952380952381;
        object = (float)Math.pow(d17, d9);
        f7 *= object;
        d17 = (double)Math.abs(object3) * d14;
        d14 = Math.abs(object3);
        d14 = d18 - d14;
        object = (float)Math.max(0.0, d17 /= d14);
        f6 = Math.signum(object3) * object6;
        object = (float)Math.pow(object, d9);
        f6 *= object;
        d14 = (double)Math.abs(f5) * 27.13;
        d17 = Math.abs(f5);
        object = (float)Math.max(0.0, d14 /= (d18 -= d17));
        f5 = Math.signum(f5) * object6;
        object = (float)Math.pow(object, d9);
        f5 *= object;
        object2 = ((qe3_0)object2).g;
        object6 = object2[0];
        f7 /= object6;
        int n3 = 1;
        object3 = object2[n3];
        f6 /= object3;
        int n4 = 2;
        Object object7 = object2[n4];
        object2 = os_2.b;
        Object object8 = object2[0];
        reference var34_25 = object8[0] * f7;
        object5 = object8[n3] * f6 + var34_25;
        reference var35_26 = object8[n4] * (f5 /= object7) + object5;
        Object object9 = object2[n3];
        object5 = object9[0] * f7;
        reference var37_28 = object9[n3] * f6 + object5;
        var34_25 = object9[n4] * f5 + var37_28;
        object2 = object2[n4];
        object = object2[0];
        f7 *= object;
        object = object2[n3];
        f6 = f6 * object + f7;
        object7 = object2[n4];
        f5 = f5 * object7 + f6;
        d14 = (double)var35_26;
        d17 = (double)var34_25;
        d18 = f5;
        return hZ.b(d14, d17, d18);
    }
}

