/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdbb;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhld;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.Set;

public final class zzdbc
implements zzhkp {
    private final zzhlg zza;

    public zzdbc(zzhlg zzhlg2) {
        this.zza = zzhlg2;
    }

    public static zzdbb zzc(Set set) {
        zzdbb zzdbb2 = new zzdbb(set);
        return zzdbb2;
    }

    public final zzdbb zza() {
        Set set = ((zzhld)this.zza).zzc();
        zzdbb zzdbb2 = new zzdbb(set);
        return zzdbb2;
    }
}

