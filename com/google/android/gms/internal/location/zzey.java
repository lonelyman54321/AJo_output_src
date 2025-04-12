/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.internal.location.zzer;
import com.google.android.gms.internal.location.zzex;
import java.util.Objects;

final class zzey
extends zzex {
    static final zzex zza;
    final transient Object[] zzb;
    private final transient int zzc;

    static {
        Object[] objectArray = new Object[]{};
        zzey zzey2 = new zzey(objectArray, 0);
        zza = zzey2;
    }

    public zzey(Object[] objectArray, int n3) {
        this.zzb = objectArray;
        this.zzc = n3;
    }

    public final Object get(int n3) {
        int n4 = this.zzc;
        zzer.zzc(n3, n4, "index");
        Object object = this.zzb[n3];
        Objects.requireNonNull(object);
        return object;
    }

    public final int size() {
        return this.zzc;
    }

    public final Object[] zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return 0;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final boolean zzf() {
        return false;
    }

    public final int zzg(Object[] objectArray, int n3) {
        Object[] objectArray2 = this.zzb;
        int n4 = this.zzc;
        System.arraycopy(objectArray2, 0, objectArray, 0, n4);
        return this.zzc;
    }
}

