/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzav;
import com.google.android.gms.internal.clearcut.zzcn;
import java.util.ArrayList;
import java.util.List;

final class zzeb
extends zzav {
    private static final zzeb zznf;
    private final List zzls;

    static {
        zzeb zzeb2;
        zznf = zzeb2 = new zzeb();
        zzeb2.zzv();
    }

    public zzeb() {
        ArrayList arrayList = new ArrayList(10);
        this(arrayList);
    }

    private zzeb(List list) {
        this.zzls = list;
    }

    public static zzeb zzcn() {
        return zznf;
    }

    public final void add(int n3, Object object) {
        this.zzw();
        this.zzls.add(n3, object);
        this.modCount = n3 = this.modCount + 1;
    }

    public final Object get(int n3) {
        return this.zzls.get(n3);
    }

    public final Object remove(int n3) {
        int n4;
        this.zzw();
        Object e2 = this.zzls.remove(n3);
        this.modCount = n4 = this.modCount + 1;
        return e2;
    }

    public final Object set(int n3, Object object) {
        int n4;
        this.zzw();
        Object object2 = this.zzls.set(n3, object);
        this.modCount = n4 = this.modCount + 1;
        return object2;
    }

    public final int size() {
        return this.zzls.size();
    }

    public final /* synthetic */ zzcn zzi(int n3) {
        int n4 = this.size();
        if (n3 >= n4) {
            ArrayList arrayList = new ArrayList(n3);
            List list = this.zzls;
            arrayList.addAll(list);
            list = new zzeb(arrayList);
            return list;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }
}

