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
import com.google.android.gms.internal.ads.zzbif;

public final class zzbid
extends zzbad
implements zzbif {
    public zzbid(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public final void zzb(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(3, parcel);
    }

    public final void zzc(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(1, parcel);
    }

    public final void zzd() {
        Parcel parcel = this.zza();
        this.zzdc(2, parcel);
    }
}

