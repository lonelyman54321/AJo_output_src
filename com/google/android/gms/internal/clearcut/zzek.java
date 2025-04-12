/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzei;
import com.google.android.gms.internal.clearcut.zzej;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzek
implements Iterator {
    private int pos;
    private Iterator zzor;
    private final /* synthetic */ zzei zzos;

    private zzek(zzei zzei2) {
        int n3;
        this.zzos = zzei2;
        this.pos = n3 = zzei.zzb(zzei2).size();
    }

    public /* synthetic */ zzek(zzei zzei2, zzej zzej2) {
        this(zzei2);
    }

    private final Iterator zzdw() {
        Iterator iterator = this.zzor;
        if (iterator == null) {
            this.zzor = iterator = zzei.zzd(this.zzos).entrySet().iterator();
        }
        return this.zzor;
    }

    public final boolean hasNext() {
        Iterator iterator;
        List list;
        int n3;
        int n4 = this.pos;
        return n4 > 0 && n4 <= (n3 = (list = zzei.zzb(this.zzos)).size()) || (n4 = (int)((iterator = this.zzdw()).hasNext() ? 1 : 0)) != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ Object next() {
        int n3;
        Object object = this.zzdw();
        boolean bl2 = object.hasNext();
        if (bl2) {
            object = this.zzdw().next();
            return (Map.Entry)object;
        }
        object = zzei.zzb(this.zzos);
        this.pos = n3 = this.pos + -1;
        object = object.get(n3);
        return (Map.Entry)object;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

