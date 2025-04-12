/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaf;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzah
implements Iterator {
    private int zza = 0;
    private final /* synthetic */ zzaf zzb;

    public zzah(zzaf zzaf2) {
        this.zzb = zzaf2;
    }

    public final boolean hasNext() {
        int n3 = this.zza;
        zzaf zzaf2 = this.zzb;
        int n4 = zzaf2.zzb();
        return n3 < n4;
    }

    public final /* synthetic */ Object next() {
        int n3 = this.zza;
        Object object = this.zzb;
        int n4 = ((zzaf)object).zzb();
        if (n3 < n4) {
            int n7;
            zzaf zzaf2 = this.zzb;
            n4 = this.zza;
            this.zza = n7 = n4 + 1;
            return zzaf2.zza(n4);
        }
        object = hj0_0.a(this.zza, "Out of bounds index: ");
        NoSuchElementException noSuchElementException = new NoSuchElementException((String)object);
        throw noSuchElementException;
    }
}

