/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhf;

public final class zzcvf {
    private final zzfhf zza;
    private final zzfgt zzb;
    private final String zzc;

    public zzcvf(zzfhf zzfhf2, zzfgt zzfgt2, String string2) {
        this.zza = zzfhf2;
        this.zzb = zzfgt2;
        if (string2 == null) {
            string2 = "com.google.ads.mediation.admob.AdMobAdapter";
        }
        this.zzc = string2;
    }

    public final zzfgt zza() {
        return this.zzb;
    }

    public final zzfgw zzb() {
        return this.zza.zzb.zzb;
    }

    public final zzfhf zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzc;
    }
}

