/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghj;
import com.google.android.gms.internal.ads.zzgiq;
import com.google.android.gms.internal.ads.zzgir;
import com.google.android.gms.internal.ads.zzgis;
import com.google.android.gms.internal.ads.zzgit;
import com.google.android.gms.internal.ads.zzgiw;
import com.google.android.gms.internal.ads.zzgix;
import com.google.android.gms.internal.ads.zzgiy;
import com.google.android.gms.internal.ads.zzgja;
import com.google.android.gms.internal.ads.zzgma;
import com.google.android.gms.internal.ads.zzgmm;
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
import com.google.android.gms.internal.ads.zzgue;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzhdm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgiu {
    public static final /* synthetic */ int zza;
    private static final zzgpy zzb;
    private static final zzghj zzc;
    private static final zzgpc zzd;
    private static final zzgpa zze;
    private static final int zzf;

    static {
        Object object = new zzgir();
        Class<zzggy> clazz = zzggy.class;
        zzb = zzgpy.zzb((zzgpw)object, zzgiq.class, clazz);
        object = zzgwg.zzb;
        zzhdm zzhdm2 = zzgue.zzh();
        zzc = zzgos.zzd("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", clazz, (zzgwg)object, zzhdm2);
        zzd = object = new zzgis();
        zze = object = new zzgit();
        zzf = 2;
    }

    public static void zza(boolean bl2) {
        int n3 = zzf;
        int n4 = zzgoc.zza(n3);
        if (n4 != 0) {
            n4 = zzgmm.zza;
            zzgmm.zze(zzgpl.zzc());
            Object object = zzgpi.zza();
            Object object2 = zzb;
            ((zzgpi)object).zze((zzgpy)object2);
            object = zzgph.zzb();
            object2 = new HashMap();
            zzgja zzgja2 = zzgma.zze;
            ((HashMap)object2).put("AES128_CTR_HMAC_SHA256", zzgja2);
            Class<zzgja> clazz = new Class<zzgja>(null);
            int n7 = 16;
            ((zzgiw)((Object)clazz)).zza(n7);
            int n8 = 32;
            ((zzgiw)((Object)clazz)).zzc(n8);
            ((zzgiw)((Object)clazz)).zze(n7);
            ((zzgiw)((Object)clazz)).zzd(n7);
            zzgix zzgix2 = zzgix.zzc;
            ((zzgiw)((Object)clazz)).zzb(zzgix2);
            zzgiy zzgiy2 = zzgiy.zzc;
            ((zzgiw)((Object)clazz)).zzf(zzgiy2);
            clazz = ((zzgiw)((Object)clazz)).zzg();
            ((HashMap)object2).put("AES128_CTR_HMAC_SHA256_RAW", clazz);
            zzgja zzgja3 = zzgma.zzf;
            ((HashMap)object2).put("AES256_CTR_HMAC_SHA256", zzgja3);
            clazz = new Class<zzgja>(null);
            ((zzgiw)((Object)clazz)).zza(n8);
            ((zzgiw)((Object)clazz)).zzc(n8);
            ((zzgiw)((Object)clazz)).zze(n8);
            ((zzgiw)((Object)clazz)).zzd(n7);
            ((zzgiw)((Object)clazz)).zzb(zzgix2);
            ((zzgiw)((Object)clazz)).zzf(zzgiy2);
            clazz = ((zzgiw)((Object)clazz)).zzg();
            ((HashMap)object2).put("AES256_CTR_HMAC_SHA256_RAW", clazz);
            object2 = Collections.unmodifiableMap(object2);
            ((zzgph)object).zzd((Map)object2);
            object = zzgpd.zza();
            object2 = zzd;
            clazz = zzgja.class;
            ((zzgpd)object).zzb((zzgpc)object2, clazz);
            object = zzgpb.zzb();
            object2 = zze;
            ((zzgpb)object).zzc((zzgpa)object2, clazz);
            object = zzgoj.zzc();
            object2 = zzc;
            ((zzgoj)object).zzf((zzghj)object2, n3, true);
            return;
        }
        GeneralSecurityException generalSecurityException = new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        throw generalSecurityException;
    }
}

