/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzdlo;
import com.google.android.gms.internal.ads.zzdlt;
import java.util.List;

public final class zzdpx
extends zzbil {
    private final String zza;
    private final zzdlo zzb;
    private final zzdlt zzc;

    public zzdpx(String string2, zzdlo zzdlo2, zzdlt zzdlt2) {
        this.zza = string2;
        this.zzb = zzdlo2;
        this.zzc = zzdlt2;
    }

    public final Bundle zzb() {
        return this.zzc.zzd();
    }

    public final zzdq zzc() {
        return this.zzc.zzj();
    }

    public final zzbho zzd() {
        return this.zzc.zzl();
    }

    public final zzbhv zze() {
        return this.zzc.zzo();
    }

    public final IObjectWrapper zzf() {
        return this.zzc.zzv();
    }

    public final IObjectWrapper zzg() {
        return ObjectWrapper.wrap(this.zzb);
    }

    public final String zzh() {
        return this.zzc.zzx();
    }

    public final String zzi() {
        return this.zzc.zzy();
    }

    public final String zzj() {
        return this.zzc.zzz();
    }

    public final String zzk() {
        return this.zzc.zzB();
    }

    public final String zzl() {
        return this.zza;
    }

    public final List zzm() {
        return this.zzc.zzG();
    }

    public final void zzn() {
        this.zzb.zzb();
    }

    public final void zzo(Bundle bundle) {
        this.zzb.zzG(bundle);
    }

    public final void zzp(Bundle bundle) {
        this.zzb.zzL(bundle);
    }

    public final boolean zzq(Bundle bundle) {
        return this.zzb.zzY(bundle);
    }
}

