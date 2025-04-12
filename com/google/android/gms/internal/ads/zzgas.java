/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgat;
import com.google.android.gms.internal.ads.zzgbu;
import com.google.android.gms.internal.ads.zzgbz;
import com.google.android.gms.internal.ads.zzgde;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class zzgas
extends zzgat
implements Map {
    public final void clear() {
        this.zzb().clear();
    }

    public boolean containsKey(Object object) {
        return this.zzb().containsKey(object);
    }

    public boolean containsValue(Object object) {
        return this.zzb().containsValue(object);
    }

    public Set entrySet() {
        return this.zzb().entrySet();
    }

    public boolean equals(Object object) {
        Map map2;
        boolean bl2;
        return object == this || (bl2 = ((Object)(map2 = this.zzb())).equals(object));
        {
        }
    }

    public Object get(Object object) {
        return this.zzb().get(object);
    }

    public int hashCode() {
        return ((Object)this.zzb()).hashCode();
    }

    public boolean isEmpty() {
        return this.zzb().isEmpty();
    }

    public Set keySet() {
        return this.zzb().keySet();
    }

    public final Object put(Object object, Object object2) {
        return this.zzb().put(object, object2);
    }

    public final void putAll(Map map2) {
        this.zzb().putAll(map2);
    }

    public final Object remove(Object object) {
        return this.zzb().remove(object);
    }

    public int size() {
        return this.zzb().size();
    }

    public final Collection values() {
        return this.zzb().values();
    }

    public abstract Map zzb();

    public final int zzc() {
        return zzgde.zza(this.entrySet());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean zzd(Object object) {
        Object e2;
        boolean bl2;
        Iterator iterator = this.entrySet().iterator();
        zzgbu zzgbu2 = new zzgbu(iterator);
        boolean bl3 = false;
        iterator = null;
        if (object == null) {
            do {
                boolean bl4;
                if (!(bl4 = zzgbu2.hasNext())) return bl3;
            } while ((object = zzgbu2.next()) != null);
            return true;
        }
        do {
            if (!(bl2 = zzgbu2.hasNext())) return bl3;
        } while (!(bl2 = object.equals(e2 = zzgbu2.next())));
        return true;
    }

    public final boolean zze(Object object) {
        return zzgbz.zzb(this, object);
    }
}

