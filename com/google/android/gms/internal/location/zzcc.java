/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzcc
implements RemoteCall {
    static final /* synthetic */ zzcc zza;

    static {
        zzcc zzcc2;
        zza = zzcc2 = new zzcc();
    }

    private /* synthetic */ zzcc() {
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        ((zzdz)object).zzz((TaskCompletionSource)object2);
    }
}

