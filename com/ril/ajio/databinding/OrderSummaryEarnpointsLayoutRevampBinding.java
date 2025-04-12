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

public final class OrderSummaryEarnpointsLayoutRevampBinding
implements BC3 {
    public final ConstraintLayout clEarnedPoints;
    public final ImageView oselrIvLogo;
    public final TextView oselrTvEarnPoint;
    public final TextView oselrTvMoreDetails;
    private final ConstraintLayout rootView;

    private OrderSummaryEarnpointsLayoutRevampBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.clEarnedPoints = constraintLayout2;
        this.oselrIvLogo = imageView;
        this.oselrTvEarnPoint = textView;
        this.oselrTvMoreDetails = textView2;
    }

    public static OrderSummaryEarnpointsLayoutRevampBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.oselrIvLogo;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.oselrTvEarnPoint;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.oselrTvMoreDetails;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    Object object3 = object;
                    view = object2;
                    object = new OrderSummaryEarnpointsLayoutRevampBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), (ImageView)view2, (TextView)view3, (TextView)view4);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static OrderSummaryEarnpointsLayoutRevampBinding inflate(LayoutInflater layoutInflater) {
        return OrderSummaryEarnpointsLayoutRevampBinding.inflate(layoutInflater, null, false);
    }

    public static OrderSummaryEarnpointsLayoutRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.order_summary_earnpoints_layout_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OrderSummaryEarnpointsLayoutRevampBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

