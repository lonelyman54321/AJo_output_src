/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zziz;
import java.util.NoSuchElementException;

final class zzix
extends zziz {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zziy zzc;

    public zzix(zziy zziy2) {
        int n3;
        this.zzc = zziy2;
        this.zzb = n3 = zziy2.zzb();
    }

    public final boolean hasNext() {
        int n3 = this.zza;
        int n4 = this.zzb;
        return n3 < n4;
    }

    public final byte zza() {
        int n3 = this.zza;
        int n4 = this.zzb;
        if (n3 < n4) {
            this.zza = n4 = n3 + 1;
            return this.zzc.zzb(n3);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

