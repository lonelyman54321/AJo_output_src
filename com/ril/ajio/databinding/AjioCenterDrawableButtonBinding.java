/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class AjioCenterDrawableButtonBinding
implements BC3 {
    public final LinearLayout ajioCenterDrawableButtonCenterLayout;
    public final LinearLayout ajioCenterDrawableButtonMainLayout;
    public final ImageView internalLeftDrawable;
    public final ImageView internalRightDrawable;
    public final AjioTextView internalTextview;
    private final LinearLayout rootView;

    private AjioCenterDrawableButtonBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView, ImageView imageView2, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.ajioCenterDrawableButtonCenterLayout = linearLayout2;
        this.ajioCenterDrawableButtonMainLayout = linearLayout3;
        this.internalLeftDrawable = imageView;
        this.internalRightDrawable = imageView2;
        this.internalTextview = ajioTextView;
    }

    public static AjioCenterDrawableButtonBinding bind(View object) {
        View view;
        int n3 = R$id.ajio_center_drawable_button_center_layout;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            View view3 = object;
            view3 = (LinearLayout)object;
            n3 = R$id.internal_left_drawable;
            View view4 = view = dd2_2.a(n3, object);
            view4 = (ImageView)view;
            if (view4 != null) {
                n3 = R$id.internal_right_drawable;
                View view5 = view = dd2_2.a(n3, object);
                view5 = (ImageView)view;
                if (view5 != null) {
                    n3 = R$id.internal_textview;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (AjioTextView)view;
                    if (object2 != null) {
                        object = new AjioCenterDrawableButtonBinding((LinearLayout)view3, (LinearLayout)view2, (LinearLayout)view3, (ImageView)view4, (ImageView)view5, (AjioTextView)object2);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static AjioCenterDrawableButtonBinding inflate(LayoutInflater layoutInflater) {
        return AjioCenterDrawableButtonBinding.inflate(layoutInflater, null, false);
    }

    public static AjioCenterDrawableButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.ajio_center_drawable_button;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return AjioCenterDrawableButtonBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

