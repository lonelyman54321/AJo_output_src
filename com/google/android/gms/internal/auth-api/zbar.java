/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth-api.zbad;
import com.google.android.gms.internal.auth-api.zbau;
import com.google.android.gms.internal.auth-api.zbaw;
import com.google.android.gms.internal.auth-api.zbx;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zbar
implements RemoteCall {
    public final /* synthetic */ zbaw zba;
    public final /* synthetic */ SaveAccountLinkingTokenRequest zbb;

    public /* synthetic */ zbar(zbaw zbaw2, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        this.zba = zbaw2;
        this.zbb = saveAccountLinkingTokenRequest;
    }

    public final void accept(Object object, Object object2) {
        zbaw zbaw2 = this.zba;
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = this.zbb;
        object = (zbx)object;
        object2 = (TaskCompletionSource)object2;
        zbau zbau2 = new zbau(zbaw2, (TaskCompletionSource)object2);
        object = (zbad)((BaseGmsClient)object).getService();
        object2 = (SaveAccountLinkingTokenRequest)Preconditions.checkNotNull(saveAccountLinkingTokenRequest);
        ((zbad)object).zbc(zbau2, (SaveAccountLinkingTokenRequest)object2);
    }
}

