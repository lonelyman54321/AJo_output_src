/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzbg;
import java.util.Iterator;

final class zzbj
implements Iterator {
    private Iterator zza;
    private final /* synthetic */ zzbg zzb;

    public zzbj(zzbg object) {
        this.zzb = object;
        this.zza = object = zzbg.zza((zzbg)object).keySet().iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String)this.zza.next();
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Remove not supported");
        throw unsupportedOperationException;
    }
}

