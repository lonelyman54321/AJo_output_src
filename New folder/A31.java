/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 *  org.json.JSONObject
 */
import ai.haptik.android.wrapper.sdk.HaptikWebView;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class A31
implements Runnable {
    public final /* synthetic */ HaptikWebView a;
    public final /* synthetic */ JSONObject b;

    public /* synthetic */ A31(HaptikWebView haptikWebView, JSONObject jSONObject) {
        this.a = haptikWebView;
        this.b = jSONObject;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        JSONObject jSONObject = this.b;
        Intrinsics.checkNotNullParameter(jSONObject, "$userData");
        WebView webView = ((HaptikWebView)object).X;
        if (webView != null) {
            object = new StringBuilder("javascript:window.HaptikSDK.updateUserData('");
            ((StringBuilder)object).append(jSONObject);
            ((StringBuilder)object).append("')");
            object = ((StringBuilder)object).toString();
            webView.loadUrl((String)object);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webView");
        throw null;
    }
}

