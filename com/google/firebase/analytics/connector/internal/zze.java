/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.api.AppMeasurementSdk$OnEventListener;
import com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorListener;
import com.google.firebase.analytics.connector.internal.zza;
import com.google.firebase.analytics.connector.internal.zzg;
import java.util.Set;

public final class zze
implements zza {
    private AnalyticsConnector$AnalyticsConnectorListener zza;
    private AppMeasurementSdk zzb;
    private zzg zzc;

    public zze(AppMeasurementSdk object, AnalyticsConnector$AnalyticsConnectorListener analyticsConnector$AnalyticsConnectorListener) {
        this.zza = analyticsConnector$AnalyticsConnectorListener;
        this.zzb = object;
        this.zzc = object = new zzg(this);
        this.zzb.registerOnMeasurementEventListener((AppMeasurementSdk$OnEventListener)object);
    }

    public static /* bridge */ /* synthetic */ AnalyticsConnector$AnalyticsConnectorListener zza(zze zze2) {
        return zze2.zza;
    }

    public final AnalyticsConnector$AnalyticsConnectorListener zza() {
        return this.zza;
    }

    public final void zza(Set set) {
    }

    public final void zzb() {
    }
}

