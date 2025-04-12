/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghj;
import com.google.android.gms.internal.ads.zzgkn;
import com.google.android.gms.internal.ads.zzgko;
import com.google.android.gms.internal.ads.zzgkp;
import com.google.android.gms.internal.ads.zzgkr;
import com.google.android.gms.internal.ads.zzgks;
import com.google.android.gms.internal.ads.zzgni;
import com.google.android.gms.internal.ads.zzgoc;
import com.google.android.gms.internal.ads.zzgoj;
import com.google.android.gms.internal.ads.zzgos;
import com.google.android.gms.internal.ads.zzgpa;
import com.google.android.gms.internal.ads.zzgpb;
import com.google.android.gms.internal.ads.zzgph;
import com.google.android.gms.internal.ads.zzgpi;
import com.google.android.gms.internal.ads.zzgpl;
import com.google.android.gms.internal.ads.zzgpw;
import com.google.android.gms.internal.ads.zzgpy;
import com.google.android.gms.internal.ads.zzgvo;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzhdm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgkq {
    public static final /* synthetic */ int zza;
    private static final zzgpy zzb;
    private static final zzgpa zzc;
    private static final zzghj zzd;

    static {
        Object object = new zzgko();
        Class<zzggy> clazz = zzggy.class;
        zzb = zzgpy.zzb((zzgpw)object, zzgkn.class, clazz);
        zzc = object = new zzgkp();
        object = zzgwg.zzb;
        zzhdm zzhdm2 = zzgvo.zzg();
        zzd = zzgos.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", clazz, (zzgwg)object, zzhdm2);
    }

    public static void zza(boolean bl2) {
        bl2 = true;
        int n3 = zzgoc.zza((int)(bl2 ? 1 : 0));
        if (n3 != 0) {
            n3 = zzgni.zza;
            zzgni.zze(zzgpl.zzc());
            Object object = zzgpi.zza();
            Object object2 = zzb;
            ((zzgpi)object).zze((zzgpy)object2);
            object = zzgpb.zzb();
            object2 = zzc;
            ((zzgpb)object).zzc((zzgpa)object2, zzgks.class);
            object = zzgph.zzb();
            object2 = new HashMap();
            zzgks zzgks2 = zzgks.zzc(zzgkr.zza);
            ((HashMap)object2).put("CHACHA20_POLY1305", zzgks2);
            zzgks2 = zzgks.zzc(zzgkr.zzc);
            ((HashMap)object2).put("CHACHA20_POLY1305_RAW", zzgks2);
            object2 = Collections.unmodifiableMap(object2);
            ((zzgph)object).zzd((Map)object2);
            object = zzgoj.zzc();
            object2 = zzd;
            ((zzgoj)object).zzd((zzghj)object2, bl2);
            return;
        }
        GeneralSecurityException generalSecurityException = new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        throw generalSecurityException;
    }
}

