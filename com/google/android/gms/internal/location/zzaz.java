/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.location.zzdr;

final class zzaz
implements zzdr {
    private ListenerHolder zza;

    public zzaz(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenerHolder zza() {
        synchronized (this) {
            return this.zza;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(ListenerHolder listenerHolder) {
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

    public final void zzc() {
    }
}

