/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.Task;

public interface SettingsClient
extends HasApiKey {
    public Task checkLocationSettings(LocationSettingsRequest var1);

    public Task isGoogleLocationAccuracyEnabled();
}

