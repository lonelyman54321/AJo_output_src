/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzee;

final class zzew
extends zzee {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzew(Object[] objectArray, int n3, int n4) {
        this.zza = objectArray;
        this.zzb = n3;
        this.zzc = n4;
    }

    public final Object get(int n3) {
        int n4 = this.zzc;
        zzde.zza(n3, n4);
        Object[] objectArray = this.zza;
        n3 *= 2;
        int n7 = this.zzb;
        return objectArray[n3 += n7];
    }

    public final int size() {
        return this.zzc;
    }

    public final boolean zzf() {
        return true;
    }
}

