/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class zzazt {
    private final Map zza;

    public zzazt() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AtomicReference zza(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        AtomicReference atomicReference = this.zza;
                        boolean bl2 = atomicReference.containsKey(string2);
                        if (bl2) break block4;
                        atomicReference = new AtomicReference();
                        Map map2 = this.zza;
                        map2.put(string2, atomicReference);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return (AtomicReference)this.zza.get(string2);
            }
            throw throwable2;
        }
    }
}

