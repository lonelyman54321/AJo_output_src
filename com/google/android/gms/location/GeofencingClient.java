/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.Task;
import java.util.List;

public interface GeofencingClient
extends HasApiKey {
    public Task addGeofences(GeofencingRequest var1, PendingIntent var2);

    public Task removeGeofences(PendingIntent var1);

    public Task removeGeofences(List var1);
}

