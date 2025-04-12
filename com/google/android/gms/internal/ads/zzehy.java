/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcrq;
import com.google.android.gms.internal.ads.zzczy;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

final class zzehy
implements zzdjp {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzfgt zzc;
    private final zzchd zzd;
    private final zzfho zze;
    private final zzbls zzf;
    private final boolean zzg;
    private final zzegk zzh;

    public zzehy(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfgt zzfgt2, zzchd zzchd2, zzfho zzfho2, boolean bl2, zzbls zzbls2, zzegk zzegk2) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfgt2;
        this.zzd = zzchd2;
        this.zze = zzfho2;
        this.zzg = bl2;
        this.zzf = zzbls2;
        this.zzh = zzegk2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zza(boolean var1_1, Context var2_2, zzczy var3_3) {
        block15: {
            var4_4 = this;
            var5_5 = (zzcrq)zzgft.zzq(this.zzb);
            var6_6 = this.zzd;
            var7_7 = true;
            var6_6.zzaq(var7_7);
            var8_8 = this.zzg;
            if (var8_8) {
                var9_9 = this.zzf;
                var10_10 = var8_8 = var9_9.zze(var7_7);
            } else {
                var10_10 = true;
            }
            var8_8 = var4_4.zzg;
            if (var8_8) {
                var11_11 = var4_4.zzf;
                var13_13 = var12_12 = var11_11.zzd();
            } else {
                var12_12 = false;
                var11_11 = null;
                var13_13 = false;
            }
            if (var8_8) {
                var9_9 = var4_4.zzf;
                var15_15 = var14_14 = var9_9.zza();
            } else {
                var8_8 = false;
                var14_14 = 0.0f;
                var9_9 = null;
                var15_15 = 0.0f;
                var16_16 = null;
            }
            var17_17 = var4_4.zzc.zzP;
            var18_18 = null;
            var12_12 = true;
            var19_19 = -1;
            var9_9 = var6_6;
            var6_6 = new zzk(var10_10, var12_12, var13_13, var15_15, var19_19, var1_1, var17_17, false);
            if (var3_3 != null) {
                var3_3.zzf();
            }
            zzu.zzi();
            var11_11 = var5_5.zzg();
            var16_16 = var4_4.zzd;
            var5_5 = var4_4.zzc;
            var21_21 = var5_5.zzR;
            var8_8 = -1 != 0;
            var14_14 = 0.0f / 0.0f;
            if (var21_21 != var8_8) lbl-1000:
            // 2 sources

            {
                while (true) {
                    var19_19 = var21_21;
                    break block15;
                    break;
                }
            }
            var5_5 = var4_4.zze.zzj;
            if (var5_5 == null) ** GOTO lbl-1000
            var21_21 = var5_5.zza;
            if (var21_21 == var7_7) {
                var21_21 = 7 != 0;
                var19_19 = 7;
            } else {
                var8_8 = 2 != 0;
                var14_14 = 2.8E-45f;
                if (var21_21 == var8_8) {
                    var21_21 = 6 != 0;
                    var19_19 = 6;
                } else lbl-1000:
                // 2 sources

                {
                    zzm.zze("Error setting app open orientation; no targeting orientation available.");
                    var5_5 = var4_4.zzc;
                    var21_21 = var5_5.zzR;
                    ** continue;
                }
            }
        }
        var22_22 = var4_4.zza;
        var5_5 = var4_4.zzc;
        var23_23 = var5_5.zzC;
        var9_9 = var5_5.zzt;
        var24_24 = var9_9.zzb;
        var25_25 = var9_9.zza;
        var9_9 = var4_4.zze;
        var21_21 = var5_5.zzaj;
        if (var21_21) {
            var5_5 = var4_4.zzh;
lbl77:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var21_21 = false;
        var5_5 = null;
        ** while (true)
        var26_26 = var5_5;
        var5_5 = var9_9.zzf;
        var9_9 = var20_20;
        var18_18 = var6_6;
        var6_6 = var20_20;
        var20_20 = var5_5;
        var9_9(null, (zzp)var11_11, null, var16_16, var19_19, var22_22, var23_23, (zzk)var18_18, var24_24, var25_25, (String)var5_5, var3_3, (zzbuz)var26_26);
        var5_5 = var2_2;
        zzn.zza(var2_2, (AdOverlayInfoParcel)var9_9, var7_7);
    }
}

