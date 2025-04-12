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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxeRowPdpTrustMarkerBinding
implements BC3 {
    private final LinearLayout rootView;
    public final AjioTextView rowPdpTrustMarkerTv;

    private LuxeRowPdpTrustMarkerBinding(LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.rowPdpTrustMarkerTv = ajioTextView;
    }

    public static LuxeRowPdpTrustMarkerBinding bind(View object) {
        int n3 = R$id.row_pdp_trust_marker_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (LinearLayout)object;
            LuxeRowPdpTrustMarkerBinding luxeRowPdpTrustMarkerBinding = new LuxeRowPdpTrustMarkerBinding((LinearLayout)object, ajioTextView);
            return luxeRowPdpTrustMarkerBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxeRowPdpTrustMarkerBinding inflate(LayoutInflater layoutInflater) {
        return LuxeRowPdpTrustMarkerBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeRowPdpTrustMarkerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_row_pdp_trust_marker;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeRowPdpTrustMarkerBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

