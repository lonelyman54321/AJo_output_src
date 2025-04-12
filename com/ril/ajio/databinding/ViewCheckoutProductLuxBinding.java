/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.FreebieFreeTagBinding;

public final class ViewCheckoutProductLuxBinding
implements BC3 {
    public final FreebieFreeTagBinding freeTag;
    public final ImageView ivPdDeliveryAlert;
    private final RelativeLayout rootView;
    public final RelativeLayout rowCheckoutProduct;
    public final ConstraintLayout viewCheckoutLayoutImv;
    public final AjioRoundedCornerImageView viewCheckoutProductImv;
    public final AjioTextView viewCheckoutTvDetail;
    public final AjioTextView viewCheckoutTvEstimatedDate;
    public final AjioTextView viewCheckoutTvExclusive;
    public final AjioTextView viewCheckoutTvName;
    public final AjioTextView viewCheckoutTvQty;
    public final AjioTextView viewCheckoutTvSize;

    private ViewCheckoutProductLuxBinding(RelativeLayout relativeLayout, FreebieFreeTagBinding freebieFreeTagBinding, ImageView imageView, RelativeLayout relativeLayout2, ConstraintLayout constraintLayout, AjioRoundedCornerImageView ajioRoundedCornerImageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6) {
        this.rootView = relativeLayout;
        this.freeTag = freebieFreeTagBinding;
        this.ivPdDeliveryAlert = imageView;
        this.rowCheckoutProduct = relativeLayout2;
        this.viewCheckoutLayoutImv = constraintLayout;
        this.viewCheckoutProductImv = ajioRoundedCornerImageView;
        this.viewCheckoutTvDetail = ajioTextView;
        this.viewCheckoutTvEstimatedDate = ajioTextView2;
        this.viewCheckoutTvExclusive = ajioTextView3;
        this.viewCheckoutTvName = ajioTextView4;
        this.viewCheckoutTvQty = ajioTextView5;
        this.viewCheckoutTvSize = ajioTextView6;
    }

    public static ViewCheckoutProductLuxBinding bind(View object) {
        int n3 = R$id.free_tag;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            FreebieFreeTagBinding freebieFreeTagBinding = FreebieFreeTagBinding.bind(view);
            n3 = R$id.iv_pd_delivery_alert;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                Object object2 = object;
                object2 = (RelativeLayout)object;
                n3 = R$id.view_checkout_layout_imv;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (ConstraintLayout)view;
                if (object3 != null) {
                    n3 = R$id.view_checkout_product_imv;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioRoundedCornerImageView)view;
                    if (object4 != null) {
                        n3 = R$id.view_checkout_tv_detail;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            n3 = R$id.view_checkout_tv_estimated_date;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                n3 = R$id.view_checkout_tv_exclusive;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AjioTextView)view;
                                if (object7 != null) {
                                    n3 = R$id.view_checkout_tv_name;
                                    Object object8 = view = dd2_2.a(n3, object);
                                    object8 = (AjioTextView)view;
                                    if (object8 != null) {
                                        n3 = R$id.view_checkout_tv_qty;
                                        Object object9 = view = dd2_2.a(n3, object);
                                        object9 = (AjioTextView)view;
                                        if (object9 != null) {
                                            n3 = R$id.view_checkout_tv_size;
                                            Object object10 = view = dd2_2.a(n3, object);
                                            object10 = (AjioTextView)view;
                                            if (object10 != null) {
                                                object = new ViewCheckoutProductLuxBinding((RelativeLayout)object2, freebieFreeTagBinding, (ImageView)view2, (RelativeLayout)object2, (ConstraintLayout)((Object)object3), (AjioRoundedCornerImageView)((Object)object4), (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10);
                                                return object;
                                            }
                                        }
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

    public static ViewCheckoutProductLuxBinding inflate(LayoutInflater layoutInflater) {
        return ViewCheckoutProductLuxBinding.inflate(layoutInflater, null, false);
    }

    public static ViewCheckoutProductLuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_checkout_product_lux;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewCheckoutProductLuxBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

