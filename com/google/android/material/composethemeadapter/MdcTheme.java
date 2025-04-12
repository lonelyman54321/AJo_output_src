/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 */
package com.google.android.material.composethemeadapter;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.material.composethemeadapter.MdcTheme$MdcTheme$1;
import com.google.android.material.composethemeadapter.MdcTheme$MdcTheme$2;
import com.google.android.material.composethemeadapter.R$styleable;
import com.google.android.material.composethemeadapter.ThemeParameters;
import com.google.android.material.composethemeadapter.TypographyKt;
import com.google.android.material.composethemeadapter.core.ResourceUtilsKt;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class MdcTheme {
    private static final A13 emptyShapes;
    private static Method sThemeGetKeyMethod;
    private static boolean sThemeGetKeyMethodFetched;

    static {
        A13 a13;
        emptyShapes = a13 = new A13(0);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void MdcTheme(Context context, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, Function2 function2, b30_0 b30_02, int n3, int n4) {
        Object object;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        void var9_10;
        Object object2;
        vc3_1 vc3_12;
        void var11_12;
        void var8_9;
        void var10_11;
        void var6_7;
        block52: {
            void var31_68;
            void var29_58;
            b30$a$a b30$a$a;
            void var31_64;
            Object object3;
            void var31_62;
            Object object4;
            Resources.Theme theme;
            int n18;
            block53: {
                block38: {
                    boolean bl7;
                    int n19;
                    int n20;
                    int n21;
                    int n22;
                    block51: {
                        boolean bl8;
                        int n24;
                        int n25;
                        block50: {
                            block49: {
                                block48: {
                                    block47: {
                                        block46: {
                                            block45: {
                                                block44: {
                                                    block43: {
                                                        void var19_32;
                                                        block42: {
                                                            block41: {
                                                                block40: {
                                                                    block39: {
                                                                        void var7_8;
                                                                        var10_11 = var6_7;
                                                                        var11_12 = var8_9;
                                                                        Intrinsics.checkNotNullParameter(var6_7, "content");
                                                                        int n26 = 1123331981;
                                                                        vc3_12 = var7_8;
                                                                        object2 = var7_8.g(n26);
                                                                        n22 = var9_10 & 1;
                                                                        n17 = n22 != 0 ? var8_9 | 2 : var8_9;
                                                                        n16 = var9_10 & 2;
                                                                        if (n16 == 0) break block39;
                                                                        n17 |= 0x30;
                                                                        break block40;
                                                                    }
                                                                    int n27 = var11_12 & 0x70;
                                                                    if (n27 != 0) break block40;
                                                                    boolean bl9 = bl2;
                                                                    boolean bl10 = ((j30_0)object2).a(bl2);
                                                                    if (!bl10) break block41;
                                                                    int n28 = 32;
                                                                    break block42;
                                                                }
                                                                boolean bl11 = bl2;
                                                                break block43;
                                                            }
                                                            int n29 = 16;
                                                        }
                                                        n17 |= var19_32;
                                                    }
                                                    n21 = var9_10 & 4;
                                                    if (n21 != 0) {
                                                        n17 |= 0x180;
                                                    } else {
                                                        n15 = var11_12 & 0x380;
                                                        if (n15 == 0) {
                                                            n15 = (int)(bl3 ? 1 : 0);
                                                            n14 = (int)(((j30_0)object2).a(bl3) ? 1 : 0);
                                                            n14 = n14 != 0 ? 256 : 128;
                                                        }
                                                    }
                                                    n15 = (int)(bl3 ? 1 : 0);
                                                    break block44;
                                                    n17 |= n14;
                                                }
                                                n14 = var9_10 & 8;
                                                if (n14 != 0) {
                                                    n17 |= 0xC00;
                                                } else {
                                                    n10 = var11_12 & 0x1C00;
                                                    if (!n10) {
                                                        n10 = (int)(bl4 ? 1 : 0);
                                                        n18 = (int)(((j30_0)object2).a(bl4) ? 1 : 0);
                                                        n18 = n18 != 0 ? 2048 : 1024;
                                                    }
                                                }
                                                n10 = (int)(bl4 ? 1 : 0);
                                                break block45;
                                                n17 |= n18;
                                            }
                                            n18 = var9_10 & 0x10;
                                            if (n18 != 0) {
                                                n17 |= 0x6000;
                                            } else {
                                                n8 = 0xE000 & var11_12;
                                                if (!n8) {
                                                    n8 = (int)(bl5 ? 1 : 0);
                                                    n20 = (int)(((j30_0)object2).a(bl5) ? 1 : 0);
                                                    n20 = n20 != 0 ? 16384 : 8192;
                                                }
                                            }
                                            n8 = (int)(bl5 ? 1 : 0);
                                            break block46;
                                            n17 |= n20;
                                        }
                                        n20 = var9_10 & 0x20;
                                        if (n20 != 0) {
                                            n7 = 196608;
                                            n17 |= n7;
                                        } else {
                                            n7 = 0x70000 & var11_12;
                                            if (n7 == 0) {
                                                n7 = (int)(bl6 ? 1 : 0);
                                                n19 = ((j30_0)object2).a(bl6);
                                                n19 = n19 != 0 ? 131072 : 65536;
                                            }
                                        }
                                        n7 = (int)(bl6 ? 1 : 0);
                                        break block47;
                                        n17 |= n19;
                                    }
                                    n19 = var9_10 & 0x40;
                                    if (n19 == 0) break block48;
                                    n19 = 0x180000;
                                    break block49;
                                }
                                n19 = 0x380000 & var11_12;
                                if (n19 != 0) break block50;
                                n19 = (int)(((j30_0)object2).J(var10_11) ? 1 : 0);
                                n19 = n19 != 0 ? 0x100000 : 524288;
                            }
                            n17 |= n19;
                        }
                        if (n22 != (n19 = 1) || (n19 = n17 & (n25 = 2995931)) != (n24 = 599186) || !(bl8 = ((j30_0)object2).h())) break block51;
                        ((j30_0)object2).D();
                        vc3_12 = context;
                        n17 = (int)(bl2 ? 1 : 0);
                        break block52;
                    }
                    ((j30_0)object2).r0();
                    int n30 = var11_12 & 1;
                    n19 = 0;
                    if (n30 != 0 && !(bl7 = ((j30_0)object2).c0())) {
                        ((j30_0)object2).D();
                        if (n22 != 0) {
                            n17 &= 0xFFFFFFF1;
                        }
                        vc3_12 = context;
                        n16 = (int)(bl2 ? 1 : 0);
                    } else {
                        if (n22 != 0) {
                            vc3_12 = AndroidCompositionLocals_androidKt.b;
                            vc3_12 = (Context)((j30_0)object2).j(vc3_12);
                            n17 &= 0xFFFFFFF1;
                        } else {
                            vc3_12 = context;
                        }
                        n16 = n16 != 0 ? 1 : (int)(bl2 ? 1 : 0);
                        if (n21 != 0) {
                            n15 = 1;
                        }
                        if (n14 != 0) {
                            n10 = 1;
                        }
                        if (n18 != 0) {
                            n8 = 0;
                        }
                        if (n20 != 0) {
                            n7 = 0;
                        }
                    }
                    ((j30_0)object2).U();
                    theme = vc3_12.getTheme();
                    object4 = "context.theme";
                    Intrinsics.checkNotNullExpressionValue(theme, (String)object4);
                    boolean bl12 = sThemeGetKeyMethodFetched;
                    n14 = 0;
                    Object var31_60 = null;
                    if (bl12) break block53;
                    object4 = Resources.Theme.class;
                    object = "getKey";
                    object4 = ((Class)object4).getDeclaredMethod((String)object, null);
                    n18 = 1;
                    try {
                        ((AccessibleObject)object4).setAccessible(n18 != 0);
                        sThemeGetKeyMethod = object4;
                        break block38;
                    }
                    catch (ReflectiveOperationException reflectiveOperationException) {}
                    catch (ReflectiveOperationException reflectiveOperationException) {
                        n18 = 1;
                    }
                }
                sThemeGetKeyMethodFetched = n18;
            }
            if ((object4 = sThemeGetKeyMethod) != null) {
                void var29_48;
                try {
                    Object object5 = ((Method)object4).invoke((Object)theme, null);
                }
                catch (ReflectiveOperationException reflectiveOperationException) {
                    Unit unit = Unit.a;
                }
                void var31_61 = var29_48;
            }
            if (var31_62 == null) {
                Resources.Theme theme2 = vc3_12.getTheme();
            }
            vc3_1 vc3_13 = O30.l;
            Object object6 = object3 = ((j30_0)object2).j(vc3_13);
            bp1_0 bp1_02 = (bp1_0)((Object)object3);
            ((j30_0)object2).u(1157296644);
            boolean bl13 = ((j30_0)object2).J(var31_64);
            object4 = ((j30_0)object2).v();
            if (bl13 || object4 == (b30$a$a = b30$a.a)) {
                int n32 = 4;
                object4 = MdcTheme.createMdcTheme$default((Context)vc3_12, bp1_02, null, n16 != 0, n15 != 0, n10 != 0, n8 != 0, n7 != 0, n32, null);
                ((j30_0)object2).o(object4);
            }
            ((j30_0)object2).T(false);
            object4 = (ThemeParameters)object4;
            lZ lZ2 = ((ThemeParameters)object4).getColors();
            n14 = -755929125;
            ((j30_0)object2).u(n14);
            if (lZ2 == null) {
                vc3_1 vc3_14 = mz_0.a;
                lZ lZ3 = (lZ)((j30_0)object2).j(vc3_14);
            }
            ((j30_0)object2).T(false);
            At3 at3 = ((ThemeParameters)object4).getTypography();
            n18 = -755929060;
            ((j30_0)object2).u(n18);
            if (at3 == null) {
                vc3_1 vc3_15 = Bt3.b;
                At3 at32 = (At3)((j30_0)object2).j(vc3_15);
            }
            ((j30_0)object2).T(false);
            object4 = ((ThemeParameters)object4).getShapes();
            if (object4 == null) {
                object4 = B13.a;
                object4 = (A13)((j30_0)object2).j((H30)object4);
            }
            object = new MdcTheme$MdcTheme$1((Function2)var10_11, n17);
            u10 u102 = v10.b((b30_0)object2, 901606457, (Lambda)object);
            n18 = 3072;
            context = var29_58;
            int n34 = n18;
            IK1.a((lZ)var29_58, (At3)var31_68, (A13)object4, u102, (b30_0)object2, n18);
            n17 = n16;
        }
        n16 = n15;
        int n35 = n10;
        int n36 = n8;
        n15 = n7;
        CF2 cF2 = ((j30_0)object2).X();
        if (cF2 != null) {
            object2 = object;
            var10_11 = var6_7;
            var11_12 = var8_9;
            n14 = var9_10;
            cF2.d = object = new MdcTheme$MdcTheme$2((Context)vc3_12, n17 != 0, n16 != 0, n10 != 0, n8 != 0, n7 != 0, (Function2)var6_7, (int)var8_9, (int)var9_10);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final ThemeParameters createMdcTheme(Context var0, bp1_0 var1_1, Vo0 var2_2, boolean var3_3, boolean var4_4, boolean var5_5, boolean var6_6, boolean var7_7) {
        block8: {
            block10: {
                block9: {
                    var8_8 /* !! */  = var0;
                    var9_9 /* !! */  = var1_1;
                    var10_10 = var2_2;
                    var11_11 = var6_6;
                    Intrinsics.checkNotNullParameter(var0, "context");
                    Intrinsics.checkNotNullParameter((Object)var1_1, "layoutDirection");
                    Intrinsics.checkNotNullParameter(var2_2, "density");
                    var12_12 /* !! */  = R$styleable.ComposeThemeAdapterMaterialTheme;
                    var12_12 /* !! */  = (int[])var0.obtainStyledAttributes(var12_12 /* !! */ );
                    var13_13 = "context.obtainStyledAttr\u2026hemeAdapterMaterialTheme)";
                    Intrinsics.checkNotNullExpressionValue(var12_12 /* !! */ , (String)var13_13);
                    var14_14 = R$styleable.ComposeThemeAdapterMaterialTheme_isMaterialTheme;
                    var14_14 = (int)var12_12 /* !! */ .hasValue(var14_14);
                    if (var14_14 == 0) break block8;
                    var15_15 = null;
                    if (var3_3) {
                        var16_16 = R$styleable.ComposeThemeAdapterMaterialTheme_colorPrimary;
                        var17_17 = 0L;
                        var19_18 = 2;
                        var13_13 = var12_12 /* !! */ ;
                        var20_19 = ResourceUtilsKt.parseColor-mxwnekA$default((TypedArray)var12_12 /* !! */ , (int)var16_16, var17_17, var19_18, null);
                        var16_16 = R$styleable.ComposeThemeAdapterMaterialTheme_colorPrimaryVariant;
                        var22_20 = ResourceUtilsKt.parseColor-mxwnekA$default((TypedArray)var12_12 /* !! */ , (int)var16_16, var17_17, var19_18, null);
                        var16_16 = R$styleable.ComposeThemeAdapterMaterialTheme_colorOnPrimary;
                        var24_21 = ResourceUtilsKt.parseColor-mxwnekA$default((TypedArray)var12_12 /* !! */ , (int)var16_16, var17_17, var19_18, null);
                        var16_16 = R$styleable.ComposeThemeAdapterMaterialTheme_colorSecondary;
                        var26_22 = ResourceUtilsKt.parseColor-mxwnekA$default((TypedArray)var12_12 /* !! */ , (int)var16_16, var17_17, var19_18, null);
                        var16_16 = R$styleable.ComposeThemeAdapterMaterialTheme_colorSecondaryVariant;
                        var28_23 = ResourceUtilsKt.parseColor-mxwnekA$default((TypedArray)var12_12 /* !! */ , (int)var16_16, var17_17, var19_18, null);
                        var16_16 = R$styleable.ComposeThemeAdapterMaterialTheme_colorOnSecondary;
                        var30_24 = ResourceUtilsKt.parseColor-mxwnekA$default((TypedArray)var12_12 /* !! */ , (int)var16_16, var17_17, var19_18, null);
                        var16_16 = R$styleable.ComposeThemeAdapterMaterialTheme_android_colorBackground;
                        var32_25 = ResourceUtilsKt.parseColor-mxwnekA$default((TypedArray)var12_12 /* !! */ , (int)var16_16, var17_17, var19_18, null);
                        var16_16 = R$styleable.ComposeThemeAdapterMaterialTheme_colorOnBackground;
                        var34_26 = ResourceUtilsKt.parseColor-mxwnekA$default((TypedArray)var12_12 /* !! */ , (int)var16_16, var17_17, var19_18, null);
                        var16_16 = R$styleable.ComposeThemeAdapterMaterialTheme_colorSurface;
                        var36_27 = ResourceUtilsKt.parseColor-mxwnekA$default((TypedArray)var12_12 /* !! */ , (int)var16_16, var17_17, var19_18, null);
                        var16_16 = R$styleable.ComposeThemeAdapterMaterialTheme_colorOnSurface;
                        var38_28 = ResourceUtilsKt.parseColor-mxwnekA$default((TypedArray)var12_12 /* !! */ , (int)var16_16, var17_17, var19_18, null);
                        var16_16 = R$styleable.ComposeThemeAdapterMaterialTheme_colorError;
                        var40_29 = ResourceUtilsKt.parseColor-mxwnekA$default((TypedArray)var12_12 /* !! */ , (int)var16_16, var17_17, var19_18, null);
                        var16_16 = R$styleable.ComposeThemeAdapterMaterialTheme_colorOnError;
                        var42_30 = ResourceUtilsKt.parseColor-mxwnekA$default((TypedArray)var12_12 /* !! */ , (int)var16_16, var17_17, var19_18, null);
                        var14_14 = R$styleable.ComposeThemeAdapterMaterialTheme_isLightTheme;
                        var16_16 = true;
                        if ((var14_14 = (int)var12_12 /* !! */ .getBoolean(var14_14, var16_16)) != 0) {
                            var44_31 = var13_13 = mz_0.a;
                            var45_32 = true;
                            var13_13 = new lZ(var20_19, var22_20, var26_22, var28_23, var32_25, var36_27, var40_29, var24_21, var30_24, var34_26, var38_28, var42_30, var45_32);
                        } else {
                            var44_31 = var13_13 = mz_0.a;
                            var45_33 = false;
                            var13_13 = new lZ(var20_19, var22_20, var26_22, var28_23, var32_25, var36_27, var40_29, var24_21, var30_24, var34_26, var38_28, var42_30, false);
                        }
                    } else {
                        var14_14 = 0;
                        var13_13 = null;
                    }
                    var16_16 = false;
                    if (!var4_4) break block9;
                    if (!var7_7) ** GOTO lbl-1000
                    var46_34 = R$styleable.ComposeThemeAdapterMaterialTheme_fontFamily;
                    var47_35 = ResourceUtilsKt.parseFontFamily((TypedArray)var12_12 /* !! */ , var46_34);
                    if (var47_35 == null) {
                        var46_34 = R$styleable.ComposeThemeAdapterMaterialTheme_android_fontFamily;
                        var47_35 = ResourceUtilsKt.parseFontFamily((TypedArray)var12_12 /* !! */ , var46_34);
                    }
                    if (var47_35 != null) {
                        var47_35 = var47_35.getFontFamily();
                    } else lbl-1000:
                    // 2 sources

                    {
                        var46_34 = 0;
                        var47_35 = null;
                    }
                    var48_36 = var47_35 == null ? RU0.a : var47_35;
                    var19_18 = 16382;
                    var44_31 = new At3((RU0)var48_36, var19_18);
                    var49_37 = R$styleable.ComposeThemeAdapterMaterialTheme_textAppearanceHeadline1;
                    ct3.c((TypedArray)var12_12 /* !! */ , var49_37);
                    var49_37 = var12_12 /* !! */ .getResourceId(var49_37, 0);
                    var50_38 = ResourceUtilsKt.parseTextAppearance(var8_8 /* !! */ , var49_37, (Vo0)var10_10, var11_11, (RU0)var47_35);
                    var49_37 = R$styleable.ComposeThemeAdapterMaterialTheme_textAppearanceHeadline2;
                    ct3.c((TypedArray)var12_12 /* !! */ , var49_37);
                    var49_37 = var12_12 /* !! */ .getResourceId(var49_37, 0);
                    var51_39 = ResourceUtilsKt.parseTextAppearance(var8_8 /* !! */ , var49_37, (Vo0)var10_10, var11_11, (RU0)var47_35);
                    var49_37 = R$styleable.ComposeThemeAdapterMaterialTheme_textAppearanceHeadline3;
                    ct3.c((TypedArray)var12_12 /* !! */ , var49_37);
                    var49_37 = var12_12 /* !! */ .getResourceId(var49_37, 0);
                    var52_40 = ResourceUtilsKt.parseTextAppearance(var8_8 /* !! */ , var49_37, (Vo0)var10_10, var11_11, (RU0)var47_35);
                    var49_37 = R$styleable.ComposeThemeAdapterMaterialTheme_textAppearanceHeadline4;
                    ct3.c((TypedArray)var12_12 /* !! */ , var49_37);
                    var49_37 = var12_12 /* !! */ .getResourceId(var49_37, 0);
                    var53_41 = ResourceUtilsKt.parseTextAppearance(var8_8 /* !! */ , var49_37, (Vo0)var10_10, var11_11, (RU0)var47_35);
                    var49_37 = R$styleable.ComposeThemeAdapterMaterialTheme_textAppearanceHeadline5;
                    ct3.c((TypedArray)var12_12 /* !! */ , var49_37);
                    var49_37 = var12_12 /* !! */ .getResourceId(var49_37, 0);
                    var54_42 = ResourceUtilsKt.parseTextAppearance(var8_8 /* !! */ , var49_37, (Vo0)var10_10, var11_11, (RU0)var47_35);
                    var49_37 = R$styleable.ComposeThemeAdapterMaterialTheme_textAppearanceHeadline6;
                    ct3.c((TypedArray)var12_12 /* !! */ , var49_37);
                    var49_37 = var12_12 /* !! */ .getResourceId(var49_37, 0);
                    var55_43 = ResourceUtilsKt.parseTextAppearance(var8_8 /* !! */ , var49_37, (Vo0)var10_10, var11_11, (RU0)var47_35);
                    var49_37 = R$styleable.ComposeThemeAdapterMaterialTheme_textAppearanceSubtitle1;
                    ct3.c((TypedArray)var12_12 /* !! */ , var49_37);
                    var49_37 = var12_12 /* !! */ .getResourceId(var49_37, 0);
                    var56_44 = ResourceUtilsKt.parseTextAppearance(var8_8 /* !! */ , var49_37, (Vo0)var10_10, var11_11, (RU0)var47_35);
                    var49_37 = R$styleable.ComposeThemeAdapterMaterialTheme_textAppearanceSubtitle2;
                    ct3.c((TypedArray)var12_12 /* !! */ , var49_37);
                    var49_37 = var12_12 /* !! */ .getResourceId(var49_37, 0);
                    var57_45 = ResourceUtilsKt.parseTextAppearance(var8_8 /* !! */ , var49_37, (Vo0)var10_10, var11_11, (RU0)var47_35);
                    var49_37 = R$styleable.ComposeThemeAdapterMaterialTheme_textAppearanceBody1;
                    ct3.c((TypedArray)var12_12 /* !! */ , var49_37);
                    var49_37 = var12_12 /* !! */ .getResourceId(var49_37, 0);
                    var58_46 = ResourceUtilsKt.parseTextAppearance(var8_8 /* !! */ , var49_37, (Vo0)var10_10, var11_11, (RU0)var47_35);
                    var49_37 = R$styleable.ComposeThemeAdapterMaterialTheme_textAppearanceBody2;
                    ct3.c((TypedArray)var12_12 /* !! */ , var49_37);
                    var49_37 = var12_12 /* !! */ .getResourceId(var49_37, 0);
                    var59_47 = ResourceUtilsKt.parseTextAppearance(var8_8 /* !! */ , var49_37, (Vo0)var10_10, var11_11, (RU0)var47_35);
                    var49_37 = R$styleable.ComposeThemeAdapterMaterialTheme_textAppearanceButton;
                    ct3.c((TypedArray)var12_12 /* !! */ , var49_37);
                    var49_37 = var12_12 /* !! */ .getResourceId(var49_37, 0);
                    var60_48 = ResourceUtilsKt.parseTextAppearance(var8_8 /* !! */ , var49_37, (Vo0)var10_10, var11_11, (RU0)var47_35);
                    var49_37 = R$styleable.ComposeThemeAdapterMaterialTheme_textAppearanceCaption;
                    ct3.c((TypedArray)var12_12 /* !! */ , var49_37);
                    var49_37 = var12_12 /* !! */ .getResourceId(var49_37, 0);
                    var61_49 = ResourceUtilsKt.parseTextAppearance(var8_8 /* !! */ , var49_37, (Vo0)var10_10, var11_11, (RU0)var47_35);
                    var49_37 = R$styleable.ComposeThemeAdapterMaterialTheme_textAppearanceOverline;
                    ct3.c((TypedArray)var12_12 /* !! */ , var49_37);
                    var49_37 = var12_12 /* !! */ .getResourceId(var49_37, 0);
                    var62_50 = ResourceUtilsKt.parseTextAppearance(var8_8 /* !! */ , var49_37, (Vo0)var10_10, var11_11, (RU0)var47_35);
                    var10_10 = TypographyKt.merge((At3)var44_31, var50_38, var51_39, var52_40, var53_41, var54_42, var55_43, var56_44, var57_45, var58_46, var59_47, var60_48, var61_49, var62_50);
                    break block10;
                }
                var10_10 = null;
            }
            if (var5_5) {
                var11_11 = R$styleable.ComposeThemeAdapterMaterialTheme_shapeAppearanceSmallComponent;
                ct3.c((TypedArray)var12_12 /* !! */ , (int)var11_11);
                var11_11 = var12_12 /* !! */ .getResourceId((int)var11_11, 0);
                var47_35 = MdcTheme.emptyShapes;
                var48_36 = var47_35.a;
                var63_51 = ResourceUtilsKt.parseShapeAppearance(var8_8 /* !! */ , (int)var11_11, var9_9 /* !! */ , (q90_0)var48_36);
                var49_37 = R$styleable.ComposeThemeAdapterMaterialTheme_shapeAppearanceMediumComponent;
                ct3.c((TypedArray)var12_12 /* !! */ , var49_37);
                var49_37 = var12_12 /* !! */ .getResourceId(var49_37, 0);
                var64_52 = var47_35.b;
                var48_36 = ResourceUtilsKt.parseShapeAppearance(var8_8 /* !! */ , var49_37, var9_9 /* !! */ , var64_52);
                var19_18 = R$styleable.ComposeThemeAdapterMaterialTheme_shapeAppearanceLargeComponent;
                ct3.c((TypedArray)var12_12 /* !! */ , var19_18);
                var16_16 = var12_12 /* !! */ .getResourceId(var19_18, 0);
                var47_35 = var47_35.c;
                var8_8 /* !! */  = ResourceUtilsKt.parseShapeAppearance(var8_8 /* !! */ , (int)var16_16, var9_9 /* !! */ , (q90_0)var47_35);
                var15_15 = new A13(var63_51, (q90_0)var48_36, (q90_0)var8_8 /* !! */ );
            }
            var8_8 /* !! */  = new ThemeParameters((lZ)var13_13, (At3)var10_10, var15_15);
            var12_12 /* !! */ .recycle();
            return var8_8 /* !! */ ;
        }
        var9_9 /* !! */  = "createMdcTheme requires the host context's theme to extend Theme.MaterialComponents".toString();
        var8_8 /* !! */  = new IllegalArgumentException((String)var9_9 /* !! */ );
        throw var8_8 /* !! */ ;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ ThemeParameters createMdcTheme$default(Context context, bp1_0 bp1_02, Vo0 vo0, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, int n3, Object object) {
        void var15_21;
        void var13_16;
        int n4 = n3;
        int n7 = n3 & 4;
        Vo0 vo02 = n7 != 0 ? ap1_0.a(context) : vo0;
        int bl7 = n4 & 8;
        boolean bl8 = true;
        if (bl7 != 0) {
            boolean bl9 = true;
        } else {
            boolean bl10 = bl2;
        }
        int n8 = n4 & 0x10;
        if (n8 != 0) {
            boolean bl11 = true;
        } else {
            boolean bl12 = bl3;
        }
        boolean bl13 = n4 & 0x20;
        if (!bl13) {
            bl8 = bl4;
        }
        bl13 = n4 & 0x40;
        boolean bl14 = false;
        bl13 = bl13 ? false : (boolean)bl5;
        if ((n4 &= 0x80) == 0) {
            bl14 = bl6;
        }
        vo0 = context;
        bl4 = var13_16;
        bl5 = var15_21;
        bl6 = bl8;
        n3 = bl13;
        return MdcTheme.createMdcTheme(context, bp1_02, vo02, (boolean)var13_16, (boolean)var15_21, bl8, bl13, bl14);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final Object getKey(Resources.Theme object) {
        Method method;
        boolean bl2 = sThemeGetKeyMethodFetched;
        Object object2 = null;
        if (!bl2) {
            bl2 = true;
            Object object3 = Resources.Theme.class;
            String string2 = "getKey";
            try {
                object3 = ((Class)object3).getDeclaredMethod(string2, null);
                ((AccessibleObject)object3).setAccessible(bl2);
                sThemeGetKeyMethod = object3;
            }
            catch (ReflectiveOperationException reflectiveOperationException) {}
            sThemeGetKeyMethodFetched = bl2;
        }
        if ((method = sThemeGetKeyMethod) == null) return null;
        if (method == null) return object2;
        try {
            object2 = method.invoke(object, null);
            return object2;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            return Unit.a;
        }
    }
}

