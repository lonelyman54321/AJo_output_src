/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.auth-api-phone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.internal.auth-api-phone.zza;
import com.google.android.gms.internal.auth-api-phone.zzc;
import com.google.android.gms.internal.auth-api-phone.zze;
import com.google.android.gms.internal.auth-api-phone.zzg;
import com.google.android.gms.internal.auth-api-phone.zzj;

public final class zzh
extends zza
implements IInterface {
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zzc(zze zze2) {
        Parcel parcel = this.zza();
        zzc.zzc(parcel, zze2);
        this.zzb(4, parcel);
    }

    public final void zzd(String string2, zzg zzg2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        zzc.zzc(parcel, zzg2);
        this.zzb(5, parcel);
    }

    public final void zze(IStatusCallback iStatusCallback) {
        Parcel parcel = this.zza();
        zzc.zzc(parcel, iStatusCallback);
        this.zzb(3, parcel);
    }

    public final void zzf(IStatusCallback iStatusCallback) {
        Parcel parcel = this.zza();
        zzc.zzc(parcel, iStatusCallback);
        this.zzb(6, parcel);
    }

    public final void zzg(zzj zzj2) {
        Parcel parcel = this.zza();
        zzc.zzc(parcel, zzj2);
        this.zzb(1, parcel);
    }

    public final void zzh(String string2, zzj zzj2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        zzc.zzc(parcel, zzj2);
        this.zzb(2, parcel);
    }
}

