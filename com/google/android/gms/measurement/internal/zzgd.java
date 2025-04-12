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
import com.google.android.gms.measurement.internal.zzga;
import com.google.android.gms.measurement.internal.zzog;
import java.util.List;

public abstract class zzgd
extends zzbx
implements zzga {
    public zzgd() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 2;
        if (n3 == n7) {
            Object object = zzog.CREATOR;
            object = parcel.createTypedArrayList(object);
            zzbw.zzb(parcel);
            this.zza((List)object);
            return true;
        }
        return false;
    }
}

