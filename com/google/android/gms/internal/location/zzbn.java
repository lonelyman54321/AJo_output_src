/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbn
implements RemoteCall {
    private final /* synthetic */ ListenerHolder zza;

    public /* synthetic */ zzbn(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzdz)object;
        Object object3 = zzbi.zzb;
        object3 = this.zza.getListenerKey();
        if (object3 != null) {
            ((zzdz)object).zzD((ListenerHolder$ListenerKey)object3, (TaskCompletionSource)object2);
        }
    }
}

