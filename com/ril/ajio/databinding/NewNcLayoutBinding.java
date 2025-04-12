/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewNcLayoutBinding
implements BC3 {
    public final TextView continueShopping;
    public final RelativeLayout emptyLayout;
    public final ImageView emptyNotificationImg;
    public final AjioTextView noNotifications;
    private final FrameLayout rootView;
    public final AjioTextView stayTuned;

    private NewNcLayoutBinding(FrameLayout frameLayout, TextView textView, RelativeLayout relativeLayout, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = frameLayout;
        this.continueShopping = textView;
        this.emptyLayout = relativeLayout;
        this.emptyNotificationImg = imageView;
        this.noNotifications = ajioTextView;
        this.stayTuned = ajioTextView2;
    }

    public static NewNcLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.continue_shopping;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.empty_layout;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (RelativeLayout)view;
            if (view3 != null) {
                n3 = R$id.empty_notification_img;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.no_notifications;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (AjioTextView)view;
                    if (object2 != null) {
                        n3 = R$id.stay_tuned;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioTextView)view;
                        if (object3 != null) {
                            Object object4 = object;
                            object4 = (FrameLayout)object;
                            NewNcLayoutBinding newNcLayoutBinding = new NewNcLayoutBinding((FrameLayout)object4, (TextView)view2, (RelativeLayout)view3, (ImageView)view4, (AjioTextView)object2, (AjioTextView)object3);
                            return newNcLayoutBinding;
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

    public static NewNcLayoutBinding inflate(LayoutInflater layoutInflater) {
        return NewNcLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static NewNcLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_nc_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewNcLayoutBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

