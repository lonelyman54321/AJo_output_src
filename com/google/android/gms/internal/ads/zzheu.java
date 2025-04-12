/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhev;
import java.util.Iterator;

final class zzheu
implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzhev zzb;

    public zzheu(zzhev object) {
        this.zzb = object;
        this.zza = object = zzhev.zza((zzhev)object).iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

