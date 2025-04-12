/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaf;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzau;
import com.google.android.gms.internal.measurement.zzav;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public final class zzas
implements zzaq,
Iterable {
    private final String zza;

    public zzas(String object) {
        if (object != null) {
            this.zza = object;
            return;
        }
        object = new IllegalArgumentException("StringValue cannot be null.");
        throw object;
    }

    public static /* bridge */ /* synthetic */ String zza(zzas zzas2) {
        return zzas2.zza;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof zzas;
        if (!bl2) {
            return false;
        }
        object = (zzas)object;
        String string2 = this.zza;
        object = ((zzas)object).zza;
        return string2.equals(object);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator iterator() {
        zzau zzau2 = new zzau(this);
        return zzau2;
    }

    public final String toString() {
        String string2 = this.zza;
        String string3 = "\"";
        return cP.a(string3, string2, string3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final zzaq zza(String var1_1, zzh var2_2, List var3_3) {
        block94: {
            block93: {
                var4_4 = this;
                var5_5 = var1_1;
                var6_6 = var2_2;
                var7_7 = var3_3;
                var8_8 = "concat";
                var9_9 = "charAt";
                var10_10 = var9_9.equals(var1_1);
                var11_11 = "toString";
                var12_12 = "toLocaleLowerCase";
                var13_13 = "toLowerCase";
                var14_14 = "substring";
                var15_15 = "split";
                var16_16 = "slice";
                var17_17 = "search";
                var6_6 = "replace";
                var4_4 = "match";
                var7_7 = "lastIndexOf";
                var18_18 = var9_9;
                var9_9 = "indexOf";
                var19_19 = "trim";
                var20_20 = "hasOwnProperty";
                var21_21 = "toLocaleUpperCase";
                var22_22 = "toUpperCase";
                if (var10_10 || (var10_10 = var8_8.equals(var1_1)) || (var10_10 = var20_20.equals(var1_1)) || (var10_10 = var9_9.equals(var1_1)) || (var10_10 = var7_7.equals(var1_1)) || (var10_10 = var4_4.equals(var1_1)) || (var10_10 = var6_6.equals(var1_1)) || (var10_10 = var17_17.equals(var1_1)) || (var10_10 = var16_16.equals(var1_1)) || (var10_10 = var15_15.equals(var1_1)) || (var10_10 = var14_14.equals(var1_1)) || (var10_10 = var13_13.equals(var1_1)) || (var10_10 = var12_12.equals(var1_1)) || (var10_10 = var11_11.equals(var1_1)) || (var10_10 = var22_22.equals(var1_1))) ** GOTO lbl40
                var23_23 = var21_21;
                var24_24 = var21_21.equals(var1_1);
                if (!var24_24) {
                    var21_21 = var20_20;
                    var20_20 = var19_19;
                    var25_25 = var19_19.equals(var1_1);
                    if (!var25_25) {
                        var5_5 = Ft2.a(var1_1, " is not a String function");
                        var4_4 = new IllegalArgumentException((String)var5_5);
                        throw var4_4;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var21_21 = var20_20;
                        var20_20 = var19_19;
                        break block93;
                        break;
                    }
lbl40:
                    // 1 sources

                    var23_23 = var21_21;
                    ** continue;
                }
            }
            var1_1.getClass();
            var19_19 = var11_11;
            var26_26 = var12_12;
            var27_27 = var1_1.hashCode();
            switch (var27_27) lbl-1000:
            // 14 sources

            {
                default: {
                    var20_20 = var18_18;
                    var11_11 = var19_19;
                    var12_12 = var21_21;
                    var8_8 = var26_26;
lbl54:
                    // 5 sources

                    while (true) {
                        var28_28 = -1;
                        break block94;
                        break;
                    }
                }
                case 1943291465: {
                    var28_28 = var5_5.equals(var9_9);
                    if (var28_28 == 0) ** GOTO lbl-1000
                    var28_28 = 16;
                    ** GOTO lbl121
                }
                case 1094496948: {
                    var28_28 = var5_5.equals(var6_6);
                    if (var28_28 == 0) ** GOTO lbl-1000
                    var28_28 = 15;
                    ** GOTO lbl121
                }
                case 530542161: {
                    var28_28 = var5_5.equals(var14_14);
                    if (var28_28 == 0) ** GOTO lbl-1000
                    var28_28 = 14;
                    ** GOTO lbl121
                }
                case 109648666: {
                    var28_28 = var5_5.equals(var15_15);
                    if (var28_28 == 0) ** GOTO lbl-1000
                    var28_28 = 13;
                    ** GOTO lbl121
                }
                case 109526418: {
                    var28_28 = var5_5.equals(var16_16);
                    if (var28_28 == 0) ** GOTO lbl-1000
                    var28_28 = 12;
                    ** GOTO lbl121
                }
                case 103668165: {
                    var28_28 = var5_5.equals(var4_4);
                    if (var28_28 == 0) ** GOTO lbl-1000
                    var28_28 = 11;
                    ** GOTO lbl121
                }
                case 3568674: {
                    var28_28 = var5_5.equals(var20_20);
                    if (var28_28 == 0) ** GOTO lbl-1000
                    var28_28 = 10;
                    ** GOTO lbl121
                }
                case -399551817: {
                    var28_28 = var5_5.equals(var22_22);
                    if (var28_28 == 0) ** GOTO lbl-1000
                    var28_28 = 9;
                    ** GOTO lbl121
                }
                case -467511597: {
                    var28_28 = var5_5.equals(var7_7);
                    if (var28_28 == 0) ** GOTO lbl-1000
                    var28_28 = 8;
                    ** GOTO lbl121
                }
                case -726908483: {
                    var28_28 = var5_5.equals(var23_23);
                    if (var28_28 == 0) ** GOTO lbl-1000
                    var28_28 = 7;
                    ** GOTO lbl121
                }
                case -906336856: {
                    var28_28 = var5_5.equals(var17_17);
                    if (var28_28 == 0) ** GOTO lbl-1000
                    var28_28 = 6;
                    ** GOTO lbl121
                }
                case -1137582698: {
                    var28_28 = var5_5.equals(var13_13);
                    if (var28_28 == 0) ** GOTO lbl-1000
                    var28_28 = 5;
                    ** GOTO lbl121
                }
                case -1354795244: {
                    var28_28 = var5_5.equals(var8_8);
                    if (var28_28 == 0) ** GOTO lbl-1000
                    var28_28 = 4;
lbl121:
                    // 13 sources

                    var20_20 = var18_18;
                    var11_11 = var19_19;
                    var12_12 = var21_21;
                    var8_8 = var26_26;
                    break block94;
                }
                case -1361633751: {
                    var20_20 = var18_18;
                    var28_28 = var5_5.equals(var18_18);
                    var12_12 = var21_21;
                    var8_8 = var26_26;
                    if (var28_28 == 0) ** GOTO lbl54
                    var28_28 = 3;
                    break block94;
                }
                case -1464939364: {
                    var20_20 = var18_18;
                    var8_8 = var12_12;
                    var28_28 = (int)var5_5.equals(var12_12);
                    var12_12 = var21_21;
                    if (var28_28 == 0) ** GOTO lbl54
                    var28_28 = 2;
                    break block94;
                }
                case -1776922004: {
                    var20_20 = var18_18;
                    var8_8 = var12_12;
                    var28_28 = (int)var5_5.equals(var11_11);
                    var12_12 = var21_21;
                    if (var28_28 == 0) ** GOTO lbl54
                    var28_28 = 1;
                    break block94;
                }
                case -1789698943: 
            }
            var20_20 = var18_18;
            var12_12 = var21_21;
            var8_8 = var26_26;
            var28_28 = (int)var5_5.equals(var21_21);
            ** while (var28_28 == 0)
lbl156:
            // 1 sources

            var28_28 = 0;
            var5_5 = null;
        }
        switch (var28_28) {
            default: {
                var4_4 = new IllegalArgumentException("Command not supported");
                throw var4_4;
            }
            case 16: {
                var4_4 = var3_3;
                var28_28 = 2;
                zzg.zzc(var9_9, var28_28, var3_3);
                var5_5 = this;
                var6_6 = this.zza;
                var29_29 = var3_3.size();
                if (var29_29 <= 0) {
                    var7_7 = zzaq.zzc.zzf();
                    var13_13 = var2_2;
                } else {
                    var29_29 = 0;
                    var7_7 = (zzaq)var3_3.get(0);
                    var13_13 = var2_2;
                    var7_7 = var2_2.zza((zzaq)var7_7).zzf();
                }
                var30_40 = var3_3.size();
                var31_45 = 2;
                if (var30_40 < var31_45) {
                    var32_51 = 0.0;
                } else {
                    var30_40 = 1;
                    var4_4 = (zzaq)var4_4.get(var30_40);
                    var4_4 = var13_13.zza((zzaq)var4_4).zze();
                    var32_51 = var4_4.doubleValue();
                }
                var34_52 = zzg.zza(var32_51);
                var30_40 = (int)var34_52;
                var6_6 = (double)var6_6.indexOf((String)var7_7, var30_40);
                var4_4 = new zzai((Double)var6_6);
                return var4_4;
            }
            case 15: {
                var5_5 = this;
                var13_13 = var2_2;
                var4_4 = var3_3;
                var29_30 = 2;
                zzg.zzc((String)var6_6, var29_30, var3_3);
                var6_6 = zzaq.zzc;
                var7_7 = var6_6.zzf();
                var30_41 = var3_3.isEmpty();
                if (var30_41 == 0) {
                    var14_14 = null;
                    var7_7 = (zzaq)var3_3.get(0);
                    var7_7 = var2_2.zza((zzaq)var7_7).zzf();
                    var30_41 = var3_3.size();
                    if (var30_41 > (var31_46 = 1)) {
                        var4_4 = (zzaq)var3_3.get(var31_46);
                        var6_6 = var2_2.zza((zzaq)var4_4);
                    }
                }
                if ((var30_41 = (var4_4 = var5_5.zza).indexOf((String)var7_7)) < 0) {
                    return var5_5;
                }
                var31_46 = var6_6 instanceof zzal;
                if (var31_46 != 0) {
                    var6_6 = (zzal)var6_6;
                    var20_20 = new List<zzaq>((String)var7_7);
                    var36_57 = var30_41;
                    var17_17 = var36_57;
                    var8_8 = new zzai((Double)var17_17);
                    var38_59 = 3;
                    var17_17 = new zzaq[var38_59];
                    var39_62 = false;
                    var16_16 = null;
                    var17_17[0] = var20_20;
                    var17_17[1] = var8_8;
                    var31_46 = 2;
                    var17_17[var31_46] = var5_5;
                    var20_20 = Arrays.asList(var17_17);
                    var6_6 = var6_6.zza((zzh)var13_13, var20_20);
                } else {
                    var39_63 = false;
                    var16_16 = null;
                }
                var20_20 = var4_4.substring(0, var30_41);
                var6_6 = var6_6.zzf();
                var29_30 = var7_7.length() + var30_41;
                var4_4 = var4_4.substring(var29_30);
                var4_4 = n1.a((String)var20_20, (String)var6_6, (String)var4_4);
                var13_13 = new zzas((String)var4_4);
                return var13_13;
            }
            case 14: {
                var5_5 = this;
                var13_13 = var2_2;
                var4_4 = var3_3;
                var40_67 = 2;
                zzg.zzc((String)var14_14, var40_67, var3_3);
                var6_6 = this.zza;
                var29_31 = var3_3.isEmpty();
                if (var29_31 == 0) {
                    var14_14 = (zzaq)var3_3.get(0);
                    var7_7 = var2_2.zza((zzaq)var14_14).zze();
                    var41_75 = zzg.zza(var7_7.doubleValue());
                    var29_31 = (int)var41_75;
                } else {
                    var29_31 = 0;
                    var7_7 = null;
                }
                var30_42 = var3_3.size();
                var31_47 = 1;
                if (var30_42 > var31_47) {
                    var4_4 = (zzaq)var4_4.get(var31_47);
                    var4_4 = var13_13.zza((zzaq)var4_4).zze();
                    var34_53 = zzg.zza(var4_4.doubleValue());
                    var43_77 = (int)var34_53;
lbl261:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var43_77 = var6_6.length();
                ** continue;
                var30_42 = 0;
                var14_14 = null;
                var29_31 = Math.max(var29_31, 0);
                var44_82 = var6_6.length();
                var29_31 = Math.min(var29_31, var44_82);
                var43_77 = Math.max(var43_77, 0);
                var30_42 = var6_6.length();
                var43_77 = Math.min(var43_77, var30_42);
                var44_82 = Math.min(var29_31, var43_77);
                var43_77 = Math.max(var29_31, var43_77);
                var4_4 = var6_6.substring(var44_82, var43_77);
                var14_14 = new zzas((String)var4_4);
                return var14_14;
            }
            case 13: {
                var5_5 = this;
                var13_13 = var2_2;
                var4_4 = var3_3;
                var40_68 = 2;
                zzg.zzc(var15_15, var40_68, var3_3);
                var6_6 = this.zza;
                var29_32 = var6_6.length();
                if (var29_32 == 0) {
                    var6_6 = new zzaq[]{this};
                    var4_4 = new zzaf((zzaq[])var6_6);
                    return var4_4;
                }
                var29_32 = 0;
                var7_7 = null;
                var14_14 = new ArrayList();
                var31_48 = var3_3.isEmpty();
                if (var31_48 != 0) {
                    var14_14.add(this);
                } else {
                    var20_20 = (zzaq)var3_3.get(0);
                    var7_7 = var2_2.zza((zzaq)var20_20).zzf();
                    var31_48 = var3_3.size();
                    if (var31_48 > (var45_83 = 1)) {
                        var4_4 = (zzaq)var3_3.get(var45_83);
                        var4_4 = var2_2.zza((zzaq)var4_4).zze();
                        var46_84 = var4_4.doubleValue();
                        var48_85 = zzg.zzc(var46_84);
                    } else {
                        var48_85 = 0x7FFFFFFFL;
                        var46_84 = 1.060997895E-314;
                    }
                    var50_86 = 0L;
                    var43_78 = var48_85 == var50_86 ? 0 : (var48_85 < var50_86 ? -1 : 1);
                    if (var43_78 == false) {
                        var4_4 = new zzaf();
                        return var4_4;
                    }
                    var4_4 = Pattern.quote((String)var7_7);
                    var45_83 = (int)var48_85;
                    var38_60 = 1;
                    var4_4 = var6_6.split((String)var4_4, var45_83 += var38_60);
                    var40_68 = ((Object)var4_4).length;
                    var29_32 = (int)var7_7.isEmpty();
                    if (var29_32 != 0 && (var29_32 = ((Object)var4_4).length) > 0) {
                        var39_64 = var4_4[0].isEmpty();
                        var29_32 = ((Object)var4_4).length - var38_60;
                        var7_7 = var4_4[var29_32];
                        if ((var29_32 = (int)var7_7.isEmpty()) != 0) {
                            var40_68 = ((Object)var4_4).length - var38_60;
                        }
                    } else {
                        var39_64 = 0;
                        var16_16 = null;
                    }
                    if ((var29_32 = (int)((cfr_temp_0 = (var50_86 = (long)((Object)var4_4).length) - var48_85) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) > 0) {
                        var29_32 = -1;
                        var40_68 += var29_32;
                    }
                    while (var39_64 < var40_68) {
                        var13_13 = var4_4[var39_64];
                        var7_7 = new zzas((String)var13_13);
                        var14_14.add(var7_7);
                        var29_32 = 1;
                        var39_64 += var29_32;
                    }
                }
                var4_4 = new zzaf((List)var14_14);
                return var4_4;
            }
            case 12: {
                var5_5 = this;
                var13_13 = var2_2;
                var4_4 = var3_3;
                var40_69 = 2;
                zzg.zzc(var16_16, var40_69, var3_3);
                var6_6 = this.zza;
                var29_33 = var3_3.isEmpty();
                if (var29_33 == 0) {
                    var29_33 = 0;
                    var14_14 = (zzaq)var3_3.get(0);
                    var7_7 = var2_2.zza((zzaq)var14_14).zze();
                    var41_76 = var7_7.doubleValue();
                } else {
                    var41_76 = 0.0;
                }
                var41_76 = zzg.zza(var41_76);
                var52_87 = 0.0;
                var38_61 = var41_76 == var52_87 ? 0 : (var41_76 < var52_87 ? -1 : 1);
                if (var38_61 < 0) {
                    var38_61 = var6_6.length();
                    var36_58 = (double)var38_61 + var41_76;
                    var41_76 = Math.max(var36_58, var52_87);
                } else {
                    var31_49 = var6_6.length();
                    var52_87 = var31_49;
                    var41_76 = Math.min(var41_76, var52_87);
                }
                var29_33 = (int)var41_76;
                var30_43 = var3_3.size();
                var31_49 = 1;
                if (var30_43 > var31_49) {
                    var4_4 = (zzaq)var4_4.get(var31_49);
                    var4_4 = var13_13.zza((zzaq)var4_4).zze();
                    var34_54 = var4_4.doubleValue();
                } else {
                    var43_79 = var6_6.length();
                    var34_54 = var43_79;
                }
                var34_54 = zzg.zza(var34_54);
                var52_87 = 0.0;
                var43_79 = (int)(var34_54 == var52_87 ? 0 : (var34_54 < var52_87 ? -1 : 1));
                if (var43_79 < 0) {
                    var43_79 = var6_6.length();
                    var36_58 = (double)var43_79 + var34_54;
                    var34_54 = Math.max(var36_58, var52_87);
                } else {
                    var43_79 = var6_6.length();
                    var52_87 = var43_79;
                    var34_54 = Math.min(var34_54, var52_87);
                }
                var43_79 = (int)var34_54 - var29_33;
                var43_79 = Math.max(0, var43_79) + var29_33;
                var4_4 = var6_6.substring(var29_33, var43_79);
                var14_14 = new zzas((String)var4_4);
                return var14_14;
            }
            case 11: {
                var5_5 = this;
                var13_13 = var2_2;
                var6_6 = var4_4;
                var4_4 = var3_3;
                zzg.zzc((String)var6_6, 1, var3_3);
                var6_6 = this.zza;
                var29_34 = var3_3.size();
                if (var29_34 <= 0) {
                    var4_4 = "";
                } else {
                    var29_34 = 0;
                    var7_7 = null;
                    var4_4 = (zzaq)var3_3.get(0);
                    var4_4 = var2_2.zza((zzaq)var4_4).zzf();
                }
                var4_4 = Pattern.compile((String)var4_4).matcher((CharSequence)var6_6);
                var40_70 = var4_4.find();
                if (var40_70) {
                    var4_4 = var4_4.group();
                    var7_7 = new zzas((String)var4_4);
                    var4_4 = new zzaq[]{var7_7};
                    var6_6 = new zzaf((zzaq[])var4_4);
                    return var6_6;
                }
                return zzaq.zzd;
            }
            case 10: {
                var5_5 = this;
                var4_4 = var3_3;
                zzg.zza(var22_22, 0, var3_3);
                var4_4 = this.zza;
                var4_4 = var4_4.trim();
                var6_6 = new zzas((String)var4_4);
                return var6_6;
            }
            case 9: {
                var5_5 = this;
                var4_4 = var3_3;
                zzg.zza(var22_22, 0, var3_3);
                var4_4 = this.zza;
                var7_7 = Locale.ENGLISH;
                var4_4 = var4_4.toUpperCase((Locale)var7_7);
                var6_6 = new zzas((String)var4_4);
                return var6_6;
            }
            case 8: {
                var5_5 = this;
                var13_13 = var2_2;
                var4_4 = var3_3;
                var6_6 = var7_7;
                zzg.zzc((String)var7_7, 2, var3_3);
                var6_6 = this.zza;
                var29_35 = var3_3.size();
                if (var29_35 <= 0) {
                    var7_7 = zzaq.zzc.zzf();
                } else {
                    var29_35 = 0;
                    var7_7 = (zzaq)var3_3.get(0);
                    var7_7 = var2_2.zza((zzaq)var7_7).zzf();
                }
                var30_44 = var3_3.size();
                var31_50 = 2;
                if (var30_44 < var31_50) {
                    var34_55 = 0.0 / 0.0;
                } else {
                    var30_44 = 1;
                    var4_4 = (zzaq)var4_4.get(var30_44);
                    var4_4 = var13_13.zza((zzaq)var4_4).zze();
                    var34_55 = var4_4.doubleValue();
                }
                var43_80 = Double.isNaN(var34_55);
                var34_55 = var43_80 != false ? 1.0 / 0.0 : zzg.zza(var34_55);
                var30_44 = (int)var34_55;
                var6_6 = (double)var6_6.lastIndexOf((String)var7_7, var30_44);
                var4_4 = new zzai((Double)var6_6);
                return var4_4;
            }
            case 7: {
                var5_5 = this;
                var4_4 = var3_3;
                zzg.zza(var23_23, 0, var3_3);
                var4_4 = this.zza;
                var4_4 = var4_4.toUpperCase();
                var6_6 = new zzas((String)var4_4);
                return var6_6;
            }
            case 6: {
                var5_5 = this;
                var13_13 = var2_2;
                var4_4 = var3_3;
                var40_71 = false;
                var6_6 = null;
                zzg.zzc((String)var17_17, 1, var3_3);
                var29_36 = var3_3.isEmpty();
                if (!var29_36) {
                    var4_4 = (zzaq)var3_3.get(0);
                    var4_4 = var2_2.zza((zzaq)var4_4).zzf();
                } else {
                    var4_4 = zzaq.zzc.zzf();
                }
                var6_6 = var5_5.zza;
                var4_4 = Pattern.compile((String)var4_4).matcher((CharSequence)var6_6);
                var40_71 = var4_4.find();
                if (var40_71) {
                    var4_4 = (double)var4_4.start();
                    var6_6 = new zzai((Double)var4_4);
                    return var6_6;
                }
                var6_6 = -1.0;
                var4_4 = new zzai((Double)var6_6);
                return var4_4;
            }
            case 5: {
                var5_5 = this;
                var4_4 = var3_3;
                zzg.zza((String)var13_13, 0, var3_3);
                var4_4 = this.zza;
                var7_7 = Locale.ENGLISH;
                var4_4 = var4_4.toLowerCase((Locale)var7_7);
                var6_6 = new zzas((String)var4_4);
                return var6_6;
            }
            case 4: {
                var5_5 = this;
                var13_13 = var2_2;
                var4_4 = var3_3;
                var40_72 = var3_3.isEmpty();
                if (var40_72) {
                    return this;
                }
                var7_7 = this.zza;
                var6_6 = new StringBuilder((String)var7_7);
                var16_16 = null;
                for (var39_65 = 0; var39_65 < (var29_37 = var3_3.size()); var39_65 += var29_37) {
                    var7_7 = (zzaq)var4_4.get(var39_65);
                    var7_7 = var13_13.zza((zzaq)var7_7).zzf();
                    var6_6.append((String)var7_7);
                    var29_37 = 1;
                }
                var6_6 = var6_6.toString();
                var4_4 = new zzas((String)var6_6);
                return var4_4;
            }
            case 3: {
                var5_5 = this;
                var13_13 = var2_2;
                var4_4 = var3_3;
                var29_38 = 1;
                zzg.zzc((String)var20_20, var29_38, var3_3);
                var40_73 = var3_3.isEmpty();
                if (var40_73 == 0) {
                    var40_73 = 0;
                    var6_6 = null;
                    var4_4 = (zzaq)var3_3.get(0);
                    var4_4 = var2_2.zza((zzaq)var4_4).zze();
                    var54_89 = zzg.zza(var4_4.doubleValue());
                    var39_66 = (int)var54_89;
                } else {
                    var39_66 = 0;
                    var16_16 = null;
                }
                var4_4 = var5_5.zza;
                if (var39_66 >= 0 && var39_66 < (var40_73 = var4_4.length())) {
                    var4_4 = String.valueOf(var4_4.charAt(var39_66));
                    var6_6 = new zzas((String)var4_4);
                    return var6_6;
                }
                return zzaq.zzj;
            }
            case 2: {
                var5_5 = this;
                var4_4 = var3_3;
                zzg.zza((String)var8_8, 0, var3_3);
                var4_4 = this.zza;
                var4_4 = var4_4.toLowerCase();
                var6_6 = new zzas((String)var4_4);
                return var6_6;
            }
            case 1: {
                var5_5 = this;
                var4_4 = var3_3;
                zzg.zza(var11_11, 0, var3_3);
                return this;
            }
            case 0: 
        }
        var5_5 = this;
        var13_13 = var2_2;
        var4_4 = var3_3;
        var29_39 = 1;
        zzg.zza(var12_12, var29_39, var3_3);
        var7_7 = this.zza;
        var4_4 = (zzaq)var3_3.get(0);
        var4_4 = var2_2.zza((zzaq)var4_4);
        var6_6 = var4_4.zzf();
        var14_14 = "length";
        var40_74 = var14_14.equals(var6_6);
        if (var40_74 != 0) {
            return zzaq.zzh;
        }
        var34_56 = (var4_4 = var4_4.zze()).doubleValue();
        cfr_temp_1 = var34_56 - (var52_88 = Math.floor(var34_56));
        var43_81 /* !! */  = (double)(cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1));
        if (var43_81 /* !! */  == false && (var43_81 /* !! */  = (double)((int)var34_56)) >= 0 && var43_81 /* !! */  < (var40_74 = var7_7.length())) {
            return zzaq.zzh;
        }
        return zzaq.zzi;
    }

    public final zzaq zzc() {
        String string2 = this.zza;
        zzas zzas2 = new zzas(string2);
        return zzas2;
    }

    public final Boolean zzd() {
        return this.zza.isEmpty() ^ true;
    }

    public final Double zze() {
        String string2 = this.zza;
        boolean bl2 = string2.isEmpty();
        if (bl2) {
            return 0.0;
        }
        try {
            string2 = this.zza;
        }
        catch (NumberFormatException numberFormatException) {
            return 0.0 / 0.0;
        }
        return Double.valueOf(string2);
    }

    public final String zzf() {
        return this.zza;
    }

    public final Iterator zzh() {
        zzav zzav2 = new zzav(this);
        return zzav2;
    }
}

