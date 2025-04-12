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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PdpSpotLightLayoutBinding
implements BC3 {
    public final AjioTextView attributeName;
    public final AjioTextView attributeValue;
    public final ConstraintLayout container;
    private final ConstraintLayout rootView;

    private PdpSpotLightLayoutBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.attributeName = ajioTextView;
        this.attributeValue = ajioTextView2;
        this.container = constraintLayout2;
    }

    public static PdpSpotLightLayoutBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.attributeName;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.attributeValue, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            PdpSpotLightLayoutBinding pdpSpotLightLayoutBinding = new PdpSpotLightLayoutBinding((ConstraintLayout)((Object)object), ajioTextView2, ajioTextView, (ConstraintLayout)((Object)object));
            return pdpSpotLightLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PdpSpotLightLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PdpSpotLightLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PdpSpotLightLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_spot_light_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpSpotLightLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

