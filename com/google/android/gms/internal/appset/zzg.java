/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.appset.zza;
import com.google.android.gms.internal.appset.zzc;
import com.google.android.gms.internal.appset.zzf;

public final class zzg
extends zza
implements IInterface {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void zzc(com.google.android.gms.appset.zza zza2, zzf zzf2) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, zza2);
        zzc.zzc(parcel, zzf2);
        this.zzb(1, parcel);
    }
}

