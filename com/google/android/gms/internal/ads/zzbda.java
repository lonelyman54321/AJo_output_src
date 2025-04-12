/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbcy;

public final class zzbda
extends zzbad
implements IInterface {
    public zzbda(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbcy zzbcy2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzbcy2);
        zzbcy2 = this.zzdb(3, parcel);
        long l2 = zzbcy2.readLong();
        zzbcy2.recycle();
        return l2;
    }

    public final zzbcv zzf(zzbcy zzbcy2) {
        Object object = this.zza();
        zzbaf.zzd(object, zzbcy2);
        zzbcy2 = this.zzdb(1, (Parcel)object);
        object = zzbcv.CREATOR;
        object = (zzbcv)zzbaf.zza((Parcel)zzbcy2, (Parcelable.Creator)object);
        zzbcy2.recycle();
        return object;
    }

    public final zzbcv zzg(zzbcy zzbcy2) {
        Object object = this.zza();
        zzbaf.zzd(object, zzbcy2);
        zzbcy2 = this.zzdb(2, (Parcel)object);
        object = zzbcv.CREATOR;
        object = (zzbcv)zzbaf.zza((Parcel)zzbcy2, (Parcelable.Creator)object);
        zzbcy2.recycle();
        return object;
    }
}

