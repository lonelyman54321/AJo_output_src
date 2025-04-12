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
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PlpFooterRowViewBinding
implements BC3 {
    public final AjioTextView plpRowQualityMsgTv;
    public final ShimmerFrameLayout plpRowShimmerView;
    private final LinearLayout rootView;

    private PlpFooterRowViewBinding(LinearLayout linearLayout, AjioTextView ajioTextView, ShimmerFrameLayout shimmerFrameLayout) {
        this.rootView = linearLayout;
        this.plpRowQualityMsgTv = ajioTextView;
        this.plpRowShimmerView = shimmerFrameLayout;
    }

    public static PlpFooterRowViewBinding bind(View object) {
        ShimmerFrameLayout shimmerFrameLayout;
        int n3 = R$id.plp_row_quality_msg_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null && (shimmerFrameLayout = (ShimmerFrameLayout)dd2_2.a(n3 = R$id.plp_row_shimmer_view, object)) != null) {
            object = (LinearLayout)object;
            PlpFooterRowViewBinding plpFooterRowViewBinding = new PlpFooterRowViewBinding((LinearLayout)object, ajioTextView, shimmerFrameLayout);
            return plpFooterRowViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpFooterRowViewBinding inflate(LayoutInflater layoutInflater) {
        return PlpFooterRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static PlpFooterRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_footer_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpFooterRowViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

