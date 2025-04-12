/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzx;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhdv;
import com.google.android.gms.internal.ads.zzhdy;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzhdw
implements Iterator {
    private final ArrayDeque zza;
    private zzgzx zzb;

    public /* synthetic */ zzhdw(zzhac zzhac2, zzhdv arrayDeque) {
        boolean bl2 = zzhac2 instanceof zzhdy;
        if (bl2) {
            zzhac2 = (zzhdy)zzhac2;
            int n3 = ((zzhdy)zzhac2).zzf();
            this.zza = arrayDeque = new ArrayDeque<zzhac>(n3);
            arrayDeque.push(zzhac2);
            zzhac2 = zzhdy.zzg((zzhdy)zzhac2);
            zzhac2 = this.zzb(zzhac2);
            this.zzb = zzhac2;
            return;
        }
        this.zza = null;
        zzhac2 = (zzgzx)zzhac2;
        this.zzb = zzhac2;
    }

    private final zzgzx zzb(zzhac zzhac2) {
        boolean bl2;
        while (bl2 = zzhac2 instanceof zzhdy) {
            zzhac2 = (zzhdy)zzhac2;
            ArrayDeque arrayDeque = this.zza;
            arrayDeque.push(zzhac2);
            zzhac2 = zzhdy.zzg((zzhdy)zzhac2);
        }
        return (zzgzx)zzhac2;
    }

    public final boolean hasNext() {
        zzgzx zzgzx2 = this.zzb;
        return zzgzx2 != null;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final zzgzx zza() {
        Serializable serializable = this.zzb;
        if (serializable != null) {
            zzgzx zzgzx2;
            int n3;
            Iterable iterable;
            do {
                iterable = this.zza;
                zzgzx2 = null;
            } while (iterable != null && (n3 = iterable.isEmpty()) == 0 && (n3 = (zzgzx2 = this.zzb((zzhac)(iterable = zzhdy.zzC((zzhdy)this.zza.pop())))).zzd()) == 0);
            this.zzb = zzgzx2;
            return serializable;
        }
        serializable = new NoSuchElementException();
        throw serializable;
    }
}

