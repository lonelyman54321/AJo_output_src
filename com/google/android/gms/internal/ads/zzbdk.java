/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.io.InputStream;

public final class zzbdk {
    private final InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbdk(InputStream inputStream, boolean bl2, boolean bl3, long l2, boolean bl4) {
        this.zza = inputStream;
        this.zzb = bl2;
        this.zzc = bl3;
        this.zzd = l2;
        this.zze = bl4;
    }

    public static zzbdk zzb(InputStream inputStream, boolean bl2, boolean bl3, long l2, boolean bl4) {
        zzbdk zzbdk2 = new zzbdk(inputStream, bl2, bl3, l2, bl4);
        return zzbdk2;
    }

    public final long zza() {
        return this.zzd;
    }

    public final InputStream zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    public final boolean zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return this.zzc;
    }
}

