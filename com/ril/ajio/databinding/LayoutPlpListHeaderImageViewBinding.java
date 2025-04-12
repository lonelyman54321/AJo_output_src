/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutPlpListHeaderImageViewBinding
implements BC3 {
    public final LinearLayout plpHeaderImageSearch;
    private final LinearLayout rootView;
    public final TextView tvCountPlpHeaderIs;
    public final TextView tvTitlePlpHeaderIs;

    private LayoutPlpListHeaderImageViewBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.plpHeaderImageSearch = linearLayout2;
        this.tvCountPlpHeaderIs = textView;
        this.tvTitlePlpHeaderIs = textView2;
    }

    public static LayoutPlpListHeaderImageViewBinding bind(View object) {
        TextView textView;
        Object object2 = object;
        object2 = (LinearLayout)object;
        int n3 = R$id.tv_count_plp_header_is;
        TextView textView2 = (TextView)dd2_2.a(n3, object);
        if (textView2 != null && (textView = (TextView)dd2_2.a(n3 = R$id.tv_title_plp_header_is, object)) != null) {
            object = new LayoutPlpListHeaderImageViewBinding((LinearLayout)object2, (LinearLayout)object2, textView2, textView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static LayoutPlpListHeaderImageViewBinding inflate(LayoutInflater layoutInflater) {
        return LayoutPlpListHeaderImageViewBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutPlpListHeaderImageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_plp_list_header_image_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutPlpListHeaderImageViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

