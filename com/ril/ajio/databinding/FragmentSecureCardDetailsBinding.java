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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.PesdkViewToolbarBinding;

public final class FragmentSecureCardDetailsBinding
implements BC3 {
    public final AppCompatImageView ivLogo;
    public final AppCompatImageView ivVault;
    public final ConstraintLayout layButton;
    public final AppBarLayout pesdkAppBarLayout;
    public final CollapsingToolbarLayout pesdkCollapsingToolbar;
    public final PesdkViewToolbarBinding pesdkFloatHeaderView;
    public final CoordinatorLayout pesdkLayoutCoordinator;
    public final Toolbar pesdkToolbar;
    public final PesdkViewToolbarBinding pesdkToolbarHeaderView;
    private final ConstraintLayout rootView;
    public final RecyclerView rvGuidelines;
    public final ConstraintLayout sampleContentFragment;
    public final AppCompatTextView tvGuidelineHeading;
    public final AjioTextView tvProceed;
    public final AjioTextView tvSkip;

    private FragmentSecureCardDetailsBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout2, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, PesdkViewToolbarBinding pesdkViewToolbarBinding, CoordinatorLayout coordinatorLayout, Toolbar toolbar, PesdkViewToolbarBinding pesdkViewToolbarBinding2, RecyclerView recyclerView, ConstraintLayout constraintLayout3, AppCompatTextView appCompatTextView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.ivLogo = appCompatImageView;
        this.ivVault = appCompatImageView2;
        this.layButton = constraintLayout2;
        this.pesdkAppBarLayout = appBarLayout;
        this.pesdkCollapsingToolbar = collapsingToolbarLayout;
        this.pesdkFloatHeaderView = pesdkViewToolbarBinding;
        this.pesdkLayoutCoordinator = coordinatorLayout;
        this.pesdkToolbar = toolbar;
        this.pesdkToolbarHeaderView = pesdkViewToolbarBinding2;
        this.rvGuidelines = recyclerView;
        this.sampleContentFragment = constraintLayout3;
        this.tvGuidelineHeading = appCompatTextView;
        this.tvProceed = ajioTextView;
        this.tvSkip = ajioTextView2;
    }

    public static FragmentSecureCardDetailsBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.iv_logo;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AppCompatImageView)view2;
        if (object2 != null) {
            n3 = R$id.iv_vault;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AppCompatImageView)view2;
            if (object3 != null) {
                n3 = R$id.lay_button;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (ConstraintLayout)view2;
                if (object4 != null) {
                    n3 = R$id.pesdk_app_bar_layout;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AppBarLayout)view2;
                    if (object5 != null) {
                        n3 = R$id.pesdk_collapsing_toolbar;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (CollapsingToolbarLayout)view2;
                        if (object6 != null && (view2 = dd2_2.a(n3 = R$id.pesdk_float_header_view, view)) != null) {
                            PesdkViewToolbarBinding pesdkViewToolbarBinding = PesdkViewToolbarBinding.bind(view2);
                            n3 = R$id.pesdk_layout_coordinator;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (CoordinatorLayout)view2;
                            if (object7 != null) {
                                n3 = R$id.pesdk_toolbar;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (Toolbar)view2;
                                if (object8 != null && (view2 = dd2_2.a(n3 = R$id.pesdk_toolbar_header_view, view)) != null) {
                                    PesdkViewToolbarBinding pesdkViewToolbarBinding2 = PesdkViewToolbarBinding.bind(view2);
                                    n3 = R$id.rv_guidelines;
                                    Object object9 = view2 = dd2_2.a(n3, view);
                                    object9 = (RecyclerView)view2;
                                    if (object9 != null) {
                                        n3 = R$id.sample_content_fragment;
                                        Object object10 = view2 = dd2_2.a(n3, view);
                                        object10 = (ConstraintLayout)view2;
                                        if (object10 != null) {
                                            n3 = R$id.tv_guideline_heading;
                                            Object object11 = view2 = dd2_2.a(n3, view);
                                            object11 = (AppCompatTextView)view2;
                                            if (object11 != null) {
                                                n3 = R$id.tv_proceed;
                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                object12 = (AjioTextView)view2;
                                                if (object12 != null) {
                                                    n3 = R$id.tv_skip;
                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                    object13 = (AjioTextView)view2;
                                                    if (object13 != null) {
                                                        Object object14 = view;
                                                        object14 = (ConstraintLayout)view;
                                                        FragmentSecureCardDetailsBinding fragmentSecureCardDetailsBinding = new FragmentSecureCardDetailsBinding((ConstraintLayout)((Object)object14), (AppCompatImageView)((Object)object2), (AppCompatImageView)((Object)object3), (ConstraintLayout)((Object)object4), (AppBarLayout)object5, (CollapsingToolbarLayout)((Object)object6), pesdkViewToolbarBinding, (CoordinatorLayout)object7, (Toolbar)object8, pesdkViewToolbarBinding2, (RecyclerView)object9, (ConstraintLayout)((Object)object10), (AppCompatTextView)object11, (AjioTextView)object12, (AjioTextView)object13);
                                                        return fragmentSecureCardDetailsBinding;
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

    public static FragmentSecureCardDetailsBinding inflate(LayoutInflater layoutInflater) {
        return FragmentSecureCardDetailsBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentSecureCardDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_secure_card_details;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentSecureCardDetailsBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

