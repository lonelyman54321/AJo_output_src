/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 */
import ai.haptik.android.wrapper.sdk.HaptikWebView;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

public final class C31
implements Runnable {
    public final /* synthetic */ HaptikWebView a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ C31(HaptikWebView haptikWebView, String string2, boolean bl2) {
        this.a = haptikWebView;
        this.b = string2;
        this.c = bl2;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        WebView webView = ((HaptikWebView)object).X;
        if (webView != null) {
            object = new StringBuilder("javascript:window.HaptikSDK.changeLanguage(\"");
            String string2 = this.b;
            ((StringBuilder)object).append((Object)string2);
            ((StringBuilder)object).append("\", ");
            boolean bl2 = this.c;
            ((StringBuilder)object).append(bl2);
            ((StringBuilder)object).append(')');
            object = ((StringBuilder)object).toString();
            webView.loadUrl((String)object);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webView");
        throw null;
    }
}

