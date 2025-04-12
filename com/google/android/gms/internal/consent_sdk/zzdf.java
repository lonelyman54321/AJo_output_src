/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzdj;
import java.util.NoSuchElementException;

final class zzdf
extends zzdj {
    private static final Object zza;
    private Object zzb;

    static {
        Object object;
        zza = object = new Object();
    }

    public zzdf(Object object) {
        this.zzb = object;
    }

    public final boolean hasNext() {
        Object object = this.zzb;
        Object object2 = zza;
        return object != object2;
    }

    public final Object next() {
        Object object = this.zzb;
        Object object2 = zza;
        if (object != object2) {
            this.zzb = object2;
            return object;
        }
        object = new NoSuchElementException();
        throw object;
    }
}

