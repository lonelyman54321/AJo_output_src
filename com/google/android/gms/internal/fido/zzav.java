/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.fido.zzaz;
import java.util.NoSuchElementException;

final class zzav
extends zzaz {
    boolean zza;
    final /* synthetic */ Object zzb;

    public zzav(Object object) {
        this.zzb = object;
    }

    public final boolean hasNext() {
        boolean bl2 = this.zza;
        return !bl2;
    }

    public final Object next() {
        boolean bl2 = this.zza;
        if (!bl2) {
            this.zza = true;
            return this.zzb;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

