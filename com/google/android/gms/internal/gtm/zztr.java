/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zztd;
import com.google.android.gms.internal.gtm.zztl;
import java.util.Objects;

final class zztr
extends zztl {
    static final zztl zza;
    final transient Object[] zzb;
    private final transient int zzc;

    static {
        Object[] objectArray = new Object[]{};
        zztr zztr2 = new zztr(objectArray, 0);
        zza = zztr2;
    }

    public zztr(Object[] objectArray, int n3) {
        this.zzb = objectArray;
        this.zzc = n3;
    }

    public final Object get(int n3) {
        int n4 = this.zzc;
        zztd.zza(n3, n4, "index");
        Object object = this.zzb[n3];
        Objects.requireNonNull(object);
        return object;
    }

    public final int size() {
        return this.zzc;
    }

    public final int zza(Object[] objectArray, int n3) {
        Object[] objectArray2 = this.zzb;
        int n4 = this.zzc;
        System.arraycopy(objectArray2, 0, objectArray, 0, n4);
        return this.zzc;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return 0;
    }

    public final Object[] zze() {
        return this.zzb;
    }
}

