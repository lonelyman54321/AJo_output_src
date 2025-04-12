/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.EmptyCartLayoutRefreshBinding;
import com.ril.ajio.databinding.RefereeWidgetLayoutBinding;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;

public final class FragmentCartListRefreshBinding
implements BC3 {
    public final AppBarLayout appBarLayout;
    public final RecyclerView cartRv;
    public final LinearLayout cartShimmer;
    public final ShimmerFrameLayout cartShimmerView;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final EmptyCartLayoutRefreshBinding emptyCartLayout;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    public final FrameLayout fragmentCartListLayoutButton;
    public final LottieAnimationView idCartAssuredAnim;
    public final AjioTextView idFloatingAssuredGiftAmount;
    public final LinearLayout idFloatingAssuredGiftView;
    public final AjioProgressView newFragmentCartListProgressBar;
    public final RefereeWidgetLayoutBinding refereeWidget;
    private final ConstraintLayout rootView;
    public final CoordinatorLayout titleProductContainer;
    public final Toolbar toolbar;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;

    private FragmentCartListRefreshBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, RecyclerView recyclerView, LinearLayout linearLayout, ShimmerFrameLayout shimmerFrameLayout, CollapsingToolbarLayout collapsingToolbarLayout, EmptyCartLayoutRefreshBinding emptyCartLayoutRefreshBinding, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, FrameLayout frameLayout, LottieAnimationView lottieAnimationView, AjioTextView ajioTextView, LinearLayout linearLayout2, AjioProgressView ajioProgressView, RefereeWidgetLayoutBinding refereeWidgetLayoutBinding, CoordinatorLayout coordinatorLayout, Toolbar toolbar, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2) {
        this.rootView = constraintLayout;
        this.appBarLayout = appBarLayout;
        this.cartRv = recyclerView;
        this.cartShimmer = linearLayout;
        this.cartShimmerView = shimmerFrameLayout;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.emptyCartLayout = emptyCartLayoutRefreshBinding;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.fragmentCartListLayoutButton = frameLayout;
        this.idCartAssuredAnim = lottieAnimationView;
        this.idFloatingAssuredGiftAmount = ajioTextView;
        this.idFloatingAssuredGiftView = linearLayout2;
        this.newFragmentCartListProgressBar = ajioProgressView;
        this.refereeWidget = refereeWidgetLayoutBinding;
        this.titleProductContainer = coordinatorLayout;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
    }

    public static FragmentCartListRefreshBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.app_bar_layout;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AppBarLayout)view2;
        if (object2 != null) {
            n3 = R$id.cart_rv;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (RecyclerView)view2;
            if (object3 != null) {
                n3 = R$id.cart_shimmer;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (LinearLayout)view2;
                if (view3 != null) {
                    n3 = R$id.cart_shimmer_view;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (ShimmerFrameLayout)view2;
                    if (object4 != null) {
                        n3 = R$id.collapsing_toolbar;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (CollapsingToolbarLayout)view2;
                        if (object5 != null && (view2 = dd2_2.a(n3 = R$id.emptyCartLayout, view)) != null) {
                            EmptyCartLayoutRefreshBinding emptyCartLayoutRefreshBinding = EmptyCartLayoutRefreshBinding.bind(view2);
                            n3 = R$id.float_header_view;
                            view2 = dd2_2.a(n3, view);
                            if (view2 != null) {
                                ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding = ToolbarTitleSubtitleViewBinding.bind(view2);
                                n3 = R$id.fragment_cart_list_layout_button;
                                View view4 = view2 = dd2_2.a(n3, view);
                                view4 = (FrameLayout)view2;
                                if (view4 != null) {
                                    n3 = R$id.id_cart_assured_anim;
                                    Object object6 = view2 = dd2_2.a(n3, view);
                                    object6 = (LottieAnimationView)view2;
                                    if (object6 != null) {
                                        n3 = R$id.id_floating_assured_gift_amount;
                                        Object object7 = view2 = dd2_2.a(n3, view);
                                        object7 = (AjioTextView)view2;
                                        if (object7 != null) {
                                            n3 = R$id.id_floating_assured_gift_view;
                                            View view5 = view2 = dd2_2.a(n3, view);
                                            view5 = (LinearLayout)view2;
                                            if (view5 != null) {
                                                n3 = R$id.new_fragment_cart_list_progress_bar;
                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                object8 = (AjioProgressView)view2;
                                                if (object8 != null && (view2 = dd2_2.a(n3 = R$id.refereeWidget, view)) != null) {
                                                    RefereeWidgetLayoutBinding refereeWidgetLayoutBinding = RefereeWidgetLayoutBinding.bind(view2);
                                                    n3 = R$id.titleProductContainer;
                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                    object9 = (CoordinatorLayout)view2;
                                                    if (object9 != null) {
                                                        n3 = R$id.toolbar;
                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                        object10 = (Toolbar)view2;
                                                        if (object10 != null && (view2 = dd2_2.a(n3 = R$id.toolbar_header_view, view)) != null) {
                                                            ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view2);
                                                            Object object11 = view;
                                                            object11 = (ConstraintLayout)view;
                                                            FragmentCartListRefreshBinding fragmentCartListRefreshBinding = new FragmentCartListRefreshBinding((ConstraintLayout)((Object)object11), (AppBarLayout)object2, (RecyclerView)object3, (LinearLayout)view3, (ShimmerFrameLayout)((Object)object4), (CollapsingToolbarLayout)((Object)object5), emptyCartLayoutRefreshBinding, toolbarTitleSubtitleViewBinding, (FrameLayout)view4, (LottieAnimationView)((Object)object6), (AjioTextView)object7, (LinearLayout)view5, (AjioProgressView)((Object)object8), refereeWidgetLayoutBinding, (CoordinatorLayout)object9, (Toolbar)object10, toolbarTitleSubtitleViewBinding2);
                                                            return fragmentCartListRefreshBinding;
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

    public static FragmentCartListRefreshBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCartListRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCartListRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_cart_list_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCartListRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

