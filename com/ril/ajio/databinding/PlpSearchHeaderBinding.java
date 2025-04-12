/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PlpSearchHeaderBinding
implements BC3 {
    public final ImageView llpsIvSearch;
    public final TextView llpsTvSearch;
    public final LinearLayout plpSearchHeader;
    private final LinearLayout rootView;

    private PlpSearchHeaderBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.llpsIvSearch = imageView;
        this.llpsTvSearch = textView;
        this.plpSearchHeader = linearLayout2;
    }

    public static PlpSearchHeaderBinding bind(View object) {
        LinearLayout linearLayout;
        TextView textView;
        int n3 = R$id.llpsIvSearch;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (textView = (TextView)dd2_2.a(n3 = R$id.llpsTvSearch, object)) != null && (linearLayout = (LinearLayout)dd2_2.a(n3 = R$id.plpSearchHeader, object)) != null) {
            object = (LinearLayout)object;
            PlpSearchHeaderBinding plpSearchHeaderBinding = new PlpSearchHeaderBinding((LinearLayout)object, imageView, textView, linearLayout);
            return plpSearchHeaderBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpSearchHeaderBinding inflate(LayoutInflater layoutInflater) {
        return PlpSearchHeaderBinding.inflate(layoutInflater, null, false);
    }

    public static PlpSearchHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_search_header;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpSearchHeaderBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

