/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzec
implements OnTokenCanceledListener {
    private final /* synthetic */ zzdz zza;
    private final /* synthetic */ ListenerHolder$ListenerKey zzb;

    public /* synthetic */ zzec(zzdz zzdz2, ListenerHolder$ListenerKey listenerHolder$ListenerKey) {
        this.zza = zzdz2;
        this.zzb = listenerHolder$ListenerKey;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ void onCanceled() {
        boolean bl2;
        TaskCompletionSource taskCompletionSource;
        zzdz zzdz2 = this.zza;
        ListenerHolder$ListenerKey listenerHolder$ListenerKey = this.zzb;
        try {
            taskCompletionSource = new TaskCompletionSource();
            bl2 = true;
        }
        catch (RemoteException remoteException) {
            return;
        }
        zzdz2.zzw(listenerHolder$ListenerKey, bl2, taskCompletionSource);
    }
}

