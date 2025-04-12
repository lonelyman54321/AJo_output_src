/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

final class zzwp {
    public final int zza;
    public final boolean zzb;

    public zzwp(int n3, boolean bl2) {
        this.zza = n3;
        this.zzb = bl2;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<zzwp> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = zzwp.class) == (clazz = object.getClass())) {
            int n3;
            object = (zzwp)object;
            int n4 = this.zza;
            int n7 = ((zzwp)object).zza;
            if (n4 == n7 && (n4 = (int)(this.zzb ? 1 : 0)) == (n3 = ((zzwp)object).zzb)) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zza * 31;
        int n4 = this.zzb;
        return n3 + n4;
    }
}

