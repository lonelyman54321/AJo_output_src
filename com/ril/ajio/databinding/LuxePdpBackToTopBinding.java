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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LuxePdpBackToTopBinding
implements BC3 {
    public final LinearLayout backToTop;
    private final ConstraintLayout rootView;

    private LuxePdpBackToTopBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.backToTop = linearLayout;
    }

    public static LuxePdpBackToTopBinding bind(View object) {
        int n3 = R$id.back_to_top;
        LinearLayout linearLayout = (LinearLayout)dd2_2.a(n3, object);
        if (linearLayout != null) {
            object = (ConstraintLayout)((Object)object);
            LuxePdpBackToTopBinding luxePdpBackToTopBinding = new LuxePdpBackToTopBinding((ConstraintLayout)((Object)object), linearLayout);
            return luxePdpBackToTopBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxePdpBackToTopBinding inflate(LayoutInflater layoutInflater) {
        return LuxePdpBackToTopBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePdpBackToTopBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_pdp_back_to_top;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePdpBackToTopBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

