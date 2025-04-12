/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfoa;
import com.google.android.gms.internal.ads.zzfoe;
import java.util.List;

public final class zzcqh
implements zzczo {
    private final zzfgw zza;
    private final zzfhf zzb;
    private final zzfoa zzc;
    private final zzfoe zzd;

    public zzcqh(zzfhf object, zzfoe zzfoe2, zzfoa zzfoa2) {
        this.zzb = object;
        this.zzd = zzfoe2;
        this.zzc = zzfoa2;
        this.zza = object = ((zzfhf)object).zzb.zzb;
    }

    public final void zzdB(zze object) {
        object = this.zza.zza;
        zzfoa zzfoa2 = this.zzc;
        zzfhf zzfhf2 = this.zzb;
        zzfoe zzfoe2 = this.zzd;
        object = zzfoa2.zzc(zzfhf2, null, (List)object);
        zzfoe2.zzd((List)object);
    }
}

