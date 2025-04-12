/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.android.gms.measurement.internal.zzgf;
import com.google.android.gms.measurement.internal.zzor;

public abstract class zzge
extends zzbx
implements zzgf {
    public zzge() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 2;
        if (n3 == n7) {
            Object object = zzor.CREATOR;
            object = (zzor)zzbw.zza(parcel, object);
            zzbw.zzb(parcel);
            this.zza((zzor)object);
            return true;
        }
        return false;
    }
}

