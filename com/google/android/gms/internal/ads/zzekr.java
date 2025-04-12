/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcus;
import com.google.android.gms.internal.ads.zzekp;
import com.google.android.gms.internal.ads.zzelf;
import com.google.android.gms.internal.ads.zzfoa;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.ScheduledExecutorService;

public final class zzekr
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzekr(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
        this.zze = zzhlg6;
    }

    public final zzekp zza() {
        zzekp zzekp2;
        Object object;
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        Object object2 = object = this.zzb.zzb();
        object2 = (ScheduledExecutorService)object;
        Object object3 = object = this.zzc.zzb();
        object3 = (zzcus)object;
        Object object4 = object = this.zzd.zzb();
        object4 = (zzelf)object;
        Object object5 = object = this.zze.zzb();
        object5 = (zzfoa)object;
        object = zzekp2;
        zzekp2 = new zzekp(zzgge2, (ScheduledExecutorService)object2, (zzcus)object3, (zzelf)object4, (zzfoa)object5);
        return zzekp2;
    }
}

