/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzcb
implements RemoteCall {
    static final /* synthetic */ zzcb zza;

    static {
        zzcb zzcb2;
        zza = zzcb2 = new zzcb();
    }

    private /* synthetic */ zzcb() {
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        ((zzdz)object).zzy((TaskCompletionSource)object2);
    }
}

