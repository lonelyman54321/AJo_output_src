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
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;

public final class FragmentCcComplaintListRefreshBinding
implements BC3 {
    public final AppBarLayout appBarLayout;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final RecyclerView complaintListView;
    public final AjioProgressView customercareProgressBar;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;

    private FragmentCcComplaintListRefreshBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, RecyclerView recyclerView, AjioProgressView ajioProgressView, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, Toolbar toolbar, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2) {
        this.rootView = coordinatorLayout;
        this.appBarLayout = appBarLayout;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.complaintListView = recyclerView;
        this.customercareProgressBar = ajioProgressView;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
    }

    public static FragmentCcComplaintListRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.app_bar_layout;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppBarLayout)view;
        if (object2 != null) {
            n3 = R$id.collapsing_toolbar;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (CollapsingToolbarLayout)view;
            if (object3 != null) {
                n3 = R$id.complaint_list_view;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (RecyclerView)view;
                if (object4 != null) {
                    n3 = R$id.customercare_progress_bar;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioProgressView)view;
                    if (object5 != null && (view = dd2_2.a(n3 = R$id.float_header_view, object)) != null) {
                        ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding = ToolbarTitleSubtitleViewBinding.bind(view);
                        n3 = R$id.toolbar;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (Toolbar)view;
                        if (object6 != null && (view = dd2_2.a(n3 = R$id.toolbar_header_view, object)) != null) {
                            ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view);
                            Object object7 = object;
                            object7 = (CoordinatorLayout)object;
                            FragmentCcComplaintListRefreshBinding fragmentCcComplaintListRefreshBinding = new FragmentCcComplaintListRefreshBinding((CoordinatorLayout)object7, (AppBarLayout)object2, (CollapsingToolbarLayout)((Object)object3), (RecyclerView)object4, (AjioProgressView)((Object)object5), toolbarTitleSubtitleViewBinding, (Toolbar)object6, toolbarTitleSubtitleViewBinding2);
                            return fragmentCcComplaintListRefreshBinding;
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

    public static FragmentCcComplaintListRefreshBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCcComplaintListRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCcComplaintListRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_cc_complaint_list_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCcComplaintListRefreshBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

