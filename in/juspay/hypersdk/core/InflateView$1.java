/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.DuiCallback;
import in.juspay.hypersdk.core.DuiLogger;
import in.juspay.hypersdk.core.DynamicUI;
import in.juspay.hypersdk.core.InflateView;

class InflateView$1
implements DuiCallback {
    final /* synthetic */ InflateView this$0;
    final /* synthetic */ DynamicUI val$dynamicUI;

    public InflateView$1(InflateView inflateView, DynamicUI dynamicUI) {
        this.this$0 = inflateView;
        this.val$dynamicUI = dynamicUI;
    }

    public void addJsToWebView(String string2) {
        this.val$dynamicUI.addJsToWebView(string2);
    }

    public InflateView getInflateView() {
        return this.val$dynamicUI.getInflateView();
    }

    public DuiLogger getLogger() {
        return this.val$dynamicUI.getLogger();
    }
}

