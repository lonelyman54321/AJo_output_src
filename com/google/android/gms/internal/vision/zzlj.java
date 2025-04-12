/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzlg;
import com.google.android.gms.internal.vision.zzlh;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzlj
implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzlh zzc;

    private zzlj(zzlh zzlh2) {
        int n3;
        this.zzc = zzlh2;
        this.zza = n3 = zzlh.zzb(zzlh2).size();
    }

    public /* synthetic */ zzlj(zzlh zzlh2, zzlg zzlg2) {
        this(zzlh2);
    }

    private final Iterator zza() {
        Iterator iterator = this.zzb;
        if (iterator == null) {
            this.zzb = iterator = zzlh.zzd(this.zzc).entrySet().iterator();
        }
        return this.zzb;
    }

    public final boolean hasNext() {
        Iterator iterator;
        List list;
        int n3;
        int n4 = this.zza;
        return n4 > 0 && n4 <= (n3 = (list = zzlh.zzb(this.zzc)).size()) || (n4 = (int)((iterator = this.zza()).hasNext() ? 1 : 0)) != 0;
    }

    public final /* synthetic */ Object next() {
        int n3;
        Object object = this.zza();
        boolean bl2 = object.hasNext();
        if (bl2) {
            return (Map.Entry)this.zza().next();
        }
        object = zzlh.zzb(this.zzc);
        this.zza = n3 = this.zza + -1;
        return (Map.Entry)object.get(n3);
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

