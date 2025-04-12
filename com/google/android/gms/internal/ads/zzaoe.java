/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzaod;
import com.google.android.gms.internal.ads.zzaor;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzapr;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgr;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzaoe
implements zzaoc {
    private static final double[] zza;
    private String zzb;
    private zzafa zzc;
    private final zzapr zzd;
    private final zzfu zze;
    private final zzaor zzf;
    private final boolean[] zzg;
    private final zzaod zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    static {
        double[] dArray;
        double[] dArray2 = dArray = new double[8];
        double[] dArray3 = dArray;
        dArray2[0] = 23.976023976023978;
        dArray3[1] = 24.0;
        dArray2[2] = 25.0;
        dArray3[3] = 29.97002997002997;
        dArray2[4] = 30.0;
        dArray3[5] = 50.0;
        dArray2[6] = 59.94005994005994;
        dArray3[7] = 60.0;
        zza = dArray;
    }

    public zzaoe() {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public zzaoe(zzapr object) {
        long l2;
        zzaod zzaod2;
        this.zzd = object;
        int n3 = 4;
        boolean[] blArray = new boolean[n3];
        this.zzg = blArray;
        int n4 = 128;
        this.zzh = zzaod2 = new zzaod(n4);
        if (object != null) {
            n3 = 178;
            this.zzf = object = new zzaor(n3, n4);
            object = new zzfu();
        } else {
            object = null;
            this.zzf = null;
        }
        this.zze = object;
        this.zzm = l2 = -9223372036854775807L;
        this.zzo = l2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zza(zzfu var1_1) {
        var2_2 = this;
        var3_3 = 4;
        var4_4 = 3;
        var5_5 = 4.2E-45f;
        var6_6 = this.zzc;
        zzeq.zzb(var6_6);
        var7_7 = var1_1.zzd();
        var8_8 = var1_1.zze();
        var9_9 = var1_1.zzM();
        var10_10 = this.zzi;
        var12_11 = var1_1.zzb();
        var13_12 = var12_11;
        this.zzi = var10_10 += var13_12;
        var15_13 = this.zzc;
        var16_14 = var1_1.zzb();
        var17_15 = var1_1;
        var15_13.zzq(var1_1, var16_14);
        while (true) {
            block33: {
                block32: {
                    if ((var18_16 = zzgr.zza(var9_9, var7_7, var8_8, (boolean[])(var15_13 = (Object)var2_2.zzg))) == var8_8) {
                        var19_17 = var2_2.zzk;
                        if (var19_17 == 0) {
                            var20_18 = var2_2.zzh;
                            var20_18.zza(var9_9, var7_7, var8_8);
                        }
                        if ((var20_18 = var2_2.zzf) != null) {
                            var20_18.zza(var9_9, var7_7, var8_8);
                        }
                        return;
                    }
                    var21_19 = var1_1.zzM();
                    var22_20 = var18_16 + 3;
                    var16_14 = var21_19[var22_20] & 255;
                    var23_21 = var18_16 - var7_7;
                    var24_22 = var2_2.zzk;
                    if (var24_22 != 0) break block32;
                    if (var23_21 > 0) {
                        var25_23 = var2_2.zzh;
                        var25_23.zza(var9_9, var7_7, var18_16);
                    }
                    if (var23_21 < 0) {
                        var24_22 = -var23_21;
                    } else {
                        var24_22 = 0;
                        var25_23 = null;
                    }
                    var26_24 = var2_2.zzh;
                    var24_22 = (int)var26_24.zzc(var16_14, var24_22);
                    if (var24_22 == 0) break block32;
                    var25_23 = var2_2.zzh;
                    var26_24 = var2_2.zzb;
                    var26_24.getClass();
                    var27_25 = var25_23.zzc;
                    var28_26 = var25_23.zza;
                    var29_27 /* !! */  = Arrays.copyOf(var27_25, var28_26);
                    var30_28 = var29_27 /* !! */ [var3_3] & 255;
                    var31_29 = 5;
                    var4_4 = var29_27 /* !! */ [var31_29];
                    var19_17 = var4_4 & 255;
                    var3_3 = var29_27 /* !! */ [6] & 255;
                    var32_30 = 7;
                    var12_11 = var29_27 /* !! */ [var32_30] & 240;
                    var4_4 &= 15;
                    var33_31 = var22_20;
                    var22_20 = 4;
                    var19_17 = var19_17 >> var22_20 | (var30_28 <<= var22_20);
                    var30_28 = 8;
                    var3_3 |= (var4_4 <<= var30_28);
                    var4_4 = 2;
                    var5_5 = 2.8E-45f;
                    if ((var12_11 >>= var22_20) == var4_4) ** GOTO lbl87
                    var4_4 = 3;
                    var5_5 = 4.2E-45f;
                    if (var12_11 == var4_4) ** GOTO lbl84
                    if (var12_11 != var22_20) {
                        var4_4 = 1065353216;
                        var5_5 = 1.0f;
lbl74:
                        // 2 sources

                        while (true) {
                            var22_20 = 3;
                            break;
                        }
                    } else {
                        var4_4 = var3_3 * 121;
                        var12_11 = var19_17 * 100;
lbl79:
                        // 2 sources

                        while (true) {
                            var5_5 = var4_4;
                            var34_32 = var12_11;
                            var5_5 /= var34_32;
                            ** continue;
                            break;
                        }
lbl84:
                        // 1 sources

                        var4_4 = var3_3 * 16;
                        var12_11 = var19_17 * 9;
                        ** continue;
lbl87:
                        // 1 sources

                        var12_11 = var3_3 * 4;
                        var22_20 = 3;
                        var4_4 = var19_17 * 3;
                        var34_32 = var12_11;
                        var5_5 = var4_4;
                        var5_5 = var34_32 / var5_5;
                    }
                    var17_15 = new zzal();
                    var17_15.zzK((String)var26_24);
                    var26_24 = "video/mpeg2";
                    var17_15.zzX((String)var26_24);
                    var17_15.zzac(var19_17);
                    var17_15.zzI(var3_3);
                    var17_15.zzT(var5_5);
                    var20_18 = Collections.singletonList(var29_27 /* !! */ );
                    var17_15.zzL((List)var20_18);
                    var20_18 = var17_15.zzad();
                    var3_3 = (var29_27 /* !! */ [var32_30] & 15) + -1;
                    var35_33 = 0L;
                    if (var3_3 >= 0 && var3_3 < var30_28) {
                        var37_34 = zzaoe.zza;
                        var38_35 = var37_34[var3_3];
                        var3_3 = var25_23.zzb + 9;
                        var3_3 = var29_27 /* !! */ [var3_3];
                        var28_26 = (var3_3 & 96) >> 5;
                        if (var28_26 != (var3_3 &= 31)) {
                            var40_36 = var28_26;
                            var34_32 = 1.4E-45f;
                            var42_37 = 1.0;
                            var40_36 += var42_37;
                            var12_11 = var23_21;
                            var44_38 = ++var3_3;
                            var38_35 *= (var40_36 /= var44_38);
                        } else {
                            var12_11 = var23_21;
                        }
                        var46_39 = 1000000.0 / var38_35;
                        var35_33 = var48_40 = (long)var46_39;
                    } else {
                        var12_11 = var23_21;
                    }
                    var50_41 = var35_33;
                    var20_18 = Pair.create((Object)var20_18, (Object)var50_41);
                    var50_41 = var2_2.zzc;
                    var29_27 /* !! */  = (byte[])((zzan)var20_18.first);
                    var50_41.zzl((zzan)var29_27 /* !! */ );
                    var20_18 = (Long)var20_18.second;
                    var2_2.zzl = var51_42 = var20_18.longValue();
                    var19_17 = 1;
                    var2_2.zzk = var19_17;
                    break block33;
                }
                var33_31 = var22_20;
                var12_11 = var23_21;
            }
            var20_18 = var2_2.zzf;
            if (var20_18 == null) ** GOTO lbl-1000
            if (var12_11 > 0) {
                var20_18.zza(var9_9, var7_7, var18_16);
                var19_17 = 0;
                var20_18 = null;
            } else {
                var19_17 = -var12_11;
            }
            var50_41 = var2_2.zzf;
            var19_17 = (int)var50_41.zzd(var19_17);
            if (var19_17 != 0) {
                var20_18 = var2_2.zzf;
                var50_41 = var20_18.zza;
                var19_17 = var20_18.zzb;
                var19_17 = zzgr.zzb((byte[])var50_41, var19_17);
                var50_41 = var2_2.zze;
                var28_26 = zzgd.zza;
                var29_27 /* !! */  = var2_2.zzf.zza;
                var50_41.zzI(var29_27 /* !! */ , var19_17);
                var20_18 = var2_2.zzd;
                var48_40 = var2_2.zzo;
                var37_34 = var2_2.zze;
                var20_18.zza(var48_40, (zzfu)var37_34);
            }
            if (var16_14 == (var19_17 = 178)) {
                var50_41 = var1_1.zzM();
                var28_26 = 2;
                var4_4 = var18_16 + 2;
                var3_3 = (int)var50_41[var4_4];
                var4_4 = 1;
                var5_5 = 1.4E-45f;
                if (var3_3 == var4_4) {
                    var50_41 = var2_2.zzf;
                    var50_41.zzc(var19_17);
                }
                var16_14 = 178;
            } else lbl-1000:
            // 2 sources

            {
                var28_26 = 2;
            }
            if (var16_14 != 0 && var16_14 != (var19_17 = 179)) {
                var19_17 = 184;
                if (var16_14 == var19_17) {
                    var19_17 = 1;
                    var2_2.zzp = var19_17;
                }
                var3_3 = 1;
            } else {
                var19_17 = var8_8 - var18_16;
                var3_3 = (int)var2_2.zzq;
                var53_43 = -9223372036854775807L;
                if (var3_3 != 0 && (var3_3 = (int)var2_2.zzk) != 0 && (var3_3 = (int)((cfr_temp_0 = (var13_12 = var2_2.zzo) - var53_43) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) != 0) {
                    var3_3 = (int)var2_2.zzp;
                    var55_44 = var2_2.zzi;
                    var57_45 = var2_2.zzn;
                    var18_16 = (int)(var55_44 -= var57_45);
                    var59_46 = var18_16 - var19_17;
                    var15_13 = var2_2.zzc;
                    var15_13.zzs(var13_12, var3_3, var59_46, var19_17, null);
                }
                if ((var3_3 = (int)var2_2.zzj) != 0 && (var3_3 = (int)var2_2.zzq) == 0) {
                    var19_17 = 0;
                    var20_18 = null;
                    var3_3 = 1;
                } else {
                    var13_12 = var2_2.zzi;
                    var51_42 = var19_17;
                    var2_2.zzn = var13_12 -= var51_42;
                    var51_42 = var2_2.zzm;
                    cfr_temp_1 = var51_42 - var53_43;
                    var18_16 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                    if (var18_16 == 0) {
                        var51_42 = var2_2.zzo;
                        cfr_temp_2 = var51_42 - var53_43;
                        var18_16 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                        if (var18_16 != 0) {
                            var13_12 = var2_2.zzl;
                            var51_42 += var13_12;
                        } else {
                            var51_42 = var53_43;
                        }
                    }
                    var2_2.zzo = var51_42;
                    var19_17 = 0;
                    var20_18 = null;
                    var2_2.zzp = false;
                    var2_2.zzm = var53_43;
                    var3_3 = 1;
                    var2_2.zzj = var3_3;
                }
                if (var16_14 == 0) {
                    var30_28 = 1;
                } else {
                    var30_28 = 0;
                    var27_25 = null;
                }
                var2_2.zzq = var30_28;
            }
            var17_15 = var1_1;
            var7_7 = var33_31;
            var3_3 = 4;
            var4_4 = 3;
            var5_5 = 4.2E-45f;
        }
    }

    public final void zzb(zzadx zzadx2, zzapo zzapo2) {
        zzapo2.zzc();
        Object object = zzapo2.zzb();
        this.zzb = object;
        int n3 = zzapo2.zza();
        int n4 = 2;
        this.zzc = object = zzadx2.zzw(n3, n4);
        object = this.zzd;
        if (object != null) {
            ((zzapr)object).zzb(zzadx2, zzapo2);
        }
    }

    public final void zzc() {
    }

    public final void zzd(long l2, int n3) {
        this.zzm = l2;
    }

    public final void zze() {
        long l2;
        zzgr.zzf(this.zzg);
        this.zzh.zzb();
        zzaor zzaor2 = this.zzf;
        if (zzaor2 != null) {
            zzaor2.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = l2 = -9223372036854775807L;
        this.zzo = l2;
    }
}

