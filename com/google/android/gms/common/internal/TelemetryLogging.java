/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.common.internal;

import android.content.Context;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.internal.service.zao;

public class TelemetryLogging {
    private TelemetryLogging() {
    }

    public static TelemetryLoggingClient getClient(Context context) {
        TelemetryLoggingOptions telemetryLoggingOptions = TelemetryLoggingOptions.zaa;
        return TelemetryLogging.getClient(context, telemetryLoggingOptions);
    }

    public static TelemetryLoggingClient getClient(Context context, TelemetryLoggingOptions telemetryLoggingOptions) {
        zao zao2 = new zao(context, telemetryLoggingOptions);
        return zao2;
    }
}

