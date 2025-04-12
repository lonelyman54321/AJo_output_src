/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.http.SslError
 *  android.webkit.SslErrorHandler
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.ril.ajio.customviews.widgets;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ril.ajio.services.helper.UrlHelper;

public class AjioProxyByPassClient
extends WebViewClient {
    public void onReceivedSslError(WebView object, SslErrorHandler sslErrorHandler, SslError sslError) {
        object = UrlHelper.getInstance();
        boolean bl2 = ((UrlHelper)object).isUATDomain();
        if (bl2) {
            sslErrorHandler.proceed();
            sslError.getCertificate();
        } else {
            sslErrorHandler.cancel();
        }
    }
}

