/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcj;
import com.google.android.gms.internal.ads.zzhde;
import java.util.Map;

final class zzhch
implements Map.Entry {
    private final Map.Entry zza;

    public /* synthetic */ zzhch(Map.Entry entry, zzhcg zzhcg2) {
        this.zza = entry;
    }

    public final Object getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        zzhcj zzhcj2 = (zzhcj)this.zza.getValue();
        if (zzhcj2 == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object object) {
        boolean bl2 = object instanceof zzhde;
        if (bl2) {
            zzhcj zzhcj2 = (zzhcj)this.zza.getValue();
            object = (zzhde)object;
            return zzhcj2.zzc((zzhde)object);
        }
        object = new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        throw object;
    }

    public final zzhcj zza() {
        return (zzhcj)this.zza.getValue();
    }
}

