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
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.measurement.internal.zzgf;
import com.google.android.gms.measurement.internal.zzor;

public final class zzgh
extends zzbu
implements zzgf {
    public zzgh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    public final void zza(zzor zzor2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzor2);
        this.zzc(2, parcel);
    }
}

