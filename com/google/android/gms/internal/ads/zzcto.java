/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzcto
implements zzhkp {
    private final zzhlg zza;

    public zzcto(zzhlg zzhlg2) {
        this.zza = zzhlg2;
    }

    public final Boolean zza() {
        Object object = ((zzczc)this.zza).zza().zza();
        boolean bl2 = true;
        if (object == null) {
            object = zzbep.zzfG;
            zzben zzben2 = zzba.zzc();
            object = (Boolean)zzben2.zza((zzbeg)object);
            boolean bl3 = (Boolean)object;
            if (!bl3) {
                bl2 = false;
            }
        }
        return bl2;
    }
}

