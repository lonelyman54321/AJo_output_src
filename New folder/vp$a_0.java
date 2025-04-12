/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vp$a
 */
public final class vp$a_0 {
    public static float[] s;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public float h;
    public float i;
    public final float[] j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final boolean q;
    public final boolean r;

    /*
     * Unable to fully structure code
     */
    public vp$a_0(float var1_1, float var2_2, float var3_3, int var4_4, float var5_5, float var6_6, float var7_7) {
        block18: {
            block20: {
                block19: {
                    var8_8 = this;
                    var9_9 = var1_1;
                    var10_10 = var2_2;
                    var11_11 = var3_3;
                    var12_12 = var4_4;
                    var13_13 = var5_5;
                    var14_14 = var6_6;
                    var15_15 = var7_7;
                    super();
                    this.a = var1_1;
                    this.b = var2_2;
                    this.c = var3_3;
                    this.d = var5_5;
                    this.e = var6_6;
                    this.f = var7_7;
                    var16_16 = var6_6 - var3_3;
                    var17_17 = var7_7 - var5_5;
                    var18_18 = 1;
                    var19_19 = 0.0f;
                    if (var4_4 == var18_18) break block19;
                    var20_20 = 4;
                    var21_21 = 5.6E-45f;
                    if (var4_4 == var20_20) break block20;
                    var20_20 = 5;
                    var21_21 = 7.0E-45f;
                    if (var4_4 != var20_20) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            var20_20 = 0;
                            var21_21 = 0.0f;
                            var22_22 = null;
                            break block18;
                            break;
                        }
                    }
                    cfr_temp_0 = var17_17 - 0.0f;
                    var20_20 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                    if (var20_20 >= 0) ** GOTO lbl-1000
                }
lbl36:
                // 2 sources

                while (true) {
                    var20_20 = 1;
                    var21_21 = 1.4E-45f;
                    break block18;
                    break;
                }
            }
            cfr_temp_1 = var17_17 - 0.0f;
            var20_20 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
            if (var20_20 > 0) ** break;
            ** while (true)
            ** while (true)
        }
        var8_8.q = var20_20;
        var23_23 = var18_18;
        var9_9 = var10_10 - var9_9;
        var8_8.k = var23_23 /= var9_9;
        var24_24 = 3;
        var10_10 = 4.2E-45f;
        if (var24_24 == var12_12) {
            var24_24 = 1;
            var10_10 = 1.4E-45f;
        } else {
            var24_24 = 0;
            var10_10 = 0.0f;
            var25_25 = null;
        }
        var12_12 = 101;
        var26_26 = 1.42E-43f;
        if (var24_24 == 0 && (var29_29 = (cfr_temp_2 = (var27_27 = Math.abs(var16_16)) - (var28_28 = 0.001f)) == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1)) >= 0 && (var29_29 = (cfr_temp_3 = (var27_27 = Math.abs(var17_17)) - var28_28) == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1)) >= 0) {
            var30_30 = new float[var12_12];
            var8_8.j = var30_30;
            if (var20_20 != 0) {
                var12_12 = -1;
                var26_26 = 0.0f / 0.0f;
            } else {
                var12_12 = 1;
                var26_26 = 1.4E-45f;
            }
            var8_8.l = var26_26 = (float)var12_12 * var16_16;
            if (var20_20 != 0) {
                var12_12 = 1;
                var26_26 = 1.4E-45f;
            } else {
                var12_12 = -1;
                var26_26 = 0.0f / 0.0f;
            }
            var26_26 = var12_12;
            var8_8.m = var17_17 *= var26_26;
            if (var20_20 != 0) {
                var11_11 = var14_14;
            }
            var8_8.n = var11_11;
            var11_11 = var20_20 != 0 ? var13_13 : var15_15;
            var8_8.o = var11_11;
            var11_11 = var13_13 - var15_15;
            var31_32 = vp$a$a.a();
            var12_12 = var31_32.length;
            var13_13 = 0.0f;
            var33_34 = null;
            var34_35 = 0;
            var14_14 = 0.0f;
            var15_15 = 0.0f;
            var35_36 = 0;
            var17_17 = 0.0f;
            for (var32_33 = 0; var32_33 < var12_12; ++var32_33) {
                var36_37 = var24_24;
                var1_1 = var10_10;
                var37_38 = (double)var32_33 * 90.0;
                var22_22 = vp$a$a.a();
                var20_20 = var22_22.length - var18_18;
                var39_39 = var20_20;
                var37_38 = (float)Math.toRadians(var37_38 / var39_39);
                var39_39 = Math.sin(var37_38);
                var21_21 = (float)var39_39;
                var37_38 = Math.cos(var37_38);
                var9_9 = (float)var37_38;
                var21_21 *= var16_16;
                var9_9 *= var11_11;
                if (var32_33 > 0) {
                    var41_40 = var21_21 - var15_15;
                    var43_41 = var9_9 - var17_17;
                    var43_41 = Math.hypot(var41_40, var43_41);
                    var10_10 = (float)var43_41;
                    var25_25 = vp$a$a.a();
                    var25_25[var32_33] = var14_14 += var10_10;
                }
                var24_24 = var36_37;
                var10_10 = var1_1;
                var17_17 = var9_9;
                var15_15 = var21_21;
                var19_19 = 0.0f;
            }
            var36_37 = var24_24;
            var1_1 = var10_10;
            var8_8.g = var14_14;
            var30_30 = vp$a$a.a();
            var45_42 = var30_30.length;
            var10_10 = 0.0f;
            var25_25 = null;
            for (var24_24 = 0; var24_24 < var45_42; ++var24_24) {
                var46_44 = vp$a$a.a();
                var46_44[var24_24] = var26_26 = var46_44[var24_24] / var14_14;
            }
            var30_30 = var8_8.j;
            var24_24 = var30_30.length;
            var11_11 = 0.0f;
            var46_44 = null;
            for (var47_45 = 0; var47_45 < var24_24; ++var47_45) {
                var26_26 = var47_45;
                var13_13 = var30_30.length - var18_18;
                var33_34 = vp$a$a.a();
                var34_35 = var33_34.length;
                Intrinsics.checkNotNullParameter(var33_34, "<this>");
                var16_16 = 0.0f;
                var32_33 = Arrays.binarySearch(var33_34, 0, var34_35, var26_26 /= var13_13);
                if (var32_33 >= 0) {
                    var26_26 = var32_33;
                    var33_34 = vp$a$a.a();
                    var32_33 = var33_34.length - var18_18;
                    var13_13 = var32_33;
                    var30_30[var47_45] = var26_26 /= var13_13;
                    var34_35 = -1;
                    var14_14 = 0.0f / 0.0f;
                    var15_15 = 0.0f;
                    continue;
                }
                var34_35 = -1;
                var14_14 = 0.0f / 0.0f;
                if (var32_33 == var34_35) {
                    var15_15 = 0.0f;
                    var30_30[var47_45] = 0.0f;
                    continue;
                }
                var15_15 = 0.0f;
                var32_33 = -var32_33;
                var35_36 = var32_33 + -2;
                var19_19 = var35_36;
                var48_46 = vp$a$a.a()[var35_36];
                var26_26 -= var48_46;
                var13_13 = vp$a$a.a()[var32_33 -= var18_18];
                var49_47 = vp$a$a.a();
                var17_17 = var49_47[var35_36];
                var26_26 = var26_26 / (var13_13 -= var17_17) + var19_19;
                var33_34 = vp$a$a.a();
                var32_33 = var33_34.length - var18_18;
                var13_13 = var32_33;
                var30_30[var47_45] = var26_26 /= var13_13;
            }
            var9_9 = var8_8.g;
            var10_10 = var8_8.k;
            var8_8.p = var9_9 *= var10_10;
            var18_18 = var36_37;
        } else {
            var50_48 = var17_17;
            var52_49 = var16_16;
            var50_48 = Math.hypot(var50_48, var52_49);
            var8_8.g = var10_10 = (float)var50_48;
            var8_8.p = var10_10 *= var23_23;
            var8_8.n = var16_16 /= var9_9;
            var8_8.o = var17_17 /= var9_9;
            var30_31 = new float[var12_12];
            var8_8.j = var30_31;
            var45_43 = 2143289344;
            var8_8.l = var9_9 = 0.0f / 0.0f;
            var8_8.m = var9_9;
        }
        var8_8.r = var18_18;
    }

    public final float a() {
        float f5 = this.l;
        float f6 = this.i;
        f5 *= f6;
        f6 = -this.m;
        float f7 = this.h;
        double d2 = f5;
        double d5 = f6 *= f7;
        double d7 = Math.hypot(d2, d5);
        f6 = (float)d7;
        f7 = this.p / f6;
        boolean bl2 = this.q;
        if (bl2) {
            f5 = -f5;
        }
        return f5 * f7;
    }

    public final float b() {
        float f5 = this.l;
        float f6 = this.i;
        f5 *= f6;
        f6 = -this.m;
        float f7 = this.h;
        double d2 = f5;
        double d5 = f6 *= f7;
        d2 = Math.hypot(d2, d5);
        f5 = (float)d2;
        f7 = this.p / f5;
        boolean bl2 = this.q;
        f5 = bl2 ? -f6 * f7 : f6 * f7;
        return f5;
    }

    public final void c(float f5) {
        float f6;
        float f7;
        boolean bl2 = this.q;
        if (bl2) {
            f7 = this.b - f5;
        } else {
            f7 = this.a;
            f7 = f5 - f7;
        }
        f5 = this.k;
        f7 *= f5;
        f5 = 0.0f;
        float[] fArray = null;
        float f8 = f7 - 0.0f;
        float f11 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (f11 > 0 && (f11 = (f6 = f7 - (f5 = 1.0f)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) < 0) {
            fArray = this.j;
            float f12 = fArray.length + -1;
            f11 = (int)(f7 *= f12);
            float f14 = f11;
            f7 -= f14;
            f14 = fArray[f11];
            f5 = xu0_1.a(fArray[++f11], f14, f7, f14);
        }
        double d2 = f5 * 1.5707964f;
        this.h = f5 = (float)Math.sin(d2);
        this.i = f5 = (float)Math.cos(d2);
    }
}

