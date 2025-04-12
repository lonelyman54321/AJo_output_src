/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgbw;
import com.google.android.gms.internal.ads.zzgbx;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

abstract class zzgby
extends AbstractMap {
    private transient Set zza;
    private transient Set zzb;
    private transient Collection zzc;

    public final Set entrySet() {
        Set set = this.zza;
        if (set == null) {
            this.zza = set = this.zzb();
        }
        return set;
    }

    public Set keySet() {
        Set set = this.zzb;
        if (set == null) {
            this.zzb = set = this.zze();
        }
        return set;
    }

    public final Collection values() {
        Collection collection = this.zzc;
        if (collection == null) {
            this.zzc = collection = new zzgbx(this);
        }
        return collection;
    }

    public abstract Set zzb();

    public Set zze() {
        zzgbw zzgbw2 = new zzgbw(this);
        return zzgbw2;
    }
}

