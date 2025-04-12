/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads;

import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.internal.ads.zzbwj;

public final class zzd
implements Runnable {
    public final /* synthetic */ BaseAdView zza;

    public /* synthetic */ zzd(BaseAdView baseAdView) {
        this.zza = baseAdView;
    }

    public final void run() {
        zzea zzea2;
        BaseAdView baseAdView = this.zza;
        try {
            zzea2 = baseAdView.zza;
        }
        catch (IllegalStateException illegalStateException) {
            zzbwj.zza(baseAdView.getContext()).zzh(illegalStateException, "BaseAdView.destroy");
            return;
        }
        zzea2.zzk();
    }
}

