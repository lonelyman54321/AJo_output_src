/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 */
package com.jio.jioads.multiad;

import android.webkit.WebView;
import com.jio.jioads.multiad.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class D
implements Runnable {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ H b;

    public /* synthetic */ D(Ref$ObjectRef ref$ObjectRef, H h3) {
        this.a = ref$ObjectRef;
        this.b = h3;
    }

    public final void run() {
        Object object = this.a;
        H h3 = this.b;
        Intrinsics.checkNotNullParameter(object, "$js");
        Intrinsics.checkNotNullParameter(h3, "this$0");
        StringBuilder stringBuilder = new StringBuilder("<!DOCTYPE html><html><head><script>");
        object = (String)((Ref$ObjectRef)object).element;
        String string2 = "</script></head><body></body></html>";
        String string3 = h30_0.a(stringBuilder, (String)object, string2);
        WebView webView = h3.k;
        if (webView != null) {
            String string4 = "";
            String string5 = "text/html";
            String string6 = "UTF-8";
            webView.loadDataWithBaseURL(string4, string3, string5, string6, null);
        }
    }
}

