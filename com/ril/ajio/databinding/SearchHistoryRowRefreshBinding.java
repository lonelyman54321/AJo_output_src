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
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class SearchHistoryRowRefreshBinding
implements BC3 {
    public final ImageView deleteButton;
    public final TextView historyText;
    private final CardView rootView;

    private SearchHistoryRowRefreshBinding(CardView cardView, ImageView imageView, TextView textView) {
        this.rootView = cardView;
        this.deleteButton = imageView;
        this.historyText = textView;
    }

    public static SearchHistoryRowRefreshBinding bind(View object) {
        TextView textView;
        int n3 = R$id.delete_button;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (textView = (TextView)dd2_2.a(n3 = R$id.history_text, object)) != null) {
            object = (CardView)((Object)object);
            SearchHistoryRowRefreshBinding searchHistoryRowRefreshBinding = new SearchHistoryRowRefreshBinding((CardView)((Object)object), imageView, textView);
            return searchHistoryRowRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static SearchHistoryRowRefreshBinding inflate(LayoutInflater layoutInflater) {
        return SearchHistoryRowRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static SearchHistoryRowRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.search_history_row_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SearchHistoryRowRefreshBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

