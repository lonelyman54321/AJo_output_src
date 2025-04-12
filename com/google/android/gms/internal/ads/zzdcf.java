/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdce;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhld;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.Set;

public final class zzdcf
implements zzhkp {
    private final zzhlg zza;

    public zzdcf(zzhlg zzhlg2) {
        this.zza = zzhlg2;
    }

    public final zzdce zza() {
        Set set = ((zzhld)this.zza).zzc();
        zzdce zzdce2 = new zzdce(set);
        return zzdce2;
    }
}

