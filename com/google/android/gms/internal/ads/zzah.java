/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseBooleanArray
 */
package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
import com.google.android.gms.internal.ads.zzag;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgd;

public final class zzah {
    private final SparseBooleanArray zza;

    public /* synthetic */ zzah(SparseBooleanArray sparseBooleanArray, zzag zzag2) {
        this.zza = sparseBooleanArray;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof zzah;
        if (n3 == 0) {
            return false;
        }
        object = (zzah)object;
        n3 = zzgd.zza;
        int n4 = 24;
        if (n3 < n4) {
            SparseBooleanArray sparseBooleanArray = this.zza;
            SparseBooleanArray sparseBooleanArray2 = ((zzah)object).zza;
            n3 = sparseBooleanArray.size();
            if (n3 == (n4 = sparseBooleanArray2.size())) {
                sparseBooleanArray = null;
                for (n3 = 0; n3 < (n4 = (sparseBooleanArray2 = this.zza).size()); ++n3) {
                    int n7;
                    n4 = this.zza(n3);
                    if (n4 == (n7 = ((zzah)object).zza(n3))) continue;
                    return false;
                }
                return bl2;
            }
            return false;
        }
        SparseBooleanArray sparseBooleanArray = this.zza;
        object = ((zzah)object).zza;
        return sparseBooleanArray.equals(object);
    }

    public final int hashCode() {
        int n3 = zzgd.zza;
        int n4 = 24;
        if (n3 < n4) {
            SparseBooleanArray sparseBooleanArray;
            int n7;
            SparseBooleanArray sparseBooleanArray2 = this.zza;
            n3 = sparseBooleanArray2.size();
            for (n4 = 0; n4 < (n7 = (sparseBooleanArray = this.zza).size()); ++n4) {
                n3 *= 31;
                n7 = this.zza(n4);
                n3 += n7;
            }
            return n3;
        }
        return this.zza.hashCode();
    }

    public final int zza(int n3) {
        int n4 = this.zza.size();
        zzeq.zza(n3, 0, n4);
        return this.zza.keyAt(n3);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int n3) {
        return this.zza.get(n3);
    }
}

