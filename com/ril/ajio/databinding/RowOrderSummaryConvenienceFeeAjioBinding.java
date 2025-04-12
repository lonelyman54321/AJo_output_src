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
import com.ril.ajio.databinding.EachConvenienceRowLayoutBinding;

public final class RowOrderSummaryConvenienceFeeAjioBinding
implements BC3 {
    public final EachConvenienceRowLayoutBinding codFeeLayout;
    public final AjioTextView convenienceFeeInfoTv;
    public final AjioTextView convenienceFeeTitleTv;
    public final EachConvenienceRowLayoutBinding deliveryFeeLayout;
    public final EachConvenienceRowLayoutBinding platformFeeLayout;
    public final EachConvenienceRowLayoutBinding priorityDeliveryFeeLayout;
    private final ConstraintLayout rootView;

    private RowOrderSummaryConvenienceFeeAjioBinding(ConstraintLayout constraintLayout, EachConvenienceRowLayoutBinding eachConvenienceRowLayoutBinding, AjioTextView ajioTextView, AjioTextView ajioTextView2, EachConvenienceRowLayoutBinding eachConvenienceRowLayoutBinding2, EachConvenienceRowLayoutBinding eachConvenienceRowLayoutBinding3, EachConvenienceRowLayoutBinding eachConvenienceRowLayoutBinding4) {
        this.rootView = constraintLayout;
        this.codFeeLayout = eachConvenienceRowLayoutBinding;
        this.convenienceFeeInfoTv = ajioTextView;
        this.convenienceFeeTitleTv = ajioTextView2;
        this.deliveryFeeLayout = eachConvenienceRowLayoutBinding2;
        this.platformFeeLayout = eachConvenienceRowLayoutBinding3;
        this.priorityDeliveryFeeLayout = eachConvenienceRowLayoutBinding4;
    }

    public static RowOrderSummaryConvenienceFeeAjioBinding bind(View object) {
        int n3 = R$id.cod_fee_layout;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            EachConvenienceRowLayoutBinding eachConvenienceRowLayoutBinding = EachConvenienceRowLayoutBinding.bind(view);
            n3 = R$id.convenience_fee_info_tv;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.convenience_fee_title_tv;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null && (view = dd2_2.a(n3 = R$id.delivery_fee_layout, object)) != null) {
                    EachConvenienceRowLayoutBinding eachConvenienceRowLayoutBinding2 = EachConvenienceRowLayoutBinding.bind(view);
                    n3 = R$id.platform_fee_layout;
                    view = dd2_2.a(n3, object);
                    if (view != null) {
                        EachConvenienceRowLayoutBinding eachConvenienceRowLayoutBinding3 = EachConvenienceRowLayoutBinding.bind(view);
                        n3 = R$id.priority_delivery_fee_layout;
                        view = dd2_2.a(n3, object);
                        if (view != null) {
                            EachConvenienceRowLayoutBinding eachConvenienceRowLayoutBinding4 = EachConvenienceRowLayoutBinding.bind(view);
                            Object object4 = object;
                            object4 = (ConstraintLayout)((Object)object);
                            RowOrderSummaryConvenienceFeeAjioBinding rowOrderSummaryConvenienceFeeAjioBinding = new RowOrderSummaryConvenienceFeeAjioBinding((ConstraintLayout)((Object)object4), eachConvenienceRowLayoutBinding, (AjioTextView)object2, (AjioTextView)object3, eachConvenienceRowLayoutBinding2, eachConvenienceRowLayoutBinding3, eachConvenienceRowLayoutBinding4);
                            return rowOrderSummaryConvenienceFeeAjioBinding;
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowOrderSummaryConvenienceFeeAjioBinding inflate(LayoutInflater layoutInflater) {
        return RowOrderSummaryConvenienceFeeAjioBinding.inflate(layoutInflater, null, false);
    }

    public static RowOrderSummaryConvenienceFeeAjioBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_order_summary_convenience_fee_ajio;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowOrderSummaryConvenienceFeeAjioBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

