/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzaa;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzde
extends zzaa {
    final /* synthetic */ TaskCompletionSource zza;

    public zzde(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(LocationSettingsResult object) {
        Status status = ((LocationSettingsResult)object).getStatus();
        LocationSettingsResponse locationSettingsResponse = new LocationSettingsResponse((LocationSettingsResult)object);
        object = this.zza;
        TaskUtil.setResultOrApiException(status, locationSettingsResponse, (TaskCompletionSource)object);
    }
}

