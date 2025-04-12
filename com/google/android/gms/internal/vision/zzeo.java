/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfa;
import java.util.NoSuchElementException;

final class zzeo
extends zzfa {
    private boolean zza;
    private final /* synthetic */ Object zzb;

    public zzeo(Object object) {
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

