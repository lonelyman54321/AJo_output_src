/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.databinding.PesdkViewToolbarBinding;

public final class PesdkNetbankingFragmentBinding
implements BC3 {
    public final ImageView categoryImvSearch;
    public final LinearLayout categorySearchLayout;
    public final RecyclerView netbankingList;
    public final PEProgressView paymentProgressBar;
    public final AppBarLayout pesdkAppBarLayout;
    public final CollapsingToolbarLayout pesdkCollapsingToolbar;
    public final PesdkViewToolbarBinding pesdkFloatHeaderView;
    public final CoordinatorLayout pesdkLayoutCoordinator;
    public final Toolbar pesdkToolbar;
    public final PesdkViewToolbarBinding pesdkToolbarHeaderView;
    private final RelativeLayout rootView;
    public final FrameLayout sampleContentFragment;
    public final EditText searchText;

    private PesdkNetbankingFragmentBinding(RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, RecyclerView recyclerView, PEProgressView pEProgressView, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, PesdkViewToolbarBinding pesdkViewToolbarBinding, CoordinatorLayout coordinatorLayout, Toolbar toolbar, PesdkViewToolbarBinding pesdkViewToolbarBinding2, FrameLayout frameLayout, EditText editText) {
        this.rootView = relativeLayout;
        this.categoryImvSearch = imageView;
        this.categorySearchLayout = linearLayout;
        this.netbankingList = recyclerView;
        this.paymentProgressBar = pEProgressView;
        this.pesdkAppBarLayout = appBarLayout;
        this.pesdkCollapsingToolbar = collapsingToolbarLayout;
        this.pesdkFloatHeaderView = pesdkViewToolbarBinding;
        this.pesdkLayoutCoordinator = coordinatorLayout;
        this.pesdkToolbar = toolbar;
        this.pesdkToolbarHeaderView = pesdkViewToolbarBinding2;
        this.sampleContentFragment = frameLayout;
        this.searchText = editText;
    }

    public static PesdkNetbankingFragmentBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.category_imv_search;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (ImageView)view2;
        if (view3 != null) {
            n3 = R$id.category_search_layout;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (LinearLayout)view2;
            if (view4 != null) {
                n3 = R$id.netbanking_list;
                Object object2 = view2 = dd2_2.a(n3, view);
                object2 = (RecyclerView)view2;
                if (object2 != null) {
                    n3 = R$id.payment_progress_bar;
                    Object object3 = view2 = dd2_2.a(n3, view);
                    object3 = (PEProgressView)view2;
                    if (object3 != null) {
                        n3 = R$id.pesdk_app_bar_layout;
                        Object object4 = view2 = dd2_2.a(n3, view);
                        object4 = (AppBarLayout)view2;
                        if (object4 != null) {
                            n3 = R$id.pesdk_collapsing_toolbar;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (CollapsingToolbarLayout)view2;
                            if (object5 != null && (view2 = dd2_2.a(n3 = R$id.pesdk_float_header_view, view)) != null) {
                                PesdkViewToolbarBinding pesdkViewToolbarBinding = PesdkViewToolbarBinding.bind(view2);
                                n3 = R$id.pesdk_layout_coordinator;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (CoordinatorLayout)view2;
                                if (object6 != null) {
                                    n3 = R$id.pesdk_toolbar;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (Toolbar)view2;
                                    if (object7 != null && (view2 = dd2_2.a(n3 = R$id.pesdk_toolbar_header_view, view)) != null) {
                                        PesdkViewToolbarBinding pesdkViewToolbarBinding2 = PesdkViewToolbarBinding.bind(view2);
                                        n3 = R$id.sample_content_fragment;
                                        View view5 = view2 = dd2_2.a(n3, view);
                                        view5 = (FrameLayout)view2;
                                        if (view5 != null) {
                                            n3 = R$id.search_text;
                                            View view6 = view2 = dd2_2.a(n3, view);
                                            view6 = (EditText)view2;
                                            if (view6 != null) {
                                                View view7 = view;
                                                view7 = (RelativeLayout)view;
                                                PesdkNetbankingFragmentBinding pesdkNetbankingFragmentBinding = new PesdkNetbankingFragmentBinding((RelativeLayout)view7, (ImageView)view3, (LinearLayout)view4, (RecyclerView)object2, (PEProgressView)((Object)object3), (AppBarLayout)object4, (CollapsingToolbarLayout)((Object)object5), pesdkViewToolbarBinding, (CoordinatorLayout)object6, (Toolbar)object7, pesdkViewToolbarBinding2, (FrameLayout)view5, (EditText)view6);
                                                return pesdkNetbankingFragmentBinding;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkNetbankingFragmentBinding inflate(LayoutInflater layoutInflater) {
        return PesdkNetbankingFragmentBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkNetbankingFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_netbanking_fragment;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkNetbankingFragmentBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

