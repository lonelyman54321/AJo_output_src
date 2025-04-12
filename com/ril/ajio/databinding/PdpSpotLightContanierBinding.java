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

public final class PdpSpotLightContanierBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final RecyclerView spotLightRv;
    public final AjioTextView spotLightTitle;

    private PdpSpotLightContanierBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.spotLightRv = recyclerView;
        this.spotLightTitle = ajioTextView;
    }

    public static PdpSpotLightContanierBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.spotLightRv;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.spotLightTitle, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            PdpSpotLightContanierBinding pdpSpotLightContanierBinding = new PdpSpotLightContanierBinding((ConstraintLayout)((Object)object), recyclerView, ajioTextView);
            return pdpSpotLightContanierBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PdpSpotLightContanierBinding inflate(LayoutInflater layoutInflater) {
        return PdpSpotLightContanierBinding.inflate(layoutInflater, null, false);
    }

    public static PdpSpotLightContanierBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_spot_light_contanier;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpSpotLightContanierBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

