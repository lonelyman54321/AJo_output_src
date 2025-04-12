/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzee;

final class zzep
extends zzee {
    static final zzee zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    static {
        Object[] objectArray = new Object[]{};
        zzep zzep2 = new zzep(objectArray, 0);
        zza = zzep2;
    }

    public zzep(Object[] objectArray, int n3) {
        this.zzb = objectArray;
        this.zzc = n3;
    }

    public final Object get(int n3) {
        int n4 = this.zzc;
        zzde.zza(n3, n4);
        return this.zzb[n3];
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
}

