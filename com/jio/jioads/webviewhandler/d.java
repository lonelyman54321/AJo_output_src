/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.GeolocationPermissions$Callback
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 */
package com.jio.jioads.webviewhandler;

import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.jio.jioads.webviewhandler.InAppWebView;
import kotlin.jvm.internal.Intrinsics;

public final class d
extends WebChromeClient {
    public final /* synthetic */ InAppWebView a;

    public d(InAppWebView inAppWebView) {
        this.a = inAppWebView;
    }

    public final void onGeolocationPermissionsShowPrompt(String string2, GeolocationPermissions.Callback callback2) {
        Intrinsics.checkNotNullParameter(string2, "origin");
        Intrinsics.checkNotNullParameter(callback2, "callback");
        super.onGeolocationPermissionsShowPrompt(string2, callback2);
        callback2.invoke(string2, false, true);
    }

    public final void onProgressChanged(WebView webView, int n3) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(webView, string2);
        super.onProgressChanged(webView, n3);
        webView = this.a.c;
        if (webView != null) {
            Intrinsics.checkNotNull(webView);
            webView.setProgress(n3);
        }
    }
}

