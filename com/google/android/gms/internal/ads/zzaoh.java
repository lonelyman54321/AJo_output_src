/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzaof;
import com.google.android.gms.internal.ads.zzaog;
import com.google.android.gms.internal.ads.zzaor;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzapr;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgr;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzaoh
implements zzaoc {
    private static final float[] zza;
    private final zzapr zzb;
    private final zzfu zzc;
    private final boolean[] zzd;
    private final zzaof zze;
    private final zzaor zzf;
    private zzaog zzg;
    private long zzh;
    private String zzi;
    private zzafa zzj;
    private boolean zzk;
    private long zzl;

    static {
        float[] fArray;
        float[] fArray2 = fArray = new float[7];
        float[] fArray3 = fArray;
        fArray2[0] = 1.0f;
        fArray3[1] = 1.0f;
        fArray2[2] = 1.0909091f;
        fArray3[3] = 0.90909094f;
        fArray2[4] = 1.4545455f;
        fArray3[5] = 1.2121212f;
        fArray3[6] = 1.0f;
        zza = fArray;
    }

    public zzaoh() {
        this(null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public zzaoh(zzapr object) {
        long l2;
        zzaof zzaof2;
        this.zzb = object;
        int n3 = 4;
        boolean[] blArray = new boolean[n3];
        this.zzd = blArray;
        int n4 = 128;
        this.zze = zzaof2 = new zzaof(n4);
        this.zzl = l2 = -9223372036854775807L;
        if (object != null) {
            n3 = 178;
            this.zzf = object = new zzaor(n3, n4);
            object = new zzfu();
        } else {
            object = null;
            this.zzf = null;
        }
        this.zzc = object;
    }

    /*
     * Unable to fully structure code
     */
    public final void zza(zzfu var1_1) {
        var2_2 = this;
        var3_3 = 3;
        var4_4 = 4.2E-45f;
        zzeq.zzb(this.zzg);
        var5_5 = this.zzj;
        zzeq.zzb(var5_5);
        var6_6 = var1_1.zzd();
        var7_7 = var1_1.zze();
        var8_8 = var1_1.zzM();
        var9_9 = this.zzh;
        var11_10 = var1_1.zzb();
        var12_11 = var11_10;
        this.zzh = var9_9 += var12_11;
        var14_12 = this.zzj;
        var15_13 = var1_1.zzb();
        var14_12.zzq(var1_1, var15_13);
        while (true) {
            if ((var16_14 = zzgr.zza(var8_8, var6_6, var7_7, (boolean[])(var14_12 = (Object)var2_2.zzd))) == var7_7) {
                var17_15 = var2_2.zzk;
                if (var17_15 == 0) {
                    var18_16 = var2_2.zze;
                    var18_16.zza(var8_8, var6_6, var7_7);
                }
                var2_2.zzg.zza(var8_8, var6_6, var7_7);
                var18_16 = var2_2.zzf;
                if (var18_16 != null) {
                    var18_16.zza(var8_8, var6_6, var7_7);
                }
                return;
            }
            var19_17 = var1_1.zzM();
            var20_18 = var16_14 + 3;
            var15_13 = var19_17[var20_18] & 255;
            var21_19 = var16_14 - var6_6;
            var22_20 = var2_2.zzk;
            if (var22_20 == 0) {
                if (var21_19 > 0) {
                    var23_21 = var2_2.zze;
                    var23_21.zza(var8_8, var6_6, var16_14);
                }
                if (var21_19 < 0) {
                    var22_20 = -var21_19;
                } else {
                    var22_20 = 0;
                    var23_21 = null;
                }
                var24_22 = var2_2.zze;
                var22_20 = (int)var24_22.zzc(var15_13, var22_20);
                if (var22_20 != 0) {
                    block28: {
                        var23_21 = var2_2.zzj;
                        var24_22 = var2_2.zze;
                        var25_23 = var24_22.zzb;
                        var26_24 = var2_2.zzi;
                        var26_24.getClass();
                        var27_25 = var24_22.zzc;
                        var28_26 = var24_22.zza;
                        var27_25 = Arrays.copyOf(var27_25, var28_26);
                        var17_15 = var27_25.length;
                        var24_22 = new zzft(var27_25, var17_15);
                        var24_22.zzn(var25_23);
                        var17_15 = 4;
                        var29_27 = 5.6E-45f;
                        var24_22.zzn(var17_15);
                        var24_22.zzl();
                        var25_23 = 8;
                        var24_22.zzm(var25_23);
                        var30_28 = var24_22.zzo();
                        if (var30_28 != 0) {
                            var24_22.zzm(var17_15);
                            var24_22.zzm(var3_3);
                        }
                        var17_15 = var24_22.zzd(var17_15);
                        var30_28 = 1065353216;
                        var31_29 = 1.0f;
                        var32_30 = "Invalid aspect ratio";
                        var33_31 = "H263Reader";
                        var11_10 = 15;
                        if (var17_15 == var11_10) {
                            var11_10 = 8;
                            var17_15 = var24_22.zzd(var11_10);
                            if ((var11_10 = var24_22.zzd(var11_10)) == 0) {
                                zzfk.zzf(var33_31, (String)var32_30);
lbl80:
                                // 2 sources

                                while (true) {
                                    var17_15 = 1065353216;
                                    var29_27 = 1.0f;
                                    break block28;
                                    break;
                                }
                            }
                            var29_27 = var17_15;
                            var4_4 = var11_10;
                            var31_29 = var29_27 / var4_4;
lbl87:
                            // 2 sources

                            while (true) {
                                var29_27 = var31_29;
                                break block28;
                                break;
                            }
                        }
                        var11_10 = 7;
                        if (var17_15 < var11_10) {
                            var32_30 = zzaoh.zza;
                            var31_29 = (float)var32_30[var17_15];
                            ** continue;
                        }
                        zzfk.zzf(var33_31, (String)var32_30);
                        ** continue;
                    }
                    var3_3 = (int)var24_22.zzo();
                    if (var3_3 != 0) {
                        var24_22.zzm(2);
                        var4_4 = 1.4E-45f;
                        var24_22.zzm(1);
                        var3_3 = (int)var24_22.zzo();
                        if (var3_3 != 0) {
                            var3_3 = 15;
                            var4_4 = 2.1E-44f;
                            var24_22.zzm(var3_3);
                            var24_22.zzl();
                            var24_22.zzm(var3_3);
                            var24_22.zzl();
                            var24_22.zzm(var3_3);
                            var24_22.zzl();
                            var24_22.zzm(3);
                            var11_10 = 11;
                            var24_22.zzm(var11_10);
                            var24_22.zzl();
                            var24_22.zzm(var3_3);
                            var24_22.zzl();
                        }
                    }
                    var3_3 = 2;
                    var4_4 = 2.8E-45f;
                    var11_10 = var24_22.zzd(var3_3);
                    if (var11_10 != 0) {
                        var32_30 = "Unhandled video object layer shape";
                        zzfk.zzf(var33_31, (String)var32_30);
                    }
                    var24_22.zzl();
                    var4_4 = 2.2E-44f;
                    var3_3 = var24_22.zzd(16);
                    var24_22.zzl();
                    var11_10 = (int)var24_22.zzo();
                    if (var11_10 != 0) {
                        if (var3_3 == 0) {
                            var32_30 = "Invalid vop_increment_time_resolution";
                            zzfk.zzf(var33_31, (String)var32_30);
                        } else {
                            var3_3 += -1;
                            var11_10 = 0;
                            while (var3_3 > 0) {
                                var25_23 = 1;
                                var3_3 >>= var25_23;
                                var11_10 += var25_23;
                            }
                            var24_22.zzm(var11_10);
                        }
                    }
                    var24_22.zzl();
                    var3_3 = 13;
                    var4_4 = 1.8E-44f;
                    var11_10 = var24_22.zzd(var3_3);
                    var24_22.zzl();
                    var3_3 = var24_22.zzd(var3_3);
                    var24_22.zzl();
                    var24_22.zzl();
                    var24_22 = new zzal();
                    var24_22.zzK(var26_24);
                    var26_24 = "video/mp4v-es";
                    var24_22.zzX(var26_24);
                    var24_22.zzac(var11_10);
                    var24_22.zzI(var3_3);
                    var24_22.zzT(var29_27);
                    var18_16 = Collections.singletonList(var27_25);
                    var24_22.zzL((List)var18_16);
                    var18_16 = var24_22.zzad();
                    var23_21.zzl((zzan)var18_16);
                    var17_15 = 1;
                    var29_27 = 1.4E-45f;
                    var2_2.zzk = var17_15;
                }
            }
            var2_2.zzg.zza(var8_8, var6_6, var16_14);
            var18_16 = var2_2.zzf;
            if (var18_16 == null) ** GOTO lbl-1000
            if (var21_19 > 0) {
                var18_16.zza(var8_8, var6_6, var16_14);
                var34_32 = 0;
                var26_24 = null;
            } else {
                var34_32 = -var21_19;
            }
            var18_16 = var2_2.zzf;
            var17_15 = (int)var18_16.zzd(var34_32);
            if (var17_15 != 0) {
                var18_16 = var2_2.zzf;
                var32_30 = var18_16.zza;
                var17_15 = var18_16.zzb;
                var17_15 = zzgr.zzb((byte[])var32_30, var17_15);
                var32_30 = var2_2.zzc;
                var27_25 = var2_2.zzf.zza;
                var32_30.zzI(var27_25, var17_15);
                var18_16 = var2_2.zzb;
                var35_33 = var2_2.zzl;
                var5_5 = var2_2.zzc;
                var18_16.zza(var35_33, (zzfu)var5_5);
            }
            var17_15 = 178;
            var29_27 = 2.5E-43f;
            if (var15_13 == var17_15) {
                var32_30 = var1_1.zzM();
                var6_6 = var16_14 + 2;
                var3_3 = (int)var32_30[var6_6];
                if (var3_3 == (var6_6 = 1)) {
                    var32_30 = var2_2.zzf;
                    var32_30.zzc(var17_15);
                }
                var15_13 = 178;
            } else lbl-1000:
            // 2 sources

            {
                var6_6 = 1;
            }
            var17_15 = var7_7 - var16_14;
            var37_34 = var2_2.zzh;
            var39_35 = var17_15;
            var32_30 = var2_2.zzg;
            var16_14 = (int)var2_2.zzk;
            var32_30.zzb(var37_34 -= var39_35, var17_15, (boolean)var16_14);
            var18_16 = var2_2.zzg;
            var37_34 = var2_2.zzl;
            var18_16.zzc(var15_13, var37_34);
            var6_6 = var20_18;
            var3_3 = 3;
            var4_4 = 4.2E-45f;
        }
    }

    public final void zzb(zzadx zzadx2, zzapo zzapo2) {
        zzaog zzaog2;
        zzapo2.zzc();
        Object object = zzapo2.zzb();
        this.zzi = object;
        int n3 = zzapo2.zza();
        int n4 = 2;
        this.zzj = object = zzadx2.zzw(n3, n4);
        this.zzg = zzaog2 = new zzaog((zzafa)object);
        object = this.zzb;
        if (object != null) {
            ((zzapr)object).zzb(zzadx2, zzapo2);
        }
    }

    public final void zzc() {
    }

    public final void zzd(long l2, int n3) {
        this.zzl = l2;
    }

    public final void zze() {
        zzgr.zzf(this.zzd);
        this.zze.zzb();
        Object object = this.zzg;
        if (object != null) {
            ((zzaog)object).zzd();
        }
        if ((object = this.zzf) != null) {
            ((zzaor)object).zzb();
        }
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }
}

