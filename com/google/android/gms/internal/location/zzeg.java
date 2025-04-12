/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.os.WorkSource
 */
package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.location.zzeh;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationRequest$Builder;
import java.util.List;

public final class zzeg
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    LocationRequest zza;

    static {
        zzeh zzeh2 = new zzeh();
        CREATOR = zzeh2;
    }

    public zzeg(LocationRequest locationRequest, List object, boolean bl2, boolean bl3, boolean bl4, boolean bl5, String object2, long l2) {
        long l3;
        long l4;
        boolean bl6;
        object2 = new LocationRequest$Builder(locationRequest);
        if (object != null) {
            bl6 = object.isEmpty();
            if (bl6) {
                bl6 = false;
                locationRequest = null;
            } else {
                boolean bl7;
                object = object.iterator();
                while (bl7 = object.hasNext()) {
                    Object object3 = (ClientIdentity)object.next();
                    int n3 = ((ClientIdentity)object3).uid;
                    object3 = ((ClientIdentity)object3).packageName;
                    WorkSourceUtil.add((WorkSource)locationRequest, n3, (String)object3);
                }
            }
            ((LocationRequest$Builder)object2).zzc((WorkSource)locationRequest);
        }
        bl6 = true;
        if (bl2) {
            ((LocationRequest$Builder)object2).setGranularity((int)(bl6 ? 1 : 0));
        }
        if (bl3) {
            int n4 = 2;
            ((LocationRequest$Builder)object2).zza(n4);
        }
        if (bl4) {
            ((LocationRequest$Builder)object2).zzb(bl6);
        }
        if (bl5) {
            ((LocationRequest$Builder)object2).setWaitForAccurateLocation(bl6);
        }
        if (bl2 = (l4 = l2 - (l3 = Long.MAX_VALUE)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) {
            ((LocationRequest$Builder)object2).setMaxUpdateAgeMillis(l2);
        }
        this.zza = locationRequest = ((LocationRequest$Builder)object2).build();
    }

    public static zzeg zza(String object, LocationRequest locationRequest) {
        object = new zzeg(locationRequest, null, false, false, false, false, null, Long.MAX_VALUE);
        return object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzeg;
        if (bl2) {
            object = (zzeg)object;
            LocationRequest locationRequest = this.zza;
            object = ((zzeg)object).zza;
            return Objects.equal(locationRequest, object);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        LocationRequest locationRequest = this.zza;
        SafeParcelWriter.writeParcelable(parcel, 1, locationRequest, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

