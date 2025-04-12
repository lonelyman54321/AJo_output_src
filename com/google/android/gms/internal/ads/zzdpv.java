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
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzdlo;
import com.google.android.gms.internal.ads.zzdlt;
import java.util.List;

public final class zzdpv
extends zzbij {
    private final String zza;
    private final zzdlo zzb;
    private final zzdlt zzc;

    public zzdpv(String string2, zzdlo zzdlo2, zzdlt zzdlt2) {
        this.zza = string2;
        this.zzb = zzdlo2;
        this.zzc = zzdlt2;
    }

    public final double zzb() {
        return this.zzc.zza();
    }

    public final Bundle zzc() {
        return this.zzc.zzd();
    }

    public final zzdq zzd() {
        return this.zzc.zzj();
    }

    public final zzbho zze() {
        return this.zzc.zzl();
    }

    public final zzbhv zzf() {
        return this.zzc.zzn();
    }

    public final IObjectWrapper zzg() {
        return this.zzc.zzv();
    }

    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zzb);
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

    public final String zzm() {
        return this.zzc.zzD();
    }

    public final String zzn() {
        return this.zzc.zzE();
    }

    public final List zzo() {
        return this.zzc.zzG();
    }

    public final void zzp() {
        this.zzb.zzb();
    }

    public final void zzq(Bundle bundle) {
        this.zzb.zzG(bundle);
    }

    public final void zzr(Bundle bundle) {
        this.zzb.zzL(bundle);
    }

    public final boolean zzs(Bundle bundle) {
        return this.zzb.zzY(bundle);
    }
}

