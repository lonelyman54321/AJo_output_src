/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth-api.zbaa;
import com.google.android.gms.internal.auth-api.zbap;
import com.google.android.gms.internal.auth-api.zbaq;
import com.google.android.gms.internal.auth-api.zbw;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zban
implements RemoteCall {
    public final /* synthetic */ zbaq zba;
    public final /* synthetic */ AuthorizationRequest zbb;

    public /* synthetic */ zban(zbaq zbaq2, AuthorizationRequest authorizationRequest) {
        this.zba = zbaq2;
        this.zbb = authorizationRequest;
    }

    public final void accept(Object object, Object object2) {
        zbaq zbaq2 = this.zba;
        AuthorizationRequest authorizationRequest = this.zbb;
        object = (zbw)object;
        object2 = (TaskCompletionSource)object2;
        zbap zbap2 = new zbap(zbaq2, (TaskCompletionSource)object2);
        object = (zbaa)((BaseGmsClient)object).getService();
        object2 = (AuthorizationRequest)Preconditions.checkNotNull(authorizationRequest);
        ((zbaa)object).zbc(zbap2, (AuthorizationRequest)object2);
    }
}

