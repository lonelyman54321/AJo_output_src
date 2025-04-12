/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.ArrayList;
import java.util.Collection;

public final class LocationSettingsRequest$Builder {
    private final ArrayList zza;
    private boolean zzb;
    private boolean zzc;

    public LocationSettingsRequest$Builder() {
        ArrayList arrayList;
        this.zza = arrayList = new ArrayList();
        this.zzb = false;
        this.zzc = false;
    }

    public LocationSettingsRequest$Builder addAllLocationRequests(Collection object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            LocationRequest locationRequest = (LocationRequest)object.next();
            if (locationRequest == null) continue;
            ArrayList arrayList = this.zza;
            arrayList.add(locationRequest);
        }
        return this;
    }

    public LocationSettingsRequest$Builder addLocationRequest(LocationRequest locationRequest) {
        if (locationRequest != null) {
            ArrayList arrayList = this.zza;
            arrayList.add(locationRequest);
        }
        return this;
    }

    public LocationSettingsRequest build() {
        ArrayList arrayList = this.zza;
        boolean bl2 = this.zzb;
        boolean bl3 = this.zzc;
        LocationSettingsRequest locationSettingsRequest = new LocationSettingsRequest(arrayList, bl2, bl3);
        return locationSettingsRequest;
    }

    public LocationSettingsRequest$Builder setAlwaysShow(boolean bl2) {
        this.zzb = bl2;
        return this;
    }

    public LocationSettingsRequest$Builder setNeedBle(boolean bl2) {
        this.zzc = bl2;
        return this;
    }
}

