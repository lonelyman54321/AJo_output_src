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

public final class ConvenienceFeeDescLayoutLuxeBinding
implements BC3 {
    public final AjioTextView descTv;
    private final ConstraintLayout rootView;
    public final AjioTextView titleLabelTv;

    private ConvenienceFeeDescLayoutLuxeBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.descTv = ajioTextView;
        this.titleLabelTv = ajioTextView2;
    }

    public static ConvenienceFeeDescLayoutLuxeBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.desc_tv;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.title_label_tv, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            ConvenienceFeeDescLayoutLuxeBinding convenienceFeeDescLayoutLuxeBinding = new ConvenienceFeeDescLayoutLuxeBinding((ConstraintLayout)((Object)object), ajioTextView2, ajioTextView);
            return convenienceFeeDescLayoutLuxeBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ConvenienceFeeDescLayoutLuxeBinding inflate(LayoutInflater layoutInflater) {
        return ConvenienceFeeDescLayoutLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static ConvenienceFeeDescLayoutLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.convenience_fee_desc_layout_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ConvenienceFeeDescLayoutLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

