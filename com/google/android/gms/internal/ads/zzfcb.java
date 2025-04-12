/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Pair
 *  android.view.ViewGroup
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcrp;
import com.google.android.gms.internal.ads.zzcsc;
import com.google.android.gms.internal.ads.zzcyr;
import com.google.android.gms.internal.ads.zzcyt;
import com.google.android.gms.internal.ads.zzcyv;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzdab;
import com.google.android.gms.internal.ads.zzdbk;
import com.google.android.gms.internal.ads.zzdbw;
import com.google.android.gms.internal.ads.zzdfa;
import com.google.android.gms.internal.ads.zzdfc;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzdun;
import com.google.android.gms.internal.ads.zzepq;
import com.google.android.gms.internal.ads.zzepr;
import com.google.android.gms.internal.ads.zzeps;
import com.google.android.gms.internal.ads.zzfbv;
import com.google.android.gms.internal.ads.zzfbw;
import com.google.android.gms.internal.ads.zzfby;
import com.google.android.gms.internal.ads.zzfca;
import com.google.android.gms.internal.ads.zzfcr;
import com.google.android.gms.internal.ads.zzfeh;
import com.google.android.gms.internal.ads.zzfei;
import com.google.android.gms.internal.ads.zzfej;
import com.google.android.gms.internal.ads.zzfek;
import com.google.android.gms.internal.ads.zzfel;
import com.google.android.gms.internal.ads.zzfhm;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfil;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmm;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfmw;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public abstract class zzfcb
implements zzeps {
    protected final zzcjd zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfcr zzd;
    private final zzfek zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfmq zzh;
    private final zzfhm zzi;
    private ListenableFuture zzj;

    public zzfcb(Context object, Executor executor, zzcjd zzcjd2, zzfek zzfek2, zzfcr zzfcr2, zzfhm zzfhm2, VersionInfoParcel versionInfoParcel) {
        this.zzb = object;
        this.zzc = executor;
        this.zza = zzcjd2;
        this.zze = zzfek2;
        this.zzd = zzfcr2;
        this.zzi = zzfhm2;
        this.zzf = versionInfoParcel;
        super(object);
        this.zzg = executor;
        object = zzcjd2.zzz();
        this.zzh = object;
    }

    public static /* synthetic */ zzcyr zzc(zzfcb zzfcb2, zzfei zzfei2) {
        return zzfcb2.zzm(zzfei2);
    }

    public static /* bridge */ /* synthetic */ zzcyr zzd(zzfcb zzfcb2, zzfei zzfei2) {
        return zzfcb2.zzm(zzfei2);
    }

    public static /* bridge */ /* synthetic */ zzfcr zzf(zzfcb zzfcb2) {
        return zzfcb2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzfek zzg(zzfcb zzfcb2) {
        return zzfcb2.zze;
    }

    public static /* bridge */ /* synthetic */ zzfmq zzh(zzfcb zzfcb2) {
        return zzfcb2.zzh;
    }

    public static /* bridge */ /* synthetic */ Executor zzi(zzfcb zzfcb2) {
        return zzfcb2.zzc;
    }

    public static /* bridge */ /* synthetic */ void zzj(zzfcb zzfcb2, ListenableFuture listenableFuture) {
        zzfcb2.zzj = null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzcyr zzm(zzfei object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object2;
                Object object3;
                try {
                    object = (zzfca)object;
                    object3 = zzbep.zzil;
                    object2 = zzba.zzc();
                    object3 = ((zzben)object2).zza((zzbeg)object3);
                    object3 = (Boolean)object3;
                    boolean bl2 = (Boolean)object3;
                    if (bl2) {
                        object3 = this.zzg;
                        object2 = new zzcsc((ViewGroup)object3);
                        object3 = new zzcyt();
                        Object object4 = this.zzb;
                        ((zzcyt)object3).zze((Context)object4);
                        object = ((zzfca)object).zza;
                        ((zzcyt)object3).zzi((zzfho)object);
                        object = ((zzcyt)object3).zzj();
                        object3 = new zzdfa();
                        object4 = this.zzd;
                        Executor executor = this.zzc;
                        ((zzdfa)object3).zzc((zzdab)object4, executor);
                        object4 = this.zzd;
                        executor = this.zzc;
                        ((zzdfa)object3).zzl((zzdhi)object4, executor);
                        object3 = ((zzdfa)object3).zzn();
                        return this.zze((zzcsc)object2, (zzcyv)object, (zzdfc)object3);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    object3 = this.zzd;
                    object3 = zzfcr.zzi((zzfcr)object3);
                    object2 = new zzdfa();
                    Object object5 = this.zzc;
                    ((zzdfa)object2).zzb((zzczo)object3, (Executor)object5);
                    object5 = this.zzc;
                    ((zzdfa)object2).zzg((zzdbk)object3, (Executor)object5);
                    object5 = this.zzc;
                    ((zzdfa)object2).zzh((zzp)object3, (Executor)object5);
                    object5 = this.zzc;
                    ((zzdfa)object2).zzi((zzdbw)object3, (Executor)object5);
                    object5 = this.zzc;
                    ((zzdfa)object2).zzc((zzdab)object3, (Executor)object5);
                    object5 = this.zzc;
                    ((zzdfa)object2).zzl((zzdhi)object3, (Executor)object5);
                    ((zzdfa)object2).zzm((zzfeh)object3);
                    object3 = this.zzg;
                    object5 = new zzcsc((ViewGroup)object3);
                    object3 = new zzcyt();
                    Context context = this.zzb;
                    ((zzcyt)object3).zze(context);
                    object = ((zzfca)object).zza;
                    ((zzcyt)object3).zzi((zzfho)object);
                    object = ((zzcyt)object3).zzj();
                    object3 = ((zzdfa)object2).zzn();
                    return this.zze((zzcsc)object5, (zzcyv)object, (zzdfc)object3);
                }
            }
            throw throwable2;
        }
    }

    public final boolean zza() {
        boolean bl2;
        ListenableFuture listenableFuture = this.zzj;
        return listenableFuture != null && !(bl2 = listenableFuture.isDone());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzb(zzl var1_1, String var2_3, zzepq var3_4, zzepr var4_5) {
        var3_4 = null;
        var5_6 = true;
        synchronized (this) {
            block12: {
                block11: {
                    block10: {
                        block9: {
                            try {
                                var6_7 = zzbgi.zzd;
                                var6_7 = var6_7.zze();
                                var6_7 = (Boolean)var6_7;
                                var7_8 = var6_7.booleanValue();
                                if (!var7_8) ** GOTO lbl-1000
                                var6_7 = zzbep.zzlg;
                                var8_9 = zzba.zzc();
                                var6_7 = var8_9.zza((zzbeg)var6_7);
                                var7_8 = (var6_7 = (Boolean)var6_7).booleanValue();
                                if (var7_8) {
                                    var7_8 = true;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var7_8 = false;
                                    var6_7 = null;
                                }
                                var8_9 = this.zzf;
                                var9_10 = var8_9.clientJarVersion;
                                var10_11 = zzbep.zzlh;
                                var11_12 = zzba.zzc();
                                var10_11 = var11_12.zza((zzbeg)var10_11);
                                var10_11 = (Integer)var10_11;
                                var12_13 = var10_11.intValue();
                                if (var9_10 < var12_13 || !var7_8) {
                                    var6_7 = "loadAd must be called on the main UI thread.";
                                    Preconditions.checkMainThread((String)var6_7);
                                }
                                if (var2_3 == null) {
                                    var1_1 = "Ad unit ID should not be null for app open ad.";
                                    zzm.zzg((String)var1_1);
                                    var1_1 = this.zzc;
                                    var2_3 = new zzfbv(this);
                                    var1_1.execute((Runnable)var2_3);
                                    return false;
                                }
                                var6_7 = this.zzj;
                                if (var6_7 == null) break block9;
                            }
                            catch (Throwable var1_2) {}
                            return false;
                        }
                        var6_7 = zzbgd.zzc;
                        var6_7 = var6_7.zze();
                        var6_7 = (Boolean)var6_7;
                        var7_8 = var6_7.booleanValue();
                        var9_10 = 0;
                        var8_9 = null;
                        if (!var7_8 || (var10_11 = (var6_7 = this.zze).zzd()) == null) break block10;
                        var6_7 = var6_7.zzd();
                        var6_7 = (zzcrp)var6_7;
                        var6_7 = var6_7.zzh();
                        var10_11 = zzfmw.zzf;
                        var6_7.zzd((zzfmw)var10_11);
                        var10_11 = var1_1.zzp;
                        var6_7.zzb((String)var10_11);
                        var10_11 = var1_1.zzm;
                        var6_7.zzg((Bundle)var10_11);
                        var11_12 = var6_7;
                        break block11;
                        break block12;
                    }
                    var11_12 = null;
                }
                var6_7 = this.zzb;
                var12_13 = (int)var1_1.zzf;
                zzfil.zza((Context)var6_7, (boolean)var12_13);
                var6_7 = zzbep.zziU;
                var10_11 = zzba.zzc();
                var6_7 = var10_11.zza((zzbeg)var6_7);
                var6_7 = (Boolean)var6_7;
                var7_8 = var6_7.booleanValue();
                if (var7_8 && (var7_8 = var1_1.zzf)) {
                    var6_7 = this.zza;
                    var6_7 = var6_7.zzl();
                    var6_7.zzo(var5_6);
                }
                var10_11 = zzdul.zza;
                var10_11 = var10_11.zza();
                var13_14 = var1_1.zzz;
                var15_15 = var13_14;
                var6_7 = new Pair(var10_11, var15_15);
                var15_15 = zzdul.zzb;
                var15_15 = var15_15.zza();
                var16_16 = zzu.zzB();
                var17_17 = var16_16.currentTimeMillis();
                var16_16 = var17_17;
                var10_11 = new Pair(var15_15, var16_16);
                var19_18 = 2;
                var15_15 = new Pair[var19_18];
                var15_15[0] = var6_7;
                var15_15[var5_6] = var10_11;
                var3_4 = zzdun.zza((Pair[])var15_15);
                var6_7 = this.zzi;
                var6_7.zzt((String)var2_3);
                var2_3 = zzq.zzb();
                var6_7.zzs((zzq)var2_3);
                var6_7.zzH((zzl)var1_1);
                var6_7.zzA((Bundle)var3_4);
                var2_3 = this.zzb;
                var3_4 = var6_7.zzJ();
                var6_7 = zzfmm.zza((zzfho)var3_4);
                var10_11 = zzfmw.zzf;
                var15_15 = zzfmb.zzb((Context)var2_3, (zzfmu)var6_7, (zzfmw)var10_11, (zzl)var1_1);
                var16_16 = new zzfca(null);
                var16_16.zza = var3_4;
                var1_1 = this.zze;
                var2_3 = new zzfel((zzfei)var16_16, null);
                var3_4 = new zzfbw(this);
                this.zzj = var1_1 = var1_1.zzc((zzfel)var2_3, (zzfej)var3_4, null);
                var6_7 = var2_3;
                var8_9 = this;
                var10_11 = var4_5;
                var2_3 = new zzfby(this, var4_5, (zzfmn)var11_12, (zzfmc)var15_15, (zzfca)var16_16);
                var3_4 = this.zzc;
                zzgft.zzr((ListenableFuture)var1_1, (zzgfp)var2_3, (Executor)var3_4);
                return var5_6;
            }
            throw var1_2;
        }
    }

    public abstract zzcyr zze(zzcsc var1, zzcyv var2, zzdfc var3);

    public final /* synthetic */ void zzk() {
        zzfcr zzfcr2 = this.zzd;
        zze zze2 = zzfiq.zzd(6, null, null);
        zzfcr2.zzdB(zze2);
    }

    public final void zzl(zzw zzw2) {
        this.zzi.zzu(zzw2);
    }
}

