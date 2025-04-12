/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghj;
import com.google.android.gms.internal.ads.zzgkd;
import com.google.android.gms.internal.ads.zzgke;
import com.google.android.gms.internal.ads.zzgkf;
import com.google.android.gms.internal.ads.zzgkg;
import com.google.android.gms.internal.ads.zzgkj;
import com.google.android.gms.internal.ads.zzgkk;
import com.google.android.gms.internal.ads.zzgkm;
import com.google.android.gms.internal.ads.zzgnb;
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
import com.google.android.gms.internal.ads.zzgvi;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzhdm;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public final class zzgkh {
    private static final zzgpy zza;
    private static final zzgpa zzb;
    private static final zzgpc zzc;
    private static final zzghj zzd;

    static {
        Object object = new zzgke();
        Class<zzggy> clazz = zzggy.class;
        zza = zzgpy.zzb((zzgpw)object, zzgkd.class, clazz);
        zzb = object = new zzgkf();
        zzc = object = new zzgkg();
        object = zzgwg.zzb;
        zzhdm zzhdm2 = zzgvi.zzg();
        zzd = zzgos.zzd("type.googleapis.com/google.crypto.tink.AesGcmSivKey", clazz, (zzgwg)object, zzhdm2);
    }

    public static void zza(boolean bl2) {
        bl2 = true;
        int n3 = zzgoc.zza((int)(bl2 ? 1 : 0));
        if (n3 != 0) {
            n3 = zzgnb.zza;
            Object object = zzgpl.zzc();
            zzgnb.zze((zzgpl)object);
            n3 = (int)(zzgkh.zzb() ? 1 : 0);
            if (n3 != 0) {
                object = zzgpi.zza();
                Object object2 = zza;
                ((zzgpi)object).zze((zzgpy)object2);
                object = zzgph.zzb();
                object2 = new HashMap();
                Class<zzgkm> clazz = new Class<zzgkm>(null);
                int n4 = 16;
                ((zzgkj)((Object)clazz)).zza(n4);
                Object object3 = zzgkk.zza;
                ((zzgkj)((Object)clazz)).zzb((zzgkk)object3);
                clazz = ((zzgkj)((Object)clazz)).zzc();
                ((HashMap)object2).put("AES128_GCM_SIV", clazz);
                clazz = new Class<zzgkm>(null);
                ((zzgkj)((Object)clazz)).zza(n4);
                zzgkk zzgkk2 = zzgkk.zzc;
                ((zzgkj)((Object)clazz)).zzb(zzgkk2);
                clazz = ((zzgkj)((Object)clazz)).zzc();
                String string2 = "AES128_GCM_SIV_RAW";
                ((HashMap)object2).put(string2, clazz);
                clazz = new Class<zzgkm>(null);
                int n7 = 32;
                ((zzgkj)((Object)clazz)).zza(n7);
                ((zzgkj)((Object)clazz)).zzb((zzgkk)object3);
                clazz = ((zzgkj)((Object)clazz)).zzc();
                object3 = "AES256_GCM_SIV";
                ((HashMap)object2).put(object3, clazz);
                clazz = new Class<zzgkm>(null);
                ((zzgkj)((Object)clazz)).zza(n7);
                ((zzgkj)((Object)clazz)).zzb(zzgkk2);
                clazz = ((zzgkj)((Object)clazz)).zzc();
                String string3 = "AES256_GCM_SIV_RAW";
                ((HashMap)object2).put(string3, clazz);
                object2 = Collections.unmodifiableMap(object2);
                ((zzgph)object).zzd((Map)object2);
                object = zzgpd.zza();
                object2 = zzc;
                clazz = zzgkm.class;
                ((zzgpd)object).zzb((zzgpc)object2, clazz);
                object = zzgpb.zzb();
                object2 = zzb;
                ((zzgpb)object).zzc((zzgpa)object2, clazz);
                object = zzgoj.zzc();
                object2 = zzd;
                ((zzgoj)object).zzd((zzghj)object2, bl2);
            }
            return;
        }
        GeneralSecurityException generalSecurityException = new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        throw generalSecurityException;
    }

    private static boolean zzb() {
        String string2 = "AES/GCM-SIV/NoPadding";
        try {
            Cipher.getInstance(string2);
            return true;
        }
        catch (NoSuchAlgorithmException | NoSuchPaddingException generalSecurityException) {
            return false;
        }
    }
}

