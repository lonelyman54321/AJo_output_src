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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ViewCancelReasonProductBinding
implements BC3 {
    public final AjioRoundedCornerImageView cancelReasonImvProduct;
    public final AjioTextView cancelReasonTvBrand;
    public final AjioTextView cancelReasonTvDesc;
    public final AjioTextView cancelReasonTvPrice;
    public final AjioTextView cancelReasonTvSize;
    public final AjioTextView itemOriginalPrice;
    private final ConstraintLayout rootView;
    public final LinearLayout rowOrderLayoutProduct;
    public final AjioTextView tvRefundBreakup;

    private ViewCancelReasonProductBinding(ConstraintLayout constraintLayout, AjioRoundedCornerImageView ajioRoundedCornerImageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, LinearLayout linearLayout, AjioTextView ajioTextView6) {
        this.rootView = constraintLayout;
        this.cancelReasonImvProduct = ajioRoundedCornerImageView;
        this.cancelReasonTvBrand = ajioTextView;
        this.cancelReasonTvDesc = ajioTextView2;
        this.cancelReasonTvPrice = ajioTextView3;
        this.cancelReasonTvSize = ajioTextView4;
        this.itemOriginalPrice = ajioTextView5;
        this.rowOrderLayoutProduct = linearLayout;
        this.tvRefundBreakup = ajioTextView6;
    }

    public static ViewCancelReasonProductBinding bind(View object) {
        View view;
        int n3 = R$id.cancel_reason_imv_product;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioRoundedCornerImageView)view;
        if (object2 != null) {
            n3 = R$id.cancel_reason_tv_brand;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.cancel_reason_tv_desc;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.cancel_reason_tv_price;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.cancel_reason_tv_size;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.item_original_price;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                n3 = R$id.row_order_layout_product;
                                View view2 = view = dd2_2.a(n3, object);
                                view2 = (LinearLayout)view;
                                if (view2 != null) {
                                    n3 = R$id.tv_refund_breakup;
                                    Object object8 = view = dd2_2.a(n3, object);
                                    object8 = (AjioTextView)view;
                                    if (object8 != null) {
                                        Object object9 = object;
                                        object9 = (ConstraintLayout)((Object)object);
                                        ViewCancelReasonProductBinding viewCancelReasonProductBinding = new ViewCancelReasonProductBinding((ConstraintLayout)((Object)object9), (AjioRoundedCornerImageView)((Object)object2), (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (LinearLayout)view2, (AjioTextView)object8);
                                        return viewCancelReasonProductBinding;
                                    }
                                }
                            }
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

    public static ViewCancelReasonProductBinding inflate(LayoutInflater layoutInflater) {
        return ViewCancelReasonProductBinding.inflate(layoutInflater, null, false);
    }

    public static ViewCancelReasonProductBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_cancel_reason_product;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewCancelReasonProductBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

