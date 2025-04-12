/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ViewCheckoutAddressRevampNewBinding
implements BC3 {
    public final View addressBarUiDividerTop;
    public final ConstraintLayout homeDeliveryLayout;
    public final TextView idAddressDetails;
    public final AjioTextView idAddressName;
    public final AjioImageView idLocImage;
    private final ConstraintLayout rootView;
    public final AjioTextView tvDeliveryInfo;

    private ViewCheckoutAddressRevampNewBinding(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, TextView textView, AjioTextView ajioTextView, AjioImageView ajioImageView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.addressBarUiDividerTop = view;
        this.homeDeliveryLayout = constraintLayout2;
        this.idAddressDetails = textView;
        this.idAddressName = ajioTextView;
        this.idLocImage = ajioImageView;
        this.tvDeliveryInfo = ajioTextView2;
    }

    public static ViewCheckoutAddressRevampNewBinding bind(View object) {
        int n3 = R$id.address_bar_ui_divider_top;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            View view2;
            Object object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            n3 = R$id.id_address_details;
            View view3 = view2 = dd2_2.a(n3, object);
            view3 = (TextView)view2;
            if (view3 != null) {
                n3 = R$id.id_address_name;
                Object object3 = view2 = dd2_2.a(n3, object);
                object3 = (AjioTextView)view2;
                if (object3 != null) {
                    n3 = R$id.id_loc_image;
                    Object object4 = view2 = dd2_2.a(n3, object);
                    object4 = (AjioImageView)view2;
                    if (object4 != null) {
                        n3 = R$id.tv_delivery_info;
                        Object object5 = view2 = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view2;
                        if (object5 != null) {
                            view2 = object;
                            object = new ViewCheckoutAddressRevampNewBinding((ConstraintLayout)((Object)object2), view, (ConstraintLayout)((Object)object2), (TextView)view3, (AjioTextView)object3, (AjioImageView)((Object)object4), (AjioTextView)object5);
                            return object;
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

    public static ViewCheckoutAddressRevampNewBinding inflate(LayoutInflater layoutInflater) {
        return ViewCheckoutAddressRevampNewBinding.inflate(layoutInflater, null, false);
    }

    public static ViewCheckoutAddressRevampNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_checkout_address_revamp_new;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewCheckoutAddressRevampNewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

