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

public final class SearchHistoryRowLuxeBinding
implements BC3 {
    public final ImageView deleteButton;
    public final TextView historyText;
    private final LinearLayout rootView;

    private SearchHistoryRowLuxeBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.deleteButton = imageView;
        this.historyText = textView;
    }

    public static SearchHistoryRowLuxeBinding bind(View object) {
        TextView textView;
        int n3 = R$id.delete_button;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (textView = (TextView)dd2_2.a(n3 = R$id.history_text, object)) != null) {
            object = (LinearLayout)object;
            SearchHistoryRowLuxeBinding searchHistoryRowLuxeBinding = new SearchHistoryRowLuxeBinding((LinearLayout)object, imageView, textView);
            return searchHistoryRowLuxeBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static SearchHistoryRowLuxeBinding inflate(LayoutInflater layoutInflater) {
        return SearchHistoryRowLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static SearchHistoryRowLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.search_history_row_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SearchHistoryRowLuxeBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

