/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgb;

public final class zzaot
implements zzapp {
    private final zzaoc zza;
    private final zzft zzb;
    private int zzc;
    private int zzd;
    private zzgb zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzaot(zzaoc object) {
        this.zza = object;
        int n3 = 10;
        byte[] byArray = new byte[n3];
        this.zzb = object = new zzft(byArray, n3);
        this.zzc = 0;
    }

    private final void zzd(int n3) {
        this.zzc = n3;
        this.zzd = 0;
    }

    private final boolean zze(zzfu zzfu2, byte[] byArray, int n3) {
        int n4;
        int n7 = zzfu2.zzb();
        int n8 = this.zzd;
        n8 = n3 - n8;
        n7 = Math.min(n7, n8);
        boolean bl3 = true;
        if (n7 <= 0) {
            return bl3;
        }
        if (byArray == null) {
            zzfu2.zzL(n7);
        } else {
            int n10 = this.zzd;
            zzfu2.zzG(byArray, n10, n7);
        }
        this.zzd = n4 = this.zzd + n7;
        if (n4 == n3) {
            return bl3;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zza(zzfu var1_1, int var2_2) {
        var3_3 = this;
        var4_4 = var1_1;
        var5_5 = this.zze;
        zzeq.zzb(var5_5);
        var6_6 = var2_2 & 1;
        var7_7 = "PesReader";
        var8_8 = -1;
        var9_9 = 2;
        var10_10 = 1;
        if (var6_6 != 0) {
            var6_6 = this.zzc;
            if (var6_6 != 0 && var6_6 != var10_10) {
                if (var6_6 != var9_9) {
                    var6_6 = this.zzj;
                    if (var6_6 != var8_8) {
                        var12_12 = "Unexpected start indicator: expected ";
                        var11_11 = new StringBuilder((String)var12_12);
                        var11_11.append(var6_6);
                        var11_11.append(" more bytes");
                        var5_5 = var11_11.toString();
                        zzfk.zzf(var7_7, (String)var5_5);
                    }
                    var5_5 = var3_3.zza;
                    var5_5.zzc();
                } else {
                    var5_5 = "Unexpected start indicator reading extended header";
                    zzfk.zzf(var7_7, (String)var5_5);
                }
            }
            var3_3.zzd(var10_10);
        }
        var6_6 = var2_2;
        while ((var13_13 = var1_1.zzb()) > 0) {
            block21: {
                block23: {
                    block25: {
                        block22: {
                            block26: {
                                block24: {
                                    var13_13 = var3_3.zzc;
                                    if (var13_13 == 0) break block23;
                                    var14_14 = 0;
                                    var12_12 = null;
                                    if (var13_13 == var10_10) break block24;
                                    if (var13_13 != var9_9) {
                                        var13_13 = var1_1.zzb();
                                        var15_15 = var3_3.zzj;
                                        if (var15_15 != var8_8) {
                                            var14_14 = var13_13 - var15_15;
                                        }
                                        if (var14_14 > 0) {
                                            var13_13 -= var14_14;
                                            var14_14 = var1_1.zzd() + var13_13;
                                            var4_4.zzJ(var14_14);
                                        }
                                        var12_12 = var3_3.zza;
                                        var12_12.zza(var4_4);
                                        var14_14 = var3_3.zzj;
                                        if (var14_14 != var8_8) {
                                            var3_3.zzj = var14_14 -= var13_13;
                                            if (var14_14 == 0) {
                                                var11_11 = var3_3.zza;
                                                var11_11.zzc();
                                                var3_3.zzd(var10_10);
                                            }
                                        }
lbl56:
                                        // 7 sources

                                        while (true) {
                                            var9_9 = -1;
lbl58:
                                            // 2 sources

                                            while (true) {
                                                var14_14 = 2;
                                                break block21;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    var15_15 = var3_3.zzi;
                                    var13_13 = Math.min(10, var15_15);
                                    var16_16 = var3_3.zzb.zza;
                                    if ((var13_13 = (int)var3_3.zze(var4_4, var16_16, var13_13)) == 0) ** GOTO lbl56
                                    var11_11 = null;
                                    var15_15 = var3_3.zzi;
                                    var13_13 = (int)var3_3.zze(var4_4, null, var15_15);
                                    if (var13_13 != 0) ** break;
                                    ** continue;
                                    var11_11 = var3_3.zzb;
                                    var11_11.zzk(0);
                                    var13_13 = (int)var3_3.zzf;
                                    var15_15 = 3;
                                    var17_17 = 4;
                                    if (var13_13 != 0) {
                                        var3_3.zzb.zzm(var17_17);
                                        var18_18 = var3_3.zzb.zzd(var15_15);
                                        var3_3.zzb.zzm(var10_10);
                                        var11_11 = var3_3.zzb;
                                        var20_19 = 15;
                                        var13_13 = var11_11.zzd(var20_19) << var20_19;
                                        var3_3.zzb.zzm(var10_10);
                                        var21_20 = var3_3.zzb;
                                        var22_21 = var21_20.zzd(var20_19);
                                        var23_22 = var22_21;
                                        var25_23 = var3_3.zzb;
                                        var25_23.zzm(var10_10);
                                        var9_9 = (int)var3_3.zzh;
                                        var26_24 = 30;
                                        if (var9_9 == 0 && (var9_9 = (int)var3_3.zzg) != 0) {
                                            var3_3.zzb.zzm(var17_17);
                                            var25_23 = var3_3.zzb;
                                            var9_9 = var25_23.zzd(var15_15);
                                            var27_25 = (long)var9_9 << var26_24;
                                            var3_3.zzb.zzm(var10_10);
                                            var29_26 = var3_3.zzb;
                                            var17_17 = var29_26.zzd(var20_19) << var20_19;
                                            var3_3.zzb.zzm(var10_10);
                                            var14_14 = var3_3.zzb.zzd(var20_19);
                                            var30_27 = var14_14;
                                            var3_3.zzb.zzm(var10_10);
                                            var12_12 = var3_3.zze;
                                            var32_28 = var13_13;
                                            var20_19 = var17_17;
                                            var33_29 = var17_17;
                                            var27_25 = var27_25 | var33_29 | var30_27;
                                            var12_12.zzb(var27_25);
                                            var8_8 = 1;
                                            var3_3.zzh = var8_8;
                                        } else {
                                            var32_28 = var13_13;
                                        }
                                        var27_25 = var18_18 << var26_24;
                                        var10_10 = var32_28;
                                        var33_29 = var32_28;
                                        var27_25 = var27_25 | var33_29 | var23_22;
                                        var35_30 = var3_3.zze;
                                        var27_25 = var35_30.zzb(var27_25);
                                    } else {
                                        var27_25 = -9223372036854775807L;
                                    }
                                    var10_10 = (int)var3_3.zzk;
                                    var13_13 = 1;
                                    if (var13_13 != var10_10) {
                                        var14_14 = 0;
                                        var12_12 = null;
                                    } else {
                                        var14_14 = 4;
                                    }
                                    var35_30 = var3_3.zza;
                                    var35_30.zzd(var27_25, var6_6 |= var14_14);
                                    var3_3.zzd(3);
                                    var8_8 = -1;
                                    var9_9 = 2;
                                    var10_10 = 1;
                                    continue;
                                }
                                var36_31 /* !! */  = var3_3.zzb.zza;
                                var9_9 = 9;
                                var8_8 = (int)var3_3.zze(var4_4, var36_31 /* !! */ , var9_9);
                                if (var8_8 == 0) break block25;
                                var36_31 /* !! */  = (byte[])var3_3.zzb;
                                var9_9 = 0;
                                var25_23 = null;
                                var36_31 /* !! */ .zzk(0);
                                var36_31 /* !! */  = var3_3.zzb;
                                var8_8 = var36_31 /* !! */ .zzd(24);
                                var10_10 = 1;
                                if (var8_8 == var10_10) break block26;
                                var11_11 = "Unexpected start code prefix: ";
                                w12_0.a(var8_8, (String)var11_11, var7_7);
                                var3_3.zzj = -1;
                                var8_8 = 0;
                                var36_31 /* !! */  = null;
                                var9_9 = -1;
                                var14_14 = 2;
                                break block22;
                            }
                            var36_31 /* !! */  = var3_3.zzb;
                            var9_9 = 8;
                            var36_31 /* !! */ .zzm(var9_9);
                            var36_31 /* !! */  = var3_3.zzb;
                            var13_13 = var36_31 /* !! */ .zzd(16);
                            var36_31 /* !! */ .zzm(5);
                            var8_8 = (int)var3_3.zzb.zzo();
                            var3_3.zzk = var8_8;
                            var36_31 /* !! */  = var3_3.zzb;
                            var14_14 = 2;
                            var36_31 /* !! */ .zzm(var14_14);
                            var8_8 = (int)var3_3.zzb.zzo();
                            var3_3.zzf = var8_8;
                            var8_8 = (int)var3_3.zzb.zzo();
                            var3_3.zzg = var8_8;
                            var36_31 /* !! */  = var3_3.zzb;
                            var15_15 = 6;
                            var36_31 /* !! */ .zzm(var15_15);
                            var36_31 /* !! */  = var3_3.zzb;
                            var3_3.zzi = var8_8 = var36_31 /* !! */ .zzd(var9_9);
                            var9_9 = -1;
                            if (var13_13 == 0) {
                                var3_3.zzj = var9_9;
lbl180:
                                // 3 sources

                                while (true) {
                                    var8_8 = 2;
                                    break block22;
                                    break;
                                }
                            }
                            var3_3.zzj = var13_13 = var13_13 + -3 - var8_8;
                            if (var13_13 >= 0) ** GOTO lbl180
                            var36_31 /* !! */  = "Found negative packet payload size: ";
                            w12_0.a(var13_13, (String)var36_31 /* !! */ , var7_7);
                            var3_3.zzj = var9_9;
                            ** continue;
                        }
                        var3_3.zzd(var8_8);
                        break block21;
                    }
                    var9_9 = -1;
                    var10_10 = 1;
                    ** continue;
                }
                var9_9 = -1;
                var14_14 = 2;
                var8_8 = var1_1.zzb();
                var4_4.zzL(var8_8);
            }
            var8_8 = -1;
            var9_9 = 2;
        }
    }

    public final void zzb(zzgb zzgb2, zzadx zzadx2, zzapo zzapo2) {
        this.zze = zzgb2;
        this.zza.zzb(zzadx2, zzapo2);
    }

    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}

