/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghj;
import com.google.android.gms.internal.ads.zzgmb;
import com.google.android.gms.internal.ads.zzgmc;
import com.google.android.gms.internal.ads.zzgmd;
import com.google.android.gms.internal.ads.zzgme;
import com.google.android.gms.internal.ads.zzgmg;
import com.google.android.gms.internal.ads.zzgmh;
import com.google.android.gms.internal.ads.zzgnz;
import com.google.android.gms.internal.ads.zzgoc;
import com.google.android.gms.internal.ads.zzgoj;
import com.google.android.gms.internal.ads.zzgos;
import com.google.android.gms.internal.ads.zzgpa;
import com.google.android.gms.internal.ads.zzgpb;
import com.google.android.gms.internal.ads.zzgpc;
import com.google.android.gms.internal.ads.zzgpd;
import com.google.android.gms.internal.ads.zzgph;
import com.google.android.gms.internal.ads.zzgpi;
import com.google.android.gms.internal.ads.zzgpl;
import com.google.android.gms.internal.ads.zzgpw;
import com.google.android.gms.internal.ads.zzgpy;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzgxt;
import com.google.android.gms.internal.ads.zzhdm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgmf {
    public static final /* synthetic */ int zza;
    private static final zzgpy zzb;
    private static final zzghj zzc;
    private static final zzgpc zzd;
    private static final zzgpa zze;

    static {
        Object object = new zzgmc();
        Class<zzggy> clazz = zzggy.class;
        zzb = zzgpy.zzb((zzgpw)object, zzgmb.class, clazz);
        object = zzgwg.zzb;
        zzhdm zzhdm2 = zzgxt.zzg();
        zzc = zzgos.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", clazz, (zzgwg)object, zzhdm2);
        zzd = object = new zzgmd();
        zze = object = new zzgme();
    }

    public static void zza(boolean bl2) {
        bl2 = true;
        int n3 = zzgoc.zza((int)(bl2 ? 1 : 0));
        if (n3 != 0) {
            n3 = zzgnz.zza;
            zzgnz.zze(zzgpl.zzc());
            Object object = zzgpi.zza();
            Object object2 = zzb;
            ((zzgpi)object).zze((zzgpy)object2);
            object = zzgph.zzb();
            object2 = new HashMap();
            Object object3 = zzgmh.zzc(zzgmg.zza);
            ((HashMap)object2).put("XCHACHA20_POLY1305", object3);
            object3 = zzgmh.zzc(zzgmg.zzc);
            ((HashMap)object2).put("XCHACHA20_POLY1305_RAW", object3);
            object2 = Collections.unmodifiableMap(object2);
            ((zzgph)object).zzd((Map)object2);
            object = zzgpb.zzb();
            object2 = zze;
            object3 = zzgmh.class;
            ((zzgpb)object).zzc((zzgpa)object2, (Class)object3);
            object = zzgpd.zza();
            object2 = zzd;
            ((zzgpd)object).zzb((zzgpc)object2, (Class)object3);
            object = zzgoj.zzc();
            object2 = zzc;
            ((zzgoj)object).zzd((zzghj)object2, bl2);
            return;
        }
        GeneralSecurityException generalSecurityException = new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        throw generalSecurityException;
    }
}

