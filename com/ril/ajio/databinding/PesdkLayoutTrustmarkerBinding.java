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

public final class PesdkLayoutTrustmarkerBinding
implements BC3 {
    public final AjioTextView pltTvMsg;
    private final ConstraintLayout rootView;

    private PesdkLayoutTrustmarkerBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.pltTvMsg = ajioTextView;
    }

    public static PesdkLayoutTrustmarkerBinding bind(View object) {
        int n3 = R$id.pltTvMsg;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (ConstraintLayout)((Object)object);
            PesdkLayoutTrustmarkerBinding pesdkLayoutTrustmarkerBinding = new PesdkLayoutTrustmarkerBinding((ConstraintLayout)((Object)object), ajioTextView);
            return pesdkLayoutTrustmarkerBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkLayoutTrustmarkerBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLayoutTrustmarkerBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLayoutTrustmarkerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_layout_trustmarker;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLayoutTrustmarkerBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

