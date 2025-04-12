/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfls;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhld;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.Set;

public final class zzflw
implements zzhkp {
    private final zzhlg zza;

    public zzflw(zzhlg zzhlg2) {
        this.zza = zzhlg2;
    }

    public final zzfls zza() {
        Set set = ((zzhld)this.zza).zzc();
        zzfls zzfls2 = new zzfls(set);
        return zzfls2;
    }
}

