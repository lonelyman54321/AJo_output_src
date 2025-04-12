/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdh;

final class zzdi
extends zzdh {
    private final Object zza;

    public zzdi(Object object) {
        this.zza = object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzdi;
        if (bl2) {
            object = (zzdi)object;
            Object object2 = this.zza;
            object = ((zzdi)object).zza;
            return object2.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Optional.of(");
        Object object = this.zza;
        return fK.a(stringBuilder, object, ")");
    }

    public final Object zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return true;
    }
}

