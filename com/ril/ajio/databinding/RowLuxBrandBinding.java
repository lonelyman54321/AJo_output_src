/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowLuxBrandBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final ImageView rowLuxBrandImgVw;
    public final AjioTextView rowLuxBrandTv;
    public final View separatorVw;

    private RowLuxBrandBinding(ConstraintLayout constraintLayout, ImageView imageView, AjioTextView ajioTextView, View view) {
        this.rootView = constraintLayout;
        this.rowLuxBrandImgVw = imageView;
        this.rowLuxBrandTv = ajioTextView;
        this.separatorVw = view;
    }

    public static RowLuxBrandBinding bind(View object) {
        View view;
        AjioTextView ajioTextView;
        int n3 = R$id.row_lux_brand_img_vw;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.row_lux_brand_tv, object)) != null && (view = dd2_2.a(n3 = R$id.separator_vw, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            RowLuxBrandBinding rowLuxBrandBinding = new RowLuxBrandBinding((ConstraintLayout)((Object)object), imageView, ajioTextView, view);
            return rowLuxBrandBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowLuxBrandBinding inflate(LayoutInflater layoutInflater) {
        return RowLuxBrandBinding.inflate(layoutInflater, null, false);
    }

    public static RowLuxBrandBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_lux_brand;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowLuxBrandBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

