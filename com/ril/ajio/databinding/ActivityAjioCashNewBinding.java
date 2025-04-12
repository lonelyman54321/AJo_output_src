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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;

public final class ActivityAjioCashNewBinding
implements BC3 {
    public final AjioLoaderView ajioLoaderView;
    public final FrameLayout fragmentContainer;
    private final FrameLayout rootView;

    private ActivityAjioCashNewBinding(FrameLayout frameLayout, AjioLoaderView ajioLoaderView, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.ajioLoaderView = ajioLoaderView;
        this.fragmentContainer = frameLayout2;
    }

    public static ActivityAjioCashNewBinding bind(View object) {
        FrameLayout frameLayout;
        int n3 = R$id.ajioLoaderView;
        AjioLoaderView ajioLoaderView = (AjioLoaderView)dd2_2.a(n3, object);
        if (ajioLoaderView != null && (frameLayout = (FrameLayout)dd2_2.a(n3 = R$id.fragmentContainer, object)) != null) {
            object = (FrameLayout)object;
            ActivityAjioCashNewBinding activityAjioCashNewBinding = new ActivityAjioCashNewBinding((FrameLayout)object, ajioLoaderView, frameLayout);
            return activityAjioCashNewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityAjioCashNewBinding inflate(LayoutInflater layoutInflater) {
        return ActivityAjioCashNewBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityAjioCashNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_ajio_cash_new;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityAjioCashNewBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

