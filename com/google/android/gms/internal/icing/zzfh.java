/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzfi;
import java.util.Iterator;

final class zzfh
implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzfi zzb;

    public zzfh(zzfi object) {
        this.zzb = object;
        this.zza = object = zzfi.zza((zzfi)object).iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

