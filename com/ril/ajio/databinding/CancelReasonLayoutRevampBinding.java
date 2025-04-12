/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.Spinner
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;
import com.ril.ajio.databinding.ViewCancelReasonProductBinding;

public final class CancelReasonLayoutRevampBinding
implements BC3 {
    public final AppBarLayout appBarLayout;
    public final AjioEditText cancelBox;
    public final AjioButton cancelOrder;
    public final Spinner cancelReasonsDropDown;
    public final AjioProgressView cancelreasonProgressBar;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ImageView decrementProductButton;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    public final AppCompatTextView freeBiesView;
    public final ImageView incrementProductButton;
    public final LinearLayout layoutQuantity;
    public final ViewCancelReasonProductBinding product;
    private final CoordinatorLayout rootView;
    public final TextInputLayout textContainer;
    public final Toolbar toolbar;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;
    public final AjioTextView tvNewQuantity;

    private CancelReasonLayoutRevampBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, AjioEditText ajioEditText, AjioButton ajioButton, Spinner spinner, AjioProgressView ajioProgressView, CollapsingToolbarLayout collapsingToolbarLayout, ImageView imageView, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, AppCompatTextView appCompatTextView, ImageView imageView2, LinearLayout linearLayout, ViewCancelReasonProductBinding viewCancelReasonProductBinding, TextInputLayout textInputLayout, Toolbar toolbar, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2, AjioTextView ajioTextView) {
        this.rootView = coordinatorLayout;
        this.appBarLayout = appBarLayout;
        this.cancelBox = ajioEditText;
        this.cancelOrder = ajioButton;
        this.cancelReasonsDropDown = spinner;
        this.cancelreasonProgressBar = ajioProgressView;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.decrementProductButton = imageView;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.freeBiesView = appCompatTextView;
        this.incrementProductButton = imageView2;
        this.layoutQuantity = linearLayout;
        this.product = viewCancelReasonProductBinding;
        this.textContainer = textInputLayout;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
        this.tvNewQuantity = ajioTextView;
    }

    public static CancelReasonLayoutRevampBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.app_bar_layout;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AppBarLayout)view2;
        if (object2 != null) {
            n3 = R$id.cancel_box;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioEditText)view2;
            if (object3 != null) {
                n3 = R$id.cancel_order;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioButton)view2;
                if (object4 != null) {
                    n3 = R$id.cancel_reasons_drop_down;
                    View view3 = view2 = dd2_2.a(n3, view);
                    view3 = (Spinner)view2;
                    if (view3 != null) {
                        n3 = R$id.cancelreason_progress_bar;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (AjioProgressView)view2;
                        if (object5 != null) {
                            n3 = R$id.collapsing_toolbar;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (CollapsingToolbarLayout)view2;
                            if (object6 != null) {
                                n3 = R$id.decrement_product_button;
                                View view4 = view2 = dd2_2.a(n3, view);
                                view4 = (ImageView)view2;
                                if (view4 != null && (view2 = dd2_2.a(n3 = R$id.float_header_view, view)) != null) {
                                    ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding = ToolbarTitleSubtitleViewBinding.bind(view2);
                                    n3 = R$id.freeBiesView;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (AppCompatTextView)view2;
                                    if (object7 != null) {
                                        n3 = R$id.increment_product_button;
                                        View view5 = view2 = dd2_2.a(n3, view);
                                        view5 = (ImageView)view2;
                                        if (view5 != null) {
                                            n3 = R$id.layoutQuantity;
                                            View view6 = view2 = dd2_2.a(n3, view);
                                            view6 = (LinearLayout)view2;
                                            if (view6 != null && (view2 = dd2_2.a(n3 = R$id.product, view)) != null) {
                                                ViewCancelReasonProductBinding viewCancelReasonProductBinding = ViewCancelReasonProductBinding.bind(view2);
                                                n3 = R$id.textContainer;
                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                object8 = (TextInputLayout)view2;
                                                if (object8 != null) {
                                                    n3 = R$id.toolbar;
                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                    object9 = (Toolbar)view2;
                                                    if (object9 != null && (view2 = dd2_2.a(n3 = R$id.toolbar_header_view, view)) != null) {
                                                        ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view2);
                                                        n3 = R$id.tvNewQuantity;
                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                        object10 = (AjioTextView)view2;
                                                        if (object10 != null) {
                                                            Object object11 = view;
                                                            object11 = (CoordinatorLayout)view;
                                                            CancelReasonLayoutRevampBinding cancelReasonLayoutRevampBinding = new CancelReasonLayoutRevampBinding((CoordinatorLayout)object11, (AppBarLayout)object2, (AjioEditText)object3, (AjioButton)object4, (Spinner)view3, (AjioProgressView)((Object)object5), (CollapsingToolbarLayout)((Object)object6), (ImageView)view4, toolbarTitleSubtitleViewBinding, (AppCompatTextView)object7, (ImageView)view5, (LinearLayout)view6, viewCancelReasonProductBinding, (TextInputLayout)((Object)object8), (Toolbar)object9, toolbarTitleSubtitleViewBinding2, (AjioTextView)object10);
                                                            return cancelReasonLayoutRevampBinding;
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

    public static CancelReasonLayoutRevampBinding inflate(LayoutInflater layoutInflater) {
        return CancelReasonLayoutRevampBinding.inflate(layoutInflater, null, false);
    }

    public static CancelReasonLayoutRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cancel_reason_layout_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CancelReasonLayoutRevampBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

