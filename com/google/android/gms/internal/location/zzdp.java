/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder$Notifier;
import com.google.android.gms.internal.location.zzdq;
import com.google.android.gms.location.DeviceOrientation;

final class zzdp
implements ListenerHolder$Notifier {
    final /* synthetic */ DeviceOrientation zza;

    public zzdp(zzdq zzdq2, DeviceOrientation deviceOrientation) {
        this.zza = deviceOrientation;
    }

    public final void onNotifyListenerFailed() {
    }
}

