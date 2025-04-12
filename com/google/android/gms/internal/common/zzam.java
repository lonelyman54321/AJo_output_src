/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.common;

import com.google.android.gms.internal.common.zzak;
import com.google.android.gms.internal.common.zzv;
import java.util.Objects;

final class zzam
extends zzak {
    static final zzak zza;
    final transient Object[] zzb;
    private final transient int zzc;

    static {
        Object[] objectArray = new Object[]{};
        zzam zzam2 = new zzam(objectArray, 0);
        zza = zzam2;
    }

    public zzam(Object[] objectArray, int n3) {
        this.zzb = objectArray;
        this.zzc = n3;
    }

    public final Object get(int n3) {
        int n4 = this.zzc;
        zzv.zza(n3, n4, "index");
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

    public final boolean zzf() {
        return false;
    }

    public final Object[] zzg() {
        return this.zzb;
    }
}

