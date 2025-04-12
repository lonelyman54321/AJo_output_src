/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacu;
import com.google.android.gms.internal.gtm.zzacv;
import com.google.android.gms.internal.gtm.zzadl;
import java.util.Map;

final class zzacs
implements Map.Entry {
    private final Map.Entry zza;

    public /* synthetic */ zzacs(Map.Entry entry, zzacu zzacu2) {
        this.zza = entry;
    }

    public final Object getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        zzacv zzacv2 = (zzacv)this.zza.getValue();
        if (zzacv2 == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object object) {
        boolean bl2 = object instanceof zzadl;
        if (bl2) {
            zzacv zzacv2 = (zzacv)this.zza.getValue();
            object = (zzadl)object;
            return zzacv2.zzc((zzadl)object);
        }
        object = new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        throw object;
    }

    public final zzacv zza() {
        return (zzacv)this.zza.getValue();
    }
}

