/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.ValueCallback
 *  android.webkit.WebView
 */
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.jpl.crasdk.CraActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ld0
 */
public final class ld0_1
implements Runnable {
    public final /* synthetic */ CraActivity a;
    public final /* synthetic */ String b;

    public /* synthetic */ ld0_1(CraActivity craActivity, String string2) {
        this.a = craActivity;
        this.b = string2;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        WebView webView = ((CraActivity)object).Y;
        if (webView != null) {
            object = new StringBuilder("javascript:sendOtp('");
            Object object2 = this.b;
            String string2 = "')";
            object = h30_0.a((StringBuilder)object, (String)object2, string2);
            object2 = new Object();
            webView.evaluateJavascript((String)object, (ValueCallback)object2);
        }
    }
}

