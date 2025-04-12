/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 */
package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzfpl;

final class zzfpk
implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzfpl zzc;

    public zzfpk(zzfpl zzfpl2, WebView webView, String string2) {
        this.zza = webView;
        this.zzb = string2;
        this.zzc = zzfpl2;
    }

    public final void run() {
        WebView webView = this.zza;
        String string2 = this.zzb;
        zzfpl.zzj(webView, string2);
    }
}

