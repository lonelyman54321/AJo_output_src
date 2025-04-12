/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzfzf;
import com.google.android.gms.internal.ads.zzfzi;
import com.google.android.gms.internal.ads.zzfzl;
import com.google.android.gms.internal.ads.zzfzm;
import com.google.android.gms.internal.ads.zzfzn;
import com.google.android.gms.internal.ads.zzfzo;
import com.google.android.gms.internal.ads.zzfzp;
import com.google.android.gms.internal.ads.zzfzq;
import com.google.android.gms.internal.ads.zzfzs;
import com.google.android.gms.internal.ads.zzfzu;
import com.google.android.gms.internal.ads.zzfzx;
import com.google.android.gms.internal.ads.zzfzy;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

abstract class zzfzv
extends zzfzy
implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzfzv(Map map2) {
        zzfyg.zze(map2.isEmpty());
        this.zza = map2;
    }

    public static /* bridge */ /* synthetic */ int zzd(zzfzv zzfzv2) {
        return zzfzv2.zzb;
    }

    public static /* bridge */ /* synthetic */ Map zzi(zzfzv zzfzv2) {
        return zzfzv2.zza;
    }

    public static /* bridge */ /* synthetic */ void zzn(zzfzv zzfzv2, int n3) {
        zzfzv2.zzb = n3;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzfzv zzfzv2, Object object) {
        int n3;
        Map map2 = zzfzv2.zza;
        try {
            object = map2.remove(object);
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            n3 = 0;
            object = null;
        }
        object = (Collection)object;
        if (object != null) {
            int n4 = object.size();
            object.clear();
            zzfzv2.zzb = n3 = zzfzv2.zzb - n4;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Collection collection) {
        throw null;
    }

    public Collection zzc(Object object, Collection collection) {
        throw null;
    }

    public final int zze() {
        return this.zzb;
    }

    public final Collection zzf() {
        zzfzx zzfzx2 = new zzfzx(this);
        return zzfzx2;
    }

    public final Iterator zzg() {
        zzfzf zzfzf2 = new zzfzf(this);
        return zzfzf2;
    }

    public final List zzh(Object object, List list, zzfzs zzfzs2) {
        boolean bl2 = list instanceof RandomAccess;
        zzfzu zzfzu2 = bl2 ? new zzfzo(this, object, list, zzfzs2) : new zzfzu(this, object, list, zzfzs2);
        return zzfzu2;
    }

    public Map zzj() {
        throw null;
    }

    public final Map zzk() {
        Map map2 = this.zza;
        boolean bl2 = map2 instanceof NavigableMap;
        if (bl2) {
            map2 = (NavigableMap)map2;
            zzfzm zzfzm2 = new zzfzm(this, (NavigableMap)map2);
            return zzfzm2;
        }
        bl2 = map2 instanceof SortedMap;
        if (bl2) {
            map2 = (SortedMap)map2;
            zzfzp zzfzp2 = new zzfzp(this, (SortedMap)map2);
            return zzfzp2;
        }
        zzfzi zzfzi2 = new zzfzi(this, map2);
        return zzfzi2;
    }

    public Set zzl() {
        throw null;
    }

    public final Set zzm() {
        Map map2 = this.zza;
        boolean bl2 = map2 instanceof NavigableMap;
        if (bl2) {
            map2 = (NavigableMap)map2;
            zzfzn zzfzn2 = new zzfzn(this, (NavigableMap)map2);
            return zzfzn2;
        }
        bl2 = map2 instanceof SortedMap;
        if (bl2) {
            map2 = (SortedMap)map2;
            zzfzq zzfzq2 = new zzfzq(this, (SortedMap)map2);
            return zzfzq2;
        }
        zzfzl zzfzl2 = new zzfzl(this, map2);
        return zzfzl2;
    }

    public final void zzp() {
        boolean bl2;
        Iterator iterator = this.zza.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Collection collection = (Collection)iterator.next();
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    public final boolean zzq(Object object, Object object2) {
        Collection collection = (Collection)this.zza.get(object);
        int n3 = 1;
        if (collection == null) {
            collection = this.zza();
            int n4 = collection.add(object2);
            if (n4 != 0) {
                this.zzb = n4 = this.zzb + n3;
                this.zza.put(object, collection);
                return n3 != 0;
            }
            object = new AssertionError((Object)"New Collection violated the Collection spec");
            throw object;
        }
        int n7 = collection.add(object2);
        if (n7 != 0) {
            this.zzb = n7 = this.zzb + n3;
            return n3 != 0;
        }
        return false;
    }
}

