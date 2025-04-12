/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchp;
import com.google.android.gms.internal.ads.zzcit;
import com.google.android.gms.internal.ads.zzciu;
import com.google.android.gms.internal.ads.zzczy;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzdri;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzemf;
import com.google.android.gms.internal.ads.zzemg;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

final class zzemh
implements zzdjp {
    private final Context zza;
    private final zzdsd zzb;
    private final zzfho zzc;
    private final VersionInfoParcel zzd;
    private final zzfgt zze;
    private final ListenableFuture zzf;
    private final zzchd zzg;
    private final zzbls zzh;
    private final boolean zzi;
    private final zzegk zzj;

    public zzemh(Context context, zzdsd zzdsd2, zzfho zzfho2, VersionInfoParcel versionInfoParcel, zzfgt zzfgt2, ListenableFuture listenableFuture, zzchd zzchd2, zzbls zzbls2, boolean bl2, zzegk zzegk2) {
        this.zza = context;
        this.zzb = zzdsd2;
        this.zzc = zzfho2;
        this.zzd = versionInfoParcel;
        this.zze = zzfgt2;
        this.zzf = listenableFuture;
        this.zzg = zzchd2;
        this.zzh = zzbls2;
        this.zzi = bl2;
        this.zzj = zzegk2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(boolean var1_1, Context var2_2, zzczy var3_3) {
        block15: {
            block14: {
                var4_4 = this;
                var5_5 = (zzdri)zzgft.zzq(this.zzf);
                try {
                    var6_7 = this.zze;
                    var7_8 = this.zzg;
                    var8_9 = var7_8.zzaG();
                    var9_10 = true;
                    var10_11 = null;
                    if (var8_9) break block14;
                    var6_7 = this.zzg;
                    ** GOTO lbl21
                }
                catch (zzchp var5_6) {
                    break block15;
                }
            }
            var7_8 = zzbep.zzaN;
            var12_12 = zzba.zzc();
            var7_8 = var12_12.zza((zzbeg)var7_8);
            var8_9 = (var7_8 = (Boolean)var7_8).booleanValue();
            if (!var8_9) {
                var6_7 = this.zzg;
lbl21:
                // 2 sources

                var11_13 = var6_7;
            } else {
                var7_8 = this.zzb;
                var12_12 = this.zzc;
                var12_12 = var12_12.zze;
                var7_8 = var7_8.zza((zzq)var12_12, null, null);
                var12_12 = var5_5.zzg();
                zzbmh.zzb((zzchd)var7_8, (zzbmg)var12_12);
                var12_12 = new zzdsh();
                var13_14 = this.zza;
                var14_15 = var7_8;
                var14_15 = (View)var7_8;
                var12_12.zza((Context)var13_14, (View)var14_15);
                var13_14 = var5_5.zzl();
                var15_16 = this.zzi;
                if (var15_16) {
                    var14_15 = this.zzh;
                } else {
                    var15_16 = false;
                    var14_15 = null;
                }
                var13_14.zzi((zzchd)var7_8, var9_10, (zzbls)var14_15);
                var13_14 = var7_8.zzN();
                var14_15 = new zzemf((zzdsh)var12_12, (zzchd)var7_8);
                var13_14.zzB((zzcit)var14_15);
                var12_12 = var7_8.zzN();
                var13_14 = new zzemg((zzchd)var7_8);
                var12_12.zzH((zzciu)var13_14);
                var6_7 = var6_7.zzt;
                var12_12 = var6_7.zzb;
                var6_7 = var6_7.zza;
                var7_8.zzae((String)var12_12, (String)var6_7, null);
                var11_13 = var7_8;
            }
            var11_13.zzaq(var9_10);
            var16_17 = var4_4.zzi;
            var17_18 = false;
            var12_12 = null;
            if (var16_17) {
                var6_7 = var4_4.zzh;
                var18_19 = var16_17 = var6_7.zze(false);
            } else {
                var18_19 = false;
                var19_20 = null;
            }
            zzu.zzp();
            var6_7 = var4_4.zza;
            var20_21 = var4_4.zzi;
            var21_22 = zzt.zzI((Context)var6_7);
            if (var20_21) {
                var6_7 = var4_4.zzh;
                var22_23 = var16_17 = var6_7.zzd();
            } else {
                var22_23 = false;
                var23_24 = null;
            }
            var16_17 = var4_4.zzi;
            if (var16_17) {
                var6_7 = var4_4.zzh;
                var25_27 = var24_25 = var6_7.zza();
            } else {
                var16_17 = false;
                var24_26 = 0.0f;
                var6_7 = null;
                var25_27 = 0.0f;
            }
            var6_7 = var4_4.zze;
            var17_18 = var6_7.zzP;
            var16_17 = var6_7.zzQ;
            var26_28 = -1;
            var7_8 = new zzk(var18_19, var21_22, var22_23, var25_27, var26_28, var1_1, var17_18, var16_17);
            if (var3_3 != null) {
                var3_3.zzf();
            }
            zzu.zzi();
            var27_29 = var5_5.zzh();
            var5_5 = var4_4.zze;
            var19_20 = var4_4.zzd;
            var28_30 = var5_5.zzR;
            var29_31 = var5_5.zzC;
            var12_12 = var5_5.zzt;
            var23_24 = var12_12.zzb;
            var12_12 = var12_12.zza;
            var13_14 = var4_4.zzc;
            var30_32 = var5_5.zzaj;
            if (var30_32) {
                var10_11 = var4_4.zzj;
            }
            var31_33 = var10_11;
            var5_5 = var13_14.zzf;
            var13_14 = var6_7;
            var10_11 = var23_24;
            var23_24 = var7_8;
            var6_7 = new AdOverlayInfoParcel(null, (zzp)var27_29, null, (zzchd)var11_13, var28_30, var19_20, var29_31, (zzk)var7_8, (String)var10_11, (String)var12_12, (String)var5_5, var3_3, (zzbuz)var31_33);
            var5_5 = var2_2;
            zzn.zza(var2_2, (AdOverlayInfoParcel)var6_7, var9_10);
            return;
        }
        zzm.zzh("", var5_6);
    }
}

