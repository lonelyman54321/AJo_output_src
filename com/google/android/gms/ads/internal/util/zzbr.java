/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;

public final class zzbr
extends zzbad
implements zzbt {
    public zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    public final void zze(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(2, parcel);
    }

    public final boolean zzf(IObjectWrapper iObjectWrapper, String string2, String string3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        parcel.writeString(string2);
        parcel.writeString(string3);
        iObjectWrapper = this.zzdb(1, parcel);
        boolean bl2 = zzbaf.zzg((Parcel)iObjectWrapper);
        iObjectWrapper.recycle();
        return bl2;
    }

    public final boolean zzg(IObjectWrapper iObjectWrapper, zza zza2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzd(parcel, zza2);
        iObjectWrapper = this.zzdb(3, parcel);
        boolean bl2 = zzbaf.zzg((Parcel)iObjectWrapper);
        iObjectWrapper.recycle();
        return bl2;
    }
}

