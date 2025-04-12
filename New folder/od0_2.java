/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.jpl.crasdk.CraActivity;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from od0
 */
public final class od0_2
extends WebViewClient {
    public final /* synthetic */ CraActivity a;

    public od0_2(CraActivity craActivity) {
        this.a = craActivity;
    }

    public final void onPageFinished(WebView object, String string2) {
        super.onPageFinished((WebView)object, string2);
        this.a.Z = true;
        object = new StringBuilder("onpage finish=");
        ((StringBuilder)object).append(string2);
        object = ((StringBuilder)object).toString();
        Intrinsics.checkNotNullParameter("TAG", "tag");
        Intrinsics.checkNotNullParameter(object, "msg");
    }

    public final void onPageStarted(WebView object, String string2, Bitmap bitmap) {
        super.onPageStarted((WebView)object, string2, bitmap);
        object = new StringBuilder("onpage start=");
        ((StringBuilder)object).append(string2);
        object = ((StringBuilder)object).toString();
        Intrinsics.checkNotNullParameter("TAG", "tag");
        Intrinsics.checkNotNullParameter(object, "msg");
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest object) {
        block8: {
            if (object != null) {
                boolean bl2;
                try {
                    bl2 = object.isForMainFrame();
                    if (bl2) break block8;
                }
                catch (Exception exception) {}
                object = object.getUrl();
                object = object.getPath();
                if (object == null) break block8;
                String string2 = "/favicon.ico";
                boolean bl3 = b.h((String)object, string2, false);
                bl2 = true;
                if (bl3 != bl2) break block8;
                string2 = "image/png";
                object = new WebResourceResponse(string2, null, null);
                return object;
            }
        }
        return null;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView object, String object2) {
        object = Ft2.a((String)object2, "");
        object2 = Locale.ROOT;
        object = ((String)object).toLowerCase((Locale)object2);
        Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String string2 = "/favicon.ico";
        boolean bl2 = StringsKt.F((CharSequence)object, string2, false);
        object2 = null;
        if (bl2) {
            string2 = "image/png";
            try {
                object = new WebResourceResponse(string2, null, null);
                return object;
            }
            catch (Exception exception) {}
        }
        return null;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Intrinsics.checkNotNullParameter(webView, "view");
        Intrinsics.checkNotNullParameter(webResourceRequest, "request");
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}

