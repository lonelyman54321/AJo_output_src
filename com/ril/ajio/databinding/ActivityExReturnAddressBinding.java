/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ToolbarReturnExTabAddressBinding;

public final class ActivityExReturnAddressBinding
implements BC3 {
    public final FrameLayout exReturnAddressContentframe;
    public final AjioLoaderView exReturnTabAddressProgressView;
    public final ToolbarReturnExTabAddressBinding exReturnTabAddressToolbar;
    public final AjioTextView exReturnTabAddressTvNotification;
    private final RelativeLayout rootView;

    private ActivityExReturnAddressBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, AjioLoaderView ajioLoaderView, ToolbarReturnExTabAddressBinding toolbarReturnExTabAddressBinding, AjioTextView ajioTextView) {
        this.rootView = relativeLayout;
        this.exReturnAddressContentframe = frameLayout;
        this.exReturnTabAddressProgressView = ajioLoaderView;
        this.exReturnTabAddressToolbar = toolbarReturnExTabAddressBinding;
        this.exReturnTabAddressTvNotification = ajioTextView;
    }

    public static ActivityExReturnAddressBinding bind(View object) {
        View view;
        int n3 = R$id.ex_return_address_contentframe;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (FrameLayout)view;
        if (view2 != null) {
            n3 = R$id.ex_return_tab_address_progressView;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioLoaderView)view;
            if (object2 != null && (view = dd2_2.a(n3 = R$id.ex_return_tab_address_toolbar, object)) != null) {
                ToolbarReturnExTabAddressBinding toolbarReturnExTabAddressBinding = ToolbarReturnExTabAddressBinding.bind(view);
                n3 = R$id.ex_return_tab_address_tv_notification;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    Object object4 = object;
                    object4 = (RelativeLayout)object;
                    ActivityExReturnAddressBinding activityExReturnAddressBinding = new ActivityExReturnAddressBinding((RelativeLayout)object4, (FrameLayout)view2, (AjioLoaderView)((Object)object2), toolbarReturnExTabAddressBinding, (AjioTextView)object3);
                    return activityExReturnAddressBinding;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityExReturnAddressBinding inflate(LayoutInflater layoutInflater) {
        return ActivityExReturnAddressBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityExReturnAddressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_ex_return_address;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityExReturnAddressBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

