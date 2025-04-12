/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ToolbarTitleViewBinding;

public final class ActivityTermsAndConditionsBinding
implements BC3 {
    public final AjioLoaderView ajioLoaderView;
    public final ConstraintLayout clMain;
    public final Group groupDeleteAccount;
    private final ConstraintLayout rootView;
    public final AjioProgressView termsAndConditionProgressView;
    public final Toolbar toolbar;
    public final ToolbarTitleViewBinding toolbarHeaderView;
    public final AjioTextView tvPrivacy;
    public final AjioTextView tvTitle;
    public final AjioTextView tvYourData;
    public final View view;
    public final FrameLayout webviewContainer;
    public final FrameLayout webviewContainerDelete;

    private ActivityTermsAndConditionsBinding(ConstraintLayout constraintLayout, AjioLoaderView ajioLoaderView, ConstraintLayout constraintLayout2, Group group, AjioProgressView ajioProgressView, Toolbar toolbar, ToolbarTitleViewBinding toolbarTitleViewBinding, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, View view, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.rootView = constraintLayout;
        this.ajioLoaderView = ajioLoaderView;
        this.clMain = constraintLayout2;
        this.groupDeleteAccount = group;
        this.termsAndConditionProgressView = ajioProgressView;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleViewBinding;
        this.tvPrivacy = ajioTextView;
        this.tvTitle = ajioTextView2;
        this.tvYourData = ajioTextView3;
        this.view = view;
        this.webviewContainer = frameLayout;
        this.webviewContainerDelete = frameLayout2;
    }

    public static ActivityTermsAndConditionsBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.ajio_loader_view;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioLoaderView)view2;
        if (object2 != null) {
            n3 = R$id.clMain;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (ConstraintLayout)view2;
            if (object3 != null) {
                n3 = R$id.group_delete_account;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (Group)view2;
                if (view3 != null) {
                    n3 = R$id.terms_and_condition_progressView;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioProgressView)view2;
                    if (object4 != null) {
                        n3 = R$id.toolbar;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (Toolbar)view2;
                        if (object5 != null && (view2 = dd2_2.a(n3 = R$id.toolbar_header_view, view)) != null) {
                            ToolbarTitleViewBinding toolbarTitleViewBinding = ToolbarTitleViewBinding.bind(view2);
                            n3 = R$id.tv_privacy;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (AjioTextView)view2;
                            if (object6 != null) {
                                n3 = R$id.tv_title;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (AjioTextView)view2;
                                if (object7 != null) {
                                    View view4;
                                    n3 = R$id.tv_your_data;
                                    Object object8 = view2 = dd2_2.a(n3, view);
                                    object8 = (AjioTextView)view2;
                                    if (object8 != null && (view4 = dd2_2.a(n3 = R$id.view, view)) != null) {
                                        n3 = R$id.webview_container;
                                        View view5 = view2 = dd2_2.a(n3, view);
                                        view5 = (FrameLayout)view2;
                                        if (view5 != null) {
                                            n3 = R$id.webview_container_delete;
                                            View view6 = view2 = dd2_2.a(n3, view);
                                            view6 = (FrameLayout)view2;
                                            if (view6 != null) {
                                                Object object9 = view;
                                                object9 = (ConstraintLayout)view;
                                                ActivityTermsAndConditionsBinding activityTermsAndConditionsBinding = new ActivityTermsAndConditionsBinding((ConstraintLayout)((Object)object9), (AjioLoaderView)((Object)object2), (ConstraintLayout)((Object)object3), (Group)view3, (AjioProgressView)((Object)object4), (Toolbar)object5, toolbarTitleViewBinding, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, view4, (FrameLayout)view5, (FrameLayout)view6);
                                                return activityTermsAndConditionsBinding;
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

    public static ActivityTermsAndConditionsBinding inflate(LayoutInflater layoutInflater) {
        return ActivityTermsAndConditionsBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityTermsAndConditionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_terms_and_conditions;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityTermsAndConditionsBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

