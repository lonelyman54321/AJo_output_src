/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import java.util.List;

public final class zzdl
extends zzbad
implements zzdn {
    public zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public final Bundle zze() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(5, parcel);
        parcel = Bundle.CREATOR;
        parcel = (Bundle)zzbaf.zza(parcel2, (Parcelable.Creator)parcel);
        parcel2.recycle();
        return parcel;
    }

    public final zzu zzf() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(4, (Parcel)object);
        object = zzu.CREATOR;
        object = (zzu)zzbaf.zza(parcel, (Parcelable.Creator)object);
        parcel.recycle();
        return object;
    }

    public final String zzg() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(1, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzh() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(6, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzi() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(2, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final List zzj() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(3, (Parcel)object);
        object = zzu.CREATOR;
        object = parcel.createTypedArrayList((Parcelable.Creator)object);
        parcel.recycle();
        return object;
    }
}

