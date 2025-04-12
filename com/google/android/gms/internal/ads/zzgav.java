/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgaw;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzgcm;
import java.util.Arrays;
import java.util.Collection;

class zzgav
extends zzgaw {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzgav(int n3) {
        Object[] objectArray = new Object[n3];
        this.zza = objectArray;
        this.zzb = 0;
    }

    private final void zzf(int n3) {
        Object[] objectArray = this.zza;
        int n4 = objectArray.length;
        if (n4 < n3) {
            n3 = zzgaw.zze(n4, n3);
            Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
            this.zza = objectArray2;
            this.zzc = false;
            return;
        }
        n3 = (int)(this.zzc ? 1 : 0);
        if (n3 != 0) {
            Object[] objectArray3 = (Object[])objectArray.clone();
            this.zza = objectArray3;
            this.zzc = false;
        }
    }

    public final zzgav zza(Object object) {
        int n3;
        object.getClass();
        int n4 = this.zzb + 1;
        this.zzf(n4);
        Object[] objectArray = this.zza;
        int n7 = this.zzb;
        this.zzb = n3 = n7 + 1;
        objectArray[n7] = object;
        return this;
    }

    public final zzgaw zzc(Iterable objectArray) {
        Iterable<Object> iterable;
        boolean bl2 = objectArray instanceof Collection;
        if (bl2) {
            iterable = objectArray;
            iterable = (Collection)objectArray;
            int n3 = this.zzb;
            int n4 = iterable.size() + n3;
            this.zzf(n4);
            n3 = iterable instanceof zzgax;
            if (n3 != 0) {
                int n7;
                iterable = (zzgax)iterable;
                objectArray = this.zza;
                n3 = this.zzb;
                this.zzb = n7 = ((zzgax)iterable).zza(objectArray, n3);
                return this;
            }
        }
        objectArray = objectArray.iterator();
        while (bl2 = objectArray.hasNext()) {
            iterable = objectArray.next();
            this.zzb(iterable);
        }
        return this;
    }

    public final void zzd(Object[] objectArray, int n3) {
        int n4;
        n3 = 2;
        zzgcm.zzb(objectArray, n3);
        int n7 = this.zzb + n3;
        this.zzf(n7);
        Object[] objectArray2 = this.zza;
        int n8 = this.zzb;
        System.arraycopy(objectArray, 0, objectArray2, n8, n3);
        this.zzb = n4 = this.zzb + n3;
    }
}

