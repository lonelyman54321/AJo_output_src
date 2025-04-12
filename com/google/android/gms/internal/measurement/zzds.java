/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzdq;

public final class zzds
extends zzbu
implements zzdq {
    public zzds(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void zza(Bundle bundle) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, (Parcelable)bundle);
        this.zzb(1, parcel);
    }
}

