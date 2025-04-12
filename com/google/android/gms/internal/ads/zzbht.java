/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhv;

public final class zzbht
extends zzbad
implements zzbhv {
    public zzbht(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final double zzb() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(3, parcel);
        double d2 = parcel2.readDouble();
        parcel2.recycle();
        return d2;
    }

    public final int zzc() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(5, parcel);
        int n3 = parcel2.readInt();
        parcel2.recycle();
        return n3;
    }

    public final int zzd() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(4, parcel);
        int n3 = parcel2.readInt();
        parcel2.recycle();
        return n3;
    }

    public final Uri zze() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(2, parcel);
        parcel = Uri.CREATOR;
        parcel = (Uri)zzbaf.zza(parcel2, (Parcelable.Creator)parcel);
        parcel2.recycle();
        return parcel;
    }

    public final IObjectWrapper zzf() {
        Parcel parcel = this.zza();
        return ak3_1.a(this.zzdb(1, parcel));
    }
}

