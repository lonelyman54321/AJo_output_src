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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ActivityLoginLayoutBinding
implements BC3 {
    public final AjioLoaderView ajioLoaderView;
    public final FrameLayout loginMainContainer;
    public final ConstraintLayout loginToolbar;
    public final AjioImageView loginToolbarImvBack;
    public final AppCompatImageView loginToolbarIvClose;
    public final AjioTextView loginToolbarTvSkip;
    private final ConstraintLayout rootView;

    private ActivityLoginLayoutBinding(ConstraintLayout constraintLayout, AjioLoaderView ajioLoaderView, FrameLayout frameLayout, ConstraintLayout constraintLayout2, AjioImageView ajioImageView, AppCompatImageView appCompatImageView, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.ajioLoaderView = ajioLoaderView;
        this.loginMainContainer = frameLayout;
        this.loginToolbar = constraintLayout2;
        this.loginToolbarImvBack = ajioImageView;
        this.loginToolbarIvClose = appCompatImageView;
        this.loginToolbarTvSkip = ajioTextView;
    }

    public static ActivityLoginLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.ajio_loader_view;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioLoaderView)view;
        if (object2 != null) {
            n3 = R$id.login_main_container;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (FrameLayout)view;
            if (view2 != null) {
                n3 = R$id.login_toolbar;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (ConstraintLayout)view;
                if (object3 != null) {
                    n3 = R$id.login_toolbar_imv_back;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioImageView)view;
                    if (object4 != null) {
                        n3 = R$id.login_toolbar_iv_close;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AppCompatImageView)view;
                        if (object5 != null) {
                            n3 = R$id.login_toolbar_tv_skip;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                Object object7 = object;
                                object7 = (ConstraintLayout)((Object)object);
                                ActivityLoginLayoutBinding activityLoginLayoutBinding = new ActivityLoginLayoutBinding((ConstraintLayout)((Object)object7), (AjioLoaderView)((Object)object2), (FrameLayout)view2, (ConstraintLayout)((Object)object3), (AjioImageView)((Object)object4), (AppCompatImageView)((Object)object5), (AjioTextView)object6);
                                return activityLoginLayoutBinding;
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

    public static ActivityLoginLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ActivityLoginLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityLoginLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_login_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityLoginLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

