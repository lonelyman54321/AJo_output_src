/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzua;
import java.util.NoSuchElementException;

final class zztq
extends zzua {
    private final Object zza;
    private boolean zzb;

    public zztq(Object object) {
        this.zza = object;
    }

    public final boolean hasNext() {
        boolean bl2 = this.zzb;
        return !bl2;
    }

    public final Object next() {
        boolean bl2 = this.zzb;
        if (!bl2) {
            this.zzb = true;
            return this.zza;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

