/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth-api.zbam;
import com.google.android.gms.internal.auth-api.zbbe;
import com.google.android.gms.internal.auth-api.zbbg;
import com.google.android.gms.internal.auth-api.zbbh;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zbay
implements RemoteCall {
    public final /* synthetic */ zbbg zba;
    public final /* synthetic */ GetSignInIntentRequest zbb;

    public /* synthetic */ zbay(zbbg zbbg2, GetSignInIntentRequest getSignInIntentRequest) {
        this.zba = zbbg2;
        this.zbb = getSignInIntentRequest;
    }

    public final void accept(Object object, Object object2) {
        zbbg zbbg2 = this.zba;
        GetSignInIntentRequest getSignInIntentRequest = this.zbb;
        object = (zbbh)object;
        object2 = (TaskCompletionSource)object2;
        zbbe zbbe2 = new zbbe(zbbg2, (TaskCompletionSource)object2);
        object = (zbam)((BaseGmsClient)object).getService();
        object2 = (GetSignInIntentRequest)Preconditions.checkNotNull(getSignInIntentRequest);
        ((zbam)object).zbe(zbbe2, (GetSignInIntentRequest)object2);
    }
}

