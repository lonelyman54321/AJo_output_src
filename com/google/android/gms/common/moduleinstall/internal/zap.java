/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.moduleinstall.internal.zaf;
import com.google.android.gms.common.moduleinstall.internal.zas;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.common.moduleinstall.internal.zaz;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zap
implements RemoteCall {
    public final /* synthetic */ zay zaa;
    public final /* synthetic */ ApiFeatureRequest zab;

    public /* synthetic */ zap(zay zay2, ApiFeatureRequest apiFeatureRequest) {
        this.zaa = zay2;
        this.zab = apiFeatureRequest;
    }

    public final void accept(Object object, Object object2) {
        object = (zaz)object;
        object2 = (TaskCompletionSource)object2;
        zay zay2 = this.zaa;
        zas zas2 = new zas(zay2, (TaskCompletionSource)object2);
        object = (zaf)((BaseGmsClient)object).getService();
        object2 = this.zab;
        ((zaf)object).zag(zas2, (ApiFeatureRequest)object2, null);
    }
}

