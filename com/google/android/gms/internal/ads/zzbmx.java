/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbmw;
import com.google.android.gms.internal.ads.zzfyg;

public final class zzbmx
extends zzbmk {
    public static final /* synthetic */ int zza;
    private WebViewClient zzb;
    private final H5AdsRequestHandler zzc;
    private final WebView zzd;

    public zzbmx(Context context, WebView object) {
        context.getClass();
        object.getClass();
        zzfyg.zzf(object.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = object;
        zzbmw zzbmw2 = new zzbmw((WebView)object);
        super(context, zzbmw2);
        this.zzc = object;
    }

    private final boolean zzc(WebView webView) {
        WebView webView2 = this.zzd;
        boolean bl2 = webView2.equals(webView);
        if (bl2) {
            return true;
        }
        zzm.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    public final WebViewClient getDelegate() {
        return this.zzb;
    }

    public final void onLoadResource(WebView webView, String string2) {
        H5AdsRequestHandler h5AdsRequestHandler;
        boolean bl2 = this.zzc(webView);
        if (bl2 && !(bl2 = (h5AdsRequestHandler = this.zzc).handleH5AdsRequest(string2))) {
            super.onLoadResource(webView, string2);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object object = this.zzd;
        boolean bl2 = this.zzc((WebView)object);
        if (!bl2) {
            return false;
        }
        H5AdsRequestHandler h5AdsRequestHandler = this.zzc;
        object = webResourceRequest.getUrl().toString();
        bl2 = h5AdsRequestHandler.handleH5AdsRequest((String)object);
        if (bl2) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String string2) {
        boolean bl2 = this.zzc(webView);
        if (!bl2) {
            return false;
        }
        H5AdsRequestHandler h5AdsRequestHandler = this.zzc;
        bl2 = h5AdsRequestHandler.handleH5AdsRequest(string2);
        if (bl2) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, string2);
    }

    public final void zza() {
        this.zzc.clearAdObjects();
    }

    public final void zzb(WebViewClient webViewClient) {
        boolean bl2 = webViewClient != this;
        zzfyg.zzf(bl2, "Delegate cannot be itself.");
        this.zzb = webViewClient;
    }
}

