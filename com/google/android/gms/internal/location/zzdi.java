/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.location.zzdr;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzdi
implements zzdr {
    final /* synthetic */ ListenerHolder zza;
    final /* synthetic */ TaskCompletionSource zzb;

    public zzdi(zzdz zzdz2, ListenerHolder listenerHolder, TaskCompletionSource taskCompletionSource) {
        this.zza = listenerHolder;
        this.zzb = taskCompletionSource;
    }

    public final ListenerHolder zza() {
        return this.zza;
    }

    public final void zzb(ListenerHolder object) {
        object = new IllegalStateException();
        throw object;
    }

    public final void zzc() {
        this.zzb.trySetResult(null);
    }
}

