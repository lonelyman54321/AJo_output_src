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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LuxToolbarBinding;

public final class FragmentSecureCardDetailsLuxeBinding
implements BC3 {
    public final AppCompatImageView ivLogo;
    public final AppCompatImageView ivVault;
    private final ConstraintLayout rootView;
    public final RecyclerView rvGuidelines;
    public final ConstraintLayout sampleContentFragment;
    public final AppCompatTextView tvGuidelineHeading;
    public final AjioTextView tvProceed;
    public final AjioTextView tvSkip;
    public final LuxToolbarBinding viewLuxToolbar;

    private FragmentSecureCardDetailsLuxeBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, RecyclerView recyclerView, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, AjioTextView ajioTextView, AjioTextView ajioTextView2, LuxToolbarBinding luxToolbarBinding) {
        this.rootView = constraintLayout;
        this.ivLogo = appCompatImageView;
        this.ivVault = appCompatImageView2;
        this.rvGuidelines = recyclerView;
        this.sampleContentFragment = constraintLayout2;
        this.tvGuidelineHeading = appCompatTextView;
        this.tvProceed = ajioTextView;
        this.tvSkip = ajioTextView2;
        this.viewLuxToolbar = luxToolbarBinding;
    }

    public static FragmentSecureCardDetailsLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.iv_logo;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view;
        if (object2 != null) {
            n3 = R$id.iv_vault;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AppCompatImageView)view;
            if (object3 != null) {
                n3 = R$id.rv_guidelines;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (RecyclerView)view;
                if (object4 != null) {
                    n3 = R$id.sample_content_fragment;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (ConstraintLayout)view;
                    if (object5 != null) {
                        n3 = R$id.tv_guideline_heading;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AppCompatTextView)view;
                        if (object6 != null) {
                            n3 = R$id.tv_proceed;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                n3 = R$id.tv_skip;
                                Object object8 = view = dd2_2.a(n3, object);
                                object8 = (AjioTextView)view;
                                if (object8 != null && (view = dd2_2.a(n3 = R$id.view_lux_toolbar, object)) != null) {
                                    LuxToolbarBinding luxToolbarBinding = LuxToolbarBinding.bind(view);
                                    Object object9 = object;
                                    object9 = (ConstraintLayout)((Object)object);
                                    FragmentSecureCardDetailsLuxeBinding fragmentSecureCardDetailsLuxeBinding = new FragmentSecureCardDetailsLuxeBinding((ConstraintLayout)((Object)object9), (AppCompatImageView)((Object)object2), (AppCompatImageView)((Object)object3), (RecyclerView)object4, (ConstraintLayout)((Object)object5), (AppCompatTextView)object6, (AjioTextView)object7, (AjioTextView)object8, luxToolbarBinding);
                                    return fragmentSecureCardDetailsLuxeBinding;
                                }
                            }
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

    public static FragmentSecureCardDetailsLuxeBinding inflate(LayoutInflater layoutInflater) {
        return FragmentSecureCardDetailsLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentSecureCardDetailsLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_secure_card_details_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentSecureCardDetailsLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

