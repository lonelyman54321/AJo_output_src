/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder$Notifier;
import com.google.android.gms.internal.location.zzdv;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;

final class zzdt
implements ListenerHolder$Notifier {
    final /* synthetic */ LocationAvailability zza;

    public zzdt(zzdv zzdv2, LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
    }

    public final /* synthetic */ void notifyListener(Object object) {
        object = (LocationCallback)object;
        LocationAvailability locationAvailability = this.zza;
        ((LocationCallback)object).onLocationAvailability(locationAvailability);
    }

    public final void onNotifyListenerFailed() {
    }
}

