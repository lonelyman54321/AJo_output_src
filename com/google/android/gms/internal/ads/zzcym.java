/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbvl;
import com.google.android.gms.internal.ads.zzcvg;
import com.google.android.gms.internal.ads.zzcyl;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzcym
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzcym(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
    }

    public final /* synthetic */ Object zzb() {
        Context context = (Context)this.zza.zzb();
        zzfgt zzfgt2 = ((zzcvg)this.zzb).zza();
        zzbvl zzbvl2 = new zzbvl();
        zzcyl zzcyl2 = new zzcyl(context, zzfgt2, zzbvl2);
        return zzcyl2;
    }
}

