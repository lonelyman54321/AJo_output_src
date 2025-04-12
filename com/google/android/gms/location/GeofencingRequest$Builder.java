/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzek;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingRequest;
import java.util.ArrayList;
import java.util.List;

public final class GeofencingRequest$Builder {
    private final List zza;
    private int zzb;

    public GeofencingRequest$Builder() {
        ArrayList arrayList;
        this.zza = arrayList = new ArrayList();
        this.zzb = 5;
    }

    public GeofencingRequest$Builder addGeofence(Geofence geofence) {
        Preconditions.checkArgument(geofence instanceof zzek, "Geofence must be created using Geofence.Builder.");
        List list = this.zza;
        geofence = (zzek)geofence;
        list.add(geofence);
        return this;
    }

    public GeofencingRequest$Builder addGeofences(List object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Geofence geofence = (Geofence)object.next();
            this.addGeofence(geofence);
        }
        return this;
    }

    public GeofencingRequest build() {
        Preconditions.checkArgument(this.zza.isEmpty() ^ true, "No geofence has been added to this request.");
        List list = this.zza;
        ArrayList arrayList = new ArrayList(list);
        int n3 = this.zzb;
        GeofencingRequest geofencingRequest = new GeofencingRequest(arrayList, n3, null);
        return geofencingRequest;
    }

    public GeofencingRequest$Builder setInitialTrigger(int n3) {
        this.zzb = n3 &= 7;
        return this;
    }
}

