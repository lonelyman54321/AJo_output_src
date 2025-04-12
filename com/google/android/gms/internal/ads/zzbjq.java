/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhm;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhq;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjs;
import java.util.List;

public final class zzbjq
extends zzbad
implements zzbjs {
    public zzbjq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    public final void zzA() {
        Parcel parcel = this.zza();
        this.zzdc(28, parcel);
    }

    public final void zzB(Bundle bundle) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, (Parcelable)bundle);
        this.zzdc(17, parcel);
    }

    public final void zzC() {
        Parcel parcel = this.zza();
        this.zzdc(27, parcel);
    }

    public final void zzD(zzcs zzcs2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzcs2);
        this.zzdc(26, parcel);
    }

    public final void zzE(zzdg zzdg2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzdg2);
        this.zzdc(32, parcel);
    }

    public final void zzF(zzbjp zzbjp2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbjp2);
        this.zzdc(21, parcel);
    }

    public final boolean zzG() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(30, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final boolean zzH() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(24, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final boolean zzI(Bundle bundle) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, (Parcelable)bundle);
        bundle = this.zzdb(16, parcel);
        boolean bl2 = zzbaf.zzg((Parcel)bundle);
        bundle.recycle();
        return bl2;
    }

    public final double zze() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(8, parcel);
        double d2 = parcel2.readDouble();
        parcel2.recycle();
        return d2;
    }

    public final Bundle zzf() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(20, parcel);
        parcel = Bundle.CREATOR;
        parcel = (Bundle)zzbaf.zza(parcel2, (Parcelable.Creator)parcel);
        parcel2.recycle();
        return parcel;
    }

    public final zzdn zzg() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(31, (Parcel)object);
        object = zzdm.zzb(parcel.readStrongBinder());
        parcel.recycle();
        return object;
    }

    public final zzdq zzh() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(11, (Parcel)object);
        object = zzdp.zzb(parcel.readStrongBinder());
        parcel.recycle();
        return object;
    }

    public final zzbho zzi() {
        int n3 = 14;
        Object object = this.zza();
        Parcel parcel = this.zzdb(n3, (Parcel)object);
        if ((object = parcel.readStrongBinder()) == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            boolean bl2 = iInterface instanceof zzbho;
            if (bl2) {
                object = iInterface;
                object = (zzbho)iInterface;
            } else {
                iInterface = new zzbhm((IBinder)object);
                object = iInterface;
            }
        }
        parcel.recycle();
        return object;
    }

    public final zzbhs zzj() {
        int n3 = 29;
        Object object = this.zza();
        Parcel parcel = this.zzdb(n3, (Parcel)object);
        if ((object = parcel.readStrongBinder()) == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            boolean bl2 = iInterface instanceof zzbhs;
            if (bl2) {
                object = iInterface;
                object = (zzbhs)iInterface;
            } else {
                iInterface = new zzbhq((IBinder)object);
                object = iInterface;
            }
        }
        parcel.recycle();
        return object;
    }

    public final zzbhv zzk() {
        int n3 = 5;
        Object object = this.zza();
        Parcel parcel = this.zzdb(n3, (Parcel)object);
        if ((object = parcel.readStrongBinder()) == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            boolean bl2 = iInterface instanceof zzbhv;
            if (bl2) {
                object = iInterface;
                object = (zzbhv)iInterface;
            } else {
                iInterface = new zzbht((IBinder)object);
                object = iInterface;
            }
        }
        parcel.recycle();
        return object;
    }

    public final IObjectWrapper zzl() {
        Parcel parcel = this.zza();
        return ak3_1.a(this.zzdb(19, parcel));
    }

    public final IObjectWrapper zzm() {
        Parcel parcel = this.zza();
        return ak3_1.a(this.zzdb(18, parcel));
    }

    public final String zzn() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(7, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzo() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(4, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzp() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(6, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzq() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(2, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzr() {
        throw null;
    }

    public final String zzs() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(10, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzt() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(9, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final List zzu() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(3, (Parcel)object);
        object = zzbaf.zzb(parcel);
        parcel.recycle();
        return object;
    }

    public final List zzv() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(23, (Parcel)object);
        object = zzbaf.zzb(parcel);
        parcel.recycle();
        return object;
    }

    public final void zzw() {
        Parcel parcel = this.zza();
        this.zzdc(22, parcel);
    }

    public final void zzx() {
        Parcel parcel = this.zza();
        this.zzdc(13, parcel);
    }

    public final void zzy(zzcw zzcw2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzcw2);
        this.zzdc(25, parcel);
    }

    public final void zzz(Bundle bundle) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, (Parcelable)bundle);
        this.zzdc(15, parcel);
    }
}

