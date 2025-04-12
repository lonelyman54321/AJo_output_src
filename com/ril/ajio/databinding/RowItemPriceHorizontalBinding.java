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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowItemPriceHorizontalBinding
implements BC3 {
    public final AjioTextView deliveryFeeTitle;
    public final AjioTextView deliveryFeeValue;
    private final ConstraintLayout rootView;

    private RowItemPriceHorizontalBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.deliveryFeeTitle = ajioTextView;
        this.deliveryFeeValue = ajioTextView2;
    }

    public static RowItemPriceHorizontalBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.delivery_fee_title;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.delivery_fee_value, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            RowItemPriceHorizontalBinding rowItemPriceHorizontalBinding = new RowItemPriceHorizontalBinding((ConstraintLayout)((Object)object), ajioTextView2, ajioTextView);
            return rowItemPriceHorizontalBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowItemPriceHorizontalBinding inflate(LayoutInflater layoutInflater) {
        return RowItemPriceHorizontalBinding.inflate(layoutInflater, null, false);
    }

    public static RowItemPriceHorizontalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_item_price_horizontal;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowItemPriceHorizontalBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

