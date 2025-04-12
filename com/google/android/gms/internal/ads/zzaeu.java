/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzaeu {
    public static final zzaeu zza;
    public final long zzb;
    public final long zzc;

    static {
        zzaeu zzaeu2;
        long l2 = 0L;
        zza = zzaeu2 = new zzaeu(l2, l2);
    }

    public zzaeu(long l2, long l3) {
        this.zzb = l2;
        this.zzc = l3;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<zzaeu> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = zzaeu.class) == (clazz = object.getClass())) {
            long l2;
            long l3;
            object = (zzaeu)object;
            long l4 = this.zzb;
            long l7 = ((zzaeu)object).zzb;
            long l8 = l4 - l7;
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 == false && (l3 = (l2 = (l4 = this.zzc) - (l7 = ((zzaeu)object).zzc)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = (int)this.zzb;
        long l2 = this.zzc;
        int n4 = (int)l2;
        return (n3 *= 31) + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[timeUs=");
        long l2 = this.zzb;
        stringBuilder.append(l2);
        stringBuilder.append(", position=");
        l2 = this.zzc;
        return jl0_0.b(stringBuilder, l2, "]");
    }
}

