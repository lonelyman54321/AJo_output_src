/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;

public final class FragmentOrderTrackingBinding
implements BC3 {
    public final AppBarLayout appBarLayout;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    public final LinearLayout fotLayoutStatus;
    public final NestedScrollView fotScrollviewComplete;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;

    private FragmentOrderTrackingBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, LinearLayout linearLayout, NestedScrollView nestedScrollView, Toolbar toolbar, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2) {
        this.rootView = coordinatorLayout;
        this.appBarLayout = appBarLayout;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.fotLayoutStatus = linearLayout;
        this.fotScrollviewComplete = nestedScrollView;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
    }

    public static FragmentOrderTrackingBinding bind(View object) {
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
                n3 = R$id.fot_layout_status;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (LinearLayout)view;
                if (view2 != null) {
                    n3 = R$id.fot_scrollview_complete;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (NestedScrollView)view;
                    if (object4 != null) {
                        n3 = R$id.toolbar;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (Toolbar)view;
                        if (object5 != null && (view = dd2_2.a(n3 = R$id.toolbar_header_view, object)) != null) {
                            ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view);
                            Object object6 = object;
                            object6 = (CoordinatorLayout)object;
                            FragmentOrderTrackingBinding fragmentOrderTrackingBinding = new FragmentOrderTrackingBinding((CoordinatorLayout)object6, (AppBarLayout)object2, (CollapsingToolbarLayout)((Object)object3), toolbarTitleSubtitleViewBinding, (LinearLayout)view2, (NestedScrollView)object4, (Toolbar)object5, toolbarTitleSubtitleViewBinding2);
                            return fragmentOrderTrackingBinding;
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

    public static FragmentOrderTrackingBinding inflate(LayoutInflater layoutInflater) {
        return FragmentOrderTrackingBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentOrderTrackingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_order_tracking;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentOrderTrackingBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

