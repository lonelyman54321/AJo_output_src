/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzbzo;

public final class zzbyy
extends zzbad
implements zzbza {
    public zzbyy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public final Bundle zzb() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(9, parcel);
        parcel = Bundle.CREATOR;
        parcel = (Bundle)zzbaf.zza(parcel2, (Parcelable.Creator)parcel);
        parcel2.recycle();
        return parcel;
    }

    public final zzdn zzc() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(12, (Parcel)object);
        object = zzdm.zzb(parcel.readStrongBinder());
        parcel.recycle();
        return object;
    }

    public final zzbyx zzd() {
        int n3 = 11;
        Object object = this.zza();
        Parcel parcel = this.zzdb(n3, (Parcel)object);
        if ((object = parcel.readStrongBinder()) == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            boolean bl2 = iInterface instanceof zzbyx;
            if (bl2) {
                object = iInterface;
                object = (zzbyx)iInterface;
            } else {
                iInterface = new zzbyv((IBinder)object);
                object = iInterface;
            }
        }
        parcel.recycle();
        return object;
    }

    public final String zze() {
        throw null;
    }

    public final void zzf(zzl zzl2, zzbzh zzbzh2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzl2);
        zzbaf.zzf(parcel, zzbzh2);
        this.zzdc(1, parcel);
    }

    public final void zzg(zzl zzl2, zzbzh zzbzh2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzl2);
        zzbaf.zzf(parcel, zzbzh2);
        this.zzdc(14, parcel);
    }

    public final void zzh(boolean bl2) {
        Parcel parcel = this.zza();
        parcel.writeInt((int)(bl2 ? 1 : 0));
        this.zzdc(15, parcel);
    }

    public final void zzi(zzdd zzdd2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzdd2);
        this.zzdc(8, parcel);
    }

    public final void zzj(zzdg zzdg2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzdg2);
        this.zzdc(13, parcel);
    }

    public final void zzk(zzbzd zzbzd2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbzd2);
        this.zzdc(2, parcel);
    }

    public final void zzl(zzbzo zzbzo2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzbzo2);
        this.zzdc(7, parcel);
    }

    public final void zzm(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(5, parcel);
    }

    public final void zzn(IObjectWrapper iObjectWrapper, boolean bl2) {
        throw null;
    }

    public final boolean zzo() {
        throw null;
    }

    public final void zzp(zzbzi zzbzi2) {
        throw null;
    }
}

