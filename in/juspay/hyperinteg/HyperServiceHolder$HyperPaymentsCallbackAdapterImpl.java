/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  android.view.View
 *  android.view.ViewGroup
 *  org.json.JSONObject
 */
package in.juspay.hyperinteg;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import in.juspay.hyperinteg.HyperServiceHolder;
import in.juspay.hyperinteg.HyperServiceHolder$1;
import in.juspay.hypersdk.core.MerchantViewType;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter;
import org.json.JSONObject;

class HyperServiceHolder$HyperPaymentsCallbackAdapterImpl
extends HyperPaymentsCallbackAdapter {
    private HyperServiceHolder$HyperPaymentsCallbackAdapterImpl() {
    }

    public /* synthetic */ HyperServiceHolder$HyperPaymentsCallbackAdapterImpl(HyperServiceHolder$1 hyperServiceHolder$1) {
        this();
    }

    public View getMerchantView(ViewGroup viewGroup, MerchantViewType merchantViewType) {
        HyperPaymentsCallback hyperPaymentsCallback = (HyperPaymentsCallback)HyperServiceHolder.access$100().get();
        if (hyperPaymentsCallback == null) {
            return null;
        }
        return hyperPaymentsCallback.getMerchantView(viewGroup, merchantViewType);
    }

    public void onEvent(JSONObject jSONObject, JuspayResponseHandler juspayResponseHandler) {
        Object object = (HyperPaymentsCallback)HyperServiceHolder.access$100().get();
        if (object != null) {
            object.onEvent(jSONObject, juspayResponseHandler);
        } else {
            object = HyperServiceHolder.access$200();
            Pair pair = new Pair((Object)jSONObject, (Object)juspayResponseHandler);
            object.add(pair);
        }
    }
}

