/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 */
package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzfpw;

final class zzfpv
implements Runnable {
    final /* synthetic */ zzfpw zza;
    private final WebView zzb;

    public zzfpv(zzfpw zzfpw2) {
        this.zza = zzfpw2;
        zzfpw2 = zzfpw.zzo(zzfpw2);
        this.zzb = zzfpw2;
    }

    public final void run() {
        this.zzb.destroy();
    }
}

