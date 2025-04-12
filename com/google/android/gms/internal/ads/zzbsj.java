/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbrk;
import com.google.android.gms.internal.ads.zzbys;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbyx;

public final class zzbsj
extends zzbrk {
    private final Adapter zza;
    private final zzbys zzb;

    public zzbsj(Adapter adapter, zzbys zzbys2) {
        this.zza = adapter;
        this.zzb = zzbys2;
    }

    public final void zze() {
        zzbys zzbys2 = this.zzb;
        if (zzbys2 != null) {
            IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(this.zza);
            zzbys2.zze(iObjectWrapper);
        }
    }

    public final void zzf() {
        zzbys zzbys2 = this.zzb;
        if (zzbys2 != null) {
            IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(this.zza);
            zzbys2.zzf(iObjectWrapper);
        }
    }

    public final void zzg(int n3) {
        zzbys zzbys2 = this.zzb;
        if (zzbys2 != null) {
            IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(this.zza);
            zzbys2.zzg(iObjectWrapper, n3);
        }
    }

    public final void zzh(zze zze2) {
    }

    public final void zzi(int n3, String string2) {
    }

    public final void zzj(int n3) {
    }

    public final void zzk(zze zze2) {
    }

    public final void zzl(String string2) {
    }

    public final void zzm() {
    }

    public final void zzn() {
    }

    public final void zzo() {
        zzbys zzbys2 = this.zzb;
        if (zzbys2 != null) {
            IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(this.zza);
            zzbys2.zzi(iObjectWrapper);
        }
    }

    public final void zzp() {
        zzbys zzbys2 = this.zzb;
        if (zzbys2 != null) {
            IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(this.zza);
            zzbys2.zzj(iObjectWrapper);
        }
    }

    public final void zzq(String string2, String string3) {
    }

    public final void zzr(zzbip zzbip2, String string2) {
    }

    public final void zzs(zzbyt zzbyt2) {
    }

    public final void zzt(zzbyx zzbyx2) {
        zzbys zzbys2 = this.zzb;
        if (zzbys2 != null) {
            IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(this.zza);
            String string2 = zzbyx2.zzf();
            int n3 = zzbyx2.zze();
            zzbyt zzbyt2 = new zzbyt(string2, n3);
            zzbys2.zzm(iObjectWrapper, zzbyt2);
        }
    }

    public final void zzu() {
        zzbys zzbys2 = this.zzb;
        if (zzbys2 != null) {
            IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(this.zza);
            zzbys2.zzn(iObjectWrapper);
        }
    }

    public final void zzv() {
    }

    public final void zzw() {
    }

    public final void zzx() {
    }

    public final void zzy() {
        zzbys zzbys2 = this.zzb;
        if (zzbys2 != null) {
            IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(this.zza);
            zzbys2.zzo(iObjectWrapper);
        }
    }
}

