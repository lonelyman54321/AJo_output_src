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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PdpBankOfferShimmerBinding
implements BC3 {
    public final View imgView;
    private final ConstraintLayout rootView;
    public final View secondBar;
    public final View thirdBar;
    public final View topBar;

    private PdpBankOfferShimmerBinding(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4) {
        this.rootView = constraintLayout;
        this.imgView = view;
        this.secondBar = view2;
        this.thirdBar = view3;
        this.topBar = view4;
    }

    public static PdpBankOfferShimmerBinding bind(View object) {
        View view;
        View view2;
        View view3;
        int n3 = R$id.img_view;
        View view4 = dd2_2.a(n3, object);
        if (view4 != null && (view3 = dd2_2.a(n3 = R$id.second_bar, object)) != null && (view2 = dd2_2.a(n3 = R$id.third_bar, object)) != null && (view = dd2_2.a(n3 = R$id.top_bar, object)) != null) {
            Object object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            PdpBankOfferShimmerBinding pdpBankOfferShimmerBinding = new PdpBankOfferShimmerBinding((ConstraintLayout)((Object)object2), view4, view3, view2, view);
            return pdpBankOfferShimmerBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PdpBankOfferShimmerBinding inflate(LayoutInflater layoutInflater) {
        return PdpBankOfferShimmerBinding.inflate(layoutInflater, null, false);
    }

    public static PdpBankOfferShimmerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_bank_offer_shimmer;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpBankOfferShimmerBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

