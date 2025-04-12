/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfya;
import com.google.android.gms.internal.ads.zzfzz;
import com.google.android.gms.internal.ads.zzgbz;
import com.google.android.gms.internal.ads.zzgdb;
import com.google.android.gms.internal.ads.zzgde;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class zzgbv
extends zzgdb {
    public final void clear() {
        this.zza().clear();
    }

    public boolean contains(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        boolean bl3 = false;
        if (bl2) {
            object = (Map.Entry)object;
            Object k2 = object.getKey();
            Object object2 = zzgbz.zza(this.zza(), k2);
            boolean bl4 = zzfya.zza(object2, object = object.getValue());
            if (bl4) {
                bl4 = true;
                if (object2 == null) {
                    object2 = this.zza();
                    bl2 = object2.containsKey(k2);
                    if (bl2) {
                        return bl4;
                    }
                } else {
                    bl3 = true;
                }
            }
        }
        return bl3;
    }

    public final boolean isEmpty() {
        return this.zza().isEmpty();
    }

    public boolean remove(Object object) {
        boolean bl2 = this.contains(object);
        if (bl2 && (bl2 = object instanceof Map.Entry)) {
            object = (Map.Entry)object;
            Set set = this.zza().keySet();
            object = object.getKey();
            return set.remove(object);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean removeAll(Collection iterator) {
        if (iterator == null) throw null;
        try {
            return zzgde.zze(this, iterator);
        }
        catch (UnsupportedOperationException unsupportedOperationException) {}
        iterator = iterator.iterator();
        return zzgde.zzf(this, iterator);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean retainAll(Collection object) {
        Object e2;
        int n3;
        if (object != null) {
            try {
                return super.retainAll((Collection)object);
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
            }
        } else {
            n3 = 0;
            e2 = null;
            {
                throw null;
            }
        }
        n3 = object.size();
        int n4 = 3;
        if (n3 < n4) {
            String string2 = "expectedSize";
            zzfzz.zza(n3, string2);
            ++n3;
        } else {
            n4 = 0x40000000;
            if (n3 < n4) {
                double d2 = n3;
                double d5 = 0.75;
                d2 = Math.ceil(d2 / d5);
                n3 = (int)d2;
            } else {
                n3 = -1 >>> 1;
            }
        }
        HashSet<Object> hashSet = new HashSet<Object>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            e2 = object.next();
            n4 = (int)(this.contains(e2) ? 1 : 0);
            if (n4 == 0 || (n4 = e2 instanceof Map.Entry) == 0) continue;
            e2 = ((Map.Entry)e2).getKey();
            hashSet.add(e2);
        }
        return this.zza().keySet().retainAll(hashSet);
    }

    public final int size() {
        return this.zza().size();
    }

    public abstract Map zza();
}

