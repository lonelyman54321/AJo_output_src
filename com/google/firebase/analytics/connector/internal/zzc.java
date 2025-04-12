/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.api.AppMeasurementSdk$OnEventListener;
import com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorListener;
import com.google.firebase.analytics.connector.internal.zza;
import com.google.firebase.analytics.connector.internal.zzd;
import com.google.firebase.analytics.connector.internal.zzf;
import java.util.HashSet;
import java.util.Set;

public final class zzc
implements zza {
    Set zza;
    private AnalyticsConnector$AnalyticsConnectorListener zzb;
    private AppMeasurementSdk zzc;
    private zzf zzd;

    public zzc(AppMeasurementSdk hashSet, AnalyticsConnector$AnalyticsConnectorListener analyticsConnector$AnalyticsConnectorListener) {
        this.zzb = analyticsConnector$AnalyticsConnectorListener;
        this.zzc = hashSet;
        hashSet = new HashSet(this);
        this.zzd = hashSet;
        this.zzc.registerOnMeasurementEventListener((AppMeasurementSdk$OnEventListener)((Object)hashSet));
        this.zza = hashSet = new HashSet();
    }

    public static /* bridge */ /* synthetic */ AnalyticsConnector$AnalyticsConnectorListener zza(zzc zzc2) {
        return zzc2.zzb;
    }

    public final AnalyticsConnector$AnalyticsConnectorListener zza() {
        return this.zzb;
    }

    public final void zza(Set object) {
        boolean bl2;
        this.zza.clear();
        Set set = this.zza;
        HashSet<String> hashSet = new HashSet<String>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            int n3;
            String string2 = (String)object.next();
            int n4 = hashSet.size();
            if (n4 >= (n3 = 50)) break;
            n4 = (int)(com.google.firebase.analytics.connector.internal.zzd.zzc(string2) ? 1 : 0);
            if (n4 == 0 || (n4 = (int)(com.google.firebase.analytics.connector.internal.zzd.zzd(string2) ? 1 : 0)) == 0) continue;
            string2 = com.google.firebase.analytics.connector.internal.zzd.zzb(string2);
            Preconditions.checkNotNull(string2);
            hashSet.add(string2);
        }
        set.addAll(hashSet);
    }

    public final void zzb() {
        this.zza.clear();
    }
}

