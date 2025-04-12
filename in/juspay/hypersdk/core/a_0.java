/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 */
package in.juspay.hypersdk.core;

import android.webkit.WebView;
import in.juspay.hypersdk.core.DynamicUI;
import in.juspay.hypersdk.mystique.WebClientCallback;

/*
 * Renamed from in.juspay.hypersdk.core.A
 */
public final class a_0
implements WebClientCallback {
    public final /* synthetic */ DynamicUI a;

    public /* synthetic */ a_0(DynamicUI dynamicUI) {
        this.a = dynamicUI;
    }

    public final void onRenderProcessGone(WebView webView) {
        DynamicUI.c(this.a, webView);
    }
}

