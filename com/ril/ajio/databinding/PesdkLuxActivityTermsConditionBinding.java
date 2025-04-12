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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PesdkLuxActivityTermsConditionBinding
implements BC3 {
    public final LinearLayout pesdkLayoutCoordinator;
    private final RelativeLayout rootView;
    public final FrameLayout sampleContentFragment;

    private PesdkLuxActivityTermsConditionBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, FrameLayout frameLayout) {
        this.rootView = relativeLayout;
        this.pesdkLayoutCoordinator = linearLayout;
        this.sampleContentFragment = frameLayout;
    }

    public static PesdkLuxActivityTermsConditionBinding bind(View object) {
        FrameLayout frameLayout;
        int n3 = R$id.pesdk_layout_coordinator;
        LinearLayout linearLayout = (LinearLayout)dd2_2.a(n3, object);
        if (linearLayout != null && (frameLayout = (FrameLayout)dd2_2.a(n3 = R$id.sample_content_fragment, object)) != null) {
            object = (RelativeLayout)object;
            PesdkLuxActivityTermsConditionBinding pesdkLuxActivityTermsConditionBinding = new PesdkLuxActivityTermsConditionBinding((RelativeLayout)object, linearLayout, frameLayout);
            return pesdkLuxActivityTermsConditionBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkLuxActivityTermsConditionBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxActivityTermsConditionBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxActivityTermsConditionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_activity_terms_condition;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxActivityTermsConditionBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

