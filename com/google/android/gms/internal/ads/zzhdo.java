/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhcw;
import com.google.android.gms.internal.ads.zzhdz;
import com.google.android.gms.internal.ads.zzhea;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzhdo {
    private static final zzhdo zza;
    private final zzhea zzb;
    private final ConcurrentMap zzc;

    static {
        zzhdo zzhdo2;
        zza = zzhdo2 = new zzhdo();
    }

    private zzhdo() {
        Object object = new ConcurrentHashMap();
        this.zzc = object;
        this.zzb = object = new zzhcw();
    }

    public static zzhdo zza() {
        return zza;
    }

    public final zzhdz zzb(Class object) {
        Object object2 = "messageType";
        zzhcb.zzc(object, (String)object2);
        zzhdz zzhdz2 = (zzhdz)this.zzc.get(object);
        if (zzhdz2 == null) {
            zzhdz2 = this.zzb.zza((Class)object);
            zzhcb.zzc(object, (String)object2);
            object2 = this.zzc;
            object = object2.putIfAbsent(object, zzhdz2);
            if (object != null) {
                return object;
            }
        }
        return zzhdz2;
    }
}

