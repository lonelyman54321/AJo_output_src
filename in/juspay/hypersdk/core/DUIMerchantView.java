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
import in.juspay.hypersdk.core.MerchantViewType;

public interface DUIMerchantView {
    public View getMerchantView(ViewGroup var1, MerchantViewType var2);
}

