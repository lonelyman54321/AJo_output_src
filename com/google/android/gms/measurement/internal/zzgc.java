/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.measurement.internal.zzga;
import java.util.List;

public final class zzgc
extends zzbu
implements zzga {
    public zzgc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    public final void zza(List list) {
        Parcel parcel = this.b_();
        parcel.writeTypedList(list);
        this.zzc(2, parcel);
    }
}

