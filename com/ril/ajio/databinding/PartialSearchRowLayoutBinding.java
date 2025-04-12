/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PartialSearchRowLayoutBinding
implements BC3 {
    public final TextView count;
    public final ImageView imageView1;
    public final TextView name;
    private final RelativeLayout rootView;

    private PartialSearchRowLayoutBinding(RelativeLayout relativeLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.rootView = relativeLayout;
        this.count = textView;
        this.imageView1 = imageView;
        this.name = textView2;
    }

    public static PartialSearchRowLayoutBinding bind(View object) {
        TextView textView;
        ImageView imageView;
        int n3 = R$id.count;
        TextView textView2 = (TextView)dd2_2.a(n3, object);
        if (textView2 != null && (imageView = (ImageView)dd2_2.a(n3 = R$id.imageView1, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.name, object)) != null) {
            object = (RelativeLayout)object;
            PartialSearchRowLayoutBinding partialSearchRowLayoutBinding = new PartialSearchRowLayoutBinding((RelativeLayout)object, textView2, imageView, textView);
            return partialSearchRowLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PartialSearchRowLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PartialSearchRowLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PartialSearchRowLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.partial_search_row_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PartialSearchRowLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

