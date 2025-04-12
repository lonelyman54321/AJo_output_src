/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzewk;
import com.google.android.gms.internal.ads.zzewm;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfvd;
import com.google.android.gms.internal.ads.zzfvg;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

public final class zzewl
implements zzexw {
    private final Context zza;
    private final zzgge zzb;
    private final zzfho zzc;
    private final VersionInfoParcel zzd;

    public zzewl(Context context, zzgge zzgge2, zzfho zzfho2, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzgge2;
        this.zzc = zzfho2;
        this.zzd = versionInfoParcel;
    }

    public final int zza() {
        return 53;
    }

    public final ListenableFuture zzb() {
        zzewk zzewk2 = new zzewk(this);
        return this.zzb.zzb(zzewk2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ zzewm zzc() {
        block14: {
            block18: {
                block17: {
                    block16: {
                        block15: {
                            block13: {
                                try {
                                    var1_1 = this.zza;
                                    var2_4 = this.zzc;
                                    var3_6 = var2_4.zzb();
                                    var2_4 = new zzfvd();
                                    var4_7 = new zzfvd();
                                    var5_8 = 1;
                                    if (!var3_6) break block13;
                                    var6_9 = zzbep.zzcW;
                                    var7_10 = zzba.zzc();
                                    var6_9 = var7_10.zza((zzbeg)var6_9);
                                    var8_11 = (var6_9 = (Boolean)var6_9).booleanValue();
                                    if (!var8_11) {
                                        return new zzewm((boolean)var5_8);
                                    }
                                }
                                catch (IOException var1_2) {
                                    break block14;
                                }
                            }
                            if (var3_6) break block15;
                            var6_9 = zzbep.zzcS;
                            var7_10 = zzba.zzc();
                            var6_9 = var7_10.zza((zzbeg)var6_9);
                            var8_11 = (var6_9 = (Boolean)var6_9).booleanValue();
                            if (var8_11) break block16;
                        }
                        if (!var3_6) break block17;
                        var6_9 = zzbep.zzcU;
                        var7_10 = zzba.zzc();
                        var6_9 = var7_10.zza((zzbeg)var6_9);
                        var8_11 = (var6_9 = (Boolean)var6_9).booleanValue();
                        if (!var8_11) break block17;
                    }
                    var2_4 = zzfvg.zzj((Context)var1_1);
                    var6_9 = zzbep.zzdg;
                    var7_10 = zzba.zzc();
                    var6_9 = var7_10.zza((zzbeg)var6_9);
                    var6_9 = (Long)var6_9;
                    var9_12 = var6_9.longValue();
                    var11_13 = zzu.zzo();
                    var11_13 = var11_13.zzi();
                    var12_14 = var11_13.zzS();
                    var2_4 = var2_4.zzh(var9_12, var12_14);
                }
                var6_9 = zzbep.zzdd;
                var7_10 = zzba.zzc();
                var6_9 = var7_10.zza((zzbeg)var6_9);
                var8_11 = (var6_9 = (Boolean)var6_9).booleanValue();
                if (var8_11) {
                    var6_9 = this.zzd;
                    var8_11 = var6_9.clientJarVersion;
                    var7_10 = zzbep.zzdc;
                    var11_13 = zzba.zzc();
                    var7_10 = var11_13.zza((zzbeg)var7_10);
                    var13_15 = (var7_10 = (Integer)var7_10).intValue();
                    if (var8_11 < var13_15) {
                        var6_9 = zzfvh.zzi((Context)var1_1);
                        var6_9.zzj();
                    }
                }
                if (var3_6) break block18;
                var6_9 = zzbep.zzcT;
                var7_10 = zzba.zzc();
                var6_9 = var7_10.zza((zzbeg)var6_9);
                var8_11 = (int)(var6_9 = (Boolean)var6_9).booleanValue();
                if (var8_11) ** GOTO lbl-1000
            }
            if (var3_6) {
                var6_9 = zzbep.zzcV;
                var7_10 = zzba.zzc();
                var6_9 = var7_10.zza((zzbeg)var6_9);
                var8_11 = (int)(var6_9 = (Boolean)var6_9).booleanValue();
                ** if (!var8_11) goto lbl-1000
            }
            ** GOTO lbl-1000
lbl-1000:
            // 2 sources

            {
                var1_1 = zzfvh.zzi((Context)var1_1);
                var6_9 = this.zzd;
                var8_11 = var6_9.clientJarVersion;
                var7_10 = zzbep.zzdc;
                var11_13 = zzba.zzc();
                var7_10 = var11_13.zza((zzbeg)var7_10);
                var13_15 = (var7_10 = (Integer)var7_10).intValue();
                if (var8_11 >= var13_15) {
                    var4_7 = zzbep.zzdh;
                    var14_16 = zzba.zzc();
                    var4_7 = var14_16.zza((zzbeg)var4_7);
                    var4_7 = (Long)var4_7;
                    var15_17 = var4_7.longValue();
                    var6_9 = zzu.zzo();
                    var6_9 = var6_9.zzi();
                    var8_11 = (int)var6_9.zzS();
                    var4_7 = var1_1.zzh(var15_17, (boolean)var8_11);
                    var5_8 = (int)var1_1.zzo();
                }
                var12_14 = var17_18 = var1_1.zzp();
                var6_9 = var4_7;
                var13_15 = var5_8;
                ** GOTO lbl97
            }
lbl-1000:
            // 2 sources

            {
                var6_9 = var4_7;
                var13_15 = 1;
                var12_14 = true;
            }
lbl97:
            // 2 sources

            var4_7 = var1_1;
            var14_16 = var2_4;
            return new zzewm((zzfvd)var2_4, (zzfvd)var6_9, (boolean)var13_15, var12_14, var3_6);
        }
        zzu.zzo().zzw(var1_2, "PerAppIdSignal");
        var1_3 = this.zzc;
        var17_19 = var1_3.zzb();
        return new zzewm(var17_19);
    }
}

