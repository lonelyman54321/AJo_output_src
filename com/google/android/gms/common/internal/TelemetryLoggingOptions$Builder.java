/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.internal.zaac;

public class TelemetryLoggingOptions$Builder {
    private String zaa;

    private TelemetryLoggingOptions$Builder() {
    }

    public /* synthetic */ TelemetryLoggingOptions$Builder(zaac zaac2) {
    }

    public TelemetryLoggingOptions build() {
        String string2 = this.zaa;
        TelemetryLoggingOptions telemetryLoggingOptions = new TelemetryLoggingOptions(string2, null);
        return telemetryLoggingOptions;
    }

    public TelemetryLoggingOptions$Builder setApi(String string2) {
        this.zaa = string2;
        return this;
    }
}

