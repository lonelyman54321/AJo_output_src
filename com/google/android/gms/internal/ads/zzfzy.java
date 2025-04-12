/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgca;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class zzfzy
implements zzgca {
    private transient Set zza;
    private transient Collection zzb;
    private transient Map zzc;

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block3: {
                block2: {
                    if (object != this) break block2;
                    bl2 = true;
                    break block3;
                }
                boolean bl3 = object instanceof zzgca;
                if (bl3) break block4;
                bl2 = false;
                object = null;
            }
            return bl2;
        }
        object = (zzgca)object;
        Map map2 = this.zzs();
        object = object.zzs();
        return ((Object)map2).equals(object);
    }

    public final int hashCode() {
        return ((Object)this.zzs()).hashCode();
    }

    public final String toString() {
        return this.zzs().toString();
    }

    public abstract Collection zzf();

    public Iterator zzg() {
        throw null;
    }

    public abstract Map zzj();

    public abstract Set zzl();

    public boolean zzq(Object object, Object object2) {
        throw null;
    }

    public final Collection zzr() {
        Collection collection = this.zzb;
        if (collection == null) {
            this.zzb = collection = this.zzf();
        }
        return collection;
    }

    public final Map zzs() {
        Map map2 = this.zzc;
        if (map2 == null) {
            this.zzc = map2 = this.zzj();
        }
        return map2;
    }

    public final Set zzt() {
        Set set = this.zza;
        if (set == null) {
            this.zza = set = this.zzl();
        }
        return set;
    }
}

