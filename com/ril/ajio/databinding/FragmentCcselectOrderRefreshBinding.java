/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;

public final class FragmentCcselectOrderRefreshBinding
implements BC3 {
    public final AppBarLayout appBarLayout;
    public final TextView ccSelectorderDivider;
    public final RelativeLayout ccSelectorderFooter;
    public final ImageView ccSelectorderImvLeftarrow;
    public final ImageView ccSelectorderImvRightarrow;
    public final LinearLayout ccSelectorderLayoutNext;
    public final LinearLayout ccSelectorderLayoutPrev;
    public final AjioTextView ccSelectorderLayoutTvInfo;
    public final AjioTextView ccSelectorderLblNext;
    public final AjioTextView ccSelectorderLblPrev;
    public final RecyclerView ccSelectorderRv;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    private final ConstraintLayout rootView;
    public final Toolbar toolbar;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;

    private FragmentCcselectOrderRefreshBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, TextView textView, RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, RecyclerView recyclerView, CollapsingToolbarLayout collapsingToolbarLayout, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, Toolbar toolbar, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2) {
        this.rootView = constraintLayout;
        this.appBarLayout = appBarLayout;
        this.ccSelectorderDivider = textView;
        this.ccSelectorderFooter = relativeLayout;
        this.ccSelectorderImvLeftarrow = imageView;
        this.ccSelectorderImvRightarrow = imageView2;
        this.ccSelectorderLayoutNext = linearLayout;
        this.ccSelectorderLayoutPrev = linearLayout2;
        this.ccSelectorderLayoutTvInfo = ajioTextView;
        this.ccSelectorderLblNext = ajioTextView2;
        this.ccSelectorderLblPrev = ajioTextView3;
        this.ccSelectorderRv = recyclerView;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
    }

    public static FragmentCcselectOrderRefreshBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.app_bar_layout;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AppBarLayout)view2;
        if (object2 != null) {
            n3 = R$id.cc_selectorder_divider;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (TextView)view2;
            if (view3 != null) {
                n3 = R$id.cc_selectorder_footer;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (RelativeLayout)view2;
                if (view4 != null) {
                    n3 = R$id.cc_selectorder_imv_leftarrow;
                    View view5 = view2 = dd2_2.a(n3, view);
                    view5 = (ImageView)view2;
                    if (view5 != null) {
                        n3 = R$id.cc_selectorder_imv_rightarrow;
                        View view6 = view2 = dd2_2.a(n3, view);
                        view6 = (ImageView)view2;
                        if (view6 != null) {
                            n3 = R$id.cc_selectorder_layout_next;
                            View view7 = view2 = dd2_2.a(n3, view);
                            view7 = (LinearLayout)view2;
                            if (view7 != null) {
                                n3 = R$id.cc_selectorder_layout_prev;
                                View view8 = view2 = dd2_2.a(n3, view);
                                view8 = (LinearLayout)view2;
                                if (view8 != null) {
                                    n3 = R$id.cc_selectorder_layout_tv_info;
                                    Object object3 = view2 = dd2_2.a(n3, view);
                                    object3 = (AjioTextView)view2;
                                    if (object3 != null) {
                                        n3 = R$id.cc_selectorder_lbl_next;
                                        Object object4 = view2 = dd2_2.a(n3, view);
                                        object4 = (AjioTextView)view2;
                                        if (object4 != null) {
                                            n3 = R$id.cc_selectorder_lbl_prev;
                                            Object object5 = view2 = dd2_2.a(n3, view);
                                            object5 = (AjioTextView)view2;
                                            if (object5 != null) {
                                                n3 = R$id.cc_selectorder_rv;
                                                Object object6 = view2 = dd2_2.a(n3, view);
                                                object6 = (RecyclerView)view2;
                                                if (object6 != null) {
                                                    n3 = R$id.collapsing_toolbar;
                                                    Object object7 = view2 = dd2_2.a(n3, view);
                                                    object7 = (CollapsingToolbarLayout)view2;
                                                    if (object7 != null && (view2 = dd2_2.a(n3 = R$id.float_header_view, view)) != null) {
                                                        ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding = ToolbarTitleSubtitleViewBinding.bind(view2);
                                                        n3 = R$id.toolbar;
                                                        Object object8 = view2 = dd2_2.a(n3, view);
                                                        object8 = (Toolbar)view2;
                                                        if (object8 != null && (view2 = dd2_2.a(n3 = R$id.toolbar_header_view, view)) != null) {
                                                            ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view2);
                                                            Object object9 = view;
                                                            object9 = (ConstraintLayout)view;
                                                            FragmentCcselectOrderRefreshBinding fragmentCcselectOrderRefreshBinding = new FragmentCcselectOrderRefreshBinding((ConstraintLayout)((Object)object9), (AppBarLayout)object2, (TextView)view3, (RelativeLayout)view4, (ImageView)view5, (ImageView)view6, (LinearLayout)view7, (LinearLayout)view8, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (RecyclerView)object6, (CollapsingToolbarLayout)((Object)object7), toolbarTitleSubtitleViewBinding, (Toolbar)object8, toolbarTitleSubtitleViewBinding2);
                                                            return fragmentCcselectOrderRefreshBinding;
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
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentCcselectOrderRefreshBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCcselectOrderRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCcselectOrderRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_ccselect_order_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCcselectOrderRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

