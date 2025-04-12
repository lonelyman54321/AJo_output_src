/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzfvd {
    private final String zza;
    private final long zzb;

    public zzfvd() {
        this.zza = null;
        this.zzb = -1;
    }

    public zzfvd(String string2, long l2) {
        this.zza = string2;
        this.zzb = l2;
    }

    public final long zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        long l2;
        long l3;
        long l4;
        long l7;
        String string2 = this.zza;
        return string2 != null && (l7 = (l4 = (l3 = this.zzb) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) >= 0;
    }
}

