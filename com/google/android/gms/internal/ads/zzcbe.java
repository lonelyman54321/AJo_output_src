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
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzbwe;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbk;
import java.util.List;

public final class zzcbe
extends zzbad
implements zzcbg {
    public zzcbe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String string2, IObjectWrapper iObjectWrapper3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, iObjectWrapper2);
        parcel.writeString(string2);
        zzbaf.zzf(parcel, iObjectWrapper3);
        return ak3_1.a(this.zzdb(11, parcel));
    }

    public final void zzf(IObjectWrapper iObjectWrapper, zzcbk zzcbk2, zzcbd zzcbd2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzd(parcel, zzcbk2);
        zzbaf.zzf(parcel, zzcbd2);
        this.zzdc(1, parcel);
    }

    public final void zzg(zzbwe zzbwe2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzbwe2);
        this.zzdc(7, parcel);
    }

    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvv2) {
        Parcel parcel = this.zza();
        parcel.writeTypedList(list);
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, zzbvv2);
        this.zzdc(10, parcel);
    }

    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvv2) {
        Parcel parcel = this.zza();
        parcel.writeTypedList(list);
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, zzbvv2);
        this.zzdc(9, parcel);
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(8, parcel);
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(2, parcel);
    }

    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvv2) {
        Parcel parcel = this.zza();
        parcel.writeTypedList(list);
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, zzbvv2);
        this.zzdc(6, parcel);
    }

    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvv2) {
        Parcel parcel = this.zza();
        parcel.writeTypedList(list);
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, zzbvv2);
        this.zzdc(5, parcel);
    }
}

