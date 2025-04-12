/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzdn;

public final class zzdo
implements zzdn {
    private static final zzdo zza;
    private final Object zzb;

    static {
        zzdo zzdo2;
        zza = zzdo2 = new zzdo(null);
    }

    private zzdo(Object object) {
        this.zzb = object;
    }

    public static zzdn zzb(Object object) {
        if (object != null) {
            zzdo zzdo2 = new zzdo(object);
            return zzdo2;
        }
        object = new NullPointerException("instance cannot be null");
        throw object;
    }

    public final Object zza() {
        return this.zzb;
    }
}

