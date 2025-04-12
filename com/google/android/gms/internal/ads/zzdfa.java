/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.internal.ads.zzczl;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzdab;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzdbk;
import com.google.android.gms.internal.ads.zzdbw;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdfc;
import com.google.android.gms.internal.ads.zzdha;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.android.gms.internal.ads.zzfeh;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

public final class zzdfa {
    private final Set zza;
    private final Set zzb;
    private final Set zzc;
    private final Set zzd;
    private final Set zze;
    private final Set zzf;
    private final Set zzg;
    private final Set zzh;
    private final Set zzi;
    private final Set zzj;
    private final Set zzk;
    private final Set zzl;
    private final Set zzm;
    private final Set zzn;
    private zzfeh zzo;

    public zzdfa() {
        HashSet hashSet;
        this.zza = hashSet = new HashSet();
        this.zzb = hashSet = new HashSet();
        this.zzc = hashSet = new HashSet();
        this.zzd = hashSet = new HashSet();
        this.zze = hashSet = new HashSet();
        this.zzf = hashSet = new HashSet();
        this.zzg = hashSet = new HashSet();
        this.zzh = hashSet = new HashSet();
        this.zzi = hashSet = new HashSet();
        this.zzj = hashSet = new HashSet();
        this.zzk = hashSet = new HashSet();
        this.zzl = hashSet = new HashSet();
        this.zzm = hashSet = new HashSet();
        this.zzn = hashSet = new HashSet();
    }

    public static /* bridge */ /* synthetic */ Set zzA(zzdfa zzdfa2) {
        return zzdfa2.zzb;
    }

    public static /* bridge */ /* synthetic */ Set zzB(zzdfa zzdfa2) {
        return zzdfa2.zzk;
    }

    public static /* bridge */ /* synthetic */ Set zzC(zzdfa zzdfa2) {
        return zzdfa2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzfeh zzo(zzdfa zzdfa2) {
        return zzdfa2.zzo;
    }

    public static /* bridge */ /* synthetic */ Set zzp(zzdfa zzdfa2) {
        return zzdfa2.zzc;
    }

    public static /* bridge */ /* synthetic */ Set zzq(zzdfa zzdfa2) {
        return zzdfa2.zzi;
    }

    public static /* bridge */ /* synthetic */ Set zzr(zzdfa zzdfa2) {
        return zzdfa2.zzl;
    }

    public static /* bridge */ /* synthetic */ Set zzs(zzdfa zzdfa2) {
        return zzdfa2.zzf;
    }

    public static /* bridge */ /* synthetic */ Set zzt(zzdfa zzdfa2) {
        return zzdfa2.zze;
    }

    public static /* bridge */ /* synthetic */ Set zzu(zzdfa zzdfa2) {
        return zzdfa2.zzh;
    }

    public static /* bridge */ /* synthetic */ Set zzv(zzdfa zzdfa2) {
        return zzdfa2.zza;
    }

    public static /* bridge */ /* synthetic */ Set zzw(zzdfa zzdfa2) {
        return zzdfa2.zzj;
    }

    public static /* bridge */ /* synthetic */ Set zzx(zzdfa zzdfa2) {
        return zzdfa2.zzg;
    }

    public static /* bridge */ /* synthetic */ Set zzy(zzdfa zzdfa2) {
        return zzdfa2.zzn;
    }

    public static /* bridge */ /* synthetic */ Set zzz(zzdfa zzdfa2) {
        return zzdfa2.zzm;
    }

    public final zzdfa zza(zza zza2, Executor executor) {
        zzdha zzdha2 = new zzdha(zza2, executor);
        this.zzc.add(zzdha2);
        return this;
    }

    public final zzdfa zzb(zzczo zzczo2, Executor executor) {
        zzdha zzdha2 = new zzdha(zzczo2, executor);
        this.zzi.add(zzdha2);
        return this;
    }

    public final zzdfa zzc(zzdab zzdab2, Executor executor) {
        zzdha zzdha2 = new zzdha(zzdab2, executor);
        this.zzl.add(zzdha2);
        return this;
    }

    public final zzdfa zzd(zzdaf zzdaf2, Executor executor) {
        zzdha zzdha2 = new zzdha(zzdaf2, executor);
        this.zzf.add(zzdha2);
        return this;
    }

    public final zzdfa zze(zzczl zzczl2, Executor executor) {
        zzdha zzdha2 = new zzdha(zzczl2, executor);
        this.zze.add(zzdha2);
        return this;
    }

    public final zzdfa zzf(zzdaz zzdaz2, Executor executor) {
        zzdha zzdha2 = new zzdha(zzdaz2, executor);
        this.zzh.add(zzdha2);
        return this;
    }

    public final zzdfa zzg(zzdbk zzdbk2, Executor executor) {
        zzdha zzdha2 = new zzdha(zzdbk2, executor);
        this.zzg.add(zzdha2);
        return this;
    }

    public final zzdfa zzh(zzp zzp2, Executor executor) {
        zzdha zzdha2 = new zzdha(zzp2, executor);
        this.zzn.add(zzdha2);
        return this;
    }

    public final zzdfa zzi(zzdbw zzdbw2, Executor executor) {
        zzdha zzdha2 = new zzdha(zzdbw2, executor);
        this.zzm.add(zzdha2);
        return this;
    }

    public final zzdfa zzj(zzdcg zzdcg2, Executor executor) {
        zzdha zzdha2 = new zzdha(zzdcg2, executor);
        this.zzb.add(zzdha2);
        return this;
    }

    public final zzdfa zzk(AppEventListener appEventListener, Executor executor) {
        zzdha zzdha2 = new zzdha(appEventListener, executor);
        this.zzk.add(zzdha2);
        return this;
    }

    public final zzdfa zzl(zzdhi zzdhi2, Executor executor) {
        zzdha zzdha2 = new zzdha(zzdhi2, executor);
        this.zzd.add(zzdha2);
        return this;
    }

    public final zzdfa zzm(zzfeh zzfeh2) {
        this.zzo = zzfeh2;
        return this;
    }

    public final zzdfc zzn() {
        zzdfc zzdfc2 = new zzdfc(this, null);
        return zzdfc2;
    }
}

