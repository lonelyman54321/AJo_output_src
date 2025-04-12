/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.LocationSettingsRequest;

public interface SettingsApi {
    public PendingResult checkLocationSettings(GoogleApiClient var1, LocationSettingsRequest var2);
}

