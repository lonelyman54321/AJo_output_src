/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzxw {
    public final long zza;
    public final long zzb;

    public zzxw(long l2, long l3) {
        this.zza = l2;
        this.zzb = l3;
    }

    public final boolean equals(Object object) {
        long l2;
        long l3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof zzxw;
        if (!object2) {
            return false;
        }
        object = (zzxw)object;
        long l4 = this.zza;
        long l7 = ((zzxw)object).zza;
        long l8 = l4 - l7;
        object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (!object2 && (l3 = (l2 = (l4 = this.zzb) - (l7 = ((zzxw)object).zzb)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = (int)this.zza;
        long l2 = this.zzb;
        int n4 = (int)l2;
        return (n3 *= 31) + n4;
    }
}

