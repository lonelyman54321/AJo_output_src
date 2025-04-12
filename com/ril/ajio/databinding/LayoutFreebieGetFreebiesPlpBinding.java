/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutFreebieGetFreebiesPlpBinding
implements BC3 {
    public final ImageView freebieIcon;
    public final TextView freebiesText;
    private final ConstraintLayout rootView;

    private LayoutFreebieGetFreebiesPlpBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.freebieIcon = imageView;
        this.freebiesText = textView;
    }

    public static LayoutFreebieGetFreebiesPlpBinding bind(View object) {
        TextView textView;
        int n3 = R$id.freebieIcon;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (textView = (TextView)dd2_2.a(n3 = R$id.freebies_text, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding = new LayoutFreebieGetFreebiesPlpBinding((ConstraintLayout)((Object)object), imageView, textView);
            return layoutFreebieGetFreebiesPlpBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutFreebieGetFreebiesPlpBinding inflate(LayoutInflater layoutInflater) {
        return LayoutFreebieGetFreebiesPlpBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutFreebieGetFreebiesPlpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_freebie_get_freebies_plp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutFreebieGetFreebiesPlpBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

