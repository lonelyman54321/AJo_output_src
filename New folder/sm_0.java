/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/*
 * Renamed from sm
 */
public final class sm_0 {
    public static PackageInfo a() {
        return rm_0.a();
    }

    public static boolean b(WebSettings webSettings) {
        return qm_0.b(webSettings);
    }

    public static WebChromeClient c(WebView webView) {
        return nm.a(webView);
    }

    public static WebViewClient d(WebView webView) {
        return pm.b(webView);
    }

    public static void e(WebSettings webSettings, boolean bl2) {
        om.b(webSettings, bl2);
    }
}

