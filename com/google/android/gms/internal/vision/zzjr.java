/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjo;
import com.google.android.gms.internal.vision.zzjp;
import com.google.android.gms.internal.vision.zzkk;
import java.util.Map;

final class zzjr
implements Map.Entry {
    private Map.Entry zza;

    private zzjr(Map.Entry entry) {
        this.zza = entry;
    }

    public /* synthetic */ zzjr(Map.Entry entry, zzjo zzjo2) {
        this(entry);
    }

    public final Object getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        zzjp zzjp2 = (zzjp)this.zza.getValue();
        if (zzjp2 == null) {
            return null;
        }
        return zzjp.zza();
    }

    public final Object setValue(Object object) {
        boolean bl2 = object instanceof zzkk;
        if (bl2) {
            zzjp zzjp2 = (zzjp)this.zza.getValue();
            object = (zzkk)object;
            return zzjp2.zza((zzkk)object);
        }
        object = new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        throw object;
    }

    public final zzjp zza() {
        return (zzjp)this.zza.getValue();
    }
}

