/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ril.ajio.R$layout;

public final class SearchSuggestionViewholderRefreshBinding
implements BC3 {
    private final TextView rootView;
    public final TextView suggestText;

    private SearchSuggestionViewholderRefreshBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.suggestText = textView2;
    }

    public static SearchSuggestionViewholderRefreshBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            SearchSuggestionViewholderRefreshBinding searchSuggestionViewholderRefreshBinding = new SearchSuggestionViewholderRefreshBinding((TextView)object, (TextView)object);
            return searchSuggestionViewholderRefreshBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static SearchSuggestionViewholderRefreshBinding inflate(LayoutInflater layoutInflater) {
        return SearchSuggestionViewholderRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static SearchSuggestionViewholderRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.search_suggestion_viewholder_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SearchSuggestionViewholderRefreshBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

