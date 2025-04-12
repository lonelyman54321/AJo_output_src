/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzgag;
import com.google.android.gms.internal.ads.zzgal;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class zzgah
implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzgal zze;

    public /* synthetic */ zzgah(zzgal zzgal2, zzgag zzgag2) {
        int n3;
        int n4;
        this.zze = zzgal2;
        this.zzb = n4 = zzgal.zza(zzgal2);
        this.zzc = n3 = zzgal2.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int n3;
        Serializable serializable = this.zze;
        int n4 = zzgal.zza(serializable);
        if (n4 == (n3 = this.zzb)) {
            return;
        }
        serializable = new ConcurrentModificationException();
        throw serializable;
    }

    public final boolean hasNext() {
        int n3 = this.zzc;
        return n3 >= 0;
    }

    public final Object next() {
        this.zzb();
        int n3 = this.hasNext();
        if (n3 != 0) {
            int n4;
            this.zzd = n3 = this.zzc;
            Object object = this.zza(n3);
            zzgal zzgal2 = this.zze;
            int n7 = this.zzc;
            this.zzc = n4 = zzgal2.zzf(n7);
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        Object object;
        this.zzb();
        int n3 = this.zzd;
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        zzfyg.zzk(n3 != 0, "no calls to next() since the last call to remove()");
        this.zzb = n3 = this.zzb + 32;
        n3 = this.zzd;
        zzgal zzgal2 = this.zze;
        object = zzgal.zzg(zzgal2, n3);
        zzgal2.remove(object);
        n3 = this.zzc;
        int n4 = -1;
        this.zzc = n3 += n4;
        this.zzd = n4;
    }

    public abstract Object zza(int var1);
}

