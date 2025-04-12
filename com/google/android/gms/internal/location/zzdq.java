/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.location.zzdp;
import com.google.android.gms.location.DeviceOrientation;
import com.google.android.gms.location.zzs;

final class zzdq
extends zzs {
    private ListenerHolder zza;

    public zzdq(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(ListenerHolder listenerHolder) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    ListenerHolder listenerHolder2;
                    try {
                        listenerHolder2 = this.zza;
                        if (listenerHolder2 == listenerHolder) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    {
                        listenerHolder2.clear();
                        this.zza = listenerHolder;
                        return;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(DeviceOrientation deviceOrientation) {
        ListenerHolder listenerHolder;
        synchronized (this) {
            listenerHolder = this.zza;
        }
        zzdp zzdp2 = new zzdp(this, deviceOrientation);
        listenerHolder.notifyListener(zzdp2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze() {
        synchronized (this) {
            ListenerHolder listenerHolder = this.zza;
            listenerHolder.clear();
            return;
        }
    }
}

