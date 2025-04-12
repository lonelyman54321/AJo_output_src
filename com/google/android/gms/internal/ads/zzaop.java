/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzacp;
import com.google.android.gms.internal.ads.zzacq;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzfu;
import java.util.Collections;
import java.util.List;

public final class zzaop
implements zzaoc {
    private final String zza;
    private final int zzb;
    private final zzfu zzc;
    private final zzft zzd;
    private zzafa zze;
    private String zzf;
    private zzan zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private String zzv;

    public zzaop(String object, int n3) {
        zzft zzft2;
        this.zza = object;
        this.zzb = n3;
        this.zzc = object = new zzfu(1024);
        object = ((zzfu)object).zzM();
        int n4 = ((Object)object).length;
        this.zzd = zzft2 = new zzft((byte[])object, n4);
        this.zzl = -9223372036854775807L;
    }

    private final int zzf(zzft zzft2) {
        int n3;
        int n4;
        String string2;
        int n7 = zzft2.zza();
        zzacp zzacp2 = zzacq.zzb(zzft2, true);
        this.zzv = string2 = zzacp2.zzc;
        this.zzs = n4 = zzacp2.zza;
        this.zzu = n3 = zzacp2.zzb;
        int n8 = zzft2.zza();
        return n7 - n8;
    }

    private static long zzg(zzft zzft2) {
        int n3 = (zzft2.zzd(2) + 1) * 8;
        return zzft2.zzd(n3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zza(zzfu var1_1) {
        var2_2 = this.zze;
        zzeq.zzb(var2_2);
        block0: while ((var3_3 = var1_1.zzb()) > 0) {
            block30: {
                block31: {
                    block32: {
                        block38: {
                            block39: {
                                block40: {
                                    block37: {
                                        block33: {
                                            block34: {
                                                block35: {
                                                    block36: {
                                                        var3_3 = this.zzh;
                                                        var4_4 = 86;
                                                        var5_5 = 1;
                                                        if (var3_3 == 0) break block30;
                                                        var6_6 = 2;
                                                        if (var3_3 == var5_5) break block31;
                                                        var4_4 = 3;
                                                        var7_7 = 8;
                                                        if (var3_3 == var6_6) break block32;
                                                        var3_3 = var1_1.zzb();
                                                        var6_6 = this.zzj;
                                                        var8_8 = this.zzi;
                                                        var3_3 = Math.min(var3_3, var6_6 -= var8_8);
                                                        var9_9 /* !! */  = this.zzd.zza;
                                                        var8_8 = this.zzi;
                                                        var1_1.zzG(var9_9 /* !! */ , var8_8, var3_3);
                                                        this.zzi = var6_6 = this.zzi + var3_3;
                                                        var3_3 = this.zzj;
                                                        if (var6_6 != var3_3) continue;
                                                        this.zzd.zzk(0);
                                                        var2_2 = this.zzd;
                                                        var6_6 = (int)var2_2.zzo();
                                                        var8_8 = 0;
                                                        var10_10 = null;
                                                        if (var6_6 != 0) break block33;
                                                        this.zzm = var5_5;
                                                        var6_6 = var2_2.zzd(var5_5);
                                                        if (var6_6 == var5_5) {
                                                            var6_6 = var2_2.zzd(var5_5);
                                                            var11_11 = 1;
                                                        } else {
                                                            var11_11 = var6_6;
                                                            var6_6 = 0;
                                                            var9_9 /* !! */  = null;
                                                        }
                                                        this.zzn = var6_6;
                                                        if (var6_6 != 0) break block34;
                                                        if (var11_11 == var5_5) {
                                                            zzaop.zzg((zzft)var2_2);
                                                            var11_11 = 1;
                                                        }
                                                        if ((var6_6 = (int)var2_2.zzo()) == 0) break block35;
                                                        var6_6 = 6;
                                                        this.zzo = var12_12 = var2_2.zzd(var6_6);
                                                        var12_12 = 4;
                                                        var13_13 = var2_2.zzd(var12_12);
                                                        var14_14 = var2_2.zzd(var4_4);
                                                        if (var13_13 != 0 || var14_14 != 0) break block36;
                                                        if (var11_11 == 0) {
                                                            var13_13 = var2_2.zzc();
                                                            var14_14 = this.zzf((zzft)var2_2);
                                                            var2_2.zzk(var13_13);
                                                            var15_15 = new byte[(var14_14 + 7) / var7_7];
                                                            var2_2.zzg((byte[])var15_15, 0, var14_14);
                                                            var16_16 = new zzal();
                                                            var17_17 = this.zzf;
                                                            var16_16.zzK(var17_17);
                                                            var16_16.zzX("audio/mp4a-latm");
                                                            var17_17 = this.zzv;
                                                            var16_16.zzz(var17_17);
                                                            var18_18 = this.zzu;
                                                            var16_16.zzy(var18_18);
                                                            var18_18 = this.zzs;
                                                            var16_16.zzY(var18_18);
                                                            var15_15 = Collections.singletonList(var15_15);
                                                            var16_16.zzL((List)var15_15);
                                                            var15_15 = this.zza;
                                                            var16_16.zzO((String)var15_15);
                                                            var13_13 = this.zzb;
                                                            var16_16.zzV(var13_13);
                                                            var15_15 = var16_16.zzad();
                                                            var16_16 = this.zzg;
                                                            var14_14 = (int)var15_15.equals(var16_16);
                                                            if (var14_14 == 0) {
                                                                this.zzg = var15_15;
                                                                var14_14 = var15_15.zzB;
                                                                var19_19 = var14_14;
                                                                this.zzt = var21_20 = 1024000000L / var19_19;
                                                                var16_16 = this.zze;
                                                                var16_16.zzl((zzan)var15_15);
                                                            }
                                                        } else {
                                                            var23_21 = zzaop.zzg((zzft)var2_2);
                                                            var14_14 = (int)var23_21;
                                                            var13_13 = this.zzf((zzft)var2_2);
                                                            var2_2.zzm(var14_14 -= var13_13);
                                                        }
                                                        this.zzp = var13_13 = var2_2.zzd(var4_4);
                                                        if (var13_13 != 0) {
                                                            if (var13_13 != var5_5) {
                                                                if (var13_13 != var4_4 && var13_13 != var12_12 && var13_13 != (var4_4 = 5)) {
                                                                    if (var13_13 != var6_6 && var13_13 != (var4_4 = 7)) {
                                                                        var1_1 = new IllegalStateException();
                                                                        throw var1_1;
                                                                    }
                                                                    var2_2.zzm(var5_5);
                                                                } else {
                                                                    var2_2.zzm(var6_6);
                                                                }
                                                            } else {
                                                                var4_4 = 9;
                                                                var2_2.zzm(var4_4);
                                                            }
                                                        } else {
                                                            var2_2.zzm(var7_7);
                                                        }
                                                        var4_4 = (int)var2_2.zzo();
                                                        this.zzq = var4_4;
                                                        this.zzr = var25_22 = 0L;
                                                        if (var4_4 != 0) {
                                                            if (var11_11 != var5_5) {
                                                                do {
                                                                    var4_4 = (int)var2_2.zzo();
                                                                    var27_23 = this.zzr << var7_7;
                                                                    var6_6 = var2_2.zzd(var7_7);
                                                                    var23_21 = var6_6;
                                                                    this.zzr = var27_23 += var23_21;
                                                                } while (var4_4 != 0);
                                                            } else {
                                                                this.zzr = var27_23 = zzaop.zzg((zzft)var2_2);
                                                            }
                                                        }
                                                        if ((var4_4 = (int)var2_2.zzo()) != 0) {
                                                            var2_2.zzm(var7_7);
                                                        }
                                                        break block37;
                                                    }
                                                    throw zzch.zza(null, null);
                                                }
                                                throw zzch.zza(null, null);
                                            }
                                            throw zzch.zza(null, null);
                                        }
                                        var4_4 = (int)this.zzm;
                                        if (var4_4 == 0) ** GOTO lbl187
                                    }
                                    if ((var4_4 = this.zzn) != 0) break block38;
                                    var4_4 = this.zzo;
                                    if (var4_4 != 0) break block39;
                                    var4_4 = this.zzp;
                                    if (var4_4 != 0) break block40;
                                    var4_4 = 0;
                                    var29_24 = null;
                                    while (true) {
                                        block41: {
                                            var6_6 = var2_2.zzd(var7_7);
                                            var14_14 = var4_4 + var6_6;
                                            var4_4 = 255;
                                            if (var6_6 == var4_4) break block41;
                                            var4_4 = var2_2.zzc();
                                            var6_6 = var4_4 & 7;
                                            if (var6_6 == 0) {
                                                var9_9 /* !! */  = (byte[])this.zzc;
                                                var9_9 /* !! */ .zzK(var4_4 >>= 3);
                                            } else {
                                                var29_24 = this.zzc;
                                                var6_6 = var14_14 * 8;
                                                var29_24 = var29_24.zzM();
                                                var2_2.zzg((byte[])var29_24, 0, var6_6);
                                                var29_24 = this.zzc;
                                                var29_24.zzK(0);
                                            }
                                            var29_24 = this.zze;
                                            var9_9 /* !! */  = this.zzc;
                                            var29_24.zzq((zzfu)var9_9 /* !! */ , var14_14);
                                            var30_25 = this.zzl;
                                            var27_23 = -9223372036854775807L;
                                            var4_4 = (int)(var30_25 == var27_23 ? 0 : (var30_25 < var27_23 ? -1 : 1));
                                            if (var4_4 == 0) {
                                                var5_5 = 0;
                                                var32_26 = null;
                                            }
                                            zzeq.zzf((boolean)var5_5);
                                            var10_10 = this.zze;
                                            var27_23 = this.zzl;
                                            var18_18 = 0;
                                            var17_17 = null;
                                            var13_13 = 1;
                                            var10_10.zzs(var27_23, var13_13, var14_14, 0, null);
                                            var33_27 = this.zzl;
                                            var30_25 = this.zzt;
                                            this.zzl = var33_27 += var30_25;
                                            var4_4 = (int)this.zzq;
                                            if (var4_4 != 0) {
                                                var33_27 = this.zzr;
                                                var5_5 = (int)var33_27;
                                                var2_2.zzm(var5_5);
                                            }
lbl187:
                                            // 4 sources

                                            this.zzh = 0;
                                            continue block0;
                                        }
                                        var4_4 = var14_14;
                                    }
                                }
                                throw zzch.zza(null, null);
                            }
                            throw zzch.zza(null, null);
                        }
                        throw zzch.zza(null, null);
                    }
                    var3_3 = (this.zzk & -225) << var7_7;
                    var5_5 = var1_1.zzm();
                    this.zzj = var3_3 |= var5_5;
                    var32_26 = this.zzc;
                    var9_9 /* !! */  = var32_26.zzM();
                    var6_6 = var9_9 /* !! */ .length;
                    if (var3_3 > var6_6) {
                        var32_26.zzH(var3_3);
                        var2_2 = this.zzd;
                        var32_26 = this.zzc.zzM();
                        var6_6 = ((Object)var32_26).length;
                        var2_2.zzj((byte[])var32_26, var6_6);
                    }
                    this.zzi = 0;
                    this.zzh = var4_4;
                    continue;
                }
                var3_3 = var1_1.zzm();
                var5_5 = var3_3 & 224;
                if (var5_5 == (var7_7 = 224)) {
                    this.zzk = var3_3;
                    this.zzh = var6_6;
                    continue;
                }
                if (var3_3 == var4_4) continue;
                this.zzh = 0;
                continue;
            }
            var3_3 = var1_1.zzm();
            if (var3_3 != var4_4) continue;
            this.zzh = var5_5;
        }
    }

    public final void zzb(zzadx object, zzapo zzapo2) {
        zzapo2.zzc();
        int n3 = zzapo2.zza();
        this.zze = object = object.zzw(n3, 1);
        this.zzf = object = zzapo2.zzb();
    }

    public final void zzc() {
    }

    public final void zzd(long l2, int n3) {
        this.zzl = l2;
    }

    public final void zze() {
        this.zzh = 0;
        this.zzl = -9223372036854775807L;
        this.zzm = false;
    }
}

