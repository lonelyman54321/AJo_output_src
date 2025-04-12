/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;

public final class ActivityCustomerCareRefreshBinding
implements BC3 {
    public final AjioLoaderView ajioLoaderView;
    public final FrameLayout customercareContentframe;
    private final ConstraintLayout rootView;

    private ActivityCustomerCareRefreshBinding(ConstraintLayout constraintLayout, AjioLoaderView ajioLoaderView, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.ajioLoaderView = ajioLoaderView;
        this.customercareContentframe = frameLayout;
    }

    public static ActivityCustomerCareRefreshBinding bind(View object) {
        FrameLayout frameLayout;
        int n3 = R$id.ajio_loader_view;
        AjioLoaderView ajioLoaderView = (AjioLoaderView)dd2_2.a(n3, object);
        if (ajioLoaderView != null && (frameLayout = (FrameLayout)dd2_2.a(n3 = R$id.customercare_contentframe, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            ActivityCustomerCareRefreshBinding activityCustomerCareRefreshBinding = new ActivityCustomerCareRefreshBinding((ConstraintLayout)((Object)object), ajioLoaderView, frameLayout);
            return activityCustomerCareRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityCustomerCareRefreshBinding inflate(LayoutInflater layoutInflater) {
        return ActivityCustomerCareRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityCustomerCareRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_customer_care_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityCustomerCareRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

