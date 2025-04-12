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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutSearchSuggestionRefreshLuxeBinding
implements BC3 {
    public final LinearLayout luxeContainer;
    private final ConstraintLayout rootView;
    public final TextView searchSuggestion;

    private LayoutSearchSuggestionRefreshLuxeBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView) {
        this.rootView = constraintLayout;
        this.luxeContainer = linearLayout;
        this.searchSuggestion = textView;
    }

    public static LayoutSearchSuggestionRefreshLuxeBinding bind(View object) {
        TextView textView;
        int n3 = R$id.luxe_container;
        LinearLayout linearLayout = (LinearLayout)dd2_2.a(n3, object);
        if (linearLayout != null && (textView = (TextView)dd2_2.a(n3 = R$id.search_suggestion, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            LayoutSearchSuggestionRefreshLuxeBinding layoutSearchSuggestionRefreshLuxeBinding = new LayoutSearchSuggestionRefreshLuxeBinding((ConstraintLayout)((Object)object), linearLayout, textView);
            return layoutSearchSuggestionRefreshLuxeBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutSearchSuggestionRefreshLuxeBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSearchSuggestionRefreshLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSearchSuggestionRefreshLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_search_suggestion_refresh_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSearchSuggestionRefreshLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

