/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;

public final class LayoutPancardVerificationBinding
implements BC3 {
    public final AppBarLayout appBarLayout;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    public final AjioTextView panNumberError;
    public final AppCompatCheckBox pancardConsentCb;
    public final AjioTextView pancardConsentTv;
    public final LinearLayout pancardConsentView;
    public final CoordinatorLayout pancardContainer;
    public final TextInputEditText pancardCustomerDobField;
    public final TextInputLayout pancardCustomerDobLabel;
    public final AjioTextView pancardDescriptionTv;
    public final View pancardDivider;
    public final FrameLayout pancardDobFrame;
    public final TextInputEditText pancardNameField;
    public final TextInputLayout pancardNameLabel;
    public final TextInputEditText pancardPanField;
    public final TextInputLayout pancardPanLabel;
    public final RelativeLayout pancardRootView;
    public final AjioTextView pancardValidInfoView;
    public final LinearLayout pancardVerfRootView;
    private final RelativeLayout rootView;
    public final Toolbar toolbar;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;
    public final AjioTextView validatePanBtn;
    public final FrameLayout validatePanLayout;

    private LayoutPancardVerificationBinding(RelativeLayout relativeLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, AjioTextView ajioTextView, AppCompatCheckBox appCompatCheckBox, AjioTextView ajioTextView2, LinearLayout linearLayout, CoordinatorLayout coordinatorLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout, AjioTextView ajioTextView3, View view, FrameLayout frameLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, TextInputEditText textInputEditText3, TextInputLayout textInputLayout3, RelativeLayout relativeLayout2, AjioTextView ajioTextView4, LinearLayout linearLayout2, Toolbar toolbar, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2, AjioTextView ajioTextView5, FrameLayout frameLayout2) {
        this.rootView = relativeLayout;
        this.appBarLayout = appBarLayout;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.panNumberError = ajioTextView;
        this.pancardConsentCb = appCompatCheckBox;
        this.pancardConsentTv = ajioTextView2;
        this.pancardConsentView = linearLayout;
        this.pancardContainer = coordinatorLayout;
        this.pancardCustomerDobField = textInputEditText;
        this.pancardCustomerDobLabel = textInputLayout;
        this.pancardDescriptionTv = ajioTextView3;
        this.pancardDivider = view;
        this.pancardDobFrame = frameLayout;
        this.pancardNameField = textInputEditText2;
        this.pancardNameLabel = textInputLayout2;
        this.pancardPanField = textInputEditText3;
        this.pancardPanLabel = textInputLayout3;
        this.pancardRootView = relativeLayout2;
        this.pancardValidInfoView = ajioTextView4;
        this.pancardVerfRootView = linearLayout2;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
        this.validatePanBtn = ajioTextView5;
        this.validatePanLayout = frameLayout2;
    }

    public static LayoutPancardVerificationBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.app_bar_layout;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AppBarLayout)view2;
        if (object2 != null) {
            n3 = R$id.collapsing_toolbar;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (CollapsingToolbarLayout)view2;
            if (object3 != null && (view2 = dd2_2.a(n3 = R$id.float_header_view, view)) != null) {
                ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding = ToolbarTitleSubtitleViewBinding.bind(view2);
                n3 = R$id.pan_number_error;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioTextView)view2;
                if (object4 != null) {
                    n3 = R$id.pancard_consent_cb;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AppCompatCheckBox)view2;
                    if (object5 != null) {
                        n3 = R$id.pancard_consent_tv;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AjioTextView)view2;
                        if (object6 != null) {
                            n3 = R$id.pancard_consent_view;
                            View view3 = view2 = dd2_2.a(n3, view);
                            view3 = (LinearLayout)view2;
                            if (view3 != null) {
                                n3 = R$id.pancard_container;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (CoordinatorLayout)view2;
                                if (object7 != null) {
                                    n3 = R$id.pancard_customer_dob_field;
                                    Object object8 = view2 = dd2_2.a(n3, view);
                                    object8 = (TextInputEditText)view2;
                                    if (object8 != null) {
                                        n3 = R$id.pancard_customer_dob_label;
                                        Object object9 = view2 = dd2_2.a(n3, view);
                                        object9 = (TextInputLayout)view2;
                                        if (object9 != null) {
                                            View view4;
                                            n3 = R$id.pancard_description_tv;
                                            Object object10 = view2 = dd2_2.a(n3, view);
                                            object10 = (AjioTextView)view2;
                                            if (object10 != null && (view4 = dd2_2.a(n3 = R$id.pancard_divider, view)) != null) {
                                                n3 = R$id.pancard_dob_frame;
                                                View view5 = view2 = dd2_2.a(n3, view);
                                                view5 = (FrameLayout)view2;
                                                if (view5 != null) {
                                                    n3 = R$id.pancard_name_field;
                                                    Object object11 = view2 = dd2_2.a(n3, view);
                                                    object11 = (TextInputEditText)view2;
                                                    if (object11 != null) {
                                                        n3 = R$id.pancard_name_label;
                                                        Object object12 = view2 = dd2_2.a(n3, view);
                                                        object12 = (TextInputLayout)view2;
                                                        if (object12 != null) {
                                                            n3 = R$id.pancard_pan_field;
                                                            Object object13 = view2 = dd2_2.a(n3, view);
                                                            object13 = (TextInputEditText)view2;
                                                            if (object13 != null) {
                                                                n3 = R$id.pancard_pan_label;
                                                                Object object14 = view2 = dd2_2.a(n3, view);
                                                                object14 = (TextInputLayout)view2;
                                                                if (object14 != null) {
                                                                    View view6 = view;
                                                                    view6 = (RelativeLayout)view;
                                                                    n3 = R$id.pancard_valid_info_view;
                                                                    Object object15 = view2 = dd2_2.a(n3, view);
                                                                    object15 = (AjioTextView)view2;
                                                                    if (object15 != null) {
                                                                        n3 = R$id.pancard_verf_root_view;
                                                                        View view7 = view2 = dd2_2.a(n3, view);
                                                                        view7 = (LinearLayout)view2;
                                                                        if (view7 != null) {
                                                                            n3 = R$id.toolbar;
                                                                            Object object16 = view2 = dd2_2.a(n3, view);
                                                                            object16 = (Toolbar)view2;
                                                                            if (object16 != null && (view2 = dd2_2.a(n3 = R$id.toolbar_header_view, view)) != null) {
                                                                                ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view2);
                                                                                n3 = R$id.validate_pan_btn;
                                                                                Object object17 = view2 = dd2_2.a(n3, view);
                                                                                object17 = (AjioTextView)view2;
                                                                                if (object17 != null) {
                                                                                    n3 = R$id.validate_pan_layout;
                                                                                    View view8 = view2 = dd2_2.a(n3, view);
                                                                                    view8 = (FrameLayout)view2;
                                                                                    if (view8 != null) {
                                                                                        object = new LayoutPancardVerificationBinding((RelativeLayout)view6, (AppBarLayout)object2, (CollapsingToolbarLayout)((Object)object3), toolbarTitleSubtitleViewBinding, (AjioTextView)object4, (AppCompatCheckBox)object5, (AjioTextView)object6, (LinearLayout)view3, (CoordinatorLayout)object7, (TextInputEditText)object8, (TextInputLayout)((Object)object9), (AjioTextView)object10, view4, (FrameLayout)view5, (TextInputEditText)object11, (TextInputLayout)((Object)object12), (TextInputEditText)object13, (TextInputLayout)((Object)object14), (RelativeLayout)view6, (AjioTextView)object15, (LinearLayout)view7, (Toolbar)object16, toolbarTitleSubtitleViewBinding2, (AjioTextView)object17, (FrameLayout)view8);
                                                                                        return object;
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
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutPancardVerificationBinding inflate(LayoutInflater layoutInflater) {
        return LayoutPancardVerificationBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutPancardVerificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_pancard_verification;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutPancardVerificationBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

