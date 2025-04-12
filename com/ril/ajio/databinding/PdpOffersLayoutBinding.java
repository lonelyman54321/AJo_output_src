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
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.PdpOfferItemLayoutBinding;

public final class PdpOffersLayoutBinding
implements BC3 {
    public final LinearLayoutCompat allOfferContainer;
    public final RecyclerView allOffersRv;
    public final LinearLayout couponContainer;
    public final View footerButtonDivider;
    public final AjioTextView pdpMoreOffers;
    public final PdpOfferItemLayoutBinding pdpOfferView;
    private final ConstraintLayout rootView;

    private PdpOffersLayoutBinding(ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView, LinearLayout linearLayout, View view, AjioTextView ajioTextView, PdpOfferItemLayoutBinding pdpOfferItemLayoutBinding) {
        this.rootView = constraintLayout;
        this.allOfferContainer = linearLayoutCompat;
        this.allOffersRv = recyclerView;
        this.couponContainer = linearLayout;
        this.footerButtonDivider = view;
        this.pdpMoreOffers = ajioTextView;
        this.pdpOfferView = pdpOfferItemLayoutBinding;
    }

    public static PdpOffersLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.all_offer_container;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (LinearLayoutCompat)view;
        if (object2 != null) {
            n3 = R$id.all_offers_rv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (RecyclerView)view;
            if (object3 != null) {
                View view2;
                n3 = R$id.coupon_container;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (LinearLayout)view;
                if (view3 != null && (view2 = dd2_2.a(n3 = R$id.footer_button_divider, object)) != null) {
                    n3 = R$id.pdp_more_offers;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null && (view = dd2_2.a(n3 = R$id.pdp_offer_view, object)) != null) {
                        PdpOfferItemLayoutBinding pdpOfferItemLayoutBinding = PdpOfferItemLayoutBinding.bind(view);
                        Object object5 = object;
                        object5 = (ConstraintLayout)((Object)object);
                        PdpOffersLayoutBinding pdpOffersLayoutBinding = new PdpOffersLayoutBinding((ConstraintLayout)((Object)object5), (LinearLayoutCompat)((Object)object2), (RecyclerView)object3, (LinearLayout)view3, view2, (AjioTextView)object4, pdpOfferItemLayoutBinding);
                        return pdpOffersLayoutBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PdpOffersLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PdpOffersLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PdpOffersLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_offers_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpOffersLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

