/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.a;
import kotlin.jvm.internal.Intrinsics;

public final class UH$b
extends WebViewClient {
    public final /* synthetic */ uh_0 a;

    public UH$b(uh_0 uh_02) {
        this.a = uh_02;
    }

    public final boolean shouldOverrideUrlLoading(WebView object, String string2) {
        xf1_1 xf1_12;
        object = this.a;
        object.getClass();
        CTInAppAction.CREATOR.getClass();
        Intrinsics.checkNotNullParameter(string2, "url");
        CTInAppAction cTInAppAction = new CTInAppAction(null);
        cTInAppAction.a = xf1_12 = xf1_1.OPEN_URL;
        cTInAppAction.b = string2;
        ((a)object).Ta(cTInAppAction, null, null);
        return true;
    }
}

