/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.Objects;

final class zzgcs
extends zzgbc {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzgcs(Object[] objectArray, int n3, int n4) {
        this.zza = objectArray;
        this.zzb = n3;
        this.zzc = n4;
    }

    public final Object get(int n3) {
        int n4 = this.zzc;
        zzfyg.zza(n3, n4, "index");
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

    public final boolean zzf() {
        return true;
    }
}

