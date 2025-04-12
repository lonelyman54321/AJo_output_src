/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;

public final class QuickviewListItemRowBinding
implements BC3 {
    public final AjioAspectRatioImageView listImageView;
    public final RelativeLayout quickListItemRl;
    private final RelativeLayout rootView;

    private QuickviewListItemRowBinding(RelativeLayout relativeLayout, AjioAspectRatioImageView ajioAspectRatioImageView, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.listImageView = ajioAspectRatioImageView;
        this.quickListItemRl = relativeLayout2;
    }

    public static QuickviewListItemRowBinding bind(View object) {
        int n3 = R$id.list_image_view;
        AjioAspectRatioImageView ajioAspectRatioImageView = (AjioAspectRatioImageView)dd2_2.a(n3, object);
        if (ajioAspectRatioImageView != null) {
            object = (RelativeLayout)object;
            QuickviewListItemRowBinding quickviewListItemRowBinding = new QuickviewListItemRowBinding((RelativeLayout)object, ajioAspectRatioImageView, (RelativeLayout)object);
            return quickviewListItemRowBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static QuickviewListItemRowBinding inflate(LayoutInflater layoutInflater) {
        return QuickviewListItemRowBinding.inflate(layoutInflater, null, false);
    }

    public static QuickviewListItemRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.quickview_list_item_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return QuickviewListItemRowBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

