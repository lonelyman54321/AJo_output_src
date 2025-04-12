/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;
import com.google.android.gms.internal.location.zzz;

public abstract class zzy
extends zzb
implements zzz {
    public zzy() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            Object object = Status.CREATOR;
            object = (Status)zzc.zza(parcel, object);
            Parcelable.Creator creator = Location.CREATOR;
            creator = (Location)zzc.zza(parcel, creator);
            zzc.zzd(parcel);
            this.zzb((Status)object, (Location)creator);
            return n7;
        }
        return false;
    }
}

