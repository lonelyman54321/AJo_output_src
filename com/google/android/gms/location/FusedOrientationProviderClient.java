/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.location.DeviceOrientationListener;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

public interface FusedOrientationProviderClient
extends HasApiKey {
    public Task removeOrientationUpdates(DeviceOrientationListener var1);

    public Task requestOrientationUpdates(DeviceOrientationRequest var1, Executor var2, DeviceOrientationListener var3);
}

