/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghj;
import com.google.android.gms.internal.ads.zzgkx;
import com.google.android.gms.internal.ads.zzgky;
import com.google.android.gms.internal.ads.zzgli;
import com.google.android.gms.internal.ads.zzglo;
import com.google.android.gms.internal.ads.zzglt;
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
import com.google.android.gms.internal.ads.zzgxi;
import com.google.android.gms.internal.ads.zzhdm;
import java.security.GeneralSecurityException;

public final class zzgkz {
    public static final /* synthetic */ int zza;
    private static final zzghj zzb;
    private static final zzgpa zzc;
    private static final zzgpy zzd;

    static {
        Object object = zzgwg.zzb;
        zzhdm zzhdm2 = zzgxi.zzg();
        Class<zzggy> clazz = zzggy.class;
        zzb = zzgos.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", clazz, (zzgwg)object, zzhdm2);
        zzc = object = new zzgkx();
        object = new zzgky();
        zzd = zzgpy.zzb((zzgpw)object, zzgli.class, clazz);
    }

    public static void zza(boolean bl2) {
        bl2 = true;
        int n3 = zzgoc.zza((int)(bl2 ? 1 : 0));
        if (n3 != 0) {
            n3 = zzglt.zza;
            zzglt.zze(zzgpl.zzc());
            Object object = zzgpb.zzb();
            Object object2 = zzc;
            ((zzgpb)object).zzc((zzgpa)object2, zzglo.class);
            object = zzgpi.zza();
            object2 = zzd;
            ((zzgpi)object).zze((zzgpy)object2);
            object = zzgoj.zzc();
            object2 = zzb;
            ((zzgoj)object).zzd((zzghj)object2, bl2);
            return;
        }
        GeneralSecurityException generalSecurityException = new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        throw generalSecurityException;
    }
}

