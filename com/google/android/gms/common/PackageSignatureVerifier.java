/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.common;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.PackageVerificationResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.zzab;
import com.google.android.gms.common.zzac;
import com.google.android.gms.common.zzad;
import com.google.android.gms.common.zzn;

public class PackageSignatureVerifier {
    static volatile zzab zza;
    private static zzac zzb;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static zzac zza(Context object) {
        Class<PackageSignatureVerifier> clazz = PackageSignatureVerifier.class;
        synchronized (clazz) {
            try {
                zzac zzac2 = zzb;
                if (zzac2 != null) return zzb;
                zzb = zzac2 = new zzac((Context)object);
                return zzb;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public PackageVerificationResult queryPackageSignatureVerified(Context object, String string2) {
        boolean bl2 = GooglePlayServicesUtilLight.honorsDebugCertificates(object);
        PackageSignatureVerifier.zza(object);
        boolean bl3 = zzn.zzf();
        if (bl3) {
            boolean bl4;
            bl3 = true;
            String string3 = bl3 != bl2 ? "-0" : "-1";
            string3 = String.valueOf(string2).concat(string3);
            Object object2 = zza;
            if (object2 != null && (bl4 = ((String)(object2 = zzab.zzb(zza))).equals(string3))) {
                object = zzab.zza(zza);
            } else {
                PackageSignatureVerifier.zza(object);
                int n3 = 0;
                object = zzn.zzc(string2, bl2, false, false);
                bl2 = object.zza;
                if (bl2) {
                    zzab zzab2;
                    n3 = object.zzd;
                    object = PackageVerificationResult.zzd(string2, n3);
                    zza = zzab2 = new zzab(string3, (PackageVerificationResult)object);
                    object = zzab.zza(zza);
                } else {
                    Preconditions.checkNotNull(object.zzb);
                    String string4 = object.zzb;
                    object = object.zzc;
                    object = PackageVerificationResult.zza(string2, string4, (Throwable)object);
                }
            }
            return object;
        }
        object = new zzad();
        throw object;
    }

    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(Context context, String string2) {
        PackageVerificationResult packageVerificationResult = this.queryPackageSignatureVerified(context, string2);
        try {
            packageVerificationResult.zzb();
        }
        catch (SecurityException securityException) {
            packageVerificationResult = this.queryPackageSignatureVerified(context, string2);
            boolean bl2 = packageVerificationResult.zzc();
            if (bl2) {
                // empty if block
            }
        }
        return packageVerificationResult;
    }
}

