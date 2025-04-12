/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;

public final class LayoutClosetBauBinding
implements BC3 {
    public final AppBarLayout appBarLayout;
    public final RecyclerView closetGrid;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;

    private LayoutClosetBauBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, RecyclerView recyclerView, CollapsingToolbarLayout collapsingToolbarLayout, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, Toolbar toolbar, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2) {
        this.rootView = coordinatorLayout;
        this.appBarLayout = appBarLayout;
        this.closetGrid = recyclerView;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
    }

    public static LayoutClosetBauBinding bind(View object) {
        View view;
        int n3 = R$id.app_bar_layout;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppBarLayout)view;
        if (object2 != null) {
            n3 = R$id.closet_grid;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (RecyclerView)view;
            if (object3 != null) {
                n3 = R$id.collapsing_toolbar;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (CollapsingToolbarLayout)view;
                if (object4 != null && (view = dd2_2.a(n3 = R$id.float_header_view, object)) != null) {
                    ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding = ToolbarTitleSubtitleViewBinding.bind(view);
                    n3 = R$id.toolbar;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (Toolbar)view;
                    if (object5 != null && (view = dd2_2.a(n3 = R$id.toolbar_header_view, object)) != null) {
                        ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view);
                        Object object6 = object;
                        object6 = (CoordinatorLayout)object;
                        LayoutClosetBauBinding layoutClosetBauBinding = new LayoutClosetBauBinding((CoordinatorLayout)object6, (AppBarLayout)object2, (RecyclerView)object3, (CollapsingToolbarLayout)((Object)object4), toolbarTitleSubtitleViewBinding, (Toolbar)object5, toolbarTitleSubtitleViewBinding2);
                        return layoutClosetBauBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutClosetBauBinding inflate(LayoutInflater layoutInflater) {
        return LayoutClosetBauBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutClosetBauBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_closet_bau;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutClosetBauBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

