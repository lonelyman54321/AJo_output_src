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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.LuxeUnderLineTextView;

public final class LuxePromoOfferLayoutBinding
implements BC3 {
    public final AjioTextView luxeOfferTitle;
    public final LuxeUnderLineTextView pdpMoreOffers;
    public final ConstraintLayout pdpOfferView;
    public final RecyclerView promoOfferRv;
    private final ConstraintLayout rootView;
    public final View sizeTopDivider;

    private LuxePromoOfferLayoutBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, LuxeUnderLineTextView luxeUnderLineTextView, ConstraintLayout constraintLayout2, RecyclerView recyclerView, View view) {
        this.rootView = constraintLayout;
        this.luxeOfferTitle = ajioTextView;
        this.pdpMoreOffers = luxeUnderLineTextView;
        this.pdpOfferView = constraintLayout2;
        this.promoOfferRv = recyclerView;
        this.sizeTopDivider = view;
    }

    public static LuxePromoOfferLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.luxe_offer_title;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.pdp_more_offers;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (LuxeUnderLineTextView)view;
            if (object3 != null) {
                View view2;
                Object object4 = object;
                object4 = (ConstraintLayout)((Object)object);
                n3 = R$id.promo_offer_rv;
                Object object5 = view = dd2_2.a(n3, object);
                object5 = (RecyclerView)view;
                if (object5 != null && (view2 = dd2_2.a(n3 = R$id.size_top_divider, object)) != null) {
                    object = new LuxePromoOfferLayoutBinding((ConstraintLayout)((Object)object4), (AjioTextView)object2, (LuxeUnderLineTextView)object3, (ConstraintLayout)((Object)object4), (RecyclerView)object5, view2);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxePromoOfferLayoutBinding inflate(LayoutInflater layoutInflater) {
        return LuxePromoOfferLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePromoOfferLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_promo_offer_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePromoOfferLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

