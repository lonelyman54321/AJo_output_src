/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PlpSortRowViewBinding
implements BC3 {
    public final LinearLayout plpSortRowLayout;
    public final ImageView plpSortRowSelectIv;
    public final AjioTextView plpSortRowTitleTv;
    private final LinearLayout rootView;

    private PlpSortRowViewBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.plpSortRowLayout = linearLayout2;
        this.plpSortRowSelectIv = imageView;
        this.plpSortRowTitleTv = ajioTextView;
    }

    public static PlpSortRowViewBinding bind(View object) {
        AjioTextView ajioTextView;
        Object object2 = object;
        object2 = (LinearLayout)object;
        int n3 = R$id.plp_sort_row_select_iv;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.plp_sort_row_title_tv, object)) != null) {
            object = new PlpSortRowViewBinding((LinearLayout)object2, (LinearLayout)object2, imageView, ajioTextView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static PlpSortRowViewBinding inflate(LayoutInflater layoutInflater) {
        return PlpSortRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static PlpSortRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_sort_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpSortRowViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

