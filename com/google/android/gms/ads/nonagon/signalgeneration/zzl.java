/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzax;
import com.google.android.gms.ads.nonagon.signalgeneration.zzk;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdhu;
import com.google.android.gms.internal.ads.zzdux;

public final class zzl
implements zzdhu {
    private final zzdux zza;
    private final zzk zzb;
    private final String zzc;

    public zzl(zzdux zzdux2, zzk zzk2, String string2) {
        this.zza = zzdux2;
        this.zzb = zzk2;
        this.zzc = string2;
    }

    public final void zze(zzax object) {
        if (object != null) {
            Object object2 = zzbep.zzhg;
            Object object3 = zzba.zzc();
            object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
            boolean bl2 = (Boolean)object2;
            if (bl2) {
                object2 = this.zzb;
                object3 = this.zzc;
                zzdux zzdux2 = this.zza;
                object = ((zzax)object).zzb;
                ((zzk)object2).zzd((String)object3, (String)object, zzdux2);
            }
        }
    }

    public final void zzf(String string2) {
    }
}

