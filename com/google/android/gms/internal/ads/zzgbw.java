/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgbt;
import com.google.android.gms.internal.ads.zzgdb;
import java.util.Iterator;
import java.util.Map;

class zzgbw
extends zzgdb {
    final Map zzd;

    public zzgbw(Map map2) {
        map2.getClass();
        this.zzd = map2;
    }

    public void clear() {
        this.zzd.clear();
    }

    public final boolean contains(Object object) {
        return this.zzd.containsKey(object);
    }

    public final boolean isEmpty() {
        return this.zzd.isEmpty();
    }

    public Iterator iterator() {
        Iterator iterator = this.zzd.entrySet().iterator();
        zzgbt zzgbt2 = new zzgbt(iterator);
        return zzgbt2;
    }

    public boolean remove(Object object) {
        boolean bl2 = this.contains(object);
        if (bl2) {
            this.zzd.remove(object);
            return true;
        }
        return false;
    }

    public final int size() {
        return this.zzd.size();
    }
}

