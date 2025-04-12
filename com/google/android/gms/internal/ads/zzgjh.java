/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghj;
import com.google.android.gms.internal.ads.zzgje;
import com.google.android.gms.internal.ads.zzgjf;
import com.google.android.gms.internal.ads.zzgjg;
import com.google.android.gms.internal.ads.zzgjj;
import com.google.android.gms.internal.ads.zzgjk;
import com.google.android.gms.internal.ads.zzgjm;
import com.google.android.gms.internal.ads.zzgma;
import com.google.android.gms.internal.ads.zzgmr;
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
import com.google.android.gms.internal.ads.zzgut;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzhdm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgjh {
    public static final /* synthetic */ int zza;
    private static final zzgpy zzb;
    private static final zzghj zzc;
    private static final zzgpa zzd;

    static {
        Object object = new zzgjf();
        Class<zzggy> clazz = zzggy.class;
        zzb = zzgpy.zzb((zzgpw)object, zzgje.class, clazz);
        object = zzgwg.zzb;
        zzhdm zzhdm2 = zzgut.zzh();
        zzc = zzgos.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", clazz, (zzgwg)object, zzhdm2);
        zzd = object = new zzgjg();
    }

    public static void zza(boolean bl2) {
        bl2 = true;
        int n3 = zzgoc.zza((int)(bl2 ? 1 : 0));
        if (n3 != 0) {
            n3 = zzgmr.zza;
            zzgmr.zze(zzgpl.zzc());
            Object object = zzgpi.zza();
            Object object2 = zzb;
            ((zzgpi)object).zze((zzgpy)object2);
            object = zzgph.zzb();
            object2 = new HashMap();
            zzgjm zzgjm2 = zzgma.zzc;
            ((HashMap)object2).put("AES128_EAX", zzgjm2);
            Object object3 = new zzgjj(null);
            int n4 = 16;
            ((zzgjj)object3).zza(n4);
            ((zzgjj)object3).zzb(n4);
            ((zzgjj)object3).zzc(n4);
            zzgjk zzgjk2 = zzgjk.zzc;
            ((zzgjj)object3).zzd(zzgjk2);
            object3 = ((zzgjj)object3).zze();
            ((HashMap)object2).put("AES128_EAX_RAW", object3);
            zzgjm zzgjm3 = zzgma.zzd;
            ((HashMap)object2).put("AES256_EAX", zzgjm3);
            object3 = new zzgjj(null);
            ((zzgjj)object3).zza(n4);
            ((zzgjj)object3).zzb(32);
            ((zzgjj)object3).zzc(n4);
            ((zzgjj)object3).zzd(zzgjk2);
            object3 = ((zzgjj)object3).zze();
            ((HashMap)object2).put("AES256_EAX_RAW", object3);
            object2 = Collections.unmodifiableMap(object2);
            ((zzgph)object).zzd((Map)object2);
            object = zzgpb.zzb();
            object2 = zzd;
            ((zzgpb)object).zzc((zzgpa)object2, zzgjm.class);
            object = zzgoj.zzc();
            object2 = zzc;
            ((zzgoj)object).zzd((zzghj)object2, bl2);
            return;
        }
        GeneralSecurityException generalSecurityException = new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        throw generalSecurityException;
    }
}

