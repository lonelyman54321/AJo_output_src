/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 */
package com.google.accompanist.appcompattheme;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.accompanist.appcompattheme.AppCompatTheme$AppCompatTheme$1;
import com.google.accompanist.appcompattheme.AppCompatTheme$AppCompatTheme$2;
import com.google.accompanist.appcompattheme.ColorKt;
import com.google.accompanist.appcompattheme.FontFamilyWithWeight;
import com.google.accompanist.appcompattheme.R$styleable;
import com.google.accompanist.appcompattheme.ThemeParameters;
import com.google.accompanist.appcompattheme.TypedArrayUtilsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class AppCompatTheme {
    /*
     * Unable to fully structure code
     */
    public static final void AppCompatTheme(Context var0, boolean var1_1, boolean var2_2, A13 var3_3, Function2 var4_4, b30_0 var5_5, int var6_6, int var7_7) {
        block28: {
            block24: {
                block27: {
                    block26: {
                        block25: {
                            var8_8 = var4_4;
                            var9_9 = var6_6;
                            Intrinsics.checkNotNullParameter(var4_4, "content");
                            var10_10 = 1198302489;
                            var11_11 = var5_5;
                            var12_12 = var5_5.g(var10_10);
                            var13_13 = var7_7 & 1;
                            var14_14 = var13_13 != 0 ? var6_6 | 2 : var6_6;
                            var15_15 = var7_7 & 2;
                            if (var15_15 != 0) {
                                var14_14 |= 48;
                                while (true) {
                                    var16_16 = (int)var1_1;
                                    break;
                                }
                            } else {
                                if ((var16_16 = var9_9 & 112) != 0) ** continue;
                                var16_16 = (int)var1_1;
                                var17_17 = (int)var12_12.a(var1_1);
                                var17_17 = var17_17 != 0 ? 32 : 16;
                                var14_14 |= var17_17;
                            }
                            var17_17 = var7_7 & 4;
                            if (var17_17 != 0) {
                                var14_14 |= 384;
                                while (true) {
                                    var18_18 = (int)var2_2;
                                    break;
                                }
                            } else {
                                if ((var18_18 = var9_9 & 896) != 0) ** continue;
                                var18_18 = (int)var2_2;
                                var19_19 = (int)var12_12.a(var2_2);
                                var19_19 = var19_19 != 0 ? 256 : 128;
                                var14_14 |= var19_19;
                            }
                            var19_19 = var9_9 & 7168;
                            if (var19_19 != 0) break block24;
                            var19_19 = var7_7 & 8;
                            if (var19_19 != 0) break block25;
                            var20_20 = var3_3;
                            var21_21 = (int)var12_12.J(var3_3);
                            if (var21_21 == 0) break block26;
                            var21_21 = 2048;
                            break block27;
                        }
                        var20_20 = var3_3;
                    }
                    var21_21 = 1024;
                }
                var14_14 |= var21_21;
                break block28;
            }
            var20_20 = var3_3;
        }
        var21_21 = var7_7 & 16;
        if (var21_21 != 0) {
            var14_14 |= 24576;
        } else {
            var21_21 = 57344 & var9_9;
            if (var21_21 == 0) {
                var21_21 = (int)var12_12.x(var8_8);
                var21_21 = var21_21 != 0 ? 16384 : 8192;
                var14_14 |= var21_21;
            }
        }
        var21_21 = 1;
        if (var13_13 == var21_21 && (var22_22 = 46811 & var14_14) == (var23_23 = 9362) && (var22_22 = (int)var12_12.h()) != 0) {
            var12_12.D();
            var11_11 = var0;
            var14_14 = var16_16;
            var15_15 = var18_18;
            var24_24 = var20_20;
        } else {
            var12_12.r0();
            var22_22 = var9_9 & 1;
            if (var22_22 != 0 && (var22_22 = (int)var12_12.c0()) == 0) {
                var12_12.D();
                if (var13_13 != 0) {
                    var14_14 &= -15;
                }
                if ((var13_13 = var7_7 & 8) != 0) {
                    var14_14 &= -7169;
                }
                var11_11 = var0;
                while (true) {
                    var17_17 = var14_14;
                    var14_14 = var18_18;
                    var25_25 = var20_20;
                    break;
                }
            } else {
                if (var13_13 != 0) {
                    var11_11 = AndroidCompositionLocals_androidKt.b;
                    var11_11 = (Context)var12_12.j((H30)var11_11);
                    var14_14 &= -15;
                } else {
                    var11_11 = var0;
                }
                if (var15_15 != 0) {
                    var16_16 = 1;
                }
                if (var17_17 != 0) {
                    var18_18 = 1;
                }
                if ((var15_15 = var7_7 & 8) == 0) ** continue;
                var25_25 = B13.a;
                var25_25 = (A13)var12_12.j((H30)var25_25);
                var17_17 = var14_14 & -7169;
                var14_14 = var18_18;
            }
            var12_12.U();
            var26_26 = var11_11.getTheme();
            var19_19 = 1157296644;
            var12_12.u(var19_19);
            var18_18 = (int)var12_12.J(var26_26);
            var20_20 = var12_12.v();
            if (var18_18 != 0 || var20_20 == (var26_26 = b30$a.a)) {
                var20_20 = AppCompatTheme.createAppCompatTheme((Context)var11_11, (boolean)var16_16, (boolean)var14_14);
                var12_12.o(var20_20);
            }
            var18_18 = 0;
            var26_26 = null;
            var12_12.T(false);
            var20_20 = (ThemeParameters)var20_20;
            var27_27 = var20_20.getColors();
            var22_22 = 1804679322;
            var12_12.u(var22_22);
            if (var27_27 == null) {
                var27_27 = mz_0.a;
                var27_27 = (lZ)var12_12.j((H30)var27_27);
            }
            var12_12.T(false);
            var20_20 = var20_20.getTypography();
            var22_22 = 1804679387;
            var12_12.u(var22_22);
            if (var20_20 == null) {
                var20_20 = Bt3.b;
                var20_20 = (At3)var12_12.j((H30)var20_20);
            }
            var12_12.T(false);
            var26_26 = new AppCompatTheme$AppCompatTheme$1(var8_8, var17_17);
            var22_22 = -2029017619;
            var28_28 = v10.b((b30_0)var12_12, var22_22, (Lambda)var26_26);
            var17_17 = var17_17 >> 3 & 896;
            var23_23 = var17_17 | 3072;
            var29_29 = var27_27;
            var26_26 = var20_20;
            var20_20 = var25_25;
            var27_27 = var28_28;
            var28_28 = var12_12;
            IK1.a((lZ)var29_29, (At3)var26_26, (A13)var25_25, (u10)var27_27, (b30_0)var12_12, var23_23);
            var15_15 = var14_14;
            var14_14 = var16_16;
            var24_24 = var25_25;
        }
        var26_26 = var12_12.X();
        if (var26_26 != null) {
            var12_12 = var20_20;
            var8_8 = var4_4;
            var9_9 = var6_6;
            var17_17 = var7_7;
            var26_26.d = var20_20 = new AppCompatTheme$AppCompatTheme$2((Context)var11_11, (boolean)var14_14, (boolean)var15_15, (A13)var24_24, var4_4, var6_6, var7_7);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final ThemeParameters createAppCompatTheme(Context context, boolean bl2, boolean bl3) {
        void var4_10;
        Object object;
        float f5;
        int n3;
        Object object2;
        int n4;
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context, "<this>");
        int[] nArray = R$styleable.AppCompatThemeAdapterTheme;
        TypedArray typedArray = context.obtainStyledAttributes(nArray);
        String string2 = "obtainStyledAttributes(R\u2026pCompatThemeAdapterTheme)";
        Intrinsics.checkNotNullExpressionValue(typedArray, string2);
        int n7 = R$styleable.AppCompatThemeAdapterTheme_windowActionBar;
        n7 = (int)(typedArray.hasValue(n7) ? 1 : 0);
        if (n7 == 0) {
            String string3 = "createAppCompatTheme requires the host context's theme to extend Theme.AppCompat".toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
            throw illegalArgumentException;
        }
        n7 = 0;
        Object var4_8 = null;
        if (bl2) {
            long l2;
            int n8 = R$styleable.AppCompatThemeAdapterTheme_isLightTheme;
            n4 = 1;
            if ((n8 = (int)(typedArray.getBoolean(n8, n4 != 0) ? 1 : 0)) != 0) {
                object2 = mz_0.c();
            } else {
                object2 = mz_0.a;
                long l3 = zx_0.d(4290479868L);
                long l4 = zx_0.d(4281794739L);
                long l7 = zx_0.d(4278442694L);
                l2 = 0xFF121212L;
                long l8 = zx_0.d(l2);
                long l12 = zx_0.d(l2);
                l2 = 4291782265L;
                long l14 = zx_0.d(l2);
                long l15 = OX.b;
                long l16 = OX.f;
                object2 = new lZ(l3, l4, l7, l7, l8, l12, l14, l15, l15, l16, l16, l15, false);
            }
            Object object3 = object2;
            n4 = R$styleable.AppCompatThemeAdapterTheme_colorPrimary;
            long l17 = 0L;
            int n10 = 2;
            object2 = typedArray;
            long l18 = TypedArrayUtilsKt.getComposeColor-mxwnekA$default(typedArray, n4, l17, n10, null);
            n4 = R$styleable.AppCompatThemeAdapterTheme_colorPrimaryDark;
            long l19 = TypedArrayUtilsKt.getComposeColor-mxwnekA$default(typedArray, n4, l17, n10, null);
            long l20 = ColorKt.calculateOnColor-8_81llA(l18);
            n4 = R$styleable.AppCompatThemeAdapterTheme_colorAccent;
            long l21 = TypedArrayUtilsKt.getComposeColor-mxwnekA$default(typedArray, n4, l17, n10, null);
            long l22 = ColorKt.calculateOnColor-8_81llA(l21);
            n4 = R$styleable.AppCompatThemeAdapterTheme_android_textColorPrimary;
            l2 = TypedArrayUtilsKt.getComposeColor-mxwnekA$default(typedArray, n4, l17, n10, null);
            l17 = OX.l;
            n3 = (int)(OX.c(l2, l17) ? 1 : 0);
            if (n3 == 0) {
                n3 = 1065353216;
                f5 = 1.0f;
                l2 = OX.b(l2, f5);
            }
            long l23 = l2;
            long l24 = l2 = ((lZ)object3).h();
            long l25 = ColorKt.calculateOnColorWithTextColorPrimary--OWjLjI(l2, l23);
            n4 = R$styleable.AppCompatThemeAdapterTheme_android_colorBackground;
            l17 = 0L;
            n10 = 2;
            object2 = typedArray;
            long l26 = l2 = TypedArrayUtilsKt.getComposeColor-mxwnekA$default(typedArray, n4, l17, n10, null);
            long l27 = ColorKt.calculateOnColorWithTextColorPrimary--OWjLjI(l2, l23);
            n4 = R$styleable.AppCompatThemeAdapterTheme_colorError;
            l2 = TypedArrayUtilsKt.getComposeColor-mxwnekA$default(typedArray, n4, l17, n10, null);
            long l28 = ColorKt.calculateOnColor-8_81llA(l2);
            int n14 = 4096;
            object2 = lZ.a((lZ)object3, l18, l19, l21, l21, l26, l24, l2, l20, l22, l27, l25, l28, n14);
        } else {
            boolean bl4 = false;
            object2 = null;
        }
        if (bl3) {
            n4 = R$styleable.AppCompatThemeAdapterTheme_fontFamily;
            object = TypedArrayUtilsKt.getFontFamilyOrNull(typedArray, n4);
            if (object == null) {
                n4 = R$styleable.AppCompatThemeAdapterTheme_android_fontFamily;
                object = TypedArrayUtilsKt.getFontFamilyOrNull(typedArray, n4);
            }
            if (object != null) {
                object = ((FontFamilyWithWeight)object).getFontFamily();
                n3 = 16382;
                f5 = 2.2956E-41f;
                At3 at3 = new At3((RU0)object, n3);
            }
        }
        object = new ThemeParameters((lZ)object2, (At3)var4_10);
        typedArray.recycle();
        return object;
    }

    public static /* synthetic */ ThemeParameters createAppCompatTheme$default(Context context, boolean bl2, boolean bl3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = true;
        }
        if ((n3 &= 2) != 0) {
            bl3 = true;
        }
        return AppCompatTheme.createAppCompatTheme(context, bl2, bl3);
    }
}

