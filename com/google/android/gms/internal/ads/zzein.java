/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzctg;
import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzeim;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.Executor;

public final class zzein
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;

    public zzein(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6, zzhlg zzhlg7) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
        this.zze = zzhlg6;
        this.zzf = zzhlg7;
    }

    public final zzeim zza() {
        Object object;
        Object object2 = object = this.zza.zzb();
        object2 = (zzctg)object;
        Object object3 = object = this.zzb.zzb();
        object3 = (Context)object;
        Object object4 = object = this.zzc.zzb();
        object4 = (Executor)object;
        Object object5 = object = this.zzd.zzb();
        object5 = (zzdsd)object;
        zzfho zzfho2 = ((zzczc)this.zze).zza();
        Object object6 = object = this.zzf.zzb();
        object6 = (zzfxu)object;
        object = new zzeim((zzctg)object2, (Context)object3, (Executor)object4, (zzdsd)object5, zzfho2, (zzfxu)object6);
        return object;
    }
}

