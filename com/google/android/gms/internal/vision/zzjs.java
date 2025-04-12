/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhj;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjl;
import com.google.android.gms.internal.vision.zzjv;
import com.google.android.gms.internal.vision.zzlz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzjs
extends zzhj
implements zzjv,
RandomAccess {
    private static final zzjs zza;
    private static final zzjv zzb;
    private final List zzc;

    static {
        zzjs zzjs2;
        zza = zzjs2 = new zzjs();
        zzjs2.zzb();
        zzb = zzjs2;
    }

    public zzjs() {
        this(10);
    }

    public zzjs(int n3) {
        ArrayList arrayList = new ArrayList(n3);
        this(arrayList);
    }

    private zzjs(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    private static String zza(Object object) {
        boolean bl2 = object instanceof String;
        if (bl2) {
            return (String)object;
        }
        bl2 = object instanceof zzht;
        if (bl2) {
            return ((zzht)object).zzb();
        }
        return zzjf.zzb((byte[])object);
    }

    public final /* synthetic */ void add(int n3, Object object) {
        object = (String)object;
        this.zzc();
        this.zzc.add(n3, object);
        this.modCount = n3 = this.modCount + 1;
    }

    public final boolean addAll(int n3, Collection collection) {
        int n4;
        this.zzc();
        boolean bl2 = collection instanceof zzjv;
        if (bl2) {
            collection = ((zzjv)collection).zzd();
        }
        n3 = (int)(this.zzc.addAll(n3, collection) ? 1 : 0);
        this.modCount = n4 = this.modCount + 1;
        return n3 != 0;
    }

    public final boolean addAll(Collection collection) {
        int n3 = this.size();
        return this.addAll(n3, collection);
    }

    public final void clear() {
        int n3;
        this.zzc();
        this.zzc.clear();
        this.modCount = n3 = this.modCount + 1;
    }

    public final /* synthetic */ Object get(int n3) {
        Object object = this.zzc.get(n3);
        boolean bl2 = object instanceof String;
        if (bl2) {
            return (String)object;
        }
        bl2 = object instanceof zzht;
        if (bl2) {
            object = (zzht)object;
            String string2 = ((zzht)object).zzb();
            boolean bl3 = ((zzht)object).zzc();
            if (bl3) {
                object = this.zzc;
                object.set(n3, string2);
            }
            return string2;
        }
        object = (byte[])object;
        String string3 = zzjf.zzb((byte[])object);
        boolean bl4 = zzjf.zza((byte[])object);
        if (bl4) {
            object = this.zzc;
            object.set(n3, string3);
        }
        return string3;
    }

    public final /* synthetic */ Object remove(int n3) {
        int n4;
        this.zzc();
        Object e2 = this.zzc.remove(n3);
        this.modCount = n4 = this.modCount + 1;
        return zzjs.zza(e2);
    }

    public final /* synthetic */ Object set(int n3, Object object) {
        object = (String)object;
        this.zzc();
        return zzjs.zza(this.zzc.set(n3, object));
    }

    public final int size() {
        return this.zzc.size();
    }

    public final /* synthetic */ zzjl zza(int n3) {
        int n4 = this.size();
        if (n3 >= n4) {
            ArrayList arrayList = new ArrayList(n3);
            List list = this.zzc;
            arrayList.addAll(list);
            list = new zzjs(arrayList);
            return list;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final void zza(zzht zzht2) {
        int n3;
        this.zzc();
        this.zzc.add(zzht2);
        this.modCount = n3 = this.modCount + 1;
    }

    public final Object zzb(int n3) {
        return this.zzc.get(n3);
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final zzjv zze() {
        boolean bl2 = this.zza();
        if (bl2) {
            zzlz zzlz2 = new zzlz(this);
            return zzlz2;
        }
        return this;
    }
}

