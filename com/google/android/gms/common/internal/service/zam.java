/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.service.zai;
import com.google.android.gms.common.internal.service.zap;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zam
implements RemoteCall {
    public final /* synthetic */ TelemetryData zaa;

    public /* synthetic */ zam(TelemetryData telemetryData) {
        this.zaa = telemetryData;
    }

    public final void accept(Object object, Object object2) {
        object = (zap)object;
        object2 = (TaskCompletionSource)object2;
        object = (zai)((BaseGmsClient)object).getService();
        TelemetryData telemetryData = this.zaa;
        ((zai)object).zae(telemetryData);
        ((TaskCompletionSource)object2).setResult(null);
    }
}

