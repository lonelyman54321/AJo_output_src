/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbuz;

public final class zzbux
extends zzbad
implements zzbuz {
    public zzbux(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public final void zze(Intent intent) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, (Parcelable)intent);
        this.zzdc(1, parcel);
    }

    public final void zzf(String[] stringArray, int[] nArray, IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        parcel.writeStringArray(stringArray);
        parcel.writeIntArray(nArray);
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(5, parcel);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(4, parcel);
    }

    public final void zzh() {
        Parcel parcel = this.zza();
        this.zzdc(3, parcel);
    }

    public final void zzi(IObjectWrapper iObjectWrapper, String string2, String string3) {
        throw null;
    }

    public final void zzj(IObjectWrapper iObjectWrapper, zza zza2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzd(parcel, zza2);
        this.zzdc(6, parcel);
    }
}

