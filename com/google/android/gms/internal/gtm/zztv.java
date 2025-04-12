/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zztd;
import com.google.android.gms.internal.gtm.zztl;
import java.util.Objects;

final class zztv
extends zztl {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zztv(Object[] objectArray, int n3, int n4) {
        this.zza = objectArray;
        this.zzb = n3;
        this.zzc = 6;
    }

    public final Object get(int n3) {
        int n4 = this.zzc;
        zztd.zza(n3, n4, "index");
        Object[] objectArray = this.zza;
        n3 += n3;
        int n7 = this.zzb;
        Object object = objectArray[n3 += n7];
        Objects.requireNonNull(object);
        return object;
    }

    public final int size() {
        return this.zzc;
    }
}

