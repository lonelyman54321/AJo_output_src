/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentNotificationCenterBinding
implements BC3 {
    public final TextView continueShopping;
    public final RelativeLayout emptyLayout;
    public final ImageView emptyNotificationImg;
    public final AjioTextView noNotifications;
    public final RecyclerView notificationList;
    public final CoordinatorLayout notificationParent;
    private final CoordinatorLayout rootView;
    public final AjioTextView stayTuned;

    private FragmentNotificationCenterBinding(CoordinatorLayout coordinatorLayout, TextView textView, RelativeLayout relativeLayout, ImageView imageView, AjioTextView ajioTextView, RecyclerView recyclerView, CoordinatorLayout coordinatorLayout2, AjioTextView ajioTextView2) {
        this.rootView = coordinatorLayout;
        this.continueShopping = textView;
        this.emptyLayout = relativeLayout;
        this.emptyNotificationImg = imageView;
        this.noNotifications = ajioTextView;
        this.notificationList = recyclerView;
        this.notificationParent = coordinatorLayout2;
        this.stayTuned = ajioTextView2;
    }

    public static FragmentNotificationCenterBinding bind(View object) {
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
                        n3 = R$id.notification_list;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (RecyclerView)view;
                        if (object3 != null) {
                            Object object4 = object;
                            object4 = (CoordinatorLayout)object;
                            n3 = R$id.stay_tuned;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AjioTextView)view;
                            if (object5 != null) {
                                object = new FragmentNotificationCenterBinding((CoordinatorLayout)object4, (TextView)view2, (RelativeLayout)view3, (ImageView)view4, (AjioTextView)object2, (RecyclerView)object3, (CoordinatorLayout)object4, (AjioTextView)object5);
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

    public static FragmentNotificationCenterBinding inflate(LayoutInflater layoutInflater) {
        return FragmentNotificationCenterBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentNotificationCenterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_notification_center;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentNotificationCenterBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

