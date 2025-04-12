/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.XmlResourceParser
 *  android.graphics.Color
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.StateSet
 *  android.util.TypedValue
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.R$attr;
import androidx.core.R$styleable;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class fZ {
    public static final ThreadLocal a;

    static {
        ThreadLocal threadLocal;
        a = threadLocal = new ThreadLocal();
    }

    public static ColorStateList a(Resources object, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int n3;
        int n4;
        int n7;
        AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
        while ((n7 = xmlResourceParser.next()) != (n4 = 2) && n7 != (n3 = 1)) {
        }
        if (n7 == n4) {
            return fZ.b(object, xmlResourceParser, attributeSet, theme);
        }
        object = new XmlPullParserException("No start tag found");
        throw object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ColorStateList b(Resources var0, XmlResourceParser var1_1, AttributeSet var2_2, Resources.Theme var3_3) {
        block45: {
            var4_4 /* !! */  = var0;
            var5_5 /* !! */  = var2_2;
            var6_6 /* !! */  = var3_3;
            var7_7 = var1_1.getName();
            var9_9 = (int)var7_7.equals(var8_8 = "selector");
            if (var9_9 == 0) break block45;
            var10_10 = var1_1.getDepth();
            var9_9 = 1;
            var11_11 = 1.4E-45f;
            var10_10 += var9_9;
            var12_12 = 20;
            var13_13 /* !! */  = new int[var12_12][];
            var14_14 /* !! */  = new int[var12_12];
            var15_15 = 0;
            var16_16 = 0.0f;
            var17_17 /* !! */  = null;
            var18_18 = 0;
            while ((var19_19 = var1_1.next()) != var9_9) {
                block46: {
                    block48: {
                        block44: {
                            block49: {
                                block50: {
                                    block51: {
                                        block47: {
                                            var20_20 = var1_1.getDepth();
                                            if (var20_20 < var10_10) {
                                                var21_21 = 3;
                                                var22_22 = 4.2E-45f;
                                                if (var19_19 == var21_21) break;
                                            }
                                            var21_21 = 2;
                                            var22_22 = 2.8E-45f;
                                            if (var19_19 != var21_21 || var20_20 > var10_10 || (var19_19 = (int)(var23_23 = var1_1.getName()).equals(var24_24 = "item")) == 0) break block46;
                                            var23_23 = R$styleable.ColorStateListItem;
                                            var23_23 = var6_6 /* !! */  == null ? var4_4 /* !! */ .obtainAttributes(var5_5 /* !! */ , (int[])var23_23) : var6_6 /* !! */ .obtainStyledAttributes(var5_5 /* !! */ , (int[])var23_23, 0, 0);
                                            var20_20 = R$styleable.ColorStateListItem_android_color;
                                            var27_27 = -1;
                                            var28_28 = 0.0f / 0.0f;
                                            var20_20 = var23_23.getResourceId(var20_20, var27_27);
                                            var29_29 = -65281;
                                            var30_30 = 0.0f / 0.0f;
                                            var31_31 = 31;
                                            var32_32 = 4.3E-44f;
                                            if (var20_20 == var27_27) ** GOTO lbl-1000
                                            var33_33 = fZ.a;
                                            var34_34 = (TypedValue)var33_33.get();
                                            if (var34_34 == null) {
                                                var34_34 = new TypedValue();
                                                var33_33.set(var34_34);
                                            }
                                            var4_4 /* !! */ .getValue(var20_20, var34_34, (boolean)var9_9);
                                            var27_27 = var34_34.type;
                                            var35_35 = 28;
                                            var36_36 = 3.9E-44f;
                                            if (var27_27 < var35_35 || var27_27 > var31_31) {
                                                var24_24 = var4_4 /* !! */ .getXml(var20_20);
                                                var24_24 = fZ.a(var4_4 /* !! */ , (XmlResourceParser)var24_24, var6_6 /* !! */ );
                                                try {
                                                    var20_20 = var24_24.getDefaultColor();
                                                }
                                                catch (Exception v0) {
                                                    var20_20 = R$styleable.ColorStateListItem_android_color;
                                                    var20_20 = var23_23.getColor(var20_20, var29_29);
                                                }
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var20_20 = R$styleable.ColorStateListItem_android_color;
                                                var20_20 = var23_23.getColor(var20_20, var29_29);
                                            }
                                            var27_27 = R$styleable.ColorStateListItem_android_alpha;
                                            var27_27 = (int)var23_23.hasValue(var27_27);
                                            var29_29 = 1065353216;
                                            var30_30 = 1.0f;
                                            if (var27_27 != 0) {
                                                var27_27 = R$styleable.ColorStateListItem_android_alpha;
                                                var28_28 = var23_23.getFloat(var27_27, var30_30);
                                            } else {
                                                var27_27 = R$styleable.ColorStateListItem_alpha;
                                                if ((var27_27 = (int)var23_23.hasValue(var27_27)) != 0) {
                                                    var27_27 = R$styleable.ColorStateListItem_alpha;
                                                    var28_28 = var23_23.getFloat(var27_27, var30_30);
                                                } else {
                                                    var27_27 = 1065353216;
                                                    var28_28 = 1.0f;
                                                }
                                            }
                                            var35_35 = Build.VERSION.SDK_INT;
                                            var21_21 = -1082130432;
                                            var22_22 = -1.0f;
                                            if (var35_35 < var31_31) ** GOTO lbl-1000
                                            var31_31 = R$styleable.ColorStateListItem_android_lStar;
                                            if ((var31_31 = (int)var23_23.hasValue(var31_31)) != 0) {
                                                var31_31 = R$styleable.ColorStateListItem_android_lStar;
                                                var22_22 = var23_23.getFloat(var31_31, var22_22);
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var31_31 = R$styleable.ColorStateListItem_lStar;
                                                var22_22 = var23_23.getFloat(var31_31, var22_22);
                                            }
                                            var23_23.recycle();
                                            var19_19 = var2_2.getAttributeCount();
                                            var37_37 = new int[var19_19];
                                            var9_9 = 0;
                                            var11_11 = 0.0f;
                                            var8_8 = null;
                                            var36_36 = 0.0f;
                                            var34_34 = null;
                                            for (var35_35 = 0; var35_35 < var19_19; ++var35_35) {
                                                var29_29 = var5_5 /* !! */ .getAttributeNameResource(var35_35);
                                                var15_15 = 16843173;
                                                var16_16 = 2.3694738E-38f;
                                                if (var29_29 != var15_15) {
                                                    var15_15 = 16843551;
                                                    var16_16 = 2.3695797E-38f;
                                                    if (var29_29 != var15_15 && var29_29 != (var15_15 = R$attr.alpha) && var29_29 != (var15_15 = R$attr.lStar)) {
                                                        var15_15 = var9_9 + 1;
                                                        var38_38 = 0;
                                                        var39_39 = 0.0f;
                                                        var4_4 /* !! */  = null;
                                                        var40_40 = var5_5 /* !! */ .getAttributeBooleanValue(var35_35, false);
                                                        if (!var40_40) {
                                                            var29_29 = -var29_29;
                                                        }
                                                        var37_37[var9_9] = var29_29;
                                                        var9_9 = var15_15;
                                                    }
                                                }
                                                var4_4 /* !! */  = var0;
                                                var15_15 = 0;
                                                var16_16 = 0.0f;
                                                var17_17 /* !! */  = null;
                                                var29_29 = 1065353216;
                                                var30_30 = 1.0f;
                                            }
                                            var4_4 /* !! */  = (Resources)StateSet.trimStateSet((int[])var37_37, (int)var9_9);
                                            var9_9 = 1120403456;
                                            var11_11 = 100.0f;
                                            var15_15 = 0;
                                            var16_16 = 0.0f;
                                            var17_17 /* !! */  = null;
                                            cfr_temp_0 = var22_22 - 0.0f;
                                            var19_19 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                            if (var19_19 >= 0 && (var19_19 = (int)(var22_22 == var11_11 ? 0 : (var22_22 < var11_11 ? -1 : 1))) <= 0) {
                                                var19_19 = 1;
                                                var41_41 = 1.4E-45f;
lbl130:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var19_19 = 0;
                                            var41_41 = 0.0f;
                                            var23_23 = null;
                                            ** continue;
                                            var29_29 = 1065353216;
                                            var30_30 = 1.0f;
                                            var31_31 = (int)(var28_28 == var30_30 ? 0 : (var28_28 > var30_30 ? 1 : -1));
                                            if (var31_31 != 0 || var19_19 != 0) break block47;
                                            var17_17 /* !! */  = var4_4 /* !! */ ;
                                            var25_25 = var10_10;
                                            var26_26 = 1;
                                            break block48;
                                        }
                                        var30_30 = (float)Color.alpha((int)var20_20) * var28_28;
                                        var28_28 = 0.5f;
                                        var27_27 = (int)(var30_30 + var28_28);
                                        var29_29 = 255;
                                        var30_30 = 3.57E-43f;
                                        var31_31 = 0;
                                        var32_32 = 0.0f;
                                        var37_37 = null;
                                        var27_27 = PK1.b(var27_27, 0, var29_29);
                                        if (var19_19 == 0) break block49;
                                        var23_23 = gK.a(var20_20);
                                        var24_24 = qe3_0.k;
                                        var30_30 = var23_23.b;
                                        var42_42 = var30_30;
                                        var44_43 = 1.0;
                                        cfr_temp_1 = var42_42 - var44_43;
                                        var46_44 /* !! */  = (double)(cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1));
                                        if (var46_44 /* !! */  < 0 || (var46_44 /* !! */  = (cfr_temp_2 = (var42_42 = (double)(var31_31 = Math.round(var22_22))) - (var44_43 = 0.0)) == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1)) <= 0 || (var46_44 /* !! */  = (cfr_temp_3 = (var42_42 = (double)(var31_31 = Math.round(var22_22))) - (var44_43 = 100.0)) == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1)) >= 0) break block50;
                                        var41_41 = var23_23.a;
                                        cfr_temp_4 = var41_41 - 0.0f;
                                        var31_31 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1));
                                        if (var31_31 < 0) {
                                            var19_19 = 0;
                                            var41_41 = 0.0f;
                                            var23_23 = null;
                                        } else {
                                            var31_31 = 1135869952;
                                            var32_32 = 360.0f;
                                            var41_41 = Math.min(var32_32, var41_41);
                                        }
                                        var36_36 = var30_30;
                                        var31_31 = 0;
                                        var32_32 = 0.0f;
                                        var37_37 = null;
                                        var40_40 = true;
                                        var47_45 = 0.0f;
                                        while ((var50_48 = (cfr_temp_5 = (var48_46 = Math.abs(var47_45 - var30_30)) - (var49_47 = 0.4f)) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1)) >= 0) {
                                            var50_48 = 1148846080;
                                            var48_46 = 1000.0f;
                                            var49_47 = 1000.0f;
                                            var51_49 = 0.0f;
                                            var52_50 = 100.0f;
                                            var53_51 = null;
                                            while (true) {
                                                var54_52 = Math.abs(var51_49 - var52_50);
                                                var55_53 = 0.01f;
                                                var56_54 = 2.0f;
                                                var57_55 /* !! */  = (float)(var54_52 == var55_53 ? 0 : (var54_52 > var55_53 ? 1 : -1));
                                                if (var57_55 /* !! */  <= 0) break;
                                                var54_52 = (var52_50 - var51_49) / var56_54;
                                                var16_16 = var54_52 + var51_49;
                                                var8_8 = gK.b(var16_16, var36_36, var41_41);
                                                var5_5 /* !! */  = qe3_0.k;
                                                var58_56 = var8_8.c((qe3_0)var5_5 /* !! */ );
                                                var11_11 = os_2.d(Color.red((int)var58_56));
                                                var59_57 = os_2.d(Color.green((int)var58_56));
                                                var60_58 = Color.blue((int)var58_56);
                                                var61_59 = os_2.d(var60_58);
                                                var62_60 /* !! */  = os_2.d;
                                                var26_26 = 1;
                                                var62_60 /* !! */  = (float[][])var62_60 /* !! */ [var26_26];
                                                var63_61 /* !! */  = (float)var62_60 /* !! */ [0];
                                                var11_11 *= var63_61 /* !! */ ;
                                                var63_61 /* !! */  = (float)var62_60 /* !! */ [var26_26];
                                                var59_57 = var59_57 * var63_61 /* !! */  + var11_11;
                                                var9_9 = 2;
                                                var64_62 = (float)var62_60 /* !! */ [var9_9];
                                                var11_11 = (var61_59 = var61_59 * var64_62 + var59_57) / (var64_62 = 100.0f);
                                                cfr_temp_6 = var11_11 - (var59_57 = 0.008856452f);
                                                var25_25 = (int)(cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 < 0.0f ? -1 : 1));
                                                if (var25_25 <= 0) {
                                                    var59_57 = 903.2963f;
                                                    var11_11 *= var59_57;
                                                    var25_25 = var10_10;
                                                } else {
                                                    var25_25 = var10_10;
                                                    var65_63 = Math.cbrt(var11_11);
                                                    var67_64 = (float)var65_63 * 116.0f;
                                                    var10_10 = 1098907648;
                                                    var68_65 = 16.0f;
                                                    var11_11 = var67_64 - var68_65;
                                                }
                                                var67_64 = Math.abs(var22_22 - var11_11);
                                                var68_65 = 0.2f;
                                                var10_10 = (int)(var67_64 == var68_65 ? 0 : (var67_64 < var68_65 ? -1 : 1));
                                                if (var10_10 < 0) {
                                                    var5_5 /* !! */  = gK.a(var58_56);
                                                    var68_65 = var5_5 /* !! */ .c;
                                                    var61_59 = var67_64;
                                                    var67_64 = var5_5 /* !! */ .b;
                                                    var6_6 /* !! */  = gK.b(var68_65, var67_64, var41_41);
                                                    var68_65 = var5_5 /* !! */ .d;
                                                    var69_66 = var16_16;
                                                    var16_16 = var6_6 /* !! */ .d;
                                                    var68_65 -= var16_16;
                                                    var16_16 = var5_5 /* !! */ .e;
                                                    var63_61 /* !! */  = var41_41;
                                                    var41_41 = var6_6 /* !! */ .e;
                                                    var16_16 -= var41_41;
                                                    var41_41 = var5_5 /* !! */ .f;
                                                    var67_64 = var6_6 /* !! */ .f;
                                                    var41_41 -= var67_64;
                                                    var68_65 *= var68_65;
                                                    var16_16 = var16_16 * var16_16 + var68_65;
                                                    var41_41 = var41_41 * var41_41 + var16_16;
                                                    var65_63 = Math.sqrt(var41_41);
                                                    var17_17 /* !! */  = var4_4 /* !! */ ;
                                                    var23_23 = var5_5 /* !! */ ;
                                                    var70_67 = Math.pow(var65_63, 0.63);
                                                    var65_63 = 1.41;
                                                    var39_39 = (float)(var70_67 *= var65_63);
                                                    var58_56 = 1065353216;
                                                    var72_68 = 1.0f;
                                                    cfr_temp_7 = var39_39 - var72_68;
                                                    var73_69 = (int)(cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 < 0.0f ? -1 : 1));
                                                    if (var73_69 <= 0) {
                                                        var49_47 = var39_39;
                                                        var53_51 = var5_5 /* !! */ ;
                                                        var48_46 = var61_59;
                                                    }
lbl262:
                                                    // 4 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                                var69_66 = var16_16;
                                                var63_61 /* !! */  = var41_41;
                                                var58_56 = 1065353216;
                                                var72_68 = 1.0f;
                                                var17_17 /* !! */  = var4_4 /* !! */ ;
                                                ** continue;
                                                var38_38 = 0;
                                                var39_39 = 0.0f;
                                                var4_4 /* !! */  = null;
                                                cfr_temp_8 = var48_46 - 0.0f;
                                                var73_69 = (int)(cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 > 0.0f ? 1 : -1));
                                                if (var73_69 == 0 && (var73_69 = (int)((cfr_temp_9 = var49_47 - 0.0f) == 0.0f ? 0 : (cfr_temp_9 > 0.0f ? 1 : -1))) == 0) lbl-1000:
                                                // 2 sources

                                                {
                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                                var73_69 = (int)(var11_11 == var22_22 ? 0 : (var11_11 < var22_22 ? -1 : 1));
                                                if (var73_69 < 0) {
                                                    var51_49 = var69_66;
                                                } else {
                                                    var52_50 = var69_66;
                                                }
                                                var5_5 /* !! */  = var2_2;
                                                var6_6 /* !! */  = var3_3;
                                                var4_4 /* !! */  = var17_17 /* !! */ ;
                                                var10_10 = var25_25;
                                                var41_41 = var63_61 /* !! */ ;
                                                var9_9 = 1120403456;
                                                var11_11 = 100.0f;
                                                var15_15 = 0;
                                                var16_16 = 0.0f;
                                                var17_17 /* !! */  = null;
                                            }
                                            var17_17 /* !! */  = var4_4 /* !! */ ;
                                            var25_25 = var10_10;
                                            var63_61 /* !! */  = var41_41;
                                            var38_38 = 0;
                                            var39_39 = 0.0f;
                                            var4_4 /* !! */  = null;
                                            var58_56 = 1065353216;
                                            var72_68 = 1.0f;
                                            var64_62 = 100.0f;
                                            var26_26 = 1;
                                            ** continue;
                                            var6_6 /* !! */  = var53_51;
                                            if (var40_40) {
                                                if (var53_51 != null) {
                                                    var38_38 = var53_51.c((qe3_0)var24_24);
lbl309:
                                                    // 4 sources

                                                    while (true) {
                                                        var20_20 = var38_38;
                                                        break block44;
                                                        break;
                                                    }
                                                }
                                                var67_64 = (var30_30 - var47_45) / var56_54;
                                                var36_36 = var67_64 + var47_45;
                                                var5_5 /* !! */  = var2_2;
                                                var6_6 /* !! */  = var3_3;
                                                var4_4 /* !! */  = var17_17 /* !! */ ;
                                                var10_10 = var25_25;
                                                var41_41 = var63_61 /* !! */ ;
                                                var9_9 = 1120403456;
                                                var11_11 = 100.0f;
                                                var15_15 = 0;
                                                var16_16 = 0.0f;
                                                var17_17 /* !! */  = null;
                                                var40_40 = false;
                                                continue;
                                            }
                                            if (var53_51 == null) {
                                                var30_30 = var36_36;
                                            } else {
                                                var37_37 = var53_51;
                                                var47_45 = var36_36;
                                            }
                                            var67_64 = (var30_30 - var47_45) / var56_54;
                                            var36_36 = var67_64 + var47_45;
                                            var5_5 /* !! */  = var2_2;
                                            var6_6 /* !! */  = var3_3;
                                            var4_4 /* !! */  = var17_17 /* !! */ ;
                                            var10_10 = var25_25;
                                            var41_41 = var63_61 /* !! */ ;
                                            var9_9 = 1120403456;
                                            var11_11 = 100.0f;
                                            var15_15 = 0;
                                            var16_16 = 0.0f;
                                            var17_17 /* !! */  = null;
                                        }
                                        var17_17 /* !! */  = var4_4 /* !! */ ;
                                        var25_25 = var10_10;
                                        var26_26 = 1;
                                        if (var37_37 != null) break block51;
                                        var38_38 = os_2.c(var22_22);
                                        ** GOTO lbl309
                                    }
                                    var38_38 = var37_37.c((qe3_0)var24_24);
                                    ** GOTO lbl309
                                }
                                var17_17 /* !! */  = var4_4 /* !! */ ;
                                var25_25 = var10_10;
                                var26_26 = 1;
                                var38_38 = os_2.c(var22_22);
                                ** continue;
                            }
                            var17_17 /* !! */  = var4_4 /* !! */ ;
                            var25_25 = var10_10;
                            var26_26 = 1;
                        }
                        var39_39 = 2.3509886E-38f;
                        var38_38 = 0xFFFFFF & var20_20;
                        var58_56 = var27_27 << 24;
                        var20_20 = var38_38 | var58_56;
                    }
                    var38_38 = var18_18 + 1;
                    var58_56 = var14_14 /* !! */ .length;
                    var73_69 = 8;
                    var67_64 = 1.1E-44f;
                    var10_10 = 4;
                    var68_65 = 5.6E-45f;
                    if (var38_38 > var58_56) {
                        if (var18_18 <= var10_10) {
                            var58_56 = 8;
                            var72_68 = 1.1E-44f;
                        } else {
                            var58_56 = var18_18 * 2;
                        }
                        var5_5 /* !! */  = (AttributeSet)new int[var58_56];
                        var9_9 = 0;
                        var11_11 = 0.0f;
                        var8_8 = null;
                        System.arraycopy(var14_14 /* !! */ , 0, var5_5 /* !! */ , 0, var18_18);
                        var14_14 /* !! */  = (int[])var5_5 /* !! */ ;
                    }
                    var14_14 /* !! */ [var18_18] = var20_20;
                    var58_56 = var13_13 /* !! */ .length;
                    if (var38_38 > var58_56) {
                        var5_5 /* !! */  = var13_13 /* !! */ .getClass().getComponentType();
                        if (var18_18 > var10_10) {
                            var73_69 = var18_18 * 2;
                        }
                        var5_5 /* !! */  = (Object[])Array.newInstance(var5_5 /* !! */ , var73_69);
                        var73_69 = 0;
                        var67_64 = 0.0f;
                        var6_6 /* !! */  = null;
                        System.arraycopy(var13_13 /* !! */ , 0, var5_5 /* !! */ , 0, var18_18);
                        var13_13 /* !! */  = (int[][])var5_5 /* !! */ ;
                    }
                    var13_13 /* !! */ [var18_18] = (int[])var17_17 /* !! */ ;
                    var13_13 /* !! */  = var13_13 /* !! */ ;
                    var5_5 /* !! */  = var2_2;
                    var6_6 /* !! */  = var3_3;
                    var18_18 = var38_38;
                    var10_10 = var25_25;
                    var9_9 = 1;
                    var11_11 = 1.4E-45f;
                    var15_15 = 0;
                    var16_16 = 0.0f;
                    var17_17 /* !! */  = null;
                    var4_4 /* !! */  = var0;
                    continue;
                }
                var25_25 = var10_10;
                var26_26 = 1;
                var4_4 /* !! */  = var0;
                var5_5 /* !! */  = var2_2;
                var6_6 /* !! */  = var3_3;
                var9_9 = 1;
                var11_11 = 1.4E-45f;
                var15_15 = 0;
                var16_16 = 0.0f;
                var17_17 /* !! */  = null;
            }
            var4_4 /* !! */  = (Resources)new int[var18_18];
            var5_5 /* !! */  = (AttributeSet)new int[var18_18][];
            System.arraycopy(var14_14 /* !! */ , 0, var4_4 /* !! */ , 0, var18_18);
            System.arraycopy(var13_13 /* !! */ , 0, var5_5 /* !! */ , 0, var18_18);
            var6_6 /* !! */  = new ColorStateList((int[][])var5_5 /* !! */ , (int[])var4_4 /* !! */ );
            return var6_6 /* !! */ ;
        }
        var5_5 /* !! */  = new StringBuilder();
        var6_6 /* !! */  = var1_1.getPositionDescription();
        var5_5 /* !! */ .append((String)var6_6 /* !! */ );
        var5_5 /* !! */ .append(": invalid color state list tag ");
        var5_5 /* !! */ .append(var7_7);
        var5_5 /* !! */  = var5_5 /* !! */ .toString();
        var4_4 /* !! */  = new XmlPullParserException((String)var5_5 /* !! */ );
        throw var4_4 /* !! */ ;
    }
}

