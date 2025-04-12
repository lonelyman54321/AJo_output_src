/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common;

public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;
    private final String zzc;
    private final Throwable zzd;

    private PackageVerificationResult(String string2, int n3, boolean bl2, String string3, Throwable throwable) {
        this.zza = string2;
        this.zzb = bl2;
        this.zzc = string3;
        this.zzd = throwable;
    }

    public static PackageVerificationResult zza(String string2, String string3, Throwable throwable) {
        PackageVerificationResult packageVerificationResult = new PackageVerificationResult(string2, 1, false, string3, throwable);
        return packageVerificationResult;
    }

    public static PackageVerificationResult zzd(String string2, int n3) {
        PackageVerificationResult packageVerificationResult = new PackageVerificationResult(string2, n3, true, null, null);
        return packageVerificationResult;
    }

    public final void zzb() {
        boolean bl2 = this.zzb;
        if (!bl2) {
            String string2 = this.zzc;
            Throwable throwable = this.zzd;
            string2 = String.valueOf(string2);
            Object object = "PackageVerificationRslt: ";
            string2 = ((String)object).concat(string2);
            if (throwable != null) {
                object = new SecurityException(string2, throwable);
                throw object;
            }
            throwable = new SecurityException(string2);
            throw throwable;
        }
    }

    public final boolean zzc() {
        return this.zzb;
    }
}

