/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzads;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaes;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzafj;
import com.google.android.gms.internal.ads.zzafk;
import com.google.android.gms.internal.ads.zzafm;
import com.google.android.gms.internal.ads.zzafo;
import com.google.android.gms.internal.ads.zzafp;
import com.google.android.gms.internal.ads.zzafq;
import com.google.android.gms.internal.ads.zzafr;
import com.google.android.gms.internal.ads.zzafs;
import com.google.android.gms.internal.ads.zzaft;
import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public final class zzafn
implements zzadu {
    private final zzfu zza;
    private final zzafm zzb;
    private final zzalt zzc;
    private int zzd;
    private zzadx zze;
    private zzafo zzf;
    private long zzg;
    private zzafq[] zzh;
    private long zzi;
    private zzafq zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private boolean zzo;

    public zzafn() {
        zzalt zzalt2 = zzalt.zza;
        this(1, zzalt2);
    }

    public zzafn(int n3, zzalt zzalt2) {
        long l2;
        this.zzc = zzalt2;
        zzafq[] zzafqArray = new zzfu(12);
        this.zza = zzafqArray;
        zzafqArray = new zzafm(null);
        this.zzb = zzafqArray;
        zzafqArray = new zzads();
        this.zze = zzafqArray;
        zzafqArray = new zzafq[]{};
        this.zzh = zzafqArray;
        this.zzl = l2 = (long)-1;
        this.zzm = l2;
        this.zzk = -1;
        this.zzg = -9223372036854775807L;
    }

    public static /* bridge */ /* synthetic */ zzafq[] zza(zzafn zzafn2) {
        return zzafn2.zzh;
    }

    private final zzafq zzg(int n3) {
        for (zzafq zzafq2 : this.zzh) {
            boolean bl2 = zzafq2.zzg(n3);
            if (!bl2) continue;
            return zzafq2;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int zzb(zzadv var1_1, zzaeq var2_2) {
        block44: {
            block45: {
                block46: {
                    block47: {
                        var3_3 = this;
                        var4_4 = var1_1;
                        var5_5 = this.zzi;
                        var7_6 = 1;
                        var8_7 = 0;
                        var9_8 = -1;
                        cfr_temp_0 = var5_5 - var9_8;
                        var11_9 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var11_9 /* !! */  == false) ** GOTO lbl19
                        var12_10 = var1_1.zzf();
                        cfr_temp_1 = var5_5 - var12_10;
                        var14_11 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                        if (var14_11 /* !! */  >= 0 && (var17_13 = (cfr_temp_2 = var5_5 - (var15_12 = 262144L + var12_10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) <= 0) {
                            var18_14 = var1_1;
                            var18_14 = (zzadi)var1_1;
                            var19_15 = (int)(var5_5 -= var12_10);
                            var18_14.zzo(var19_15, false);
lbl19:
                            // 2 sources

                            var20_16 = 0;
                            var21_17 = null;
                        } else {
                            var18_14 = var2_2;
                            var2_2.zza = var5_5;
                            var20_16 = 1;
                        }
                        var3_3.zzi = var9_8;
                        if (var20_16 != 0) {
                            return var7_6;
                        }
                        var20_16 = var3_3.zzd;
                        var19_15 = 12;
                        var11_9 /* !! */  = 0;
                        var18_14 = null;
                        if (var20_16 == 0) break block44;
                        var22_18 = 1819436136;
                        var14_11 /* !! */  = 1414744396;
                        var23_19 = 2;
                        if (var20_16 == var7_6) break block45;
                        var17_13 = 3;
                        if (var20_16 != var23_19) {
                            var22_18 = 1769369453;
                            var23_19 = 6;
                            var24_20 = 4;
                            var25_21 = 8;
                            var27_23 = 16;
                            if (var20_16 != var17_13) {
                                var28_25 = 5;
                                var29_28 = 8;
                                if (var20_16 != var24_20) {
                                    if (var20_16 != var28_25) {
                                        var30_31 = var1_1.zzf();
                                        cfr_temp_3 = var30_31 - (var32_34 = var3_3.zzm);
                                        var20_16 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                        if (var20_16 >= 0) {
                                            var8_7 = -1;
                                        } else {
                                            var21_17 = var3_3.zzj;
                                            if (var21_17 != null) {
                                                var34_35 = var21_17.zzh((zzadv)var4_4);
                                                if (var34_35) {
                                                    var3_3.zzj = null;
                                                    return 0;
                                                }
                                            } else {
                                                var30_31 = var1_1.zzf();
                                                var32_34 = 1L;
                                                cfr_temp_4 = (var30_31 &= var32_34) - var32_34;
                                                var20_16 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                                                if (var20_16 == 0) {
                                                    var21_17 = var4_4;
                                                    var21_17 = (zzadi)var4_4;
                                                    var21_17.zzo(var7_6, false);
                                                }
                                                var21_17 = var3_3.zza.zzM();
                                                var35_39 = var4_4;
                                                var35_39 = (zzadi)var4_4;
                                                var35_39.zzm((byte[])var21_17, 0, var19_15, false);
                                                var3_3.zza.zzK(0);
                                                var21_17 = var3_3.zza;
                                                var20_16 = var21_17.zzi();
                                                if (var20_16 == var14_11 /* !! */ ) {
                                                    var3_3.zza.zzK(var29_28);
                                                    var21_17 = var3_3.zza;
                                                    var20_16 = var21_17.zzi();
                                                    if (var20_16 != var22_18) {
                                                        var19_15 = 8;
                                                    }
                                                    var35_39.zzo(var19_15, false);
                                                    var1_1.zzj();
                                                } else {
                                                    var36_41 = var3_3.zza;
                                                    var19_15 = var36_41.zzi();
                                                    var28_25 = 1263424842;
                                                    if (var20_16 == var28_25) {
                                                        var5_5 = var19_15;
                                                        var3_3.zzi = var9_8 = var1_1.zzf() + var5_5 + var25_21;
                                                    } else {
                                                        var35_39.zzo(var29_28, false);
                                                        var1_1.zzj();
                                                        var21_17 = var3_3.zzg(var20_16);
                                                        if (var21_17 == null) {
                                                            var5_5 = var19_15;
                                                            var3_3.zzi = var9_8 = var1_1.zzf() + var5_5;
                                                        } else {
                                                            var21_17.zze(var19_15);
                                                            var3_3.zzj = var21_17;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return var8_7;
                                    }
                                    var21_17 = new zzfu;
                                    var19_15 = var3_3.zzn;
                                    var21_17(var19_15);
                                    var36_42 = var21_17.zzM();
                                    var28_25 = var3_3.zzn;
                                    var4_4 = (zzadi)var4_4;
                                    var4_4.zzn(var36_42, 0, var28_25, false);
                                    var34_36 = var21_17.zzb();
                                    if (var34_36 < var27_23) {
                                        var37_46 = 0L;
                                    } else {
                                        var34_36 = var21_17.zzd();
                                        var21_17.zzL(var29_28);
                                        var9_8 = var21_17.zzi();
                                        var12_10 = var3_3.zzl;
                                        var19_15 = (int)(var9_8 == var12_10 ? 0 : (var9_8 < var12_10 ? -1 : 1));
                                        var37_46 = var19_15 > 0 ? 0L : (var9_8 = var12_10 + var25_21);
                                        var21_17.zzK(var34_36);
                                    }
                                    while ((var34_36 = var21_17.zzb()) >= var27_23) {
                                        var34_36 = var21_17.zzi();
                                        var19_15 = var21_17.zzi();
                                        var28_25 = var21_17.zzi();
                                        var9_8 = (long)var28_25 + var37_46;
                                        var21_17.zzi();
                                        var4_4 = var3_3.zzg(var34_36);
                                        if (var4_4 == null) continue;
                                        if ((var19_15 &= var27_23) == var27_23) {
                                            var4_4.zzb(var9_8);
                                        }
                                        var4_4.zzd();
                                    }
                                    var4_4 = var3_3.zzh;
                                    var20_16 = ((zzafq[])var4_4).length;
                                    var36_42 = null;
                                    for (var19_15 = 0; var19_15 < var20_16; ++var19_15) {
                                        var39_47 = var4_4[var19_15];
                                        var39_47.zzc();
                                    }
                                    var3_3.zzo = var7_6;
                                    var4_4 = var3_3.zze;
                                    var40_50 = var3_3.zzg;
                                    var21_17 = new zzafk(var3_3, var40_50);
                                    var4_4.zzO((zzaet)var21_17);
                                    var3_3.zzd = var23_19;
                                    var3_3.zzi = var42_53 = var3_3.zzl;
                                    return 0;
                                }
                                var21_17 = var3_3.zza.zzM();
                                var36_43 = var4_4;
                                var36_43 = (zzadi)var4_4;
                                var36_43.zzn((byte[])var21_17, 0, var29_28, false);
                                var3_3.zza.zzK(0);
                                var21_17 = var3_3.zza;
                                var19_15 = var21_17.zzi();
                                var20_16 = var21_17.zzi();
                                var7_6 = 829973609;
                                if (var19_15 == var7_6) {
                                    var3_3.zzd = var28_25;
                                    var3_3.zzn = var20_16;
                                } else {
                                    var40_51 = var1_1.zzf();
                                    var42_54 = var20_16;
                                    var3_3.zzi = var40_51 += var42_54;
                                }
                                return 0;
                            }
                            var30_32 = var3_3.zzl;
                            cfr_temp_5 = var30_32 - var9_8;
                            var20_16 = (int)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                            if (var20_16 != 0 && (var20_16 = (int)((cfr_temp_6 = (var9_8 = var1_1.zzf()) - var30_32) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1))) != 0) {
                                var3_3.zzi = var30_32;
                                return 0;
                            }
                            var21_17 = var3_3.zza.zzM();
                            var39_48 = var4_4;
                            ((zzadi)var4_4).zzm((byte[])var21_17, 0, var19_15, false);
                            var1_1.zzj();
                            var3_3.zza.zzK(0);
                            var21_17 = var3_3.zzb;
                            var39_48 = var3_3.zza;
                            var21_17.zza((zzfu)var39_48);
                            var21_17 = var3_3.zza;
                            var39_48 = var3_3.zzb;
                            var20_16 = var21_17.zzi();
                            var29_29 = var39_48.zza;
                            var11_9 /* !! */  = 1179011410;
                            if (var29_29 == var11_9 /* !! */ ) {
                                ((zzadi)var4_4).zzo(var19_15, false);
                                return 0;
                            }
                            if (var29_29 == var14_11 /* !! */  && var20_16 == var22_18) {
                                var3_3.zzl = var5_5 = var1_1.zzf();
                                var9_8 = var39_48.zzb;
                                var3_3.zzm = var5_5 = var5_5 + var9_8 + var25_21;
                                var28_26 = var3_3.zzo;
                                if (var28_26 == 0) {
                                    var39_48 = var3_3.zzf;
                                    var39_48.getClass();
                                    var28_26 = var39_48.zzb & var27_23;
                                    if (var28_26 != var27_23) {
                                        var21_17 = var3_3.zze;
                                        var9_8 = var3_3.zzg;
                                        var12_10 = 0L;
                                        var36_44 = new zzaes(var9_8, var12_10);
                                        var21_17.zzO(var36_44);
                                        var3_3.zzo = var7_6;
                                    } else {
                                        var3_3.zzd = var24_20;
                                        var3_3.zzi = var5_5;
                                        return 0;
                                    }
                                }
                                var3_3.zzi = var42_55 = var1_1.zzf() + (long)12;
                                var3_3.zzd = 6;
                                return 0;
                            }
                            var42_56 = var1_1.zzf();
                            var40_52 = var39_48.zzb;
                            var3_3.zzi = var42_56 = var42_56 + var40_52 + var25_21;
                            return 0;
                        }
                        var20_16 = var3_3.zzk + -4;
                        var36_45 = new zzfu(var20_16);
                        var39_49 = var36_45.zzM();
                        ((zzadi)var4_4).zzn(var39_49, 0, var20_16, false);
                        var4_4 = zzafr.zzc(var22_18, (zzfu)var36_45);
                        var20_16 = var4_4.zza();
                        if (var20_16 != var22_18) break block46;
                        var21_17 = (zzafo)var4_4.zzb(zzafo.class);
                        if (var21_17 == null) break block47;
                        var3_3.zzf = var21_17;
                        var19_15 = var21_17.zza;
                        var20_16 = var21_17.zzc;
                        var9_8 = var20_16;
                        var5_5 = var19_15;
                        var3_3.zzg = var9_8 *= var5_5;
                        var21_17 = new ArrayList();
                        var4_4 = var4_4.zza;
                        var19_15 = var4_4.size();
                        var28_27 = 0;
                        var39_49 = null;
                        var27_24 = 0;
                        while (var28_27 < var19_15) {
                            block52: {
                                block48: {
                                    block43: {
                                        block51: {
                                            block49: {
                                                block50: {
                                                    var44_57 = (zzafj)var4_4.get(var28_27);
                                                    var22_18 = var44_57.zza();
                                                    if (var22_18 != (var14_11 /* !! */  = (long)1819440243)) break block48;
                                                    var44_57 = (zzafr)var44_57;
                                                    var22_18 = var27_24 + 1;
                                                    var45_58 = (zzafp)var44_57.zzb(zzafp.class);
                                                    var46_59 = (zzafs)var44_57.zzb(zzafs.class);
                                                    var47_60 = "AviExtractor";
                                                    if (var45_58 == null) {
                                                        var44_57 = "Missing Stream Header";
                                                        zzfk.zzf(var47_60, (String)var44_57);
lbl258:
                                                        // 2 sources

                                                        while (true) {
                                                            var48_61 = var28_27;
                                                            var14_11 /* !! */  = 0;
                                                            var45_58 = null;
                                                            var49_62 = var22_18;
                                                            break block43;
                                                            break;
                                                        }
                                                    }
                                                    if (var46_59 == null) {
                                                        var44_57 = "Missing Stream Format";
                                                        zzfk.zzf(var47_60, (String)var44_57);
                                                        ** continue;
                                                    }
                                                    var50_63 = var45_58.zzd;
                                                    var11_9 /* !! */  = var45_58.zzb;
                                                    var17_13 = var45_58.zzc;
                                                    var48_61 = var28_27;
                                                    var51_64 = var11_9 /* !! */ ;
                                                    var30_33 = var17_13;
                                                    var53_65 = RoundingMode.FLOOR;
                                                    var49_62 = var22_18;
                                                    var12_10 = var50_63;
                                                    var54_66 = 1000000L;
                                                    var56_67 = var51_64 * var54_66;
                                                    var51_64 = zzgd.zzt(var12_10, var56_67, var30_33, var53_65);
                                                    var18_14 = var46_59.zza;
                                                    var58_68 = var18_14.zzb();
                                                    var58_68.zzJ(var27_24);
                                                    var23_19 = var45_58.zze;
                                                    if (var23_19 != 0) {
                                                        var58_68.zzP(var23_19);
                                                    }
                                                    if ((var44_57 = (zzaft)var44_57.zzb(var59_69 = zzaft.class)) != null) {
                                                        var44_57 = var44_57.zza;
                                                        var58_68.zzM((String)var44_57);
                                                    }
                                                    if ((var29_30 = zzcg.zzb((String)(var44_57 = var18_14.zzn))) == var7_6) break block49;
                                                    var11_9 /* !! */  = 2;
                                                    if (var29_30 != var11_9 /* !! */ ) break block50;
                                                    var50_63 = 2;
                                                    break block51;
                                                }
                                                var14_11 /* !! */  = 0;
                                                var45_58 = null;
                                                break block43;
                                            }
                                            var50_63 = var29_30;
                                        }
                                        var44_57 = var3_3.zze.zzw(var27_24, var50_63);
                                        var58_68 = var58_68.zzad();
                                        var44_57.zzl((zzan)var58_68);
                                        var22_18 = var45_58.zzd;
                                        var46_59 = var45_58;
                                        var25_22 = var51_64;
                                        var45_58 = new zzafq(var27_24, var50_63, var51_64, var22_18, (zzafa)var44_57);
                                        var3_3.zzg = var51_64;
                                    }
                                    if (var45_58 != null) {
                                        var21_17.add(var45_58);
                                    }
                                    var27_24 = var49_62;
                                    break block52;
                                }
                                var48_61 = var28_27;
                            }
                            var28_27 = var48_61 + 1;
                            var8_7 = 0;
                            var11_9 /* !! */  = 0;
                            var18_14 = null;
                            var23_19 = 2;
                            var17_13 = 3;
                        }
                        var4_4 = new zzafq[]{};
                        var4_4 = (zzafq[])var21_17.toArray((T[])var4_4);
                        var3_3.zzh = var4_4;
                        var3_3.zze.zzD();
                        var3_3.zzd = 3;
                        return 0;
                    }
                    throw zzch.zza("AviHeader not found", null);
                }
                var34_37 = var4_4.zza();
                var36_45 = new StringBuilder("Unexpected header list type ");
                var36_45.append(var34_37);
                throw zzch.zza(var36_45.toString(), null);
            }
            var21_17 = var3_3.zza.zzM();
            var4_4 = (zzadi)var4_4;
            var7_6 = 0;
            var35_40 = null;
            var4_4.zzn((byte[])var21_17, 0, var19_15, false);
            var3_3.zza.zzK(0);
            var4_4 = var3_3.zzb;
            var21_17 = var3_3.zza;
            var4_4.zza((zzfu)var21_17);
            var19_15 = var4_4.zza;
            if (var19_15 == var14_11 /* !! */ ) {
                var4_4.zzc = var20_16 = var21_17.zzi();
                var4_4 = var3_3.zzb;
                var20_16 = var4_4.zzc;
                if (var20_16 == var22_18) {
                    var3_3.zzk = var34_38 = var4_4.zzb;
                    var3_3.zzd = 2;
                    return 0;
                }
                var4_4 = new StringBuilder("hdrl expected, found: ");
                var4_4.append(var20_16);
                throw zzch.zza(var4_4.toString(), null);
            }
            var4_4 = new StringBuilder("LIST expected, found: ");
            var4_4.append(var19_15);
            throw zzch.zza(var4_4.toString(), null);
        }
        var20_16 = 0;
        var21_17 = null;
        var8_7 = this.zzf(var1_1);
        if (var8_7 != 0) {
            ((zzadi)var4_4).zzo(var19_15, false);
            var3_3.zzd = var7_6;
            return 0;
        }
        throw zzch.zza("AVI Header List not found", null);
    }

    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    public final void zzd(zzadx zzadx2) {
        this.zzd = 0;
        this.zze = zzadx2;
        this.zzi = -1;
    }

    public final void zze(long l2, long l3) {
        int n3;
        this.zzi = l3 = (long)-1;
        this.zzj = null;
        zzafq[] zzafqArray = this.zzh;
        int n4 = zzafqArray.length;
        int n7 = 0;
        for (n3 = 0; n3 < n4; ++n3) {
            zzafq zzafq2 = zzafqArray[n3];
            zzafq2.zzf(l2);
        }
        l3 = 0L;
        long l4 = l2 - l3;
        n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
        if (n3 == 0) {
            zzafq[] zzafqArray2 = this.zzh;
            int n8 = zzafqArray2.length;
            if (n8 != 0) {
                n7 = 3;
            }
            this.zzd = n7;
            return;
        }
        this.zzd = 6;
    }

    public final boolean zzf(zzadv object) {
        byte[] byArray = this.zza.zzM();
        object = (zzadi)object;
        int n3 = 12;
        ((zzadi)object).zzm(byArray, 0, n3, false);
        this.zza.zzK(0);
        object = this.zza;
        int n4 = ((zzfu)object).zzi();
        int n7 = 1179011410;
        if (n4 != n7) {
            return false;
        }
        this.zza.zzL(4);
        object = this.zza;
        n4 = ((zzfu)object).zzi();
        n7 = 541677121;
        return n4 == n7;
    }
}

