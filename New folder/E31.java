/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import ai.haptik.android.wrapper.sdk.HaptikSDK;
import ai.haptik.android.wrapper.sdk.HaptikWebView;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class E31
implements Runnable {
    public final /* synthetic */ JSONObject a;
    public final /* synthetic */ HaptikWebView b;

    public /* synthetic */ E31(HaptikWebView haptikWebView, JSONObject jSONObject) {
        this.a = jSONObject;
        this.b = haptikWebView;
    }

    public final void run() {
        HaptikWebView haptikWebView = this.b;
        Intrinsics.checkNotNullParameter(haptikWebView, "this$0");
        Object object = this.a;
        String string2 = object.getString("message");
        String string3 = object.getString("hidden");
        String string4 = object.getString("skipMessage");
        CharSequence charSequence = "hideWelcomeMessage";
        object = object.getString((String)charSequence);
        haptikWebView = haptikWebView.X;
        if (haptikWebView != null) {
            charSequence = new StringBuilder("javascript:window.HaptikSDK.launchMessage(\"");
            ((StringBuilder)charSequence).append((Object)string2);
            ((StringBuilder)charSequence).append("\", null, ");
            ((StringBuilder)charSequence).append((Object)string3);
            ((StringBuilder)charSequence).append(", false, ");
            ((StringBuilder)charSequence).append((Object)string4);
            ((StringBuilder)charSequence).append(", ");
            ((StringBuilder)charSequence).append(object);
            ((StringBuilder)charSequence).append(')');
            string2 = ((StringBuilder)charSequence).toString();
            haptikWebView.loadUrl(string2);
            HaptikSDK.INSTANCE.clearLaunchMessage$sdk_release();
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webView");
        throw null;
    }
}

