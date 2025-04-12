/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcsd;
import com.google.android.gms.internal.ads.zzevb;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhld;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.Set;

public final class zzevd
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;

    public zzevd(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
    }

    public final zzevb zza() {
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        ViewGroup viewGroup = ((zzcsd)this.zzb).zza();
        Context context = (Context)this.zzc.zzb();
        Set set = ((zzhld)this.zzd).zzc();
        zzevb zzevb2 = new zzevb(zzgge2, viewGroup, context, set);
        return zzevb2;
    }
}

