/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.CcToolbarBinding;

public final class ActivityCccancelOrderBinding
implements BC3 {
    public final FrameLayout cccancelOrderContentframe;
    public final TextView cccancelOrderDivider;
    public final CcToolbarBinding cccancelOrderToolbar;
    public final LinearLayout notification;
    public final AjioTextView notificationText;
    private final RelativeLayout rootView;

    private ActivityCccancelOrderBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, TextView textView, CcToolbarBinding ccToolbarBinding, LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = relativeLayout;
        this.cccancelOrderContentframe = frameLayout;
        this.cccancelOrderDivider = textView;
        this.cccancelOrderToolbar = ccToolbarBinding;
        this.notification = linearLayout;
        this.notificationText = ajioTextView;
    }

    public static ActivityCccancelOrderBinding bind(View object) {
        View view;
        int n3 = R$id.cccancel_order_contentframe;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (FrameLayout)view;
        if (view2 != null) {
            n3 = R$id.cccancel_order_divider;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null && (view = dd2_2.a(n3 = R$id.cccancel_order_toolbar, object)) != null) {
                CcToolbarBinding ccToolbarBinding = CcToolbarBinding.bind(view);
                n3 = R$id.notification;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (LinearLayout)view;
                if (view4 != null) {
                    n3 = R$id.notification_text;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (AjioTextView)view;
                    if (object2 != null) {
                        Object object3 = object;
                        object3 = (RelativeLayout)object;
                        ActivityCccancelOrderBinding activityCccancelOrderBinding = new ActivityCccancelOrderBinding((RelativeLayout)object3, (FrameLayout)view2, (TextView)view3, ccToolbarBinding, (LinearLayout)view4, (AjioTextView)object2);
                        return activityCccancelOrderBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityCccancelOrderBinding inflate(LayoutInflater layoutInflater) {
        return ActivityCccancelOrderBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityCccancelOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_cccancel_order;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityCccancelOrderBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

