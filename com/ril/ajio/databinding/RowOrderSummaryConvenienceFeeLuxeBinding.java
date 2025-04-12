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
import com.ril.ajio.databinding.EachConvenienceRowLayoutLuxeBinding;

public final class RowOrderSummaryConvenienceFeeLuxeBinding
implements BC3 {
    public final EachConvenienceRowLayoutLuxeBinding codFeeLayout;
    public final AjioTextView convenienceFeeInfoTv;
    public final AjioTextView convenienceFeeTitleTv;
    public final EachConvenienceRowLayoutLuxeBinding deliveryFeeLayout;
    public final EachConvenienceRowLayoutLuxeBinding platformFeeLayout;
    public final EachConvenienceRowLayoutLuxeBinding priorityDeliveryFeeLayout;
    private final ConstraintLayout rootView;

    private RowOrderSummaryConvenienceFeeLuxeBinding(ConstraintLayout constraintLayout, EachConvenienceRowLayoutLuxeBinding eachConvenienceRowLayoutLuxeBinding, AjioTextView ajioTextView, AjioTextView ajioTextView2, EachConvenienceRowLayoutLuxeBinding eachConvenienceRowLayoutLuxeBinding2, EachConvenienceRowLayoutLuxeBinding eachConvenienceRowLayoutLuxeBinding3, EachConvenienceRowLayoutLuxeBinding eachConvenienceRowLayoutLuxeBinding4) {
        this.rootView = constraintLayout;
        this.codFeeLayout = eachConvenienceRowLayoutLuxeBinding;
        this.convenienceFeeInfoTv = ajioTextView;
        this.convenienceFeeTitleTv = ajioTextView2;
        this.deliveryFeeLayout = eachConvenienceRowLayoutLuxeBinding2;
        this.platformFeeLayout = eachConvenienceRowLayoutLuxeBinding3;
        this.priorityDeliveryFeeLayout = eachConvenienceRowLayoutLuxeBinding4;
    }

    public static RowOrderSummaryConvenienceFeeLuxeBinding bind(View object) {
        int n3 = R$id.cod_fee_layout;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            EachConvenienceRowLayoutLuxeBinding eachConvenienceRowLayoutLuxeBinding = EachConvenienceRowLayoutLuxeBinding.bind(view);
            n3 = R$id.convenience_fee_info_tv;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.convenience_fee_title_tv;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null && (view = dd2_2.a(n3 = R$id.delivery_fee_layout, object)) != null) {
                    EachConvenienceRowLayoutLuxeBinding eachConvenienceRowLayoutLuxeBinding2 = EachConvenienceRowLayoutLuxeBinding.bind(view);
                    n3 = R$id.platform_fee_layout;
                    view = dd2_2.a(n3, object);
                    if (view != null) {
                        EachConvenienceRowLayoutLuxeBinding eachConvenienceRowLayoutLuxeBinding3 = EachConvenienceRowLayoutLuxeBinding.bind(view);
                        n3 = R$id.priority_delivery_fee_layout;
                        view = dd2_2.a(n3, object);
                        if (view != null) {
                            EachConvenienceRowLayoutLuxeBinding eachConvenienceRowLayoutLuxeBinding4 = EachConvenienceRowLayoutLuxeBinding.bind(view);
                            Object object4 = object;
                            object4 = (ConstraintLayout)((Object)object);
                            RowOrderSummaryConvenienceFeeLuxeBinding rowOrderSummaryConvenienceFeeLuxeBinding = new RowOrderSummaryConvenienceFeeLuxeBinding((ConstraintLayout)((Object)object4), eachConvenienceRowLayoutLuxeBinding, (AjioTextView)object2, (AjioTextView)object3, eachConvenienceRowLayoutLuxeBinding2, eachConvenienceRowLayoutLuxeBinding3, eachConvenienceRowLayoutLuxeBinding4);
                            return rowOrderSummaryConvenienceFeeLuxeBinding;
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

    public static RowOrderSummaryConvenienceFeeLuxeBinding inflate(LayoutInflater layoutInflater) {
        return RowOrderSummaryConvenienceFeeLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static RowOrderSummaryConvenienceFeeLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_order_summary_convenience_fee_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowOrderSummaryConvenienceFeeLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

