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

public final class LayoutFreebieGetFreebiesPdpBinding
implements BC3 {
    public final ConstraintLayout freebiesLyt;
    public final AjioTextView freebiesText;
    public final ImageView giftIcon;
    private final ConstraintLayout rootView;

    private LayoutFreebieGetFreebiesPdpBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, ImageView imageView) {
        this.rootView = constraintLayout;
        this.freebiesLyt = constraintLayout2;
        this.freebiesText = ajioTextView;
        this.giftIcon = imageView;
    }

    public static LayoutFreebieGetFreebiesPdpBinding bind(View object) {
        ImageView imageView;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.freebies_text;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null && (imageView = (ImageView)dd2_2.a(n3 = R$id.giftIcon, object)) != null) {
            object = new LayoutFreebieGetFreebiesPdpBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), ajioTextView, imageView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static LayoutFreebieGetFreebiesPdpBinding inflate(LayoutInflater layoutInflater) {
        return LayoutFreebieGetFreebiesPdpBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutFreebieGetFreebiesPdpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_freebie_get_freebies_pdp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutFreebieGetFreebiesPdpBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

