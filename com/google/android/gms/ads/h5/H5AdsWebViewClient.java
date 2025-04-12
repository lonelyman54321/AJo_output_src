/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbmx;

public final class H5AdsWebViewClient
extends zzbmk {
    private final zzbmx zza;

    public H5AdsWebViewClient(Context context, WebView webView) {
        zzbmx zzbmx2;
        this.zza = zzbmx2 = new zzbmx(context, webView);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    public WebViewClient getDelegate() {
        return this.zza;
    }

    public WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient) {
        this.zza.zzb(webViewClient);
    }
}

