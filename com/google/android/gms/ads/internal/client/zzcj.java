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
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbre;
import com.google.android.gms.internal.ads.zzbrf;

public final class zzcj
extends zzbad
implements zzcl {
    public zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public final zzbrf getAdapterCreator() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(2, (Parcel)object);
        object = zzbre.zzf(parcel.readStrongBinder());
        parcel.recycle();
        return object;
    }

    public final zzen getLiteSdkVersion() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(1, (Parcel)object);
        object = zzen.CREATOR;
        object = (zzen)zzbaf.zza(parcel, (Parcelable.Creator)object);
        parcel.recycle();
        return object;
    }
}

