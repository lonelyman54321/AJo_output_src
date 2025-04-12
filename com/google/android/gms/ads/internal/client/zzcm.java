/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbnn;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzbrf;
import java.util.List;

public final class zzcm
extends zzbad
implements zzco {
    public zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final float zze() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(7, parcel);
        float f5 = parcel2.readFloat();
        parcel2.recycle();
        return f5;
    }

    public final String zzf() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(9, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final List zzg() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(13, (Parcel)object);
        object = zzbnn.CREATOR;
        object = parcel.createTypedArrayList((Parcelable.Creator)object);
        parcel.recycle();
        return object;
    }

    public final void zzh(String string2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        this.zzdc(10, parcel);
    }

    public final void zzi() {
        Parcel parcel = this.zza();
        this.zzdc(15, parcel);
    }

    public final void zzj(boolean bl2) {
        Parcel parcel = this.zza();
        parcel.writeInt((int)(bl2 ? 1 : 0));
        this.zzdc(17, parcel);
    }

    public final void zzk() {
        Parcel parcel = this.zza();
        this.zzdc(1, parcel);
    }

    public final void zzl(String string2, IObjectWrapper iObjectWrapper) {
        string2 = this.zza();
        string2.writeString(null);
        zzbaf.zzf((Parcel)string2, iObjectWrapper);
        this.zzdc(6, (Parcel)string2);
    }

    public final void zzm(zzda zzda2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzda2);
        this.zzdc(16, parcel);
    }

    public final void zzn(IObjectWrapper iObjectWrapper, String string2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        parcel.writeString(string2);
        this.zzdc(5, parcel);
    }

    public final void zzo(zzbrf zzbrf2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbrf2);
        this.zzdc(11, parcel);
    }

    public final void zzp(boolean bl2) {
        Parcel parcel = this.zza();
        parcel.writeInt((int)(bl2 ? 1 : 0));
        this.zzdc(4, parcel);
    }

    public final void zzq(float f5) {
        Parcel parcel = this.zza();
        parcel.writeFloat(f5);
        this.zzdc(2, parcel);
    }

    public final void zzr(String string2) {
        throw null;
    }

    public final void zzs(zzbnu zzbnu2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbnu2);
        this.zzdc(12, parcel);
    }

    public final void zzt(String string2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        this.zzdc(18, parcel);
    }

    public final void zzu(zzff zzff2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzff2);
        this.zzdc(14, parcel);
    }

    public final boolean zzv() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(8, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }
}

