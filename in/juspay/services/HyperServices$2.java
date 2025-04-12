/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebViewClient
 *  org.json.JSONObject
 */
package in.juspay.services;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import in.juspay.hypersdk.core.MerchantViewType;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter;
import in.juspay.services.HyperServices;
import org.json.JSONObject;

class HyperServices$2
extends HyperPaymentsCallbackAdapter {
    final /* synthetic */ HyperServices this$0;

    public HyperServices$2(HyperServices hyperServices) {
        this.this$0 = hyperServices;
    }

    public WebViewClient createJuspaySafeWebViewClient() {
        return this.this$0.merchantCallback.createJuspaySafeWebViewClient();
    }

    public View getMerchantView(ViewGroup viewGroup, MerchantViewType merchantViewType) {
        return this.this$0.merchantCallback.getMerchantView(viewGroup, merchantViewType);
    }

    public void onEvent(JSONObject jSONObject, JuspayResponseHandler juspayResponseHandler) {
        Object object = this.this$0;
        boolean bl2 = ((HyperServices)object).handleOnEvent(jSONObject);
        if (bl2) {
            object = this.this$0.merchantCallback;
            object.onEvent(jSONObject, juspayResponseHandler);
        }
    }

    public void onStartWaitingDialogCreated(View view) {
        this.this$0.merchantCallback.onStartWaitingDialogCreated(view);
    }
}

