/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzqv;
import java.util.Iterator;

final class zzqu
implements Iterator {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ Iterator zzb;

    public zzqu(zzqv zzqv2, Iterator iterator, Iterator iterator2) {
        this.zza = iterator;
        this.zzb = iterator2;
    }

    public final boolean hasNext() {
        Iterator iterator = this.zza;
        boolean bl2 = iterator.hasNext();
        return bl2 || (bl2 = (iterator = this.zzb).hasNext());
        {
        }
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

