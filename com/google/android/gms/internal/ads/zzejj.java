/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzciv;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzdhi;

public final class zzejj
implements zzdaf {
    public final /* synthetic */ zzchd zza;

    public /* synthetic */ zzejj(zzchd zzchd2) {
        this.zza = zzchd2;
    }

    public final void zzr() {
        zzdhi zzdhi2 = this.zza;
        zzciv zzciv2 = zzdhi2.zzN();
        if (zzciv2 != null) {
            zzdhi2 = zzdhi2.zzN();
            zzdhi2.zzr();
        }
    }
}

