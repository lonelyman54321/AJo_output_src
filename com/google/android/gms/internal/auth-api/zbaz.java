/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.auth-api.zbbg;
import com.google.android.gms.internal.auth-api.zbbh;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zbaz
implements RemoteCall {
    public final /* synthetic */ zbbg zba;

    public /* synthetic */ zbaz(zbbg zbbg2) {
        this.zba = zbbg2;
    }

    public final void accept(Object object, Object object2) {
        zbbg zbbg2 = this.zba;
        object = (zbbh)object;
        object2 = (TaskCompletionSource)object2;
        zbbg2.zbb((zbbh)object, (TaskCompletionSource)object2);
    }
}

