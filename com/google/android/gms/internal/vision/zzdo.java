/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzen;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

abstract class zzdo
implements zzen {
    private transient Map zza;

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        boolean bl2 = object instanceof zzen;
        if (bl2) {
            object = (zzen)object;
            Map map2 = this.zza();
            object = object.zza();
            return map2.equals(object);
        }
        return false;
    }

    public int hashCode() {
        return this.zza().hashCode();
    }

    public String toString() {
        return this.zza().toString();
    }

    public Map zza() {
        Map map2 = this.zza;
        if (map2 == null) {
            this.zza = map2 = this.zzb();
        }
        return map2;
    }

    public boolean zza(Object object) {
        boolean bl2;
        Iterator iterator = this.zza().values().iterator();
        while (bl2 = iterator.hasNext()) {
            Collection collection = (Collection)iterator.next();
            bl2 = collection.contains(object);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public abstract Map zzb();
}

