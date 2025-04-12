/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhko;
import com.google.android.gms.internal.ads.zzhky;

public final class zzhle
implements zzhky {
    private static final Object zza;
    private volatile zzhky zzb;
    private volatile Object zzc;

    static {
        Object object;
        zza = object = new Object();
    }

    private zzhle(zzhky zzhky2) {
        Object object;
        this.zzc = object = zza;
        this.zzb = zzhky2;
    }

    public static zzhky zza(zzhky zzhky2) {
        boolean bl2 = zzhky2 instanceof zzhle;
        if (!bl2 && !(bl2 = zzhky2 instanceof zzhko)) {
            zzhle zzhle2 = new zzhle(zzhky2);
            return zzhle2;
        }
        return zzhky2;
    }

    public final Object zzb() {
        Object object = this.zzc;
        Object object2 = zza;
        if (object == object2) {
            object = this.zzb;
            if (object == null) {
                object = this.zzc;
            } else {
                this.zzc = object = object.zzb();
                object2 = null;
                this.zzb = null;
            }
        }
        return object;
    }
}

