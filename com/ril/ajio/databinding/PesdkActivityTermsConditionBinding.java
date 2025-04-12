/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.PesdkViewToolbarBinding;

public final class PesdkActivityTermsConditionBinding
implements BC3 {
    public final Toolbar pesdkToolbar;
    public final PesdkViewToolbarBinding pesdkToolbarHeaderView;
    private final RelativeLayout rootView;
    public final FrameLayout sampleContentFragment;

    private PesdkActivityTermsConditionBinding(RelativeLayout relativeLayout, Toolbar toolbar, PesdkViewToolbarBinding pesdkViewToolbarBinding, FrameLayout frameLayout) {
        this.rootView = relativeLayout;
        this.pesdkToolbar = toolbar;
        this.pesdkToolbarHeaderView = pesdkViewToolbarBinding;
        this.sampleContentFragment = frameLayout;
    }

    public static PesdkActivityTermsConditionBinding bind(View object) {
        Object object2;
        Object object3;
        int n3 = R$id.pesdk_toolbar;
        Toolbar toolbar = (Toolbar)dd2_2.a(n3, object);
        if (toolbar != null && (object3 = dd2_2.a(n3 = R$id.pesdk_toolbar_header_view, object)) != null) {
            object2 = PesdkViewToolbarBinding.bind(object3);
            int n4 = R$id.sample_content_fragment;
            FrameLayout frameLayout = (FrameLayout)dd2_2.a(n4, object);
            if (frameLayout != null) {
                object = (RelativeLayout)object;
                object3 = new PesdkActivityTermsConditionBinding((RelativeLayout)object, toolbar, (PesdkViewToolbarBinding)object2, frameLayout);
                return object3;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static PesdkActivityTermsConditionBinding inflate(LayoutInflater layoutInflater) {
        return PesdkActivityTermsConditionBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkActivityTermsConditionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_activity_terms_condition;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkActivityTermsConditionBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

