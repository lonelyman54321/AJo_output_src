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

public final class PesdkDialogCvvInfoBinding
implements BC3 {
    public final ImageView imvDialogClose;
    public final LinearLayout parentLayout;
    private final LinearLayout rootView;

    private PesdkDialogCvvInfoBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.imvDialogClose = imageView;
        this.parentLayout = linearLayout2;
    }

    public static PesdkDialogCvvInfoBinding bind(View object) {
        LinearLayout linearLayout;
        int n3 = R$id.imv_dialog_close;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (linearLayout = (LinearLayout)dd2_2.a(n3 = R$id.parent_layout, object)) != null) {
            object = (LinearLayout)object;
            PesdkDialogCvvInfoBinding pesdkDialogCvvInfoBinding = new PesdkDialogCvvInfoBinding((LinearLayout)object, imageView, linearLayout);
            return pesdkDialogCvvInfoBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkDialogCvvInfoBinding inflate(LayoutInflater layoutInflater) {
        return PesdkDialogCvvInfoBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkDialogCvvInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_dialog_cvv_info;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkDialogCvvInfoBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

