/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutSisCategoryItemBinding
implements BC3 {
    public final ImageView lsciIvNext;
    public final ImageView lsciIvPrev;
    public final AjioTextView lsciTvName;
    private final RelativeLayout rootView;

    private LayoutSisCategoryItemBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, AjioTextView ajioTextView) {
        this.rootView = relativeLayout;
        this.lsciIvNext = imageView;
        this.lsciIvPrev = imageView2;
        this.lsciTvName = ajioTextView;
    }

    public static LayoutSisCategoryItemBinding bind(View object) {
        AjioTextView ajioTextView;
        ImageView imageView;
        int n3 = R$id.lsci_iv_next;
        ImageView imageView2 = (ImageView)dd2_2.a(n3, object);
        if (imageView2 != null && (imageView = (ImageView)dd2_2.a(n3 = R$id.lsci_iv_prev, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.lsci_tv_name, object)) != null) {
            object = (RelativeLayout)object;
            LayoutSisCategoryItemBinding layoutSisCategoryItemBinding = new LayoutSisCategoryItemBinding((RelativeLayout)object, imageView2, imageView, ajioTextView);
            return layoutSisCategoryItemBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutSisCategoryItemBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSisCategoryItemBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSisCategoryItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_sis_category_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSisCategoryItemBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

