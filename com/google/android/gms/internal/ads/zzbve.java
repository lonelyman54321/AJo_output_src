/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbvg;

public final class zzbve
extends zzbad
implements zzbvg {
    public zzbve(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final boolean zzH() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(11, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final void zzh(int n3, int n4, Intent intent) {
        Parcel parcel = this.zza();
        parcel.writeInt(n3);
        parcel.writeInt(n4);
        zzbaf.zzd(parcel, (Parcelable)intent);
        this.zzdc(12, parcel);
    }

    public final void zzi() {
        Parcel parcel = this.zza();
        this.zzdc(10, parcel);
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(13, parcel);
    }

    public final void zzl(Bundle bundle) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, (Parcelable)bundle);
        this.zzdc(1, parcel);
    }

    public final void zzm() {
        Parcel parcel = this.zza();
        this.zzdc(8, parcel);
    }

    public final void zzo() {
        Parcel parcel = this.zza();
        this.zzdc(5, parcel);
    }

    public final void zzp(int n3, String[] stringArray, int[] nArray) {
        Parcel parcel = this.zza();
        parcel.writeInt(n3);
        parcel.writeStringArray(stringArray);
        parcel.writeIntArray(nArray);
        this.zzdc(15, parcel);
    }

    public final void zzq() {
        Parcel parcel = this.zza();
        this.zzdc(2, parcel);
    }

    public final void zzr() {
        Parcel parcel = this.zza();
        this.zzdc(4, parcel);
    }

    public final void zzs(Bundle bundle) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, (Parcelable)bundle);
        parcel = this.zzdb(6, parcel);
        int n3 = parcel.readInt();
        if (n3 != 0) {
            bundle.readFromParcel(parcel);
        }
        parcel.recycle();
    }

    public final void zzt() {
        Parcel parcel = this.zza();
        this.zzdc(3, parcel);
    }

    public final void zzu() {
        Parcel parcel = this.zza();
        this.zzdc(7, parcel);
    }

    public final void zzv() {
        Parcel parcel = this.zza();
        this.zzdc(14, parcel);
    }

    public final void zzx() {
        Parcel parcel = this.zza();
        this.zzdc(9, parcel);
    }
}

