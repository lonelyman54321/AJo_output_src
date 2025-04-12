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

public final class LayoutSisSearchItemBinding
implements BC3 {
    public final ImageView lssiIvLogo;
    public final AjioTextView lssiTvSearchAjio;
    private final ConstraintLayout rootView;

    private LayoutSisSearchItemBinding(ConstraintLayout constraintLayout, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.lssiIvLogo = imageView;
        this.lssiTvSearchAjio = ajioTextView;
    }

    public static LayoutSisSearchItemBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.lssi_iv_logo;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.lssi_tv_search_ajio, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            LayoutSisSearchItemBinding layoutSisSearchItemBinding = new LayoutSisSearchItemBinding((ConstraintLayout)((Object)object), imageView, ajioTextView);
            return layoutSisSearchItemBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutSisSearchItemBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSisSearchItemBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSisSearchItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_sis_search_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSisSearchItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

