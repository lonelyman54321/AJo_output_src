/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.auth-api.zbbg;
import com.google.android.gms.internal.auth-api.zbbh;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zbba
implements RemoteCall {
    public final /* synthetic */ zbbg zba;
    public final /* synthetic */ GetPhoneNumberHintIntentRequest zbb;

    public /* synthetic */ zbba(zbbg zbbg2, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        this.zba = zbbg2;
        this.zbb = getPhoneNumberHintIntentRequest;
    }

    public final void accept(Object object, Object object2) {
        zbbg zbbg2 = this.zba;
        GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest = this.zbb;
        object = (zbbh)object;
        object2 = (TaskCompletionSource)object2;
        zbbg2.zba(getPhoneNumberHintIntentRequest, (zbbh)object, (TaskCompletionSource)object2);
    }
}

