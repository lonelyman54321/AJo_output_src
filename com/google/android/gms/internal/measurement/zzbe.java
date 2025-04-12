/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaf;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzaj;
import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzar;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzax;
import com.google.android.gms.internal.measurement.zzbh;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzbe {
    private static zzaf zza(zzaf zzaf2, zzh zzh2, zzal zzal2) {
        return zzbe.zza(zzaf2, zzh2, zzal2, null, null);
    }

    private static zzaf zza(zzaf zzaf2, zzh zzh2, zzal zzal2, Boolean bl2, Boolean bl3) {
        int n3;
        zzaf zzaf3 = new zzaf();
        Iterator iterator = zzaf2.zzg();
        while ((n3 = iterator.hasNext()) != 0) {
            Integer n4 = (Integer)iterator.next();
            n3 = n4;
            int n7 = zzaf2.zzc(n3);
            if (n7 == 0) continue;
            Object object = zzaf2.zza(n3);
            double d2 = n3;
            zzaq[] zzaqArray = Double.valueOf(d2);
            Object object2 = new zzai((Double)zzaqArray);
            int n8 = 3;
            zzaqArray = new zzaq[n8];
            zzaqArray[0] = object;
            zzaqArray[1] = object2;
            n7 = 2;
            zzaqArray[n7] = zzaf2;
            object = Arrays.asList(zzaqArray);
            object2 = (object = zzal2.zza(zzh2, (List)object)).zzd();
            boolean bl4 = ((Boolean)object2).equals(bl2);
            if (bl4) {
                return zzaf3;
            }
            if (bl3 != null && !(bl4 = ((Boolean)(object2 = object.zzd())).equals(bl3))) continue;
            zzaf3.zzb(n3, (zzaq)object);
        }
        return zzaf3;
    }

    /*
     * Unable to fully structure code
     */
    private static zzaq zza(zzaf var0, zzh var1_1, List var2_2, boolean var3_3) {
        block4: {
            block7: {
                block8: {
                    block6: {
                        block5: {
                            var4_4 = "reduce";
                            var5_5 = 1;
                            zzg.zzb(var4_4, var5_5, (List)var2_2);
                            var6_6 = 2;
                            zzg.zzc(var4_4, var6_6, (List)var2_2);
                            var4_4 = null;
                            var7_7 = (zzaq)var2_2.get(0);
                            var7_7 = var1_1.zza(var7_7);
                            var8_8 = var7_7 instanceof zzal;
                            if (var8_8 == 0) break block4;
                            var8_8 = var2_2.size();
                            if (var8_8 != var6_6) break block5;
                            var2_2 = (zzaq)var2_2.get(var5_5);
                            var8_8 = (var2_2 = var1_1.zza((zzaq)var2_2)) instanceof zzaj;
                            if (var8_8 != 0) {
                                var0 = new IllegalArgumentException("Failed to parse initial value");
                                throw var0;
                            }
                            break block6;
                        }
                        var9_9 = var0.zzb();
                        if (var9_9 == 0) break block7;
                        var9_9 = 0;
                        var2_2 = null;
                    }
                    var7_7 = (zzal)var7_7;
                    var8_8 = var0.zzb();
                    var10_10 = var3_3 != 0 ? 0 : var8_8 + -1;
                    var8_8 = var3_3 != 0 ? (var8_8 -= var5_5) : 0;
                    var3_3 = var3_3 != 0 ? 1 : -1;
                    if (var2_2 != null) break block8;
                    var2_2 = var0.zza(var10_10);
                    ** GOTO lbl53
                }
                while ((var11_11 = (var8_8 - var10_10) * var3_3) >= 0) {
                    var11_11 = (int)var0.zzc(var10_10);
                    if (var11_11 != 0) {
                        var12_12 = var0.zza(var10_10);
                        var14_14 = var10_10;
                        var16_15 = Double.valueOf(var14_14);
                        var13_13 = new zzai((Double)var16_15);
                        var17_16 = 4;
                        var16_15 = new zzaq[var17_16];
                        var16_15[0] = var2_2;
                        var16_15[var5_5] = var12_12;
                        var16_15[var6_6] = var13_13;
                        var9_9 = 3;
                        var16_15[var9_9] = var0;
                        var2_2 = Arrays.asList(var16_15);
                        var11_11 = (var2_2 = var7_7.zza(var1_1, (List)var2_2)) instanceof zzaj;
                        if (var11_11 != 0) {
                            var0 = new IllegalStateException("Reduce operation failed");
                            throw var0;
                        }
                    }
lbl53:
                    // 5 sources

                    var10_10 += var3_3;
                }
                return var2_2;
            }
            var0 = new IllegalStateException("Empty array with no initial value error");
            throw var0;
        }
        var0 = new IllegalArgumentException("Callback should be a method");
        throw var0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static zzaq zza(String var0, zzaf var1_1, zzh var2_2, List var3_3) {
        block112: {
            var4_4 = var0;
            var5_5 = var1_1;
            var6_6 = var2_2;
            var7_7 = var3_3;
            var8_8 = "indexOf";
            var9_9 = "reverse";
            var10_10 = "slice";
            var11_11 = "shift";
            var12_12 = "every";
            var13_13 = "sort";
            var14_14 = "some";
            var15_15 = "join";
            var16_16 = "pop";
            var17_17 = "map";
            var18_18 = "lastIndexOf";
            var19_19 = "forEach";
            var5_5 = "filter";
            var6_6 = "toString";
            var0.getClass();
            var20_20 = -1.0;
            var22_21 = var20_20;
            var7_7 = "Callback should be a method";
            var23_22 = var6_6;
            var24_23 = var7_7;
            var25_24 = 2;
            var26_25 = var0.hashCode();
            switch (var26_25) lbl-1000:
            // 20 sources

            {
                default: {
                    var7_7 = var23_22;
lbl31:
                    // 2 sources

                    while (true) {
                        var27_26 = -1;
                        break block112;
                        break;
                    }
                }
                case 1943291465: {
                    var27_26 = (int)var0.equals(var8_8);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var27_26 = 19;
                    ** GOTO lbl117
                }
                case 1099846370: {
                    var27_26 = (int)var0.equals(var9_9);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var27_26 = 18;
                    ** GOTO lbl117
                }
                case 965561430: {
                    var7_7 = "reduceRight";
                    var27_26 = (int)var0.equals(var7_7);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var27_26 = 17;
                    ** GOTO lbl117
                }
                case 109526418: {
                    var27_26 = (int)var0.equals(var10_10);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var27_26 = 16;
                    ** GOTO lbl117
                }
                case 109407362: {
                    var27_26 = (int)var0.equals(var11_11);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var27_26 = 15;
                    ** GOTO lbl117
                }
                case 96891675: {
                    var27_26 = (int)var0.equals(var12_12);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var27_26 = 14;
                    ** GOTO lbl117
                }
                case 3536286: {
                    var27_26 = (int)var0.equals(var13_13);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var27_26 = 13;
                    ** GOTO lbl117
                }
                case 3536116: {
                    var27_26 = (int)var0.equals(var14_14);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var27_26 = 12;
                    ** GOTO lbl117
                }
                case 3452698: {
                    var7_7 = "push";
                    var27_26 = (int)var0.equals(var7_7);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var27_26 = 11;
                    ** GOTO lbl117
                }
                case 3267882: {
                    var27_26 = (int)var0.equals(var15_15);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var27_26 = 10;
                    ** GOTO lbl117
                }
                case 111185: {
                    var27_26 = (int)var0.equals(var16_16);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var27_26 = 9;
                    ** GOTO lbl117
                }
                case 107868: {
                    var27_26 = (int)var0.equals(var17_17);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var27_26 = 8;
                    ** GOTO lbl117
                }
                case -277637751: {
                    var7_7 = "unshift";
                    var27_26 = (int)var0.equals(var7_7);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var27_26 = 7;
                    ** GOTO lbl117
                }
                case -467511597: {
                    var27_26 = (int)var0.equals(var18_18);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var27_26 = 6;
                    ** GOTO lbl117
                }
                case -678635926: {
                    var27_26 = (int)var0.equals(var19_19);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var27_26 = 5;
                    ** GOTO lbl117
                }
                case -895859076: {
                    var7_7 = "splice";
                    var27_26 = (int)var0.equals(var7_7);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var27_26 = 4;
lbl117:
                    // 16 sources

                    var7_7 = var23_22;
                    break block112;
                }
                case -934873754: {
                    var7_7 = "reduce";
                    var27_26 = (int)var0.equals(var7_7);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var7_7 = var6_6;
                    var27_26 = 3;
                    break block112;
                }
                case -1274492040: {
                    var27_26 = (int)var0.equals(var5_5);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var7_7 = var6_6;
                    var27_26 = 2;
                    break block112;
                }
                case -1354795244: {
                    var7_7 = "concat";
                    var27_26 = (int)var0.equals(var7_7);
                    if (var27_26 == 0) ** GOTO lbl-1000
                    var7_7 = var6_6;
                    var27_26 = 1;
                    break block112;
                }
                case -1776922004: 
            }
            var7_7 = var6_6;
            var27_26 = (int)var0.equals(var6_6);
            ** while (var27_26 == 0)
lbl143:
            // 1 sources

            var27_26 = 0;
            var4_4 = null;
        }
        switch (var27_26) {
            default: {
                var4_4 = new IllegalArgumentException("Command not supported");
                throw var4_4;
            }
            case 19: {
                var4_4 = var3_3;
                zzg.zzc((String)var8_8, var25_24, var3_3);
                var5_5 = zzaq.zzc;
                var25_24 = (int)var3_3.isEmpty();
                if (var25_24 == 0) {
                    var25_24 = 0;
                    var6_6 = null;
                    var5_5 = (zzaq)var3_3.get(0);
                    var7_7 = var2_2;
                    var5_5 = var2_2.zza((zzaq)var5_5);
                } else {
                    var7_7 = var2_2;
                }
                var25_24 = var3_3.size();
                var28_27 = 1;
                if (var25_24 > var28_27) {
                    var4_4 = (zzaq)var4_4.get(var28_27);
                    var29_36 = zzg.zza((var4_4 = var7_7.zza((zzaq)var4_4).zze()).doubleValue());
                    cfr_temp_0 = var29_36 - (var31_39 = (double)var1_1.zzb());
                    var27_26 = (int)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1));
                    if (var27_26 >= 0) {
                        var8_8 = var22_21;
                        var4_4 = new zzai(var22_21);
                        return var4_4;
                    }
                    var8_8 = var22_21;
                    var33_41 = 0.0;
                    cfr_temp_1 = var29_36 - var33_41;
                    var27_26 = (int)(cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1));
                    if (var27_26 < 0) {
                        var27_26 = var1_1.zzb();
                        var33_41 = var27_26;
                        var29_36 += var33_41;
                    }
                } else {
                    var8_8 = var22_21;
                    var29_36 = 0.0;
                }
                var4_4 = var1_1.zzg();
                while ((var35_42 = var4_4.hasNext()) != 0) {
                    var9_9 = (Integer)var4_4.next();
                    var35_42 = var9_9.intValue();
                    var36_48 = var35_42;
                    var38_51 = var36_48 == var29_36 ? 0 : (var36_48 < var29_36 ? -1 : 1);
                    var19_19 = var1_1;
                    if (var38_51 < 0 || (var35_42 = (int)zzg.zza((zzaq)(var9_9 = var1_1.zza(var35_42)), (zzaq)var5_5)) == 0) continue;
                    var5_5 = var36_48;
                    var4_4 = new zzai((Double)var5_5);
                    return var4_4;
                }
                var4_4 = new zzai((Double)var8_8);
                return var4_4;
            }
            case 18: {
                var19_19 = var1_1;
                var4_4 = var3_3;
                var39_55 = 0;
                var5_5 = null;
                var28_28 = false;
                var8_8 = null;
                zzg.zza((String)var9_9, 0, var3_3);
                var27_26 = var1_1.zzb();
                if (var27_26 != 0) {
                    var7_7 = null;
                    for (var40_69 = 0; var40_69 < (var39_55 = var27_26 / 2); var40_69 += var35_43) {
                        var39_55 = (int)var19_19.zzc(var40_69);
                        if (var39_55 != 0) {
                            var5_5 = var19_19.zza(var40_69);
                            var19_19.zzb(var40_69, null);
                            var35_43 = 1;
                            var41_73 = var27_26 + -1 - var40_69;
                            var42_77 = var19_19.zzc(var41_73);
                            if (var42_77) {
                                var11_11 = var19_19.zza(var41_73);
                                var19_19.zzb(var40_69, (zzaq)var11_11);
                            }
                            var19_19.zzb(var41_73, (zzaq)var5_5);
                            continue;
                        }
                        var35_43 = 1;
                    }
                }
                return var19_19;
            }
            case 17: {
                var19_19 = var1_1;
                var7_7 = var2_2;
                var4_4 = var3_3;
                return zzbe.zza(var1_1, var2_2, var3_3, false);
            }
            case 16: {
                var19_19 = var1_1;
                var7_7 = var2_2;
                var4_4 = var3_3;
                var39_56 /* !! */  = 0;
                var5_5 = null;
                zzg.zzc((String)var10_10, var25_24, var3_3);
                var28_29 = var3_3.isEmpty();
                if (var28_29 != 0) {
                    return var1_1.zzc();
                }
                var28_29 = var1_1.zzb();
                var31_40 = var28_29;
                var5_5 = (zzaq)var3_3.get(0);
                var36_49 = zzg.zza((var5_5 = var2_2.zza((zzaq)var5_5).zze()).doubleValue());
                cfr_temp_2 = var36_49 - (var43_80 = 0.0);
                var39_56 /* !! */  = (int)(cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1));
                var36_49 = var39_56 /* !! */  < 0 ? Math.max(var36_49 + var31_40, var43_80) : Math.min(var36_49, var31_40);
                var39_56 /* !! */  = var3_3.size();
                if (var39_56 /* !! */  == var25_24) {
                    var39_56 /* !! */  = 1;
                    var4_4 = (zzaq)var4_4.get(var39_56 /* !! */ );
                    var45_84 = zzg.zza((var4_4 = var7_7.zza((zzaq)var4_4).zze()).doubleValue());
                    cfr_temp_3 = var45_84 - (var29_37 = 0.0);
                    var38_52 /* !! */  = (double)(cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1));
                    var31_40 = var38_52 /* !! */  < 0 ? Math.max(var31_40 + var45_84, var29_37) : Math.min(var31_40, var45_84);
                }
                var4_4 = new zzaf();
                var39_56 /* !! */  = (int)var36_49;
                while ((var41_74 = (cfr_temp_4 = (var29_37 = (double)var39_56 /* !! */ ) - var31_40) == 0.0 ? 0 : (cfr_temp_4 < 0.0 ? -1 : 1)) < 0) {
                    var6_6 = var19_19.zza(var39_56 /* !! */ );
                    var4_4.zza((zzaq)var6_6);
                    var25_24 = 1;
                    var39_56 /* !! */  += var25_24;
                }
                return var4_4;
            }
            case 15: {
                var19_19 = var1_1;
                var4_4 = var3_3;
                var39_57 = false;
                var5_5 = null;
                zzg.zza((String)var11_11, 0, var3_3);
                var27_26 = var1_1.zzb();
                if (var27_26 == 0) {
                    return zzaq.zzc;
                }
                var4_4 = var1_1.zza(0);
                var1_1.zzb(0);
                return var4_4;
            }
            case 14: {
                var19_19 = var1_1;
                var7_7 = var2_2;
                var4_4 = var3_3;
                var5_5 = null;
                var25_24 = 1;
                zzg.zza(var12_12, var25_24, var3_3);
                var4_4 = (zzaq)var3_3.get(0);
                var4_4 = var2_2.zza((zzaq)var4_4);
                var39_58 = var4_4 instanceof zzar;
                if (var39_58 != 0) {
                    var39_58 = var1_1.zzb();
                    if (var39_58 != 0) {
                        var4_4 = (zzar)var4_4;
                        var5_5 = Boolean.FALSE;
                        var6_6 = Boolean.TRUE;
                        var27_26 = (var4_4 = zzbe.zza(var1_1, var2_2, (zzal)var4_4, (Boolean)var5_5, (Boolean)var6_6)).zzb();
                        if (var27_26 != (var39_58 = var1_1.zzb())) {
                            return zzaq.zzi;
                        }
                    }
                    return zzaq.zzh;
                }
                var9_9 = var24_23;
                var4_4 = new IllegalArgumentException((String)var24_23);
                throw var4_4;
            }
            case 13: {
                var19_19 = var1_1;
                var7_7 = var2_2;
                var4_4 = var3_3;
                var28_30 = false;
                var8_8 = null;
                zzg.zzc((String)var13_13, 1, var3_3);
                var39_59 = var1_1.zzb();
                if (var39_59 < var25_24) ** GOTO lbl334
                var5_5 = var1_1.zzi();
                var25_24 = (int)var3_3.isEmpty();
                if (var25_24 != 0) ** GOTO lbl319
                var6_6 = null;
                var4_4 = (zzaq)var3_3.get(0);
                var25_24 = (var4_4 = var2_2.zza((zzaq)var4_4)) instanceof zzal;
                if (var25_24 != 0) {
                    var4_4 = (zzal)var4_4;
                } else {
                    var4_4 = new IllegalArgumentException("Comparator should be a method");
                    throw var4_4;
lbl319:
                    // 1 sources

                    var27_26 = 0;
                    var4_4 = null;
                }
                var6_6 = new zzbh((zzal)var4_4, (zzh)var7_7);
                Collections.sort(var5_5, var6_6);
                var1_1.zzj();
                var4_4 = var5_5.iterator();
                var40_70 = 0;
                var7_7 = null;
                while ((var39_59 = (int)var4_4.hasNext()) != 0) {
                    var5_5 = (zzaq)var4_4.next();
                    var28_30 = true;
                    var25_24 = var40_70 + 1;
                    var19_19.zzb(var40_70, (zzaq)var5_5);
                    var40_70 = var25_24;
                }
lbl334:
                // 2 sources

                return var19_19;
            }
            case 12: {
                var19_19 = var1_1;
                var7_7 = var2_2;
                var4_4 = var3_3;
                var9_9 = var24_23;
                var39_60 = 3;
                zzg.zza(var14_14, 1, var3_3);
                var8_8 = null;
                var4_4 = (zzaq)var3_3.get(0);
                var4_4 = var2_2.zza((zzaq)var4_4);
                var28_31 = var4_4 instanceof zzal;
                if (var28_31 != 0) {
                    var28_31 = var1_1.zzb();
                    if (var28_31 != 0) {
                        var4_4 = (zzal)var4_4;
                        var8_8 = var1_1.zzg();
                        while ((var35_44 = var8_8.hasNext()) != 0) {
                            var9_9 = (Integer)var8_8.next();
                            var35_44 = var9_9.intValue();
                            var41_75 = (int)var19_19.zzc(var35_44);
                            if (var41_75 == 0) continue;
                            var10_10 = var19_19.zza(var35_44);
                            var43_81 = var35_44;
                            var9_9 = var43_81;
                            var11_11 = new zzai((Double)var9_9);
                            var9_9 = new zzaq[var39_60];
                            var38_53 = false;
                            var12_12 = null;
                            var9_9[0] = var10_10;
                            var41_75 = 1;
                            var9_9[var41_75] = var11_11;
                            var9_9[var25_24] = var19_19;
                            var9_9 = Arrays.asList(var9_9);
                            var35_44 = (int)(var9_9 = var4_4.zza((zzh)var7_7, (List)var9_9).zzd()).booleanValue();
                            if (var35_44 == 0) continue;
                            return zzaq.zzh;
                        }
                    }
                    return zzaq.zzi;
                }
                var4_4 = new IllegalArgumentException((String)var24_23);
                throw var4_4;
            }
            case 11: {
                var19_19 = var1_1;
                var7_7 = var2_2;
                var4_4 = var3_3;
                var39_61 = var3_3.isEmpty();
                if (!var39_61) {
                    var4_4 = var3_3.iterator();
                    while (var39_61 = var4_4.hasNext()) {
                        var5_5 = (zzaq)var4_4.next();
                        var5_5 = var7_7.zza((zzaq)var5_5);
                        var19_19.zza((zzaq)var5_5);
                    }
                }
                var5_5 = (double)var1_1.zzb();
                var4_4 = new zzai((Double)var5_5);
                return var4_4;
            }
            case 10: {
                var19_19 = var1_1;
                var7_7 = var2_2;
                var4_4 = var3_3;
                zzg.zzc(var15_15, 1, var3_3);
                var39_62 = var1_1.zzb();
                if (var39_62 == 0) {
                    return zzaq.zzj;
                }
                var39_62 = (int)var3_3.isEmpty();
                if (var39_62 == 0) {
                    var5_5 = null;
                    var4_4 = (zzaq)var3_3.get(0);
                    var39_62 = (var4_4 = var2_2.zza((zzaq)var4_4)) instanceof zzao;
                    var4_4 = var39_62 == 0 && (var39_62 = var4_4 instanceof zzax) == 0 ? var4_4.zzf() : "";
                } else {
                    var4_4 = ",";
                }
                var4_4 = var19_19.zzb((String)var4_4);
                var5_5 = new zzas((String)var4_4);
                return var5_5;
            }
            case 9: {
                var19_19 = var1_1;
                var4_4 = var3_3;
                var39_63 = false;
                var5_5 = null;
                zzg.zza(var16_16, 0, var3_3);
                var27_26 = var1_1.zzb();
                if (var27_26 == 0) {
                    return zzaq.zzc;
                }
                var5_5 = var1_1.zza(--var27_26);
                var1_1.zzb(var27_26);
                return var5_5;
            }
            case 8: {
                var19_19 = var1_1;
                var7_7 = var2_2;
                var4_4 = var3_3;
                var9_9 = var24_23;
                var5_5 = null;
                var25_24 = 1;
                zzg.zza(var17_17, var25_24, var3_3);
                var4_4 = (zzaq)var3_3.get(0);
                var4_4 = var2_2.zza((zzaq)var4_4);
                var39_64 = var4_4 instanceof zzar;
                if (var39_64 != 0) {
                    var39_64 = var1_1.zzb();
                    if (var39_64 == 0) {
                        var4_4 = new zzaf();
                        return var4_4;
                    }
                    var4_4 = (zzar)var4_4;
                    return zzbe.zza(var1_1, var2_2, (zzal)var4_4);
                }
                var4_4 = new IllegalArgumentException((String)var24_23);
                throw var4_4;
            }
            case 7: {
                var19_19 = var1_1;
                var7_7 = var2_2;
                var4_4 = var3_3;
                var39_65 = var3_3.isEmpty();
                if (!var39_65) {
                    var5_5 = new zzaf();
                    var4_4 = var3_3.iterator();
                    while ((var25_24 = (int)var4_4.hasNext()) != 0) {
                        var6_6 = (zzaq)var4_4.next();
                        var28_32 = (var6_6 = var7_7.zza((zzaq)var6_6)) instanceof zzaj;
                        if (var28_32 == 0) {
                            var5_5.zza((zzaq)var6_6);
                            continue;
                        }
                        var4_4 = new IllegalStateException("Argument evaluation failed");
                        throw var4_4;
                    }
                    var27_26 = var5_5.zzb();
                    var6_6 = var1_1.zzg();
                    while ((var40_71 = var6_6.hasNext()) != 0) {
                        var7_7 = (Integer)var6_6.next();
                        var28_32 = var7_7.intValue() + var27_26;
                        var40_71 = var7_7.intValue();
                        var7_7 = var19_19.zza(var40_71);
                        var5_5.zzb(var28_32, (zzaq)var7_7);
                    }
                    var1_1.zzj();
                    var4_4 = var5_5.zzg();
                    while ((var25_24 = (int)var4_4.hasNext()) != 0) {
                        var6_6 = (Integer)var4_4.next();
                        var40_71 = var6_6.intValue();
                        var25_24 = var6_6.intValue();
                        var6_6 = var5_5.zza(var25_24);
                        var19_19.zzb(var40_71, (zzaq)var6_6);
                    }
                }
                var5_5 = (double)var1_1.zzb();
                var4_4 = new zzai((Double)var5_5);
                return var4_4;
            }
            case 6: {
                var19_19 = var1_1;
                var7_7 = var2_2;
                var4_4 = var3_3;
                var8_8 = var22_21;
                zzg.zzc(var18_18, var25_24, var3_3);
                var5_5 = zzaq.zzc;
                var25_24 = (int)var3_3.isEmpty();
                if (var25_24 == 0) {
                    var25_24 = 0;
                    var6_6 = null;
                    var5_5 = (zzaq)var3_3.get(0);
                    var5_5 = var2_2.zza((zzaq)var5_5);
                }
                var25_24 = var1_1.zzb();
                var35_45 = 1;
                var36_50 = var25_24 - var35_45;
                var25_24 = var3_3.size();
                if (var25_24 > var35_45) {
                    var4_4 = (zzaq)var4_4.get(var35_45);
                    var6_6 = (var4_4 = var7_7.zza((zzaq)var4_4)).zze();
                    var29_38 = var6_6.doubleValue();
                    var25_24 = (int)Double.isNaN(var29_38);
                    if (var25_24 != 0) {
                        var27_26 = var1_1.zzb() - var35_45;
                        var29_38 = var27_26;
lbl502:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var4_4 = var4_4.zze();
                    var29_38 = zzg.zza(var4_4.doubleValue());
                    ** continue;
                    var36_50 = var29_38;
                    var29_38 = 0.0;
                    var27_26 = (int)(var36_50 == var29_38 ? 0 : (var36_50 < var29_38 ? -1 : 1));
                    if (var27_26 < 0) {
                        var27_26 = var1_1.zzb();
                        var43_82 = var27_26;
                        var36_50 += var43_82;
                    }
                } else {
                    var29_38 = 0.0;
                }
                if ((var27_26 = (int)(var36_50 == var29_38 ? 0 : (var36_50 < var29_38 ? -1 : 1))) < 0) {
                    var4_4 = new zzai((Double)var8_8);
                    return var4_4;
                }
                var29_38 = Math.min((double)var1_1.zzb(), var36_50);
                for (var27_26 = (int)var29_38; var27_26 >= 0; var27_26 += -1) {
                    var25_24 = (int)var19_19.zzc(var27_26);
                    if (var25_24 == 0 || (var25_24 = (int)zzg.zza((zzaq)(var6_6 = var19_19.zza(var27_26)), (zzaq)var5_5)) == 0) continue;
                    var4_4 = (double)var27_26;
                    var5_5 = new zzai((Double)var4_4);
                    return var5_5;
                }
                var4_4 = new zzai((Double)var8_8);
                return var4_4;
            }
            case 5: {
                var10_10 = var1_1;
                var7_7 = var2_2;
                var4_4 = var3_3;
                var9_9 = var24_23;
                zzg.zza((String)var19_19, 1, var3_3);
                var5_5 = null;
                var4_4 = (zzaq)var3_3.get(0);
                var4_4 = var2_2.zza((zzaq)var4_4);
                var39_66 = var4_4 instanceof zzar;
                if (var39_66 != 0) {
                    var39_66 = var1_1.zza();
                    if (var39_66 == 0) {
                        return zzaq.zzc;
                    }
                    var4_4 = (zzar)var4_4;
                    zzbe.zza(var1_1, var2_2, (zzal)var4_4);
                    return zzaq.zzc;
                }
                var4_4 = new IllegalArgumentException((String)var24_23);
                throw var4_4;
            }
            case 4: {
                var10_10 = var1_1;
                var7_7 = var2_2;
                var4_4 = var3_3;
                var28_33 = 0;
                var8_8 = null;
                var39_67 = var3_3.isEmpty();
                if (var39_67 != 0) {
                    var4_4 = new zzaf();
                    return var4_4;
                }
                var39_67 = 0;
                var5_5 = null;
                var9_9 = (zzaq)var3_3.get(0);
                var47_85 = zzg.zza((var9_9 = var2_2.zza((zzaq)var9_9).zze()).doubleValue());
                var35_46 = (int)var47_85;
                if (var35_46 < 0) {
                    var42_78 = var1_1.zzb() + var35_46;
                    var35_46 = Math.max(0, var42_78);
                } else {
                    var39_67 = var1_1.zzb();
                    if (var35_46 > var39_67) {
                        var35_46 = var1_1.zzb();
                    }
                }
                var39_67 = var1_1.zzb();
                var11_11 = new zzaf();
                var38_54 = var3_3.size();
                var49_86 = 1;
                if (var38_54 > var49_86) {
                    var8_8 = (zzaq)var4_4.get(var49_86);
                    var8_8 = var7_7.zza((zzaq)var8_8).zze();
                    var43_83 = zzg.zza(var8_8.doubleValue());
                    var28_33 = (int)var43_83;
                    var38_54 = 0;
                    var12_12 = null;
                    if ((var28_33 = Math.max(0, var28_33)) > 0) {
                        var38_54 = var35_46;
                        while (true) {
                            var49_86 = var35_46 + var28_33;
                            if (var38_54 >= (var49_86 = Math.min(var39_67, var49_86))) break;
                            var13_13 = var10_10.zza(var35_46);
                            var11_11.zza((zzaq)var13_13);
                            var10_10.zzb(var35_46);
                            var49_86 = 1;
                            var38_54 += var49_86;
                        }
                    }
                    if ((var39_67 = var3_3.size()) > var25_24) {
                        for (var39_67 = 2; var39_67 < (var28_33 = var3_3.size()); var39_67 += var28_33) {
                            var8_8 = (zzaq)var4_4.get(var39_67);
                            var38_54 = (var8_8 = var7_7.zza((zzaq)var8_8)) instanceof zzaj;
                            if (var38_54 == 0) {
                                var38_54 = var35_46 + var39_67 - var25_24;
                                var10_10.zza(var38_54, (zzaq)var8_8);
                                var28_33 = 1;
                                continue;
                            }
                            var4_4 = new IllegalArgumentException("Failed to parse elements to add");
                            throw var4_4;
                        }
                    }
                    return var11_11;
                }
                while (var35_46 < var39_67) {
                    var4_4 = var10_10.zza(var35_46);
                    var11_11.zza((zzaq)var4_4);
                    var10_10.zzb(var35_46, null);
                    var25_24 = 1;
                    var35_46 += var25_24;
                }
                return var11_11;
            }
            case 3: {
                var10_10 = var1_1;
                var7_7 = var2_2;
                var4_4 = var3_3;
                return zzbe.zza(var1_1, var2_2, var3_3, true);
            }
            case 2: {
                var10_10 = var1_1;
                var7_7 = var2_2;
                var4_4 = var3_3;
                var9_9 = var24_23;
                var25_24 = 1;
                var28_34 = false;
                var8_8 = null;
                zzg.zza((String)var5_5, var25_24, var3_3);
                var5_5 = null;
                var4_4 = (zzaq)var3_3.get(0);
                var4_4 = var2_2.zza((zzaq)var4_4);
                var39_68 = var4_4 instanceof zzar;
                if (var39_68 != 0) {
                    var39_68 = var1_1.zza();
                    if (var39_68 == 0) {
                        var4_4 = new zzaf();
                        return var4_4;
                    }
                    var5_5 = (zzaf)var1_1.zzc();
                    var4_4 = (zzar)var4_4;
                    var6_6 = Boolean.TRUE;
                    var4_4 = zzbe.zza(var1_1, var2_2, (zzal)var4_4, null, (Boolean)var6_6);
                    var6_6 = new zzaf();
                    var4_4 = var4_4.zzg();
                    while ((var40_72 = var4_4.hasNext()) != 0) {
                        var40_72 = (Integer)var4_4.next();
                        var7_7 = var5_5.zza(var40_72);
                        var6_6.zza((zzaq)var7_7);
                    }
                    return var6_6;
                }
                var4_4 = new IllegalArgumentException((String)var24_23);
                throw var4_4;
            }
            case 1: {
                var10_10 = var1_1;
                var7_7 = var2_2;
                var4_4 = var3_3;
                var5_5 = (zzaf)var1_1.zzc();
                var25_24 = (int)var3_3.isEmpty();
                if (var25_24 == 0) {
                    var4_4 = var3_3.iterator();
                    while ((var25_24 = (int)var4_4.hasNext()) != 0) {
                        var6_6 = (zzaq)var4_4.next();
                        var28_35 = (var6_6 = var7_7.zza((zzaq)var6_6)) instanceof zzaj;
                        if (var28_35 == 0) {
                            var28_35 = var5_5.zzb();
                            var35_47 = var6_6 instanceof zzaf;
                            if (var35_47) {
                                var6_6 = (zzaf)var6_6;
                                var9_9 = var6_6.zzg();
                                while ((var41_76 = var9_9.hasNext()) != 0) {
                                    var10_10 = (Integer)var9_9.next();
                                    var42_79 = var10_10.intValue() + var28_35;
                                    var41_76 = var10_10.intValue();
                                    var10_10 = var6_6.zza(var41_76);
                                    var5_5.zzb(var42_79, (zzaq)var10_10);
                                }
                                continue;
                            }
                            var5_5.zzb(var28_35, (zzaq)var6_6);
                            continue;
                        }
                        var4_4 = new IllegalStateException("Failed evaluation of arguments");
                        throw var4_4;
                    }
                }
                return var5_5;
            }
            case 0: 
        }
        var10_10 = var1_1;
        var4_4 = var3_3;
        var6_6 = var7_7;
        zzg.zza((String)var7_7, 0, var3_3);
        var5_5 = var1_1.toString();
        var4_4 = new zzas((String)var5_5);
        return var4_4;
    }
}

