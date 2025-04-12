/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcy;

final class zzdd
extends zzcy {
    private final Object zza;

    public zzdd(Object object) {
        this.zza = object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzdd;
        if (bl2) {
            object = (zzdd)object;
            Object object2 = this.zza;
            object = ((zzdd)object).zza;
            return object2.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String string2 = String.valueOf(this.zza);
        int n3 = string2.length() + 13;
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append("Optional.of(");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final boolean zza() {
        return true;
    }

    public final Object zzb() {
        return this.zza;
    }
}

