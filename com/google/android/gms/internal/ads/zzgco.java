/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.Objects;

final class zzgco
extends zzgbc {
    static final zzgbc zza;
    final transient Object[] zzb;
    private final transient int zzc;

    static {
        Object[] objectArray = new Object[]{};
        zzgco zzgco2 = new zzgco(objectArray, 0);
        zza = zzgco2;
    }

    public zzgco(Object[] objectArray, int n3) {
        this.zzb = objectArray;
        this.zzc = n3;
    }

    public final Object get(int n3) {
        int n4 = this.zzc;
        zzfyg.zza(n3, n4, "index");
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
        System.arraycopy(objectArray2, 0, objectArray, n3, n4);
        int n7 = this.zzc;
        return n3 + n7;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return 0;
    }

    public final boolean zzf() {
        return false;
    }

    public final Object[] zzg() {
        return this.zzb;
    }
}

