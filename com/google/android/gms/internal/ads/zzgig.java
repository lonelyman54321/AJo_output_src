/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgim;
import com.google.android.gms.internal.ads.zzgiu;
import com.google.android.gms.internal.ads.zzgjh;
import com.google.android.gms.internal.ads.zzgju;
import com.google.android.gms.internal.ads.zzgkh;
import com.google.android.gms.internal.ads.zzgkq;
import com.google.android.gms.internal.ads.zzgkv;
import com.google.android.gms.internal.ads.zzgkz;
import com.google.android.gms.internal.ads.zzgmf;
import com.google.android.gms.internal.ads.zzgod;
import com.google.android.gms.internal.ads.zzgsh;
import com.google.android.gms.internal.ads.zzgxq;
import java.security.GeneralSecurityException;

public final class zzgig {
    static final zzgxq zza;
    static final zzgxq zzb;
    static final zzgxq zzc;

    static {
        zzgxq zzgxq2;
        zza = zzgxq2 = zzgxq.zzc();
        zzb = zzgxq2;
        zzc = zzgxq2;
        try {
            zzgig.zza();
            return;
        }
        catch (GeneralSecurityException generalSecurityException) {
            ExceptionInInitializerError exceptionInInitializerError = new ExceptionInInitializerError(generalSecurityException);
            throw exceptionInInitializerError;
        }
    }

    public static void zza() {
        zzgim.zzd();
        zzgsh.zza();
        boolean bl2 = true;
        zzgiu.zza(bl2);
        zzgju.zza(bl2);
        boolean bl3 = zzgod.zzb();
        if (bl3) {
            return;
        }
        zzgjh.zza(bl2);
        zzgkh.zza(bl2);
        zzgkq.zza(bl2);
        zzgkv.zza(bl2);
        zzgkz.zza(bl2);
        zzgmf.zza(bl2);
    }
}

