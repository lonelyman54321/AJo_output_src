/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzz;
import com.google.android.gms.internal.ads.zzgaw;
import com.google.android.gms.internal.ads.zzgbd;
import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzgct;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public final class zzgbe {
    Object[] zza;
    int zzb;
    zzgbd zzc;

    public zzgbe() {
        this(4);
    }

    public zzgbe(int n3) {
        Object[] objectArray = new Object[n3 + n3];
        this.zza = objectArray;
        this.zzb = 0;
    }

    private final void zzd(int n3) {
        Object[] objectArray = this.zza;
        int n4 = objectArray.length;
        if ((n3 += n3) > n4) {
            n3 = zzgaw.zze(n4, n3);
            Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
            this.zza = objectArray2;
        }
    }

    public final zzgbe zza(Object object, Object object2) {
        int n3 = this.zzb + 1;
        this.zzd(n3);
        zzfzz.zzb(object, object2);
        Object[] objectArray = this.zza;
        int n4 = this.zzb;
        int n7 = n4 + n4;
        objectArray[n7] = object;
        objectArray[++n7] = object2;
        this.zzb = ++n4;
        return this;
    }

    public final zzgbe zzb(Iterable object) {
        int n3 = object instanceof Collection;
        if (n3 != 0) {
            n3 = this.zzb;
            int n4 = ((Collection)object).size() + n3;
            this.zzd(n4);
        }
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Map.Entry entry = (Map.Entry)object.next();
            Object k2 = entry.getKey();
            entry = entry.getValue();
            this.zza(k2, entry);
        }
        return this;
    }

    public final zzgbf zzc() {
        Object object = this.zzc;
        if (object == null) {
            int n3 = this.zzb;
            Object object2 = this.zza;
            object = zzgct.zzj(n3, (Object[])object2, this);
            object2 = this.zzc;
            if (object2 == null) {
                return object;
            }
            throw ((zzgbd)object2).zza();
        }
        throw ((zzgbd)object).zza();
    }
}

