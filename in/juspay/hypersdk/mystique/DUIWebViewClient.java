/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.RenderProcessGoneDetail
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package in.juspay.hypersdk.mystique;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import in.juspay.hypersdk.mystique.WebClientCallback;

public class DUIWebViewClient
extends WebViewClient {
    private WebClientCallback callback;

    public DUIWebViewClient(WebClientCallback webClientCallback) {
        this.callback = webClientCallback;
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.callback.onRenderProcessGone(webView);
        return true;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String string2) {
        webView.loadUrl(string2);
        return true;
    }
}

