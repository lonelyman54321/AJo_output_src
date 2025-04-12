/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcyi;
import com.google.android.gms.internal.ads.zzdha;
import com.google.android.gms.internal.ads.zzdij;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzdju;
import com.google.android.gms.internal.ads.zzflz;
import com.google.android.gms.internal.ads.zzgge;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public class zzdik {
    private final zzdjp zza;
    private final zzchd zzb;

    public zzdik(zzdjp zzdjp2, zzchd zzchd2) {
        this.zza = zzdjp2;
        this.zzb = zzchd2;
    }

    public static final zzdha zzh(zzflz zzflz2) {
        zzgge zzgge2 = zzcci.zzf;
        zzdha zzdha2 = new zzdha(zzflz2, zzgge2);
        return zzdha2;
    }

    public static final zzdha zzi(zzdju zzdju2) {
        zzgge zzgge2 = zzcci.zzf;
        zzdha zzdha2 = new zzdha(zzdju2, zzgge2);
        return zzdha2;
    }

    public final View zza() {
        zzchd zzchd2 = this.zzb;
        if (zzchd2 == null) {
            return null;
        }
        return zzchd2.zzG();
    }

    public final View zzb() {
        zzchd zzchd2 = this.zzb;
        if (zzchd2 != null) {
            return zzchd2.zzG();
        }
        return null;
    }

    public final zzchd zzc() {
        return this.zzb;
    }

    public final zzdha zzd(Executor executor) {
        zzchd zzchd2 = this.zzb;
        zzdij zzdij2 = new zzdij(zzchd2);
        zzdha zzdha2 = new zzdha(zzdij2, executor);
        return zzdha2;
    }

    public final zzdjp zze() {
        return this.zza;
    }

    public Set zzf(zzcyi zzcyi2) {
        zzgge zzgge2 = zzcci.zzf;
        zzdha zzdha2 = new zzdha(zzcyi2, zzgge2);
        return Collections.singleton(zzdha2);
    }

    public Set zzg(zzcyi zzcyi2) {
        zzgge zzgge2 = zzcci.zzf;
        zzdha zzdha2 = new zzdha(zzcyi2, zzgge2);
        return Collections.singleton(zzdha2);
    }
}

