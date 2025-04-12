/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzh;
import com.google.android.gms.common.internal.zzi;

public final class BinderWrapper
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final IBinder zza;

    static {
        zzh zzh2 = new zzh();
        CREATOR = zzh2;
    }

    public BinderWrapper(IBinder iBinder) {
        this.zza = iBinder;
    }

    public /* synthetic */ BinderWrapper(Parcel parcel, zzi zzi2) {
        parcel = parcel.readStrongBinder();
        this.zza = parcel;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        IBinder iBinder = this.zza;
        parcel.writeStrongBinder(iBinder);
    }
}

