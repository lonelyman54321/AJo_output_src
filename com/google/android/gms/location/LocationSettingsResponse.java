/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;

public class LocationSettingsResponse
extends Response {
    public LocationSettingsResponse(LocationSettingsResult locationSettingsResult) {
        super(locationSettingsResult);
    }

    public LocationSettingsStates getLocationSettingsStates() {
        return ((LocationSettingsResult)this.getResult()).getLocationSettingsStates();
    }
}

