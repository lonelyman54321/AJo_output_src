/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzmj;
import com.google.android.gms.internal.measurement.zzmm;
import com.google.android.gms.internal.measurement.zzmo;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class zzmp
extends AbstractSet {
    private final /* synthetic */ zzmj zza;

    private zzmp(zzmj zzmj2) {
        this.zza = zzmj2;
    }

    public /* synthetic */ zzmp(zzmj zzmj2, zzmo zzmo2) {
        this(zzmj2);
    }

    public /* synthetic */ boolean add(Object object) {
        boolean bl2 = this.contains(object = (Map.Entry)object);
        if (!bl2) {
            zzmj zzmj2 = this.zza;
            Comparable comparable = (Comparable)object.getKey();
            object = object.getValue();
            zzmj2.zza(comparable, object);
            return true;
        }
        return false;
    }

    public void clear() {
        this.zza.clear();
    }

    public boolean contains(Object object) {
        boolean bl2;
        object = (Map.Entry)object;
        Object object2 = this.zza;
        Object k2 = object.getKey();
        return (object2 = ((zzmj)object2).get(k2)) == (object = object.getValue()) || object2 != null && (bl2 = object2.equals(object));
        {
        }
    }

    public Iterator iterator() {
        zzmj zzmj2 = this.zza;
        zzmm zzmm2 = new zzmm(zzmj2, null);
        return zzmm2;
    }

    public boolean remove(Object object) {
        boolean bl2 = this.contains(object = (Map.Entry)object);
        if (bl2) {
            zzmj zzmj2 = this.zza;
            object = object.getKey();
            zzmj2.remove(object);
            return true;
        }
        return false;
    }

    public int size() {
        return this.zza.size();
    }
}

