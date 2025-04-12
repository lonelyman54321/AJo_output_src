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
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PdpOfferRvLayoutBinding
implements BC3 {
    public final AjioButton closeButton;
    public final AjioTextView offerTitle;
    public final ConstraintLayout parentLayout;
    public final RecyclerView promoOfferRv;
    private final ConstraintLayout rootView;

    private PdpOfferRvLayoutBinding(ConstraintLayout constraintLayout, AjioButton ajioButton, AjioTextView ajioTextView, ConstraintLayout constraintLayout2, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.closeButton = ajioButton;
        this.offerTitle = ajioTextView;
        this.parentLayout = constraintLayout2;
        this.promoOfferRv = recyclerView;
    }

    public static PdpOfferRvLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.close_button;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioButton)view;
        if (object2 != null) {
            n3 = R$id.offer_title;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                Object object4 = object;
                object4 = (ConstraintLayout)((Object)object);
                n3 = R$id.promo_offer_rv;
                Object object5 = view = dd2_2.a(n3, object);
                object5 = (RecyclerView)view;
                if (object5 != null) {
                    object = new PdpOfferRvLayoutBinding((ConstraintLayout)((Object)object4), (AjioButton)object2, (AjioTextView)object3, (ConstraintLayout)((Object)object4), (RecyclerView)object5);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PdpOfferRvLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PdpOfferRvLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PdpOfferRvLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_offer_rv_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpOfferRvLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

