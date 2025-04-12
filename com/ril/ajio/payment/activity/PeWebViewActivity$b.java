/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.http.SslError
 *  android.os.Message
 *  android.webkit.SslErrorHandler
 *  android.webkit.ValueCallback
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.ril.ajio.payment.activity;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.payment.activity.PeWebViewActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class PeWebViewActivity$b
extends WebViewClient {
    public final /* synthetic */ PeWebViewActivity a;

    public PeWebViewActivity$b(PeWebViewActivity peWebViewActivity) {
        this.a = peWebViewActivity;
    }

    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        Intrinsics.checkNotNullParameter(webView, "view");
        Intrinsics.checkNotNullParameter(message, "dontResend");
        Intrinsics.checkNotNullParameter(message2, "resend");
        super.onFormResubmission(webView, message, message2);
    }

    public final void onPageFinished(WebView webView, String object) {
        boolean bl2;
        Object object2;
        Object object3;
        Intrinsics.checkNotNullParameter(webView, "view");
        Intrinsics.checkNotNullParameter(object, "url");
        super.onPageFinished(webView, (String)object);
        Object object4 = this.a;
        int n3 = object4.isFinishing();
        if (n3 == 0) {
            object3 = ((PeWebViewActivity)object4).p0;
            object2 = null;
            String string2 = "webProgressView";
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object3 = null;
            }
            if ((n3 = object3.getVisibility()) == 0) {
                object3 = ((PeWebViewActivity)object4).p0;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = object3;
                }
                ((PEProgressView)((Object)object2)).dismiss();
            }
        }
        object3 = "/payment-engine/api/v1/callback";
        Intrinsics.checkNotNullExpressionValue(object3, "finlurl");
        object2 = null;
        n3 = (int)(StringsKt.F((CharSequence)object, object3, false) ? 1 : 0);
        if (n3 != 0 && !(bl2 = b.s((String)object, object3 = "data:text/html,", false))) {
            object = new nq2_2((PeWebViewActivity)object4);
            object4 = "(function(){return window.document.getElementsByTagName('html')[0].innerHTML})();";
            webView.evaluateJavascript((String)object4, (ValueCallback)object);
        }
    }

    public final void onPageStarted(WebView object, String object2, Bitmap bitmap) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onPageStarted(object, object2, bitmap);
        object = this.a;
        int n3 = object.isFinishing();
        if (n3 == 0) {
            int n4;
            object2 = object.p0;
            bitmap = null;
            string2 = "webProgressView";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
            }
            if ((n3 = object2.getVisibility()) == (n4 = 8)) {
                object = object.p0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    bitmap = object;
                }
                bitmap.show();
            }
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Intrinsics.checkNotNullParameter(webView, "view");
        Intrinsics.checkNotNullParameter(sslErrorHandler, "handler");
        Intrinsics.checkNotNullParameter(sslError, "error");
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        sslErrorHandler.proceed();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Intrinsics.checkNotNullParameter(webView, "view");
        Intrinsics.checkNotNullParameter(webResourceRequest, "request");
        webView.getUrl();
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String string2) {
        Intrinsics.checkNotNullParameter(webView, "view");
        Intrinsics.checkNotNullParameter(string2, "url");
        webView.loadUrl(string2);
        return true;
    }
}

