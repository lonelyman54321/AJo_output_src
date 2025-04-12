/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wy
 */
public final class wy_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ int b;

    public wy_1(Bitmap bitmap, f80_0 f80_02) {
        this.a = bitmap;
        this.b = -65281;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Bitmap bitmap = this.a;
        object = new wy_1(bitmap, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (wy_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((wy_1)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        var2_2 = this;
        var3_3 = 1;
        var4_4 = 1.4E-45f;
        var5_5 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(var1_1);
        var5_5 = xy_1.a;
        var5_5 = this.a;
        var6_6 = var5_5.getWidth();
        var7_7 = var5_5.getHeight();
        var8_8 /* !! */  = Bitmap.Config.ARGB_8888;
        var9_9 /* !! */  = Bitmap.createBitmap((int)var6_6, (int)var7_7, (Bitmap.Config)var8_8 /* !! */ );
        var7_7 = this.b;
        var9_9 /* !! */ .eraseColor(var7_7);
        var10_10 = new Canvas(var9_9 /* !! */ );
        var8_8 /* !! */  = new Matrix();
        var11_11 /* !! */  = xy_1.a;
        var10_10.drawBitmap((Bitmap)var5_5, (Matrix)var8_8 /* !! */ , var11_11 /* !! */ );
        Intrinsics.checkNotNullExpressionValue(var9_9 /* !! */ , "result");
        var5_5 = new ArrayList();
        var10_10 = new ArrayList();
        var12_12 = var9_9 /* !! */ .isRecycled();
        if (var12_12 == 0) {
            var8_8 /* !! */  = om2.f;
            var10_10.add(var8_8 /* !! */ );
            var8_8 /* !! */  = li3_0.e;
            var5_5.add(var8_8 /* !! */ );
            var8_8 /* !! */  = li3_0.f;
            var5_5.add(var8_8 /* !! */ );
            var8_8 /* !! */  = li3_0.g;
            var5_5.add(var8_8 /* !! */ );
            var8_8 /* !! */  = li3_0.h;
            var5_5.add(var8_8 /* !! */ );
            var8_8 /* !! */  = li3_0.i;
            var5_5.add(var8_8 /* !! */ );
            var8_8 /* !! */  = li3_0.j;
            var5_5.add(var8_8 /* !! */ );
            var10_10.clear();
            var8_8 /* !! */  = new vy_1();
            var10_10.add(var8_8 /* !! */ );
            var12_12 = var9_9 /* !! */ .getWidth();
            var13_13 = var9_9 /* !! */ .getHeight() * var12_12;
            var12_12 = 12544;
            if (var13_13 > var12_12) {
                var14_14 = var12_12;
                var16_15 = var13_13;
                var14_14 /= var16_15;
                var16_15 = Math.sqrt(var14_14);
            } else {
                var16_15 = -1.0;
            }
            var14_14 = 0.0;
            var18_16 /* !! */  = 0;
            var19_17 = 0.0f;
            var20_18 = null;
            var21_19 = var16_15 == var14_14 ? 0 : (var16_15 < var14_14 ? -1 : 1);
            if (var21_19 <= 0) {
                var8_8 /* !! */  = var9_9 /* !! */ ;
            } else {
                var14_14 = Math.ceil((double)var9_9 /* !! */ .getWidth() * var16_15);
                var22_20 = (int)var14_14;
                var23_21 = var9_9 /* !! */ .getHeight();
                var24_22 = (double)var23_21 * var16_15;
                var16_15 = Math.ceil(var24_22);
                var12_12 = (int)var16_15;
                var8_8 /* !! */  = Bitmap.createScaledBitmap((Bitmap)var9_9 /* !! */ , (int)var22_20, (int)var12_12, (boolean)false);
            }
            var26_23 = var8_8 /* !! */ .getWidth();
            var27_24 /* !! */  = var8_8 /* !! */ .getHeight();
            var22_20 = var26_23 * var27_24 /* !! */ ;
            var28_25 /* !! */  = new int[var22_20];
            var29_26 = 0;
            var30_27 = null;
            var31_28 = 0;
            var32_29 = 0;
            var33_30 = 0.0f;
            var34_31 /* !! */  = var8_8 /* !! */ ;
            var35_32 = var28_25 /* !! */ ;
            var8_8 /* !! */ .getPixels(var28_25 /* !! */ , 0, var26_23, 0, 0, var26_23, var27_24 /* !! */ );
            var23_21 = (int)var10_10.isEmpty();
            if (var23_21 != 0) {
                var7_7 = 0;
                var10_10 = null;
            } else {
                var23_21 = var10_10.size();
                var36_33 /* !! */  = new om2$b[var23_21];
                var10_10 = var10_10.toArray(var36_33 /* !! */ );
            }
            var11_11 /* !! */  = new SX(var28_25 /* !! */ , (om2$b[])var10_10);
            if (var8_8 /* !! */  != var9_9 /* !! */ ) {
                var8_8 /* !! */ .recycle();
            }
            var9_9 /* !! */  = var11_11 /* !! */ .c;
            var10_10 = new om2((ArrayList)var9_9 /* !! */ , (ArrayList)var5_5);
            var6_6 = var5_5.size();
            var12_12 = 0;
            var8_8 /* !! */  = null;
            while (true) {
                var11_11 /* !! */  = var10_10.d;
                var28_25 /* !! */  = (int[])var10_10.e;
                if (var12_12 >= var6_6) break;
                var36_33 /* !! */  = (li3_0)var5_5.get(var12_12);
                var35_32 = var36_33 /* !! */ .c;
                var29_26 = ((int[])var35_32).length;
                var37_34 = null;
                var32_29 = 0;
                var33_30 = 0.0f;
                for (var31_28 = 0; var31_28 < var29_26; var31_28 += var3_3) {
                    var38_35 = var35_32[var31_28];
                    cfr_temp_0 = var38_35 - 0.0f;
                    var27_24 /* !! */  = (int)(cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1));
                    if (var27_24 /* !! */  <= 0) continue;
                    var33_30 += var38_35;
                }
                cfr_temp_1 = var33_30 - 0.0f;
                var29_26 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                if (var29_26 != 0) {
                    var29_26 = ((int[])var35_32).length;
                    for (var31_28 = 0; var31_28 < var29_26; var31_28 += var3_3) {
                        var38_35 = var35_32[var31_28];
                        cfr_temp_2 = var38_35 - 0.0f;
                        var27_24 /* !! */  = (int)(cfr_temp_2 == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1));
                        if (var27_24 /* !! */  <= 0) continue;
                        var35_32[var31_28] = var38_35 /= var33_30;
                    }
                }
                var35_32 = var10_10.c;
                var30_27 = var10_10.a;
                var31_28 = var30_27.size();
                var21_19 = (double)false;
                var34_31 /* !! */  = null;
                var33_30 = 0.0f;
                var26_23 = 0;
                var38_35 = (int)0.0f;
                for (var32_29 = 0; var32_29 < var31_28; var32_29 += var57_54) {
                    var39_36 /* !! */  = var30_27.get(var32_29);
                    var37_34 = (om2$c)var39_36 /* !! */ ;
                    var37_34 = (om2$c)var39_36 /* !! */ ;
                    var40_37 /* !! */  = (var39_36 /* !! */  = (E)var37_34.b())[var3_3];
                    cfr_temp_3 /* !! */  = var40_37 /* !! */  - (var42_39 = (var41_38 = var36_33 /* !! */ .a)[0]);
                    var43_40 = cfr_temp_3 /* !! */  == 0 ? 0 : (cfr_temp_3 /* !! */  > 0 ? 1 : -1);
                    if (var43_40 >= 0) {
                        var43_40 = 2;
                        var42_39 = 2.8E-45f;
                        var44_41 = var41_38[var43_40];
                        cfr_temp_4 /* !! */  = var40_37 /* !! */  - var44_41;
                        var45_42 = cfr_temp_4 /* !! */  == 0 ? 0 : (cfr_temp_4 /* !! */  < 0 ? -1 : 1);
                        if (var45_42 <= 0 && (var45_42 = (Object)((cfr_temp_5 = (var46_43 = (float)var39_36 /* !! */ [var43_40]) - (var40_37 /* !! */  = (var2_2 = (Object)var36_33 /* !! */ .b)[0])) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1))) >= 0 && (var27_24 /* !! */  = (int)((cfr_temp_6 = var46_43 - (var40_37 /* !! */  = var2_2[var43_40])) == 0.0f ? 0 : (cfr_temp_6 < 0.0f ? -1 : 1))) <= 0) {
                            var18_16 /* !! */  = var37_34.d;
                            if ((var18_16 /* !! */  = (int)var11_11 /* !! */ .get(var18_16 /* !! */ )) == 0) {
                                var20_18 = var37_34.b();
                                var47_44 = var5_5;
                                if (var28_25 /* !! */  != null) {
                                    var48_45 = var28_25 /* !! */ .e;
                                    var49_46 = var6_6;
                                } else {
                                    var49_46 = var6_6;
                                    var48_45 = 1;
                                    var50_47 = 1.4E-45f;
                                }
                                var9_9 /* !! */  = (Bitmap)var36_33 /* !! */ .c;
                                var27_24 /* !! */  = 0;
                                var46_43 = 0.0f;
                                var39_36 /* !! */  = null;
                                var51_48 = var9_9 /* !! */ [0];
                                var52_49 = 1.0f;
                                cfr_temp_7 = var51_48 - 0.0f;
                                var53_50 = cfr_temp_7 == 0 ? 0 : (cfr_temp_7 > 0 ? 1 : -1);
                                var54_51 = 1;
                                if (var53_50 > 0) {
                                    var55_52 = var20_18[var54_51];
                                    var4_4 = var41_38[var54_51];
                                    var55_52 -= var4_4;
                                    var4_4 = Math.abs(var55_52);
                                    var4_4 = (var52_49 - var4_4) * var51_48;
                                } else {
                                    var3_3 = 0;
                                    var4_4 = 0.0f;
                                    var41_38 = null;
                                }
                                var51_48 = var9_9 /* !! */ [var54_51];
                                cfr_temp_8 = var51_48 - 0.0f;
                                var53_50 = cfr_temp_8 == 0 ? 0 : (cfr_temp_8 > 0 ? 1 : -1);
                                if (var53_50 > 0) {
                                    var19_17 = var20_18[var43_40];
                                    var56_53 = (float)var2_2[var54_51];
                                    var19_17 -= var56_53;
                                    var56_53 = Math.abs(var19_17);
                                    var52_49 -= var56_53;
                                    var56_53 = var52_49 * var51_48;
                                } else {
                                    var57_54 = 0;
                                    var56_53 = 0.0f;
                                    var2_2 = null;
                                }
                                var58_55 = var9_9 /* !! */ [var43_40];
                                cfr_temp_9 = var58_55 - 0.0f;
                                var18_16 /* !! */  = (int)(cfr_temp_9 == 0 ? 0 : (cfr_temp_9 > 0 ? 1 : -1));
                                if (var18_16 /* !! */  > 0) {
                                    var18_16 /* !! */  = var37_34.e;
                                    var19_17 = var18_16 /* !! */ ;
                                    var50_47 = var48_45;
                                    var19_17 /= var50_47;
                                    var50_47 = var19_17 * var58_55;
                                } else {
                                    var48_45 = 0;
                                    var50_47 = 0.0f;
                                    var5_5 = null;
                                }
                                var4_4 = var4_4 + var56_53 + var50_47;
                                if (var34_31 /* !! */  == null || (var57_54 = (int)(var4_4 == var38_35 ? 0 : (var4_4 > var38_35 ? 1 : -1))) > 0) {
                                    var38_35 = (int)var4_4;
                                    var34_31 /* !! */  = var37_34;
                                }
lbl212:
                                // 4 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                        }
                    }
                    var47_44 = var5_5;
                    var49_46 = var6_6;
                    var27_24 /* !! */  = 0;
                    var46_43 = 0.0f;
                    var39_36 /* !! */  = null;
                    ** continue;
                    var57_54 = 1;
                    var56_53 = 1.4E-45f;
                    var2_2 = this;
                    var5_5 = var47_44;
                    var6_6 = var49_46;
                    var3_3 = 1;
                    var4_4 = 1.4E-45f;
                    var18_16 /* !! */  = 0;
                    var19_17 = 0.0f;
                    var20_18 = null;
                    var37_34 = null;
                }
                var47_44 = var5_5;
                var49_46 = var6_6;
                var57_54 = 1;
                var56_53 = 1.4E-45f;
                var27_24 /* !! */  = 0;
                var46_43 = 0.0f;
                var39_36 /* !! */  = null;
                if (var34_31 /* !! */  != null && (var3_3 = (int)var36_33 /* !! */ .d) != 0) {
                    var3_3 = var34_31 /* !! */ .d;
                    var11_11 /* !! */ .append(var3_3, (boolean)var57_54);
                }
                var35_32.put(var36_33 /* !! */ , var34_31 /* !! */ );
                var12_12 += var57_54;
                var2_2 = this;
                var5_5 = var47_44;
                var6_6 = var49_46;
                var3_3 = 1;
                var4_4 = 1.4E-45f;
                var18_16 /* !! */  = 0;
                var19_17 = 0.0f;
                var20_18 = null;
            }
            var11_11 /* !! */ .clear();
            var2_2 = "from(this)\n        .clearFilters()\n        .addFilter { rgb, _ -> (rgb != alphaSubstitute) }\n        .generate()";
            Intrinsics.checkNotNullExpressionValue(var10_10, (String)var2_2);
            if (var28_25 /* !! */  == null) {
                var21_19 = (double)false;
                var34_31 /* !! */  = null;
            } else {
                var57_54 = var28_25 /* !! */ .d;
                var59_56 = hZ.e(var57_54);
                var34_31 /* !! */  = Double.valueOf(var59_56);
            }
            return var34_31 /* !! */ ;
        }
        var2_2 = new IllegalArgumentException("Bitmap is not valid");
        throw var2_2;
    }
}

