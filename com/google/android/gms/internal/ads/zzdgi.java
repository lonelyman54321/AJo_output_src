/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgh;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhld;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.Set;

public final class zzdgi
implements zzhkp {
    private final zzhlg zza;

    public zzdgi(zzhlg zzhlg2) {
        this.zza = zzhlg2;
    }

    public final zzdgh zza() {
        Set set = ((zzhld)this.zza).zzc();
        zzdgh zzdgh2 = new zzdgh(set);
        return zzdgh2;
    }
}

