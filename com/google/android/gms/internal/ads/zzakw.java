/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzady;
import com.google.android.gms.internal.ads.zzalc;
import com.google.android.gms.internal.ads.zzald;
import com.google.android.gms.internal.ads.zzali;
import com.google.android.gms.internal.ads.zzeq;
import java.io.EOFException;
import java.io.IOException;

final class zzakw
implements zzald {
    private final zzalc zza;
    private final long zzb;
    private final long zzc;
    private final zzali zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzakw(zzali object, long l2, long l3, long l4, long l7, boolean bl2) {
        int n3;
        long l8 = 0L;
        long l12 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
        n3 = l12 >= 0 && (n3 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1)) > 0 ? 1 : 0;
        zzeq.zzd(n3 != 0);
        this.zzd = object;
        this.zzb = l2;
        this.zzc = l3;
        long l14 = l4 - (l3 -= l2);
        long l15 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (l15 != false && !bl2) {
            this.zze = 0;
        } else {
            this.zzf = l7;
            l15 = 4;
            this.zze = (int)l15;
        }
        this.zza = object = new zzalc();
    }

    public static /* bridge */ /* synthetic */ long zza(zzakw zzakw2) {
        return zzakw2.zzc;
    }

    public static /* bridge */ /* synthetic */ long zzb(zzakw zzakw2) {
        return zzakw2.zzb;
    }

    public static /* bridge */ /* synthetic */ long zzc(zzakw zzakw2) {
        return zzakw2.zzf;
    }

    public static /* bridge */ /* synthetic */ zzali zzf(zzakw zzakw2) {
        return zzakw2.zzd;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long zzd(zzadv var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = this.zze;
        var5_5 = 1;
        var6_6 = 0;
        var7_7 = -1;
        if (var4_4 != 0) {
            if (var4_4 != var5_5) {
                var5_5 = 2;
                var9_8 = 3;
                if (var4_4 != var5_5) {
                    if (var4_4 != var9_8) {
                        return var7_7;
                    }
                } else {
                    var10_9 = this.zzi;
                    var12_10 = this.zzj;
                    cfr_temp_0 = var10_9 - var12_10;
                    var14_11 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var14_11 /* !! */  == false) {
                        while (true) {
                            var12_10 = var7_7;
                            break;
                        }
                    } else {
                        var10_9 = var1_1.zzf();
                        var15_12 = this.zza;
                        var16_13 = var15_12.zzc(var1_1, var12_10);
                        if (!var16_13) {
                            var12_10 = this.zzi;
                            cfr_temp_1 = var12_10 - var10_9;
                            var14_11 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                            if (var14_11 /* !! */  == false) {
                                var3_3 = new IOException("No ogg page can be found.");
                                throw var3_3;
                            }
                        } else {
                            var17_14 = this.zza;
                            var17_14.zzb(var1_1, false);
                            var1_1.zzj();
                            var12_10 = this.zzh;
                            var15_12 = this.zza;
                            var18_15 = var15_12.zzb;
                            var20_16 = var15_12.zzd;
                            var21_18 = var15_12.zze;
                            var20_16 += var21_18;
                            var22_20 = 0L;
                            if ((var21_18 = (int)((cfr_temp_2 = (var12_10 -= var18_15) - var22_20) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) >= 0 && (var14_11 /* !! */  = (cfr_temp_3 = var12_10 - (var22_20 = 72000L)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) < 0) ** continue;
                            if (var21_18 < 0) {
                                var2_2.zzj = var10_9;
                                var2_2.zzl = var18_15;
                            } else {
                                var10_9 = var20_16;
                                var22_20 = var1_1.zzf();
                                var2_2.zzi = var10_9 = var22_20 + var10_9;
                                var2_2.zzk = var18_15;
                            }
                            var10_9 = var2_2.zzj;
                            var24_21 = var2_2.zzi;
                            var22_20 = var10_9 - var24_21;
                            var26_22 = 100000L;
                            var28_23 = var22_20 == var26_22 ? 0 : (var22_20 < var26_22 ? -1 : 1);
                            if (var28_23 < 0) {
                                var2_2.zzj = var24_21;
                                var12_10 = var24_21;
                            } else {
                                var29_24 = var20_16;
                                var31_26 = var21_18 <= 0 ? (long)2 : 1L;
                                var33_28 = var1_1.zzf();
                                var33_28 -= (var29_24 *= var31_26);
                                var12_10 *= var22_20;
                                var29_24 = var2_2.zzl;
                                var31_26 = var2_2.zzk;
                                var12_10 = var12_10 / (var29_24 -= var31_26) + var33_28;
                                var10_9 += var7_7;
                                var10_9 = Math.min(var12_10, var10_9);
                                var12_10 = Math.max(var24_21, var10_9);
                            }
                        }
                    }
                    var4_4 = (int)(var12_10 == var7_7 ? 0 : (var12_10 < var7_7 ? -1 : 1));
                    if (var4_4 != 0) {
                        return var12_10;
                    }
                    var2_2.zze = var9_8;
                }
                while (true) {
                    var2_2.zza.zzc((zzadv)var3_3, var7_7);
                    var35_29 = var2_2.zza;
                    var5_5 = 0;
                    var35_29.zzb((zzadv)var3_3, false);
                    var35_29 = var2_2.zza;
                    var36_31 = var35_29.zzb;
                    var31_26 = var2_2.zzh;
                    var6_6 = (int)(var36_31 == var31_26 ? 0 : (var36_31 < var31_26 ? -1 : 1));
                    if (var6_6 > 0) {
                        var1_1.zzj();
                        var2_2.zze = 4;
                        return -(var2_2.zzk + (long)2);
                    }
                    var29_24 = 2;
                    var5_5 = var35_29.zzd;
                    var4_4 = var35_29.zze;
                    var35_29 = var3_3;
                    var35_29 = (zzadi)var3_3;
                    var20_16 = 0;
                    var35_29.zzo(var5_5 += var4_4, false);
                    var2_2.zzi = var10_9 = var1_1.zzf();
                    var35_29 = var2_2.zza;
                    var2_2.zzk = var10_9 = var35_29.zzb;
                }
            }
        } else {
            this.zzg = var29_25 = var1_1.zzf();
            this.zze = var5_5;
            var31_27 = this.zzc;
            var38_32 = 4294901989L;
            cfr_temp_4 = (var31_27 += var38_32) - var29_25;
            var4_4 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
            if (var4_4 > 0) {
                return var31_27;
            }
        }
        var2_2.zza.zza();
        var35_30 = var2_2.zza;
        var4_4 = (int)var35_30.zzc((zzadv)var3_3, var7_7);
        if (var4_4 != 0) {
            var2_2.zza.zzb((zzadv)var3_3, false);
            var35_30 = var2_2.zza;
            var6_6 = var35_30.zzd;
            var4_4 = var35_30.zze;
            var35_30 = var3_3;
            ((zzadi)var3_3).zzo(var6_6 += var4_4, false);
            var35_30 = var2_2.zza;
            var29_25 = var35_30.zzb;
            while (true) {
                var35_30 = var2_2.zza;
                var20_17 = var35_30.zza;
                var21_19 = 4;
                if ((var20_17 &= var21_19) == var21_19 || (var4_4 = (int)var35_30.zzc((zzadv)var3_3, var7_7)) == 0 || (var4_4 = (int)((cfr_temp_5 = (var31_27 = var1_1.zzf()) - (var38_32 = var2_2.zzc)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1))) >= 0 || (var4_4 = (var35_30 = var2_2.zza).zzb((zzadv)var3_3, (boolean)var5_5)) == 0) break;
                var35_30 = var2_2.zza;
                var20_17 = var35_30.zzd;
                var4_4 = var35_30.zze;
                if ((var4_4 = (int)zzady.zze((zzadv)var3_3, var20_17 += var4_4)) == 0) break;
                var35_30 = var2_2.zza;
                var29_25 = var35_30.zzb;
            }
            var2_2.zzf = var29_25;
            var2_2.zze = 4;
            return var2_2.zzg;
        }
        var3_3 = new EOFException();
        throw var3_3;
    }

    public final void zzg(long l2) {
        long l3 = this.zzf + (long)-1;
        l2 = Math.min(l2, l3);
        l3 = 0L;
        this.zzh = l2 = Math.max(l3, l2);
        this.zze = 2;
        this.zzi = l2 = this.zzb;
        this.zzj = l2 = this.zzc;
        this.zzk = l3;
        this.zzl = l2 = this.zzf;
    }
}

