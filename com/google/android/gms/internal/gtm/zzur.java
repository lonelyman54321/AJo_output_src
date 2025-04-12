/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzui;
import com.google.android.gms.internal.gtm.zzup;
import com.google.android.gms.internal.gtm.zzuq;
import com.google.android.gms.internal.gtm.zzus;
import com.google.android.gms.internal.gtm.zzut;
import com.google.android.gms.internal.gtm.zzuu;
import com.google.android.gms.internal.gtm.zzuv;
import com.google.android.gms.internal.gtm.zzuw;
import com.google.android.gms.internal.gtm.zzwe;
import java.util.HashMap;
import java.util.Map;

public final class zzur {
    private static final zzuu zza;
    private static final zzut zzb;
    private final Map zzc;
    private final Map zzd;

    static {
        Object object = new zzup();
        zza = object;
        zzb = object = new zzuq();
    }

    public /* synthetic */ zzur(zzuu hashMap, zzuv zzuv2) {
        this.zzc = hashMap = new HashMap();
        this.zzd = hashMap = new HashMap();
    }

    public static /* bridge */ /* synthetic */ Map zzb(zzur zzur2) {
        return zzur2.zzd;
    }

    public static /* bridge */ /* synthetic */ Map zzc(zzur zzur2) {
        return zzur2.zzc;
    }

    public final zzuw zza() {
        zzus zzus2 = new zzus(this, null);
        return zzus2;
    }

    public final void zzd(zzui object) {
        String string2 = "key";
        zzwe.zza(object, string2);
        boolean bl2 = ((zzui)object).zzb();
        if (bl2) {
            zzut zzut2 = zzb;
            zzwe.zza(object, string2);
            boolean bl3 = ((zzui)object).zzb();
            if (bl3) {
                this.zzc.remove(object);
                this.zzd.put(object, zzut2);
                return;
            }
            object = new IllegalArgumentException("key must be repeating");
            throw object;
        }
        zzuu zzuu2 = zza;
        zzwe.zza(object, string2);
        this.zzd.remove(object);
        this.zzc.put(object, zzuu2);
    }
}

