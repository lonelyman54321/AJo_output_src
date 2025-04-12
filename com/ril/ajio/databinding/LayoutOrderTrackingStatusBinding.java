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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutOrderTrackingStatusBinding
implements BC3 {
    public final AjioTextView lotsAtextviewDate;
    public final AjioTextView lotsAtextviewMessage;
    public final AjioTextView lotsAtextviewStatus;
    public final ImageView lotsImageviewStatus;
    public final ImageView lotsImageviewToggle;
    public final LinearLayout lotsLayoutMessage;
    public final View lotsViewDivider;
    private final RelativeLayout rootView;

    private LayoutOrderTrackingStatusBinding(RelativeLayout relativeLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, View view) {
        this.rootView = relativeLayout;
        this.lotsAtextviewDate = ajioTextView;
        this.lotsAtextviewMessage = ajioTextView2;
        this.lotsAtextviewStatus = ajioTextView3;
        this.lotsImageviewStatus = imageView;
        this.lotsImageviewToggle = imageView2;
        this.lotsLayoutMessage = linearLayout;
        this.lotsViewDivider = view;
    }

    public static LayoutOrderTrackingStatusBinding bind(View object) {
        View view;
        int n3 = R$id.lots_atextview_date;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.lots_atextview_message;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.lots_atextview_status;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.lots_imageview_status;
                    View view2 = view = dd2_2.a(n3, object);
                    view2 = (ImageView)view;
                    if (view2 != null) {
                        n3 = R$id.lots_imageview_toggle;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (ImageView)view;
                        if (view3 != null) {
                            View view4;
                            n3 = R$id.lots_layout_message;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (LinearLayout)view;
                            if (view5 != null && (view4 = dd2_2.a(n3 = R$id.lots_view_divider, object)) != null) {
                                Object object5 = object;
                                object5 = (RelativeLayout)object;
                                LayoutOrderTrackingStatusBinding layoutOrderTrackingStatusBinding = new LayoutOrderTrackingStatusBinding((RelativeLayout)object5, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (ImageView)view2, (ImageView)view3, (LinearLayout)view5, view4);
                                return layoutOrderTrackingStatusBinding;
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

    public static LayoutOrderTrackingStatusBinding inflate(LayoutInflater layoutInflater) {
        return LayoutOrderTrackingStatusBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutOrderTrackingStatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_order_tracking_status;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutOrderTrackingStatusBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

