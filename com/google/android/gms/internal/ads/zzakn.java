/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaii;
import com.google.android.gms.internal.ads.zzaij;
import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxr;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzfyt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

final class zzakn {
    private static final zzfyt zza = zzfyt.zzc(zzfxr.zzc(':'));
    private static final zzfyt zzb = zzfyt.zzc(zzfxr.zzc('*'));
    private final List zzc;
    private int zzd;
    private int zze;

    public zzakn() {
        ArrayList arrayList;
        this.zzc = arrayList = new ArrayList();
        this.zzd = 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int zza(zzadv var1_1, zzaeq var2_2, List var3_3) {
        block34: {
            block35: {
                block44: {
                    block36: {
                        block43: {
                            block37: {
                                var4_4 = this;
                                var5_5 = var1_1;
                                var6_7 = var2_2;
                                var7_8 = this.zzd;
                                var8_9 = 1;
                                if (var7_8 == 0) break block35;
                                var9_10 = 8;
                                var10_11 = 2;
                                var11_12 = 0;
                                if (var7_8 == var8_9) break block36;
                                var12_13 = 2817;
                                var13_14 = 2816;
                                var14_15 = 2192;
                                var15_16 = 3;
                                if (var7_8 == var10_11) break block37;
                                var16_17 = var1_1.zzf();
                                var18_18 = var1_1.zzd();
                                var20_19 = var1_1.zzf();
                                var7_8 = this.zze;
                                var22_20 = var7_8;
                                var22_20 = (var18_18 -= var20_19) - var22_20;
                                var25_25 = (int)var22_20;
                                var24_22 = new zzfu(var25_25);
                                var26_27 = var24_22.zzM();
                                var1_1.zzi((byte[])var26_27, 0, var25_25);
                                var5_5 = null;
                                for (var27_29 /* !! */  = (long)0; var27_29 /* !! */  < (var28_30 = (var26_27 = (Object)var4_4.zzc).size()); ++var27_29 /* !! */ ) {
                                    block42: {
                                        block39: {
                                            block40: {
                                                block41: {
                                                    block38: {
                                                        var26_27 = (zzakm)var4_4.zzc.get((int)var27_29 /* !! */ );
                                                        var29_32 = var26_27.zza - var16_17;
                                                        var9_10 = (int)var29_32;
                                                        var24_22.zzK(var9_10);
                                                        var9_10 = 4;
                                                        var24_22.zzL(var9_10);
                                                        var11_12 = var24_22.zzi();
                                                        var31_33 = zzfxs.zzc;
                                                        var32_35 = var24_22.zzA(var11_12, (Charset)var31_33);
                                                        var33_38 = var32_35.hashCode();
                                                        switch (var33_38) {
                                                            default: {
                                                                break;
                                                            }
                                                            case 1760745220: {
                                                                var34_39 = "Super_SlowMotion_BGM";
                                                                var25_25 = (int)var32_35.equals(var34_39);
                                                                if (var25_25 == 0) break;
                                                                var25_25 = 2;
                                                                break block38;
                                                            }
                                                            case -830665521: {
                                                                var34_39 = "Super_SlowMotion_Deflickering_On";
                                                                var25_25 = (int)var32_35.equals(var34_39);
                                                                if (var25_25 == 0) break;
                                                                var25_25 = 4;
                                                                break block38;
                                                            }
                                                            case -1251387154: {
                                                                var34_39 = "Super_SlowMotion_Data";
                                                                var25_25 = (int)var32_35.equals(var34_39);
                                                                if (var25_25 == 0) break;
                                                                var25_25 = 1;
                                                                break block38;
                                                            }
                                                            case -1332107749: {
                                                                var34_39 = "Super_SlowMotion_Edit_Data";
                                                                var25_25 = (int)var32_35.equals(var34_39);
                                                                if (var25_25 == 0) break;
                                                                var25_25 = 3;
                                                                break block38;
                                                            }
                                                            case -1711564334: {
                                                                var34_39 = "SlowMotion_Data";
                                                                var25_25 = (int)var32_35.equals(var34_39);
                                                                if (var25_25 == 0) break;
                                                                var25_25 = 0;
                                                                var32_35 = null;
                                                                break block38;
                                                            }
                                                        }
                                                        var25_25 = -1;
                                                    }
                                                    var35_41 = false;
                                                    var34_39 = null;
                                                    if (var25_25 == 0) break block39;
                                                    if (var25_25 == var8_9) break block40;
                                                    if (var25_25 == var10_11) break block41;
                                                    if (var25_25 == var15_16) ** GOTO lbl84
                                                    if (var25_25 == var9_10) {
                                                        var25_25 = 2820;
                                                    } else {
                                                        throw zzch.zza("Invalid SEF name", null);
lbl84:
                                                        // 1 sources

                                                        var25_25 = 2819;
                                                    }
                                                    break block42;
                                                }
                                                var25_25 = 2817;
                                                break block42;
                                            }
                                            var25_25 = 2816;
                                            break block42;
                                        }
                                        var25_25 = 2192;
                                    }
                                    var28_30 = var26_27.zzb;
                                    var28_30 -= (var11_12 += 8);
                                    if (var25_25 != var14_15) {
                                        if (var25_25 != var13_14 && var25_25 != var12_13 && var25_25 != (var28_30 = 2819) && var25_25 != (var28_30 = 2820)) {
                                            var5_5 = new IllegalStateException();
                                            throw var5_5;
                                        }
                                        var36_43 = var3_3;
                                    } else {
                                        var36_43 = new List<Object>();
                                        var26_27 = var24_22.zzA(var28_30, (Charset)var31_33);
                                        var32_35 = zzakn.zzb;
                                        var26_27 = var32_35.zzf((CharSequence)var26_27);
                                        for (var11_12 = 0; var11_12 < (var25_25 = var26_27.size()); ++var11_12) {
                                            var32_35 = zzakn.zza;
                                            var31_33 = (CharSequence)var26_27.get(var11_12);
                                            var25_25 = (var31_33 = var32_35.zzf((CharSequence)var31_33)).size();
                                            if (var25_25 == var15_16) {
                                                var25_25 = 0;
                                                var32_35 = null;
                                                try {
                                                    var37_44 /* !! */  = var31_33.get(0);
                                                }
                                                catch (NumberFormatException var5_6) {
                                                    throw zzch.zza(null, var5_6);
                                                }
                                                var37_44 /* !! */  = (String)var37_44 /* !! */ ;
                                                var38_45 = Long.parseLong(var37_44 /* !! */ );
                                                var37_44 /* !! */  = var31_33.get(var8_9);
                                                var37_44 /* !! */  = (String)var37_44 /* !! */ ;
                                                var40_46 = Long.parseLong(var37_44 /* !! */ );
                                                var31_33 = var31_33.get(var10_11);
                                                var31_33 = (String)var31_33;
                                                var42_47 = Integer.parseInt((String)var31_33) + -1;
                                                var43_48 = var8_9 << var42_47;
                                                var31_33 = new zzaii(var38_45, var40_46, var43_48);
                                                var36_43.add(var31_33);
                                                continue;
                                            }
                                            throw zzch.zza(null, null);
                                        }
                                        var26_27 = new zzaij(var36_43);
                                        var36_43 = var3_3;
                                        var3_3.add(var26_27);
                                    }
                                    var11_12 = 0;
                                }
                                var6_7.zza = var29_32 = 0L;
lbl149:
                                // 5 sources

                                while (true) {
                                    var27_29 /* !! */  = 1;
                                    break block34;
                                    break;
                                }
                            }
                            var44_49 = var1_1.zzd();
                            var11_12 = this.zze + -20;
                            var31_34 = new zzfu(var11_12);
                            var34_40 = var31_34.zzM();
                            var25_26 = 0;
                            var32_36 = null;
                            var1_1.zzi(var34_40, 0, var11_12);
                            var5_5 = null;
                            for (var27_29 /* !! */  = (long)0; var27_29 /* !! */  < (var35_42 = var11_12 / 12); ++var27_29 /* !! */ ) {
                                var31_34.zzL(var10_11);
                                var35_42 = var31_34.zzC();
                                if (var35_42 != var14_15 && var35_42 != var13_14 && var35_42 != var12_13 && var35_42 != (var25_26 = 2819) && var35_42 != (var25_26 = 2820)) {
                                    var31_34.zzL(var9_10);
                                    var46_53 = var11_12;
                                } else {
                                    var47_54 = var4_4.zze;
                                    var47_54 = var44_49 - var47_54;
                                    var25_26 = var31_34.zzi();
                                    var46_53 = var11_12;
                                    var49_55 = var25_26;
                                    var25_26 = var31_34.zzi();
                                    var51_56 = var4_4.zzc;
                                    var52_57 = new zzakm(var35_42, var47_54 -= var49_55, var25_26);
                                    var51_56.add(var52_57);
                                }
                                var11_12 = var46_53;
                                var8_9 = 1;
                                var10_11 = 2;
                                var12_13 = 2817;
                                var13_14 = 2816;
                                var14_15 = 2192;
                            }
                            var5_5 = var4_4.zzc;
                            var27_29 /* !! */  = (long)var5_5.isEmpty();
                            if (var27_29 /* !! */  == false) break block43;
                            var6_7.zza = var44_49 = 0L;
                            ** GOTO lbl149
                        }
                        var4_4.zzd = var15_16;
                        var5_5 = var4_4.zzc;
                        var7_8 = 0;
                        var24_23 = null;
                        var5_5 = (zzakm)var5_5.get(0);
                        var6_7.zza = var44_49 = var5_5.zza;
                        ** GOTO lbl149
                    }
                    var24_24 = null;
                    var26_28 = new zzfu(var9_10);
                    var32_37 = var26_28.zzM();
                    var1_1.zzi(var32_37, 0, var9_10);
                    this.zze = var7_8 = var26_28.zzi() + var9_10;
                    var7_8 = var26_28.zzg();
                    var28_31 = 1397048916;
                    if (var7_8 == var28_31) break block44;
                    var2_2.zza = var44_50 = 0L;
                    ** GOTO lbl149
                }
                var44_51 = var1_1.zzf();
                var53_58 = this.zze + -12;
                var2_2.zza = var44_51 -= var53_58;
                var27_29 /* !! */  = 2;
                this.zzd = (int)var27_29 /* !! */ ;
                ** while (true)
            }
            var44_52 = 0L;
            var53_59 = var1_1.zzd();
            cfr_temp_0 = var53_59 - (var55_60 = (long)-1);
            var27_29 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
            if (var27_29 /* !! */  == false || (var27_29 /* !! */  = (cfr_temp_1 = var53_59 - (var55_60 = (long)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) < 0) {
                var22_21 = var44_52;
            } else {
                var44_52 = -8;
                var22_21 = var53_59 + var44_52;
            }
            var6_7.zza = var22_21;
            var27_29 /* !! */  = 1;
            var4_4.zzd = (int)var27_29 /* !! */ ;
        }
        return (int)var27_29 /* !! */ ;
    }

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }
}

