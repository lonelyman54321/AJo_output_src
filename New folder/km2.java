/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.graphics.Bitmap
 *  android.graphics.Shader
 *  android.graphics.drawable.BitmapDrawable
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class km2 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final im2 a(int var0, b30_0 var1_1, int var2_2) {
        block87: {
            block71: {
                block72: {
                    block73: {
                        block74: {
                            block75: {
                                block76: {
                                    block80: {
                                        block79: {
                                            block77: {
                                                block78: {
                                                    block68: {
                                                        var3_3 = var0;
                                                        var4_4 = var1_1;
                                                        var5_5 = AndroidCompositionLocals_androidKt.b;
                                                        var5_5 = (Context)var1_1.j((H30)var5_5);
                                                        var6_6 = AndroidCompositionLocals_androidKt.a;
                                                        var1_1.j(var6_6);
                                                        var6_6 = var5_5.getResources();
                                                        var7_7 = AndroidCompositionLocals_androidKt.d;
                                                        var7_7 = (LK2)var1_1.j((H30)var7_7);
                                                        synchronized (var7_7) {
                                                            try {
                                                                var8_8 = var7_7.a;
                                                            }
                                                            catch (Throwable var14_14) {}
                                                            var8_8 = var8_8.c(var0);
                                                            var8_8 = (TypedValue)var8_8;
                                                            var9_9 = 1;
                                                            var10_10 = 1.4E-45f;
                                                            if (var8_8 != null) break block68;
                                                            var8_8 = new TypedValue();
                                                            var6_6.getValue(var0, (TypedValue)var8_8, (boolean)var9_9);
                                                            var11_11 = var7_7.a;
                                                            var12_12 = var11_11.e(var0);
                                                            var13_13 = var11_11.c;
                                                            var13_13[var12_12];
                                                            var11_11 = var11_11.b;
                                                            var11_11[var12_12] = var0;
                                                            var13_13[var12_12] = var8_8;
                                                            ** break block70
                                                        }
                                                    }
                                                    var7_7 = var8_8.string;
                                                    var15_17 = 6;
                                                    var16_18 = 0;
                                                    var17_19 = 0.0f;
                                                    if (var7_7 == null || (var19_21 = StringsKt.J((CharSequence)var7_7, (String)(var18_20 = ".xml"))) != var9_9) break block71;
                                                    var20_22 = -1.091033E10f;
                                                    var4_4.K(-803040357);
                                                    var5_5 = var5_5.getTheme();
                                                    var21_23 = var8_8.changingConfigurations;
                                                    var8_8 = AndroidCompositionLocals_androidKt.c;
                                                    var8_8 = (Le1)var4_4.j((H30)var8_8);
                                                    var18_20 = new Le1$b((Resources.Theme)var5_5, var3_3);
                                                    var22_24 = (WeakReference)var8_8.a.get(var18_20);
                                                    if (var22_24 != null) {
                                                        var22_24 = (Le1$a)var22_24.get();
                                                    } else {
                                                        var23_25 = 0;
                                                        var22_24 = null;
                                                    }
                                                    if (var22_24 != null) break block72;
                                                    var14_15 = var6_6.getXml(var3_3);
                                                    var23_25 = var14_15.next();
                                                    while (var23_25 != (var24_26 = 2) && var23_25 != var9_9) {
                                                        var23_25 = var14_15.next();
                                                    }
                                                    if (var23_25 != var24_26) break block73;
                                                    var22_24 = var14_15.getName();
                                                    var23_25 = (int)Intrinsics.areEqual(var22_24, var25_27 = "vector");
                                                    if (var23_25 == 0) break block74;
                                                    var22_24 = Xml.asAttributeSet((XmlPullParser)var14_15);
                                                    var25_27 = new qj((XmlResourceParser)var14_15);
                                                    var26_28 /* !! */  = rj_0.a;
                                                    var26_28 /* !! */  = (int[])dt3.g((Resources)var6_6, (Resources.Theme)var5_5, (AttributeSet)var22_24, var26_28 /* !! */ );
                                                    var27_29 = var26_28 /* !! */ .getChangingConfigurations();
                                                    var25_27.b(var27_29);
                                                    var11_11 = "autoMirrored";
                                                    var27_29 = (int)dt3.f((XmlPullParser)var14_15, (String)var11_11);
                                                    var12_12 = 5;
                                                    var28_31 = 7.0E-45f;
                                                    if (var27_29 == 0) {
                                                        var29_32 = 0;
                                                        var30_33 = null;
                                                    } else {
                                                        var29_32 = var27_29 = (int)var26_28 /* !! */ .getBoolean(var12_12, false);
                                                    }
                                                    var27_29 = var26_28 /* !! */ .getChangingConfigurations();
                                                    var25_27.b(var27_29);
                                                    var12_12 = 0;
                                                    var28_31 = 0.0f;
                                                    var31_34 = null;
                                                    var32_35 = var25_27.a((TypedArray)var26_28 /* !! */ , "viewportWidth", 7, 0.0f);
                                                    var11_11 = "viewportHeight";
                                                    var16_18 = 8;
                                                    var17_19 = 1.1E-44f;
                                                    var33_36 = var25_27.a((TypedArray)var26_28 /* !! */ , (String)var11_11, var16_18, 0.0f);
                                                    cfr_temp_0 = var32_35 - 0.0f;
                                                    var27_29 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                                                    if (var27_29 <= 0) break block75;
                                                    cfr_temp_1 = var33_36 - 0.0f;
                                                    var27_29 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                                                    if (var27_29 <= 0) break block76;
                                                    var27_29 = 3;
                                                    var34_37 = var26_28 /* !! */ .getDimension(var27_29, 0.0f);
                                                    var16_18 = var26_28 /* !! */ .getChangingConfigurations();
                                                    var25_27.b(var16_18);
                                                    var17_19 = var26_28 /* !! */ .getDimension(var24_26, 0.0f);
                                                    var12_12 = var26_28 /* !! */ .getChangingConfigurations();
                                                    var25_27.b(var12_12);
                                                    var12_12 = (int)var26_28 /* !! */ .hasValue(var9_9);
                                                    if (var12_12 == 0) break block77;
                                                    var31_34 = new TypedValue();
                                                    var26_28 /* !! */ .getValue(var9_9, (TypedValue)var31_34);
                                                    var12_12 = var31_34.type;
                                                    if (var12_12 == var24_26) {
                                                        var35_38 = OX.l;
lbl117:
                                                        // 4 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    var31_34 = dt3.b((TypedArray)var26_28 /* !! */ , (XmlPullParser)var14_15, (Resources.Theme)var5_5);
                                                    var24_26 = var26_28 /* !! */ .getChangingConfigurations();
                                                    var25_27.b(var24_26);
                                                    if (var31_34 == null) break block78;
                                                    var12_12 = var31_34.getDefaultColor();
                                                    var35_38 = zx_0.c(var12_12);
                                                    ** GOTO lbl117
                                                }
                                                var35_38 = OX.l;
                                                ** GOTO lbl117
                                            }
                                            var35_38 = OX.l;
                                            ** while (true)
                                            var37_39 = var35_38;
                                            var12_12 = -1;
                                            var28_31 = 0.0f / 0.0f;
                                            var24_26 = var26_28 /* !! */ .getInt(var15_17, var12_12);
                                            var15_17 = var26_28 /* !! */ .getChangingConfigurations();
                                            var25_27.b(var15_17);
                                            var15_17 = 9;
                                            if (var24_26 == var12_12) ** GOTO lbl-1000
                                            if (var24_26 == var27_29) break block79;
                                            var12_12 = 5;
                                            var28_31 = 7.0E-45f;
                                            if (var24_26 == var12_12) ** GOTO lbl-1000
                                            if (var24_26 != var15_17) {
                                                switch (var24_26) {
                                                    default: lbl-1000:
                                                    // 3 sources

                                                    {
                                                        var39_40 = 5;
                                                        break;
                                                    }
                                                    case 16: {
                                                        var39_40 = 12;
                                                        break;
                                                    }
                                                    case 15: {
                                                        var12_12 = 14;
                                                        var28_31 = 2.0E-44f;
                                                        var39_40 = 14;
                                                        break;
                                                    }
                                                    case 14: {
                                                        var39_40 = 13;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                var39_40 = 9;
                                            }
                                            break block80;
                                        }
                                        var39_40 = 3;
                                    }
                                    var28_31 = var6_6.getDisplayMetrics().density;
                                    var40_41 = var34_37 / var28_31;
                                    var28_31 = var6_6.getDisplayMetrics().density;
                                    var41_42 = var17_19 / var28_31;
                                    var26_28 /* !! */ .recycle();
                                    var42_43 = 1;
                                    var31_34 = new Ke1$a(null, var40_41, var41_42, var32_35, var33_36, var37_39, var39_40, (boolean)var29_32, var42_43);
                                    var16_18 = 0;
                                    var17_19 = 0.0f;
                                    while (true) {
                                        block83: {
                                            block85: {
                                                block86: {
                                                    block84: {
                                                        block81: {
                                                            block82: {
                                                                block69: {
                                                                    if ((var24_26 = var14_15.getEventType()) == var9_9 || (var24_26 = var14_15.getDepth()) < var9_9 && (var24_26 = var14_15.getEventType()) == var27_29) break;
                                                                    var46_47 /* !! */  = var25_27.a;
                                                                    var47_48 = var46_47 /* !! */ .getEventType();
                                                                    var13_13 = "group";
                                                                    var9_9 = 2;
                                                                    var10_10 = 2.8E-45f;
                                                                    if (var47_48 == var9_9) break block81;
                                                                    if (var47_48 != var27_29) {
                                                                        var48_49 = var14_15;
                                                                        var4_4 = var5_5;
                                                                        var43_44 = var21_23;
                                                                        var44_45 = var8_8;
                                                                        var8_8 = var31_34;
                                                                        var45_46 = var18_20;
lbl190:
                                                                        // 5 sources

                                                                        while (true) {
                                                                            var9_9 = 0;
                                                                            var10_10 = 0.0f;
                                                                            var49_50 = null;
                                                                            var27_29 = 1;
                                                                            var15_17 = 13;
                                                                            break block69;
                                                                            break;
                                                                        }
                                                                    }
                                                                    var49_50 = var46_47 /* !! */ .getName();
                                                                    var9_9 = (int)Intrinsics.areEqual(var13_13, var49_50);
                                                                    if (var9_9 == 0) break block82;
                                                                    ++var16_18;
                                                                    var10_10 = 0.0f;
                                                                    var49_50 = null;
                                                                    for (var9_9 = 0; var9_9 < var16_18; ++var9_9) {
                                                                        var31_34.c();
                                                                        var13_13 = var31_34.i;
                                                                        var24_26 = var13_13.size();
                                                                        var47_48 = 1;
                                                                        var46_47 /* !! */  = (Ke1$a$a)var13_13.remove(var24_26 -= var47_48);
                                                                        var13_13 = ((Ke1$a$a)pp_0.a((int)var47_48, (ArrayList)var13_13)).j;
                                                                        var26_28 /* !! */  = (int[])new ca3_0;
                                                                        var11_11 = var46_47 /* !! */ .a;
                                                                        var17_19 = var46_47 /* !! */ .b;
                                                                        var50_52 = var46_47 /* !! */ .c;
                                                                        var45_46 = var18_20;
                                                                        var51_53 = var46_47 /* !! */ .d;
                                                                        var44_45 = var8_8;
                                                                        var52_54 = var46_47 /* !! */ .e;
                                                                        var43_44 = var21_23;
                                                                        var20_22 = var46_47 /* !! */ .f;
                                                                        var48_49 = var14_15;
                                                                        var53_56 = var46_47 /* !! */ .g;
                                                                        var54_57 = var31_34;
                                                                        var28_31 = var46_47 /* !! */ .h;
                                                                        var30_33 = var5_5;
                                                                        var5_5 = var46_47 /* !! */ .i;
                                                                        var46_47 /* !! */  = var46_47 /* !! */ .j;
                                                                        var55_58 = var26_28 /* !! */ ;
                                                                        var56_59 = var11_11;
                                                                        var57_60 = var17_19;
                                                                        var58_61 = var50_52;
                                                                        var59_62 = var51_53;
                                                                        var60_63 = var52_54;
                                                                        var61_64 = var20_22;
                                                                        var62_65 = var53_56;
                                                                        var63_66 = var28_31;
                                                                        var64_67 = var5_5;
                                                                        var26_28 /* !! */ ((String)var11_11, var17_19, var50_52, var51_53, var52_54, var20_22, var53_56, var28_31, (List)var5_5, (List)var46_47 /* !! */ );
                                                                        var13_13.add(var26_28 /* !! */ );
                                                                        var4_4 = var1_1;
                                                                        var5_5 = var30_33;
                                                                        var27_29 = 3;
                                                                    }
                                                                    var48_49 = var14_15;
                                                                    var43_44 = var21_23;
                                                                    var44_45 = var8_8;
                                                                    var45_46 = var18_20;
                                                                    var4_4 = var5_5;
                                                                    var8_8 = var31_34;
                                                                    var9_9 = 0;
                                                                    var10_10 = 0.0f;
                                                                    var49_50 = null;
                                                                    var27_29 = 1;
                                                                    var15_17 = 13;
                                                                    var16_18 = 0;
                                                                    var17_19 = 0.0f;
                                                                }
                                                                var19_21 = 0;
                                                                var51_53 = 0.0f;
                                                                var18_20 = null;
                                                                var24_26 = -1;
                                                                var47_48 = 9;
                                                                break block83;
                                                            }
                                                            var48_49 = var14_15;
                                                            var43_44 = var21_23;
                                                            var44_45 = var8_8;
                                                            var45_46 = var18_20;
                                                            var4_4 = var5_5;
                                                            var8_8 = var31_34;
                                                            ** GOTO lbl190
                                                        }
                                                        var48_49 = var14_15;
                                                        var30_33 = var5_5;
                                                        var43_44 = var21_23;
                                                        var44_45 = var8_8;
                                                        var54_57 = var31_34;
                                                        var45_46 = var18_20;
                                                        var14_15 = var46_47 /* !! */ .getName();
                                                        if (var14_15 == null) break block84;
                                                        var65_68 = var14_15.hashCode();
                                                        var5_5 = "";
                                                        var7_7 = var25_27.c;
                                                        var66_69 = -1649314686;
                                                        var52_54 = -4.6971976E-21f;
                                                        if (var65_68 == var66_69) ** GOTO lbl486
                                                        var66_69 = 3433509;
                                                        var52_54 = 4.811371E-39f;
                                                        var9_9 = 1065353216;
                                                        var10_10 = 1.0f;
                                                        if (var65_68 == var66_69) break block85;
                                                        var21_23 = 98629247;
                                                        var20_22 = 2.1155407E-35f;
                                                        if (var65_68 == var21_23 && (var3_3 = (int)var14_15.equals(var13_13)) != 0) break block86;
                                                    }
                                                    var8_8 = var54_57;
                                                    var4_4 = var30_33;
                                                    ** GOTO lbl190
                                                }
                                                var14_15 = rj_0.b;
                                                var4_4 = var30_33;
                                                var14_15 = dt3.g((Resources)var6_6, (Resources.Theme)var30_33, (AttributeSet)var22_24, (int[])var14_15);
                                                var21_23 = var14_15.getChangingConfigurations();
                                                var25_27.b(var21_23);
                                                var27_29 = 0;
                                                var11_11 = null;
                                                var57_60 = var25_27.a((TypedArray)var14_15, "rotation", 5, 0.0f);
                                                var58_61 = var14_15.getFloat(1, 0.0f);
                                                var21_23 = var14_15.getChangingConfigurations();
                                                var25_27.b(var21_23);
                                                var59_62 = var14_15.getFloat(2, 0.0f);
                                                var21_23 = var14_15.getChangingConfigurations();
                                                var25_27.b(var21_23);
                                                var60_63 = var25_27.a((TypedArray)var14_15, "scaleX", 3, var10_10);
                                                var61_64 = var25_27.a((TypedArray)var14_15, "scaleY", 4, var10_10);
                                                var62_65 = var25_27.a((TypedArray)var14_15, "translateX", 6, 0.0f);
                                                var66_69 = 7;
                                                var52_54 = 9.8E-45f;
                                                var63_66 = var25_27.a((TypedArray)var14_15, "translateY", var66_69, 0.0f);
                                                var20_22 = 0.0f;
                                                var7_7 = null;
                                                var8_8 = var14_15.getString(0);
                                                var21_23 = var14_15.getChangingConfigurations();
                                                var25_27.b(var21_23);
                                                var56_59 = var8_8 == null ? var5_5 : var8_8;
                                                var14_15.recycle();
                                                var64_67 = DA3.a;
                                                var54_57.c();
                                                var67_71 = 512;
                                                var55_58 = var14_15;
                                                var14_15 = new Ke1$a$a((String)var56_59, var57_60, var58_61, var59_62, var60_63, var61_64, var62_65, var63_66, (List)var64_67, var67_71);
                                                var8_8 = var54_57;
                                                var5_5 = var54_57.i;
                                                var5_5.add(var14_15);
                                                ** GOTO lbl190
                                            }
                                            var8_8 = var31_34;
                                            var4_4 = var30_33;
                                            var11_11 = "path";
                                            var3_3 = (int)var14_15.equals(var11_11);
                                            if (var3_3 != 0) ** break;
                                            ** continue;
                                            var14_15 = rj_0.c;
                                            var14_15 = dt3.g((Resources)var6_6, (Resources.Theme)var30_33, (AttributeSet)var22_24, (int[])var14_15);
                                            var27_29 = var14_15.getChangingConfigurations();
                                            var25_27.b(var27_29);
                                            var11_11 = "pathData";
                                            var27_29 = (int)dt3.f(var46_47 /* !! */ , (String)var11_11);
                                            if (var27_29 != 0) {
                                                var11_11 = null;
                                                var31_34 = var14_15.getString(0);
                                                var27_29 = var14_15.getChangingConfigurations();
                                                var25_27.b(var27_29);
                                                if (var31_34 == null) {
                                                    var56_59 = var5_5;
lbl357:
                                                    // 2 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                                var56_59 = var31_34;
                                                ** continue;
                                                var68_72 = 2;
                                                var11_11 = var14_15.getString(var68_72);
                                                var68_72 = var14_15.getChangingConfigurations();
                                                var25_27.b(var68_72);
                                                if (var11_11 == null) {
                                                    var5_5 = DA3.a;
lbl367:
                                                    // 2 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                                var5_5 = tn2.a((tn2)var7_7, (String)var11_11);
                                                ** continue;
                                                var69_74 = var5_5;
                                                var7_7 = var25_27.a;
                                                var5_5 = dt3.c((TypedArray)var14_15, (XmlPullParser)var7_7, (Resources.Theme)var4_4, "fillColor", 1);
                                                var21_23 = var14_15.getChangingConfigurations();
                                                var25_27.b(var21_23);
                                                var27_29 = 12;
                                                var60_63 = var25_27.a((TypedArray)var14_15, "fillAlpha", var27_29, var10_10);
                                                var7_7 = "strokeLineCap";
                                                var31_34 = var25_27.a;
                                                var15_17 = 8;
                                                var19_21 = -1;
                                                var51_53 = 0.0f / 0.0f;
                                                var21_23 = dt3.d((TypedArray)var14_15, (XmlPullParser)var31_34, (String)var7_7, var15_17, var19_21);
                                                var12_12 = var14_15.getChangingConfigurations();
                                                var25_27.b(var12_12);
                                                if (var21_23 != 0) {
                                                    var12_12 = 1;
                                                    var28_31 = 1.4E-45f;
                                                    if (var21_23 != var12_12) {
                                                        var12_12 = 2;
                                                        var28_31 = 2.8E-45f;
                                                        if (var21_23 != var12_12) lbl-1000:
                                                        // 2 sources

                                                        {
                                                            while (true) {
                                                                var70_75 = 0;
                                                                var64_67 = null;
                                                                break;
                                                            }
                                                        } else {
                                                            var70_75 = 2;
                                                        }
                                                    } else {
                                                        var12_12 = 2;
                                                        var28_31 = 2.8E-45f;
                                                        var70_75 = 1;
                                                    }
                                                } else {
                                                    var12_12 = 2;
                                                    var28_31 = 2.8E-45f;
                                                    ** continue;
                                                }
                                                var7_7 = "strokeLineJoin";
                                                var18_20 = var25_27.a;
                                                var24_26 = -1;
                                                var47_48 = 9;
                                                var21_23 = dt3.d((TypedArray)var14_15, (XmlPullParser)var18_20, (String)var7_7, var47_48, var24_26);
                                                var19_21 = var14_15.getChangingConfigurations();
                                                var25_27.b(var19_21);
                                                if (var21_23 != 0) {
                                                    var19_21 = 1;
                                                    var51_53 = 1.4E-45f;
                                                    var67_71 = var21_23 != var19_21 ? 2 : 1;
                                                } else {
                                                    var67_71 = 0;
                                                }
                                                var71_76 = var25_27.a((TypedArray)var14_15, "strokeMiterLimit", 10, var10_10);
                                                var18_20 = var25_27.a;
                                                var7_7 = dt3.c((TypedArray)var14_15, (XmlPullParser)var18_20, (Resources.Theme)var4_4, "strokeColor", 3);
                                                var19_21 = var14_15.getChangingConfigurations();
                                                var25_27.b(var19_21);
                                                var62_65 = var25_27.a((TypedArray)var14_15, "strokeAlpha", 11, var10_10);
                                                var63_66 = var25_27.a((TypedArray)var14_15, "strokeWidth", 4, var10_10);
                                                var72_77 = var25_27.a((TypedArray)var14_15, "trimPathEnd", 6, var10_10);
                                                var19_21 = 0;
                                                var51_53 = 0.0f;
                                                var18_20 = null;
                                                var73_78 = var25_27.a((TypedArray)var14_15, "trimPathOffset", 7, 0.0f);
                                                var74_79 = var25_27.a((TypedArray)var14_15, "trimPathStart", 5, 0.0f);
                                                var49_50 = "fillType";
                                                var11_11 = var25_27.a;
                                                var12_12 = 0;
                                                var28_31 = 0.0f;
                                                var31_34 = null;
                                                var15_17 = 13;
                                                var9_9 = dt3.d((TypedArray)var14_15, (XmlPullParser)var11_11, var49_50, var15_17, 0);
                                                var27_29 = var14_15.getChangingConfigurations();
                                                var25_27.b(var27_29);
                                                var14_15.recycle();
                                                var14_15 = var5_5.a;
                                                if (var14_15 != null || (var27_29 = var5_5.c) != 0) {
                                                    if (var14_15 != null) {
                                                        var75_80 = var5_5 = new ae_1((Shader)var14_15);
                                                    } else {
                                                        var68_72 = var5_5.c;
                                                        var76_81 = zx_0.c(var68_72);
                                                        var75_80 = var14_15 = new i93_0(var76_81);
                                                    }
                                                } else {
                                                    var59_62 = 0.0f;
                                                    var75_80 = null;
                                                }
                                                var14_15 = var7_7.a;
                                                if (var14_15 != null || (var68_72 = var7_7.c) != 0) {
                                                    if (var14_15 != null) {
                                                        var78_82 = var5_5 = new ae_1((Shader)var14_15);
                                                    } else {
                                                        var68_72 = var7_7.c;
                                                        var76_81 = zx_0.c(var68_72);
                                                        var78_82 = var14_15 = new i93_0(var76_81);
                                                    }
                                                } else {
                                                    var61_64 = 0.0f;
                                                    var78_82 = null;
                                                }
                                                if (var9_9 == 0) {
                                                    var79_83 = 0;
                                                    var58_61 = 0.0f;
                                                } else {
                                                    var79_83 = 1;
                                                    var58_61 = 1.4E-45f;
                                                }
                                                var8_8.c();
                                                var14_15 = var8_8.i;
                                                var68_72 = 1;
                                                var14_15 = ((Ke1$a$a)pp_0.a((int)var68_72, (ArrayList)var14_15)).j;
                                                var55_58 = var5_5;
                                                var5_5 = new ha3_0((String)var56_59, (List)var69_74, var79_83, (ZD)var75_80, var60_63, (ZD)var78_82, var62_65, var63_66, var70_75, var67_71, var71_76, var74_79, var72_77, var73_78);
                                                var14_15.add(var5_5);
                                                while (true) {
                                                    var9_9 = 0;
                                                    var10_10 = 0.0f;
                                                    var49_50 = null;
                                                    var27_29 = 1;
                                                    break;
                                                }
                                            } else {
                                                var14_15 = new IllegalArgumentException("No path data available");
                                                throw var14_15;
lbl486:
                                                // 1 sources

                                                var8_8 = var31_34;
                                                var4_4 = var30_33;
                                                var15_17 = 13;
                                                var19_21 = 0;
                                                var51_53 = 0.0f;
                                                var18_20 = null;
                                                var24_26 = -1;
                                                var47_48 = 9;
                                                if ((var3_3 = (int)var14_15.equals(var49_50 = "clip-path")) == 0) ** continue;
                                                var14_15 = rj_0.d;
                                                var14_15 = dt3.g((Resources)var6_6, (Resources.Theme)var30_33, (AttributeSet)var22_24, (int[])var14_15);
                                                var9_9 = var14_15.getChangingConfigurations();
                                                var25_27.b(var9_9);
                                                var9_9 = 0;
                                                var10_10 = 0.0f;
                                                var49_50 = null;
                                                var11_11 = var14_15.getString(0);
                                                var12_12 = var14_15.getChangingConfigurations();
                                                var25_27.b(var12_12);
                                                if (var11_11 == null) {
                                                    var55_58 = var5_5;
lbl507:
                                                    // 2 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                                var55_58 = var11_11;
                                                ** continue;
                                                var27_29 = 1;
                                                var5_5 = var14_15.getString(var27_29);
                                                var12_12 = var14_15.getChangingConfigurations();
                                                var25_27.b(var12_12);
                                                var5_5 = var5_5 == null ? DA3.a : tn2.a((tn2)var7_7, (String)var5_5);
                                                var14_15.recycle();
                                                var8_8.c();
                                                var70_75 = 512;
                                                var56_59 = null;
                                                var57_60 = 0.0f;
                                                var69_74 = null;
                                                var79_83 = 0;
                                                var58_61 = 0.0f;
                                                var59_62 = 1.0f;
                                                var60_63 = 1.0f;
                                                var61_64 = 0.0f;
                                                var78_82 = null;
                                                var62_65 = 0.0f;
                                                var14_15 = new Ke1$a$a((String)var55_58, 0.0f, 0.0f, 0.0f, var59_62, var60_63, 0.0f, 0.0f, (List)var5_5, var70_75);
                                                var5_5 = var8_8.i;
                                                var5_5.add(var14_15);
                                                ++var16_18;
                                            }
                                        }
                                        var48_49.next();
                                        var5_5 = var4_4;
                                        var31_34 = var8_8;
                                        var18_20 = var45_46;
                                        var8_8 = var44_45;
                                        var21_23 = var43_44;
                                        var14_15 = var48_49;
                                        var9_9 = 1;
                                        var10_10 = 1.4E-45f;
                                        var27_29 = 3;
                                        var15_17 = 9;
                                        var4_4 = var1_1;
                                    }
                                    var43_44 = var21_23;
                                    var44_45 = var8_8;
                                    var8_8 = var31_34;
                                    var45_46 = var18_20;
                                    var14_15 = var31_34.b();
                                    var65_68 = var21_23;
                                    var22_24 = new Le1$a((Ke1)var14_15, var21_23);
                                    var8_8 = var44_45;
                                    var14_15 = var44_45.a;
                                    var4_4 = new WeakReference(var22_24);
                                    var5_5 = var18_20;
                                    var14_15.put(var18_20, var4_4);
                                    break block72;
                                }
                                var4_4 = new StringBuilder();
                                var5_5 = var26_28 /* !! */ .getPositionDescription();
                                var4_4.append((String)var5_5);
                                var4_4.append("<VectorGraphic> tag requires viewportHeight > 0");
                                var4_4 = var4_4.toString();
                                var14_15 = new XmlPullParserException((String)var4_4);
                                throw var14_15;
                            }
                            var4_4 = new StringBuilder();
                            var5_5 = var26_28 /* !! */ .getPositionDescription();
                            var4_4.append((String)var5_5);
                            var4_4.append("<VectorGraphic> tag requires viewportWidth > 0");
                            var4_4 = var4_4.toString();
                            var14_15 = new XmlPullParserException((String)var4_4);
                            throw var14_15;
                        }
                        var14_15 = new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                        throw var14_15;
                    }
                    var14_15 = new XmlPullParserException("No start tag found");
                    throw var14_15;
                }
                var14_15 = var22_24.a;
                var4_4 = var1_1;
                var14_15 = GA3.b((Ke1)var14_15, var1_1);
                var1_1.E();
                break block87;
            }
            var9_9 = 0;
            var10_10 = 0.0f;
            var49_51 = null;
            var27_30 = true;
            var52_55 = -1.1069748E10f;
            var4_4.K(-802884675);
            var5_5 = var5_5.getTheme();
            var66_70 = var4_4.J(var7_7);
            var12_12 = var2_2 & 14;
            var15_17 = 6;
            var16_18 = 4;
            var17_19 = 5.6E-45f;
            if ((var12_12 ^= var15_17) > var16_18 && (var12_12 = (int)var4_4.c(var3_3)) != 0 || (var12_12 = var2_2 & 6) == var16_18) {
                var9_9 = 1;
                var10_10 = 1.4E-45f;
            }
            var68_73 = var4_4.J(var5_5) | (var66_70 |= var9_9);
            var8_8 = var1_1.v();
            if (var68_73 || var8_8 == (var5_5 = b30$a.a)) {
                var68_73 = false;
                var5_5 = null;
                var14_15 = var6_6.getDrawable(var3_3, null);
                var5_5 = "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable";
                Intrinsics.checkNotNull(var14_15, (String)var5_5);
                var14_15 = (BitmapDrawable)var14_15;
                var14_15 = var14_15.getBitmap();
                var8_8 = new ih_0((Bitmap)var14_15);
                var4_4.o(var8_8);
            }
            var8_8 = (hd1_0)var8_8;
            var14_15 = new my_0((hd1_0)var8_8);
            var1_1.E();
        }
        return var14_15;
        catch (Exception var14_16) {
            var5_5 = new StringBuilder("Error attempting to load resource: ");
            var5_5.append(var7_7);
            var5_5 = var5_5.toString();
            var4_4 = new RuntimeException((String)var5_5, var14_16);
            throw var4_4;
        }
lbl-1000:
        // 1 sources

        {
            throw var14_14;
        }
    }
}

