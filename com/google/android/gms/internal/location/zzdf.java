/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.internal.location.zzaa;
import com.google.android.gms.location.LocationSettingsResult;

final class zzdf
extends zzaa {
    final /* synthetic */ BaseImplementation$ResultHolder zza;

    public zzdf(BaseImplementation$ResultHolder baseImplementation$ResultHolder) {
        this.zza = baseImplementation$ResultHolder;
    }

    public final void zzb(LocationSettingsResult locationSettingsResult) {
        this.zza.setResult(locationSettingsResult);
    }
}

