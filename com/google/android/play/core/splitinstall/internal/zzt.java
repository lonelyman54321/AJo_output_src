/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Set;

public final class zzt {
    protected final Set zza;

    public zzt() {
        HashSet hashSet;
        this.zza = hashSet = new HashSet();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(StateUpdatedListener stateUpdatedListener) {
        synchronized (this) {
            Set set = this.zza;
            set.add(stateUpdatedListener);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(StateUpdatedListener stateUpdatedListener) {
        synchronized (this) {
            Set set = this.zza;
            set.remove(stateUpdatedListener);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(Object object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2;
                    Object object2 = this.zza;
                    object2 = object2.iterator();
                    while (bl2 = object2.hasNext()) {
                        Object object3 = object2.next();
                        object3 = (StateUpdatedListener)object3;
                        object3.onStateUpdate(object);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}

