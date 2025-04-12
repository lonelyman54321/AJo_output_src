/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder$Notifier;
import com.google.android.gms.internal.location.zzdv;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

final class zzds
implements ListenerHolder$Notifier {
    final /* synthetic */ LocationResult zza;

    public zzds(zzdv zzdv2, LocationResult locationResult) {
        this.zza = locationResult;
    }

    public final /* synthetic */ void notifyListener(Object object) {
        object = (LocationCallback)object;
        LocationResult locationResult = this.zza;
        ((LocationCallback)object).onLocationResult(locationResult);
    }

    public final void onNotifyListenerFailed() {
    }
}

