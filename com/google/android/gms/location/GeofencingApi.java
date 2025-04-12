/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.GeofencingRequest;
import java.util.List;

public interface GeofencingApi {
    public PendingResult addGeofences(GoogleApiClient var1, GeofencingRequest var2, PendingIntent var3);

    public PendingResult addGeofences(GoogleApiClient var1, List var2, PendingIntent var3);

    public PendingResult removeGeofences(GoogleApiClient var1, PendingIntent var2);

    public PendingResult removeGeofences(GoogleApiClient var1, List var2);
}

