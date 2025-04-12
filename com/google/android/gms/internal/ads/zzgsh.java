/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgod;
import com.google.android.gms.internal.ads.zzgri;
import com.google.android.gms.internal.ads.zzgrr;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.android.gms.internal.ads.zzgsn;
import com.google.android.gms.internal.ads.zzgxq;
import java.security.GeneralSecurityException;

public final class zzgsh {
    static final zzgxq zza;
    static final zzgxq zzb;
    static final zzgxq zzc;

    static {
        zzgxq zzgxq2;
        zza = zzgxq2 = zzgxq.zzc();
        zzb = zzgxq2;
        zzc = zzgxq2;
        try {
            zzgsh.zza();
            return;
        }
        catch (GeneralSecurityException generalSecurityException) {
            ExceptionInInitializerError exceptionInInitializerError = new ExceptionInInitializerError(generalSecurityException);
            throw exceptionInInitializerError;
        }
    }

    public static void zza() {
        zzgsn.zzd();
        zzgrr.zzd();
        boolean bl2 = true;
        zzgsa.zza(bl2);
        boolean bl3 = zzgod.zzb();
        if (bl3) {
            return;
        }
        zzgri.zzd(bl2);
    }
}

