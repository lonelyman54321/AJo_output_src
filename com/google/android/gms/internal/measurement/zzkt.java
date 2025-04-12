/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkq;
import com.google.android.gms.internal.measurement.zzkv;
import com.google.android.gms.internal.measurement.zzlm;
import java.util.Map;

final class zzkt
implements Map.Entry {
    private Map.Entry zza;

    private zzkt(Map.Entry entry) {
        this.zza = entry;
    }

    public /* synthetic */ zzkt(Map.Entry entry, zzkv zzkv2) {
        this(entry);
    }

    public final Object getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        Object object = (zzkq)this.zza.getValue();
        if (object == null) {
            return null;
        }
        object = new NoSuchMethodError();
        throw object;
    }

    public final Object setValue(Object object) {
        boolean bl2 = object instanceof zzlm;
        if (bl2) {
            zzkq zzkq2 = (zzkq)this.zza.getValue();
            object = (zzlm)object;
            return zzkq2.zza((zzlm)object);
        }
        object = new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        throw object;
    }

    public final zzkq zza() {
        return (zzkq)this.zza.getValue();
    }
}

