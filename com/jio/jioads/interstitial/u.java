/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.jio.jioads.interstitial;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.jio.jioads.interstitial.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class u
extends WebViewClient {
    public final /* synthetic */ x a;

    public u(x x5) {
        this.a = x5;
    }

    public final void onPageFinished(WebView object, String string2) {
        super.onPageFinished((WebView)object, string2);
        object = this.a.b;
        if (string2 == null) {
            string2 = "";
        }
        object.b(string2);
    }

    public final void onPageStarted(WebView object, String string2, Bitmap bitmap) {
        super.onPageStarted((WebView)object, string2, bitmap);
        object = this.a.b;
        if (string2 == null) {
            string2 = "";
        }
        object.a(string2);
    }

    public final void onReceivedError(WebView object, int n3, String string2, String string3) {
        super.onReceivedError((WebView)object, n3, string2, string3);
        object = this.a.b;
        String string4 = "";
        if (string2 == null) {
            string2 = string4;
        }
        if (string3 == null) {
            string3 = string4;
        }
        object.a(n3, string2, string3);
    }

    public final boolean shouldOverrideUrlLoading(WebView object, WebResourceRequest object2) {
        block11: {
            block13: {
                boolean bl2;
                block12: {
                    String string2 = "view";
                    Intrinsics.checkNotNullParameter(object, string2);
                    object = "request";
                    Intrinsics.checkNotNullParameter(object2, (String)object);
                    try {
                        bl2 = object2.hasGesture();
                        if (!bl2) break block11;
                    }
                    catch (Exception exception) {}
                    object = object2.getUrl();
                    object = object.toString();
                    object2 = "toString(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    object2 = this.a;
                    object = StringsKt.m0((CharSequence)object);
                    object = object.toString();
                    string2 = "about:blank#blocked";
                    boolean bl3 = Intrinsics.areEqual(object, string2);
                    if (bl3) break block12;
                    string2 = "about:blank";
                    bl3 = Intrinsics.areEqual(object, string2);
                    if (!bl3) break block13;
                }
                bl2 = false;
                object = null;
            }
            if (object == null) {
                object = "";
            }
            x.a((x)object2, (String)object);
            return true;
        }
        return false;
    }

    public final boolean shouldOverrideUrlLoading(WebView object, String string2) {
        String string3 = "view";
        Intrinsics.checkNotNullParameter(object, string3);
        Intrinsics.checkNotNullParameter(string2, "url");
        object = ((Object)StringsKt.m0(string2)).toString();
        string2 = "about:blank#blocked";
        boolean bl2 = Intrinsics.areEqual(object, string2);
        if (bl2 || (bl2 = Intrinsics.areEqual(object, string2 = "about:blank"))) {
            object = null;
        }
        if (object == null) {
            object = "";
        }
        x.a(this.a, (String)object);
        return true;
    }
}

