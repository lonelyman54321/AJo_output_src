/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PdpPriceErrorLayoutBinding
implements BC3 {
    public final TextView pdpRecalculateTv;
    public final TextView pdpRefresh;
    private final ConstraintLayout rootView;

    private PdpPriceErrorLayoutBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.pdpRecalculateTv = textView;
        this.pdpRefresh = textView2;
    }

    public static PdpPriceErrorLayoutBinding bind(View object) {
        TextView textView;
        int n3 = R$id.pdp_recalculate_tv;
        TextView textView2 = (TextView)dd2_2.a(n3, object);
        if (textView2 != null && (textView = (TextView)dd2_2.a(n3 = R$id.pdp_refresh, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            PdpPriceErrorLayoutBinding pdpPriceErrorLayoutBinding = new PdpPriceErrorLayoutBinding((ConstraintLayout)((Object)object), textView2, textView);
            return pdpPriceErrorLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PdpPriceErrorLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PdpPriceErrorLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PdpPriceErrorLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_price_error_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpPriceErrorLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

