/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.databinding.PesdkViewToolbarBinding;

public final class ActivityUpiStatusBinding
implements BC3 {
    public final PEProgressView peUpiProgressBar;
    public final AppBarLayout pesdkAppBarLayout;
    public final CollapsingToolbarLayout pesdkCollapsingToolbar;
    public final PesdkViewToolbarBinding pesdkFloatHeaderView;
    public final CoordinatorLayout pesdkLayoutCoordinator;
    public final Toolbar pesdkToolbar;
    public final PesdkViewToolbarBinding pesdkToolbarHeaderView;
    public final ProgressBar progressbar;
    private final RelativeLayout rootView;
    public final AjioTextView step1DescTv;
    public final AjioTextView step1Tv;
    public final AjioTextView step2DescTv;
    public final AjioTextView step2Tv;
    public final AppCompatImageView upiIcon1Iv;
    public final AppCompatImageView upiIcon2Iv;
    public final AjioTextView upiIdEnteredTv;
    public final AjioTextView upiIdTv;
    public final View upiLineIv;
    public final AjioTextView upiPaymentStatusTimer;
    public final AjioTextView upiStatusDisTv;
    public final AjioTextView upiTransationExpInTv;

    private ActivityUpiStatusBinding(RelativeLayout relativeLayout, PEProgressView pEProgressView, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, PesdkViewToolbarBinding pesdkViewToolbarBinding, CoordinatorLayout coordinatorLayout, Toolbar toolbar, PesdkViewToolbarBinding pesdkViewToolbarBinding2, ProgressBar progressBar, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AjioTextView ajioTextView5, AjioTextView ajioTextView6, View view, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9) {
        this.rootView = relativeLayout;
        this.peUpiProgressBar = pEProgressView;
        this.pesdkAppBarLayout = appBarLayout;
        this.pesdkCollapsingToolbar = collapsingToolbarLayout;
        this.pesdkFloatHeaderView = pesdkViewToolbarBinding;
        this.pesdkLayoutCoordinator = coordinatorLayout;
        this.pesdkToolbar = toolbar;
        this.pesdkToolbarHeaderView = pesdkViewToolbarBinding2;
        this.progressbar = progressBar;
        this.step1DescTv = ajioTextView;
        this.step1Tv = ajioTextView2;
        this.step2DescTv = ajioTextView3;
        this.step2Tv = ajioTextView4;
        this.upiIcon1Iv = appCompatImageView;
        this.upiIcon2Iv = appCompatImageView2;
        this.upiIdEnteredTv = ajioTextView5;
        this.upiIdTv = ajioTextView6;
        this.upiLineIv = view;
        this.upiPaymentStatusTimer = ajioTextView7;
        this.upiStatusDisTv = ajioTextView8;
        this.upiTransationExpInTv = ajioTextView9;
    }

    public static ActivityUpiStatusBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.pe_upi_progress_bar;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (PEProgressView)view2;
        if (object2 != null) {
            n3 = R$id.pesdk_app_bar_layout;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AppBarLayout)view2;
            if (object3 != null) {
                n3 = R$id.pesdk_collapsing_toolbar;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (CollapsingToolbarLayout)view2;
                if (object4 != null && (view2 = dd2_2.a(n3 = R$id.pesdk_float_header_view, view)) != null) {
                    PesdkViewToolbarBinding pesdkViewToolbarBinding = PesdkViewToolbarBinding.bind(view2);
                    n3 = R$id.pesdk_layout_coordinator;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (CoordinatorLayout)view2;
                    if (object5 != null) {
                        n3 = R$id.pesdk_toolbar;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (Toolbar)view2;
                        if (object6 != null && (view2 = dd2_2.a(n3 = R$id.pesdk_toolbar_header_view, view)) != null) {
                            PesdkViewToolbarBinding pesdkViewToolbarBinding2 = PesdkViewToolbarBinding.bind(view2);
                            n3 = R$id.progressbar;
                            View view3 = view2 = dd2_2.a(n3, view);
                            view3 = (ProgressBar)view2;
                            if (view3 != null) {
                                n3 = R$id.step1_desc_tv;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (AjioTextView)view2;
                                if (object7 != null) {
                                    n3 = R$id.step1_tv;
                                    Object object8 = view2 = dd2_2.a(n3, view);
                                    object8 = (AjioTextView)view2;
                                    if (object8 != null) {
                                        n3 = R$id.step2_desc_tv;
                                        Object object9 = view2 = dd2_2.a(n3, view);
                                        object9 = (AjioTextView)view2;
                                        if (object9 != null) {
                                            n3 = R$id.step2_tv;
                                            Object object10 = view2 = dd2_2.a(n3, view);
                                            object10 = (AjioTextView)view2;
                                            if (object10 != null) {
                                                n3 = R$id.upi_icon1_iv;
                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                object11 = (AppCompatImageView)view2;
                                                if (object11 != null) {
                                                    n3 = R$id.upi_icon2_iv;
                                                    Object object12 = view2 = dd2_2.a(n3, view);
                                                    object12 = (AppCompatImageView)view2;
                                                    if (object12 != null) {
                                                        n3 = R$id.upi_id_entered_tv;
                                                        Object object13 = view2 = dd2_2.a(n3, view);
                                                        object13 = (AjioTextView)view2;
                                                        if (object13 != null) {
                                                            View view4;
                                                            n3 = R$id.upi_id_tv;
                                                            Object object14 = view2 = dd2_2.a(n3, view);
                                                            object14 = (AjioTextView)view2;
                                                            if (object14 != null && (view4 = dd2_2.a(n3 = R$id.upi_line_iv, view)) != null) {
                                                                n3 = R$id.upi_payment_status_timer;
                                                                Object object15 = view2 = dd2_2.a(n3, view);
                                                                object15 = (AjioTextView)view2;
                                                                if (object15 != null) {
                                                                    n3 = R$id.upi_status_dis_tv;
                                                                    Object object16 = view2 = dd2_2.a(n3, view);
                                                                    object16 = (AjioTextView)view2;
                                                                    if (object16 != null) {
                                                                        n3 = R$id.upi_transation_exp_in_tv;
                                                                        Object object17 = view2 = dd2_2.a(n3, view);
                                                                        object17 = (AjioTextView)view2;
                                                                        if (object17 != null) {
                                                                            View view5 = view;
                                                                            view5 = (RelativeLayout)view;
                                                                            ActivityUpiStatusBinding activityUpiStatusBinding = new ActivityUpiStatusBinding((RelativeLayout)view5, (PEProgressView)((Object)object2), (AppBarLayout)object3, (CollapsingToolbarLayout)((Object)object4), pesdkViewToolbarBinding, (CoordinatorLayout)object5, (Toolbar)object6, pesdkViewToolbarBinding2, (ProgressBar)view3, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AppCompatImageView)((Object)object11), (AppCompatImageView)((Object)object12), (AjioTextView)object13, (AjioTextView)object14, view4, (AjioTextView)object15, (AjioTextView)object16, (AjioTextView)object17);
                                                                            return activityUpiStatusBinding;
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
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityUpiStatusBinding inflate(LayoutInflater layoutInflater) {
        return ActivityUpiStatusBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityUpiStatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_upi_status;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityUpiStatusBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

