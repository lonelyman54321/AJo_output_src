/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghj;
import com.google.android.gms.internal.ads.zzgjq;
import com.google.android.gms.internal.ads.zzgjr;
import com.google.android.gms.internal.ads.zzgjs;
import com.google.android.gms.internal.ads.zzgjt;
import com.google.android.gms.internal.ads.zzgjw;
import com.google.android.gms.internal.ads.zzgjx;
import com.google.android.gms.internal.ads.zzgjz;
import com.google.android.gms.internal.ads.zzgma;
import com.google.android.gms.internal.ads.zzgmw;
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
import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzhdm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgju {
    public static final /* synthetic */ int zza;
    private static final zzgpy zzb;
    private static final zzghj zzc;
    private static final zzgpc zzd;
    private static final zzgpa zze;
    private static final int zzf;

    static {
        Object object = new zzgjr();
        Class<zzggy> clazz = zzggy.class;
        zzb = zzgpy.zzb((zzgpw)object, zzgjq.class, clazz);
        object = zzgwg.zzb;
        zzhdm zzhdm2 = zzgvc.zzg();
        zzc = zzgos.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", clazz, (zzgwg)object, zzhdm2);
        zzd = object = new zzgjs();
        zze = object = new zzgjt();
        zzf = 2;
    }

    public static void zza(boolean bl2) {
        int n3 = zzf;
        int n4 = zzgoc.zza(n3);
        if (n4 != 0) {
            n4 = zzgmw.zza;
            zzgmw.zze(zzgpl.zzc());
            Object object = zzgpi.zza();
            Object object2 = zzb;
            ((zzgpi)object).zze((zzgpy)object2);
            object = zzgph.zzb();
            object2 = new HashMap();
            zzgjz zzgjz2 = zzgma.zza;
            ((HashMap)object2).put("AES128_GCM", zzgjz2);
            Class<zzgjz> clazz = new Class<zzgjz>(null);
            int n7 = 12;
            ((zzgjw)((Object)clazz)).zza(n7);
            int n8 = 16;
            ((zzgjw)((Object)clazz)).zzb(n8);
            ((zzgjw)((Object)clazz)).zzc(n8);
            zzgjx zzgjx2 = zzgjx.zzc;
            ((zzgjw)((Object)clazz)).zzd(zzgjx2);
            clazz = ((zzgjw)((Object)clazz)).zze();
            ((HashMap)object2).put("AES128_GCM_RAW", clazz);
            zzgjz zzgjz3 = zzgma.zzb;
            ((HashMap)object2).put("AES256_GCM", zzgjz3);
            clazz = new Class<zzgjz>(null);
            ((zzgjw)((Object)clazz)).zza(n7);
            ((zzgjw)((Object)clazz)).zzb(32);
            ((zzgjw)((Object)clazz)).zzc(n8);
            ((zzgjw)((Object)clazz)).zzd(zzgjx2);
            clazz = ((zzgjw)((Object)clazz)).zze();
            ((HashMap)object2).put("AES256_GCM_RAW", clazz);
            object2 = Collections.unmodifiableMap(object2);
            ((zzgph)object).zzd((Map)object2);
            object = zzgpd.zza();
            object2 = zzd;
            clazz = zzgjz.class;
            ((zzgpd)object).zzb((zzgpc)object2, clazz);
            object = zzgpb.zzb();
            object2 = zze;
            ((zzgpb)object).zzc((zzgpa)object2, clazz);
            object = zzgoj.zzc();
            object2 = zzc;
            ((zzgoj)object).zzf((zzghj)object2, n3, true);
            return;
        }
        GeneralSecurityException generalSecurityException = new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        throw generalSecurityException;
    }
}

