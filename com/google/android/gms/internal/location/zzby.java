/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LastLocationRequest$Builder;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzby
implements RemoteCall {
    static final /* synthetic */ zzby zza;

    static {
        zzby zzby2;
        zza = zzby2 = new zzby();
    }

    private /* synthetic */ zzby() {
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzdz)object;
        Object object3 = new LastLocationRequest$Builder();
        object3 = ((LastLocationRequest$Builder)object3).build();
        ((zzdz)object).zzq((LastLocationRequest)object3, (TaskCompletionSource)object2);
    }
}

