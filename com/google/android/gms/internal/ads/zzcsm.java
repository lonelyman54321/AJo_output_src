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
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcsk;
import com.google.android.gms.internal.ads.zzcuc;
import com.google.android.gms.internal.ads.zzcue;
import com.google.android.gms.internal.ads.zzcun;
import com.google.android.gms.internal.ads.zzdax;
import com.google.android.gms.internal.ads.zzdha;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgu;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgge;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public class zzcsm {
    private final zzcun zza;
    private final View zzb;
    private final zzfgu zzc;
    private final zzchd zzd;

    public zzcsm(View view, zzchd zzchd2, zzcun zzcun2, zzfgu zzfgu2) {
        this.zzb = view;
        this.zzd = zzchd2;
        this.zza = zzcun2;
        this.zzc = zzfgu2;
    }

    public static final zzdha zzf(Context object, VersionInfoParcel versionInfoParcel, zzfgt zzfgt2, zzfho zzfho2) {
        zzcsk zzcsk2 = new zzcsk((Context)object, versionInfoParcel, zzfgt2, zzfho2);
        object = zzcci.zzf;
        zzdha zzdha2 = new zzdha(zzcsk2, (Executor)object);
        return zzdha2;
    }

    public static final Set zzg(zzcue zzcue2) {
        zzgge zzgge2 = zzcci.zzf;
        zzdha zzdha2 = new zzdha(zzcue2, zzgge2);
        return Collections.singleton(zzdha2);
    }

    public static final zzdha zzh(zzcuc zzcuc2) {
        zzgge zzgge2 = zzcci.zze;
        zzdha zzdha2 = new zzdha(zzcuc2, zzgge2);
        return zzdha2;
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzchd zzb() {
        return this.zzd;
    }

    public final zzcun zzc() {
        return this.zza;
    }

    public zzdax zzd(Set set) {
        zzdax zzdax2 = new zzdax(set);
        return zzdax2;
    }

    public final zzfgu zze() {
        return this.zzc;
    }
}

