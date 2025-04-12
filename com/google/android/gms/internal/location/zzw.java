/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;
import com.google.android.gms.internal.location.zzx;
import com.google.android.gms.location.LocationAvailability;

public abstract class zzw
extends zzb
implements zzx {
    public zzw() {
        super("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            Object object = Status.CREATOR;
            object = (Status)zzc.zza(parcel, object);
            Object object2 = LocationAvailability.CREATOR;
            object2 = (LocationAvailability)zzc.zza(parcel, object2);
            zzc.zzd(parcel);
            this.zzb((Status)object, (LocationAvailability)object2);
            return n7;
        }
        return false;
    }
}

