/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghj;
import com.google.android.gms.internal.ads.zzgkt;
import com.google.android.gms.internal.ads.zzgku;
import com.google.android.gms.internal.ads.zzgla;
import com.google.android.gms.internal.ads.zzglc;
import com.google.android.gms.internal.ads.zzglh;
import com.google.android.gms.internal.ads.zzgoc;
import com.google.android.gms.internal.ads.zzgoj;
import com.google.android.gms.internal.ads.zzgos;
import com.google.android.gms.internal.ads.zzgpa;
import com.google.android.gms.internal.ads.zzgpb;
import com.google.android.gms.internal.ads.zzgpi;
import com.google.android.gms.internal.ads.zzgpl;
import com.google.android.gms.internal.ads.zzgpw;
import com.google.android.gms.internal.ads.zzgpy;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzgxc;
import com.google.android.gms.internal.ads.zzhdm;
import java.security.GeneralSecurityException;

public final class zzgkv {
    public static final /* synthetic */ int zza;
    private static final zzgpy zzb;
    private static final zzghj zzc;
    private static final zzgpa zzd;

    static {
        Object object = new zzgkt();
        Class<zzggy> clazz = zzggy.class;
        zzb = zzgpy.zzb((zzgpw)object, zzgla.class, clazz);
        object = zzgwg.zze;
        zzhdm zzhdm2 = zzgxc.zzg();
        zzc = zzgos.zzd("type.googleapis.com/google.crypto.tink.KmsAeadKey", clazz, (zzgwg)object, zzhdm2);
        zzd = object = new zzgku();
    }

    public static void zza(boolean bl2) {
        bl2 = true;
        int n3 = zzgoc.zza((int)(bl2 ? 1 : 0));
        if (n3 != 0) {
            n3 = zzglh.zza;
            zzglh.zze(zzgpl.zzc());
            Object object = zzgpi.zza();
            Object object2 = zzb;
            ((zzgpi)object).zze((zzgpy)object2);
            object = zzgpb.zzb();
            object2 = zzd;
            ((zzgpb)object).zzc((zzgpa)object2, zzglc.class);
            object = zzgoj.zzc();
            object2 = zzc;
            ((zzgoj)object).zzd((zzghj)object2, bl2);
            return;
        }
        GeneralSecurityException generalSecurityException = new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        throw generalSecurityException;
    }
}

