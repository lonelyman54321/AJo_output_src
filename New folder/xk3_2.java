/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/*
 * Renamed from xK3
 */
public final class xk3_2 {
    public static /* bridge */ /* synthetic */ boolean a(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest) {
        return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}

