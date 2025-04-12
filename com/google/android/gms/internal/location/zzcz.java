/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.location.zzcx;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SettingsApi;

public final class zzcz
implements SettingsApi {
    public final PendingResult checkLocationSettings(GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest) {
        zzcx zzcx2 = new zzcx(this, googleApiClient, locationSettingsRequest, null);
        return googleApiClient.enqueue(zzcx2);
    }
}

