/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzczx;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhld;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.Set;

public final class zzczz
implements zzhkp {
    private final zzhlg zza;

    public zzczz(zzhlg zzhlg2) {
        this.zza = zzhlg2;
    }

    public final zzczx zza() {
        Set set = ((zzhld)this.zza).zzc();
        zzczx zzczx2 = new zzczx(set);
        return zzczx2;
    }
}

