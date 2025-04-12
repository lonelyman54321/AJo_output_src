/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebViewClient
 */
package in.juspay.hypersdk.ui;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import in.juspay.hypersdk.core.MerchantViewType;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;

public abstract class HyperPaymentsCallbackAdapter
implements HyperPaymentsCallback {
    public WebViewClient createJuspaySafeWebViewClient() {
        return null;
    }

    public View getMerchantView(ViewGroup viewGroup, MerchantViewType merchantViewType) {
        return null;
    }

    public void onStartWaitingDialogCreated(View view) {
    }
}

