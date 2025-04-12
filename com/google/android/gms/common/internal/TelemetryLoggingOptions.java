/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Api$ApiOptions$Optional;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder;
import com.google.android.gms.common.internal.zaad;

public class TelemetryLoggingOptions
implements Api$ApiOptions$Optional {
    public static final TelemetryLoggingOptions zaa = TelemetryLoggingOptions.builder().build();
    private final String zab;

    public /* synthetic */ TelemetryLoggingOptions(String string2, zaad zaad2) {
        this.zab = string2;
    }

    public static TelemetryLoggingOptions$Builder builder() {
        TelemetryLoggingOptions$Builder telemetryLoggingOptions$Builder = new TelemetryLoggingOptions$Builder(null);
        return telemetryLoggingOptions$Builder;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        boolean bl2 = object instanceof TelemetryLoggingOptions;
        if (!bl2) {
            return false;
        }
        object = (TelemetryLoggingOptions)object;
        String string2 = this.zab;
        object = ((TelemetryLoggingOptions)object).zab;
        return Objects.equal(string2, object);
    }

    public final int hashCode() {
        String string2 = this.zab;
        Object[] objectArray = new Object[]{string2};
        return Objects.hashCode(objectArray);
    }

    public final Bundle zaa() {
        Bundle bundle = new Bundle();
        String string2 = this.zab;
        if (string2 != null) {
            String string3 = "api";
            bundle.putString(string3, string2);
        }
        return bundle;
    }
}

