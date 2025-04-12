/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package ai.haptik.android.wrapper.sdk;

import ai.haptik.android.wrapper.sdk.HaptikSDK;
import ai.haptik.android.wrapper.sdk.HaptikWebView;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class HaptikWebView$b
extends WebViewClient {
    public final /* synthetic */ HaptikWebView a;

    public HaptikWebView$b(HaptikWebView haptikWebView) {
        Intrinsics.checkNotNullParameter(haptikWebView, "this$0");
        this.a = haptikWebView;
    }

    public final boolean shouldOverrideUrlLoading(WebView object, WebResourceRequest object2) {
        object = HaptikSDK.INSTANCE;
        boolean bl2 = ((HaptikSDK)object).isHandleLink$sdk_release();
        if (!bl2) {
            Intrinsics.checkNotNull(object2);
            object = object2.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(object, "request!!.url.toString()");
            String string2 = null;
            String string3 = "youtube";
            bl2 = StringsKt.F((CharSequence)object, string3, false);
            if (bl2) {
                object2 = object2.getUrl();
                string2 = "android.intent.action.VIEW";
                object = new Intent(string2, (Uri)object2);
                object2 = this.a;
                object2.startActivity((Intent)object);
            }
        }
        return true;
    }
}

