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
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhu;
import com.google.android.gms.internal.ads.zzbhv;
import java.util.List;

public final class zzbrq
extends zzbad
implements IInterface {
    public zzbrq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double zze() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(7, parcel);
        double d2 = parcel2.readDouble();
        parcel2.recycle();
        return d2;
    }

    public final Bundle zzf() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(15, parcel);
        parcel = Bundle.CREATOR;
        parcel = (Bundle)zzbaf.zza(parcel2, (Parcelable.Creator)parcel);
        parcel2.recycle();
        return parcel;
    }

    public final zzdq zzg() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(17, (Parcel)object);
        object = zzdp.zzb(parcel.readStrongBinder());
        parcel.recycle();
        return object;
    }

    public final zzbho zzh() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(19, (Parcel)object);
        object = zzbhn.zzj(parcel.readStrongBinder());
        parcel.recycle();
        return object;
    }

    public final zzbhv zzi() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(5, (Parcel)object);
        object = zzbhu.zzg(parcel.readStrongBinder());
        parcel.recycle();
        return object;
    }

    public final IObjectWrapper zzj() {
        Parcel parcel = this.zza();
        return ak3_1.a(this.zzdb(18, parcel));
    }

    public final IObjectWrapper zzk() {
        Parcel parcel = this.zza();
        return ak3_1.a(this.zzdb(20, parcel));
    }

    public final IObjectWrapper zzl() {
        Parcel parcel = this.zza();
        return ak3_1.a(this.zzdb(21, parcel));
    }

    public final String zzm() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(4, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzn() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(6, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzo() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(2, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzp() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(9, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzq() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(8, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final List zzr() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(3, (Parcel)object);
        object = zzbaf.zzb(parcel);
        parcel.recycle();
        return object;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(11, parcel);
    }

    public final void zzt() {
        Parcel parcel = this.zza();
        this.zzdc(10, parcel);
    }

    public final void zzu(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(12, parcel);
    }

    public final void zzv(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, iObjectWrapper2);
        zzbaf.zzf(parcel, iObjectWrapper3);
        this.zzdc(22, parcel);
    }

    public final void zzw(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(16, parcel);
    }

    public final boolean zzx() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(14, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final boolean zzy() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(13, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }
}

