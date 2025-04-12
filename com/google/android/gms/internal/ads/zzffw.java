/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbyn;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzczl;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzdab;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzdbw;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.android.gms.internal.ads.zzfdx;
import com.google.android.gms.internal.ads.zzfdy;
import com.google.android.gms.internal.ads.zzfeh;
import com.google.android.gms.internal.ads.zzffa;
import com.google.android.gms.internal.ads.zzffb;
import com.google.android.gms.internal.ads.zzffc;
import com.google.android.gms.internal.ads.zzffd;
import com.google.android.gms.internal.ads.zzffe;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzffg;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzffi;
import com.google.android.gms.internal.ads.zzffj;
import com.google.android.gms.internal.ads.zzffk;
import com.google.android.gms.internal.ads.zzffl;
import com.google.android.gms.internal.ads.zzffm;
import com.google.android.gms.internal.ads.zzffn;
import com.google.android.gms.internal.ads.zzffo;
import com.google.android.gms.internal.ads.zzffp;
import com.google.android.gms.internal.ads.zzffq;
import com.google.android.gms.internal.ads.zzffr;
import com.google.android.gms.internal.ads.zzffs;
import com.google.android.gms.internal.ads.zzfft;
import com.google.android.gms.internal.ads.zzffu;
import com.google.android.gms.internal.ads.zzffv;
import com.google.android.gms.internal.ads.zzfiy;
import java.util.concurrent.atomic.AtomicReference;

public final class zzffw
implements OnAdMetadataChangedListener,
zzdaz,
zzczo,
zzczl,
zzdab,
zzdbw,
zzfeh,
zzdhi {
    private final zzfiy zza;
    private final AtomicReference zzb;
    private final AtomicReference zzc;
    private final AtomicReference zzd;
    private final AtomicReference zze;
    private final AtomicReference zzf;
    private final AtomicReference zzg;
    private final AtomicReference zzh;

    public zzffw(zzfiy zzfiy2) {
        AtomicReference atomicReference;
        this.zzb = atomicReference = new AtomicReference();
        this.zzc = atomicReference = new AtomicReference();
        this.zzd = atomicReference = new AtomicReference();
        this.zze = atomicReference = new AtomicReference();
        this.zzf = atomicReference = new AtomicReference();
        this.zzg = atomicReference = new AtomicReference();
        this.zzh = atomicReference = new AtomicReference();
        this.zza = zzfiy2;
    }

    public final void onAdMetadataChanged() {
        zzffk zzffk2 = new zzffk();
        zzfdy.zza(this.zzb, zzffk2);
    }

    public final void zza() {
        this.zza.zza();
        zzfdx zzfdx2 = new zzffs();
        zzfdy.zza(this.zzd, zzfdx2);
        zzfdx2 = new zzfft();
        zzfdy.zza(this.zze, zzfdx2);
    }

    public final void zzb() {
        zzffu zzffu2 = new zzffu();
        zzfdy.zza(this.zze, zzffu2);
    }

    public final void zzc() {
        zzfdx zzfdx2 = new zzffe();
        zzfdy.zza(this.zzd, zzfdx2);
        zzfdx2 = new zzfff();
        zzfdy.zza(this.zze, zzfdx2);
        zzfdx2 = new zzffg();
        zzfdy.zza(this.zzd, zzfdx2);
    }

    public final void zzdB(zze object) {
        int n3 = ((zze)object).zza;
        zzffp zzffp2 = new zzffp((zze)object);
        zzfdy.zza(this.zzc, zzffp2);
        object = new zzffq(n3);
        zzfdy.zza(this.zzc, (zzfdx)object);
        object = new zzffr(n3);
        zzfdy.zza(this.zze, (zzfdx)object);
    }

    public final void zzdG() {
        zzffl zzffl2 = new zzffl();
        zzfdy.zza(this.zzd, zzffl2);
    }

    public final void zzdf() {
    }

    public final void zzds(zzbyh zzbyh2, String string2, String string3) {
        zzfdx zzfdx2 = new zzffv(zzbyh2);
        zzfdy.zza(this.zzd, zzfdx2);
        zzfdx2 = new zzffb(zzbyh2, string2, string3);
        zzfdy.zza(this.zzf, zzfdx2);
        zzfdx2 = new zzffc(zzbyh2);
        zzfdy.zza(this.zze, zzfdx2);
        zzfdx2 = new zzffd(zzbyh2, string2, string3);
        zzfdy.zza(this.zzg, zzfdx2);
    }

    public final void zze() {
        zzffo zzffo2 = new zzffo();
        zzfdy.zza(this.zze, zzffo2);
    }

    public final void zzf() {
        zzffa zzffa2 = new zzffa();
        zzfdy.zza(this.zze, zzffa2);
    }

    public final void zzg(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    public final void zzh(zzs zzs2) {
        zzffh zzffh2 = new zzffh(zzs2);
        zzfdy.zza(this.zzh, zzffh2);
    }

    public final void zzi(zzdg zzdg2) {
        this.zzh.set(zzdg2);
    }

    public final void zzj(zzbzd zzbzd2) {
        this.zzd.set(zzbzd2);
    }

    public final void zzk(zzbzh zzbzh2) {
        this.zzc.set(zzbzh2);
    }

    public final void zzl(zzfeh zzfeh2) {
        throw null;
    }

    public final void zzm(zzbyn zzbyn2) {
        this.zze.set(zzbyn2);
    }

    public final void zzn(zzbyi zzbyi2) {
        this.zzg.set(zzbyi2);
    }

    public final void zzo(zzbzi zzbzi2) {
        this.zzf.set(zzbzi2);
    }

    public final void zzq(zze zze2) {
        zzfdx zzfdx2 = new zzffm(zze2);
        zzfdy.zza(this.zzd, zzfdx2);
        zzfdx2 = new zzffn(zze2);
        zzfdy.zza(this.zzd, zzfdx2);
    }

    public final void zzs() {
        zzfdx zzfdx2 = new zzffi();
        zzfdy.zza(this.zzc, zzfdx2);
        zzfdx2 = new zzffj();
        zzfdy.zza(this.zze, zzfdx2);
    }
}

