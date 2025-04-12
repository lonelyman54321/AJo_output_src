/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.CheckBox
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ViewCheckoutExpandableRevampBinding
implements BC3 {
    public final CheckBox checkoutExpandableCheckboxExpand;
    public final RelativeLayout checkoutExpandableLayout;
    public final LinearLayout checkoutExpandableLayoutDynamic;
    public final AjioTextView checkoutExpandableTvStatus;
    public final AjioTextView checkoutExpandableTvTitle;
    public final AppCompatImageView icSpcAssuredGift;
    public final RelativeLayout idAjioSpcMiniAssuredGift;
    public final AjioTextView idPdTitle;
    public final RelativeLayout idPriorityDeliveryLayout;
    public final AjioTextView idSpcGiftTitle;
    public final ImageView ivPdDeliveryAlert;
    private final LinearLayout rootView;

    private ViewCheckoutExpandableRevampBinding(LinearLayout linearLayout, CheckBox checkBox, RelativeLayout relativeLayout, LinearLayout linearLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout2, AjioTextView ajioTextView3, RelativeLayout relativeLayout3, AjioTextView ajioTextView4, ImageView imageView) {
        this.rootView = linearLayout;
        this.checkoutExpandableCheckboxExpand = checkBox;
        this.checkoutExpandableLayout = relativeLayout;
        this.checkoutExpandableLayoutDynamic = linearLayout2;
        this.checkoutExpandableTvStatus = ajioTextView;
        this.checkoutExpandableTvTitle = ajioTextView2;
        this.icSpcAssuredGift = appCompatImageView;
        this.idAjioSpcMiniAssuredGift = relativeLayout2;
        this.idPdTitle = ajioTextView3;
        this.idPriorityDeliveryLayout = relativeLayout3;
        this.idSpcGiftTitle = ajioTextView4;
        this.ivPdDeliveryAlert = imageView;
    }

    public static ViewCheckoutExpandableRevampBinding bind(View object) {
        View view;
        int n3 = R$id.checkout_expandable_checkbox_expand;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (CheckBox)view;
        if (view2 != null) {
            n3 = R$id.checkout_expandable_layout;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (RelativeLayout)view;
            if (view3 != null) {
                n3 = R$id.checkout_expandable_layout_dynamic;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (LinearLayout)view;
                if (view4 != null) {
                    n3 = R$id.checkout_expandable_tv_status;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (AjioTextView)view;
                    if (object2 != null) {
                        n3 = R$id.checkout_expandable_tv_title;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioTextView)view;
                        if (object3 != null) {
                            n3 = R$id.ic_spc_assured_gift;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (AppCompatImageView)view;
                            if (object4 != null) {
                                n3 = R$id.id_ajio_spc_mini_assured_gift;
                                View view5 = view = dd2_2.a(n3, object);
                                view5 = (RelativeLayout)view;
                                if (view5 != null) {
                                    n3 = R$id.id_pd_title;
                                    Object object5 = view = dd2_2.a(n3, object);
                                    object5 = (AjioTextView)view;
                                    if (object5 != null) {
                                        n3 = R$id.id_priority_delivery_layout;
                                        View view6 = view = dd2_2.a(n3, object);
                                        view6 = (RelativeLayout)view;
                                        if (view6 != null) {
                                            n3 = R$id.id_spc_gift_title;
                                            Object object6 = view = dd2_2.a(n3, object);
                                            object6 = (AjioTextView)view;
                                            if (object6 != null) {
                                                n3 = R$id.iv_pd_delivery_alert;
                                                View view7 = view = dd2_2.a(n3, object);
                                                view7 = (ImageView)view;
                                                if (view7 != null) {
                                                    Object object7 = object;
                                                    object7 = (LinearLayout)object;
                                                    ViewCheckoutExpandableRevampBinding viewCheckoutExpandableRevampBinding = new ViewCheckoutExpandableRevampBinding((LinearLayout)object7, (CheckBox)view2, (RelativeLayout)view3, (LinearLayout)view4, (AjioTextView)object2, (AjioTextView)object3, (AppCompatImageView)((Object)object4), (RelativeLayout)view5, (AjioTextView)object5, (RelativeLayout)view6, (AjioTextView)object6, (ImageView)view7);
                                                    return viewCheckoutExpandableRevampBinding;
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
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ViewCheckoutExpandableRevampBinding inflate(LayoutInflater layoutInflater) {
        return ViewCheckoutExpandableRevampBinding.inflate(layoutInflater, null, false);
    }

    public static ViewCheckoutExpandableRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_checkout_expandable_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewCheckoutExpandableRevampBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

