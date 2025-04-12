/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;

public final class PdpStylishCarouselLayoutBinding
implements BC3 {
    public final AjioTextView knowTheProductHeader;
    public final NewAjioStoryViewPager pdpStylishViewPager;
    public final LinearLayout progressBarView;
    private final ConstraintLayout rootView;

    private PdpStylishCarouselLayoutBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, NewAjioStoryViewPager newAjioStoryViewPager, LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.knowTheProductHeader = ajioTextView;
        this.pdpStylishViewPager = newAjioStoryViewPager;
        this.progressBarView = linearLayout;
    }

    public static PdpStylishCarouselLayoutBinding bind(View object) {
        LinearLayout linearLayout;
        NewAjioStoryViewPager newAjioStoryViewPager;
        int n3 = R$id.know_the_product_header;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null && (newAjioStoryViewPager = (NewAjioStoryViewPager)dd2_2.a(n3 = R$id.pdp_stylish_view_pager, object)) != null && (linearLayout = (LinearLayout)dd2_2.a(n3 = R$id.progress_bar_view, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            PdpStylishCarouselLayoutBinding pdpStylishCarouselLayoutBinding = new PdpStylishCarouselLayoutBinding((ConstraintLayout)((Object)object), ajioTextView, newAjioStoryViewPager, linearLayout);
            return pdpStylishCarouselLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PdpStylishCarouselLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PdpStylishCarouselLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PdpStylishCarouselLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_stylish_carousel_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpStylishCarouselLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

