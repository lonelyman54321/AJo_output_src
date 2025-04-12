/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzaps;
import com.google.android.gms.internal.ads.zzapt;
import com.google.android.gms.internal.ads.zzapu;
import com.google.android.gms.internal.ads.zzapv;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzapz;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import java.util.List;

public final class zzapw
implements zzadu {
    public static final zzaea zza;
    private zzadx zzb;
    private zzafa zzc;
    private int zzd = 0;
    private long zze;
    private zzapu zzf;
    private int zzg;
    private long zzh;

    static {
        zzaps zzaps2 = new zzaps();
        zza = zzaps2;
    }

    public zzapw() {
        long l2;
        this.zze = l2 = (long)-1;
        this.zzg = -1;
        this.zzh = l2;
    }

    /*
     * Unable to fully structure code
     */
    public final int zzb(zzadv var1_1, zzaeq var2_2) {
        block34: {
            block33: {
                block32: {
                    block23: {
                        block24: {
                            block31: {
                                block26: {
                                    block22: {
                                        block29: {
                                            block30: {
                                                block28: {
                                                    block27: {
                                                        block25: {
                                                            var3_3 = this;
                                                            var4_4 = var1_1;
                                                            var5_5 = this.zzc;
                                                            zzeq.zzb(var5_5);
                                                            var6_6 = zzgd.zza;
                                                            var6_6 = this.zzd;
                                                            var7_7 = -1;
                                                            var8_8 = 4;
                                                            var9_9 = 1;
                                                            if (var6_6 == 0) break block23;
                                                            var10_10 = 2;
                                                            var11_11 = -1;
                                                            if (var6_6 == var9_9) break block24;
                                                            var13_12 = 3;
                                                            if (var6_6 != var10_10) {
                                                                if (var6_6 != var13_12) {
                                                                    var14_14 = this.zzh;
                                                                    cfr_temp_0 = var14_14 - var11_11;
                                                                    var6_6 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                                    if (var6_6 == 0) {
                                                                        var9_9 = 0;
                                                                        var16_16 = null;
                                                                    }
                                                                    zzeq.zzf((boolean)var9_9);
                                                                    var17_19 = var3_3.zzh;
                                                                    var19_21 = var1_1.zzf();
                                                                    var5_5 = var3_3.zzf;
                                                                    var5_5.getClass();
                                                                    var21_23 = var5_5.zzc((zzadv)var4_4, var17_19 -= var19_21);
                                                                    if (var21_23) {
                                                                        return var7_7;
                                                                    }
                                                                    return 0;
                                                                }
                                                                var5_5 = zzapz.zza(var1_1);
                                                                var22_25 = (Long)var5_5.first;
                                                                this.zzg = var7_7 = var22_25.intValue();
                                                                var5_5 = (Long)var5_5.second;
                                                                var23_27 = var5_5.longValue();
                                                                var14_15 = this.zze;
                                                                cfr_temp_1 = var14_15 - var11_11;
                                                                var9_9 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                                                if (var9_9 != 0 && (var9_9 = (int)((cfr_temp_2 = var23_27 - (var25_29 = 0xFFFFFFFFL)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) == 0) {
                                                                    var23_27 = var14_15;
                                                                }
                                                                var9_9 = var3_3.zzg;
                                                                var3_3.zzh = var14_15 = (long)var9_9 + var23_27;
                                                                var27_30 = var1_1.zzd();
                                                                cfr_temp_3 = var27_30 - var11_11;
                                                                var7_7 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                                                if (var7_7 != 0 && (var7_7 = (int)(var14_15 == var27_30 ? 0 : (var14_15 < var27_30 ? -1 : 1))) > 0) {
                                                                    var22_25 = D70.c(var14_15, "Data exceeds input length: ", ", ");
                                                                    var22_25.append(var27_30);
                                                                    var22_25 = var22_25.toString();
                                                                    var16_17 = "WavExtractor";
                                                                    zzfk.zzf(var16_17, (String)var22_25);
                                                                    var3_3.zzh = var27_30;
                                                                    var14_15 = var27_30;
                                                                }
                                                                var4_4 = var3_3.zzf;
                                                                var4_4.getClass();
                                                                var6_6 = var3_3.zzg;
                                                                var4_4.zza(var6_6, var14_15);
                                                                var3_3.zzd = var8_8;
                                                                return 0;
                                                            }
                                                            var29_31 = zzapz.zzb(var1_1);
                                                            var21_24 = var29_31.zza;
                                                            var6_6 = 17;
                                                            if (var21_24 != var6_6) break block25;
                                                            var5_5 = this.zzb;
                                                            var22_26 = this.zzc;
                                                            this.zzf = var4_4 = new zzapt((zzadx)var5_5, var22_26, var29_31);
                                                            break block26;
                                                        }
                                                        var6_6 = 6;
                                                        if (var21_24 != var6_6) break block27;
                                                        var30_32 = this.zzb;
                                                        var31_35 = this.zzc;
                                                        var32_38 = "audio/g711-alaw";
                                                        var33_41 = -1;
                                                        this.zzf = var4_4 = new zzapv(var30_32, var31_35, var29_31, var32_38, var33_41);
                                                        break block26;
                                                    }
                                                    var6_6 = 7;
                                                    if (var21_24 != var6_6) break block28;
                                                    var30_33 = this.zzb;
                                                    var31_36 = this.zzc;
                                                    var32_39 = "audio/g711-mlaw";
                                                    var33_42 = -1;
                                                    this.zzf = var4_4 = new zzapv(var30_33, var31_36, var29_31, var32_39, var33_42);
                                                    break block26;
                                                }
                                                var6_6 = var29_31.zze;
                                                if (var21_24 == var9_9) break block29;
                                                if (var21_24 == var13_12) break block30;
                                                var7_7 = (char)-2;
                                                if (var21_24 != var7_7) lbl-1000:
                                                // 2 sources

                                                {
                                                    while (true) {
                                                        var33_43 = 0;
                                                        break block22;
                                                        break;
                                                    }
                                                }
                                                break block29;
                                            }
                                            ** while (var6_6 != (var7_7 = 32))
lbl103:
                                            // 1 sources

                                            var33_43 = 4;
                                            break block22;
                                        }
                                        var33_43 = var8_8 = zzgd.zzl(var6_6);
                                    }
                                    if (var33_43 == 0) break block31;
                                    var30_34 = var3_3.zzb;
                                    var31_37 = var3_3.zzc;
                                    var32_40 = "audio/raw";
                                    var3_3.zzf = var4_4 = new zzapv(var30_34, var31_37, var29_31, var32_40, var33_43);
                                }
                                var3_3.zzd = var13_12;
                                return 0;
                            }
                            var5_5 = new StringBuilder("Unsupported WAV format type: ");
                            var5_5.append(var21_24);
                            throw zzch.zzc(var5_5.toString());
                        }
                        var7_7 = 8;
                        var5_5 = new zzfu(var7_7);
                        var34_44 = zzapy.zza(var1_1, (zzfu)var5_5);
                        var9_9 = var34_44.zza;
                        var13_13 = 1685272116;
                        if (var9_9 != var13_13) {
                            var1_1.zzj();
                        } else {
                            var4_4 = (zzadi)var1_1;
                            var4_4.zzl(var7_7, false);
                            var5_5.zzK(0);
                            var16_18 = var5_5.zzM();
                            var4_4.zzm(var16_18, 0, var7_7, false);
                            var11_11 = var5_5.zzr();
                            var17_20 = var34_44.zzb;
                            var6_6 = (int)var17_20 + var7_7;
                            var4_4.zzo(var6_6, false);
                        }
                        var3_3.zze = var11_11;
                        var3_3.zzd = var10_10;
                        return 0;
                    }
                    var19_22 = var1_1.zzf();
                    cfr_temp_4 = var19_22 - (var35_45 = 0L);
                    var6_6 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                    if (var6_6 == 0) {
                        var6_6 = 1;
                    } else {
                        var6_6 = 0;
                        var5_5 = null;
                    }
                    zzeq.zzf((boolean)var6_6);
                    var6_6 = var3_3.zzg;
                    if (var6_6 == var7_7) break block32;
                    var4_4 = (zzadi)var4_4;
                    var4_4.zzo(var6_6, false);
                    var3_3.zzd = var8_8;
                    break block33;
                }
                var6_6 = (int)zzapz.zzc(var1_1);
                if (var6_6 == 0) break block34;
                var23_28 = var1_1.zze();
                var19_22 = var1_1.zzf();
                var4_4 = (zzadi)var4_4;
                var7_7 = (int)(var23_28 -= var19_22);
                var4_4.zzo(var7_7, false);
                var3_3.zzd = var9_9;
            }
            return 0;
        }
        throw zzch.zza("Unsupported or unrecognized wav file type.", null);
    }

    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    public final void zzd(zzadx zzadx2) {
        zzafa zzafa2;
        this.zzb = zzadx2;
        this.zzc = zzafa2 = zzadx2.zzw(0, 1);
        zzadx2.zzD();
    }

    public final void zze(long l2, long l3) {
        zzapu zzapu2;
        int n3;
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            n3 = 0;
            zzapu2 = null;
        } else {
            n3 = 4;
        }
        this.zzd = n3;
        zzapu2 = this.zzf;
        if (zzapu2 != null) {
            zzapu2.zzb(l3);
        }
    }

    public final boolean zzf(zzadv zzadv2) {
        return zzapz.zzc(zzadv2);
    }
}

