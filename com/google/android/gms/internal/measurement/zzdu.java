/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.android.gms.internal.measurement.zzdr;

public abstract class zzdu
extends zzbx
implements zzdr {
    public zzdu() {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 2;
        if (n3 == n7) {
            this.a_();
            return true;
        }
        return false;
    }
}

