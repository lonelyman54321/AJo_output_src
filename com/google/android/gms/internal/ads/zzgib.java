/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghe;
import com.google.android.gms.internal.ads.zzghf;
import com.google.android.gms.internal.ads.zzghg;
import com.google.android.gms.internal.ads.zzghw;
import com.google.android.gms.internal.ads.zzghz;
import com.google.android.gms.internal.ads.zzgia;
import com.google.android.gms.internal.ads.zzgid;
import com.google.android.gms.internal.ads.zzgoj;
import com.google.android.gms.internal.ads.zzgpi;
import com.google.android.gms.internal.ads.zzgts;
import com.google.android.gms.internal.ads.zzgwh;
import com.google.android.gms.internal.ads.zzhac;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

public final class zzgib {
    public static final /* synthetic */ int zza;
    private static final Logger zzb = Logger.getLogger(zzgib.class.getName());
    private static final ConcurrentMap zzc;
    private static final Set zzd;

    static {
        Serializable serializable = new ConcurrentHashMap();
        zzc = serializable;
        serializable = new HashSet();
        ((HashSet)serializable).add(zzggy.class);
        ((HashSet)serializable).add(zzghe.class);
        ((HashSet)serializable).add(zzgid.class);
        ((HashSet)serializable).add(zzghg.class);
        ((HashSet)serializable).add(zzghf.class);
        ((HashSet)serializable).add(zzghw.class);
        ((HashSet)serializable).add(zzgts.class);
        ((HashSet)serializable).add(zzghz.class);
        ((HashSet)serializable).add(zzgia.class);
        zzd = Collections.unmodifiableSet(serializable);
    }

    private zzgib() {
    }

    public static Class zza(Class clazz) {
        zzgpi zzgpi2;
        try {
            zzgpi2 = zzgpi.zza();
        }
        catch (GeneralSecurityException generalSecurityException) {
            return null;
        }
        return zzgpi2.zzb(clazz);
    }

    public static Object zzb(zzgwh object, Class clazz) {
        String string2 = ((zzgwh)object).zzg();
        object = ((zzgwh)object).zzf();
        return zzgoj.zzc().zza(string2, clazz).zzc((zzhac)object);
    }
}

