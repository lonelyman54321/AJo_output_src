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
import com.google.android.gms.internal.ads.zzgph;
import com.google.android.gms.internal.ads.zzgpi;
import com.google.android.gms.internal.ads.zzgpl;
import com.google.android.gms.internal.ads.zzgpw;
import com.google.android.gms.internal.ads.zzgpy;
import com.google.android.gms.internal.ads.zzgrc;
import com.google.android.gms.internal.ads.zzgre;
import com.google.android.gms.internal.ads.zzgrf;
import com.google.android.gms.internal.ads.zzgrg;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzgrk;
import com.google.android.gms.internal.ads.zzgrl;
import com.google.android.gms.internal.ads.zzgrn;
import com.google.android.gms.internal.ads.zzgro;
import com.google.android.gms.internal.ads.zzgst;
import com.google.android.gms.internal.ads.zzgsy;
import com.google.android.gms.internal.ads.zzgta;
import com.google.android.gms.internal.ads.zzgtv;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zzgzf;
import com.google.android.gms.internal.ads.zzhdm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgri {
    private static final zzgpa zza;
    private static final zzgpy zzb;
    private static final zzgpy zzc;
    private static final zzghj zzd;

    static {
        Object object = new zzgrf();
        zza = object;
        object = new zzgrg();
        Object object2 = zzgre.class;
        zzb = zzgpy.zzb((zzgpw)object, object2, zzgro.class);
        object = new zzgrh();
        Class<zzghw> clazz = zzghw.class;
        zzc = zzgpy.zzb((zzgpw)object, object2, clazz);
        object = zzgwg.zzb;
        object2 = zzgtv.zzh();
        zzd = zzgos.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", clazz, (zzgwg)object, (zzhdm)object2);
    }

    public static /* synthetic */ zzghw zza(zzgre zzgre2) {
        zzgri.zze(zzgre2.zzb());
        return zzgzb.zza(zzgre2);
    }

    public static /* synthetic */ zzgre zzb(zzgrn object, Integer n3) {
        zzgri.zze((zzgrn)object);
        zzgrc zzgrc2 = new zzgrc(null);
        zzgrc2.zzc((zzgrn)object);
        object = zzgzf.zzc(((zzgrn)object).zzc());
        zzgrc2.zza((zzgzf)object);
        zzgrc2.zzb(n3);
        return zzgrc2.zzd();
    }

    public static /* synthetic */ zzgro zzc(zzgre zzgre2) {
        zzgri.zze(zzgre2.zzb());
        zzgta zzgta2 = new zzgta(zzgre2);
        return zzgta2;
    }

    public static void zzd(boolean bl2) {
        bl2 = true;
        int n3 = zzgoc.zza((int)(bl2 ? 1 : 0));
        if (n3 != 0) {
            n3 = zzgsy.zza;
            zzgsy.zze(zzgpl.zzc());
            Object object = zzgpb.zzb();
            Object object2 = zza;
            ((zzgpb)object).zzc((zzgpa)object2, zzgrn.class);
            object = zzgpi.zza();
            object2 = zzb;
            ((zzgpi)object).zze((zzgpy)object2);
            object = zzgpi.zza();
            object2 = zzc;
            ((zzgpi)object).zze((zzgpy)object2);
            object = zzgph.zzb();
            object2 = new HashMap();
            Object object3 = zzgst.zze;
            ((HashMap)object2).put("AES_CMAC", object3);
            ((HashMap)object2).put("AES256_CMAC", object3);
            object3 = new zzgrk(null);
            ((zzgrk)object3).zza(32);
            ((zzgrk)object3).zzb(16);
            zzgrl zzgrl2 = zzgrl.zzd;
            ((zzgrk)object3).zzc(zzgrl2);
            object3 = ((zzgrk)object3).zzd();
            ((HashMap)object2).put("AES256_CMAC_RAW", object3);
            object2 = Collections.unmodifiableMap(object2);
            ((zzgph)object).zzd((Map)object2);
            object = zzgoj.zzc();
            object2 = zzd;
            ((zzgoj)object).zzd((zzghj)object2, bl2);
            return;
        }
        GeneralSecurityException generalSecurityException = new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        throw generalSecurityException;
    }

    private static void zze(zzgrn object) {
        int n3;
        int n4 = ((zzgrn)object).zzc();
        if (n4 == (n3 = 32)) {
            return;
        }
        object = new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        throw object;
    }
}

