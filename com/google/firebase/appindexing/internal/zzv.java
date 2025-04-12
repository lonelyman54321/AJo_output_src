/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.appindexing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.internal.icing.zza;
import com.google.android.gms.internal.icing.zzc;
import com.google.firebase.appindexing.internal.zzg;
import com.google.firebase.appindexing.internal.zzz;

public final class zzv
extends zza
implements IInterface {
    public zzv(IBinder iBinder) {
        super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingService");
    }

    public final zzg zzd(IStatusCallback iStatusCallback, zzz abstractSafeParcelable) {
        Parcel parcel = this.zza();
        zzc.zzc(parcel, iStatusCallback);
        zzc.zzb(parcel, abstractSafeParcelable);
        iStatusCallback = this.zzb(8, parcel);
        abstractSafeParcelable = zzg.CREATOR;
        abstractSafeParcelable = (zzg)zzc.zza((Parcel)iStatusCallback, (Parcelable.Creator)abstractSafeParcelable);
        iStatusCallback.recycle();
        return abstractSafeParcelable;
    }
}

