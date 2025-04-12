/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebViewClient
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.ui;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import in.juspay.hypersdk.core.MerchantViewType;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import org.json.JSONObject;

public interface HyperPaymentsCallback {
    public WebViewClient createJuspaySafeWebViewClient();

    public View getMerchantView(ViewGroup var1, MerchantViewType var2);

    public void onEvent(JSONObject var1, JuspayResponseHandler var2);

    public void onStartWaitingDialogCreated(View var1);
}

