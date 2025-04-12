/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.RenderProcessGoneDetail
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.google.android.gms.internal.ads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzfps;
import com.google.android.gms.internal.ads.zzfpw;

final class zzfpu
extends WebViewClient {
    final /* synthetic */ zzfpw zza;

    public zzfpu(zzfpw zzfpw2) {
        this.zza = zzfpw2;
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail object) {
        object.toString();
        String.valueOf(webView);
        object = this.zza.zza();
        if (object == webView) {
            object = this.zza;
            ((zzfps)object).zzm(null);
        }
        webView.destroy();
        return true;
    }
}

