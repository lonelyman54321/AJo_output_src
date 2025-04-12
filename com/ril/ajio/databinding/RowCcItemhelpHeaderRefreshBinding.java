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

public final class RowCcItemhelpHeaderRefreshBinding
implements BC3 {
    private final LinearLayout rootView;
    public final TextView rowCcitemhelpHeaderTvSubtitle;
    public final TextView rowCcitemhelpHeaderTvTitle;

    private RowCcItemhelpHeaderRefreshBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.rowCcitemhelpHeaderTvSubtitle = textView;
        this.rowCcitemhelpHeaderTvTitle = textView2;
    }

    public static RowCcItemhelpHeaderRefreshBinding bind(View object) {
        TextView textView;
        int n3 = R$id.row_ccitemhelp_header_tv_subtitle;
        TextView textView2 = (TextView)dd2_2.a(n3, object);
        if (textView2 != null && (textView = (TextView)dd2_2.a(n3 = R$id.row_ccitemhelp_header_tv_title, object)) != null) {
            object = (LinearLayout)object;
            RowCcItemhelpHeaderRefreshBinding rowCcItemhelpHeaderRefreshBinding = new RowCcItemhelpHeaderRefreshBinding((LinearLayout)object, textView2, textView);
            return rowCcItemhelpHeaderRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCcItemhelpHeaderRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcItemhelpHeaderRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcItemhelpHeaderRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_itemhelp_header_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcItemhelpHeaderRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

