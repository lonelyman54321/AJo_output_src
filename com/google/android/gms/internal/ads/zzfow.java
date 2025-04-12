/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfqd;

public final class zzfow {
    private final String zza;
    private final String zzb;

    private zzfow(String string2, String string3) {
        this.zza = string2;
        this.zzb = string3;
    }

    public static zzfow zza(String string2, String string3) {
        zzfqd.zzb(string2, "Name is null or empty");
        zzfqd.zzb(string3, "Version is null or empty");
        zzfow zzfow2 = new zzfow(string2, string3);
        return zzfow2;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}

