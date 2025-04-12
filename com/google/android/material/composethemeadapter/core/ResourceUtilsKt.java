/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.os.Build$VERSION
 *  android.util.TypedValue
 */
package com.google.android.material.composethemeadapter.core;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.TypedValue;
import com.google.android.material.composethemeadapter.core.FontFamilyWithWeight;
import com.google.android.material.composethemeadapter.core.R$styleable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ResourceUtilsKt {
    private static final ThreadLocal tempTypedValue;

    static {
        ThreadLocal threadLocal;
        tempTypedValue = threadLocal = new ThreadLocal();
    }

    private static final tv0_0 fontWeightOf(int n3) {
        tv0_0 tv0_02;
        int n4 = 150;
        if (n3 >= 0 && n3 < n4) {
            tv0_02 = tv0_0.b;
            tv0_02 = tv0_0.b;
        } else {
            int n7 = 250;
            if (n4 <= n3 && n3 < n7) {
                tv0_02 = tv0_0.b;
                tv0_02 = tv0_0.c;
            } else {
                n4 = 350;
                if (n7 <= n3 && n3 < n4) {
                    tv0_02 = tv0_0.b;
                    tv0_02 = tv0_0.d;
                } else {
                    n7 = 450;
                    if (n4 <= n3 && n3 < n7) {
                        tv0_02 = tv0_0.b;
                        tv0_02 = tv0_0.e;
                    } else {
                        n4 = 550;
                        if (n7 <= n3 && n3 < n4) {
                            tv0_02 = tv0_0.b;
                            tv0_02 = tv0_0.f;
                        } else {
                            n7 = 650;
                            if (n4 <= n3 && n3 < n7) {
                                tv0_02 = tv0_0.b;
                                tv0_02 = tv0_0.g;
                            } else {
                                n4 = 750;
                                if (n7 <= n3 && n3 < n4) {
                                    tv0_02 = tv0_0.b;
                                    tv0_02 = tv0_0.h;
                                } else {
                                    n7 = 850;
                                    if (n4 <= n3 && n3 < n7) {
                                        tv0_02 = tv0_0.b;
                                        tv0_02 = tv0_0.i;
                                    } else if (n7 <= n3 && n3 < (n4 = 1000)) {
                                        tv0_02 = tv0_0.b;
                                        tv0_02 = tv0_0.j;
                                    } else {
                                        tv0_02 = tv0_0.b;
                                        tv0_02 = tv0_0.e;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return tv0_02;
    }

    private static final int getComplexUnitCompat(TypedValue typedValue) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 22;
        int n7 = n3 > n4 ? vk2_2.a(typedValue) : typedValue.data & 0xF;
        return n7;
    }

    public static final long parseColor-mxwnekA(TypedArray typedArray, int n3, long l2) {
        String string2 = "$this$parseColor";
        Intrinsics.checkNotNullParameter(typedArray, string2);
        boolean bl2 = typedArray.hasValue(n3);
        if (bl2) {
            ct3.c(typedArray, n3);
            int n4 = typedArray.getColor(n3, 0);
            l2 = zx_0.c(n4);
        }
        return l2;
    }

    public static long parseColor-mxwnekA$default(TypedArray typedArray, int n3, long l2, int n4, Object object) {
        if ((n4 &= 2) != 0) {
            l2 = OX.l;
        }
        return ResourceUtilsKt.parseColor-mxwnekA(typedArray, n3, l2);
    }

    public static final t90_0 parseCornerSize(TypedArray typedArray, int n3) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        ThreadLocal threadLocal = tempTypedValue;
        Object object = threadLocal.get();
        if (object == null) {
            object = new Object();
            threadLocal.set(object);
        }
        object = (TypedValue)object;
        int n4 = typedArray.getValue(n3, object);
        int n7 = 0;
        t90_0 t90_02 = null;
        if (n4 != 0) {
            n4 = ((TypedValue)object).type;
            int n8 = 5;
            if (n4 != n8) {
                int n10 = 6;
                float f5 = 8.4E-45f;
                if (n4 == n10) {
                    n10 = 1065353216;
                    f5 = 1.0f;
                    f5 = object.getFraction(f5, f5);
                    t90_02 = new kC2(f5);
                }
            } else {
                n4 = Build.VERSION.SDK_INT;
                n7 = 22;
                n4 = n4 > n7 ? vk2_2.a(object) : ((TypedValue)object).data & 0xF;
                if (n4 != 0) {
                    n7 = 1;
                    if (n4 != n7) {
                        n4 = 0;
                        threadLocal = null;
                        int n14 = typedArray.getDimensionPixelSize(n3, 0);
                        float f6 = n14;
                        t90_02 = new eq2_1(f6);
                    } else {
                        int n15 = ((TypedValue)object).data;
                        float f7 = TypedValue.complexToFloat((int)n15);
                        t90_02 = new ys0_0(f7);
                    }
                } else {
                    int n16 = ((TypedValue)object).data;
                    float f8 = TypedValue.complexToFloat((int)n16);
                    t90_02 = new kC2(f8);
                }
            }
        }
        return t90_02;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final FontFamilyWithWeight parseFontFamily(TypedArray object, int n3) {
        void var0_2;
        int n4;
        void var3_17;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object object2 = tempTypedValue;
        Object t3 = ((ThreadLocal)object2).get();
        if (t3 == null) {
            TypedValue typedValue = new TypedValue();
            ((ThreadLocal)object2).set(typedValue);
        }
        TypedValue typedValue = (TypedValue)var3_17;
        n4 = object.getValue(n4, typedValue);
        object2 = null;
        if (n4 == 0) return object2;
        n4 = typedValue.type;
        int n7 = 3;
        if (n4 != n7) return object2;
        Object object3 = typedValue.string;
        String string2 = "sans-serif";
        n7 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
        int n8 = 2;
        if (n7 != 0) {
            object3 = RU0.b;
            FontFamilyWithWeight fontFamilyWithWeight = new FontFamilyWithWeight((RU0)object3, null, n8, null);
            return var0_2;
        }
        string2 = "sans-serif-thin";
        n7 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
        if (n7 != 0) {
            gz0_1 gz0_12 = RU0.b;
            object3 = tv0_0.k;
            return new FontFamilyWithWeight(gz0_12, (tv0_0)object3);
        }
        string2 = "sans-serif-light";
        n7 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
        if (n7 != 0) {
            gz0_1 gz0_13 = RU0.b;
            object3 = tv0_0.l;
            return new FontFamilyWithWeight(gz0_13, (tv0_0)object3);
        }
        string2 = "sans-serif-medium";
        n7 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
        if (n7 != 0) {
            gz0_1 gz0_14 = RU0.b;
            object3 = tv0_0.n;
            return new FontFamilyWithWeight(gz0_14, (tv0_0)object3);
        }
        string2 = "sans-serif-black";
        n7 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
        if (n7 != 0) {
            gz0_1 gz0_15 = RU0.b;
            object3 = tv0_0.p;
            return new FontFamilyWithWeight(gz0_15, (tv0_0)object3);
        }
        string2 = "serif";
        n7 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
        if (n7 != 0) {
            object3 = RU0.c;
            FontFamilyWithWeight fontFamilyWithWeight = new FontFamilyWithWeight((RU0)object3, null, n8, null);
            return var0_2;
        }
        string2 = "cursive";
        n7 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
        if (n7 != 0) {
            object3 = RU0.e;
            FontFamilyWithWeight fontFamilyWithWeight = new FontFamilyWithWeight((RU0)object3, null, n8, null);
            return var0_2;
        }
        string2 = "monospace";
        n4 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
        if (n4 != 0) {
            object3 = RU0.d;
            FontFamilyWithWeight fontFamilyWithWeight = new FontFamilyWithWeight((RU0)object3, null, n8, null);
            return var0_2;
        }
        n4 = typedValue.resourceId;
        if (n4 == 0) return object2;
        object3 = typedValue.string;
        string2 = "tv.string";
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        String string3 = "res/";
        n4 = (int)(StringsKt.c0((CharSequence)object3, string3, false) ? 1 : 0);
        if (n4 == 0) return object2;
        n4 = Build.VERSION.SDK_INT;
        int n10 = 23;
        if (n4 >= n10) {
            object3 = typedValue.string;
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            string2 = ".xml";
            n4 = (int)(StringsKt.J((CharSequence)object3, string2) ? 1 : 0);
            if (n4 != 0) {
                Resources resources = object.getResources();
                object3 = "resources";
                Intrinsics.checkNotNullExpressionValue(resources, (String)object3);
                n4 = typedValue.resourceId;
                RU0 rU0 = ResourceUtilsKt.parseXmlFontFamily(resources, n4);
                if (rU0 == null) return object2;
                object3 = new FontFamilyWithWeight(rU0, null, n8, null);
                return object3;
            }
        }
        n4 = typedValue.resourceId;
        object3 = ZU0.a(n4, null, 0, 14);
        int n14 = 1;
        LU0[] lU0Array = new LU0[n14];
        lU0Array[0] = object3;
        object3 = SU0.a(lU0Array);
        FontFamilyWithWeight fontFamilyWithWeight = new FontFamilyWithWeight((RU0)object3, null, n8, null);
        return var0_2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final q90_0 parseShapeAppearance(Context object, int n3, bp1_0 object2, q90_0 q90_02) {
        void var2_9;
        void var13_23;
        int n4;
        int n7;
        void var3_10;
        void var2_4;
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(var2_4, "layoutDirection");
        Intrinsics.checkNotNullParameter(var3_10, "fallbackShape");
        Object object3 = R$styleable.ComposeThemeAdapterShapeAppearance;
        TypedArray typedArray = object.obtainStyledAttributes(n7, (int[])object3);
        Intrinsics.checkNotNullExpressionValue(typedArray, "context.obtainStyledAttr\u2026meAdapterShapeAppearance)");
        n7 = R$styleable.ComposeThemeAdapterShapeAppearance_cornerSize;
        t90_0 t90_02 = ResourceUtilsKt.parseCornerSize(typedArray, n7);
        int n8 = R$styleable.ComposeThemeAdapterShapeAppearance_cornerSizeTopLeft;
        object3 = ResourceUtilsKt.parseCornerSize(typedArray, n8);
        int n10 = R$styleable.ComposeThemeAdapterShapeAppearance_cornerSizeTopRight;
        t90_0 t90_03 = ResourceUtilsKt.parseCornerSize(typedArray, n10);
        int n14 = R$styleable.ComposeThemeAdapterShapeAppearance_cornerSizeBottomLeft;
        t90_0 t90_04 = ResourceUtilsKt.parseCornerSize(typedArray, n14);
        int n15 = R$styleable.ComposeThemeAdapterShapeAppearance_cornerSizeBottomRight;
        t90_0 t90_05 = ResourceUtilsKt.parseCornerSize(typedArray, n15);
        bp1_0 bp1_02 = bp1_0.Rtl;
        int n16 = 1;
        if (var2_4 == bp1_02) {
            n4 = 1;
        } else {
            n4 = 0;
            Object var2_5 = null;
        }
        if (n4 != 0) {
            t90_0 t90_06 = t90_03;
        } else {
            Object object4 = object3;
        }
        if (n4 == 0) {
            object3 = t90_03;
        }
        t90_03 = n4 != 0 ? t90_05 : t90_04;
        if (n4 == 0) {
            t90_04 = t90_05;
        }
        n4 = R$styleable.ComposeThemeAdapterShapeAppearance_cornerFamily;
        n4 = typedArray.getInt(n4, 0);
        if (n4 != 0) {
            void var13_26;
            if (n4 != n16) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown cornerFamily set in ShapeAppearance");
                throw illegalArgumentException;
            }
            if (var13_23 == null) {
                if (t90_02 == null) {
                    t90_0 t90_07 = var3_10.a;
                } else {
                    t90_0 t90_08 = t90_02;
                }
            }
            if (object3 == null) {
                object3 = t90_02 == null ? (Object)var3_10.b : (Object)t90_02;
            }
            if (t90_04 == null) {
                t90_04 = t90_02 == null ? var3_10.c : t90_02;
            }
            if (t90_03 == null) {
                if (t90_02 == null) {
                    t90_02 = var3_10.d;
                }
            } else {
                t90_02 = t90_03;
            }
            hh0_0 hh0_02 = new q90_0((t90_0)var13_26, (t90_0)object3, t90_04, t90_02);
        } else {
            void var13_29;
            if (var13_23 == null) {
                if (t90_02 == null) {
                    t90_0 t90_09 = var3_10.a;
                } else {
                    t90_0 t90_010 = t90_02;
                }
            }
            if (object3 == null) {
                object3 = t90_02 == null ? (Object)var3_10.b : (Object)t90_02;
            }
            if (t90_04 == null) {
                t90_04 = t90_02 == null ? var3_10.c : t90_02;
            }
            if (t90_03 == null) {
                if (t90_02 == null) {
                    t90_02 = var3_10.d;
                }
            } else {
                t90_02 = t90_03;
            }
            rp2_0 rp2_02 = new q90_0((t90_0)var13_29, (t90_0)object3, t90_04, t90_02);
        }
        typedArray.recycle();
        return var2_9;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final xm3 parseTextAppearance(Context var0, int var1_1, Vo0 var2_2, boolean var3_3, RU0 var4_4) {
        block14: {
            block26: {
                block25: {
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    block20: {
                                        block19: {
                                            block18: {
                                                block13: {
                                                    block15: {
                                                        block17: {
                                                            block16: {
                                                                var5_5 /* !! */  = var0;
                                                                var6_6 = var2_2;
                                                                Intrinsics.checkNotNullParameter(var0, "context");
                                                                Intrinsics.checkNotNullParameter(var2_2, "density");
                                                                var7_7 /* !! */  = R$styleable.ComposeThemeAdapterTextAppearance;
                                                                var8_8 = var1_1;
                                                                var9_9 = var0.obtainStyledAttributes(var1_1, var7_7 /* !! */ );
                                                                Intrinsics.checkNotNullExpressionValue(var9_9, "context.obtainStyledAttr\u2026emeAdapterTextAppearance)");
                                                                var10_10 = R$styleable.ComposeThemeAdapterTextAppearance_android_textStyle;
                                                                var11_11 = -1;
                                                                var12_12 = var9_9.getInt(var10_10, var11_11);
                                                                var10_10 = R$styleable.ComposeThemeAdapterTextAppearance_android_textFontWeight;
                                                                var13_13 = var9_9.getInt(var10_10, var11_11);
                                                                var10_10 = R$styleable.ComposeThemeAdapterTextAppearance_android_typeface;
                                                                var14_14 = var9_9.getInt(var10_10, var11_11);
                                                                var10_10 = R$styleable.ComposeThemeAdapterTextAppearance_fontFamily;
                                                                var5_5 /* !! */  = ResourceUtilsKt.parseFontFamily(var9_9, var10_10);
                                                                if (var5_5 /* !! */  == null) {
                                                                    var10_10 = R$styleable.ComposeThemeAdapterTextAppearance_android_fontFamily;
                                                                    var5_5 /* !! */  = ResourceUtilsKt.parseFontFamily(var9_9, var10_10);
                                                                }
                                                                var15_15 = var5_5 /* !! */ ;
                                                                if (var3_3) {
                                                                    var16_16 = R$styleable.ComposeThemeAdapterTextAppearance_android_textColor;
                                                                    var17_17 = 0L;
                                                                    var19_18 = 2;
                                                                    var20_19 = ResourceUtilsKt.parseColor-mxwnekA$default(var9_9, var16_16, var17_17, var19_18, null);
lbl27:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var20_19 = OX.l;
                                                                ** while (true)
                                                                var22_20 = var20_19;
                                                                var11_11 = R$styleable.ComposeThemeAdapterTextAppearance_android_textSize;
                                                                var24_21 = 0L;
                                                                var5_5 /* !! */  = var9_9;
                                                                var26_22 = var2_2;
                                                                var27_23 = var14_14;
                                                                var14_14 = 4;
                                                                var16_16 = var13_13;
                                                                var28_24 = ResourceUtilsKt.parseTextUnit-lGoEivg$default(var9_9, var11_11, var2_2, var24_21, var14_14, null);
                                                                var30_25 = R$styleable.ComposeThemeAdapterTextAppearance_lineHeight;
                                                                var11_11 = R$styleable.ComposeThemeAdapterTextAppearance_android_lineHeight;
                                                                var13_13 = 0;
                                                                var14_14 = 4;
                                                                var20_19 = ResourceUtilsKt.parseTextUnit-lGoEivg$default(var9_9, var11_11, var2_2, var24_21, var14_14, null);
                                                                var31_26 = ResourceUtilsKt.parseTextUnit-lGoEivg(var9_9, var30_25, var6_6, var20_19);
                                                                var10_10 = 0;
                                                                var33_27 = 0.0f;
                                                                var5_5 /* !! */  = null;
                                                                var11_11 = 1;
                                                                if (var4_4 != null) break block15;
                                                                if (var15_15 != null) {
                                                                    var26_22 = var15_15.getFontFamily();
lbl53:
                                                                    // 4 sources

                                                                    while (true) {
                                                                        var34_28 = var26_22;
                                                                        break block13;
                                                                        break;
                                                                    }
                                                                }
                                                                if (var27_23 != var11_11) break block16;
                                                                var26_22 = RU0.b;
                                                                ** GOTO lbl53
                                                            }
                                                            var8_8 = 2;
                                                            if (var27_23 != var8_8) break block17;
                                                            var26_22 = RU0.c;
                                                            ** GOTO lbl53
                                                        }
                                                        var8_8 = 3;
                                                        if (var27_23 == var8_8) {
                                                            var26_22 = RU0.d;
                                                            ** continue;
                                                        }
                                                        var34_28 = null;
                                                        break block13;
                                                    }
                                                    var34_28 = var4_4;
                                                }
                                                var8_8 = var12_12 & 2;
                                                var30_25 = 0;
                                                var27_23 = var8_8 != 0 ? 1 : 0;
                                                var8_8 = 150;
                                                if (var16_16 >= 0 && var16_16 < var8_8) {
                                                    var7_7 /* !! */  = (int[])tv0_0.b;
lbl80:
                                                    // 11 sources

                                                    while (true) {
                                                        var35_31 /* !! */  = var7_7 /* !! */ ;
                                                        break block14;
                                                        break;
                                                    }
                                                }
                                                var36_29 = 250;
                                                var37_30 = 3.5E-43f;
                                                if (var8_8 > var16_16 || var16_16 >= var36_29) break block18;
                                                var7_7 /* !! */  = (int[])tv0_0.c;
                                                ** GOTO lbl80
                                            }
                                            var8_8 = 350;
                                            if (var36_29 > var16_16 || var16_16 >= var8_8) break block19;
                                            var7_7 /* !! */  = (int[])tv0_0.d;
                                            ** GOTO lbl80
                                        }
                                        var36_29 = 450;
                                        var37_30 = 6.3E-43f;
                                        if (var8_8 > var16_16 || var16_16 >= var36_29) break block20;
                                        var7_7 /* !! */  = (int[])tv0_0.e;
                                        ** GOTO lbl80
                                    }
                                    var8_8 = 550;
                                    if (var36_29 > var16_16 || var16_16 >= var8_8) break block21;
                                    var7_7 /* !! */  = (int[])tv0_0.f;
                                    ** GOTO lbl80
                                }
                                var36_29 = 650;
                                var37_30 = 9.11E-43f;
                                if (var8_8 > var16_16 || var16_16 >= var36_29) break block22;
                                var7_7 /* !! */  = (int[])tv0_0.g;
                                ** GOTO lbl80
                            }
                            var8_8 = 750;
                            if (var36_29 > var16_16 || var16_16 >= var8_8) break block23;
                            var7_7 /* !! */  = (int[])tv0_0.h;
                            ** GOTO lbl80
                        }
                        var36_29 = 850;
                        var37_30 = 1.191E-42f;
                        if (var8_8 > var16_16 || var16_16 >= var36_29) break block24;
                        var7_7 /* !! */  = (int[])tv0_0.i;
                        ** GOTO lbl80
                    }
                    if (var36_29 > var16_16 || var16_16 >= (var8_8 = 1000)) break block25;
                    var7_7 /* !! */  = (int[])tv0_0.j;
                    ** GOTO lbl80
                }
                if ((var11_11 &= var12_12) == 0) break block26;
                var7_7 /* !! */  = (int[])tv0_0.o;
                ** GOTO lbl80
            }
            if (var15_15 != null) {
                var7_7 /* !! */  = (int[])var15_15.getWeight();
                ** continue;
            }
            var35_31 /* !! */  = null;
        }
        var11_11 = R$styleable.ComposeThemeAdapterTextAppearance_android_fontFeatureSettings;
        var38_32 = var9_9.getString(var11_11);
        var36_29 = R$styleable.ComposeThemeAdapterTextAppearance_android_shadowColor;
        var6_6 = null;
        var39_33 = 0L;
        var13_13 = 2;
        var26_22 = var9_9;
        var41_34 = ResourceUtilsKt.parseColor-mxwnekA$default(var9_9, var36_29, var39_33, var13_13, null);
        var24_21 = OX.l;
        var36_29 = (int)OX.c(var41_34, var24_21);
        if (var36_29 == 0) {
            var10_10 = R$styleable.ComposeThemeAdapterTextAppearance_android_shadowDx;
            var33_27 = var9_9.getFloat(var10_10, 0.0f);
            var36_29 = R$styleable.ComposeThemeAdapterTextAppearance_android_shadowDy;
            var37_30 = var9_9.getFloat(var36_29, 0.0f);
            var14_14 = R$styleable.ComposeThemeAdapterTextAppearance_android_shadowRadius;
            var43_35 = var9_9.getFloat(var14_14, 0.0f);
            var45_37 = h72.a(var33_27, var37_30);
            var47_38 = var44_36 = new b13_0(var41_34, var45_37, var43_35);
        } else {
            var47_38 = null;
        }
        var10_10 = R$styleable.ComposeThemeAdapterTextAppearance_android_letterSpacing;
        var10_10 = (int)var9_9.hasValue(var10_10);
        var41_34 = 0x200000000L;
        if (var10_10 != 0) {
            var10_10 = R$styleable.ComposeThemeAdapterTextAppearance_android_letterSpacing;
            var33_27 = var9_9.getFloat(var10_10, 0.0f);
            var20_19 = Em3.i(var41_34, var33_27);
        } else {
            var33_27 = (float)false;
            var20_19 = Em3.i(var41_34, var33_27);
        }
        var7_7 /* !! */  = (int[])new nV0;
        var7_7 /* !! */ (var27_23);
        var5_5 /* !! */  = new xm3(var22_20, var28_24, (tv0_0)var35_31 /* !! */ , (nV0)var7_7 /* !! */ , (RU0)var34_28, var38_32, var20_19, var47_38, var31_26, 188176);
        var9_9.recycle();
        return var5_5 /* !! */ ;
    }

    public static final long parseTextUnit-lGoEivg(TypedArray typedArray, int n3, Vo0 vo0, long l2) {
        int n4;
        int n7;
        Intrinsics.checkNotNullParameter(typedArray, "$this$parseTextUnit");
        Intrinsics.checkNotNullParameter(vo0, "density");
        ThreadLocal threadLocal = tempTypedValue;
        Object object = threadLocal.get();
        if (object == null) {
            object = new Object();
            threadLocal.set(object);
        }
        if ((n7 = typedArray.getValue(n3, object = (TypedValue)object)) != 0 && (n7 = ((TypedValue)object).type) == (n4 = 5)) {
            long l3;
            int n8 = Build.VERSION.SDK_INT;
            int n10 = 22;
            n8 = n8 > n10 ? vk2_2.a(object) : ((TypedValue)object).data & 0xF;
            if (n8 != (n10 = 1)) {
                n10 = 2;
                if (n8 != n10) {
                    n8 = 0;
                    float f5 = typedArray.getDimension(n3, 0.0f);
                    l3 = vo0.O(f5);
                } else {
                    int n14 = ((TypedValue)object).data;
                    float f6 = TypedValue.complexToFloat((int)n14);
                    long l4 = 0x100000000L;
                    l3 = Em3.i(l4, f6);
                }
            } else {
                int n15 = ((TypedValue)object).data;
                float f7 = TypedValue.complexToFloat((int)n15);
                long l7 = 0x200000000L;
                l3 = Em3.i(l7, f7);
            }
            return l3;
        }
        return l2;
    }

    public static long parseTextUnit-lGoEivg$default(TypedArray typedArray, int n3, Vo0 vo0, long l2, int n4, Object object) {
        if ((n4 &= 4) != 0) {
            l2 = Dm3.c;
        }
        return ResourceUtilsKt.parseTextUnit-lGoEivg(typedArray, n3, vo0, l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final RU0 parseXmlFontFamily(Resources object, int n3) {
        Throwable throwable2;
        XmlResourceParser xmlResourceParser;
        block5: {
            Intrinsics.checkNotNullParameter(object, "<this>");
            xmlResourceParser = object.getXml(n3);
            ArrayList<Object> arrayList = "getXml(id)";
            Intrinsics.checkNotNullExpressionValue(xmlResourceParser, (String)((Object)arrayList));
            try {
                object = iv0_0.a(xmlResourceParser, (Resources)object);
            }
            catch (Throwable throwable2) {
                break block5;
            }
            boolean bl2 = object instanceof iV0$b;
            if (!bl2) {
                xmlResourceParser.close();
                return null;
            }
            object = (iV0$b)object;
            object = object.a;
            arrayList = "result.entries";
            Intrinsics.checkNotNullExpressionValue(object, (String)((Object)arrayList));
            int n4 = ((iV0$c[])object).length;
            arrayList = new ArrayList<Object>(n4);
            for (Object object2 : object) {
                int n7 = ((iV0$c)object2).f;
                int n8 = ((iV0$c)object2).b;
                tv0_0 tv0_02 = ResourceUtilsKt.fontWeightOf(n8);
                int n10 = ((iV0$c)object2).c;
                int n14 = 8;
                object2 = ZU0.a(n7, tv0_02, n10, n14);
                arrayList.add(object2);
            }
            object = new av0_0(arrayList);
            xmlResourceParser.close();
            return object;
        }
        xmlResourceParser.close();
        throw throwable2;
    }
}

