/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgdi;
import java.util.NoSuchElementException;

final class zzgbl
extends zzgdi {
    private Object zza;

    public zzgbl(Object object) {
        this.zza = object;
    }

    public final boolean hasNext() {
        Object object = this.zza;
        return object != this;
    }

    public final Object next() {
        Object object = this.zza;
        this.zza = this;
        if (object != this) {
            return object;
        }
        object = new NoSuchElementException();
        throw object;
    }
}

