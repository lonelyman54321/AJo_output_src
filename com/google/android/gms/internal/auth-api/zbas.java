/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth-api.zbad;
import com.google.android.gms.internal.auth-api.zbav;
import com.google.android.gms.internal.auth-api.zbaw;
import com.google.android.gms.internal.auth-api.zbx;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zbas
implements RemoteCall {
    public final /* synthetic */ zbaw zba;
    public final /* synthetic */ SavePasswordRequest zbb;

    public /* synthetic */ zbas(zbaw zbaw2, SavePasswordRequest savePasswordRequest) {
        this.zba = zbaw2;
        this.zbb = savePasswordRequest;
    }

    public final void accept(Object object, Object object2) {
        zbaw zbaw2 = this.zba;
        SavePasswordRequest savePasswordRequest = this.zbb;
        object = (zbx)object;
        object2 = (TaskCompletionSource)object2;
        zbav zbav2 = new zbav(zbaw2, (TaskCompletionSource)object2);
        object = (zbad)((BaseGmsClient)object).getService();
        object2 = (SavePasswordRequest)Preconditions.checkNotNull(savePasswordRequest);
        ((zbad)object).zbd(zbav2, (SavePasswordRequest)object2);
    }
}

