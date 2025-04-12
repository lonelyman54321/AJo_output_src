/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzdr;

public final class zzdt
extends zzbu
implements zzdr {
    public zzdt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }

    public final void a_() {
        Parcel parcel = this.b_();
        this.zzc(2, parcel);
    }
}

