/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
package in.juspay.hypersdk.core;

import android.view.View;
import android.view.ViewGroup;
import in.juspay.hypersdk.core.DUIMerchantView;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.MerchantViewType;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;

class JuspayServices$3
implements DUIMerchantView {
    final /* synthetic */ JuspayServices this$0;

    public JuspayServices$3(JuspayServices juspayServices) {
        this.this$0 = juspayServices;
    }

    public View getMerchantView(ViewGroup viewGroup, MerchantViewType merchantViewType) {
        HyperPaymentsCallback hyperPaymentsCallback = this.this$0.getHyperCallback();
        if (hyperPaymentsCallback != null) {
            return this.this$0.getHyperCallback().getMerchantView(viewGroup, merchantViewType);
        }
        return null;
    }
}

