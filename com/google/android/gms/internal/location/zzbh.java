/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbg;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzdr;

final class zzbh
implements RemoteCall,
zzdr {
    final /* synthetic */ zzbi zza;
    private final zzbg zzb;
    private ListenerHolder zzc;
    private boolean zzd = true;

    public zzbh(zzbi zzbi2, ListenerHolder listenerHolder, zzbg zzbg2) {
        this.zza = zzbi2;
        this.zzc = listenerHolder;
        this.zzb = zzbg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenerHolder zza() {
        synchronized (this) {
            return this.zzc;
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
                        listenerHolder2 = this.zzc;
                        if (listenerHolder2 == listenerHolder) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    {
                        listenerHolder2.clear();
                        this.zzc = listenerHolder;
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
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzc() {
        // MONITORENTER : this
        Object object = null;
        this.zzd = false;
        object = this.zzc;
        object = ((ListenerHolder)object).getListenerKey();
        // MONITOREXIT : this
        if (object == null) return;
        zzbi zzbi2 = this.zza;
        int n3 = 2441;
        zzbi2.doUnregisterEventListener((ListenerHolder$ListenerKey)object, n3);
    }
}

