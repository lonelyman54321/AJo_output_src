/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhkg;
import java.util.Iterator;
import java.util.List;

final class zzhkf
implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhkg zzb;

    public zzhkf(zzhkg zzhkg2) {
        this.zzb = zzhkg2;
    }

    public final boolean hasNext() {
        Iterator iterator;
        int n3 = this.zza;
        List list = this.zzb.zza;
        int n4 = list.size();
        return n3 < n4 || (n3 = (int)((iterator = this.zzb.zzb).hasNext() ? 1 : 0)) != 0;
        {
        }
    }

    public final Object next() {
        int n3 = this.zza;
        List list = this.zzb.zza;
        int n4 = list.size();
        if (n3 < n4) {
            int n7;
            zzhkg zzhkg2 = this.zzb;
            n4 = this.zza;
            this.zza = n7 = n4 + 1;
            return zzhkg2.zza.get(n4);
        }
        zzhkg zzhkg3 = this.zzb;
        list = zzhkg3.zza;
        zzhkg3 = zzhkg3.zzb.next();
        list.add(zzhkg3);
        return this.next();
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

