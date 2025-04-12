/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbhz;

public final class zzbhx
extends zzbad
implements zzbhz {
    public zzbhx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public final IObjectWrapper zzb(String string2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        return ak3_1.a(this.zzdb(2, parcel));
    }

    public final void zzc() {
        Parcel parcel = this.zza();
        this.zzdc(4, parcel);
    }

    public final void zzd(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(7, parcel);
    }

    public final void zzdv(String string2, IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(1, parcel);
    }

    public final void zzdw(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(6, parcel);
    }

    public final void zzdx(zzbhs zzbhs2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbhs2);
        this.zzdc(8, parcel);
    }

    public final void zzdy(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(9, parcel);
    }

    public final void zzdz(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(3, parcel);
    }

    public final void zze(IObjectWrapper iObjectWrapper, int n3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        parcel.writeInt(n3);
        this.zzdc(5, parcel);
    }
}

