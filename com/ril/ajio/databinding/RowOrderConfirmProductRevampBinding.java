/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.FreebieFreeTagBinding;

public final class RowOrderConfirmProductRevampBinding
implements BC3 {
    public final FreebieFreeTagBinding freeTag;
    public final AppCompatImageView ivPdDeliveryAlert;
    private final RelativeLayout rootView;
    public final ConstraintLayout rowCartProduct;
    public final AjioRoundedCornerImageView rowOrderConfirmImvProduct;
    public final AjioTextView rowOrderConfirmLblExclusive;
    public final AjioTextView rowOrderConfirmTvBrand;
    public final AjioTextView rowOrderConfirmTvDelivery;
    public final AjioTextView rowOrderConfirmTvName;
    public final AjioTextView rowOrderConfirmTvSize;

    private RowOrderConfirmProductRevampBinding(RelativeLayout relativeLayout, FreebieFreeTagBinding freebieFreeTagBinding, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AjioRoundedCornerImageView ajioRoundedCornerImageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5) {
        this.rootView = relativeLayout;
        this.freeTag = freebieFreeTagBinding;
        this.ivPdDeliveryAlert = appCompatImageView;
        this.rowCartProduct = constraintLayout;
        this.rowOrderConfirmImvProduct = ajioRoundedCornerImageView;
        this.rowOrderConfirmLblExclusive = ajioTextView;
        this.rowOrderConfirmTvBrand = ajioTextView2;
        this.rowOrderConfirmTvDelivery = ajioTextView3;
        this.rowOrderConfirmTvName = ajioTextView4;
        this.rowOrderConfirmTvSize = ajioTextView5;
    }

    public static RowOrderConfirmProductRevampBinding bind(View object) {
        int n3 = R$id.free_tag;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            FreebieFreeTagBinding freebieFreeTagBinding = FreebieFreeTagBinding.bind(view);
            n3 = R$id.iv_pd_delivery_alert;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AppCompatImageView)view;
            if (object2 != null) {
                n3 = R$id.row_cart_product;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (ConstraintLayout)view;
                if (object3 != null) {
                    n3 = R$id.row_order_confirm_imv_product;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioRoundedCornerImageView)view;
                    if (object4 != null) {
                        n3 = R$id.row_order_confirm_lbl_exclusive;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            n3 = R$id.row_order_confirm_tv_brand;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                n3 = R$id.row_order_confirm_tv_delivery;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AjioTextView)view;
                                if (object7 != null) {
                                    n3 = R$id.row_order_confirm_tv_name;
                                    Object object8 = view = dd2_2.a(n3, object);
                                    object8 = (AjioTextView)view;
                                    if (object8 != null) {
                                        n3 = R$id.row_order_confirm_tv_size;
                                        Object object9 = view = dd2_2.a(n3, object);
                                        object9 = (AjioTextView)view;
                                        if (object9 != null) {
                                            Object object10 = object;
                                            object10 = (RelativeLayout)object;
                                            RowOrderConfirmProductRevampBinding rowOrderConfirmProductRevampBinding = new RowOrderConfirmProductRevampBinding((RelativeLayout)object10, freebieFreeTagBinding, (AppCompatImageView)((Object)object2), (ConstraintLayout)((Object)object3), (AjioRoundedCornerImageView)((Object)object4), (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9);
                                            return rowOrderConfirmProductRevampBinding;
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

    public static RowOrderConfirmProductRevampBinding inflate(LayoutInflater layoutInflater) {
        return RowOrderConfirmProductRevampBinding.inflate(layoutInflater, null, false);
    }

    public static RowOrderConfirmProductRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_order_confirm_product_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowOrderConfirmProductRevampBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

