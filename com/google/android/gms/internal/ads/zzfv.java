/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;

public final class zzfv {
    public static final zzfv zza;
    public static final zzfv zzb;
    private final int zzc;
    private final int zzd;

    static {
        zzfv zzfv2;
        int n3 = -1;
        zza = zzfv2 = new zzfv(n3, n3);
        zzb = zzfv2 = new zzfv(0, 0);
    }

    public zzfv(int n3, int n4) {
        boolean bl2 = false;
        int n7 = -1;
        if (!(n3 != n7 && n3 < 0 || n4 != n7 && n4 < 0)) {
            bl2 = true;
        }
        zzeq.zzd(bl2);
        this.zzc = n3;
        this.zzd = n4;
    }

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof zzfv;
        if (n3 != 0) {
            int n4;
            object = (zzfv)object;
            n3 = this.zzc;
            int n7 = ((zzfv)object).zzc;
            if (n3 == n7 && (n3 = this.zzd) == (n4 = ((zzfv)object).zzd)) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zzc;
        int n4 = n3 << 16;
        int n7 = this.zzd;
        return ((n3 >>>= 16) | n4) ^ n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.zzc;
        stringBuilder.append(n3);
        stringBuilder.append("x");
        n3 = this.zzd;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzc;
    }
}

