/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzat;

final class zzaw
extends zzat {
    static final zzat zza;
    final transient Object[] zzb;
    private final transient int zzc;

    static {
        Object[] objectArray = new Object[]{};
        zzaw zzaw2 = new zzaw(objectArray, 0);
        zza = zzaw2;
    }

    public zzaw(Object[] objectArray, int n3) {
        this.zzb = objectArray;
        this.zzc = n3;
    }

    public final Object get(int n3) {
        int n4 = this.zzc;
        zzam.zza(n3, n4, "index");
        Object object = this.zzb[n3];
        object.getClass();
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

