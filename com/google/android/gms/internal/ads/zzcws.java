/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.internal.ads.zzcww;
import com.google.android.gms.internal.ads.zzfho;

public final class zzcws
implements zza {
    private final zzcww zza;
    private final zzfho zzb;

    public zzcws(zzcww zzcww2, zzfho zzfho2) {
        this.zza = zzcww2;
        this.zzb = zzfho2;
    }

    public final void onAdClicked() {
        Object object = this.zzb;
        zzcww zzcww2 = this.zza;
        object = ((zzfho)object).zzf;
        zzcww2.zzc((String)object);
    }
}

