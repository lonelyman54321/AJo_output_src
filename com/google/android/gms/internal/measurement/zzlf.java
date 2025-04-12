/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzln;

final class zzlf
implements zzln {
    private zzln[] zza;

    public zzlf(zzln ... zzlnArray) {
        this.zza = zzlnArray;
    }

    public final zzlk zza(Class object) {
        for (zzln zzln2 : this.zza) {
            boolean bl2 = zzln2.zzb((Class)object);
            if (!bl2) continue;
            return zzln2.zza((Class)object);
        }
        object = ((Class)object).getName();
        object = "No factory is available for message type: ".concat((String)object);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException((String)object);
        throw unsupportedOperationException;
    }

    public final boolean zzb(Class clazz) {
        for (zzln zzln2 : this.zza) {
            boolean bl2 = zzln2.zzb(clazz);
            if (!bl2) continue;
            return true;
        }
        return false;
    }
}

