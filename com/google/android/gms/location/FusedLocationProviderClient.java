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
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.DeviceOrientationListener;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

public interface FusedLocationProviderClient
extends HasApiKey {
    public static final String KEY_MOCK_LOCATION = "mockLocation";
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    public Task flushLocations();

    public Task getCurrentLocation(int var1, CancellationToken var2);

    public Task getCurrentLocation(CurrentLocationRequest var1, CancellationToken var2);

    public Task getLastLocation();

    public Task getLastLocation(LastLocationRequest var1);

    public Task getLocationAvailability();

    public Task removeDeviceOrientationUpdates(DeviceOrientationListener var1);

    public Task removeLocationUpdates(PendingIntent var1);

    public Task removeLocationUpdates(LocationCallback var1);

    public Task removeLocationUpdates(LocationListener var1);

    public Task requestDeviceOrientationUpdates(DeviceOrientationRequest var1, DeviceOrientationListener var2, Looper var3);

    public Task requestDeviceOrientationUpdates(DeviceOrientationRequest var1, Executor var2, DeviceOrientationListener var3);

    public Task requestLocationUpdates(LocationRequest var1, PendingIntent var2);

    public Task requestLocationUpdates(LocationRequest var1, LocationCallback var2, Looper var3);

    public Task requestLocationUpdates(LocationRequest var1, LocationListener var2, Looper var3);

    public Task requestLocationUpdates(LocationRequest var1, Executor var2, LocationCallback var3);

    public Task requestLocationUpdates(LocationRequest var1, Executor var2, LocationListener var3);

    public Task setMockLocation(Location var1);

    public Task setMockMode(boolean var1);
}

