/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.color.utilities.ContrastCurve;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MathUtils;
import com.google.android.material.color.utilities.TonalPalette;
import com.google.android.material.color.utilities.ToneDeltaPair;
import com.google.android.material.color.utilities.TonePolarity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

public final class DynamicColor {
    public final Function background;
    public final ContrastCurve contrastCurve;
    private final HashMap hctCache;
    public final boolean isBackground;
    public final String name;
    public final Function opacity;
    public final Function palette;
    public final Function secondBackground;
    public final Function tone;
    public final Function toneDeltaPair;

    public DynamicColor(String string2, Function function, Function function2, boolean bl2, Function function3, Function function4, ContrastCurve contrastCurve, Function function5) {
        HashMap hashMap;
        this.hctCache = hashMap = new HashMap();
        this.name = string2;
        this.palette = function;
        this.tone = function2;
        this.isBackground = bl2;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = null;
    }

    public DynamicColor(String string2, Function function, Function function2, boolean bl2, Function function3, Function function4, ContrastCurve contrastCurve, Function function5, Function function6) {
        HashMap hashMap;
        this.hctCache = hashMap = new HashMap();
        this.name = string2;
        this.palette = function;
        this.tone = function2;
        this.isBackground = bl2;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = function6;
    }

    public static /* synthetic */ Double a(Hct hct, DynamicScheme dynamicScheme) {
        return hct.getTone();
    }

    public static /* synthetic */ TonalPalette b(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }

    public static double enableLightForeground(double d2) {
        boolean bl2 = DynamicColor.tonePrefersLightForeground(d2);
        if (bl2 && !(bl2 = DynamicColor.toneAllowsLightForeground(d2))) {
            d2 = 49.0;
        }
        return d2;
    }

    public static double foregroundTone(double d2, double d5) {
        double d7 = Contrast.lighterUnsafe(d2, d5);
        double d9 = Contrast.darkerUnsafe(d2, d5);
        double d12 = Contrast.ratioOfTones(d7, d2);
        double d13 = Contrast.ratioOfTones(d9, d2);
        Object object = DynamicColor.tonePrefersLightForeground(d2);
        if (object != 0) {
            double d14;
            d2 = Math.abs(d12 - d13);
            double d15 = d2 - (d14 = 0.1);
            Object object2 = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
            object = object2 < 0 && (object = (Object)(d12 == d5 ? 0 : (d12 < d5 ? -1 : 1))) < 0 && (object = (Object)(d13 == d5 ? 0 : (d13 < d5 ? -1 : 1))) < 0 ? 1 : 0;
            double d16 = d12 == d5 ? 0 : (d12 > d5 ? 1 : -1);
            if (d16 < 0 && (d16 = d12 == d13 ? 0 : (d12 > d13 ? 1 : -1)) < 0 && object == 0) {
                return d9;
            }
            return d7;
        }
        object = d13 == d5 ? 0 : (d13 > d5 ? 1 : -1);
        if (object >= 0 || (object = (Object)(d13 == d12 ? 0 : (d13 > d12 ? 1 : -1))) >= 0) {
            d7 = d9;
        }
        return d7;
    }

    public static DynamicColor fromArgb(String string2, int n3) {
        Hct hct = Hct.fromInt(n3);
        Object object = TonalPalette.fromInt(n3);
        gw0_1 gw0_12 = new gw0_1((TonalPalette)object);
        object = new hw0_1(hct, 0);
        return DynamicColor.fromPalette(string2, gw0_12, (Function)object);
    }

    public static DynamicColor fromPalette(String string2, Function function, Function function2) {
        DynamicColor dynamicColor = new DynamicColor(string2, function, function2, false, null, null, null, null);
        return dynamicColor;
    }

    public static DynamicColor fromPalette(String string2, Function function, Function function2, boolean bl2) {
        DynamicColor dynamicColor = new DynamicColor(string2, function, function2, bl2, null, null, null, null);
        return dynamicColor;
    }

    public static boolean toneAllowsLightForeground(double d2) {
        long l2;
        long l3 = Math.round(d2);
        long l4 = l3 - (l2 = (long)49);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object <= 0;
        return bl2;
    }

    public static boolean tonePrefersLightForeground(double d2) {
        long l2;
        long l3 = Math.round(d2);
        long l4 = l3 - (l2 = (long)60);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object < 0;
        return bl2;
    }

