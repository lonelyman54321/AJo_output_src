/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzt;
import com.google.android.gms.internal.ads.zzhac;
import java.util.NoSuchElementException;

final class zzgzr
extends zzgzt {
    final /* synthetic */ zzhac zza;
    private int zzb = 0;
    private final int zzc;

    public zzgzr(zzhac zzhac2) {
        int n3;
        this.zza = zzhac2;
        this.zzc = n3 = zzhac2.zzd();
    }

    public final boolean hasNext() {
        int n3 = this.zzb;
        int n4 = this.zzc;
        return n3 < n4;
    }

    public final byte zza() {
        int n3 = this.zzb;
        int n4 = this.zzc;
        if (n3 < n4) {
            this.zzb = n4 = n3 + 1;
            return this.zza.zzb(n3);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

