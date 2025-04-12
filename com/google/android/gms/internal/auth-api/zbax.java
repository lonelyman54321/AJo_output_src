/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth-api.zbam;
import com.google.android.gms.internal.auth-api.zbbc;
import com.google.android.gms.internal.auth-api.zbbg;
import com.google.android.gms.internal.auth-api.zbbh;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zbax
implements RemoteCall {
    public final /* synthetic */ zbbg zba;
    public final /* synthetic */ BeginSignInRequest zbb;

    public /* synthetic */ zbax(zbbg zbbg2, BeginSignInRequest beginSignInRequest) {
        this.zba = zbbg2;
        this.zbb = beginSignInRequest;
    }

    public final void accept(Object object, Object object2) {
        zbbg zbbg2 = this.zba;
        BeginSignInRequest beginSignInRequest = this.zbb;
        object = (zbbh)object;
        object2 = (TaskCompletionSource)object2;
        zbbc zbbc2 = new zbbc(zbbg2, (TaskCompletionSource)object2);
        object = (zbam)((BaseGmsClient)object).getService();
        object2 = (BeginSignInRequest)Preconditions.checkNotNull(beginSignInRequest);
        ((zbam)object).zbc(zbbc2, (BeginSignInRequest)object2);
    }
}

