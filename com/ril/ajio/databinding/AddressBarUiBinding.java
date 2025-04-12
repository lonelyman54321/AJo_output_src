/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class AddressBarUiBinding
implements BC3 {
    public final View addressBarUiDividerBottom;
    public final View addressBarUiDividerTop;
    public final TextView addressText;
    public final TextView changeAddress;
    public final ConstraintLayout clChange;
    public final ConstraintLayout clMain;
    public final ImageView locationImg;
    public final TextView pincodeText;
    private final ConstraintLayout rootView;

    private AddressBarUiBinding(ConstraintLayout constraintLayout, View view, View view2, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, TextView textView3) {
        this.rootView = constraintLayout;
        this.addressBarUiDividerBottom = view;
        this.addressBarUiDividerTop = view2;
        this.addressText = textView;
        this.changeAddress = textView2;
        this.clChange = constraintLayout2;
        this.clMain = constraintLayout3;
        this.locationImg = imageView;
        this.pincodeText = textView3;
    }

    public static AddressBarUiBinding bind(View object) {
        View view;
        int n3 = R$id.address_bar_ui_divider_bottom;
        View view2 = dd2_2.a(n3, object);
        if (view2 != null && (view = dd2_2.a(n3 = R$id.address_bar_ui_divider_top, object)) != null) {
            View view3;
            n3 = R$id.address_text;
            View view4 = view3 = dd2_2.a(n3, object);
            view4 = (TextView)view3;
            if (view4 != null) {
                n3 = R$id.change_address;
                View view5 = view3 = dd2_2.a(n3, object);
                view5 = (TextView)view3;
                if (view5 != null) {
                    n3 = R$id.cl_change;
                    Object object2 = view3 = dd2_2.a(n3, object);
                    object2 = (ConstraintLayout)view3;
                    if (object2 != null) {
                        Object object3 = object;
                        object3 = (ConstraintLayout)((Object)object);
                        n3 = R$id.location_img;
                        View view6 = view3 = dd2_2.a(n3, object);
                        view6 = (ImageView)view3;
                        if (view6 != null) {
                            n3 = R$id.pincode_text;
                            View view7 = view3 = dd2_2.a(n3, object);
                            view7 = (TextView)view3;
                            if (view7 != null) {
                                view3 = object;
                                object = new AddressBarUiBinding((ConstraintLayout)((Object)object3), view2, view, (TextView)view4, (TextView)view5, (ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object3), (ImageView)view6, (TextView)view7);
                                return object;
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

    public static AddressBarUiBinding inflate(LayoutInflater layoutInflater) {
        return AddressBarUiBinding.inflate(layoutInflater, null, false);
    }

    public static AddressBarUiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.address_bar_ui;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return AddressBarUiBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

