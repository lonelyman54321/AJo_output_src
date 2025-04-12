/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzelh;
import com.google.android.gms.internal.ads.zzeli;
import com.google.android.gms.internal.ads.zzelo;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzelp
implements zzhkp {
    private final zzelo zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzelp(zzelo zzelo2, zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5) {
        this.zza = zzelo2;
        this.zzb = zzhlg2;
        this.zzc = zzhlg3;
        this.zzd = zzhlg4;
        this.zze = zzhlg5;
    }

    public final /* synthetic */ Object zzb() {
        Clock clock = (Clock)this.zzb.zzb();
        zzelh zzelh2 = ((zzeli)this.zzc).zza();
        zzehq zzehq2 = (zzehq)this.zzd.zzb();
        zzfoe zzfoe2 = (zzfoe)this.zze.zzb();
        return this.zza.zza(clock, zzelh2, zzehq2, zzfoe2);
    }
}

