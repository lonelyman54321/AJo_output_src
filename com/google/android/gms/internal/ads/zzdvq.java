/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzdha;
import com.google.android.gms.internal.ads.zzdwa;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public final class zzdvq {
    public static final Set zza(zzdwa zzdwa2, Executor executor) {
        return zzdvq.zzj(zzdwa2, executor);
    }

    public static final Set zzb(zzdwa zzdwa2, Executor executor) {
        return zzdvq.zzj(zzdwa2, executor);
    }

    public static final Set zzc(zzdwa zzdwa2, Executor executor) {
        return zzdvq.zzj(zzdwa2, executor);
    }

    public static final Set zzd(zzdwa zzdwa2, Executor executor) {
        return zzdvq.zzj(zzdwa2, executor);
    }

    public static final Set zze(zzdwa zzdwa2, Executor executor) {
        return zzdvq.zzj(zzdwa2, executor);
    }

    public static final Set zzf(zzdwa zzdwa2, Executor executor) {
        return zzdvq.zzj(zzdwa2, executor);
    }

    public static final Set zzg(zzdwa zzdwa2, Executor executor) {
        return zzdvq.zzj(zzdwa2, executor);
    }

    public static final Set zzh(zzdwa zzdwa2, Executor executor) {
        return zzdvq.zzj(zzdwa2, executor);
    }

    public static final Set zzi(zzdwa zzdwa2, Executor executor) {
        return zzdvq.zzj(zzdwa2, executor);
    }

    private static final Set zzj(Object object, Executor executor) {
        Object object2 = (Boolean)zzbgm.zza.zze();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = new zzdha(object, executor);
            return Collections.singleton(object2);
        }
        return Collections.emptySet();
    }
}

