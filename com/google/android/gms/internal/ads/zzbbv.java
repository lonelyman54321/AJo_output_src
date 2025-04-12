/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzbbv {
    final long zza;
    final String zzb;
    final int zzc;

    public zzbbv(long l2, String string2, int n3) {
        this.zza = l2;
        this.zzb = string2;
        this.zzc = n3;
    }

    public final boolean equals(Object object) {
        int n3;
        if (object != null && (n3 = object instanceof zzbbv) != 0) {
            int n4;
            object = (zzbbv)object;
            long l2 = ((zzbbv)object).zza;
            long l3 = this.zza;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false && (n4 = ((zzbbv)object).zzc) == (n3 = this.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int)this.zza;
    }
}

