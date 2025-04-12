/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.internal.location.zzab;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;
import com.google.android.gms.location.LocationSettingsResult;

public abstract class zzaa
extends zzb
implements zzab {
    public zzaa() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            Object object = LocationSettingsResult.CREATOR;
            object = (LocationSettingsResult)zzc.zza(parcel, object);
            zzc.zzd(parcel);
            this.zzb((LocationSettingsResult)object);
            return n7;
        }
        return false;
    }
}

