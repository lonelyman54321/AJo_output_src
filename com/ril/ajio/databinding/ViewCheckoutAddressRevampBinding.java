/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ViewCheckoutAddressRevampBinding
implements BC3 {
    public final AppCompatImageView checkoutAddressImvArrow;
    public final ImageView checkoutAddressImvType;
    public final RelativeLayout checkoutAddressLayoutOption;
    public final AjioTextView checkoutAddressTvDeliveryDetail;
    public final AjioTextView checkoutAddressTvOption;
    public final LinearLayout homeDeliveryLayout;
    public final AjioTextView idAddressChange;
    public final AjioTextView idAddressDetails;
    public final AjioTextView idAddressName;
    public final AjioTextView idAddressPincode;
    public final AjioImageView idLocImage;
    public final RelativeLayout relativeAddressChange;
    private final LinearLayout rootView;

    private ViewCheckoutAddressRevampBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, ImageView imageView, RelativeLayout relativeLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, LinearLayout linearLayout2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioImageView ajioImageView, RelativeLayout relativeLayout2) {
        this.rootView = linearLayout;
        this.checkoutAddressImvArrow = appCompatImageView;
        this.checkoutAddressImvType = imageView;
        this.checkoutAddressLayoutOption = relativeLayout;
        this.checkoutAddressTvDeliveryDetail = ajioTextView;
        this.checkoutAddressTvOption = ajioTextView2;
        this.homeDeliveryLayout = linearLayout2;
        this.idAddressChange = ajioTextView3;
        this.idAddressDetails = ajioTextView4;
        this.idAddressName = ajioTextView5;
        this.idAddressPincode = ajioTextView6;
        this.idLocImage = ajioImageView;
        this.relativeAddressChange = relativeLayout2;
    }

    public static ViewCheckoutAddressRevampBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.checkout_address_imv_arrow;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AppCompatImageView)view2;
        if (object2 != null) {
            n3 = R$id.checkout_address_imv_type;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (ImageView)view2;
            if (view3 != null) {
                n3 = R$id.checkout_address_layout_option;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (RelativeLayout)view2;
                if (view4 != null) {
                    n3 = R$id.checkout_address_tv_delivery_detail;
                    Object object3 = view2 = dd2_2.a(n3, view);
                    object3 = (AjioTextView)view2;
                    if (object3 != null) {
                        n3 = R$id.checkout_address_tv_option;
                        Object object4 = view2 = dd2_2.a(n3, view);
                        object4 = (AjioTextView)view2;
                        if (object4 != null) {
                            View view5 = view;
                            view5 = (LinearLayout)view;
                            n3 = R$id.id_address_change;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (AjioTextView)view2;
                            if (object5 != null) {
                                n3 = R$id.id_address_details;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (AjioTextView)view2;
                                if (object6 != null) {
                                    n3 = R$id.id_address_name;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (AjioTextView)view2;
                                    if (object7 != null) {
                                        n3 = R$id.id_address_pincode;
                                        Object object8 = view2 = dd2_2.a(n3, view);
                                        object8 = (AjioTextView)view2;
                                        if (object8 != null) {
                                            n3 = R$id.id_loc_image;
                                            Object object9 = view2 = dd2_2.a(n3, view);
                                            object9 = (AjioImageView)view2;
                                            if (object9 != null) {
                                                n3 = R$id.relative_address_change;
                                                View view6 = view2 = dd2_2.a(n3, view);
                                                view6 = (RelativeLayout)view2;
                                                if (view6 != null) {
                                                    object = new ViewCheckoutAddressRevampBinding((LinearLayout)view5, (AppCompatImageView)((Object)object2), (ImageView)view3, (RelativeLayout)view4, (AjioTextView)object3, (AjioTextView)object4, (LinearLayout)view5, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioImageView)((Object)object9), (RelativeLayout)view6);
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
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ViewCheckoutAddressRevampBinding inflate(LayoutInflater layoutInflater) {
        return ViewCheckoutAddressRevampBinding.inflate(layoutInflater, null, false);
    }

    public static ViewCheckoutAddressRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_checkout_address_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewCheckoutAddressRevampBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

