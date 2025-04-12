/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 */
import ai.haptik.android.wrapper.sdk.HaptikWebView;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

public final class F31
implements Runnable {
    public final /* synthetic */ HaptikWebView a;
    public final /* synthetic */ String b;

    public /* synthetic */ F31(HaptikWebView haptikWebView, String string2) {
        this.a = haptikWebView;
        this.b = string2;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$token");
        WebView webView = ((HaptikWebView)object).X;
        if (webView != null) {
            object = new StringBuilder("javascript:window.HaptikSDK.updatePushNotificationToken(\"");
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append("\")");
            object = ((StringBuilder)object).toString();
            webView.loadUrl((String)object);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webView");
        throw null;
    }
}

