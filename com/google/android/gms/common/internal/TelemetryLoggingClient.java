/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;

public interface TelemetryLoggingClient
extends HasApiKey {
    public Task log(TelemetryData var1);
}

