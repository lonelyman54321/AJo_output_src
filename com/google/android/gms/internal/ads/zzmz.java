/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzah;
import com.google.android.gms.internal.ads.zzmy;

public final class zzmz {
    private final zzah zza;
    private final SparseArray zzb;

    public zzmz(zzah zzah2, SparseArray sparseArray) {
        int n3;
        this.zza = zzah2;
        int n4 = zzah2.zzb();
        SparseArray sparseArray2 = new SparseArray(n4);
        for (n4 = 0; n4 < (n3 = zzah2.zzb()); ++n4) {
            n3 = zzah2.zza(n4);
            zzmy zzmy2 = (zzmy)sparseArray.get(n3);
            zzmy2.getClass();
            sparseArray2.append(n3, (Object)zzmy2);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int n3) {
        return this.zza.zza(n3);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzmy zzc(int n3) {
        zzmy zzmy2 = (zzmy)this.zzb.get(n3);
        zzmy2.getClass();
        return zzmy2;
    }

    public final boolean zzd(int n3) {
        return this.zza.zzc(n3);
    }
}

