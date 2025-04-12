/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzw;
import java.io.Serializable;

final class zzgay
extends zzfzw
implements Serializable {
    final Object zza;
    final Object zzb;

    public zzgay(Object object, Object object2) {
        this.zza = object;
        this.zzb = object2;
    }

    public final Object getKey() {
        return this.zza;
    }

    public final Object getValue() {
        return this.zzb;
    }

    public final Object setValue(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }
}

