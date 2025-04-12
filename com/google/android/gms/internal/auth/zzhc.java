/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzhd;
import java.util.Iterator;

final class zzhc
implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzhd zzb;

    public zzhc(zzhd object) {
        this.zzb = object;
        this.zza = object = zzhd.zza((zzhd)object).iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

