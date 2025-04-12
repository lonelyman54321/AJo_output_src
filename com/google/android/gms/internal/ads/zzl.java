/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzl {
    public final int zza;

    public zzl(int n3, float f5) {
        this.zza = 0;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<zzl> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = zzl.class) == (clazz = object.getClass())) {
            object = (zzl)object;
            object = null;
            int n3 = Float.compare(0.0f, 0.0f);
            if (n3 == 0) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 16337;
    }
}

