/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$layout;

public final class ReturnRefundViewRoginalOrderBinding
implements BC3 {
    public final LinearLayout mainLayout;
    private final LinearLayout rootView;

    private ReturnRefundViewRoginalOrderBinding(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.mainLayout = linearLayout2;
    }

    public static ReturnRefundViewRoginalOrderBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            ReturnRefundViewRoginalOrderBinding returnRefundViewRoginalOrderBinding = new ReturnRefundViewRoginalOrderBinding((LinearLayout)object, (LinearLayout)object);
            return returnRefundViewRoginalOrderBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ReturnRefundViewRoginalOrderBinding inflate(LayoutInflater layoutInflater) {
        return ReturnRefundViewRoginalOrderBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnRefundViewRoginalOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_refund_view_roginal_order;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnRefundViewRoginalOrderBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

