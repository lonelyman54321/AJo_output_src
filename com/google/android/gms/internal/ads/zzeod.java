/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzbyn;
import com.google.android.gms.internal.ads.zzcsf;
import com.google.android.gms.internal.ads.zzcze;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzfgu;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfhu;
import java.util.Collections;
import java.util.List;

public final class zzeod
extends zzbt {
    private final Context zza;
    private final zzbh zzb;
    private final zzfho zzc;
    private final zzcsf zzd;
    private final ViewGroup zze;
    private final zzdvc zzf;

    public zzeod(Context context, zzbh zzbh2, zzfho zzfho2, zzcsf zzcsf2, zzdvc zzdvc2) {
        this.zza = context;
        this.zzb = zzbh2;
        this.zzc = zzfho2;
        this.zzd = zzcsf2;
        this.zzf = zzdvc2;
        super(context);
        zzbh2.removeAllViews();
        context = zzcsf2.zzc();
        zzu.zzp();
        int n3 = -1;
        super(n3, n3);
        zzbh2.addView((View)context, (ViewGroup.LayoutParams)zzfho2);
        int n4 = this.zzg().zzc;
        zzbh2.setMinimumHeight(n4);
        n4 = this.zzg().zzf;
        zzbh2.setMinimumWidth(n4);
        this.zze = zzbh2;
    }

    public final void zzA() {
        this.zzd.zzg();
    }

    public final void zzB() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzc(null);
    }

    public final void zzC(zzbe zzbe2) {
        zzm.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzD(zzbh zzbh2) {
        zzm.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzE(zzby zzby2) {
        zzm.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzF(zzq zzq2) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcsf zzcsf2 = this.zzd;
        if (zzcsf2 != null) {
            ViewGroup viewGroup = this.zze;
            zzcsf2.zzh(viewGroup, zzq2);
        }
    }

    public final void zzG(zzcb zzcb2) {
        zzepc zzepc2 = this.zzc.zzc;
        if (zzepc2 != null) {
            zzepc2.zzm(zzcb2);
        }
    }

    public final void zzH(zzbcj zzbcj2) {
    }

    public final void zzI(zzw zzw2) {
    }

    public final void zzJ(zzci zzci2) {
    }

    public final void zzK(zzdu zzdu2) {
    }

    public final void zzL(boolean bl2) {
    }

    public final void zzM(zzbvp zzbvp2) {
    }

    public final void zzN(boolean bl2) {
        zzm.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzO(zzbfk zzbfk2) {
        zzm.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzP(zzdg zzdg2) {
        Object object = zzbep.zzlE;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzc.zzc;
            if (object != null) {
                block6: {
                    boolean bl3 = zzdg2.zzf();
                    if (bl3) break block6;
                    object2 = this.zzf;
                    try {
                        ((zzdvc)object2).zze();
                    }
                    catch (RemoteException remoteException) {
                        String string2 = "Error in making CSI ping for reporting paid event callback";
                        zzm.zzf(string2, remoteException);
                    }
                }
                ((zzepc)object).zzl(zzdg2);
            }
            return;
        }
        zzm.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzQ(zzbvs zzbvs2, String string2) {
    }

    public final void zzR(String string2) {
    }

    public final void zzS(zzbyn zzbyn2) {
    }

    public final void zzT(String string2) {
    }

    public final void zzU(zzfk zzfk2) {
        zzm.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    public final void zzX() {
    }

    public final boolean zzY() {
        boolean bl2;
        zzcsf zzcsf2 = this.zzd;
        return zzcsf2 != null && (bl2 = zzcsf2.zzr());
    }

    public final boolean zzZ() {
        return false;
    }

    public final boolean zzaa() {
        return false;
    }

    public final boolean zzab(zzl zzl2) {
        zzm.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    public final void zzac(zzcf zzcf2) {
        zzm.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final Bundle zzd() {
        zzm.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        Bundle bundle = new Bundle();
        return bundle;
    }

    public final zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        List<zzfgu> list = Collections.singletonList(this.zzd.zze());
        return zzfhu.zza(this.zza, list);
    }

    public final zzbh zzi() {
        return this.zzb;
    }

    public final zzcb zzj() {
        return this.zzc.zzn;
    }

    public final zzdn zzk() {
        return this.zzd.zzl();
    }

    public final zzdq zzl() {
        return this.zzd.zzd();
    }

    public final IObjectWrapper zzn() {
        return ObjectWrapper.wrap(this.zze);
    }

    public final String zzr() {
        return this.zzc.zzf;
    }

    public final String zzs() {
        zzcze zzcze2 = this.zzd.zzl();
        if (zzcze2 != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    public final String zzt() {
        zzcze zzcze2 = this.zzd.zzl();
        if (zzcze2 != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    public final void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    public final void zzy(zzl zzl2, zzbk zzbk2) {
    }

    public final void zzz() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzb(null);
    }
}

