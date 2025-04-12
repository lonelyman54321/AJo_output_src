/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfya;
import com.google.android.gms.internal.ads.zzgbu;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

final class zzgbx
extends AbstractCollection {
    final Map zza;

    public zzgbx(Map map2) {
        this.zza = map2;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object object) {
        return this.zza.containsValue(object);
    }

    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    public final Iterator iterator() {
        Iterator iterator = this.zza.entrySet().iterator();
        zzgbu zzgbu2 = new zzgbu(iterator);
        return zzgbu2;
    }

    public final boolean remove(Object object) {
        try {
            return super.remove(object);
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            boolean bl2;
            Iterator iterator = this.zza.entrySet().iterator();
            while (bl2 = iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                Object v4 = entry.getValue();
                boolean bl3 = zzfya.zza(object, v4);
                if (!bl3) continue;
                object = this.zza;
                iterator = entry.getKey();
                object.remove(iterator);
                return true;
            }
            return false;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean removeAll(Collection var1_1) {
        if (var1_1 != null) {
            return super.removeAll(var1_1);
        }
        var2_2 = null;
        try {
            throw null;
        }
        catch (UnsupportedOperationException v0) {
            ** continue;
        }
lbl7:
        // 1 sources

        while (true) {
            var2_2 = new HashSet<Map.Entry<K, V>>();
            var3_3 = this.zza.entrySet().iterator();
            while (var4_4 = var3_3.hasNext()) {
                var5_5 /* !! */  = var3_3.next();
                var6_6 = var5_5 /* !! */ .getValue();
                var7_7 = var1_1.contains(var6_6);
                if (!var7_7) continue;
                var5_5 /* !! */  = var5_5 /* !! */ .getKey();
                var2_2.add(var5_5 /* !! */ );
            }
            return this.zza.keySet().removeAll(var2_2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean retainAll(Collection var1_1) {
        if (var1_1 != null) {
            return super.retainAll(var1_1);
        }
        var2_2 = null;
        try {
            throw null;
        }
        catch (UnsupportedOperationException v0) {
            ** continue;
        }
lbl7:
        // 1 sources

        while (true) {
            var2_2 = new HashSet<Map.Entry<K, V>>();
            var3_3 = this.zza.entrySet().iterator();
            while (var4_4 = var3_3.hasNext()) {
                var5_5 /* !! */  = var3_3.next();
                var6_6 = var5_5 /* !! */ .getValue();
                var7_7 = var1_1.contains(var6_6);
                if (!var7_7) continue;
                var5_5 /* !! */  = var5_5 /* !! */ .getKey();
                var2_2.add(var5_5 /* !! */ );
            }
            return this.zza.keySet().retainAll(var2_2);
        }
    }

    public final int size() {
        return this.zza.size();
    }
}

