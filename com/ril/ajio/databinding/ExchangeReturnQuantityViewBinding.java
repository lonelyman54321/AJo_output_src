/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ExchangeReturnQuantityViewBinding
implements BC3 {
    public final ImageButton decrementProductButton;
    public final LinearLayout exchangeReturnQuantityLayoutLL;
    public final ImageButton incrementProductButton;
    public final AjioTextView quantityToExchangeReturn;
    public final LinearLayout quatityLl;
    private final LinearLayout rootView;

    private ExchangeReturnQuantityViewBinding(LinearLayout linearLayout, ImageButton imageButton, LinearLayout linearLayout2, ImageButton imageButton2, AjioTextView ajioTextView, LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.decrementProductButton = imageButton;
        this.exchangeReturnQuantityLayoutLL = linearLayout2;
        this.incrementProductButton = imageButton2;
        this.quantityToExchangeReturn = ajioTextView;
        this.quatityLl = linearLayout3;
    }

    public static ExchangeReturnQuantityViewBinding bind(View object) {
        View view;
        int n3 = R$id.decrement_product_button;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageButton)view;
        if (view2 != null) {
            View view3 = object;
            view3 = (LinearLayout)object;
            n3 = R$id.increment_product_button;
            View view4 = view = dd2_2.a(n3, object);
            view4 = (ImageButton)view;
            if (view4 != null) {
                n3 = R$id.quantity_to_exchange_return;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null) {
                    n3 = R$id.quatity_ll;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (LinearLayout)view;
                    if (view5 != null) {
                        object = new ExchangeReturnQuantityViewBinding((LinearLayout)view3, (ImageButton)view2, (LinearLayout)view3, (ImageButton)view4, (AjioTextView)object2, (LinearLayout)view5);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ExchangeReturnQuantityViewBinding inflate(LayoutInflater layoutInflater) {
        return ExchangeReturnQuantityViewBinding.inflate(layoutInflater, null, false);
    }

    public static ExchangeReturnQuantityViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.exchange_return_quantity_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExchangeReturnQuantityViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

