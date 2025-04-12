/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzbmf;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbpr;

public final class zzbpq
implements Runnable {
    public final /* synthetic */ zzbpr zza;
    public final /* synthetic */ zzboo zzb;

    public /* synthetic */ zzbpq(zzbpr zzbpr2, zzboo zzboo2) {
        this.zza = zzbpr2;
        this.zzb = zzboo2;
    }

    public final void run() {
        zzboo zzboo2 = this.zzb;
        zzbmf zzbmf2 = zzblo.zzo;
        zzboo2.zzr("/result", zzbmf2);
        zzboo2.zzc();
    }
}

