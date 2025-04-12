/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.SafeBrowsingResponse
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/*
 * Renamed from yK3
 */
public final class yk3_2 {
    public static /* bridge */ /* synthetic */ void a(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, int n3, SafeBrowsingResponse safeBrowsingResponse) {
        webViewClient.onSafeBrowsingHit(webView, webResourceRequest, n3, safeBrowsingResponse);
    }
}

