/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzas;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzav
implements Iterator {
    private int zza = 0;
    private final /* synthetic */ zzas zzb;

    public zzav(zzas zzas2) {
        this.zzb = zzas2;
    }

    public final boolean hasNext() {
        int n3 = this.zza;
        String string2 = zzas.zza(this.zzb);
        int n4 = string2.length();
        return n3 < n4;
    }

    public final /* synthetic */ Object next() {
        int n3 = this.zza;
        String string2 = zzas.zza(this.zzb);
        int n4 = string2.length();
        if (n3 < n4) {
            int n7;
            n4 = this.zza;
            this.zza = n7 = n4 + 1;
            string2 = String.valueOf(n4);
            zzas zzas2 = new zzas(string2);
            return zzas2;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

