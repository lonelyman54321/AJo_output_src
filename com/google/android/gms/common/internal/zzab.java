/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzab
extends zza
implements IGmsCallbacks {
    public zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final void onPostInitComplete(int n3, IBinder iBinder, Bundle bundle) {
        Parcel parcel = this.zza();
        parcel.writeInt(n3);
        parcel.writeStrongBinder(iBinder);
        zzc.zzc(parcel, (Parcelable)bundle);
        this.zzC(1, parcel);
    }

    public final void zzb(int n3, Bundle bundle) {
        throw null;
    }

    public final void zzc(int n3, IBinder iBinder, zzk zzk2) {
        throw null;
    }
}

