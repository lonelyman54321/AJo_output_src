/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcvg;
import com.google.android.gms.internal.ads.zzcvh;
import com.google.android.gms.internal.ads.zzcvi;
import com.google.android.gms.internal.ads.zzcze;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzczf
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzczf(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
        this.zze = zzhlg6;
    }

    public final zzcze zza() {
        Object object;
        zzfgt zzfgt2 = ((zzcvg)this.zza).zza();
        String string2 = ((zzcvh)this.zzb).zza();
        Object object2 = object = this.zzc.zzb();
        object2 = (zzehq)object;
        zzfgw zzfgw2 = ((zzcvi)this.zzd).zza();
        Object object3 = object = this.zze.zzb();
        object3 = (String)object;
        object = new zzcze(zzfgt2, string2, (zzehq)object2, zzfgw2, (String)object3);
        return object;
    }
}

