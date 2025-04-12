/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common;

import com.google.android.gms.common.PackageVerificationResult;

final class zzab {
    private final String zza;
    private final PackageVerificationResult zzb;

    public zzab(String string2, PackageVerificationResult packageVerificationResult) {
        this.zza = string2;
        this.zzb = packageVerificationResult;
    }

    public static /* bridge */ /* synthetic */ PackageVerificationResult zza(zzab zzab2) {
        return zzab2.zzb;
    }

    public static /* bridge */ /* synthetic */ String zzb(zzab zzab2) {
        return zzab2.zza;
    }
}

