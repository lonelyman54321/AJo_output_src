/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/*
 * Renamed from zK3
 */
public final class zk3_2 {
    public static /* bridge */ /* synthetic */ void a(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }
}

