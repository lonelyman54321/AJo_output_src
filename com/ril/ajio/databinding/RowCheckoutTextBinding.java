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

public final class RowCheckoutTextBinding
implements BC3 {
    public final AjioTextView checkoutTextTv;
    private final AjioTextView rootView;

    private RowCheckoutTextBinding(AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioTextView;
        this.checkoutTextTv = ajioTextView2;
    }

    public static RowCheckoutTextBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            RowCheckoutTextBinding rowCheckoutTextBinding = new RowCheckoutTextBinding((AjioTextView)object, (AjioTextView)object);
            return rowCheckoutTextBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowCheckoutTextBinding inflate(LayoutInflater layoutInflater) {
        return RowCheckoutTextBinding.inflate(layoutInflater, null, false);
    }

    public static RowCheckoutTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_checkout_text;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCheckoutTextBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}

