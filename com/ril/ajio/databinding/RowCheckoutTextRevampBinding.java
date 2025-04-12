/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowCheckoutTextRevampBinding
implements BC3 {
    public final AjioTextView checkoutTextTv;
    private final AjioTextView rootView;

    private RowCheckoutTextRevampBinding(AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioTextView;
        this.checkoutTextTv = ajioTextView2;
    }

    public static RowCheckoutTextRevampBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            RowCheckoutTextRevampBinding rowCheckoutTextRevampBinding = new RowCheckoutTextRevampBinding((AjioTextView)object, (AjioTextView)object);
            return rowCheckoutTextRevampBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowCheckoutTextRevampBinding inflate(LayoutInflater layoutInflater) {
        return RowCheckoutTextRevampBinding.inflate(layoutInflater, null, false);
    }

    public static RowCheckoutTextRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_checkout_text_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCheckoutTextRevampBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}

