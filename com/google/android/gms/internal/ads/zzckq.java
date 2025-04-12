/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzckp;
import com.google.android.gms.internal.ads.zzcks;
import com.google.android.gms.internal.ads.zzcla;
import com.google.android.gms.internal.ads.zzezj;
import com.google.android.gms.internal.ads.zzezk;
import com.google.android.gms.internal.ads.zzfar;
import com.google.android.gms.internal.ads.zzhkx;

final class zzckq
implements zzezj {
    private final zzcla zza;
    private zzfar zzb;

    public /* synthetic */ zzckq(zzcla zzcla2, zzckp zzckp2) {
        this.zza = zzcla2;
    }

    public final /* synthetic */ zzezj zza(zzfar zzfar2) {
        this.zzb = zzfar2;
        return this;
    }

    public final zzezk zzb() {
        zzhkx.zzc(this.zzb, zzfar.class);
        zzcla zzcla2 = this.zza;
        zzfar zzfar2 = this.zzb;
        zzcks zzcks2 = new zzcks(zzcla2, zzfar2, null);
        return zzcks2;
    }
}

