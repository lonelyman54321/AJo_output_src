/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzca
implements RemoteCall {
    static final /* synthetic */ zzca zza;

    static {
        zzca zzca2;
        zza = zzca2 = new zzca();
    }

    private /* synthetic */ zzca() {
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        ((zzdz)object).zzB((TaskCompletionSource)object2);
    }
}

