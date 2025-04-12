/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.Canvas
 *  android.graphics.ColorSpace
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.RectF
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 */
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.io.InputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zx
 */
public final class zx_1
implements Function0 {
    public final /* synthetic */ ay_2 a;

    public /* synthetic */ zx_1(ay_2 ay_22) {
        this.a = ay_22;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke() {
        block47: {
            block49: {
                block52: {
                    block53: {
                        block54: {
                            block46: {
                                block50: {
                                    block51: {
                                        block48: {
                                            var1_1 /* !! */  = new BitmapFactory.Options();
                                            var3_5 = this;
                                            var4_6 = this.a;
                                            var5_7 = var4_6.a;
                                            var6_8 = var5_7.d();
                                            var2_4 = new pv0_2(var6_8);
                                            var6_8 = o72_0.b((a93_0)var2_4);
                                            var7_9 = true;
                                            var8_10 = 1.4E-45f;
                                            var1_1 /* !! */ .inJustDecodeBounds = var7_9;
                                            var9_11 = var6_8.b();
                                            var10_12 = new IE2$a((ie2_2)var9_11);
                                            var11_13 = 0;
                                            var12_14 = 0.0f;
                                            var9_11 = null;
                                            BitmapFactory.decodeStream((InputStream)var10_12, null, (BitmapFactory.Options)var1_1 /* !! */ );
                                            var10_12 = var2_4.b;
                                            if (var10_12 != null) break block47;
                                            var13_15 = false;
                                            var10_12 = null;
                                            var1_1 /* !! */ .inJustDecodeBounds = false;
                                            var14_16 = AE0.a;
                                            var14_16 = var1_1 /* !! */ .outMimeType;
                                            var15_17 = BE0.a;
                                            var15_17 = BE0$a.$EnumSwitchMapping$0;
                                            var16_18 = var4_6.d;
                                            var17_19 = var16_18.ordinal();
                                            var18_20 /* !! */  = var15_17[var17_19];
                                            var17_19 = 270;
                                            var19_21 = 90;
                                            var20_22 = 2;
                                            if (var18_20 /* !! */  == var7_9) break block48;
                                            if (var18_20 /* !! */  == var20_22) ** GOTO lbl-1000
                                            var21_23 = 3;
                                            var22_24 = 4.2E-45f;
                                            if (var18_20 /* !! */  != var21_23) {
                                                var1_1 /* !! */  = new NoWhenBranchMatchedException();
                                                throw var1_1 /* !! */ ;
                                            }
                                            ** GOTO lbl-1000
                                        }
                                        if (var14_16 != null && (var21_23 = (int)(var15_17 = BE0.a).contains(var14_16)) != 0) lbl-1000:
                                        // 2 sources

                                        {
                                            var23_25 = var6_8.b();
                                            var24_26 = new IE2$a((ie2_2)var23_25);
                                            var15_17 = new we0_0(var24_26);
                                            var14_16 = new ue0_0((InputStream)var15_17);
                                            var25_27 = var14_16.c();
                                            if (var25_27 != var20_22 && var25_27 != (var26_28 = 7) && var25_27 != (var26_28 = 4) && var25_27 != (var26_28 = 5)) {
                                                var25_27 = 0;
                                                var23_25 = null;
                                            } else {
                                                var25_27 = 1;
                                            }
                                            var21_23 = var14_16.c();
                                            switch (var21_23) {
                                                default: {
                                                    var21_23 = 0;
                                                    var22_24 = 0.0f;
                                                    var14_16 = null;
                                                    break;
                                                }
                                                case 6: 
                                                case 7: {
                                                    var21_23 = 90;
                                                    var22_24 = 1.26E-43f;
                                                    break;
                                                }
                                                case 5: 
                                                case 8: {
                                                    var21_23 = 270;
                                                    var22_24 = 3.78E-43f;
                                                    break;
                                                }
                                                case 3: 
                                                case 4: {
                                                    var21_23 = 180;
                                                    var22_24 = 2.52E-43f;
                                                }
                                            }
                                            var15_17 = new te0_0((boolean)var25_27, var21_23);
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var15_17 = te0_0.c;
                                        }
                                        var14_16 = var2_4.b;
                                        if (var14_16 != null) break block49;
                                        var1_1 /* !! */ .inMutable = false;
                                        var21_23 = Build.VERSION.SDK_INT;
                                        var25_27 = 26;
                                        var4_6 = var4_6.b;
                                        if (var21_23 >= var25_27 && (var24_26 = var4_6.c) != null) {
                                            Xx.a(var1_1 /* !! */ , (ColorSpace)var24_26);
                                        }
                                        var1_1 /* !! */ .inPremultiplied = var26_28 = var4_6.h;
                                        var26_28 = var15_17.b;
                                        var9_11 = var4_6.b;
                                        var18_20 /* !! */  = var15_17.a;
                                        if (!(var18_20 /* !! */  == false && var26_28 <= 0 || var9_11 != null && !(var27_29 = b.b((Bitmap.Config)var9_11)))) {
                                            var9_11 = Bitmap.Config.ARGB_8888;
                                        }
                                        if ((var13_15 = var4_6.g) && var9_11 == (var10_12 = Bitmap.Config.ARGB_8888) && (var13_15 = Intrinsics.areEqual(var10_12 = var1_1 /* !! */ .outMimeType, var28_30 = "image/jpeg"))) {
                                            var9_11 = Bitmap.Config.RGB_565;
                                        }
                                        if (var21_23 >= var25_27 && (var10_12 = Yx.a(var1_1 /* !! */ )) == (var14_16 = Jh.a()) && var9_11 != (var10_12 = Kh.a())) {
                                            var9_11 = Jh.a();
                                        }
                                        var1_1 /* !! */ .inPreferredConfig = var9_11;
                                        var5_7 = var5_7.c();
                                        var11_13 = var5_7 instanceof PK2;
                                        var10_12 = var4_6.a;
                                        var14_16 = var4_6.d;
                                        if (var11_13 != 0 && (var11_13 = Intrinsics.areEqual(var14_16, var9_11 = B63.c)) != 0) {
                                            var1_1 /* !! */ .inSampleSize = var7_9;
                                            var1_1 /* !! */ .inScaled = var7_9;
                                            var5_7 = (PK2)var5_7;
                                            var1_1 /* !! */ .inDensity = var29_31 = var5_7.c;
                                            var4_6 = var10_12.getResources().getDisplayMetrics();
                                            var1_1 /* !! */ .inTargetDensity = var29_31 = var4_6.densityDpi;
                                            var30_32 = var2_4;
                                            var7_9 = var18_20 /* !! */ ;
                                            var31_33 = var26_28;
lbl107:
                                            // 4 sources

                                            while (true) {
                                                var32_34 = 0;
                                                var2_4 = null;
                                                break block46;
                                                break;
                                            }
                                        }
                                        var31_33 = var1_1 /* !! */ .outWidth;
                                        if (var31_33 <= 0 || (var11_13 = var1_1 /* !! */ .outHeight) <= 0) break block50;
                                        var20_22 = var26_28 != var19_21 && var26_28 != var17_19 ? var31_33 : var11_13;
                                        if (var26_28 != var19_21 && var26_28 != var17_19) {
                                            var31_33 = var11_13;
                                        }
                                        var9_11 = B63.c;
                                        var25_27 = (int)Intrinsics.areEqual(var14_16, var9_11);
                                        var16_18 = var4_6.e;
                                        if (var25_27 != 0) {
                                            var25_27 = var20_22;
                                        } else {
                                            var23_25 = var14_16.a;
                                            var25_27 = m.f((wq0)var23_25, (WS2)var16_18);
                                        }
                                        var11_13 = (int)Intrinsics.areEqual(var14_16, var9_11);
                                        if (var11_13 != 0) {
                                            var11_13 = var31_33;
                                        } else {
                                            var9_11 = var14_16.b;
                                            var11_13 = m.f((wq0)var9_11, (WS2)var16_18);
                                        }
                                        var21_23 = Integer.highestOneBit(var20_22 / var25_27);
                                        var33_37 = var31_33 / var11_13;
                                        var19_21 = Integer.highestOneBit(var33_37);
                                        var34_38 = cj0$a.$EnumSwitchMapping$0;
                                        var35_39 = var16_18.ordinal();
                                        var36_36 = var34_38[var35_39];
                                        if (var36_36 != var7_9) {
                                            var7_9 = 2;
                                            var8_10 = 2.8E-45f;
                                            if (var36_36 == var7_9) {
                                                var36_36 = Math.max(var21_23, var19_21);
lbl141:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var1_1 /* !! */  = new NoWhenBranchMatchedException();
                                            throw var1_1 /* !! */ ;
                                        }
                                        var36_36 = Math.min(var21_23, var19_21);
                                        ** while (true)
                                        var7_9 = 1;
                                        var8_10 = 1.4E-45f;
                                        if (var36_36 < var7_9) {
                                            var36_36 = 1;
                                        }
                                        var1_1 /* !! */ .inSampleSize = var36_36;
                                        var37_40 = var20_22;
                                        var7_9 = (int)var18_20 /* !! */ ;
                                        var39_41 = var36_36;
                                        var37_40 /= var39_41;
                                        var30_32 = var2_4;
                                        var41_42 = (double)var31_33 / var39_41;
                                        var39_41 = var25_27;
                                        var31_33 = var26_28;
                                        var43_43 = var11_13;
                                        var39_41 /= var37_40;
                                        var43_43 /= var41_42;
                                        var32_34 = var16_18.ordinal();
                                        var36_36 = 1;
                                        if ((var32_34 = var34_38[var32_34]) == var36_36) ** GOTO lbl172
                                        var36_36 = 2;
                                        if (var32_34 == var36_36) {
                                            var41_42 = Math.min(var39_41, var43_43);
                                        } else {
                                            var1_1 /* !! */  = new NoWhenBranchMatchedException();
                                            throw var1_1 /* !! */ ;
lbl172:
                                            // 1 sources

                                            var41_42 = Math.max(var39_41, var43_43);
                                        }
                                        var29_31 = (int)var4_6.f;
                                        var39_41 = 1.0;
                                        if (var29_31 != 0 && (var29_31 = (int)(var41_42 == var39_41 ? 0 : (var41_42 > var39_41 ? 1 : -1))) > 0) {
                                            var41_42 = var39_41;
                                        }
                                        if ((var29_31 = (int)(var41_42 == var39_41 ? 0 : (var41_42 < var39_41 ? -1 : 1))) == 0) {
                                            var29_31 = 1;
                                            var35_39 = 1;
                                        } else {
                                            var29_31 = 1;
                                            var35_39 = 0;
                                        }
                                        var11_13 = var35_39 ^ 1;
                                        var1_1 /* !! */ .inScaled = var11_13;
                                        if (var11_13 == 0) ** GOTO lbl107
                                        var29_31 = -1 >>> 1;
                                        var11_13 = (int)(var41_42 == var39_41 ? 0 : (var41_42 > var39_41 ? 1 : -1));
                                        if (var11_13 <= 0) break block51;
                                        var39_41 = (double)var29_31 / var41_42;
                                        var1_1 /* !! */ .inDensity = var32_34 = ok1_1.a(var39_41);
                                        var1_1 /* !! */ .inTargetDensity = var29_31;
                                        ** GOTO lbl107
                                    }
                                    var1_1 /* !! */ .inDensity = var29_31;
                                    var39_41 = (double)var29_31 * var41_42;
                                    var1_1 /* !! */ .inTargetDensity = var32_34 = ok1_1.a(var39_41);
                                    ** while (true)
                                }
                                var30_32 = var2_4;
                                var7_9 = var18_20 /* !! */ ;
                                var31_33 = var26_28;
                                var32_35 = 1;
                                var1_1 /* !! */ .inSampleSize = var32_35;
                                var32_35 = 0;
                                var2_4 = null;
                                var1_1 /* !! */ .inScaled = false;
                            }
                            var3_5 = new IE2$a((ie2_2)var6_8);
                            var29_31 = 0;
                            var4_6 = null;
                            try {
                                var3_5 = BitmapFactory.decodeStream((InputStream)var3_5, null, (BitmapFactory.Options)var1_1 /* !! */ );
                            }
                            catch (Throwable var1_2) {
                                var2_4 = var1_2;
                                try {
                                    throw var1_2;
                                }
                                catch (Throwable var1_3) {
                                    var3_5 = var1_3;
                                    xj3_1.b(var6_8, (Throwable)var2_4);
                                    throw var1_3;
                                }
                            }
                            xj3_1.b(var6_8, null);
                            var4_6 = var30_32;
                            var4_6 = var30_32.b;
                            if (var4_6 != null) break block52;
                            if (var3_5 == null) break block53;
                            var4_6 = var10_12.getResources().getDisplayMetrics();
                            var29_31 = var4_6.densityDpi;
                            var3_5.setDensity(var29_31);
                            if (!var7_9 && var31_33 <= 0) break block54;
                            var4_6 = new Matrix();
                            var45_44 = var3_5.getWidth();
                            var46_45 = var45_44;
                            var11_13 = 0x40000000;
                            var12_14 = 2.0f;
                            var46_45 /= var12_14;
                            var21_23 = var3_5.getHeight();
                            var22_24 = (float)var21_23 / var12_14;
                            if (var7_9) {
                                var7_9 = -1082130432;
                                var8_10 = -1.0f;
                                var11_13 = 1065353216;
                                var12_14 = 1.0f;
                                var4_6.postScale(var8_10, var12_14, var46_45, var22_24);
                            }
                            if (var31_33 > 0) {
                                var8_10 = var31_33;
                                var4_6.postRotate(var8_10, var46_45, var22_24);
                            }
                            var7_9 = var3_5.getWidth();
                            var8_10 = var7_9;
                            var12_14 = var3_5.getHeight();
                            var21_23 = 0;
                            var22_24 = 0.0f;
                            var14_16 = null;
                            var6_8 = new RectF(0.0f, 0.0f, var8_10, var12_14);
                            var4_6.mapRect((RectF)var6_8);
                            var8_10 = var6_8.left;
                            cfr_temp_0 = var8_10 - 0.0f;
                            var11_13 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                            if (var11_13 == 0 && (var11_13 = (int)((cfr_temp_1 = (var12_14 = var6_8.top) - 0.0f) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1))) == 0) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var8_10 = -var8_10;
                            var46_45 = -var6_8.top;
                            var4_6.postTranslate(var8_10, var46_45);
                            ** while (true)
                            var45_44 = 90;
                            var46_45 = 1.26E-43f;
                            if (var31_33 == var45_44) ** GOTO lbl-1000
                            var45_44 = 270;
                            var46_45 = 3.78E-43f;
                            if (var31_33 != var45_44) {
                                var31_33 = var3_5.getWidth();
                                var45_44 = var3_5.getHeight();
                                var47_46 = var3_5.getConfig();
                                if (var47_46 == null) {
                                    var47_46 = Bitmap.Config.ARGB_8888;
                                }
                                var5_7 = Bitmap.createBitmap((int)var31_33, (int)var45_44, (Bitmap.Config)var47_46);
                            } else lbl-1000:
                            // 2 sources

                            {
                                var31_33 = var3_5.getHeight();
                                var45_44 = var3_5.getWidth();
                                var47_46 = var3_5.getConfig();
                                if (var47_46 == null) {
                                    var47_46 = Bitmap.Config.ARGB_8888;
                                }
                                var5_7 = Bitmap.createBitmap((int)var31_33, (int)var45_44, (Bitmap.Config)var47_46);
                            }
                            var6_8 = new Canvas((Bitmap)var5_7);
                            var47_46 = AE0.a;
                            var6_8.drawBitmap((Bitmap)var3_5, (Matrix)var4_6, (Paint)var47_46);
                            var3_5.recycle();
                            var3_5 = var5_7;
                        }
                        var5_7 = var10_12.getResources();
                        var6_8 = new BitmapDrawable((Resources)var5_7, (Bitmap)var3_5);
                        var36_36 = var1_1 /* !! */ .inSampleSize;
                        var31_33 = 1;
                        if (var36_36 <= var31_33 && !(var48_47 = var1_1 /* !! */ .inScaled)) {
                            var7_9 = false;
                            var8_10 = 0.0f;
                            var47_46 = null;
                        } else {
                            var7_9 = true;
                            var8_10 = 1.4E-45f;
                        }
                        var4_6 = new aj0((Drawable)var6_8, (boolean)var7_9);
                        return var4_6;
                    }
                    var2_4 = "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString();
                    var1_1 /* !! */  = new IllegalStateException((String)var2_4);
                    throw var1_1 /* !! */ ;
                }
                throw var4_6;
            }
            throw var14_16;
        }
        throw var10_12;
    }
}

