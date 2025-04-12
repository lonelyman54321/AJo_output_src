/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzav;
import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzcn;
import com.google.android.gms.internal.clearcut.zzcx;
import com.google.android.gms.internal.clearcut.zzfa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzcw
extends zzav
implements zzcx,
RandomAccess {
    private static final zzcw zzlq;
    private static final zzcx zzlr;
    private final List zzls;

    static {
        zzcw zzcw2;
        zzlq = zzcw2 = new zzcw();
        zzcw2.zzv();
        zzlr = zzcw2;
    }

    public zzcw() {
        this(10);
    }

    public zzcw(int n3) {
        ArrayList arrayList = new ArrayList(n3);
        this(arrayList);
    }

    private zzcw(ArrayList arrayList) {
        this.zzls = arrayList;
    }

    private static String zze(Object object) {
        boolean bl2 = object instanceof String;
        if (bl2) {
            return (String)object;
        }
        bl2 = object instanceof zzbb;
        if (bl2) {
            return ((zzbb)object).zzz();
        }
        return zzci.zzf((byte[])object);
    }

    public final /* synthetic */ void add(int n3, Object object) {
        object = (String)object;
        this.zzw();
        this.zzls.add(n3, object);
        this.modCount = n3 = this.modCount + 1;
    }

    public final boolean addAll(int n3, Collection collection) {
        int n4;
        this.zzw();
        boolean bl2 = collection instanceof zzcx;
        if (bl2) {
            collection = ((zzcx)collection).zzbt();
        }
        n3 = (int)(this.zzls.addAll(n3, collection) ? 1 : 0);
        this.modCount = n4 = this.modCount + 1;
        return n3 != 0;
    }

    public final boolean addAll(Collection collection) {
        int n3 = this.size();
        return this.addAll(n3, collection);
    }

    public final void clear() {
        int n3;
        this.zzw();
        this.zzls.clear();
        this.modCount = n3 = this.modCount + 1;
    }

    public final /* synthetic */ Object get(int n3) {
        Object object = this.zzls.get(n3);
        boolean bl2 = object instanceof String;
        if (bl2) {
            return (String)object;
        }
        bl2 = object instanceof zzbb;
        if (bl2) {
            object = (zzbb)object;
            String string2 = ((zzbb)object).zzz();
            boolean bl3 = ((zzbb)object).zzaa();
            if (bl3) {
                object = this.zzls;
                object.set(n3, string2);
            }
            return string2;
        }
        object = (byte[])object;
        String string3 = zzci.zzf((byte[])object);
        boolean bl4 = zzci.zze((byte[])object);
        if (bl4) {
            object = this.zzls;
            object.set(n3, string3);
        }
        return string3;
    }

    public final Object getRaw(int n3) {
        return this.zzls.get(n3);
    }

    public final /* synthetic */ Object remove(int n3) {
        int n4;
        this.zzw();
        Object e2 = this.zzls.remove(n3);
        this.modCount = n4 = this.modCount + 1;
        return zzcw.zze(e2);
    }

    public final /* synthetic */ Object set(int n3, Object object) {
        object = (String)object;
        this.zzw();
        return zzcw.zze(this.zzls.set(n3, object));
    }

    public final int size() {
        return this.zzls.size();
    }

    public final List zzbt() {
        return Collections.unmodifiableList(this.zzls);
    }

    public final zzcx zzbu() {
        boolean bl2 = this.zzu();
        if (bl2) {
            zzfa zzfa2 = new zzfa(this);
            return zzfa2;
        }
        return this;
    }

    public final /* synthetic */ zzcn zzi(int n3) {
        int n4 = this.size();
        if (n3 >= n4) {
            ArrayList arrayList = new ArrayList(n3);
            List list = this.zzls;
            arrayList.addAll(list);
            list = new zzcw(arrayList);
            return list;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }
}

