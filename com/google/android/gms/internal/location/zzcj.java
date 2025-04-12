/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzcj
implements RemoteCall {
    private final /* synthetic */ ListenerHolder zza;

    public /* synthetic */ zzcj(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzdz)object;
        ListenerHolder$ListenerKey listenerHolder$ListenerKey = this.zza.getListenerKey();
        if (listenerHolder$ListenerKey != null) {
            ((zzdz)object).zzD(listenerHolder$ListenerKey, (TaskCompletionSource)object2);
        }
    }
}

