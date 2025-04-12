/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzqa;

public final class zzpy {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public static /* bridge */ /* synthetic */ boolean zze(zzpy zzpy2) {
        return zzpy2.zza;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(zzpy zzpy2) {
        return zzpy2.zzb;
    }

    public static /* bridge */ /* synthetic */ boolean zzg(zzpy zzpy2) {
        return zzpy2.zzc;
    }

    public final zzpy zza(boolean bl2) {
        this.zza = true;
        return this;
    }

    public final zzpy zzb(boolean bl2) {
        this.zzb = bl2;
        return this;
    }

    public final zzpy zzc(boolean bl2) {
        this.zzc = bl2;
        return this;
    }

    public final zzqa zzd() {
        boolean bl2 = this.zza;
        if (!bl2 && ((bl2 = this.zzb) || (bl2 = this.zzc))) {
            IllegalStateException illegalStateException = new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
            throw illegalStateException;
        }
        zzqa zzqa2 = new zzqa(this, null);
        return zzqa2;
    }
}

