/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzlz;
import java.util.Iterator;

final class zzmb
implements Iterator {
    private Iterator zza;
    private final /* synthetic */ zzlz zzb;

    public zzmb(zzlz object) {
        this.zzb = object;
        this.zza = object = zzlz.zza((zzlz)object).iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String)this.zza.next();
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

