/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads;

import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.internal.client.zzdx;

public final class zza
implements Runnable {
    public final /* synthetic */ AdLoader zza;
    public final /* synthetic */ zzdx zzb;

    public /* synthetic */ zza(AdLoader adLoader2, zzdx zzdx2) {
        this.zza = adLoader2;
        this.zzb = zzdx2;
    }

    public final void run() {
        AdLoader adLoader2 = this.zza;
        zzdx zzdx2 = this.zzb;
        adLoader2.zza(zzdx2);
    }
}

