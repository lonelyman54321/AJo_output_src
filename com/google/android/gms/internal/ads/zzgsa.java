/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghj;
import com.google.android.gms.internal.ads.zzghw;
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
import com.google.android.gms.internal.ads.zzgro;
import com.google.android.gms.internal.ads.zzgrv;
import com.google.android.gms.internal.ads.zzgrw;
import com.google.android.gms.internal.ads.zzgrx;
import com.google.android.gms.internal.ads.zzgry;
import com.google.android.gms.internal.ads.zzgrz;
import com.google.android.gms.internal.ads.zzgsc;
import com.google.android.gms.internal.ads.zzgsd;
import com.google.android.gms.internal.ads.zzgse;
import com.google.android.gms.internal.ads.zzgsg;
import com.google.android.gms.internal.ads.zzgst;
import com.google.android.gms.internal.ads.zzgtg;
import com.google.android.gms.internal.ads.zzgvw;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzhdm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgsa {
    private static final zzgpy zza;
    private static final zzgpy zzb;
    private static final zzghj zzc;
    private static final zzgpc zzd;
    private static final zzgpa zze;
    private static final int zzf;

    static {
        Object object = new zzgrw();
        Object object2 = zzgrv.class;
        zza = zzgpy.zzb((zzgpw)object, object2, zzgro.class);
        object = new zzgrx();
        Class<zzghw> clazz = zzghw.class;
        zzb = zzgpy.zzb((zzgpw)object, object2, clazz);
        object = zzgwg.zzb;
        object2 = zzgvw.zzi();
        zzc = zzgos.zzd("type.googleapis.com/google.crypto.tink.HmacKey", clazz, (zzgwg)object, (zzhdm)object2);
        zzd = object = new zzgry();
        zze = object = new zzgrz();
        zzf = 2;
    }

    public static void zza(boolean bl2) {
        int n3 = zzf;
        int n4 = zzgoc.zza(n3);
        if (n4 != 0) {
            n4 = zzgtg.zza;
            zzgtg.zze(zzgpl.zzc());
            Object object = zzgpi.zza();
            Object object2 = zza;
            ((zzgpi)object).zze((zzgpy)object2);
            object = zzgpi.zza();
            object2 = zzb;
            ((zzgpi)object).zze((zzgpy)object2);
            object = zzgph.zzb();
            object2 = new HashMap();
            zzgsg zzgsg2 = zzgst.zza;
            ((HashMap)object2).put("HMAC_SHA256_128BITTAG", zzgsg2);
            Class<zzgsg> clazz = new Class<zzgsg>(null);
            int n7 = 32;
            ((zzgsc)((Object)clazz)).zzb(n7);
            int n8 = 16;
            ((zzgsc)((Object)clazz)).zzc(n8);
            zzgse zzgse2 = zzgse.zzd;
            ((zzgsc)((Object)clazz)).zzd(zzgse2);
            zzgsd zzgsd2 = zzgsd.zzc;
            ((zzgsc)((Object)clazz)).zza(zzgsd2);
            clazz = ((zzgsc)((Object)clazz)).zze();
            ((HashMap)object2).put("HMAC_SHA256_128BITTAG_RAW", clazz);
            clazz = new Class<zzgsg>(null);
            ((zzgsc)((Object)clazz)).zzb(n7);
            ((zzgsc)((Object)clazz)).zzc(n7);
            zzgse zzgse3 = zzgse.zza;
            ((zzgsc)((Object)clazz)).zzd(zzgse3);
            ((zzgsc)((Object)clazz)).zza(zzgsd2);
            clazz = ((zzgsc)((Object)clazz)).zze();
            ((HashMap)object2).put("HMAC_SHA256_256BITTAG", clazz);
            clazz = new Class<zzgsg>(null);
            ((zzgsc)((Object)clazz)).zzb(n7);
            ((zzgsc)((Object)clazz)).zzc(n7);
            ((zzgsc)((Object)clazz)).zzd(zzgse2);
            ((zzgsc)((Object)clazz)).zza(zzgsd2);
            clazz = ((zzgsc)((Object)clazz)).zze();
            ((HashMap)object2).put("HMAC_SHA256_256BITTAG_RAW", clazz);
            clazz = new Class<zzgsg>(null);
            int n10 = 64;
            ((zzgsc)((Object)clazz)).zzb(n10);
            ((zzgsc)((Object)clazz)).zzc(n8);
            ((zzgsc)((Object)clazz)).zzd(zzgse3);
            zzgsd zzgsd3 = zzgsd.zze;
            ((zzgsc)((Object)clazz)).zza(zzgsd3);
            clazz = ((zzgsc)((Object)clazz)).zze();
            ((HashMap)object2).put("HMAC_SHA512_128BITTAG", clazz);
            clazz = new Class<zzgsg>(null);
            ((zzgsc)((Object)clazz)).zzb(n10);
            ((zzgsc)((Object)clazz)).zzc(n8);
            ((zzgsc)((Object)clazz)).zzd(zzgse2);
            ((zzgsc)((Object)clazz)).zza(zzgsd3);
            clazz = ((zzgsc)((Object)clazz)).zze();
            ((HashMap)object2).put("HMAC_SHA512_128BITTAG_RAW", clazz);
            clazz = new Class<zzgsg>(null);
            ((zzgsc)((Object)clazz)).zzb(n10);
            ((zzgsc)((Object)clazz)).zzc(n7);
            ((zzgsc)((Object)clazz)).zzd(zzgse3);
            ((zzgsc)((Object)clazz)).zza(zzgsd3);
            clazz = ((zzgsc)((Object)clazz)).zze();
            ((HashMap)object2).put("HMAC_SHA512_256BITTAG", clazz);
            clazz = new Class<zzgsg>(null);
            ((zzgsc)((Object)clazz)).zzb(n10);
            ((zzgsc)((Object)clazz)).zzc(n7);
            ((zzgsc)((Object)clazz)).zzd(zzgse2);
            ((zzgsc)((Object)clazz)).zza(zzgsd3);
            clazz = ((zzgsc)((Object)clazz)).zze();
            ((HashMap)object2).put("HMAC_SHA512_256BITTAG_RAW", clazz);
            zzgsg zzgsg3 = zzgst.zzd;
            ((HashMap)object2).put("HMAC_SHA512_512BITTAG", zzgsg3);
            clazz = new Class<zzgsg>(null);
            ((zzgsc)((Object)clazz)).zzb(n10);
            ((zzgsc)((Object)clazz)).zzc(n10);
            ((zzgsc)((Object)clazz)).zzd(zzgse2);
            ((zzgsc)((Object)clazz)).zza(zzgsd3);
            clazz = ((zzgsc)((Object)clazz)).zze();
            ((HashMap)object2).put("HMAC_SHA512_512BITTAG_RAW", clazz);
            object2 = Collections.unmodifiableMap(object2);
            ((zzgph)object).zzd((Map)object2);
            object = zzgpb.zzb();
            object2 = zze;
            clazz = zzgsg.class;
            ((zzgpb)object).zzc((zzgpa)object2, clazz);
            object = zzgpd.zza();
            object2 = zzd;
            ((zzgpd)object).zzb((zzgpc)object2, clazz);
            object = zzgoj.zzc();
            object2 = zzc;
            ((zzgoj)object).zzf((zzghj)object2, n3, true);
            return;
        }
        GeneralSecurityException generalSecurityException = new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        throw generalSecurityException;
    }
}

