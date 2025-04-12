/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbz;

public final class zzca
extends zzbu
implements zzbz {
    public zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle zza(Bundle bundle) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, (Parcelable)bundle);
        bundle = this.zza(1, parcel);
        parcel = Bundle.CREATOR;
        parcel = (Bundle)zzbw.zza((Parcel)bundle, (Parcelable.Creator)parcel);
        bundle.recycle();
        return parcel;
    }
}

