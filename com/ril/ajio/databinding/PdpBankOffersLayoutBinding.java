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
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.PdpBankOfferShimmerBinding;

public final class PdpBankOffersLayoutBinding
implements BC3 {
    public final ShimmerFrameLayout bankOfferShimmerView;
    public final AjioTextView bankOfferTitleTv;
    public final ConstraintLayout bankOffersLayout;
    public final RecyclerView bankOffersRv;
    public final AjioTextView moreOfferBottomTv;
    public final AjioTextView moreOfferTopTv;
    public final View offerDivider;
    public final PdpBankOfferShimmerBinding pdpBankOfferView;
    private final ConstraintLayout rootView;

    private PdpBankOffersLayoutBinding(ConstraintLayout constraintLayout, ShimmerFrameLayout shimmerFrameLayout, AjioTextView ajioTextView, ConstraintLayout constraintLayout2, RecyclerView recyclerView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, View view, PdpBankOfferShimmerBinding pdpBankOfferShimmerBinding) {
        this.rootView = constraintLayout;
        this.bankOfferShimmerView = shimmerFrameLayout;
        this.bankOfferTitleTv = ajioTextView;
        this.bankOffersLayout = constraintLayout2;
        this.bankOffersRv = recyclerView;
        this.moreOfferBottomTv = ajioTextView2;
        this.moreOfferTopTv = ajioTextView3;
        this.offerDivider = view;
        this.pdpBankOfferView = pdpBankOfferShimmerBinding;
    }

    public static PdpBankOffersLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.bank_offer_shimmer_view;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (ShimmerFrameLayout)view;
        if (object2 != null) {
            n3 = R$id.bank_offer_title_tv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                Object object4 = object;
                object4 = (ConstraintLayout)((Object)object);
                n3 = R$id.bank_offers_rv;
                Object object5 = view = dd2_2.a(n3, object);
                object5 = (RecyclerView)view;
                if (object5 != null) {
                    n3 = R$id.more_offer_bottom_tv;
                    Object object6 = view = dd2_2.a(n3, object);
                    object6 = (AjioTextView)view;
                    if (object6 != null) {
                        View view2;
                        n3 = R$id.more_offer_top_tv;
                        Object object7 = view = dd2_2.a(n3, object);
                        object7 = (AjioTextView)view;
                        if (object7 != null && (view2 = dd2_2.a(n3 = R$id.offer_divider, object)) != null && (view = dd2_2.a(n3 = R$id.pdp_bank_offer_view, object)) != null) {
                            PdpBankOfferShimmerBinding pdpBankOfferShimmerBinding = PdpBankOfferShimmerBinding.bind(view);
                            object = new PdpBankOffersLayoutBinding((ConstraintLayout)((Object)object4), (ShimmerFrameLayout)((Object)object2), (AjioTextView)object3, (ConstraintLayout)((Object)object4), (RecyclerView)object5, (AjioTextView)object6, (AjioTextView)object7, view2, pdpBankOfferShimmerBinding);
                            return object;
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

    public static PdpBankOffersLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PdpBankOffersLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PdpBankOffersLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_bank_offers_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpBankOffersLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

