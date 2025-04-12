/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaco;
import com.google.android.gms.internal.gtm.zzadd;
import com.google.android.gms.internal.gtm.zzadx;
import com.google.android.gms.internal.gtm.zzady;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzadt {
    public static final /* synthetic */ int zza;
    private static final zzadt zzb;
    private final zzady zzc;
    private final ConcurrentMap zzd;

    static {
        zzadt zzadt2;
        zzb = zzadt2 = new zzadt();
    }

    private zzadt() {
        Object object = new ConcurrentHashMap();
        this.zzd = object;
        this.zzc = object = new zzadd();
    }

    public static zzadt zza() {
        return zzb;
    }

    public final zzadx zzb(Class object) {
        Object object2 = "messageType";
        zzaco.zzc(object, (String)object2);
        zzadx zzadx2 = (zzadx)this.zzd.get(object);
        if (zzadx2 == null) {
            zzadx2 = this.zzc.zza((Class)object);
            zzaco.zzc(object, (String)object2);
            object2 = this.zzd;
            object = object2.putIfAbsent(object, zzadx2);
            if (object != null) {
                return object;
            }
        }
        return zzadx2;
    }
}

