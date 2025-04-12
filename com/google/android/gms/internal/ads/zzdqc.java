/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzdlo;
import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzdvc;
import java.util.Collections;
import java.util.List;

public final class zzdqc
extends zzbjr {
    private final String zza;
    private final zzdlo zzb;
    private final zzdlt zzc;
    private final zzdvc zzd;

    public zzdqc(String string2, zzdlo zzdlo2, zzdlt zzdlt2, zzdvc zzdvc2) {
        this.zza = string2;
        this.zzb = zzdlo2;
        this.zzc = zzdlt2;
        this.zzd = zzdvc2;
    }

    public final void zzA() {
        this.zzb.zzH();
    }

    public final void zzB(Bundle bundle) {
        this.zzb.zzL(bundle);
    }

    public final void zzC() {
        this.zzb.zzN();
    }

    public final void zzD(zzcs zzcs2) {
        this.zzb.zzO(zzcs2);
    }

    public final void zzE(zzdg zzdg2) {
        block4: {
            boolean bl2 = zzdg2.zzf();
            if (bl2) break block4;
            zzdvc zzdvc2 = this.zzd;
            try {
                zzdvc2.zze();
            }
            catch (RemoteException remoteException) {
                String string2 = "Error in making CSI ping for reporting paid event callback";
                zzm.zzf(string2, remoteException);
            }
        }
        this.zzb.zzP(zzdg2);
    }

    public final void zzF(zzbjp zzbjp2) {
        this.zzb.zzQ(zzbjp2);
    }

    public final boolean zzG() {
        return this.zzb.zzV();
    }

    public final boolean zzH() {
        Object object = this.zzc.zzH();
        boolean bl2 = object.isEmpty();
        return !bl2 && (object = this.zzc.zzk()) != null;
    }

    public final boolean zzI(Bundle bundle) {
        return this.zzb.zzY(bundle);
    }

    public final double zze() {
        return this.zzc.zza();
    }

    public final Bundle zzf() {
        return this.zzc.zzd();
    }

    public final zzdn zzg() {
        Object object = zzbep.zzgW;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return null;
        }
        return this.zzb.zzl();
    }

    public final zzdq zzh() {
        return this.zzc.zzj();
    }

    public final zzbho zzi() {
        return this.zzc.zzl();
    }

    public final zzbhs zzj() {
        return this.zzb.zzc().zza();
    }

    public final zzbhv zzk() {
        return this.zzc.zzn();
    }

    public final IObjectWrapper zzl() {
        return this.zzc.zzv();
    }

    public final IObjectWrapper zzm() {
        return ObjectWrapper.wrap(this.zzb);
    }

    public final String zzn() {
        return this.zzc.zzx();
    }

    public final String zzo() {
        return this.zzc.zzy();
    }

    public final String zzp() {
        return this.zzc.zzz();
    }

    public final String zzq() {
        return this.zzc.zzB();
    }

    public final String zzr() {
        return this.zza;
    }

    public final String zzs() {
        return this.zzc.zzD();
    }

    public final String zzt() {
        return this.zzc.zzE();
    }

    public final List zzu() {
        return this.zzc.zzG();
    }

    public final List zzv() {
        boolean bl2 = this.zzH();
        List list = bl2 ? this.zzc.zzH() : Collections.emptyList();
        return list;
    }

    public final void zzw() {
        this.zzb.zzv();
    }

    public final void zzx() {
        this.zzb.zzb();
    }

    public final void zzy(zzcw zzcw2) {
        this.zzb.zzC(zzcw2);
    }

    public final void zzz(Bundle bundle) {
        this.zzb.zzG(bundle);
    }
}

