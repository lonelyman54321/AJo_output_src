/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.web.a;

/*
 * Renamed from AF3
 */
public final class af3_2 {
    public static final void a(WebView webView, a object, hu1_1 hu1_12, int n3, nc1_2 nc1_22) {
        int n4;
        Object object2;
        boolean bl2 = true;
        if (webView != null && (object2 = webView.getSettings()) != null) {
            object2.setLoadsImagesAutomatically(bl2);
        }
        if (webView != null && (object2 = webView.getSettings()) != null) {
            object2.setJavaScriptEnabled(bl2);
        }
        if (webView != null) {
            object2 = null;
            webView.setScrollBarStyle(0);
        }
        if (webView != null && (object2 = webView.getSettings()) != null) {
            object2.setDomStorageEnabled(bl2);
        }
        if (webView != null && (object2 = webView.getSettings()) != null) {
            object2.setSaveFormData(bl2);
        }
        if (webView != null && (object2 = webView.getSettings()) != null) {
            object2.setAllowContentAccess(bl2);
        }
        if (webView != null && (object2 = webView.getSettings()) != null) {
            object2.setAllowFileAccess(bl2);
        }
        if (webView != null && (object2 = webView.getSettings()) != null) {
            object2.setAllowFileAccessFromFileURLs(bl2);
        }
        if (webView != null && (object2 = webView.getSettings()) != null) {
            object2.setAllowUniversalAccessFromFileURLs(bl2);
        }
        if (webView != null && (object2 = webView.getSettings()) != null) {
            object2.setSupportZoom(bl2);
        }
        if (webView != null) {
            z40$a z40$a = z40_0.Companion;
            String string2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.b("android_accept_ssl");
            z40$a = object2;
            object2 = new di0_1((a)object, string2, hu1_12, n3, nc1_22);
            webView.setWebViewClient((WebViewClient)object2);
        }
        if (webView != null) {
            webView.setClickable(bl2);
        }
        if (webView != null) {
            object = new WebChromeClient();
            webView.setWebChromeClient((WebChromeClient)object);
        }
        if (n3 == (n4 = 18)) {
            if (webView != null) {
                webView.setInitialScale((int)(bl2 ? 1 : 0));
            }
            if (webView != null && (object = webView.getSettings()) != null) {
                object.setUseWideViewPort(bl2);
            }
        }
        if (n3 == (n4 = 21) || n3 == (n4 = 22)) {
            if (webView != null) {
                webView.clearCache(bl2);
            }
            if (webView != null) {
                webView.clearHistory();
            }
            if (webView != null) {
                webView.clearFormData();
            }
            if (webView != null) {
                webView.clearMatches();
            }
            if (webView != null && (webView = webView.getSettings()) != null) {
                n4 = 2;
                webView.setCacheMode(n4);
            }
        }
    }

    public static /* synthetic */ void b(WebView webView, a a2) {
        af3_2.a(webView, a2, null, -1, null);
    }
}

