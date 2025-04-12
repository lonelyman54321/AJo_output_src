/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzs;
import com.google.android.gms.internal.ads.zzfzt;
import com.google.android.gms.internal.ads.zzfzv;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class zzfzu
extends zzfzs
implements List {
    final /* synthetic */ zzfzv zzf;

    public zzfzu(zzfzv zzfzv2, Object object, List list, zzfzs zzfzs2) {
        this.zzf = zzfzv2;
        super(zzfzv2, object, list, zzfzs2);
    }

    public final void add(int n3, Object object) {
        this.zzb();
        Collection collection = this.zzb;
        boolean bl2 = collection.isEmpty();
        List list = (List)this.zzb;
        list.add(n3, object);
        zzfzv zzfzv2 = this.zzf;
        int n4 = zzfzv.zzd(zzfzv2) + 1;
        zzfzv.zzn(zzfzv2, n4);
        if (bl2) {
            this.zza();
        }
    }

    public final boolean addAll(int n3, Collection collection) {
        int n4 = collection.isEmpty();
        if (n4 != 0) {
            return false;
        }
        n4 = this.size();
        Object object = (List)this.zzb;
        if ((n3 = (int)(object.addAll(n3, collection) ? 1 : 0)) != 0) {
            collection = this.zzb;
            int n7 = collection.size();
            object = this.zzf;
            int n8 = zzfzv.zzd((zzfzv)object) + (n7 -= n4);
            zzfzv.zzn((zzfzv)object, n8);
            if (n4 == 0) {
                this.zza();
                n3 = 1;
            }
        }
        return n3 != 0;
    }

    public final Object get(int n3) {
        this.zzb();
        return ((List)this.zzb).get(n3);
    }

    public final int indexOf(Object object) {
        this.zzb();
        return ((List)this.zzb).indexOf(object);
    }

    public final int lastIndexOf(Object object) {
        this.zzb();
        return ((List)this.zzb).lastIndexOf(object);
    }

    public final ListIterator listIterator() {
        this.zzb();
        zzfzt zzfzt2 = new zzfzt(this);
        return zzfzt2;
    }

    public final ListIterator listIterator(int n3) {
        this.zzb();
        zzfzt zzfzt2 = new zzfzt(this, n3);
        return zzfzt2;
    }

    public final Object remove(int n3) {
        this.zzb();
        Object e2 = ((List)this.zzb).remove(n3);
        zzfzv zzfzv2 = this.zzf;
        int n4 = zzfzv.zzd(zzfzv2) + -1;
        zzfzv.zzn(zzfzv2, n4);
        this.zzc();
        return e2;
    }

    public final Object set(int n3, Object object) {
        this.zzb();
        return ((List)this.zzb).set(n3, object);
    }

    public final List subList(int n3, int n4) {
        this.zzb();
        Object object = (List)this.zzb;
        List list = object.subList(n3, n4);
        zzfzs zzfzs2 = this.zzc;
        if (zzfzs2 == null) {
            zzfzs2 = this;
        }
        object = this.zza;
        return this.zzf.zzh(object, list, zzfzs2);
    }
}

