/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzczl;
import com.google.android.gms.internal.ads.zzdab;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzdbk;
import com.google.android.gms.internal.ads.zzdbw;
import com.google.android.gms.internal.ads.zzdch;
import com.google.android.gms.internal.ads.zzdci;
import com.google.android.gms.internal.ads.zzdcj;
import com.google.android.gms.internal.ads.zzdck;
import com.google.android.gms.internal.ads.zzdcl;
import com.google.android.gms.internal.ads.zzdcm;
import com.google.android.gms.internal.ads.zzdcn;
import com.google.android.gms.internal.ads.zzdco;
import com.google.android.gms.internal.ads.zzdcp;
import com.google.android.gms.internal.ads.zzdcq;
import com.google.android.gms.internal.ads.zzdcr;
import com.google.android.gms.internal.ads.zzdcs;
import com.google.android.gms.internal.ads.zzdct;
import com.google.android.gms.internal.ads.zzdcu;
import com.google.android.gms.internal.ads.zzdcv;
import com.google.android.gms.internal.ads.zzdcw;
import com.google.android.gms.internal.ads.zzdcx;
import com.google.android.gms.internal.ads.zzdcy;
import com.google.android.gms.internal.ads.zzdcz;
import com.google.android.gms.internal.ads.zzdda;
import com.google.android.gms.internal.ads.zzddb;
import com.google.android.gms.internal.ads.zzddc;
import com.google.android.gms.internal.ads.zzddd;
import com.google.android.gms.internal.ads.zzdde;
import com.google.android.gms.internal.ads.zzddf;
import com.google.android.gms.internal.ads.zzddg;
import com.google.android.gms.internal.ads.zzddh;
import com.google.android.gms.internal.ads.zzddi;
import com.google.android.gms.internal.ads.zzddj;
import com.google.android.gms.internal.ads.zzddk;
import com.google.android.gms.internal.ads.zzddl;
import com.google.android.gms.internal.ads.zzddm;
import com.google.android.gms.internal.ads.zzddn;
import com.google.android.gms.internal.ads.zzddo;
import com.google.android.gms.internal.ads.zzddq;
import com.google.android.gms.internal.ads.zzddr;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzepg;
import com.google.android.gms.internal.ads.zzfcr;
import com.google.android.gms.internal.ads.zzffw;

