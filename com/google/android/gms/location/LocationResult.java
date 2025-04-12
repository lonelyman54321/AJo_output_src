/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.location.Location
 *  android.os.Build$VERSION
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.location.zzag;
import com.google.android.gms.location.zzak;
import java.util.Collections;
import java.util.List;

public final class LocationResult
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    static final List zza;
    private final List zzb;

    static {
        zza = Collections.emptyList();
        zzag zzag2 = new zzag();
        CREATOR = zzag2;
    }

    public LocationResult(List list) {
        this.zzb = list;
    }

    public static LocationResult create(List list) {
        if (list == null) {
            list = zza;
        }
        LocationResult locationResult = new LocationResult(list);
        return locationResult;
    }

    public static LocationResult extractResult(Intent intent) {
        boolean bl2 = LocationResult.hasResult(intent);
        if (!bl2) {
            return null;
        }
        Parcelable.Creator creator = CREATOR;
        LocationResult locationResult = (LocationResult)SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES", creator);
        if (locationResult == null) {
            return (LocationResult)intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
        }
        return locationResult;
    }

    public static boolean hasResult(Intent intent) {
        boolean bl2;
        if (intent == null) {
            return false;
        }
        String string2 = "com.google.android.gms.location.EXTRA_LOCATION_RESULT";
        boolean bl3 = intent.hasExtra(string2);
        return bl3 || (bl2 = intent.hasExtra(string2 = "com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES"));
        {
        }
    }

    public boolean equals(Object iterator) {
        int n3 = iterator instanceof LocationResult;
        if (n3 != 0) {
            Object object;
            iterator = (LocationResult)((Object)iterator);
            n3 = Build.VERSION.SDK_INT;
            int n4 = 31;
            if (n3 >= n4) {
                List list = this.zzb;
                iterator = ((LocationResult)((Object)iterator)).zzb;
                return ((Object)list).equals(iterator);
            }
            Object object2 = this.zzb;
            n3 = object2.size();
            if (n3 != (n4 = (object = ((LocationResult)((Object)iterator)).zzb).size())) {
                return false;
            }
            object2 = this.zzb.iterator();
            iterator = ((LocationResult)((Object)iterator)).zzb.iterator();
            while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                long l2;
                double d2;
                object = (Location)object2.next();
                Object object3 = (Location)iterator.next();
                double d5 = object.getLatitude();
                int n7 = Double.compare(d5, d2 = object3.getLatitude());
                if (n7 != 0) {
                    return false;
                }
                d5 = object.getLongitude();
                n7 = Double.compare(d5, d2 = object3.getLongitude());
                if (n7 != 0) {
                    return false;
                }
                long l3 = object.getTime();
                long l4 = l3 - (l2 = object3.getTime());
                Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object4 != false) {
                    return false;
                }
                l3 = object.getElapsedRealtimeNanos();
                long l7 = l3 - (l2 = object3.getElapsedRealtimeNanos());
                object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object4 != false) {
                    return false;
                }
                n4 = (int)(Objects.equal(object = object.getProvider(), object3 = object3.getProvider()) ? 1 : 0);
                if (n4 != 0) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public Location getLastLocation() {
        List list = this.zzb;
        int n3 = list.size();
        if (n3 == 0) {
            return null;
        }
        List list2 = this.zzb;
        return (Location)list2.get(n3 += -1);
    }

    public List getLocations() {
        return this.zzb;
    }

    public int hashCode() {
        List list = this.zzb;
        Object[] objectArray = new Object[]{list};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder("LocationResult");
        int n3 = zzak.zza;
        Object object = this.zzb;
        int n4 = object.size() * 100;
        stringBuilder.ensureCapacity(n4);
        stringBuilder.append("[");
        object = object.iterator();
        n4 = 0;
        String string2 = null;
        while (bl2 = object.hasNext()) {
            zzak.zza((Location)object.next(), stringBuilder);
            string2 = ", ";
            stringBuilder.append(string2);
            n4 = 1;
        }
        if (n4 != 0) {
            n3 = stringBuilder.length() + -2;
            stringBuilder.setLength(n3);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        List list = this.getLocations();
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

