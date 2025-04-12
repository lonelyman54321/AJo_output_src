/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzvz;
import com.google.android.gms.internal.gtm.zzwa;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzvy
implements Iterator {
    final /* synthetic */ zzvz zza;
    private int zzb = 0;

    public zzvy(zzvz zzvz2) {
        this.zza = zzvz2;
    }

    public final boolean hasNext() {
        int n3 = this.zzb;
        zzvz zzvz2 = this.zza;
        int n4 = zzvz2.zza();
        int n7 = zzvz2.zzb();
        return n3 < (n4 -= n7);
    }

    public final Object next() {
        int n3 = this.zzb;
        Object object = this.zza;
        int n4 = ((zzvz)object).zza();
        int n7 = ((zzvz)object).zzb();
        if (n3 < (n4 -= n7)) {
            object = this.zza;
            Object[] objectArray = zzwa.zzc(((zzvz)object).zzb);
            n7 = ((zzvz)object).zzb() + n3;
            object = objectArray[n7];
            this.zzb = ++n3;
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

