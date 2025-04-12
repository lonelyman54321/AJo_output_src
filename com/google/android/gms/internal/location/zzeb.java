/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;

final class zzeb
implements OnTokenCanceledListener {
    private final /* synthetic */ ICancelToken zza;

    public /* synthetic */ zzeb(ICancelToken iCancelToken) {
        this.zza = iCancelToken;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ void onCanceled() {
        ICancelToken iCancelToken = this.zza;
        try {
            iCancelToken.cancel();
            return;
        }
        catch (RemoteException remoteException) {
            return;
        }
    }
}

