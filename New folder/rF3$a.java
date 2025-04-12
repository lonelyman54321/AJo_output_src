/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.http.SslError
 *  android.webkit.SslErrorHandler
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.services.helper.UrlHelper;

public final class rF3$a
extends WebViewClient {
    public final /* synthetic */ rf3_1 a;

    public rF3$a(rf3_1 rf3_12) {
        this.a = rf3_12;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onPageFinished(WebView object, String string2) {
        try {
            object = this.a;
        }
        catch (Exception exception) {
            return;
        }
        object = ((rf3_1)object).c;
        ((PEProgressView)((Object)object)).dismiss();
    }

    public final void onPageStarted(WebView webView, String string2, Bitmap bitmap) {
        super.onPageStarted(webView, string2, bitmap);
        this.a.c.show();
    }

    public final void onReceivedSslError(WebView object, SslErrorHandler sslErrorHandler, SslError sslError) {
        object = UrlHelper.getInstance();
        boolean bl2 = ((UrlHelper)object).isUATDomain();
        if (bl2) {
            sslErrorHandler.proceed();
        } else {
            sslErrorHandler.cancel();
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String string2) {
        webView.loadUrl(string2);
        return true;
    }
}

