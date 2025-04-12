/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.location.Location
 *  android.os.Looper
 */
package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

public interface FusedLocationProviderApi {
    public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    public PendingResult flushLocations(GoogleApiClient var1);

    public Location getLastLocation(GoogleApiClient var1);

    public LocationAvailability getLocationAvailability(GoogleApiClient var1);

    public PendingResult removeLocationUpdates(GoogleApiClient var1, PendingIntent var2);

    public PendingResult removeLocationUpdates(GoogleApiClient var1, LocationCallback var2);

    public PendingResult removeLocationUpdates(GoogleApiClient var1, LocationListener var2);

    public PendingResult requestLocationUpdates(GoogleApiClient var1, LocationRequest var2, PendingIntent var3);

    public PendingResult requestLocationUpdates(GoogleApiClient var1, LocationRequest var2, LocationCallback var3, Looper var4);

    public PendingResult requestLocationUpdates(GoogleApiClient var1, LocationRequest var2, LocationListener var3);

    public PendingResult requestLocationUpdates(GoogleApiClient var1, LocationRequest var2, LocationListener var3, Looper var4);

    public PendingResult setMockLocation(GoogleApiClient var1, Location var2);

    public PendingResult setMockMode(GoogleApiClient var1, boolean var2);
}

