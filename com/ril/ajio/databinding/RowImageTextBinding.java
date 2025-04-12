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

public final class RowImageTextBinding
implements BC3 {
    public final ImageView infoImage;
    private final ConstraintLayout rootView;
    public final TextView subtitleTextview;
    public final TextView titleTextview;

    private RowImageTextBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.infoImage = imageView;
        this.subtitleTextview = textView;
        this.titleTextview = textView2;
    }

    public static RowImageTextBinding bind(View object) {
        TextView textView;
        TextView textView2;
        int n3 = R$id.info_image;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (textView2 = (TextView)dd2_2.a(n3 = R$id.subtitle_textview, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.title_textview, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            RowImageTextBinding rowImageTextBinding = new RowImageTextBinding((ConstraintLayout)((Object)object), imageView, textView2, textView);
            return rowImageTextBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowImageTextBinding inflate(LayoutInflater layoutInflater) {
        return RowImageTextBinding.inflate(layoutInflater, null, false);
    }

    public static RowImageTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_image_text;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowImageTextBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