public final class zzdds
implements AppEventListener,
OnAdMetadataChangedListener,
zzczl,
zza,
zzdbw,
zzdaf,
zzdbk,
zzp,
zzdab,
zzdhi {
    private final zzddq zza;
    private zzepc zzb;
    private zzepg zzc;
    private zzfcr zzd;
    private zzffw zze;

    public zzdds() {
        zzddq zzddq2;
        this.zza = zzddq2 = new zzddq(this, null);
    }

    public static /* bridge */ /* synthetic */ void zzj(zzdds zzdds2, zzepc zzepc2) {
        zzdds2.zzb = zzepc2;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzdds zzdds2, zzfcr zzfcr2) {
        zzdds2.zzd = zzfcr2;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzdds zzdds2, zzepg zzepg2) {
        zzdds2.zzc = zzepg2;
    }

    public static /* bridge */ /* synthetic */ void zzm(zzdds zzdds2, zzffw zzffw2) {
        zzdds2.zze = zzffw2;
    }

    private static void zzn(Object object, zzddr zzddr2) {
        if (object != null) {
            zzddr2.zza(object);
        }
    }

    public final void onAdClicked() {
        zzdhi zzdhi2 = this.zzb;
        zzddr zzddr2 = new zzdci();
        zzdds.zzn(zzdhi2, zzddr2);
        zzdhi2 = this.zzc;
        zzddr2 = new zzdcj();
        zzdds.zzn(zzdhi2, zzddr2);
    }

    public final void onAdMetadataChanged() {
        zzffw zzffw2 = this.zze;
        zzdco zzdco2 = new zzdco();
        zzdds.zzn(zzffw2, zzdco2);
    }

    public final void onAppEvent(String string2, String string3) {
        zzepc zzepc2 = this.zzb;
        zzdcu zzdcu2 = new zzdcu(string2, string3);
        zzdds.zzn(zzepc2, zzdcu2);
    }

    public final void zza() {
        zzczl zzczl2 = this.zzb;
        zzddr zzddr2 = new zzddn();
        zzdds.zzn(zzczl2, zzddr2);
        zzczl2 = this.zze;
        zzddr2 = new zzddo();
        zzdds.zzn(zzczl2, zzddr2);
    }

    public final void zzb() {
        zzczl zzczl2 = this.zzb;
        zzddr zzddr2 = new zzddg();
        zzdds.zzn(zzczl2, zzddr2);
        zzczl2 = this.zze;
        zzddr2 = new zzddh();
        zzdds.zzn(zzczl2, zzddr2);
    }

    public final void zzc() {
        zzczl zzczl2 = this.zzb;
        zzddr zzddr2 = new zzdcp();
        zzdds.zzn(zzczl2, zzddr2);
        zzczl2 = this.zze;
        zzddr2 = new zzdcq();
        zzdds.zzn(zzczl2, zzddr2);
    }

    public final void zzdG() {
        zzdhi zzdhi2 = this.zzb;
        zzddr zzddr2 = new zzddd();
        zzdds.zzn(zzdhi2, zzddr2);
        zzdhi2 = this.zzc;
        zzddr2 = new zzddi();
        zzdds.zzn(zzdhi2, zzddr2);
        zzdhi2 = this.zze;
        zzddr2 = new zzddj();
        zzdds.zzn(zzdhi2, zzddr2);
        zzdhi2 = this.zzd;
        zzddr2 = new zzddk();
        zzdds.zzn(zzdhi2, zzddr2);
    }

    public final void zzdH() {
        zzfcr zzfcr2 = this.zzd;
        zzddb zzddb2 = new zzddb();
        zzdds.zzn(zzfcr2, zzddb2);
    }

    public final void zzdf() {
        zzepc zzepc2 = this.zzb;
        zzdcv zzdcv2 = new zzdcv();
        zzdds.zzn(zzepc2, zzdcv2);
    }

    public final void zzdk() {
        zzfcr zzfcr2 = this.zzd;
        zzdcn zzdcn2 = new zzdcn();
        zzdds.zzn(zzfcr2, zzdcn2);
    }

    public final void zzdq() {
        zzfcr zzfcr2 = this.zzd;
        zzdda zzdda2 = new zzdda();
        zzdds.zzn(zzfcr2, zzdda2);
    }

    public final void zzdr() {
        zzfcr zzfcr2 = this.zzd;
        zzdcw zzdcw2 = new zzdcw();
        zzdds.zzn(zzfcr2, zzdcw2);
    }

    public final void zzds(zzbyh zzbyh2, String string2, String string3) {
        zzczl zzczl2 = this.zzb;
        zzddr zzddr2 = new zzdcr(zzbyh2, string2, string3);
        zzdds.zzn(zzczl2, zzddr2);
        zzczl2 = this.zze;
        zzddr2 = new zzdct(zzbyh2, string2, string3);
        zzdds.zzn(zzczl2, zzddr2);
    }

    public final void zzdt() {
        zzfcr zzfcr2 = this.zzd;
        zzddc zzddc2 = new zzddc();
        zzdds.zzn(zzfcr2, zzddc2);
    }

    public final void zzdu(int n3) {
        zzfcr zzfcr2 = this.zzd;
        zzdde zzdde2 = new zzdde(n3);
        zzdds.zzn(zzfcr2, zzdde2);
    }

    public final void zze() {
        zzczl zzczl2 = this.zzb;
        zzddr zzddr2 = new zzdch();
        zzdds.zzn(zzczl2, zzddr2);
        zzczl2 = this.zze;
        zzddr2 = new zzdcs();
        zzdds.zzn(zzczl2, zzddr2);
    }

    public final void zzf() {
        zzczl zzczl2 = this.zzb;
        zzddr zzddr2 = new zzdck();
        zzdds.zzn(zzczl2, zzddr2);
        zzczl2 = this.zze;
        zzddr2 = new zzdcl();
        zzdds.zzn(zzczl2, zzddr2);
    }

    public final void zzg() {
        zzfcr zzfcr2 = this.zzd;
        zzddf zzddf2 = new zzddf();
        zzdds.zzn(zzfcr2, zzddf2);
    }

    public final void zzh(zzs zzs2) {
        zzdab zzdab2 = this.zzb;
        zzddr zzddr2 = new zzdcx(zzs2);
        zzdds.zzn(zzdab2, zzddr2);
        zzdab2 = this.zze;
        zzddr2 = new zzdcy(zzs2);
        zzdds.zzn(zzdab2, zzddr2);
        zzdab2 = this.zzd;
        zzddr2 = new zzdcz(zzs2);
        zzdds.zzn(zzdab2, zzddr2);
    }

    public final zzddq zzi() {
        return this.zza;
    }

    public final void zzq(zze zze2) {
        zzczl zzczl2 = this.zze;
        zzddr zzddr2 = new zzddl(zze2);
        zzdds.zzn(zzczl2, zzddr2);
        zzczl2 = this.zzb;
        zzddr2 = new zzddm(zze2);
        zzdds.zzn(zzczl2, zzddr2);
    }

    public final void zzr() {
        zzepc zzepc2 = this.zzb;
        zzdcm zzdcm2 = new zzdcm();
        zzdds.zzn(zzepc2, zzdcm2);
    }
}