    public int getArgb(DynamicScheme dynamicScheme) {
        Hct hct = this.getHct(dynamicScheme);
        int n3 = hct.toInt();
        Function function = this.opacity;
        if (function == null) {
            return n3;
        }
        int n4 = (int)Math.round((Double)fw0_0.a(dynamicScheme, function) * 255.0);
        n4 = MathUtils.clampInt(0, 255, n4);
        return n4 << 24 | (n3 &= 0xFFFFFF);
    }

    public Hct getHct(DynamicScheme dynamicScheme) {
        int n3;
        Hct hct = (Hct)this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        double d2 = this.getTone(dynamicScheme);
        Object object = this.palette;
        object = (TonalPalette)fw0_0.a(dynamicScheme, (Function)object);
        hct = ((TonalPalette)object).getHct(d2);
        HashMap hashMap = this.hctCache;
        int n4 = hashMap.size();
        if (n4 > (n3 = 4)) {
            hashMap = this.hctCache;
            hashMap.clear();
        }
        this.hctCache.put(dynamicScheme, hct);
        return hct;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double getTone(DynamicScheme var1_1) {
        block27: {
            block26: {
                block30: {
                    block28: {
                        block29: {
                            var2_2 = this;
                            var3_3 = var1_1;
                            var4_4 = var1_1.contrastLevel;
                            var6_5 = 0.0;
                            cfr_temp_0 = var4_4 - var6_5;
                            var8_6 /* !! */  = (double)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1));
                            if (var8_6 /* !! */  < 0) {
                                var9_7 = 1;
                            } else {
                                var9_7 = 0;
                                var10_8 = null;
                            }
                            var11_9 = var2_2.toneDeltaPair;
                            if (var11_9 == null) break block27;
                            var11_9 = (ToneDeltaPair)fw0_0.a(var3_3, (Function)var11_9);
                            var12_10 = var11_9.getRoleA();
                            var13_11 = var11_9.getRoleB();
                            var14_12 = var11_9.getDelta();
                            var16_13 /* !! */  = var11_9.getPolarity();
                            var17_15 /* !! */  = var11_9.getStayTogether();
                            var18_17 /* !! */  = var2_2.background;
                            var19_19 = ((DynamicColor)fw0_0.a(var3_3, var18_17 /* !! */ )).getTone((DynamicScheme)var3_3);
                            var18_17 /* !! */  = TonePolarity.NEARER;
                            if (!(var16_13 /* !! */  == var18_17 /* !! */  || var16_13 /* !! */  == (var18_17 /* !! */  = TonePolarity.LIGHTER) && (var21_21 = var3_3.isDark) == 0 || var16_13 /* !! */  == (var18_17 /* !! */  = TonePolarity.DARKER) && (var22_23 = var3_3.isDark))) {
                                var22_23 = false;
                                var16_13 /* !! */  = null;
                            } else {
                                var22_23 = true;
                            }
                            var18_17 /* !! */  = var22_23 != false ? var12_10 : var13_11;
                            var16_13 /* !! */  = var22_23 != false ? var13_11 : var12_10;
                            var23_25 = var2_2.name;
                            var24_27 = var18_17 /* !! */ .name;
                            var25_28 = var23_25.equals(var24_27);
                            var26_29 = var3_3.isDark;
                            var27_30 = var26_29 != false ? 1.0 : -1.0;
                            var24_27 = var18_17 /* !! */ .contrastCurve;
                            var6_5 = var3_3.contrastLevel;
                            var6_5 = var24_27.getContrast(var6_5);
                            var24_27 = var16_13 /* !! */ .contrastCurve;
                            var29_31 = var3_3.contrastLevel;
                            var31_33 = var24_27.getContrast(var29_31);
                            var18_17 /* !! */  = var18_17 /* !! */ .tone;
                            var18_17 /* !! */  = (Double)fw0_0.a(var3_3, var18_17 /* !! */ );
                            var33_34 = var18_17 /* !! */ .doubleValue();
                            var35_36 = Contrast.ratioOfTones(var19_19, var33_34);
                            var21_21 = var35_36 == var6_5 ? 0 : (var35_36 > var6_5 ? 1 : -1);
                            if (var21_21 < 0) {
                                var33_34 = DynamicColor.foregroundTone(var19_19, var6_5);
                            }
                            var16_13 /* !! */  = var16_13 /* !! */ .tone;
                            var3_3 = (Double)fw0_0.a(var3_3, (Function)var16_13 /* !! */ );
                            var37_37 = var3_3.doubleValue();
                            var35_36 = Contrast.ratioOfTones(var19_19, var37_37);
                            var39_39 /* !! */  = var35_36 == var31_33 ? 0 : (var35_36 > var31_33 ? 1 : -1);
                            if (var39_39 /* !! */  < 0) {
                                var37_37 = DynamicColor.foregroundTone(var19_19, var31_33);
                            }
                            if (var9_7 != 0) {
                                var33_34 = DynamicColor.foregroundTone(var19_19, var6_5);
                                var37_37 = DynamicColor.foregroundTone(var19_19, var31_33);
                            }
                            if ((var42_42 = (cfr_temp_1 = (var40_41 = (var37_37 - var33_34) * var27_30) - var14_12) == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1)) < 0 && (var49_46 /* !! */  = (cfr_temp_2 = (var6_5 = ((var37_37 = MathUtils.clampDouble(var45_44 = 0.0, var47_45 = 100.0, var43_43 = var33_34 + (var40_41 = var14_12 * var27_30))) - var33_34) * var27_30) - var14_12) == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1)) < 0) {
                                var47_45 = 100.0;
                                var43_43 = var37_37 - var40_41;
                                var45_44 = 0.0;
                                var33_34 = MathUtils.clampDouble(var45_44, var47_45, var43_43);
                            }
                            var42_42 = (cfr_temp_3 = 50.0 - var33_34) == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                            var40_41 = 60.0;
                            if (var42_42 > 0 || (var42_42 = var33_34 == var40_41 ? 0 : (var33_34 < var40_41 ? -1 : 1)) >= 0) break block28;
                            var6_5 = 0.0;
                            cfr_temp_4 = var27_30 - var6_5;
                            var17_15 /* !! */  = (int)(cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1));
                            if (var17_15 /* !! */  <= 0) break block29;
                            var6_5 = (var14_12 *= var27_30) + var40_41;
                            var50_47 = Math.max(var37_37, var6_5);
                            var33_34 = var40_41;
                            var40_41 = var50_47;
                            break block26;
                        }
                        var6_5 = (var14_12 *= var27_30) + 49.0;
                        var40_41 = Math.min(var37_37, var6_5);
lbl78:
                        // 2 sources

                        while (true) {
                            var33_34 = 49.0;
                            break block26;
                            break;
                        }
                    }
                    var6_5 = 50.0;
                    cfr_temp_5 = var6_5 - var37_37;
                    var49_46 /* !! */  = (double)(cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 < 0.0 ? -1 : 1));
                    if (var49_46 /* !! */  > 0 || (var42_42 = var37_37 == var40_41 ? 0 : (var37_37 < var40_41 ? -1 : 1)) >= 0) break block30;
                    if (var17_15 /* !! */  == 0) ** GOTO lbl98
                    var6_5 = 0.0;
                    cfr_temp_6 = var27_30 - var6_5;
                    var17_15 /* !! */  = (int)(cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 > 0.0 ? 1 : -1));
                    if (var17_15 /* !! */  > 0) {
                        var6_5 = (var14_12 *= var27_30) + var40_41;
                        var40_41 = Math.max(var37_37, var6_5);
                        var33_34 = 60.0;
                    } else {
                        var6_5 = (var14_12 *= var27_30) + 49.0;
                        var40_41 = Math.min(var37_37, var6_5);
                        ** continue;
lbl98:
                        // 1 sources

                        var6_5 = 0.0;
                        cfr_temp_7 = var27_30 - var6_5;
                        var39_39 /* !! */  = (double)(cfr_temp_7 == 0.0 ? 0 : (cfr_temp_7 > 0.0 ? 1 : -1));
                        var40_41 = var39_39 /* !! */  > 0 ? 60.0 : 49.0;
                    }
                    break block26;
                }
                var40_41 = var37_37;
            }
            if (var25_28) {
                var40_41 = var33_34;
            }
            return var40_41;
        }
        var11_9 = var2_2.tone;
        var11_9 = (Double)fw0_0.a(var3_3, (Function)var11_9);
        var50_48 = var11_9.doubleValue();
        var18_18 = var2_2.background;
        if (var18_18 == null) {
            return var50_48;
        }
        var33_35 = ((DynamicColor)fw0_0.a(var3_3, (Function)var18_18)).getTone((DynamicScheme)var3_3);
        var18_18 = var2_2.contrastCurve;
        var19_20 = var3_3.contrastLevel;
        var19_20 = var18_18.getContrast(var19_20);
        var52_49 = Contrast.ratioOfTones(var33_35, var50_48);
        cfr_temp_8 = var52_49 - var19_20;
        var21_22 /* !! */  = (double)(cfr_temp_8 == 0.0 ? 0 : (cfr_temp_8 > 0.0 ? 1 : -1));
        if (var21_22 /* !! */  < 0) {
            var50_48 = DynamicColor.foregroundTone(var33_35, var19_20);
        }
        if (var9_7 != 0) {
            var50_48 = DynamicColor.foregroundTone(var33_35, var19_20);
        }
        if ((var9_7 = var2_2.isBackground) != 0 && (var9_7 = (cfr_temp_9 = (var52_49 = 50.0) - var50_48) == 0.0 ? 0 : (cfr_temp_9 < 0.0 ? -1 : 1)) <= 0 && (var9_7 = (int)((cfr_temp_10 = var50_48 - (var52_49 = 60.0)) == 0.0 ? 0 : (cfr_temp_10 < 0.0 ? -1 : 1))) < 0) {
            var29_32 = 49.0;
            var4_4 = Contrast.ratioOfTones(var29_32, var33_35);
            cfr_temp_11 = var4_4 - var19_20;
            var22_24 /* !! */  = (double)(cfr_temp_11 == 0.0 ? 0 : (cfr_temp_11 > 0.0 ? 1 : -1));
            if (var22_24 /* !! */  >= 0) {
                var52_49 = var29_32;
            }
        } else {
            var52_49 = var50_48;
        }
        if ((var10_8 = var2_2.secondBackground) != null) {
            var10_8 = var2_2.background;
            var10_8 = (DynamicColor)fw0_0.a(var3_3, (Function)var10_8);
            var4_4 = var10_8.getTone((DynamicScheme)var3_3);
            var16_14 = var2_2.secondBackground;
            var16_14 = (DynamicColor)fw0_0.a(var3_3, (Function)var16_14);
            var37_38 = var16_14.getTone((DynamicScheme)var3_3);
            var33_35 = Math.max(var4_4, var37_38);
            var29_32 = Math.min(var4_4, var37_38);
            var54_50 = Contrast.ratioOfTones(var33_35, var52_49);
            cfr_temp_12 = var54_50 - var19_20;
            var39_40 /* !! */  = (double)(cfr_temp_12 == 0.0 ? 0 : (cfr_temp_12 > 0.0 ? 1 : -1));
            if (var39_40 /* !! */  >= 0 && (var39_40 /* !! */  = (cfr_temp_13 = (var54_50 = Contrast.ratioOfTones(var29_32, var52_49)) - var19_20) == 0.0 ? 0 : (cfr_temp_13 > 0.0 ? 1 : -1)) >= 0) {
                return var52_49;
            }
            var33_35 = Contrast.lighter(var33_35, var19_20);
            var19_20 = Contrast.darker(var29_32, var19_20);
            var3_3 = new ArrayList<Double>();
            var52_49 = -1.0;
            cfr_temp_14 = var33_35 - var52_49;
            var56_51 /* !! */  = (double)(cfr_temp_14 == 0.0 ? 0 : (cfr_temp_14 > 0.0 ? 1 : -1));
            if (var56_51 /* !! */  != false) {
                var57_52 = var33_35;
                var3_3.add(var57_52);
            }
            if ((var58_53 = var19_20 == var52_49 ? 0 : (var19_20 > var52_49 ? 1 : -1)) != false) {
                var23_26 = var19_20;
                var3_3.add(var23_26);
            }
            if ((var9_7 = (int)DynamicColor.tonePrefersLightForeground(var4_4)) == 0 && (var9_7 = (int)DynamicColor.tonePrefersLightForeground(var37_38)) == 0) {
                var9_7 = var3_3.size();
                if (var9_7 == (var17_16 = 1)) {
                    return (Double)var3_3.get(0);
                }
                if (var58_53 != false) {
                    var6_5 = var19_20;
                }
                return var6_5;
            }
            if (var56_51 /* !! */  == false) {
                var33_35 = 100.0;
            }
            return var33_35;
        }
        return var52_49;
    }
}

