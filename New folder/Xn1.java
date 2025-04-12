/*
 * Decompiled with CFR 0.152.
 */
import androidx.constraintlayout.widget.a;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public abstract class Xn1 {
    public Xn1$a a;
    public String b;
    public int c;
    public String d;
    public int e;
    public ArrayList f;

    public final float a(float f5) {
        Xn1$a xn1$a = this.a;
        Object object = xn1$a.g;
        int n3 = 2;
        int n4 = 1;
        if (object != null) {
            double d2 = f5;
            double[] dArray = xn1$a.h;
            ((zf0_1)object).c(d2, dArray);
        } else {
            object = xn1$a.h;
            double d5 = xn1$a.e[0];
            object[0] = d5;
            d5 = xn1$a.f[0];
            object[n4] = d5;
            float[] fArray = xn1$a.b;
            float f6 = fArray[0];
            d5 = f6;
            object[n3] = d5;
        }
        object = xn1$a.h;
        Object object2 = object[0];
        Object object3 = object[n4];
        object = xn1$a.a;
        double d7 = f5;
        object3 = ((qg2_1)object).c(d7, (double)object3);
        double d9 = xn1$a.h[n3];
        return (float)(object3 * d9 + object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final float b(float var1_1) {
        var2_2 = var1_1;
        var3_3 = this.a;
        var4_4 = var3_3.g;
        var5_5 = 1;
        var6_6 = 1.4E-45f;
        var7_7 = 2;
        var8_8 = 0.0;
        if (var4_4 != null) {
            var10_9 = var1_1;
            var12_10 = var3_3.i;
            var4_4.f(var10_9, var12_10);
            var4_4 = var3_3.g;
            var12_10 = var3_3.h;
            var4_4.c(var10_9, var12_10);
        } else {
            var4_4 = var3_3.i;
            var4_4[0] = var8_8;
            var4_4[var5_5] = var8_8;
            var4_4[var7_7] = var8_8;
        }
        var10_9 = var2_2;
        var13_11 = var3_3.h[var5_5];
        var15_12 = var3_3.a;
        var13_11 = var15_12.c(var10_9, var13_11);
        var16_13 = var3_3.h[var5_5];
        var4_4 = var3_3.i;
        var18_14 /* !! */  = var4_4[var5_5];
        var20_15 = var15_12.b(var10_9) + var16_13;
        var16_13 = 1.0;
        var22_16 /* !! */  = var10_9 == var8_8 ? 0 : (var10_9 < var8_8 ? -1 : 1);
        if (var22_16 /* !! */  <= 0) {
            var23_17 = var8_8;
        } else {
            var22_16 /* !! */  = (double)(var10_9 == var16_13 ? 0 : (var10_9 > var16_13 ? 1 : -1));
            if (var22_16 /* !! */  >= 0) {
                var23_17 = var16_13;
            } else {
                var4_4 = var15_12.b;
                var22_16 /* !! */  = Arrays.binarySearch((double[])var4_4, var10_9);
                if (var22_16 /* !! */  < 0) {
                    var22_16 /* !! */  = -var22_16 /* !! */  - var5_5;
                }
                var25_18 = var15_12.a;
                var26_19 = var25_18[var22_16 /* !! */ ];
                var27_20 = var22_16 /* !! */  + -1;
                var6_6 = var25_18[var27_20];
                var28_21 = var26_19 - var6_6;
                var8_8 = var28_21;
                var29_22 = var15_12.b;
                var30_23 = var29_22[var22_16 /* !! */ ];
                var32_24 = var29_22[var27_20];
                var23_17 = var6_6;
                var23_17 = var23_17 - (var8_8 *= var32_24) + (var10_9 *= (var8_8 /= (var30_23 -= var32_24)));
            }
        }
        var23_17 += var18_14 /* !! */ ;
        var7_7 = var15_12.e;
        var8_8 = 6.283185307179586;
        var10_9 = 2.0;
        var18_14 /* !! */  = 4.0;
        block0 : switch (var7_7) {
            default: {
                var23_17 *= var8_8;
                var8_8 = Math.cos(var8_8 * var20_15);
lbl61:
                // 2 sources

                while (true) {
                    var8_8 *= var23_17;
                    break block0;
                    break;
                }
            }
            case 7: {
                var15_12 = var15_12.d;
                var23_17 = var20_15 % var16_13;
                var8_8 = var15_12.e(var23_17);
                break;
            }
            case 6: {
                var20_15 = (var20_15 * var18_14 /* !! */  + var10_9) % var18_14 /* !! */  - var10_9;
                var8_8 = var20_15 * (var23_17 *= var18_14 /* !! */ );
                break;
            }
            case 5: {
                var10_9 = -6.283185307179586 * var23_17;
                var23_17 = Math.sin(var8_8 *= var20_15);
            }
lbl76:
            // 3 sources

            case 3: {
                var8_8 = var23_17 * var10_9;
                break;
            }
            case 4: {
                var23_17 = -var23_17;
                ** GOTO lbl76
            }
            case 2: {
                var23_17 *= var18_14 /* !! */ ;
                var20_15 *= var18_14 /* !! */ ;
                var20_15 = (var20_15 + 3.0) % var18_14 /* !! */  - var10_9;
                var8_8 = Math.signum(var20_15);
                ** continue;
            }
            case 1: {
                var8_8 = 0.0;
            }
        }
        var15_12 = var3_3.i;
        var23_17 = (double)var15_12[0];
        var7_7 = 2;
        var10_9 = (double)var15_12[var7_7];
        var13_11 = var13_11 * var10_9 + var23_17;
        var34_25 = var3_3.h[var7_7];
        return (float)(var8_8 * var34_25 + var13_11);
    }

    public void c(a a2) {
    }

    public final void d() {
        float f5;
        int n3;
        float f6;
        double d2;
        double d5;
        Object object;
        Object object2;
        double d7;
        int n4;
        double d9;
        Object object3;
        float f7;
        int n7;
        float f8;
        int n8;
        int n10;
        int n14;
        Object[] objectArray;
        int n15;
        Xn1 xn1 = this;
        Object object4 = this.f;
        int n16 = ((ArrayList)object4).size();
        if (n16 == 0) {
            return;
        }
        Object object5 = new Object();
        Collections.sort(object4, object5);
        object5 = new double[n16];
        int n17 = 2;
        Object object6 = new int[n17];
        int n18 = 1;
        float f11 = Float.MIN_VALUE;
        object6[n18] = n15 = 3;
        int n19 = 0;
        float f12 = 0.0f;
        Object object7 = null;
        object6[0] = n16;
        object6 = (double[][])Array.newInstance(Double.TYPE, object6);
        int n20 = this.c;
        Object object8 = this.d;
        Object object9 = new Object();
        Object object10 = new Object();
        Object[] objectArray2 = new float[]{};
        ((qg2_1)object10).a = objectArray2;
        objectArray2 = new double[0];
        ((qg2_1)object10).b = objectArray2;
        ((Xn1$a)object9).a = object10;
        ((qg2_1)object10).e = n20;
        if (object8 != null) {
            Object object11;
            n20 = ((String)object8).length() / n17;
            objectArray = new double[n20];
            n14 = ((String)object8).indexOf(40) + n18;
            n19 = 44;
            f12 = 6.2E-44f;
            n10 = ((String)object8).indexOf(n19, n14);
            n8 = 0;
            f8 = 0.0f;
            while (true) {
                n7 = -1;
                f7 = 0.0f / 0.0f;
                if (n10 == n7) break;
                object3 = ((String)object8).substring(n14, n10).trim();
                n14 = n8 + 1;
                objectArray[n8] = d9 = Double.parseDouble((String)object3);
                n7 = ((String)object8).indexOf(n19, ++n10);
                n8 = n14;
                n14 = n10;
                n10 = n7;
            }
            f12 = 5.7E-44f;
            n19 = ((String)object8).indexOf(41, n14);
            object7 = ((String)object8).substring(n14, n19).trim();
            n4 = n8 + 1;
            objectArray[n8] = d7 = Double.parseDouble((String)object7);
            object7 = Arrays.copyOf(objectArray, n4);
            n20 = ((Object)object7).length * 3 - n17;
            n4 = ((Object)object7).length - n18;
            d7 = n4;
            double d12 = 1.0;
            d7 = d12 / d7;
            int[] nArray = new int[n17];
            nArray[n18] = n18;
            nArray[0] = n20;
            object2 = (double[][])Array.newInstance(Double.TYPE, nArray);
            objectArray = new double[n20];
            nArray = null;
            for (n14 = 0; n14 < (n17 = ((Object)object7).length); ++n14) {
                double d13;
                Object object12 = object7[n14];
                n17 = n14 + n4;
                int n21 = object2[n17];
                n21[0] = object12;
                object11 = object2;
                objectArray[n17] = d13 = (double)n14 * d7;
                if (n14 > 0) {
                    double d14;
                    reference var44_38;
                    n17 = n4 * 2 + n14;
                    int n22 = object2[n17];
                    double d15 = 1.0;
                    n22[0] = var44_38 = object12 + d15;
                    objectArray[n17] = d14 = d13 + d15;
                    n17 = n14 + -1;
                    n22 = object2[n17];
                    n22[0] = object12 = object12 - d15 - d7;
                    object12 = -1.0;
                    objectArray[n17] = d13 = d13 + object12 - d7;
                }
                object2 = object11;
                n18 = 1;
                f11 = Float.MIN_VALUE;
            }
            object11 = object2;
            object = new XP1;
            object((double[])objectArray, (double[][])object2);
            ((qg2_1)object10).d = object;
        }
        object = new float[n16];
        ((Xn1$a)object9).b = object;
        object = new double[n16];
        ((Xn1$a)object9).c = object;
        object = new float[n16];
        ((Xn1$a)object9).d = object;
        object = new float[n16];
        ((Xn1$a)object9).e = object;
        object = new float[n16];
        ((Xn1$a)object9).f = object;
        Object object13 = new float[n16];
        xn1.a = object9;
        object4 = ((ArrayList)object4).iterator();
        n16 = 0;
        object13 = null;
        while ((n17 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
            object = (Xn1$b)object4.next();
            f11 = object.d;
            d5 = (double)f11 * 0.01;
            object5[n16] = d5;
            object2 = object6[n16];
            f12 = object.b;
            d2 = f12;
            n4 = 0;
            object8 = null;
            object2[0] = (int)d2;
            f6 = object.c;
            double d16 = f6;
            n3 = 1;
            object2[n3] = (int)d16;
            float f14 = object.e;
            double d17 = f14;
            n10 = 2;
            f5 = 2.8E-45f;
            object2[n10] = (int)d17;
            object2 = xn1.a;
            n17 = object.a;
            d17 = n17;
            d7 = 100.0;
            object2.c[n16] = d17 /= d7;
            object2.d[n16] = f11;
            object2.e[n16] = f6;
            object2.f[n16] = f14;
            object = object2.b;
            object[n16] = f12;
            ++n16;
        }
        object4 = xn1.a;
        object13 = ((Xn1$a)object4).c;
        n17 = ((float[])object13).length;
        n18 = 2;
        object2 = new int[n18];
        int n24 = 3;
        f6 = 4.2E-45f;
        object2[1] = n24;
        f12 = 0.0f;
        object2[0] = n17;
        object = (double[][])Array.newInstance(Double.TYPE, object2);
        object2 = ((Xn1$a)object4).b;
        object7 = new double[((int[])object2).length + n18];
        ((Xn1$a)object4).h = (double[])object7;
        n19 = ((int[])object2).length + n18;
        Object[] objectArray3 = new double[n19];
        ((Xn1$a)object4).i = objectArray3;
        n18 = 0;
        f11 = 0.0f;
        objectArray3 = null;
        float f15 = object13[0];
        objectArray = ((Xn1$a)object4).d;
        object8 = ((Xn1$a)object4).a;
        double d18 = 0.0;
        float f14 = f15 - d18;
        n7 = (int)(f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1));
        if (n7 > 0) {
            f12 = (float)objectArray[0];
            ((qg2_1)object8).a(d18, f12);
        }
        n18 = ((float[])object13).length;
        n19 = 1;
        f12 = Float.MIN_VALUE;
        f15 = object13[n18 -= n19];
        double d19 = 1.0;
        float f16 = f15 - d19;
        n8 = (int)(f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1));
        if (n8 < 0) {
            f11 = (float)objectArray[n18];
            ((qg2_1)object8).a(d19, f11);
        }
        f11 = 0.0f;
        objectArray3 = null;
        for (n18 = 0; n18 < (n19 = ((float[])object).length); ++n18) {
            object7 = object[n18];
            d19 = ((Xn1$a)object4).e[n18];
            object7[0] = d19;
            object9 = ((Xn1$a)object4).f;
            d19 = (double)object9[n18];
            object7[1] = d19;
            d19 = object2[n18];
            n24 = 2;
            f6 = 2.8E-45f;
            object7[n24] = d19;
            d19 = object13[n18];
            f12 = (float)objectArray[n18];
            ((qg2_1)object8).a(d19, f12);
        }
        d5 = d18;
        f11 = 0.0f;
        objectArray3 = null;
        for (n18 = 0; n18 < (n20 = ((Object)(object9 = (Object)((qg2_1)object8).a)).length); ++n18) {
            f6 = (float)object9[n18];
            d2 = f6;
            d5 += d2;
        }
        d2 = d18;
        n18 = 1;
        f11 = Float.MIN_VALUE;
        while (true) {
            object3 = ((qg2_1)object8).a;
            n14 = ((Object)object3).length;
            n8 = 0x40000000;
            f8 = 2.0f;
            if (n18 >= n14) break;
            n14 = n18 + -1;
            reference var70_55 = object3[n14];
            f7 = (float)object3[n18];
            var70_55 += f7;
            f7 = (float)(var70_55 / f8);
            object10 = ((qg2_1)object8).b;
            d9 = (double)object10[n18];
            Object object14 = object10[n14];
            d9 -= object14;
            d18 = f7;
            d2 = (d9 *= d18) + d2;
            ++n18;
            d18 = 0.0;
        }
        f11 = 0.0f;
        objectArray3 = null;
        for (n18 = 0; n18 < (n10 = ((Object)(object10 = (Object)((qg2_1)object8).a)).length); ++n18) {
            f5 = (float)object10[n18];
            d19 = d5 / d2;
            f7 = (float)d19;
            object10[n18] = f5 *= f7;
        }
        objectArray3 = ((qg2_1)object8).c;
        n15 = 0;
        object2 = null;
        f15 = (float)0.0;
        objectArray3[0] = f15;
        for (n3 = 1; n3 < (n15 = (objectArray3 = (Object[])((qg2_1)object8).a).length); ++n3) {
            n15 = n3 + -1;
            f12 = (float)objectArray3[n15];
            f11 = (float)objectArray3[n3];
            f12 = (f12 + f11) / f8;
            objectArray3 = ((qg2_1)object8).b;
            d2 = objectArray3[n3];
            d7 = objectArray3[n15];
            d2 -= d7;
            objectArray3 = ((qg2_1)object8).c;
            d7 = objectArray3[n15];
            d5 = f12;
            objectArray3[n3] = d2 = d2 * d5 + d7;
        }
        n18 = ((float[])object13).length;
        n15 = 1;
        if (n18 > n15) {
            n18 = 0;
            f11 = 0.0f;
            objectArray3 = null;
            object13 = zf0_1.a(0, object13, (double[][])object);
            ((Xn1$a)object4).g = object13;
        } else {
            n18 = 0;
            f11 = 0.0f;
            objectArray3 = null;
            n16 = 0;
            object13 = null;
            ((Xn1$a)object4).g = null;
        }
        zf0_1.a(0, (double[])object5, (double[][])object6);
    }

    public final boolean e() {
        int n3 = this.e;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public final String toString() {
        boolean bl2;
        CharSequence charSequence = this.b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator iterator = this.f.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (Xn1$b)iterator.next();
            charSequence = nn_2.a((String)charSequence, "[");
            int n3 = ((Xn1$b)object).a;
            ((StringBuilder)charSequence).append(n3);
            String string2 = " , ";
            ((StringBuilder)charSequence).append(string2);
            float f5 = ((Xn1$b)object).b;
            double d2 = f5;
            object = decimalFormat.format(d2);
            ((StringBuilder)charSequence).append((String)object);
            object = "] ";
            ((StringBuilder)charSequence).append((String)object);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }
}

