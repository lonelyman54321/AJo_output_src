/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseBooleanArray
 */
package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
import com.google.android.gms.internal.ads.zzah;
import com.google.android.gms.internal.ads.zzeq;

public final class zzaf {
    private final SparseBooleanArray zza;
    private boolean zzb;

    public zzaf() {
        SparseBooleanArray sparseBooleanArray;
        this.zza = sparseBooleanArray = new SparseBooleanArray();
    }

    public final zzaf zza(int n3) {
        boolean bl2 = this.zzb;
        boolean bl3 = true;
        zzeq.zzf(bl2 ^ bl3);
        this.zza.append(n3, bl3);
        return this;
    }

    public final zzah zzb() {
        boolean bl2 = this.zzb;
        boolean bl3 = true;
        zzeq.zzf(bl2 ^ bl3);
        this.zzb = bl3;
        SparseBooleanArray sparseBooleanArray = this.zza;
        zzah zzah2 = new zzah(sparseBooleanArray, null);
        return zzah2;
    }
}

