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
import com.google.android.gms.internal.measurement.zzdw;

public final class zzdy
extends zzbu
implements zzdw {
    public zzdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final int zza() {
        Parcel parcel = this.b_();
        parcel = this.zza(2, parcel);
        int n3 = parcel.readInt();
        parcel.recycle();
        return n3;
    }

    public final void zza(String string2, String string3, Bundle bundle, long l2) {
        Parcel parcel = this.b_();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbw.zza(parcel, (Parcelable)bundle);
        parcel.writeLong(l2);
        this.zzb(1, parcel);
    }
}

