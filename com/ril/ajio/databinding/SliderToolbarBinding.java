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
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;

public final class SliderToolbarBinding
implements BC3 {
    public final AppBarLayout appBarLayout;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;
    public final AjioAspectRatioImageView toolbarBgIv;
    public final FrameLayout toolbarFrameLayout;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;

    private SliderToolbarBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, Toolbar toolbar, AjioAspectRatioImageView ajioAspectRatioImageView, FrameLayout frameLayout, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2) {
        this.rootView = coordinatorLayout;
        this.appBarLayout = appBarLayout;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.toolbar = toolbar;
        this.toolbarBgIv = ajioAspectRatioImageView;
        this.toolbarFrameLayout = frameLayout;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
    }

    public static SliderToolbarBinding bind(View object) {
        View view;
        int n3 = R$id.app_bar_layout;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppBarLayout)view;
        if (object2 != null) {
            n3 = R$id.collapsing_toolbar;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (CollapsingToolbarLayout)view;
            if (object3 != null && (view = dd2_2.a(n3 = R$id.float_header_view, object)) != null) {
                ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding = ToolbarTitleSubtitleViewBinding.bind(view);
                n3 = R$id.toolbar;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (Toolbar)view;
                if (object4 != null) {
                    n3 = R$id.toolbar_bg_iv;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioAspectRatioImageView)view;
                    if (object5 != null) {
                        n3 = R$id.toolbar_frame_layout;
                        View view2 = view = dd2_2.a(n3, object);
                        view2 = (FrameLayout)view;
                        if (view2 != null && (view = dd2_2.a(n3 = R$id.toolbar_header_view, object)) != null) {
                            ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view);
                            Object object6 = object;
                            object6 = (CoordinatorLayout)object;
                            SliderToolbarBinding sliderToolbarBinding = new SliderToolbarBinding((CoordinatorLayout)object6, (AppBarLayout)object2, (CollapsingToolbarLayout)((Object)object3), toolbarTitleSubtitleViewBinding, (Toolbar)object4, (AjioAspectRatioImageView)((Object)object5), (FrameLayout)view2, toolbarTitleSubtitleViewBinding2);
                            return sliderToolbarBinding;
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

    public static SliderToolbarBinding inflate(LayoutInflater layoutInflater) {
        return SliderToolbarBinding.inflate(layoutInflater, null, false);
    }

    public static SliderToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.slider_toolbar;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SliderToolbarBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

