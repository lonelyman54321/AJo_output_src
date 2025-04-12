/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzckt;
import com.google.android.gms.internal.ads.zzckw;
import com.google.android.gms.internal.ads.zzcla;
import com.google.android.gms.internal.ads.zzeza;
import com.google.android.gms.internal.ads.zzezl;
import com.google.android.gms.internal.ads.zzezm;
import com.google.android.gms.internal.ads.zzhkx;

final class zzcku
implements zzezl {
    private final zzcla zza;
    private zzeza zzb;

    public /* synthetic */ zzcku(zzcla zzcla2, zzckt zzckt2) {
        this.zza = zzcla2;
    }

    public final /* synthetic */ zzezl zza(zzeza zzeza2) {
        this.zzb = zzeza2;
        return this;
    }

    public final zzezm zzb() {
        zzhkx.zzc(this.zzb, zzeza.class);
        zzcla zzcla2 = this.zza;
        zzeza zzeza2 = this.zzb;
        zzckw zzckw2 = new zzckw(zzcla2, zzeza2, null);
        return zzckw2;
    }
}

