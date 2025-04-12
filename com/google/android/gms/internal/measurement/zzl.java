/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaq;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class zzl {
    private Map zza;

    public zzl() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
    }

    public final zzaq zza(String string2) {
        Object object = this.zza;
        boolean bl2 = object.containsKey(string2);
        if (bl2) {
            object = (Callable)this.zza.get(string2);
            try {
                object = object.call();
            }
            catch (Exception exception) {
                string2 = kp1_0.c("Failed to create API implementation: ", string2);
                object = new IllegalStateException(string2);
                throw object;
            }
            return (zzaq)object;
        }
        return zzaq.zzc;
    }

    public final void zza(String string2, Callable callable) {
        this.zza.put(string2, callable);
    }
}

