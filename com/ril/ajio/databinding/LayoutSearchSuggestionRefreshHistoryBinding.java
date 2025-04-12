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

public final class LayoutSearchSuggestionRefreshHistoryBinding
implements BC3 {
    public final ImageView autoPopulateArrow;
    public final ConstraintLayout constraintSearchView;
    public final ImageView deleteHistoryIcon;
    private final ConstraintLayout rootView;
    public final TextView searchSuggestion;

    private LayoutSearchSuggestionRefreshHistoryBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, ImageView imageView2, TextView textView) {
        this.rootView = constraintLayout;
        this.autoPopulateArrow = imageView;
        this.constraintSearchView = constraintLayout2;
        this.deleteHistoryIcon = imageView2;
        this.searchSuggestion = textView;
    }

    public static LayoutSearchSuggestionRefreshHistoryBinding bind(View object) {
        View view;
        int n3 = R$id.auto_populate_arrow;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            Object object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            n3 = R$id.deleteHistoryIcon;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.search_suggestion;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    object = new LayoutSearchSuggestionRefreshHistoryBinding((ConstraintLayout)((Object)object2), (ImageView)view2, (ConstraintLayout)((Object)object2), (ImageView)view3, (TextView)view4);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutSearchSuggestionRefreshHistoryBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSearchSuggestionRefreshHistoryBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSearchSuggestionRefreshHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_search_suggestion_refresh_history;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSearchSuggestionRefreshHistoryBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

