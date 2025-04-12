/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 */
package com.appsflyer.internal;

import android.webkit.WebView;
import com.appsflyer.internal.AFj1mSDK;
import com.jio.jioads.multiad.H;
import kotlin.jvm.internal.Intrinsics;

public final class y
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                H h3 = (H)this.b;
                Intrinsics.checkNotNullParameter(h3, "this$0");
                WebView webView = h3.k;
                if (webView != null) {
                    String string2 = "tvjsInterface";
                    webView.removeJavascriptInterface(string2);
                }
                if ((h3 = h3.k) != null) {
                    h3.destroy();
                }
                return;
            }
            case 0: 
        }
        AFj1mSDK.c((AFj1mSDK)this.b);
    }
}

