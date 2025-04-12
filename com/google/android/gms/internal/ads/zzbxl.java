/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbxn;
import com.google.android.gms.internal.ads.zzbxu;

public final class zzbxl
extends zzbad
implements zzbxn {
    public zzbxl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    public final void zze(zzbb zzbb2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzbb2);
        this.zzdc(2, parcel);
    }

    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, (Parcelable)parcelFileDescriptor);
        this.zzdc(1, parcel);
    }

    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbxu zzbxu2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, (Parcelable)parcelFileDescriptor);
        zzbaf.zzd(parcel, zzbxu2);
        this.zzdc(3, parcel);
    }
}

