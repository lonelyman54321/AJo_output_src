/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzei;
import com.google.android.gms.internal.clearcut.zzej;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzeq
implements Iterator {
    private int pos = -1;
    private Iterator zzor;
    private final /* synthetic */ zzei zzos;
    private boolean zzow;

    private zzeq(zzei zzei2) {
        this.zzos = zzei2;
    }

    public /* synthetic */ zzeq(zzei zzei2, zzej zzej2) {
        this(zzei2);
    }

    private final Iterator zzdw() {
        Iterator iterator = this.zzor;
        if (iterator == null) {
            this.zzor = iterator = zzei.zzc(this.zzos).entrySet().iterator();
        }
        return this.zzor;
    }

    public final boolean hasNext() {
        Object object;
        int n3 = this.pos;
        int n4 = 1;
        List list = zzei.zzb(this.zzos);
        int n7 = list.size();
        if ((n3 += n4) >= n7 && ((n3 = (int)((object = zzei.zzc(this.zzos)).isEmpty() ? 1 : 0)) != 0 || (n3 = (int)((object = this.zzdw()).hasNext() ? 1 : 0)) == 0)) {
            return false;
        }
        return n4 != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ Object next() {
        void var3_6;
        int n3;
        int n4 = 1;
        this.zzow = n4;
        this.pos = n3 = this.pos + n4;
        List list = zzei.zzb(this.zzos);
        n4 = list.size();
        if (n3 < n4) {
            List list2 = zzei.zzb(this.zzos);
            n3 = this.pos;
            Object e2 = list2.get(n3);
            return (Map.Entry)var3_6;
        }
        Object e5 = this.zzdw().next();
        return (Map.Entry)var3_6;
    }

    public final void remove() {
        int n3 = this.zzow;
        if (n3 != 0) {
            this.zzow = false;
            zzei zzei2 = this.zzos;
            zzei.zza(zzei2);
            n3 = this.pos;
            List list = zzei.zzb(this.zzos);
            int n4 = list.size();
            if (n3 < n4) {
                int n7;
                zzei2 = this.zzos;
                n4 = this.pos;
                this.pos = n7 = n4 + -1;
                zzei.zza(zzei2, n4);
                return;
            }
            this.zzdw().remove();
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("remove() was called before next()");
        throw illegalStateException;
    }
}

