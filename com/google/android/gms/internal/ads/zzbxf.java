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
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzbwz;
import com.google.android.gms.internal.ads.zzbxh;
import com.google.android.gms.internal.ads.zzbxk;

public final class zzbxf
extends zzbad
implements zzbxh {
    public zzbxf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    public final void zze(zzbwz zzbwz2, zzbxk zzbxk2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzbwz2);
        zzbaf.zzf(parcel, zzbxk2);
        this.zzdc(3, parcel);
    }

    public final void zzf(zzbwv zzbwv2, zzbxk zzbxk2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzbwv2);
        zzbaf.zzf(parcel, zzbxk2);
        this.zzdc(1, parcel);
    }
}

